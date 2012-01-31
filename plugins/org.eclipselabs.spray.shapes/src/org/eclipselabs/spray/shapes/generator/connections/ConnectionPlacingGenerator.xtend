package org.eclipselabs.spray.shapes.generator.connections

import org.eclipselabs.spray.shapes.shapes.PlacingDefinition
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipselabs.spray.shapes.shapes.CDEllipse
import org.eclipselabs.spray.shapes.shapes.CDLine
import org.eclipselabs.spray.shapes.shapes.Point
import org.eclipselabs.spray.shapes.shapes.CDPolygon
import org.eclipselabs.spray.shapes.shapes.CDPolyline
import org.eclipselabs.spray.shapes.shapes.CDRectangle
import org.eclipselabs.spray.shapes.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.shapes.CDText
import org.eclipselabs.spray.shapes.shapes.ShapeStyleRef

class ConnectionPlacingGenerator {

	int element_index
	int plcount
	int pcount

	@Inject extension ConnectionStyleGenerator styleGenerator
	
	def generatePlacing(PlacingDefinition pd) {
		'''
		{
			ConnectionDecorator decorator = peCreateService.createConnectionDecorator(newConnection, «pd.active», «pd.offset», true);
			«pd.shapeCon.createElement("decorator", "sprayStyle", pd.angle, pd.distance)»
		}
		'''
	}
	
	def dispatch createElement(CDLine element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = nextAttributeName
		val plname = nextPointListName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)		
		'''
		«createPointList(element.layout.point, plname, x, y)»

		Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		//Set special Style information
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = nextAttributeName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		Rectangle «attname» = gaService.createRectangle(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor+x», «element.layout.common.ycor+y», «element.layout.common.width», «element.layout.common.heigth»);
		
		//Set special Style information
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDPolygon element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = nextAttributeName
		val plname = nextPointListName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		«createPointList(element.layout.point, plname,x,y)»
		
		//Create Polygon with Points and curve
		Polygon «attname» = gaService.createPolygon(«parentName», «plname»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		//Set special Style information
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDPolyline element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = nextAttributeName
		val plname = nextPointListName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		«createPointList(element.layout.point, plname,x,y)»
		
		//Create Polyline with Points and curve
		Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		
		//Set special Style information
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDRoundedRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = nextAttributeName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		RoundedRectangle «attname» = gaService.createRoundedRectangle(«parentName», «element.layout.curveWidth», «element.layout.curveHeight»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor+x», «element.layout.common.ycor+y», «element.layout.common.width», «element.layout.common.heigth»);
		
		//Set special Style information
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDEllipse element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = nextAttributeName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		Ellipse «attname» = gaService.createEllipse(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor+x», «element.layout.common.ycor+y», «element.layout.common.width», «element.layout.common.heigth»);
		
		//Set special Style information
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDText element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = nextAttributeName
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		Text «attname» = gaService.createText(«parentName»);
		Style style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style_«element_index»);
		// TODO: define position
		
		//Set special Style information
     	'''
	}
	
		def createPointList(EList<Point> pointlist, String plname, Integer x, Integer y) {
		'''
		// Create a List of Points
		List<Point> «plname» = new ArrayList<Point>();
		«FOR point: pointlist»
			«var pname = nextPointName»
			Point «pname» = gaService.createPoint(«point.xcor+x», «point.ycor+y», «point.curveBefore», «point.curveAfter»);
			«plname».add(«pname»);			
		«ENDFOR»
		'''
	}
	
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
	
	def getXPositionforAngle(Integer distance, Integer angle) {
		// Spezialfälle 0/90/180/270/>=360
		if(angle == 90 || angle == 270){
			0
		} else if(angle == 180){
			-distance
		} else if(angle == 0 || angle >= 360){
			distance
		} else if(angle < 90) { // Quadrant 1
			var posx = (Math::cos(Math::toRadians(angle))*distance).intValue
			posx
		} else if(angle < 180) { // Quadrant 2
			var newangle = 180 - angle
			var posx = (Math::cos(Math::toRadians(newangle))*distance).intValue
			posx * -1
		} else if (angle < 270) { // Quadrant 3
			var newangle1 = angle - 180
			var posx = (Math::cos(Math::toRadians(newangle1))*distance).intValue
			posx * -1
		} else if (angle < 360) { // Quadrant 4
			var newangle = 360 - angle
			var posx = (Math::cos(Math::toRadians(newangle))*distance).intValue
			posx
		}
	}
	
	def getYPositionforAngle(Integer distance, Integer angle) {
		// Spezialfälle 0/90/180/270/>=360
		if(angle == 90){
			-distance
		} else if(angle == 0 || angle == 180 || angle >= 360){
			0
		} else if(angle == 270) {
			distance
		} else if(angle < 90) { // Quadrant 1
			var posy = (Math::sin(Math::toRadians(angle))*distance).intValue
			posy * -1
		} else if(angle < 180) { // Quadrant 2
			var newangle = 180 - angle
			var posy = (Math::sin(Math::toRadians(newangle))*distance).intValue
			posy * -1
		} else if (angle < 270) { // Quadrant 3
			var newangle1 = angle - 180
			var posy = (Math::sin(Math::toRadians(newangle1))*distance).intValue
			posy
		} else if (angle < 360) { // Quadrant 4
			var newangle = 360 - angle
			var posy = (Math::sin(Math::toRadians(newangle))*distance).intValue
			posy
		}
	}
	
}