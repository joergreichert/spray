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

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;

/**
 * A Layout Manager that puts all its children in one horizontal row.
 * Each child will be asked for its width to determine the width of the row.
 * The height of all childern will be stretched to the height of the largest child, but onoly if a child is stretchable.
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class SprayFitLayoutManager extends SprayAbstractLayoutManager {

    /**
     * Creates the layout manager for shape
     * 
     * @param shape
     */
    public SprayFitLayoutManager(ContainerShape shape) {
        super(shape);
    }

    @Override
    public void layout() {
        level++;
        debug("FitLayoutManager.layout() " + SprayLayoutService.getId(shape));
        int width = Math.max(SprayLayoutService.getCurrentWidth(shape), SprayLayoutService.getLayoutData(shape).getMinimumWidth());
        int height = Math.max(SprayLayoutService.getCurrentHeight(shape), SprayLayoutService.getLayoutData(shape).getMinimumHeight());
        int min_x = 0;
        int min_y = 0;
        if (shape.getGraphicsAlgorithm() instanceof Polygon) {
            Polygon polygon = (Polygon) shape.getGraphicsAlgorithm();
            IDimension size = gaService.calculateSize(polygon);
            SprayLayoutManager.resizePolygon(polygon, size, 1, 1);
            gaService.setLocationAndSize(polygon, polygon.getX(), polygon.getY(), size.getWidth(), size.getHeight());
            min_x = Math.min(min_x, polygon.getX());
            min_y = Math.min(min_y, polygon.getY());
            if (polygon.getX() < 0) {
                polygon.setX(0);
            }
            if (polygon.getY() < 0) {
                polygon.setY(0);
            }
        }
        for (Shape child : shape.getChildren()) {
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
            mgr.layout();
            GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
            int childX = childAlgorithm.getX();
            int childY = childAlgorithm.getY();
            int x = (childX < 0 ? 0 : childX) + childAlgorithm.getWidth();
            int y = (childY < 0 ? 0 : childY) + childAlgorithm.getHeight();
            width = Math.max(width, x);
            height = Math.max(height, y);
            min_x = Math.min(min_x, childAlgorithm.getX());
            min_y = Math.min(min_y, childAlgorithm.getY());
        }
        for (Shape child : shape.getChildren()) {
            GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
            if (min_x < 0) {
                childAlgorithm.setX(childAlgorithm.getX() - min_x);
            }
            if (min_y < 0) {
                childAlgorithm.setY(childAlgorithm.getY() - min_y);
            }
        }
        // aDD A MARGIN ONLY TO THE RIGHT AND BOTTOM.
        int margin = GraphitiProperties.getIntValue(shape, SprayLayoutService.LAYOUT_MARGIN);
        shape.getGraphicsAlgorithm().setWidth(width + margin);
        shape.getGraphicsAlgorithm().setHeight(height + margin);
        if (min_x < 0) {
            shape.getGraphicsAlgorithm().setX(shape.getGraphicsAlgorithm().getX() + min_x);
            shape.getGraphicsAlgorithm().setWidth(shape.getGraphicsAlgorithm().getWidth() - min_x);
        }
        if (min_y < 0) {
            shape.getGraphicsAlgorithm().setY(shape.getGraphicsAlgorithm().getY() + min_y);
            shape.getGraphicsAlgorithm().setHeight(shape.getGraphicsAlgorithm().getHeight() - min_y);
        }
        level--;
    }

    //    public void layoutHor() {
    //        level++;
    //        debug("HoprizontalLayoutManager.layout() " + SprayLayoutService.getId(shape));
    //        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
    //        if (data.isVisible()) {
    //            int spacing = getSpacing();
    //            int margin = getMargin();
    //            int x = margin;
    //            int y = margin;
    //            int height = 0;
    //            for (Shape child : shape.getChildren()) {
    //                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
    //                mgr.layout();
    //                GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
    //                if (childAlgorithm instanceof Polyline) {
    //                    movePolyLine((Polyline) childAlgorithm, x, y);
    //                } else {
    //                    gaService.setLocation(childAlgorithm, x, y);
    //                }
    //                x += childAlgorithm.getWidth() + spacing;
    //                height = Math.max(height, childAlgorithm.getHeight());
    //            }
    //            height = Math.max(height, data.getMinimumHeight());
    //            SprayAlignment align = this.getAlignment();
    //            if (align == SprayAlignment.MIDDLE) {
    //                alignCenter(height);
    //            } else {
    //                // TODO should test for other aloignment option like FILL
    //                //                stretchHeightTo(height);
    //            }
    //            // set the final size of the shape
    //            int newHeight = height + (2 * margin);
    //            int newWidth = Math.max(x + margin, data.getMinimumWidth());
    //            //            System.out.println(indent() + "VerticalLayoutManager.layout() " + SprayLayoutService.getId(shape) + " width set to " + newWidth);
    //            if (isFlexible()) {
    //                gaService.setSize(shape.getGraphicsAlgorithm(), newWidth, newHeight);
    //            }
    //        } else {
    //            gaService.setSize(shape.getGraphicsAlgorithm(), 0, 0);
    //        }
    //        level--;
    //    }

    /**
     * Align all children on their center
     */
    //    private void alignCenter(int newHeight) {
    //        for (Shape child : shape.getChildren()) {
    //            GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
    //            int diff = (newHeight - ga.getHeight()) / 2;
    //            gaService.setLocation(ga, ga.getX(), ga.getY() + diff);
    //        }
    //    }

    /**
     * Will adjust to the 'newWidth' by euqlally distriobuting the extra space
     * of all children that are horizontally strechable.
     * 
     * @param newWidth
     */
    //    @Override
    public void stretchWidthTo(int newWidth) {
    }

    //    @Override
    //    public void stretchHeightTo(int newHeight) {
    //        int margin = getMargin();
    //        layoutService.setHeight(shape.getGraphicsAlgorithm(), newHeight);
    //        for (Shape child : shape.getChildren()) {
    //            if (SprayLayoutService.getLayoutData(child).isVerticalStretchable()) {
    //                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
    //                mgr.stretchHeightTo(newHeight - (2 * margin));
    //            }
    //        }
    //    }
}
