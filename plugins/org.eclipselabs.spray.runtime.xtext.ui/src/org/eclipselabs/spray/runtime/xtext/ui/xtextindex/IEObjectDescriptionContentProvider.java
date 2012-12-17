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
        //        System.out.println("====================== inputChanged: ");
    }

    @Override
    public Object[] getElements(Object inputElement) {
        IResourceDescriptions[] rrr = {};

        //        System.out.println("====================== getElements: ");
        ResourceDescriptionsProvider provider = AppInjectedAccess.getit();
        if (provider != null) {
            IResourceDescriptions r = provider.createResourceDescriptions();
            ArrayList<IResourceDescription> result = new ArrayList<IResourceDescription>();
            for (IResourceDescription iResourceDescription : r.getAllResourceDescriptions()) {
                //                System.out.println(iResourceDescription.getURI().path() + " ==> " + iResourceDescription.getURI().fileExtension());
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
        //        System.out.println("====================== getChildren: ");
        if (parentElement instanceof IResourceDescription) {
            Iterable<IEObjectDescription> it = ((IResourceDescription) parentElement).getExportedObjects();
            return toList(it).toArray();
        }
        return null;
    }

    @Override
    public Object getParent(Object element) {
        //        System.out.println("====================== getParent: ");
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        //        System.out.println("====================== hasChildren: ");
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
