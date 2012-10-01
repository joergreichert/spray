/**
 * This is a generated Shape for Spray
 */
package org.eclipselabs.spray.shapes;

import java.util.List;
import java.util.ArrayList;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;


import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;

import org.eclipselabs.spray.styles.ISprayStyle;

@SuppressWarnings("all")
public class Node extends DefaultSprayShape {
    
	private IGaService gaService = Graphiti.getGaService();
	private IPeCreateService peCreateService = Graphiti.getPeCreateService();
	
	public Node(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public ContainerShape getShape(Diagram diagram, ISprayStyle sprayStyle) {
		ContainerShape containerShape = super.getShape(diagram, sprayStyle);
		
		// Creating the Anchorpoints
		peCreateService.createChopboxAnchor(containerShape);
		
		return containerShape;
	}

	@Override
	public GraphicsAlgorithm getShape(Diagram diagram, PictogramElement pictogramElement, ISprayStyle sprayStyle) {
		// Define general layout
		sprayStyle.getStyle(diagram).setProportional(false);	   
		sprayStyle.getStyle(diagram).setStretchH(false);	   
		sprayStyle.getStyle(diagram).setStretchV(false);	   
		
		// Creating the different figures
		// Create a Invisible Rectangle Around the Elements
		GraphicsAlgorithm invisibleRectangle = gaService.createInvisibleRectangle(pictogramElement);
		invisibleRectangle.setStyle(sprayStyle.getStyle(diagram));
		invisibleRectangle.setWidth(200);
		invisibleRectangle.setHeight(100);
		
		ISprayStyle style_0 = sprayStyle;
		RoundedRectangle element_1 = gaService.createRoundedRectangle(invisibleRectangle, 2, 2);
		ISprayStyle style_1 = style_0;
		element_1.setStyle(style_1.getStyle(diagram));
		gaService.setLocationAndSize(element_1, 0, 0, 200, 100);
		Text element_2 = gaService.createText(element_1);
		ISprayStyle style_2 = new org.eclipselabs.spray.styles.NodeNameStyle();
		element_2.setStyle(style_2.getStyle(diagram));
		element_2.setForeground(style_2.getFontColor(diagram));
		gaService.setLocationAndSize(element_2, 25, 5, 150, 20);
		element_2.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		element_2.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		element_2.setValue((getName() == null)? "" : getName().toString());
		IDirectEditingInfo deinfo_2 = getFeatureProvider().getDirectEditingInfo();
		deinfo_2.setMainPictogramElement(pictogramElement);
		deinfo_2.setPictogramElement(pictogramElement);
		deinfo_2.setGraphicsAlgorithm(element_2);
		List<Point> pointList_1 = new ArrayList<Point>();
		pointList_1.add(gaService.createPoint(0, 27, 0, 0));
		pointList_1.add(gaService.createPoint(200, 27, 0, 0));
		Polyline element_3 = gaService.createPolyline(element_1, pointList_1);
		ISprayStyle style_3 = style_1;
		element_3.setStyle(style_3.getStyle(diagram));
		element_3.setLineWidth(2);
		Text element_4 = gaService.createText(element_1);
		ISprayStyle style_4 = new org.eclipselabs.spray.styles.NodeDescStyle();
		element_4.setStyle(style_4.getStyle(diagram));
		element_4.setForeground(style_4.getFontColor(diagram));
		gaService.setLocationAndSize(element_4, 15, 30, 170, 65);
		element_4.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		element_4.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		element_4.setValue((getDesc() == null)? "" : getDesc().toString());
		IDirectEditingInfo deinfo_4 = getFeatureProvider().getDirectEditingInfo();
		deinfo_4.setMainPictogramElement(pictogramElement);
		deinfo_4.setPictogramElement(pictogramElement);
		deinfo_4.setGraphicsAlgorithm(element_4);
		
		return invisibleRectangle;
	}
	
	java.lang.String name;
	
	public java.lang.String getName() {
		return this.name;
	}
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	java.lang.String desc;
	
	public java.lang.String getDesc() {
		return this.desc;
	}
	
	public void setDesc(java.lang.String desc) {
		this.desc = desc;
	}
}
