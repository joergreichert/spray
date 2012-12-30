package org.eclipselabs.spray.xtext.ui.hover;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipselabs.spray.shapes.ui.hover.ImageResourceVisitor;

import com.google.inject.Inject;

public class SprayEObjectHoverProvider extends DefaultEObjectHoverProvider {
    private String                                  typeKey              = "Other";
    private Map<String, IInformationControlCreator> hoverControlCreators = new HashMap<String, IInformationControlCreator>();

    @Inject
    private IJavaProjectProvider                    javaProjectProvider;

    @Inject
    private ImageResourceVisitor                    imageResourceVisitor;

    @Override
    public String getDocumentation(EObject o) {
        String shapeName = null;
        if (o instanceof JvmGenericType && hasExpectedShapeSuperType((JvmGenericType) o)) {
            JvmGenericType type = (JvmGenericType) o;
            String name = type.getQualifiedName();
            int index = name.lastIndexOf(".");
            if (index > 0 && index + 1 < name.length()) {
                shapeName = name.substring(index + 1);
            }
        } else {
            typeKey = "Other";
        }
        if (shapeName != null) {
            IJavaProject javaProject = javaProjectProvider.getJavaProject(o.eResource().getResourceSet());
            if (javaProject != null) {
                try {
                    imageResourceVisitor.setShapeName(shapeName);
                    javaProject.getProject().accept(imageResourceVisitor);
                    String imagePath = imageResourceVisitor.getImagePath();
                    if (imagePath != null && imagePath.endsWith(".png")) {
                        String alternativeText = "Shapes preview for " + shapeName;
                        return "<br /><br /><img src=\"" + imagePath + "\" alt=\"" + alternativeText + "\" />";
                    }
                } catch (CoreException e) {
                    e.printStackTrace();
                }
            }
        }
        return super.getDocumentation(o);
    }

    private boolean hasExpectedShapeSuperType(JvmGenericType type) {
        for (JvmTypeReference superType : type.getSuperTypes()) {
            if ("org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape".equals(superType.getQualifiedName()) || "org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection".equals(superType.getQualifiedName())) {
                typeKey = "Shape";
                return true;
            }
        }
        typeKey = "Other";
        return false;
    }

    @Override
    public IInformationControlCreator getHoverControlCreator() {
        if ("Shape".equals(typeKey)) {
            if (hoverControlCreators.get(typeKey) == null) {
                hoverControlCreators.put(typeKey, new SprayHoverControlCreator(this, getInformationPresenterControlCreator()));
            }
        } else {
            hoverControlCreators.put(typeKey, super.getHoverControlCreator());
        }
        IInformationControlCreator creator = hoverControlCreators.get(typeKey);
        typeKey = "Other";
        return creator;
    }

    @Override
    public IInformationControlCreatorProvider getHoverInfo(final EObject object, final ITextViewer viewer, final IRegion region) {
        return new IInformationControlCreatorProvider() {

            public IInformationControlCreator getHoverControlCreator() {
                return SprayEObjectHoverProvider.this.getHoverControlCreator();
            }

            public Object getInfo() {
                return getHoverInfo(object, region, null);
            }
        };
    }
}
