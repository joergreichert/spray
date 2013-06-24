/*************************************************************************************
 *
 * Generated on Tue May 28 09:24:29 CEST 2013 by Spray AddShapeFromDslFeature.xtend
 * 
 * This file is an extension point: copy to "src" folder to manually add code to this
 * extension point.
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.mindmap.features;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import MindmapDSL.StartElement;

public class MymindmapAddStartElementFeature extends MymindmapAddStartElementFeatureBase {
	public MymindmapAddStartElementFeature(final IFeatureProvider fp) {
		super(fp);
	}

	@Override 
	public boolean canAdd(final IAddContext context) {
		// get all elements
		Diagram diagram = getDiagram();
		EList<Shape> diagramElements = diagram.getChildren();

		Iterator<Shape> iterator = diagramElements.iterator();
		while (iterator.hasNext()) {
			// get current element
			Shape elementShape = iterator.next();
			EObject element = getBusinessObjectForPictogramElement(elementShape);
			// check if a instance of StartElement already exists
			if (element instanceof StartElement) {
				return false;
			}
		}

		final EObject newObject = (EObject) context.getNewObject();
		if (newObject instanceof StartElement) {
			// check if user wants to add to a diagram
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			} else if (context.getTargetContainer() instanceof ContainerShape) {
				// OLD STUFF
				final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
				// NEW stuff
			} else {
				return false;
			}
		}
		return true; 
	}
}
