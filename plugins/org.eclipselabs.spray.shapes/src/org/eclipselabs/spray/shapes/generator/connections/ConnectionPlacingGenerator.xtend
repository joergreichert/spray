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
import org.eclipselabs.spray.shapes.shapes.TextType
import org.eclipselabs.spray.shapes.shapes.VAlign
import org.eclipselabs.spray.shapes.shapes.HAlign

class ConnectionPlacingGenerator {

	@Inject extension ConnectionStyleGenerator
	
	def generatePlacing(PlacingDefinition pd) {
		'''
		{
			ConnectionDecorator decorator = peCreateService.createConnectionDecorator(newConnection, false, «pd.offset», true);
			«pd.shapeCon.createElement("decorator", "sprayStyle", pd.angle, pd.distance)»
		}
		'''
	}
	
	def dispatch createElement(CDLine element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)		
		'''
		«createPointList(element.layout.point, plname, x, y)»
		Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		{
		// As Graphiti doesn´t allow rectangles, creating rectangle as polygon
		List<Point> «plname» = new ArrayList<Point>();
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor», 0, 0));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor», 0, 0));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor+element.layout.common.heigth», 0, 0));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor+element.layout.common.heigth», 0, 0));
		Polygon «attname» = gaService.createPolygon(«parentName», «plname»);
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		«generateStyleForConnection(attname, element.layout.layout)»
		}
     	'''
	}
	
	def dispatch createElement(CDPolygon element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		«createPointList(element.layout.point, plname,x,y)»
		Polygon «attname» = gaService.createPolygon(«parentName», «plname»);
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDPolyline element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		«createPointList(element.layout.point, plname,x,y)»
		Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDRoundedRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		{
		// As Graphiti doesn´t allow rectangles, creating rounded rectangle as curved polygon
		List<Point> «plname» = new ArrayList<Point>();
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor», «element.layout.curveHeight», «element.layout.curveWidth»));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor», «element.layout.curveWidth», «element.layout.curveHeight»);
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor+element.layout.common.heigth», «element.layout.curveHeight», «element.layout.curveWidth»);
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor+element.layout.common.heigth», «element.layout.curveWidth», «element.layout.curveHeight»);
		Polygon «attname» = gaService.createPolygon(«parentName», «plname»);
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		«generateStyleForConnection(attname, element.layout.layout)»
		}
     	'''
	}
	
	def dispatch createElement(CDEllipse element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = "element"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		Ellipse «attname» = gaService.createEllipse(«parentName»);
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor+x», «element.layout.common.ycor+y», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForConnection(attname, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(CDText element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val editingname = "deinfo"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		'''
		decorator.setActive(true);
		«IF element.texttype == TextType::DEFAULT»
		Text «attname» = gaService.createText(«parentName»);
		«ELSE»
		MultiText «attname» = gaService.createMultiText(«parentName»);
		«ENDIF»
		ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		«attname».setForeground(style.getFontColor(diagram));
		gaService.setLocationAndSize(«attname», «x+element.layout.common.xcor», «y+element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«attname».setHorizontalAlignment(Orientation.«element.layout.HAlign.mapAlignment»);
		«attname».setVerticalAlignment(Orientation.«element.layout.VAlign.mapAlignment»);
		«attname».setValue("");
		peService.setPropertyValue(«attname», ISprayShapeConstants.TEXT_ID, TextIds.«element.body.value».name());
		IDirectEditingInfo «editingname» = getFeatureProvider().getDirectEditingInfo();
		«editingname».setMainPictogramElement(newConnection);
		«editingname».setPictogramElement(newConnection);
		«editingname».setGraphicsAlgorithm(«attname»);
		«generateStyleForConnection(attname, element.layout.layout)»
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
	
//	def dispatch bodyForText(TextBodyString body) { '''"«body.param»"''' }
//	def dispatch bodyForText(TextBodyParameter body) { 
//		'''(get«body.param.simpleName.toFirstUpper»() == null)? "" : get«body.param.simpleName.toFirstUpper»().toString()''' 
//	}

	def createPointList(EList<Point> pointlist, String plname, Integer x, Integer y) {
		'''
		List<Point> «plname» = new ArrayList<Point>();
		«FOR point: pointlist»
			«plname».add(gaService.createPoint(«point.xcor+x», «point.ycor+y», «point.curveBefore», «point.curveAfter»));
		«ENDFOR»
		'''
	}
	
	def styleForElement(ShapeStyleRef s, String styleName) {
		if(s != null) {
			'''new «s.style.qualifiedName»()'''
		} else {
			styleName
		}
	}
	
	def getXPositionforAngle(Integer distance, Integer angle) {
		// Spezialfälle 0/90/180/270/>=360
		if(angle == 90 || angle == 270) {
			0
		} else if(angle == 180) {
			-distance
		} else if(angle == 0 || angle >= 360) {
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
		if(angle == 90) {
			-distance
		} else if(angle == 0 || angle == 180 || angle >= 360) {
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