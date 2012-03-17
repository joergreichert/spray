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
import org.eclipselabs.spray.shapes.shapes.TextBodyParameter
import org.eclipselabs.spray.shapes.shapes.TextBodyString
import org.eclipselabs.spray.shapes.shapes.VAlign
import org.eclipselabs.spray.shapes.shapes.HAlign
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator

class ShapeTypeGenerator {
	
	@Inject extension ShapeTypeStyleGenerator styleGenerator
	@Inject extension ShapeSizeCalculator sizeCalculator
	
	int element_index
	int plcount
	
	def generateCascadedElements(ShapeDefinition s) {
		element_index = 0
		plcount = 0
		var sizeMap = s.getContainerSize
		'''
		// Create a Invisible Rectangle Around the Elements
		GraphicsAlgorithm invisibleRectangle = gaService.createInvisibleRectangle(pictogramElement);
		invisibleRectangle.setStyle(sprayStyle.getStyle(diagram));
		invisibleRectangle.setWidth(«sizeMap.width»);
		invisibleRectangle.setHeight(«sizeMap.heigth»);
		
		ISprayStyle style_«element_index» = «s.style.styleForElement("sprayStyle")»;
		«FOR element : s.shape»
		«element.createElement("invisibleRectangle", "style_"+element_index)»
		«ENDFOR»
		'''
	}
	
	def recursiveCreation(EList<Shape> shapeList, String attname, String shapeStyle) {	
		'''
		«FOR element : shapeList»
		«element.createElement(attname,shapeStyle)»
      	«ENDFOR»
      	'''
	}
			
	def createPointList(EList<Point> pointlist, String plname) {
		'''
		List<Point> «plname» = new ArrayList<Point>();
		«FOR point: pointlist»
			«plname».add(gaService.createPoint(«point.xcor», «point.ycor», «point.curveBefore», «point.curveAfter»));
		«ENDFOR»
		'''
	}
	
	def dispatch createElement(Line element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		val pointListName = nextPointListName
		'''
		«createPointList(element.layout.point, pointListName)»
		Polyline «attname» = gaService.createPolyline(«parentName», «pointListName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(Rectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		Rectangle «attname» = gaService.createRectangle(«parentName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Polygon element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val pointListName = nextPointListName
		'''
		«createPointList(element.layout.point, pointListName)»
		Polygon «attname» = gaService.createPolygon(«parentName», «pointListName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Polyline element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val pointListName = nextPointListName
		'''
		«createPointList(element.layout.point, pointListName)»
		Polyline «attname» = gaService.createPolyline(«parentName», «pointListName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(RoundedRectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		RoundedRectangle «attname» = gaService.createRoundedRectangle(«parentName», «element.layout.curveWidth», «element.layout.curveHeight»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Ellipse element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		'''
		Ellipse «attname» = gaService.createEllipse(«parentName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Text element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		«IF element.texttype == TextType::DEFAULT»
		Text «attname» = gaService.createText(«parentName»);
		«ELSE»
		MultiText «attname» = gaService.createMultiText(«parentName»);
		«ENDIF»
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«attname».setForeground(style_«element_index».getFontColor(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«attname».setHorizontalAlignment(Orientation.«element.layout.HAlign.mapAlignment»);
		«attname».setVerticalAlignment(Orientation.«element.layout.VAlign.mapAlignment»);
		«attname».setValue(«element.body.value.bodyForText»);
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
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
	
	def dispatch bodyForText(TextBodyString body) { '''"«body.param»"''' }
	def dispatch bodyForText(TextBodyParameter body) { 
		'''(get«body.param.simpleName.toFirstUpper»() == null)? "" : get«body.param.simpleName.toFirstUpper»().toString()''' 
	}

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