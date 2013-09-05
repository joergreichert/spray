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
package org.eclipselabs.spray.runtime.xtext.ui.xtextindex;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipselabs.spray.xtext.scoping.AppInjectedAccess;

public class IEObjectDescriptionContentProvider implements ITreeContentProvider {

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

    @Override
    public Object[] getElements(Object inputElement) {
        IResourceDescriptions[] rrr = {};

        ResourceDescriptionsProvider provider = AppInjectedAccess.getit();
        if (provider != null) {
            IResourceDescriptions r = provider.createResourceDescriptions();
            ArrayList<IResourceDescription> result = new ArrayList<IResourceDescription>();
            for (IResourceDescription iResourceDescription : r.getAllResourceDescriptions()) {
                //                if ("spray".equalsIgnoreCase(iResourceDescription.getURI().fileExtension())) {
                result.add(iResourceDescription);
                //                }
            }
            return result.toArray();
        } else {
            return rrr;
        }
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof IResourceDescription) {
            Iterable<IEObjectDescription> it = ((IResourceDescription) parentElement).getExportedObjects();
            return toList(it).toArray();
        }
        return null;
    }

    @Override
    public Object getParent(Object element) {
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof IResourceDescription) {
            return true;
        }
        return false;
    }

    public static <E> List<E> toList(Iterable<E> iterable) {
        if (iterable instanceof List) {
            return (List<E>) iterable;
        }
        ArrayList<E> list = new ArrayList<E>();
        if (iterable != null) {
            for (E e : iterable) {
                list.add(e);
            }
        }
        return list;
    }
}
