package org.eclipselabs.spray.shapes.generator.shapes

import com.google.inject.Inject
import java.util.HashMap
import org.eclipselabs.spray.shapes.shapes.AnchorPredefinied
import org.eclipselabs.spray.shapes.shapes.AnchorPredefiniedEnum
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.shapes.AnchorManual
import org.eclipselabs.spray.shapes.shapes.AnchorRelativePosition
import org.eclipselabs.spray.shapes.shapes.AnchorFixPointPosition
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator
import org.eclipselabs.spray.shapes.generator.util.ShapeAnchorCalculator
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper

class ShapeAnchorGenerator {
	
	@Inject extension ShapeSizeCalculator sizeCalculator
	@Inject extension ShapeAnchorCalculator anchorCalculator
	
	def createAnchorPoints(ShapeDefinition s){
		var size = s.getContainerSize
		'''
		«IF(s.anchor == null)»
			peCreateService.createChopboxAnchor(containerShape);
		«ELSE»
			«s.anchor.type.generatorAnchorType(size)»
		«ENDIF»
		'''
	}
	
	def dispatch generatorAnchorType(AnchorPredefinied anchorpredefinied, ShapeSizeWrapper shapeSize){
		'''
		«IF(anchorpredefinied.value == AnchorPredefiniedEnum::CENTER)»
		peCreateService.createChopboxAnchor(containerShape);
		«ELSEIF(anchorpredefinied.value == AnchorPredefiniedEnum::CORNERS)»
		for(double aWidth = 0.0; aWidth <= 1.0; aWidth+=0.5) {
			for(double aHeigth = 0.0; aHeigth <= 1.0; aHeigth+=0.5) {
				//No anchor in center
				if(aWidth != 0.5 && aHeigth != 0.5 ) {
					int sizeAnchor = 6;
					BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
					boxAnchor.setRelativeWidth(aWidth);
					boxAnchor.setRelativeHeight(aHeigth);
					Ellipse ellipse = gaService.createEllipse(boxAnchor);
					ellipse.setFilled(true);
					ellipse.setLineVisible(false);
					ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));
					ellipse.setWidth(sizeAnchor);
					ellipse.setHeight(sizeAnchor);
					if(aWidth == 0.0 && aHeigth == 0.0 ) { ellipse.setX(0); ellipse.setY(0); }
					else if(aWidth == 0.0 && aHeigth == 0.5 ) { ellipse.setX(0); ellipse.setY(-(sizeAnchor/2)); }
					else if(aWidth == 0.0 && aHeigth == 1.0 ) { ellipse.setX(0); ellipse.setY(-sizeAnchor); }
					else if(aWidth == 0.5 && aHeigth == 0.0 ) { ellipse.setX(-(sizeAnchor/2)); ellipse.setY(0); }
					else if(aWidth == 0.5 && aHeigth == 1.0 ) { ellipse.setX(-(sizeAnchor/2)); ellipse.setY(-sizeAnchor); }
					else if(aWidth == 1.0 && aHeigth == 0.0 ) { ellipse.setX(-sizeAnchor); ellipse.setY(0); }
					else if(aWidth == 1.0 && aHeigth == 0.5 ) { ellipse.setX(-sizeAnchor); ellipse.setY(-(sizeAnchor/2)); }
					else if(aWidth == 1.0 && aHeigth == 1.0 ) { ellipse.setX(-sizeAnchor); ellipse.setY(-sizeAnchor); }
				}
			}
		}
		«ENDIF»
		'''
	}
	
	def dispatch generatorAnchorType(AnchorManual manualAnchor, ShapeSizeWrapper shapeSize){
		var widthA = 6
		var heightA = 6
		'''
		«FOR position : manualAnchor.position »
			«position.pos.generateAnchor(shapeSize, widthA, heightA)»
		«ENDFOR»
		'''
	}
	
	def dispatch generateAnchor(AnchorRelativePosition position, ShapeSizeWrapper shapeSize, int widthA, int heightA) {
		'''	
		{
			BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
			boxAnchor.setRelativeWidth(«position.xoffset»);
			boxAnchor.setRelativeHeight(«position.yoffset»);
			Ellipse ellipse = gaService.createEllipse(boxAnchor);
			ellipse.setFilled(true);
			ellipse.setLineVisible(false);
			ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));
			ellipse.setX(«calculateCorrection(shapeSize.width, widthA, position.xoffset)»);
			ellipse.setY(«calculateCorrection(shapeSize.heigth, heightA, position.yoffset)»);
			ellipse.setWidth(«widthA»);
			ellipse.setHeight(«heightA»);
		}
		'''
	}
		
	def dispatch generateAnchor(AnchorFixPointPosition position, ShapeSizeWrapper shapeSize, int widthA, int heightA) {
		'''
		{
			FixPointAnchor fixAnchor = peCreateService.createFixPointAnchor(containerShape);
			Point fixAnchorPoint = gaService.createPoint(«position.xcor», «position.ycor»);
			fixAnchor.setLocation(fixAnchorPoint);
			Ellipse ellipse = gaService.createEllipse(fixAnchor);
			ellipse.setFilled(true);
			ellipse.setLineVisible(false);
			ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));
			ellipse.setX(«calculateCorrection(position.xcor, shapeSize.width, widthA)»);
			ellipse.setY(«calculateCorrection(position.ycor, shapeSize.heigth, heightA)»);
			ellipse.setWidth(«widthA»);
			ellipse.setHeight(«heightA»);
		}
		'''
	}
}