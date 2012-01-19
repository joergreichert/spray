package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipselabs.spray.styles.ISprayStyle;

//TODO: Remove EObject (just for tests)
public abstract class DefaultSprayShape extends EClassImpl implements ISprayShape {
	
	@Override
	public ContainerShape getShape(Diagram diagram, ISprayStyle sprayStyle) {
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// Create a ContainerShape 
		ContainerShape containerShape = peCreateService.createContainerShape(diagram, true);
		getShape(diagram, containerShape, sprayStyle);
		
		return containerShape;	
	}
	
}
