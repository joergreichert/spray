package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public class SprayFixedLayoutManager extends SprayAbstractLayoutManager {

    public SprayFixedLayoutManager(ContainerShape shape) {
        super(shape);
    }

    @Override
    public void layout() {
        //        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
        //        if (data.isVisible()) {
        //            layoutService.setSize(shape.getGraphicsAlgorithm(), data.getMinimumWidth(), data.getMinimumHeight());
        //        } else {
        //            layoutService.setSize(shape.getGraphicsAlgorithm(), 0, 0);
        //        }
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
