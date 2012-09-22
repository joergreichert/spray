package org.eclipselabs.spray.shapes.generator.shapes

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipselabs.spray.shapes.shapes.Ellipse
import org.eclipselabs.spray.shapes.shapes.Line
import org.eclipselabs.spray.shapes.shapes.Point
import org.eclipselabs.spray.shapes.shapes.Polygon
import org.eclipselabs.spray.shapes.shapes.Polyline
import org.eclipselabs.spray.shapes.shapes.Rectangle
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.shapes.Shape
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.shapes.ShapeStyleRef
import org.eclipselabs.spray.shapes.shapes.Text
import org.eclipselabs.spray.shapes.shapes.TextType
import org.eclipselabs.spray.shapes.shapes.VAlign
import org.eclipselabs.spray.shapes.shapes.HAlign
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator
import org.eclipselabs.spray.shapes.shapes.Description
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.graphiti.features.IDirectEditingInfo
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager
import java.util.List
import java.util.ArrayList
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle
import org.eclipse.graphiti.mm.algorithms.styles.Orientation
import org.eclipse.xtext.EcoreUtil2

class ShapeTypeGenerator {
	
	@Inject extension ShapeTypeStyleGenerator shapeTypeStyleGenerator
	@Inject extension ShapeSizeCalculator
	@Inject extension TypeReferences typeReferences
	
	private int element_index
	private int plcount
	
	private ShapeDefinition current = null
	
	def setCurrent(ShapeDefinition aShape) {
		this.current = aShape
	}
	
