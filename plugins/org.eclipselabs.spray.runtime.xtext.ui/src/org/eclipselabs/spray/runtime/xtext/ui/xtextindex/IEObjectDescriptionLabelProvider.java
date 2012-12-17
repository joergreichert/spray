package org.eclipselabs.spray.runtime.xtext.ui.xtextindex;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

public class IEObjectDescriptionLabelProvider implements ILabelProvider {

    @Override
    public void addListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public Image getImage(Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getText(Object element) {
        if (element instanceof IEObjectDescription) {
            IEObjectDescription oDescription = (IEObjectDescription) element;
            oDescription.getEClass();
            return oDescription.getQualifiedName().toString() + " : " + oDescription.getEClass().getName();
        } else if (element instanceof IResourceDescription) {
            return ((IResourceDescription) element).getURI().path();
        }
        return "unknown";
    }
}
