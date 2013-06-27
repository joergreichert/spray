package org.eclipselabs.spray.shapes.ui.linking.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.xtext.ui.XtextResourceSetBasedProjectProvider;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.ShapeContainerElement;

import javax.inject.Inject;

public class ConnectionResourceVisitor extends DSLResourceVisitor<ConnectionDefinition> {
    private static final String  SHAPE_DSL_FILEEXTENSION = "shape";

    @Inject
    private IJavaProjectProvider javaProjectProvider;

    @Override
    public void fillFileToEObjects(IResource resource, EObject root, Map<IResource, List<ConnectionDefinition>> fileToEObjects) {
        List<ConnectionDefinition> list;
        if (root instanceof ShapeContainer) {
            ShapeContainer ShapeContainer = (ShapeContainer) root;
            for (ShapeContainerElement ele : ShapeContainer.getShapeContainerElement()) {
                if (ele instanceof ConnectionDefinition) {
                    list = fileToEObjects.get(resource);
                    if (list == null) {
                        list = new ArrayList<ConnectionDefinition>();
                    }
                    list.add((ConnectionDefinition) ele);
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
