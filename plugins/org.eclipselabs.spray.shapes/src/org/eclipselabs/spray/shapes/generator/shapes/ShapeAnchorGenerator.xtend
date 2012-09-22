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
	
	def private ellipseType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Ellipse), current)  }
	def private fixPointAnchorType() {  findDeclaredType(typeof(FixPointAnchor), current)  }
	def private boxRelativeAnchorType() {  findDeclaredType(typeof(BoxRelativeAnchor), current)  }
	def private iColorConstantType() {  findDeclaredType(typeof(IColorConstant), current)  }
	def private pointType() {  findDeclaredType(typeof(Point), current)  }
	
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
	
	def private dispatch ITreeAppendable generatorAnchorType(ITreeAppendable givenAppendable, AnchorPredefinied anchorpredefinied, ShapeSizeWrapper shapeSize){
		var appendable = givenAppendable
		if (anchorpredefinied.value == AnchorPredefiniedEnum::CENTER) {
			appendable = givenAppendable.append('''peCreateService.createChopboxAnchor(containerShape);''')
		} else if(anchorpredefinied.value == AnchorPredefiniedEnum::CORNERS) {
			appendable = appendable.append('''for(double aWidth = 0.0; aWidth <= 1.0; aWidth+=0.5) {''').newLine
			appendable = givenAppendable.increaseIndentation
				appendable = appendable.append('''for(double aHeigth = 0.0; aHeigth <= 1.0; aHeigth+=0.5) {''').newLine
				appendable = givenAppendable.increaseIndentation
					appendable = appendable.append('''//No anchor in center''').newLine
					appendable = appendable.append('''if(!(aWidth == 0.5 & aHeigth == 0.5)) {''').newLine
					appendable = givenAppendable.increaseIndentation
						appendable = appendable.append('''int sizeAnchor = 6;''').newLine
						appendable = appendable.append(boxRelativeAnchorType).append(''' boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);''').newLine
						appendable = appendable.append('''boxAnchor.setRelativeWidth(aWidth);''').newLine
						appendable = appendable.append('''boxAnchor.setRelativeHeight(aHeigth);''').newLine
						appendable = appendable.append(ellipseType).append(''' ellipse = gaService.createEllipse(boxAnchor);''').newLine
						appendable = appendable.append('''ellipse.setFilled(true);''').newLine
						appendable = appendable.append('''ellipse.setLineVisible(false);''').newLine
						appendable = appendable.append('''ellipse.setBackground(gaService.manageColor(diagram, ''').append(iColorConstantType).append('''.GRAY));''').newLine
						appendable = appendable.append('''ellipse.setWidth(sizeAnchor);''').newLine
						appendable = appendable.append('''ellipse.setHeight(sizeAnchor);''').newLine
						appendable = appendable.append('''if(aWidth == 0.0 && aHeigth == 0.0 ) { ellipse.setX(0); ellipse.setY(0); }''').newLine
						appendable = appendable.append('''else if(aWidth == 0.0 && aHeigth == 0.5 ) { ellipse.setX(0); ellipse.setY(-(sizeAnchor/2)); }''').newLine
						appendable = appendable.append('''else if(aWidth == 0.0 && aHeigth == 1.0 ) { ellipse.setX(0); ellipse.setY(-sizeAnchor); }''').newLine
						appendable = appendable.append('''else if(aWidth == 0.5 && aHeigth == 0.0 ) { ellipse.setX(-(sizeAnchor/2)); ellipse.setY(0); }''').newLine
						appendable = appendable.append('''else if(aWidth == 0.5 && aHeigth == 1.0 ) { ellipse.setX(-(sizeAnchor/2)); ellipse.setY(-sizeAnchor); }''').newLine
						appendable = appendable.append('''else if(aWidth == 1.0 && aHeigth == 0.0 ) { ellipse.setX(-sizeAnchor); ellipse.setY(0); }''').newLine
						appendable = appendable.append('''else if(aWidth == 1.0 && aHeigth == 0.5 ) { ellipse.setX(-sizeAnchor); ellipse.setY(-(sizeAnchor/2)); }''').newLine
						appendable = appendable.append('''else if(aWidth == 1.0 && aHeigth == 1.0 ) { ellipse.setX(-sizeAnchor); ellipse.setY(-sizeAnchor); }''').newLine
						appendable = givenAppendable.decreaseIndentation
					appendable = appendable.append('''}''').newLine
					appendable = givenAppendable.decreaseIndentation
				appendable = appendable.append('''}''').newLine
				appendable = givenAppendable.decreaseIndentation
			appendable = appendable.append('''}''').newLine
		}
		appendable
	}
	
	def private dispatch ITreeAppendable generatorAnchorType(ITreeAppendable appendable, AnchorManual manualAnchor, ShapeSizeWrapper shapeSize){
		var widthA = 6
		var heightA = 6
		var appendable1 = appendable
		for (position : manualAnchor.position) {
			appendable1 = appendable1.generateAnchor(position.pos, shapeSize, widthA, heightA)
		}
		appendable1
	}
	
	def private dispatch ITreeAppendable generateAnchor(ITreeAppendable givenAppendable, AnchorRelativePosition position, ShapeSizeWrapper shapeSize, int widthA, int heightA) {
		var appendable = givenAppendable.append('''{''').newLine	
		appendable = givenAppendable.increaseIndentation
			appendable = appendable.append(boxRelativeAnchorType).append(''' boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);''').newLine
			appendable = appendable.append('''boxAnchor.setRelativeWidth(«position.xoffset»);''').newLine
			appendable = appendable.append('''boxAnchor.setRelativeHeight(«position.yoffset»);''').newLine
			appendable = appendable.append(ellipseType).append(''' ellipse = gaService.createEllipse(boxAnchor);''').newLine
			appendable = appendable.append('''ellipse.setFilled(true);''').newLine
			appendable = appendable.append('''ellipse.setLineVisible(false);''').newLine
			appendable = appendable.append('''ellipse.setBackground(gaService.manageColor(diagram, ''').append(iColorConstantType).append('''.GRAY));''').newLine
			appendable = appendable.append('''ellipse.setX(«calculateCorrection(shapeSize.width, widthA, position.xoffset)»);''').newLine
			appendable = appendable.append('''ellipse.setY(«calculateCorrection(shapeSize.heigth, heightA, position.yoffset)»);''').newLine
			appendable = appendable.append('''ellipse.setWidth(«widthA»);''').newLine
			appendable = appendable.append('''ellipse.setHeight(«heightA»);''').newLine
			appendable = givenAppendable.decreaseIndentation
		appendable = appendable.append('''}''')
		appendable
	}
		
	def private dispatch ITreeAppendable generateAnchor(ITreeAppendable givenAppendable, AnchorFixPointPosition position, 
		ShapeSizeWrapper shapeSize, int widthA, int heightA) {
		var appendable = givenAppendable.append('''{''').newLine
		appendable = givenAppendable.increaseIndentation
			appendable = appendable.append(fixPointAnchorType).append(''' fixAnchor = peCreateService.createFixPointAnchor(containerShape);''').newLine
			appendable = appendable.append(pointType).append(''' fixAnchorPoint = gaService.createPoint(«position.xcor», «position.ycor»);''').newLine
			appendable = appendable.append('''fixAnchor.setLocation(fixAnchorPoint);''').newLine
			appendable = appendable.append(ellipseType).append(''' ellipse = gaService.createEllipse(fixAnchor);''').newLine
			appendable = appendable.append('''ellipse.setFilled(true);''').newLine
			appendable = appendable.append('''ellipse.setLineVisible(false);''').newLine
			appendable = appendable.append('''ellipse.setBackground(gaService.manageColor(diagram, ''').append(iColorConstantType).append('''.GRAY));''').newLine
			appendable = appendable.append('''ellipse.setX(«calculateCorrection(position.xcor, shapeSize.width, widthA)»);''').newLine
			appendable = appendable.append('''ellipse.setY(«calculateCorrection(position.ycor, shapeSize.heigth, heightA)»);''').newLine
			appendable = appendable.append('''ellipse.setWidth(«widthA»);''').newLine
			appendable = appendable.append('''ellipse.setHeight(«heightA»);''').newLine
			appendable = givenAppendable.decreaseIndentation
		appendable = appendable.append('''}''')
		appendable
	}
}