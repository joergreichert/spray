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
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * Layout manager for the top level conntainer shape as is always generated for Spray shapes.
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
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
        System.out.println("SHAPE HIERARCHY AFTER TopLayout.layoyt() executed");
        print(shape, 0);
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
