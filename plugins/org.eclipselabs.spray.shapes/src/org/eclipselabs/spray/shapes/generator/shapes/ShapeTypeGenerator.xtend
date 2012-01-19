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

class ShapeTypeGenerator {
	
	@Inject extension ShapeTypeStyleGenerator styleGenerator
	@Inject extension ShapeSizeCalculator sizeCalculator
	
	int element_index
	int plcount
	int pcount
	
	def generateCascadedElements(ShapeDefinition s) {
		element_index = 0
		plcount = 0
		pcount = 0
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
		'''«FOR element : shapeList»
		«element.createElement(attname,shapeStyle)»
      	«ENDFOR»'''
	}
			
	def createPointList(EList<Point> pointlist, String plname) {
		'''
		// Create a List of Points
		List<Point> «plname» = new ArrayList<Point>();
		«FOR point: pointlist»
			«var pname = nextPointName»
			Point «pname» = gaService.createPoint(«point.xcor», «point.ycor», «point.curveBefore», «point.curveAfter»);
			«plname».add(«pname»);			
		«ENDFOR»
		'''
	}
	
	def dispatch createElement(Line element, String parentName, String shapeStyle) {
		val attname = nextAttributeName
		val plname = nextPointListName
		
		'''
		«createPointList(element.layout.point, plname)»
		
		Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		//Set special Style information
		«generateStyleForElement(attname, element.layout.layout)»
«««		«line.shape.recursiveCreation(attname, "style_"+element_index))»
     	'''
	}
	
	def dispatch createElement(Rectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		Rectangle «attname» = gaService.createRectangle(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		
		//Set special Style information
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Polygon element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val plname = nextPointListName
		'''
		«createPointList(element.layout.point, plname)»
		
		//Create Polygon with Points and curve
		Polygon «attname» = gaService.createPolygon(«parentName», «plname»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		//Set special Style information
		«generateStyleForElement(attname, element.layout.layout)»
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Polyline element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		val plname = nextPointListName
		'''
		«createPointList(element.layout.point, plname)»
		
		//Create Polyline with Points and curve
		Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		//Set special Style information
		«generateStyleForElement(attname, element.layout.layout)»
«««		«polyline.shape.recursiveCreation(attname, "style_"+element_index))»
     	'''
	}
	
	def dispatch createElement(RoundedRectangle element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		RoundedRectangle «attname» = gaService.createRoundedRectangle(«parentName», «element.layout.curveWidth», «element.layout.curveHeight»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		
		//Set special Style information
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
		
		//Set special Style information
		«generateStyleForElement(attname, element.layout.layout)»
		
		«element.shape.recursiveCreation(attname, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Text element, String parentName, String shapeStyle) { 
		val attname = nextAttributeName
		'''
		Text «attname» = gaService.createText(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		// TODO: define position
		
		//Set special Style information
		«generateStyleForElement(attname, element.layout.layout)»
     	'''
	}
	
//	def dispatch createElement(ShapeRef element, String parentName, String shapeStyle) { 
//		val attname = nextAttributeName
//		'''
//		GraphicsAlgorithm «attname» = new «element.ref.qualifiedName»().getShape(diagram, «parentName», iSprayStyle);
//		Style style_«element_index» = «shapeStyle»;
//		«attname».setStyle(style_«element_index»);
//		«attname».setWidth(«element.layout.common.width»);
//		«attname».setHeight(«element.layout.common.heigth»);
//		«attname».setX(«element.layout.common.xcor»);
//		«attname».setY(«element.layout.common.ycor»);
//		«generateStyleForElement(attname, element.layout.layout)»
//     	'''
//	}
	
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
	
	def nextPointName() {
		pcount = pcount + 1;
		"point_" + pcount
	}
}