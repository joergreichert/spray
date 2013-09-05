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
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;

/**
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class SprayFixedLayoutManager extends SprayAbstractLayoutManager {

    public SprayFixedLayoutManager(ContainerShape shape) {
        super(shape);
    }

    @Override
    public void layout() {
        level++;
        debug("FixedLayoutManager.layout() " + SprayLayoutService.getId(shape));
        if (shape.getGraphicsAlgorithm() instanceof Polygon) {
            Polygon polygon = (Polygon) shape.getGraphicsAlgorithm();
            IDimension size = gaService.calculateSize(polygon);
            SprayLayoutManager.resizePolygon(polygon, size, 1, 1);
            gaService.setLocationAndSize(polygon, polygon.getX(), polygon.getY(), size.getWidth(), size.getHeight());

        }
        for (Shape child : shape.getChildren()) {
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
            mgr.layout();
        }
        level--;
    }

}
