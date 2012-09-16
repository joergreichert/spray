package org.eclipselabs.spray.shapes.generator.shapes

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.generator.util.ShapeAnchorCalculator
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper
import org.eclipselabs.spray.shapes.shapes.AnchorFixPointPosition
import org.eclipselabs.spray.shapes.shapes.AnchorManual
import org.eclipselabs.spray.shapes.shapes.AnchorPredefinied
import org.eclipselabs.spray.shapes.shapes.AnchorPredefiniedEnum
import org.eclipselabs.spray.shapes.shapes.AnchorRelativePosition
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor
import org.eclipse.graphiti.util.IColorConstant
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor
import org.eclipse.graphiti.mm.algorithms.styles.Point

class ShapeAnchorGenerator {
	@Inject extension TypeReferences typeReferences
	
	@Inject extension ShapeSizeCalculator
	@Inject extension ShapeAnchorCalculator
	
	def ellipseType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Ellipse), current)  }
	def fixPointAnchorType() {  findDeclaredType(typeof(FixPointAnchor), current)  }
	def boxRelativeAnchorType() {  findDeclaredType(typeof(BoxRelativeAnchor), current)  }
	def iColorConstantType() {  findDeclaredType(typeof(IColorConstant), current)  }
	def pointType() {  findDeclaredType(typeof(Point), current)  }
	
	private ShapeDefinition current = null
	
	def setCurrent(ShapeDefinition aShape) {
		this.current = aShape
	}	
	
	def ITreeAppendable createAnchorPoints(ITreeAppendable appendable, ShapeDefinition s){
		var size = s.getContainerSize
		var appendable1 = appendable.append('''
		''')
		if(s.anchor == null) {
			appendable1 = appendable1.append('''peCreateService.createChopboxAnchor(containerShape);''')
		} else {
			appendable1 = appendable1.generatorAnchorType(s.anchor.type, size)
		}
		appendable1
	}
	
	def dispatch ITreeAppendable generatorAnchorType(ITreeAppendable appendable, AnchorPredefinied anchorpredefinied, ShapeSizeWrapper shapeSize){
		var appendable1 = appendable.append('''
		''')
		if (anchorpredefinied.value == AnchorPredefiniedEnum::CENTER) {
			appendable1 = appendable.append('''peCreateService.createChopboxAnchor(containerShape);''')
		} else if(anchorpredefinied.value == AnchorPredefiniedEnum::CORNERS) {
		appendable1 = appendable1.append('''for(double aWidth = 0.0; aWidth <= 1.0; aWidth+=0.5) {
			for(double aHeigth = 0.0; aHeigth <= 1.0; aHeigth+=0.5) {
				//No anchor in center
				if(!(aWidth == 0.5 & aHeigth == 0.5)) {
					int sizeAnchor = 6;
					''').append(boxRelativeAnchorType).append(''' boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
					boxAnchor.setRelativeWidth(aWidth);
					boxAnchor.setRelativeHeight(aHeigth);
					''').append(ellipseType).append(''' ellipse = gaService.createEllipse(boxAnchor);
					ellipse.setFilled(true);
					ellipse.setLineVisible(false);
					ellipse.setBackground(gaService.manageColor(diagram, ''').append(iColorConstantType).append('''.GRAY));
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
		}''')
		}
		appendable1
	}
	
	def dispatch ITreeAppendable generatorAnchorType(ITreeAppendable appendable, AnchorManual manualAnchor, ShapeSizeWrapper shapeSize){
		var widthA = 6
		var heightA = 6
		var appendable1 = appendable
		for (position : manualAnchor.position) {
			appendable1 = appendable1.generateAnchor(position.pos, shapeSize, widthA, heightA)
		}
		appendable1
	}
	
	def dispatch ITreeAppendable generateAnchor(ITreeAppendable appendable, AnchorRelativePosition position, ShapeSizeWrapper shapeSize, int widthA, int heightA) {
		appendable.append('''	
		{
			''').append(boxRelativeAnchorType).append(''' boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
			boxAnchor.setRelativeWidth(«position.xoffset»);
			boxAnchor.setRelativeHeight(«position.yoffset»);
			''').append(ellipseType).append(''' ellipse = gaService.createEllipse(boxAnchor);
			ellipse.setFilled(true);
			ellipse.setLineVisible(false);
			ellipse.setBackground(gaService.manageColor(diagram, ''').append(iColorConstantType).append('''.GRAY));
			ellipse.setX(«calculateCorrection(shapeSize.width, widthA, position.xoffset)»);
			ellipse.setY(«calculateCorrection(shapeSize.heigth, heightA, position.yoffset)»);
			ellipse.setWidth(«widthA»);
			ellipse.setHeight(«heightA»);
		}
		''')
	}
		
	def dispatch ITreeAppendable generateAnchor(ITreeAppendable appendable, AnchorFixPointPosition position, ShapeSizeWrapper shapeSize, int widthA, int heightA) {
		appendable.append('''
		{
			''').append(fixPointAnchorType).append(''' fixAnchor = peCreateService.createFixPointAnchor(containerShape);
			''').append(pointType).append(''' fixAnchorPoint = gaService.createPoint(«position.xcor», «position.ycor»);
			fixAnchor.setLocation(fixAnchorPoint);
			''').append(ellipseType).append(''' ellipse = gaService.createEllipse(fixAnchor);
			ellipse.setFilled(true);
			ellipse.setLineVisible(false);
			ellipse.setBackground(gaService.manageColor(diagram, ''').append(iColorConstantType).append('''.GRAY));
			ellipse.setX(«calculateCorrection(position.xcor, shapeSize.width, widthA)»);
			ellipse.setY(«calculateCorrection(position.ycor, shapeSize.heigth, heightA)»);
			ellipse.setWidth(«widthA»);
			ellipse.setHeight(«heightA»);
		}
		''')
	}
}