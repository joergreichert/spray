package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayHorizontalLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayVerticalLayoutManager;

public class DefaultResizeShapeFeature extends org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature {

    public DefaultResizeShapeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canResizeShape(IResizeShapeContext context) {
        Shape shape = context.getShape();
        if (!SprayLayoutService.isShapeFromDsl(shape)) {
            return false;
        }
        ContainerShape conShape = (ContainerShape) shape;
        for (Shape child : conShape.getChildren()) {
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
            if (mgr instanceof SprayVerticalLayoutManager) {
                return false;
            }
            if (mgr instanceof SprayHorizontalLayoutManager) {
                return false;
            }
        }
        return super.canResizeShape(context);
    }

    /**
     * calls the Graphiti default and ensure the layout is updated
     */
    @Override
    public void resizeShape(IResizeShapeContext context) {
        super.resizeShape(context);
        ContainerShape top = SprayLayoutService.findTopDslShape(context.getShape());
        if (top != null) {
            SprayLayoutService.getLayoutManager(top).layout();
        }

    }

}
