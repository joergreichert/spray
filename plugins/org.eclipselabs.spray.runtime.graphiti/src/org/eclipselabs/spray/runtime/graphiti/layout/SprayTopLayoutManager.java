package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

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
        debug("TopLayoutManager.layout() " + SprayLayoutService.getId(shape));
        for (Shape child : shape.getChildren()) {
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
            mgr.layout();
            width = Math.max(width, child.getGraphicsAlgorithm().getWidth());
            height = Math.max(height, child.getGraphicsAlgorithm().getHeight());
        }
        layoutService.setSize(shape.getGraphicsAlgorithm(), width, height);
        level--;
    }

    //    @Override
    public void stretchWidthTo(int newWidth) {
        level++;
        //        System.out.println("STRECHT VERTICAL of " + SprayLayoutService.getId(shape) + " to " + newWidth);
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        int oldWidth = shapeGa.getWidth();
        if (!isFlexible()) {
            debug("TopLayout stretch NOIT FLEXIBLE  shape " + SprayLayoutService.getId(shape) + " from " + oldWidth + "  to " + newWidth);
            level--;
            return;
        }
        layoutService.setWidth(shapeGa, newWidth);
        if (this.getAlignment() == SprayAlignment.MIDDLE) {
            // already dione
        } else {
            shape.getGraphicsAlgorithm().setWidth(newWidth);
            for (Shape child : shape.getChildren()) {
                GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
                debug("TopLayout stretch child shape " + SprayLayoutService.getId(child) + " from " + oldWidth + "  to " + newWidth);
                SprayResizeLayoutManager mgr = new SprayResizeLayoutManager();
                ILayoutContext ctx = new LayoutContext(child);
                if (childGa instanceof Polyline || childGa instanceof Polygon) {
                    IDimension dim = gaService.calculateSize(childGa);
                    SprayLayoutService.setCurrentHeight(child, dim.getHeight());
                    SprayLayoutService.setCurrentWidth(child, dim.getWidth());
                    childGa.setHeight(dim.getHeight());
                } else {
                    SprayLayoutService.setCurrentHeight(child, childGa.getHeight());
                    SprayLayoutService.setCurrentWidth(child, childGa.getWidth());
                }
                childGa.setWidth(newWidth);
                mgr.layout(ctx);
            }
        }
        level--;
    }

}
