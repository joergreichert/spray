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
package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * This is a layout manager that will put all subshapes under each other
 * vertically. If possible the subshapes will all be stretched to the width of
 * the widest subshape.
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class SprayVerticalLayoutManager extends SprayAbstractLayoutManager {

    /**
     * Creates the layout manager for shape
     * 
     * @param shape
     */
    public SprayVerticalLayoutManager(ContainerShape shape) {
        super(shape);
    }

    public boolean layout(ILayoutContext context) {
        return true;
    }

    public void layout() {
        level++;
        debug("VerticalLayoutManager.layout() " + SprayLayoutService.getId(shape));
        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
        if (data.isVisible()) {
            int spacing = getSpacing();
            int margin = getMargin();
            int x = margin;
            int y = margin;
            int width = 0;
            for (Shape child : shape.getChildren()) {
                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                mgr.layout();
                GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
                if (childAlgorithm instanceof Polyline) {
                    movePolyLine((Polyline) childAlgorithm, x, y);
                } else {
                    gaService.setLocation(childAlgorithm, x, y);
                }
                y += childAlgorithm.getHeight() + spacing;
                width = Math.max(width, childAlgorithm.getWidth());
            }
            width = Math.max(width, data.getMinimumWidth());
            if (this.getAlignment() == SprayAlignment.MIDDLE) {
                alignCenter(width);
            } else {
                stretchWidthTo(width);
            }
            // set the final size of the shape
            int newWidth = width + (2 * margin);
            int newHeight = Math.max(y + margin, data.getMinimumHeight());
            //            System.out.println(indent() + "VerticalLayoutManager.layout() " + SprayLayoutService.getId(shape) + " width set to " + newWidth);
            if (isFlexible()) {
                gaService.setSize(shape.getGraphicsAlgorithm(), newWidth, newHeight);
            }
        } else {
            gaService.setSize(shape.getGraphicsAlgorithm(), 0, 0);
        }
        level--;
    }

    /**
     * Align all children on their center
     */
    private void alignCenter(int newWidth) {
        for (Shape child : shape.getChildren()) {
            GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
            int diff = (newWidth - ga.getWidth()) / 2;
            gaService.setLocation(ga, ga.getX() + diff, ga.getY());
        }
    }

    //    @Override
    //    public void stretchHeightTo(int newHeight) {
    //        //        stretchSizeTo(shape.getGraphicsAlgorithm().getWidth(), newHeight);
    //    }

    //    @Override
}
