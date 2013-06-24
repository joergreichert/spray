/*************************************************************************************
 *
 * Generated on Wed May 22 17:38:21 CEST 2013 by Spray MoveFeature.xtend
 * 
 * This file is an extension point: copy to "src" folder to manually add code to this
 * extension point.
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.conceptmap.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;

public class MyconceptmapMoveElementFeature extends MyconceptmapMoveElementFeatureBase {
	public MyconceptmapMoveElementFeature(final IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void moveShape(IMoveShapeContext context) {
		PictogramElement sourceShape = context.getPictogramElement();
		ContainerShape targetContainer = context.getTargetContainer();
		ContainerShape sourceContainer = context.getSourceContainer();
		Object sourceParent = getBusinessObjectForPictogramElement(sourceContainer);
		Object source = getBusinessObjectForPictogramElement(sourceShape);
		Object target = getBusinessObjectForPictogramElement(targetContainer);
		if (sourceShape.eContainer() == targetContainer) {
			super.moveShape(context);
			final Diagram diagram = this.getDiagram();
			ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(diagram);
			// TODO: Fixme: Need to layout twice, probably because this is a fit within a fit layout
			//  Only neccesary when contents is moved to xcoordinates < 0
			mgr.layout();
			mgr.layout();

			/* ************* update all connections of the moved element ********************************/
			if(sourceShape instanceof AnchorContainer) {
				AnchorContainer anchorContainer = (AnchorContainer) sourceShape;
				for(Anchor a : anchorContainer.getAnchors()) {
					for(Connection incoming : a.getIncomingConnections()) {
						MyconceptmapAddArrowConnectionFeature.updateConnections(incoming.getStart(), incoming.getEnd());
					}
					for(Connection outgoing : a.getOutgoingConnections()) {
						MyconceptmapAddArrowConnectionFeature.updateConnections(outgoing.getStart(), outgoing.getEnd());
					}
				}
			}
			/*
			for(Connection connection : this.getDiagram().getConnections()) {
				if(connection.getStart().getParent().equals(sourceShape) || connection.getEnd().getParent().equals(sourceShape)) {
					MyconceptmapAddArrowConnectionFeature.updateConnections(connection.getStart(), connection.getEnd());
				}
			} 
			*/
		}

		return;
	}
}

