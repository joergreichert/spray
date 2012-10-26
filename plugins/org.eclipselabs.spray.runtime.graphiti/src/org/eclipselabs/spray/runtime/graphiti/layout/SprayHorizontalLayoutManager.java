package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

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
                gaService.setLocation(childAlgorithm, x, y);
                x += childAlgorithm.getWidth() + spacing;
                height = Math.max(height, childAlgorithm.getHeight());
            }
            height = Math.max(height, SprayLayoutService.getLayoutData(shape).getMinimumHeight());
            SprayAlignment align = this.getAlignment();
            if (align == SprayAlignment.MIDDLE) {
                alignCenter(height);
            }
            x = Math.max(x, data.getMinimumWidth());
            gaService.setSize(shape.getGraphicsAlgorithm(), x + margin, height + 2 * margin);
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
        //        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        //        int diff = newWidth - shapeGa.getWidth();
        //        layoutService.setWidth(shapeGa, newWidth);
        //        int nrOfStrechableChildren = 0;
        //        for (Shape child : shape.getChildren()) {
        //            if (SprayLayoutService.getLayoutData(child).isHorizontalStretchable()) {
        //                nrOfStrechableChildren++;
        //            }
        //        }
        //        if (nrOfStrechableChildren > 0) {
        //            int stretch = diff / nrOfStrechableChildren;
        //            int moveright = 0;
        //            for (Shape child : shape.getChildren()) {
        //                GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
        //                layoutService.setLocation(ga, ga.getX() + moveright, ga.getY());
        //                if (SprayLayoutService.getLayoutData(child).isHorizontalStretchable()) {
        //                    ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
        //                    mgr.stretchWidthTo(ga.getWidth() + stretch);
        //                    moveright += stretch;
        //                }
        //            }
        //        }
    }

    @Override
    public void stretchHeightTo(int newHeight) {
        int margin = getMargin();
        layoutService.setHeight(shape.getGraphicsAlgorithm(), newHeight);
        for (Shape child : shape.getChildren()) {
            if (SprayLayoutService.getLayoutData(child).isVerticalStretchable()) {
                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                mgr.stretchHeightTo(newHeight - (2 * margin));
            }
        }
    }
}
