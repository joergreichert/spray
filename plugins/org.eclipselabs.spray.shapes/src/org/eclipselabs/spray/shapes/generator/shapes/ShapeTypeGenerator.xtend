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
import org.eclipselabs.spray.shapes.shapes.TextBody
import org.eclipselabs.spray.shapes.shapes.TextBodyValue
import org.eclipselabs.spray.shapes.shapes.TextBodyParameter
import org.eclipselabs.spray.shapes.shapes.TextBodyString

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
		invisibleRectangle.setWidth(«sizeMap.get("width")»);
		invisibleRectangle.setHeight(«sizeMap.get("height")»);
		
		Style style_«element_index» = «s.style.styleForElement("sprayStyle")»;
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
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(Rectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		Rectangle «attname» = gaService.createRectangle(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
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
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
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
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(RoundedRectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		RoundedRectangle «attname» = gaService.createRoundedRectangle(«parentName», «element.layout.curveWidth», «element.layout.curveHeight»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Ellipse element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		'''
		Ellipse «attname» = gaService.createEllipse(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
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
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«attname».setValue(«element.body.value.bodyForText»);
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
	}

	def dispatch bodyForText(TextBodyString body) { '''"«body.param»"''' }
	def dispatch bodyForText(TextBodyParameter body) { '''get«body.param.simpleName.toFirstUpper»().toString()''' }

	def styleForElement(ShapeStyleRef s, String styleName) {
		if(s != null) {
			'''new «s.style.qualifiedName»().getStyle(diagram)'''
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