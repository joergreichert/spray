package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

/**
 * This layout manager is specific for the Diagram, it triggers the full a=layout
 * of all root shapes in the diagram
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class SprayDiagramLayoutManager extends SprayAbstractLayoutManager {

    private Diagram diagram;

    public SprayDiagramLayoutManager(Diagram shape) {
        super(shape);
        this.diagram = shape;
    }

    @Override
    public void layout() {
        level++;
        debug("DiagramLayoutManager.layout() " + SprayLayoutService.getId(shape));
        for (Shape shape : diagram.getChildren()) {
            if (shape instanceof ContainerShape) {
                ContainerShape container = (ContainerShape) shape;
                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(container);
                if (mgr != null) {
                    mgr.layout();
                }
            }
        }
        level--;
    }

    //    @Override
    //    public void stretchHeightTo(int newHeight) {
    //    }

}
