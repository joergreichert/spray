package org.eclipselabs.spray.shapes.ui.linking.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.xtext.ui.XtextResourceSetBasedProjectProvider;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.shapes.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;

import com.google.inject.Inject;

public class ShapeResourceVisitor extends DSLResourceVisitor<ShapeDefinition> {
    private static final String  SHAPE_DSL_FILEEXTENSION = "shape";

    @Inject
    private IJavaProjectProvider javaProjectProvider;

    @Override
    public void fillFileToEObjects(IResource resource, EObject root, Map<IResource, List<ShapeDefinition>> fileToEObjects) {
        List<ShapeDefinition> list;
        if (root instanceof ShapeContainer) {
            ShapeContainer ShapeContainer = (ShapeContainer) root;
            for (ShapeContainerElement ele : ShapeContainer.getShapeContainerElement()) {
                if (ele instanceof ShapeDefinition) {
                    list = fileToEObjects.get(resource);
                    if (list == null) {
                        list = new ArrayList<ShapeDefinition>();
                    }
                    list.add((ShapeDefinition) ele);
                    fileToEObjects.put(resource, list);
                }
            }
        }
    }

    @Override
    protected String getFileExtension() {
        return SHAPE_DSL_FILEEXTENSION;
    }

    @Override
    protected IJavaProjectProvider getJavaProjectProvider() {
        if (javaProjectProvider == null) {
            return new XtextResourceSetBasedProjectProvider();
        }
        return javaProjectProvider;
    }
}
