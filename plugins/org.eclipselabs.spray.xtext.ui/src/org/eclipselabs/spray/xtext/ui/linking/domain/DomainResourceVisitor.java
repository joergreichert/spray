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
package org.eclipselabs.spray.xtext.ui.linking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.xtext.ui.XtextResourceSetBasedProjectProvider;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;

import javax.inject.Inject;

public class DomainResourceVisitor extends DSLResourceVisitor<EClassifier> {
    private static final String  ECORE_FILEEXTENSION = "ecore";

    @Inject
    private IJavaProjectProvider javaProjectProvider;

    @Override
    public void fillFileToEObjects(IResource resource, EObject root, Map<IResource, List<EClassifier>> fileToEObjects) {
        List<EClassifier> list;
        TreeIterator<EObject> iterator = root.eAllContents();
        EObject ele;
        while (iterator.hasNext()) {
            ele = iterator.next();
            if (ele instanceof EClassifier) {
                list = fileToEObjects.get(resource);
                if (list == null) {
                    list = new ArrayList<EClassifier>();
                }
                list.add((EClassifier) ele);
                fileToEObjects.put(resource, list);
            }
        }
    }

    @Override
    protected String getFileExtension() {
        return ECORE_FILEEXTENSION;
    }

    @Override
    protected IJavaProjectProvider getJavaProjectProvider() {
        if (javaProjectProvider == null) {
            return new XtextResourceSetBasedProjectProvider();
        }
        return javaProjectProvider;
    }
}
