package org.eclipselabs.spray.runtime.graphiti.shape;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

public interface ISprayShape {
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle);

    public SprayLayoutManager getShapeLayout();
}
