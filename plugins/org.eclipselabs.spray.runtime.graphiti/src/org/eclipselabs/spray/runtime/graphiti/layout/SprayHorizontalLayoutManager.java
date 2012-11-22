package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * A Layout Manager that puts all its children in one horizontal row.
 * Each child will be asked for its width to determine the width of the row.
 * The height of all childern will be stretched to the height of the largest child, but onoly if a child is stretchable.
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class SprayHorizontalLayoutManager extends SprayAbstractLayoutManager {

    /**
     * Creates the layout manager for shape
     * 
     * @param shape
     */
    public SprayHorizontalLayoutManager(ContainerShape shape) {
        super(shape);
    }

    @Override
    public void layout() {
        level++;
        debug("HoprizontalLayoutManager.layout() " + SprayLayoutService.getId(shape));
        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
        if (data.isVisible()) {
            int spacing = getSpacing();
            int margin = getMargin();
            int x = margin;
            int y = margin;
            int height = 0;
            for (Shape child : shape.getChildren()) {
                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                mgr.layout();
                GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
                if (childAlgorithm instanceof Polyline) {
                    movePolyLine((Polyline) childAlgorithm, x, y);
                } else {
                    gaService.setLocation(childAlgorithm, x, y);
                }
                x += childAlgorithm.getWidth() + spacing;
                height = Math.max(height, childAlgorithm.getHeight());
            }
            height = Math.max(height, data.getMinimumHeight());
            SprayAlignment align = this.getAlignment();
            if (align == SprayAlignment.MIDDLE) {
                alignCenter(height);
            } else {
                stretchHeightTo(height);
            }
            // set the final size of the shape
            int newHeight = height + (2 * margin);
            int newWidth = Math.max(x + margin, data.getMinimumWidth());
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
    private void alignCenter(int newHeight) {
        for (Shape child : shape.getChildren()) {
            GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
            int diff = (newHeight - ga.getHeight()) / 2;
            gaService.setLocation(ga, ga.getX(), ga.getY() + diff);
        }
    }

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
