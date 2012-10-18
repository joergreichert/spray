package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

/**
 * @author jos
 *         Layout manager for the top level comntainer shape as is always generated for Spray shapes
 */
public class SprayTopLayoutManager extends SprayAbstractLayoutManager {

    public SprayTopLayoutManager(ContainerShape shape) {
        super(shape);
    }

    @Override
    public void layout() {
        level++;
        int width = 0;
        int height = 0;
        System.out.println(indent() + "TopLayoutManager.layout() " + SprayLayoutService.getId(shape));
        for (Shape child : shape.getChildren()) {
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
            mgr.layout();
            width = Math.max(width, child.getGraphicsAlgorithm().getWidth());
            height = Math.max(height, child.getGraphicsAlgorithm().getHeight());
        }
        layoutService.setSize(shape.getGraphicsAlgorithm(), width, height);
        level--;
    }

    @Override
    public void stretchWidthTo(int newWidth) {
        if (SprayLayoutService.getLayoutData(shape).isHorizontalStretchable()) {
            layoutService.setWidth(shape.getGraphicsAlgorithm(), newWidth);
        }
    }

    @Override
    public void stretchHeightTo(int newHeight) {
    }

}
