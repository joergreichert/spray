package org.eclipselabs.spray.runtime.xtext.ui.xtextindex;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

public class EObjectDescriptionUserDataColumnLabelProvider extends CellLabelProvider {

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

    public Image getImage(Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getText(Object element) {
        if (element instanceof IEObjectDescription) {
            IEObjectDescription oDescription = (IEObjectDescription) element;
            StringBuffer result = new StringBuffer("{ ");
            for (String key : oDescription.getUserDataKeys()) {
                result.append(key);
                result.append(" : ");
                result.append(oDescription.getUserData(key));
                result.append("; ");
            }
            result.append(" }");
            return result.toString();
        } else if (element instanceof IResourceDescription) {
            return "";
        }
        return "unknown";
    }

    @Override
    public void update(ViewerCell cell) {
        Object element = cell.getElement();
        cell.setText(getText(element));
        Image image = getImage(element);
        cell.setImage(image);
        //        cell.setBackground(getBackground(element));
        //        cell.setForeground(getForeground(element));
        //        cell.setFont(getFont(element));
    }
}