	def private iDirectEditingInfoType() {  findDeclaredType(typeof(IDirectEditingInfo), current)  }
	def private graphicsAlgorithmType() {  findDeclaredType(typeof(GraphicsAlgorithm), current)  }
	def private iSprayConstantsType() {  findDeclaredType(typeof(ISprayConstants), current)  }
	def private sprayLayoutManagerType() {  findDeclaredType(typeof(SprayLayoutManager), current)  }
	def private listType() {  findDeclaredType(typeof(List), current)  }
	def private arrayListType() {  findDeclaredType(typeof(ArrayList), current)  }
	def private pointType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.styles.Point), current)  }
	def private polylineType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Polyline), current)  }
	def private iSprayStyleType() {  findDeclaredType(typeof(ISprayStyle), current)  }
	def private rectangleType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Rectangle), current)  }
	def private polygonType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Polygon), current)  }
	def private roundedRectangleType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.RoundedRectangle), current)  }
	def private ellipseType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Ellipse), current)  }
	def private textType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Text), current)  }
	def private multiTextType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.MultiText), current)  }
	def private shapeType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.pictograms.Shape), current)  }
	def private orientationType() {  findDeclaredType(typeof(Orientation), current)  }
	
	def ITreeAppendable generateCascadedElements(ITreeAppendable givenAppendable, ShapeDefinition s) {
		element_index = -1
		plcount = 0
		var sizeMap = s.getContainerSize
		var containername = "containerShape"
		var attname = nextAttributeName
		var attname2 = attname
		if(s.shape.size > 1) {
			attname2 = nextAttributeName
		}
		var appendable = givenAppendable.append(iDirectEditingInfoType).append(''' directEditingInfo = getFeatureProvider().getDirectEditingInfo();''').newLine
		appendable = appendable.append('''directEditingInfo.setMainPictogramElement(«containername»);''').newLine
		appendable = appendable.append('''directEditingInfo.setPictogramElement(«containername»);''').newLine
		appendable = appendable.newLine
		appendable = appendable.append(graphicsAlgorithmType).append(''' «attname» = gaService.createInvisibleRectangle(«containername»);''').newLine
		appendable = appendable.append('''«attname».setStyle(sprayStyle.getStyle(diagram));''').newLine
		appendable = appendable.append('''peService.setPropertyValue(«attname», ''').append(iSprayConstantsType).append('''.IS_SHAPE_FROM_DSL, ''')
			.append(iSprayConstantsType).append('''.IS_SHAPE_FROM_DSL_VALUE);''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», 0, 0, «sizeMap.width», «sizeMap.heigth + 20»);''').newLine
		if (s.shape.size > 1) {
			appendable = appendable.append('''// Invisible rectangle around the elements (because more then one element is on first layer).''')
				.append(graphicsAlgorithmType).append(''' «attname2» = gaService.createRectangle(«attname»);''').newLine
			appendable = appendable.append('''«attname2».setStyle(sprayStyle.getStyle(diagram));''').newLine
			appendable = appendable.append('''«attname2».setFilled(false);''').newLine
			appendable = appendable.append('''«attname2».setLineVisible(false);''').newLine
			appendable = appendable.append('''gaService.setLocationAndSize(«attname2», 0, 0, «sizeMap.width», «sizeMap.heigth»);''').newLine
		}
		for (element : s.shape) {
			appendable = appendable.createElement(element, attname2, "sprayStyle").newLine
		}
		
		if(s.description != null) {
			appendable = appendable.generateDescription(s.description, containername, "sprayStyle", sizeMap.heigth, sizeMap.width).newLine
		}
		
		appendable = appendable.append('''// Set start values for height and width as properties on the element for Layout Feature''').newLine
		appendable = appendable.append(sprayLayoutManagerType).append('''.setSizePictogramProperties(«containername»);''').newLine
		appendable
	}
	
	def private ITreeAppendable recursiveCreation(ITreeAppendable givenAppendable, EList<Shape> shapeList, String attname, String shapeStyle) {	
		var appendable = givenAppendable
		for (element : shapeList) {
			appendable = appendable.createElement(element, attname,shapeStyle).newLine
      	}
      	appendable
	}
			
	def private ITreeAppendable createPointList(ITreeAppendable givenAppendable, EList<Point> pointlist, String plname) {
		var appendable = givenAppendable.append(listType).append('''<''').append(pointType).append('''> «plname» = new ''')
			.append(arrayListType).append('''<''').append(pointType).append('''>();''').newLine
		for (point : pointlist) {
			appendable = appendable.append('''«plname».add(gaService.createPoint(«point.xcor», «point.ycor», «point.curveBefore», «point.curveAfter»));''').newLine
		}
		appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, Line element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		val pointListName = nextPointListName
		var appendable = givenAppendable.append('''
		''') 
		appendable = appendable.createPointList(element.layout.point, pointListName)
		appendable = appendable.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «pointListName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable = appendable.generateStyleForElement(attname, element.layout.layout)
     	appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, Rectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		var appendable = givenAppendable.append(rectangleType).append(''' «attname» = gaService.createRectangle(«parentName»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «styleForElement(element.style, shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», «element.layout.common.xcor», ''').
			append('''«element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);''').newLine
		if(element.layout?.layout != null) {
			shapeTypeStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForElement(attname, element.layout.layout)
		}	
		if(element.shape != null) {
			appendable = appendable.recursiveCreation(element.shape, attname, "style_"+element_index)
		}
		appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, Polygon element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val pointListName = nextPointListName
		var appendable = givenAppendable.createPointList(element.layout.point, pointListName).newLine
		appendable = appendable.append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «pointListName»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		if(element.layout?.layout != null) {
			shapeTypeStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForElement(attname, element.layout.layout)
		}
		if(element.shape != null) {
			appendable = appendable.recursiveCreation(element.shape, attname, "style_" + element_index)
		}
		appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, Polyline element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val pointListName = nextPointListName
		var appendable = givenAppendable.createPointList(element.layout.point, pointListName).newLine
		appendable = appendable.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «pointListName»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		if(element.layout?.layout != null) {
			shapeTypeStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForElement(attname, element.layout.layout)
		}
		appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, RoundedRectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		var appendable = givenAppendable.append(roundedRectangleType)
			.append(''' «attname» = gaService.createRoundedRectangle(«parentName», «element.layout.curveWidth», ''').append('''«element.layout.curveHeight»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», «element.layout.common.xcor», ''')
			.append('''«element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);''').newLine
		if(element.layout?.layout != null) {
			shapeTypeStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForElement(attname, element.layout.layout).newLine
		}
		if(element.shape != null) {
			appendable = appendable.recursiveCreation(element.shape, attname, "style_"+element_index).newLine
		}
     	appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, Ellipse element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		var appendable = givenAppendable.append(ellipseType).append(''' «attname» = gaService.createEllipse(«parentName»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», ''')
			.append('''«element.layout.common.width», «element.layout.common.heigth»);''').newLine
		if(element.layout?.layout != null) {
			shapeTypeStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForElement(attname, element.layout.layout).newLine
		}
		if(element.shape != null) {
			appendable = appendable.recursiveCreation(element.shape, attname, "style_"+element_index).newLine
		}
     	appendable
	}
	
	def private dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, Text element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		var appendable = givenAppendable
		if (element.texttype == TextType::DEFAULT) {
			appendable = appendable.append(textType).append(''' «attname» = gaService.createText(«parentName»);''').newLine
		} else {
			appendable = appendable.append(multiTextType).append(''' «attname» = gaService.createMultiText(«parentName»);''').newLine
		}
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		appendable = appendable.append('''«attname».setForeground(style_«element_index».getFontColor(diagram));''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», «element.layout.common.xcor», ''')
			.append('''«element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);''').newLine
		appendable = appendable.append('''«attname».setHorizontalAlignment(''').append(orientationType)
			.append('''.«element.layout.HAlign.mapAlignment»);''').newLine
		appendable = appendable.append('''«attname».setVerticalAlignment(''').append(orientationType)
			.append('''.«element.layout.VAlign.mapAlignment»);''').newLine
		appendable = appendable.append('''peService.setPropertyValue(«attname», ''').append(iSprayConstantsType)
			.append('''.TEXT_ID, «element.textIds».«element.body.value».name());''').newLine
		appendable = appendable.append('''«attname».setValue("");''').newLine
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable = appendable.generateStyleForElement(attname, element.layout.layout)
		appendable = appendable.append('''getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(«attname»);''')
     	appendable
	}
	
	def private packageName() { "org.eclipselabs.spray.shapes" }
	def private className(ShapeDefinition c) { c.name.toFirstUpper }
	
	def private textIds(Text text) {
		val container = EcoreUtil2::getContainerOfType(text, typeof(ShapeDefinition))
		packageName + "." + (if(container != null) container else current).className + "TextIds"
	}	

	def private ITreeAppendable generateDescription(ITreeAppendable givenAppendable, Description d, String containerName, String styleName, int y, int width) {
		val shapeName = nextAttributeName
		val attname = nextAttributeName
		var appendable = givenAppendable.append(shapeType).append(''' «shapeName» = peCreateService.createShape(«containerName», false);''').newLine
		appendable = appendable.append(textType).append(''' «attname» = gaService.createText(«shapeName»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style_«element_index» = «d.style.styleForElement(styleName)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style_«element_index».getStyle(diagram));''').newLine
		appendable = appendable.append('''«attname».setForeground(style_«element_index».getFontColor(diagram));''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», 0, «y», «width», 20);''').newLine
		appendable = appendable.append('''«attname».setHorizontalAlignment(''').append(orientationType).append('''.«d.HAlign.mapAlignment»);''').newLine
		appendable = appendable.append('''«attname».setVerticalAlignment(''').append(orientationType).append('''.«d.VAlign.mapAlignment»);''').newLine
		appendable = appendable.append('''peService.setPropertyValue(«attname», «iSprayConstantsType».TEXT_ID, TextIds.«d.body.value».name());''').newLine
		appendable = appendable.append('''«attname».setValue("");''').newLine
		appendable = appendable.append('''directEditingInfo.setPictogramElement(«shapeName»);''').newLine
		appendable = appendable.append('''directEditingInfo.setGraphicsAlgorithm(«attname»);''').newLine
	}

	def private mapAlignment(VAlign align) {
		switch align {
			case VAlign::MIDDLE: "ALIGNMENT_MIDDLE"
			case VAlign::BOTTOM: "ALIGNMENT_BOTTOM"
			case VAlign::TOP: "ALIGNMENT_TOP"
		}
	}
	
	def private mapAlignment(HAlign align) {
		switch align {
			case HAlign::CENTER: "ALIGNMENT_CENTER"
			case HAlign::LEFT: "ALIGNMENT_LEFT"
			case HAlign::RIGHT: "ALIGNMENT_RIGHT"
		}
	}
	
//	def dispatch bodyForText(TextBodyString body) { '''"«body.param»"''' }
//	def dispatch bodyForText(TextBodyParameter body) { 
//		'''(get«body.param.simpleName.toFirstUpper»() == null)? "" : get«body.param.simpleName.toFirstUpper»().toString()''' 
//	}

	def private styleForElement(ShapeStyleRef s, String styleName) {
		if(s != null) {
			'''new «s.style.qualifiedName»()'''
		} else {
			styleName
		}
	}
	
	def private nextAttributeName() {
		element_index = element_index + 1;
		"element_" + element_index
	}
	
	def private nextPointListName() {
		plcount = plcount + 1;
		"pointList_" + plcount 
	}
}