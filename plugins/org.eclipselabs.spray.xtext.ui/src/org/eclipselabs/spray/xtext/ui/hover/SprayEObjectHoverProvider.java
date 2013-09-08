/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
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
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ui.hover.ImageResourceVisitor;

import javax.inject.Inject;

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
            shapeName = getShapeName(shapeName, type);
        } else if (o instanceof ShapeDefinition) {
            shapeName = ((ShapeDefinition) o).getName();
        } else if (o instanceof ConnectionDefinition) {
            shapeName = ((ConnectionDefinition) o).getName();
        } else {
        }
        if (shapeName != null) {
            typeKey = "Shape";
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
        } else {
            typeKey = "Other";
        }
        return super.getDocumentation(o);
    }

    private String getShapeName(String shapeName, JvmType type) {
        String name = type.getQualifiedName();
        int index = name.lastIndexOf(".");
        if (index > 0 && index + 1 < name.length()) {
            shapeName = name.substring(index + 1);
        }
        return shapeName;
    }

    private boolean hasExpectedShapeSuperType(JvmGenericType type) {
        for (JvmTypeReference superType : type.getSuperTypes()) {
            if ("org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape".equals(superType.getQualifiedName()) || "org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection".equals(superType.getQualifiedName())) {
                return true;
            }
        }
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
