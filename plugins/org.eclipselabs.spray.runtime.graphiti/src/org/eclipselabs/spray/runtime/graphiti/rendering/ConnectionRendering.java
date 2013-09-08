/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.runtime.graphiti.rendering;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.services.Graphiti;

public abstract class ConnectionRendering {

	private static final String MULTI_RENDERING_KEY = "spray.multirendering.key";
	private static final String MULTI_RENDERING_X = "spray.multirendering.x";
	private static final String MULTI_RENDERING_Y = "spray.multirendering.y";

	/**
	 * This function updates the rendering of the connections with these start
	 * and endpoints so that every connection should be visible.
	 */
	public static void startRendering(Anchor startAnchor, Anchor endAnchor) {
		/*
		 * There are several steps to do: 1. compute the center between both
		 * anchors 2. compute the vector of the connection between start- and
		 * endanchor 3. compute the rthogonal vector to the connection. 4.
		 * compute all connections between start- and endanchor 5. add the
		 * bendpoints alongside the orthogonal vector starting from the
		 * center(1.). therefore use the normalized orthogonal vector and set
		 * the bendpoint ~10px away from the center. in the list of connections
		 * (4.), move the even connections along the orthogonal vector, the odd
		 * the opposite direction.
		 */

		// the connections will have a distance of ~movement_factor pixels.
		final int MOVEMENT_FACTOR = 10;

		/* ***************** 1 **************************************** */
		// define the offset for the standard anchorpoint
		int startAnchorXOffset = startAnchor.getParent().getGraphicsAlgorithm()
				.getWidth() / 2;
		int startAnchorYOffset = startAnchor.getParent().getGraphicsAlgorithm()
				.getHeight() / 2;
		int endAnchorXOffset = endAnchor.getParent().getGraphicsAlgorithm()
				.getWidth() / 2;
		int endAnchorYOffset = endAnchor.getParent().getGraphicsAlgorithm()
				.getHeight() / 2;

		// startanchor is an user-defined anchor
		if (startAnchor.getGraphicsAlgorithm() != null) {
			if (startAnchor instanceof FixPointAnchor) {
				FixPointAnchor anchor = (FixPointAnchor) startAnchor;

				startAnchorXOffset = anchor.getLocation().getX();
				startAnchorYOffset = anchor.getLocation().getY();

			} else {
				BoxRelativeAnchor anchor = (BoxRelativeAnchor) startAnchor;

				startAnchorXOffset = (int) ((double) startAnchor.getParent()
						.getGraphicsAlgorithm().getWidth() * anchor
						.getRelativeWidth());
				startAnchorYOffset = (int) ((double) startAnchor.getParent()
						.getGraphicsAlgorithm().getHeight() * anchor
						.getRelativeHeight());
			}
		}
		// same for endanchor
		if (endAnchor.getGraphicsAlgorithm() != null) {
			if (endAnchor instanceof FixPointAnchor) {
				FixPointAnchor anchor = (FixPointAnchor) endAnchor;

				startAnchorXOffset = anchor.getLocation().getX();
				startAnchorYOffset = anchor.getLocation().getY();

			} else {
				BoxRelativeAnchor anchor = (BoxRelativeAnchor) endAnchor;

				endAnchorXOffset = (int) ((double) endAnchor.getParent()
						.getGraphicsAlgorithm().getWidth() * anchor
						.getRelativeWidth());
				endAnchorYOffset = (int) ((double) endAnchor.getParent()
						.getGraphicsAlgorithm().getHeight() * anchor
						.getRelativeHeight());
			}
		}

		// we need to include width and height to the computation since we get x
		// and y from the top left corner of the element, which is connected to
		// this anchor
		int startAnchorX = startAnchor.getParent().getGraphicsAlgorithm()
				.getX()
				+ startAnchorXOffset;
		int startAnchorY = startAnchor.getParent().getGraphicsAlgorithm()
				.getY()
				+ startAnchorYOffset;
		int endAnchorX = endAnchor.getParent().getGraphicsAlgorithm().getX()
				+ endAnchorXOffset;
		int endAnchorY = endAnchor.getParent().getGraphicsAlgorithm().getY()
				+ endAnchorYOffset;

		int centerX = (startAnchorX + endAnchorX) / 2;
		int centerY = (startAnchorY + endAnchorY) / 2;

		/* ***************** 2 **************************************** */
		// for the vector we need the steps we have to go from startanchor until
		// we arrive at endanchor
		int vectorX = startAnchorX - endAnchorX;
		int vectorY = startAnchorY - endAnchorY;

		/* ***************** 3 **************************************** */
		// to get the orthogonal vector we need to switch x and y and negate one
		// of them.
		int orthogonalVectorX = -vectorY;
		int orthogonalVectorY = vectorX;

		/* ***************** 4 **************************************** */
		EList<Connection> equalConnections = getEqualConnections(startAnchor,
				endAnchor);

		/* ***************** 5 **************************************** */
		// move the connections between start- and endanchor if there is more
		// than 1.
		// we need to clear the bendpoints first to prevent errors when deleting
		// connections.
		// if there are more than 2 connections we need to move the 3. and 4.
		// MOVEMENT_FACTOR * 2 pixles, the 5. and 6. MOVEMENT_FACTOR * 3 pixles
		// and so on.
		// therefore for the connection with index i we use the formula:
		// MOVEMENT_FACTOR * ((i/2) + 1)
		if (equalConnections.size() > 1) {
			// this index is needed, cause we also get connections we may not
			// move in the equalConnections-List. the standard index would
			// destroy the rendering.
			int qualifiedListIndex = 0;

			for (Connection currC : equalConnections) {
				if (!(currC instanceof FreeFormConnection)) {
					// we can not add bendpoints to manhattan-connections
					continue;
				}
				FreeFormConnection connection = (FreeFormConnection) currC;

				// delete our bendpoint if the connection has this property.
				if (Graphiti.getPeService().removeProperty(connection,
						MULTI_RENDERING_KEY)) {
					// if there is only our own bendpoint -> remove
					// if the user added his own bendpoint to the connection ->
					// only remove the property
					if (connection.getBendpoints().size() == 1) {
						// if the user did move the bendpoint -> do not remove
						// it
						Point bendpoint = connection.getBendpoints().get(0);
						int oldx = Integer
								.parseInt(Graphiti.getPeService()
										.getPropertyValue(connection,
												MULTI_RENDERING_X));
						int oldy = Integer
								.parseInt(Graphiti.getPeService()
										.getPropertyValue(connection,
												MULTI_RENDERING_Y));
						if (oldx == bendpoint.getX()
								&& oldy == bendpoint.getY()) {
							connection.getBendpoints().remove(0);
						}
						Graphiti.getPeService().removeProperty(connection,
								MULTI_RENDERING_X);
						Graphiti.getPeService().removeProperty(connection,
								MULTI_RENDERING_Y);
					}
				}
				// check if there are any bendpoints left on this connection ->
				// do not add own bendpoint
				if (connection.getBendpoints().size() > 0) {
					continue;
				}

				int orthx, orthy, move;
				if (qualifiedListIndex % 2 == 0) {
					orthx = orthogonalVectorX;
					orthy = orthogonalVectorY;
				} else {
					orthx = -orthogonalVectorX;
					orthy = -orthogonalVectorY;
				}
				move = MOVEMENT_FACTOR * ((qualifiedListIndex / 2) + 1);
				Point bendpoint = getBendPoint(centerX, centerY, orthx, orthy,
						move);

				connection.getBendpoints().add(bendpoint);
				// move to index 0 to be able to delete it afterwards.
				connection.getBendpoints().move(0, bendpoint);

				// add our property to the connection
				Graphiti.getPeService().setPropertyValue(connection,
						MULTI_RENDERING_KEY, "true");
				Graphiti.getPeService().setPropertyValue(connection,
						MULTI_RENDERING_X, "" + bendpoint.getX());
				Graphiti.getPeService().setPropertyValue(connection,
						MULTI_RENDERING_Y, "" + bendpoint.getY());
				qualifiedListIndex++;
			}
		}
	}

