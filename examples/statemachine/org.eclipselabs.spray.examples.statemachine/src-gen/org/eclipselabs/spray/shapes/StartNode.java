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

import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

@SuppressWarnings("all")
public class StartNode extends DefaultSprayShape {
    
	private IGaService gaService = Graphiti.getGaService();
	private IPeCreateService peCreateService = Graphiti.getPeCreateService();
	
	public StartNode(IFeatureProvider fp) {
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
		sprayStyle.getStyle(diagram).setStretchH(true);	   
		sprayStyle.getStyle(diagram).setStretchV(false);	   
		
		// Creating the different figures
		// Create a Invisible Rectangle Around the Elements
		GraphicsAlgorithm invisibleRectangle = gaService.createInvisibleRectangle(pictogramElement);
		invisibleRectangle.setStyle(sprayStyle.getStyle(diagram));
		invisibleRectangle.setWidth(100);
		invisibleRectangle.setHeight(62);
		
		ISprayStyle style_0 = new org.eclipselabs.spray.styles.StartNodeStyle();
		Rectangle element_1 = gaService.createRectangle(invisibleRectangle);
		ISprayStyle style_1 = new org.eclipselabs.spray.styles.LabelRectangeStyle();
		element_1.setStyle(style_1.getStyle(diagram));
		gaService.setLocationAndSize(element_1, 0, 0, 100, 20);
		Text element_2 = gaService.createText(element_1);
		ISprayStyle style_2 = new org.eclipselabs.spray.styles.LabelRectangeStyle();
		element_2.setStyle(style_2.getStyle(diagram));
		element_2.setForeground(style_2.getFontColor(diagram));
		gaService.setLocationAndSize(element_2, 0, 0, 100, 20);
		element_2.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		element_2.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		element_2.setValue((getPrecondition() == null)? "" : getPrecondition().toString());
		IDirectEditingInfo deinfo_2 = getFeatureProvider().getDirectEditingInfo();
		deinfo_2.setMainPictogramElement(pictogramElement);
		deinfo_2.setPictogramElement(pictogramElement);
		deinfo_2.setGraphicsAlgorithm(element_2);
		Ellipse element_3 = gaService.createEllipse(invisibleRectangle);
		ISprayStyle style_3 = style_2;
		element_3.setStyle(style_3.getStyle(diagram));
		gaService.setLocationAndSize(element_3, 38, 38, 24, 24);
		element_3.setBackground(gaService.manageColor(diagram,IColorConstant.BLACK));
		
		return invisibleRectangle;
	}
	
	java.lang.String precondition;
	
	public java.lang.String getPrecondition() {
		return this.precondition;
	}
	
	public void setPrecondition(java.lang.String precondition) {
		this.precondition = precondition;
	}
}
