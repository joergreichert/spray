/*************************************************************************************
 *
 * Generated on Fri May 24 15:03:30 CEST 2013 by Spray CreateShapeFeature.xtend
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
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import MindmapDSL.StartElement;

public class MymindmapCreateStartElementFeature extends
		MymindmapCreateStartElementFeatureBase {
	public MymindmapCreateStartElementFeature(final IFeatureProvider fp) {
		super(fp);
	}
	
    @Override
    public boolean canCreate(final ICreateContext context) {
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
    	
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        // TODO: Respect the cardinality of the containment reference
        if (context.getTargetContainer() instanceof Diagram) {
            return true;
        } else if (context.getTargetContainer() instanceof ContainerShape) {
        }
        // And now the new stuff
        return false;
    }
}
