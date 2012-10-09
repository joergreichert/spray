package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * This is a layout manager that will put all subshapes under each other
 * vertically. If possible the subshapes will all be stretched to the width of
 * the widest subshape.
 * 
 * @author jos
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

    public void layout() {
        level++;
        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
        // TODO isVisible is incorrect
        if (!data.isVisible()) {
            int spacing = getSpacing();
            int margin = getMargin();
            int x = margin;
            int y = margin;
            int width = 0;
            for (Shape child : shape.getChildren()) {
                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                mgr.layout();
                GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
                gaService.setLocation(childAlgorithm, x, y);
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
            // System.out.println(indent() + "VerticalLayoutManager.layout() "
            // + EplLayoutService.getId(shape) + " width set to "
            // + newWidth);
            gaService.setSize(shape.getGraphicsAlgorithm(), newWidth, y + margin);
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

    @Override
    public void stretchWidthTo(int newWidth) {
        level++;
        int margin = getMargin();
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        layoutService.setWidth(shapeGa, newWidth);
        if (this.getAlignment() == SprayAlignment.MIDDLE) {
            // already dione
        } else {
            for (Shape child : shape.getChildren()) {
                if (SprayLayoutService.getLayoutData(child).isHorizontalStretchable()) {
                    ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                    mgr.stretchWidthTo(newWidth - (2 * margin));
                }
            }
        }
        level--;
    }

    @Override
    public void stretchHeightTo(int newHeight) {
        level++;
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        int diff = newHeight - shapeGa.getHeight();
        layoutService.setHeight(shape.getGraphicsAlgorithm(), newHeight);
        boolean stretched = false;
        for (Shape child : shape.getChildren()) {
            SprayLayoutData data = SprayLayoutService.getLayoutData(child);
            GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
            if (!stretched) {
                if (data.isVerticalStretchable()) {
                    ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                    mgr.stretchHeightTo(childGa.getHeight() + diff);
                    stretched = true;
                }
            } else {
                layoutService.setLocation(childGa, childGa.getX(), childGa.getY() + diff);
            }
        }
        level--;
    }
}
