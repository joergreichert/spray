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
package org.eclipselabs.spray.shapes.ui.linking.connection;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.shapes.ConnectionDefinition;

import com.google.inject.Inject;

public class ConnectionEditorOpener extends DSLEditorOpener<ConnectionDefinition> {

    private static final String  SHAPE_DSL_EDITORID = "org.eclipselabs.spray.shapes.Shape";

    @Inject(optional = true)
    private IWorkbench           workbench;

    @Inject
    private ConnectionResourceVisitor shapeResourceVisitor;

    @Override
    protected String getDSLEditorId() {
        return SHAPE_DSL_EDITORID;
    }

    @Override
    protected DSLResourceVisitor<ConnectionDefinition> getDSLResourceVisitor(ResourceSet rs) {
        shapeResourceVisitor.setResourceSet(rs);
        return shapeResourceVisitor;
    }

    @Override
    protected boolean areEObjectsEqual(ConnectionDefinition givenShape, ConnectionDefinition shapeToInspect) {
        return shapeToInspect.getName().equals(givenShape.getName());
    }

    @Override
    protected IWorkbench getWorkbench() {
        if (workbench == null) {
            return PlatformUI.getWorkbench();
        }
        return workbench;
    }
}
