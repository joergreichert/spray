package org.eclipselabs.spray.shapes.validation;

import java.util.Map;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapesPackage;

import com.google.inject.Inject;

public class ShapeJavaValidator extends AbstractShapeJavaValidator {

//	@Inject ShapeSizeCalculator sizeCalculator;
//	
//	@Check
//	public void checkShapeDefinitionSize(ShapeDefinition shapeDefinition) {
//		Map<String, Integer> containerSize = sizeCalculator.getContainerSize(shapeDefinition);
//		int minw = shapeDefinition.getShapeLayout().getMinwidth();
//		int minh = shapeDefinition.getShapeLayout().getMinheight();
//		int maxw = shapeDefinition.getShapeLayout().getMaxwidth();
//		int maxh = shapeDefinition.getShapeLayout().getMaxheight();
//		
//		int currentW = containerSize.get("width");
//		int currentH = containerSize.get("height");
//		
//		if(currentW <= minw) {
//			warning("The current width is smaller than minwidth.", ShapesPackage.Literals.SHAPE_LAYOUT__MINHEIGHT,
//					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentW));
//		}
//		
//		if(currentH <= minh) {
//			warning("The current height is smaller than minheight.", ShapesPackage.Literals.SHAPE_LAYOUT__MINWIDTH,
//					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentH));
//		}
//		
//		if(currentW >= maxw) {
//			warning("The current width exceeded the maxwidth.", ShapesPackage.Literals.SHAPE_LAYOUT__MAXHEIGHT,
//					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentW));
//		}
//		
//		if(currentH >= maxh) {
//			warning("The current height exceeded the maxheight.", ShapesPackage.Literals.SHAPE_LAYOUT__MAXWIDTH,
//					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentH));
//		}
//	}
}
