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
public class EndNode extends DefaultSprayShape {
    
	private IGaService gaService = Graphiti.getGaService();
	private IPeCreateService peCreateService = Graphiti.getPeCreateService();
	
	public EndNode(IFeatureProvider fp) {
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
		invisibleRectangle.setHeight(60);
		
		ISprayStyle style_0 = new org.eclipselabs.spray.styles.EndNodeStyle();
		Ellipse element_1 = gaService.createEllipse(invisibleRectangle);
		ISprayStyle style_1 = style_0;
		element_1.setStyle(style_1.getStyle(diagram));
		gaService.setLocationAndSize(element_1, 38, 12, 24, 24);
		Ellipse element_2 = gaService.createEllipse(element_1);
		ISprayStyle style_2 = style_1;
		element_2.setStyle(style_2.getStyle(diagram));
		gaService.setLocationAndSize(element_2, 6, 6, 12, 12);
		element_2.setBackground(gaService.manageColor(diagram,IColorConstant.BLACK));
		Rectangle element_3 = gaService.createRectangle(invisibleRectangle);
		ISprayStyle style_3 = new org.eclipselabs.spray.styles.LabelRectangeStyle();
		element_3.setStyle(style_3.getStyle(diagram));
		gaService.setLocationAndSize(element_3, 0, 40, 100, 20);
		Text element_4 = gaService.createText(element_3);
		ISprayStyle style_4 = style_3;
		element_4.setStyle(style_4.getStyle(diagram));
		element_4.setForeground(style_4.getFontColor(diagram));
		gaService.setLocationAndSize(element_4, 0, 0, 100, 20);
		element_4.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		element_4.setVerticalAlignment(Orientation.ALIGNMENT_BOTTOM);
		element_4.setValue((getPostcondition() == null)? "" : getPostcondition().toString());
		IDirectEditingInfo deinfo_4 = getFeatureProvider().getDirectEditingInfo();
		deinfo_4.setMainPictogramElement(pictogramElement);
		deinfo_4.setPictogramElement(pictogramElement);
		deinfo_4.setGraphicsAlgorithm(element_4);
		
		return invisibleRectangle;
	}
	
	java.lang.String postcondition;
	
	public java.lang.String getPostcondition() {
		return this.postcondition;
	}
	
	public void setPostcondition(java.lang.String postcondition) {
		this.postcondition = postcondition;
	}
}
