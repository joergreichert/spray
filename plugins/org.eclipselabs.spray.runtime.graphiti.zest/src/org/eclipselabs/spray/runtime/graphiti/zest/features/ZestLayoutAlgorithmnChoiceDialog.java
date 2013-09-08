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
package org.eclipselabs.spray.runtime.graphiti.zest.features;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class ZestLayoutAlgorithmnChoiceDialog extends ElementListSelectionDialog {
    public ZestLayoutAlgorithmnChoiceDialog(Shell parent) {
        super(parent, new LabelProvider() {
            public String getText(Object element) {
                Integer idx = (Integer) element;
                return ZestLayoutDiagramFeature.layouts.get(idx - 1);
            }
        });
        Object[] elements = new Object[ZestLayoutDiagramFeature.layouts.size()];
        for (int i = 0; i < ZestLayoutDiagramFeature.layouts.size(); i++) {
            elements[i] = Integer.valueOf(i + 1);
        }
        setElements(elements);
        setTitle("Select Layout");
        setMultipleSelection(false);
    }

    @Override
    public int open() {
        int result = super.open();
        if (result < 0)
            return result;
        return (Integer) getFirstResult();
    }

}
