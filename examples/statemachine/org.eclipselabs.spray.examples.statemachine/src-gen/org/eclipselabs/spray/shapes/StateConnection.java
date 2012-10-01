/**
 * This is a generated Shape for Spray
 */
package org.eclipselabs.spray.shapes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import org.eclipselabs.spray.styles.ISprayStyle;


@SuppressWarnings("all")
public class StateConnection extends DefaultSprayConnection {
	
	private IGaService gaService = Graphiti.getGaService();
	private IPeCreateService peCreateService = Graphiti.getPeCreateService();
    
    public StateConnection(IFeatureProvider fp) {
		super(fp);
	}
    
	@Override
	public Connection getConnection(Diagram diagram, ISprayStyle sprayStyle, Anchor startAnchor, Anchor endAnchor) {
		Connection newConnection = peCreateService.createFreeFormConnection(diagram);
		newConnection.setStart(startAnchor);
		newConnection.setEnd(endAnchor);
		
		Polyline polyline = gaService.createPolyline(newConnection);
		polyline.setStyle(sprayStyle.getStyle(diagram));

		// Define general layout of connection
		
		// Set the Placings of the connection
		
		return newConnection;
	}
	
	
}
