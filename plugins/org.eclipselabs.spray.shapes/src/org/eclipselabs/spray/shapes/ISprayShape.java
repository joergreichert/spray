package org.eclipselabs.spray.shapes;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.spray.styles.ISprayStyle;

public interface ISprayShape {
	public ContainerShape getShape(Diagram diagram, ISprayStyle sprayStyle);
	public GraphicsAlgorithm getShape(Diagram diagram, PictogramElement pictogramElement, ISprayStyle sprayStyle);
	public SprayLayoutManager getShapeLayout();
}
