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
	
	int element_index
	int plcount
	
	private ShapeDefinition current = null
	
	def setCurrent(ShapeDefinition aShape) {
		this.current = aShape
	}
	
	def iDirectEditingInfoType() {  findDeclaredType(typeof(IDirectEditingInfo), current)  }
	def graphicsAlgorithmType() {  findDeclaredType(typeof(GraphicsAlgorithm), current)  }
	def iSprayConstantsType() {  findDeclaredType(typeof(ISprayConstants), current)  }
	def sprayLayoutManagerType() {  findDeclaredType(typeof(SprayLayoutManager), current)  }
	def listType() {  findDeclaredType(typeof(List), current)  }
	def arrayListType() {  findDeclaredType(typeof(ArrayList), current)  }
	def pointType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.styles.Point), current)  }
	def polylineType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Polyline), current)  }
	def iSprayStyleType() {  findDeclaredType(typeof(ISprayStyle), current)  }
	def rectangleType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Rectangle), current)  }
	def polygonType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Polygon), current)  }
	def roundedRectangleType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.RoundedRectangle), current)  }
	def ellipseType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Ellipse), current)  }
	def textType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Text), current)  }
	def multiTextType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.MultiText), current)  }
	def shapeType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.pictograms.Shape), current)  }
	def orientationType() {  findDeclaredType(typeof(Orientation), current)  }
	
	def ITreeAppendable generateCascadedElements(ITreeAppendable appendable, ShapeDefinition s) {
		element_index = -1
		plcount = 0
		var sizeMap = s.getContainerSize
		var containername = "containerShape"
		var attname = nextAttributeName
		var attname2 = attname
		if(s.shape.size > 1) {
			attname2 = nextAttributeName
		}
		var appendable1 = appendable.append('''
		''').append(iDirectEditingInfoType).append(''' directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(«containername»);
		directEditingInfo.setPictogramElement(«containername»);
		
		''').append(graphicsAlgorithmType).append(''' «attname» = gaService.createInvisibleRectangle(«containername»);
		«attname».setStyle(sprayStyle.getStyle(diagram));
		peService.setPropertyValue(«attname», ''').append(iSprayConstantsType).append('''.IS_SHAPE_FROM_DSL, ''').append(iSprayConstantsType).append('''.IS_SHAPE_FROM_DSL_VALUE);
		gaService.setLocationAndSize(«attname», 0, 0, «sizeMap.width», «sizeMap.heigth + 20»);
		''')
		if (s.shape.size > 1) {
		appendable1 = appendable.append('''// Invisible rectangle around the elements (because more then one element is on first layer).
		''').append(graphicsAlgorithmType).append(''' «attname2» = gaService.createRectangle(«attname»);
		«attname2».setStyle(sprayStyle.getStyle(diagram));
		«attname2».setFilled(false);
		«attname2».setLineVisible(false);
		gaService.setLocationAndSize(«attname2», 0, 0, «sizeMap.width», «sizeMap.heigth»);''')
		}
		for (element : s.shape) {
			appendable1 = appendable1.createElement(element, attname2, "sprayStyle")
		}
		
		if(s.description != null) {
		appendable1 = appendable1.generateDescription(s.description, containername, "sprayStyle", sizeMap.heigth, sizeMap.width)
		}
		
		appendable1 = appendable1.newLine
		
		// Set start values for height and width as properties on the element for Layout Feature
		appendable1 = appendable1.append(sprayLayoutManagerType).append('''.setSizePictogramProperties(«containername»);
		''')
		appendable1
	}
	
	def ITreeAppendable recursiveCreation(ITreeAppendable appendable, EList<Shape> shapeList, String attname, String shapeStyle) {	
		var appendable1 = appendable
		for (element : shapeList) {
			appendable1 = appendable1.createElement(element, attname,shapeStyle)
      	}
      	appendable1
	}
			
	def ITreeAppendable createPointList(ITreeAppendable appendable, EList<Point> pointlist, String plname) {
		appendable.append('''
		''').append(listType).append('''<''').append(pointType).append('''> «plname» = new ''').append(arrayListType).append('''<''').append(pointType).append('''>();
		«FOR point: pointlist»
			«plname».add(gaService.createPoint(«point.xcor», «point.ycor», «point.curveBefore», «point.curveAfter»));
		«ENDFOR»
		''')
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, Line element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		val pointListName = nextPointListName
		var appendable1 = appendable.append('''
		''') 
		appendable1 = appendable1.createPointList(element.layout.point, pointListName)
		appendable1 = appendable1.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «pointListName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, Rectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		var appendable1 = appendable.append('''
		''').append(rectangleType).append(''' «attname» = gaService.createRectangle(«parentName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «styleForElement(element.style, shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
		appendable1 = appendable1.recursiveCreation(element.shape, attname, "style_"+element_index)
		appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, Polygon element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val pointListName = nextPointListName
		var appendable1 = appendable.append('''
		''')
		appendable1 = appendable1.createPointList(element.layout.point, pointListName)
		appendable1 = appendable.append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «pointListName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
		appendable1 = appendable1.recursiveCreation(element.shape, attname, "style_"+element_index)
		appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, Polyline element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val pointListName = nextPointListName
		var appendable1 = appendable.append('''
		''')
		appendable1 = appendable1.createPointList(element.layout.point, pointListName)
		appendable1 = appendable.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «pointListName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
		appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, RoundedRectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		var appendable1 = appendable.append('''
		''').append(roundedRectangleType).append(''' «attname» = gaService.createRoundedRectangle(«parentName», «element.layout.curveWidth», «element.layout.curveHeight»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
		appendable1 = appendable1.recursiveCreation(element.shape, attname, "style_"+element_index)
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, Ellipse element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		var appendable1 = appendable.append('''
		''').append(ellipseType).append(''' «attname» = gaService.createEllipse(«parentName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
		appendable1 = appendable1.recursiveCreation(element.shape, attname, "style_"+element_index)
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, Text element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		var appendable1 = appendable.append('''
		''')
		if (element.texttype == TextType::DEFAULT) {
		appendable1 = appendable1.append(textType).append(''' «attname» = gaService.createText(«parentName»);''')
		} else {
		appendable1 = appendable1.append(multiTextType).append(''' «attname» = gaService.createMultiText(«parentName»);''')
		}
		appendable1 = appendable1.append(iSprayStyleType).append(''' style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«attname».setForeground(style_«element_index».getFontColor(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«attname».setHorizontalAlignment(''').append(orientationType).append('''.«element.layout.HAlign.mapAlignment»);
		«attname».setVerticalAlignment(''').append(orientationType).append('''.«element.layout.VAlign.mapAlignment»);
		peService.setPropertyValue(«attname», ''').append(iSprayConstantsType).append('''.TEXT_ID, «element.textIds».«element.body.value».name());
		«attname».setValue("");''')
		shapeTypeStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForElement(attname, element.layout.layout)
		appendable1 = appendable1.append('''getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(«attname»);''')
     	appendable1
	}
	
		def private packageName() { "org.eclipselabs.spray.shapes" }
	def private className(ShapeDefinition c) { c.name.toFirstUpper }
	
	def textIds(Text text) {
		val container = EcoreUtil2::getContainerOfType(text, typeof(ShapeDefinition))
		packageName + "." + (if(container != null) container else current).className + "TextIds"
	}	

	def ITreeAppendable generateDescription(ITreeAppendable appendable, Description d, String containerName, String styleName, int y, int width) {
		val shapeName = nextAttributeName
		val attname = nextAttributeName
		appendable.append('''
		''').append(shapeType).append(''' «shapeName» = peCreateService.createShape(«containerName», false);
		''').append(textType).append(''' «attname» = gaService.createText(«shapeName»);
		''').append(iSprayStyleType).append(''' style_«element_index» = «d.style.styleForElement(styleName)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«attname».setForeground(style_«element_index».getFontColor(diagram));
		gaService.setLocationAndSize(«attname», 0, «y», «width», 20);
		«attname».setHorizontalAlignment(''').append(orientationType).append('''.«d.HAlign.mapAlignment»);
		«attname».setVerticalAlignment(''').append(orientationType).append('''.«d.VAlign.mapAlignment»);
		peService.setPropertyValue(«attname», «iSprayConstantsType».TEXT_ID, TextIds.«d.body.value».name());
		«attname».setValue("");
		directEditingInfo.setPictogramElement(«shapeName»);
		directEditingInfo.setGraphicsAlgorithm(«attname»);
		''')
	}

	def mapAlignment(VAlign align) {
		switch align {
			case VAlign::MIDDLE: "ALIGNMENT_MIDDLE"
			case VAlign::BOTTOM: "ALIGNMENT_BOTTOM"
			case VAlign::TOP: "ALIGNMENT_TOP"
		}
	}
	
	def mapAlignment(HAlign align) {
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

	def styleForElement(ShapeStyleRef s, String styleName) {
		if(s != null) {
			'''new «s.style.qualifiedName»()'''
		} else {
			styleName
		}
	}
	
	def nextAttributeName() {
		element_index = element_index + 1;
		"element_" + element_index
	}
	
	def nextPointListName() {
		plcount = plcount + 1;
		"pointList_" + plcount 
	}
	
}