package org.eclipselabs.spray.shapes;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipselabs.spray.styles.ISprayStyle;

public interface ISprayShape {
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle);

    public SprayLayoutManager getShapeLayout();
}
