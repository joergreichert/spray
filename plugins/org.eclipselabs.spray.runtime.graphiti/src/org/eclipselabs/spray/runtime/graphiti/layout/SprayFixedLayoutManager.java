package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class SprayFixedLayoutManager extends SprayAbstractLayoutManager {

    public SprayFixedLayoutManager(ContainerShape shape) {
        super(shape);
    }

    @Override
    public void layout() {
        level++;
        debug("FixedLayoutManager.layout() " + SprayLayoutService.getId(shape));
        for (Shape child : shape.getChildren()) {
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
            mgr.layout();
        }
        level--;
    }

}
