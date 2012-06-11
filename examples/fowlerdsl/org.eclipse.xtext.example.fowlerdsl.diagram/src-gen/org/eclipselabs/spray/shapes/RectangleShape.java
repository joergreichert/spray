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
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;

import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

@SuppressWarnings("all")
public class RectangleShape extends DefaultSprayShape {
    
	public static enum TextIds {
		descriptionField
	}
	
	public RectangleShape(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
		// Create a ContainerShape for this Shape
		Diagram diagram = peService.getDiagramForShape(targetContainer);
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
		
		// define general layout for ContainerShape
		sprayStyle.getStyle(diagram).setProportional(false);	   
		sprayStyle.getStyle(diagram).setStretchH(false);	   
		sprayStyle.getStyle(diagram).setStretchV(false);	   
		
		// creates the cascaded elements (figures)
		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(containerShape);
		directEditingInfo.setPictogramElement(containerShape);
		
		GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
		element_0.setStyle(sprayStyle.getStyle(diagram));
		peService.setPropertyValue(element_0, ISprayConstants.IS_SHAPE_FROM_DSL, ISprayConstants.IS_SHAPE_FROM_DSL_VALUE);
		gaService.setLocationAndSize(element_0, 0, 0, 100, 40);
		
		Rectangle element_1 = gaService.createRectangle(element_0);
		ISprayStyle style_1 = sprayStyle;
		element_1.setStyle(style_1.getStyle(diagram));
		gaService.setLocationAndSize(element_1, 0, 0, 100, 20);
		
		Shape element_2 = peCreateService.createShape(containerShape, false);
		Text element_3 = gaService.createText(element_2);
		ISprayStyle style_3 = sprayStyle;
		element_3.setStyle(style_3.getStyle(diagram));
		element_3.setForeground(style_3.getFontColor(diagram));
		gaService.setLocationAndSize(element_3, 0, 20, 100, 20);
		element_3.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		element_3.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		peService.setPropertyValue(element_3, ISprayConstants.TEXT_ID, TextIds.descriptionField.name());
		element_3.setValue("");
		directEditingInfo.setPictogramElement(element_2);
		directEditingInfo.setGraphicsAlgorithm(element_3);
		
		// Set start values for height and width as properties on the element for Layout Feature
		SprayLayoutManager.setSizePictogramProperties(containerShape);
		
		// creates the anchors
		peCreateService.createChopboxAnchor(containerShape);
		
		return containerShape;
	}

	public SprayLayoutManager getShapeLayout() {
		SprayLayoutManager layoutManager = new SprayLayoutManager( );
		layoutManager.setMinSizeWidth(-1);	
		layoutManager.setMaxSizeWidth(-1);	
		layoutManager.setMinSizeHeight(-1);	
		layoutManager.setMaxSizeHeight(-1);	
		return layoutManager;
	}
	
}