	/**
	 * Computes the connections which have startAnchor at one side and endAnchor
	 * at the other.
	 */
	private static EList<Connection> getEqualConnections(Anchor startAnchor,
			Anchor endAnchor) {
		EList<Connection> equalConnections = new BasicEList<Connection>();

		for (Connection sout : startAnchor.getOutgoingConnections()) {
			for (Connection ein : endAnchor.getIncomingConnections()) {
				if (!sout.equals(ein) && sout.getStart().equals(ein.getStart())
						&& sout.getEnd().equals(ein.getEnd())) {
					if (!equalConnections.contains(sout))
						equalConnections.add(sout);
					if (!equalConnections.contains(ein))
						equalConnections.add(ein);
				}
			}
			for (Connection eout : endAnchor.getOutgoingConnections()) {
				if (!sout.equals(eout) && sout.getStart().equals(eout.getEnd())
						&& sout.getEnd().equals(eout.getStart())) {
					if (!equalConnections.contains(sout))
						equalConnections.add(sout);
					if (!equalConnections.contains(eout))
						equalConnections.add(eout);
				}
			}
		}

		for (Connection sin : startAnchor.getIncomingConnections()) {
			for (Connection eout : endAnchor.getOutgoingConnections()) {
				if (!eout.equals(sin) && eout.getStart().equals(sin.getStart())
						&& eout.getEnd().equals(sin.getEnd())) {
					if (!equalConnections.contains(eout))
						equalConnections.add(eout);
					if (!equalConnections.contains(sin))
						equalConnections.add(sin);
				}
			}
			for (Connection ein : endAnchor.getIncomingConnections()) {
				if (!sin.equals(ein) && sin.getStart().equals(ein.getEnd())
						&& sin.getEnd().equals(ein.getStart())) {
					if (!equalConnections.contains(sin))
						equalConnections.add(sin);
					if (!equalConnections.contains(ein))
						equalConnections.add(ein);
				}
			}
		}

		return equalConnections;
	}

	private static Point getBendPoint(int centerX, int centerY,
			int orthogonalVectorX, int orthogonalVectorY, int movementFactor) {
		double normalVectorMagnitude = Math.sqrt(orthogonalVectorX
				* orthogonalVectorX + orthogonalVectorY * orthogonalVectorY);

		// normalized vector = vector * (1.0 / |vector|)
		// bendpoint = center of connection + movementFactor pixels in direction
		// of the normalized vector)
		int bendx = (int) (centerX + ((double) orthogonalVectorX
				* (1.0 / normalVectorMagnitude) * movementFactor));
		int bendy = (int) (centerY + ((double) orthogonalVectorY
				* (1.0 / normalVectorMagnitude) * movementFactor));

		return Graphiti.getGaCreateService().createPoint(bendx, bendy);
	}
}
