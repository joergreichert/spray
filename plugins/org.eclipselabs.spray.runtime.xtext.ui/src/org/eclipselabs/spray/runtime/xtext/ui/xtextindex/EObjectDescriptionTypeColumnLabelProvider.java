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

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

public class EObjectDescriptionTypeColumnLabelProvider extends CellLabelProvider {

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
            oDescription.getEClass();
            return oDescription.getEClass().getName();
        } else if (element instanceof IResourceDescription) {
            return ((IResourceDescription) element).getClass().getSimpleName();
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
