package org.eclipselabs.spray.shapes;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public interface ISprayShape {
	public ContainerShape getShape(Diagram diagram);
}
