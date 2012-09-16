package org.eclipselabs.spray.shapes.generator.connections

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.graphiti.features.IDirectEditingInfo
import org.eclipse.graphiti.mm.algorithms.styles.Orientation
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle
import org.eclipselabs.spray.shapes.shapes.CDEllipse
import org.eclipselabs.spray.shapes.shapes.CDLine
import org.eclipselabs.spray.shapes.shapes.CDPolygon
import org.eclipselabs.spray.shapes.shapes.CDPolyline
import org.eclipselabs.spray.shapes.shapes.CDRectangle
import org.eclipselabs.spray.shapes.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.shapes.CDText
import org.eclipselabs.spray.shapes.shapes.HAlign
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition
import org.eclipselabs.spray.shapes.shapes.ShapeStyleRef
import org.eclipselabs.spray.shapes.shapes.TextType
import org.eclipselabs.spray.shapes.shapes.VAlign
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition

class ConnectionPlacingGenerator {
    @Inject extension TypeReferences typeReferences
	@Inject extension ConnectionStyleGenerator connectionStyleGenerator
	
	private PlacingDefinition current = null 
	private ConnectionDefinition connectionDefinition = null 
	
	def setCurrent(PlacingDefinition aPlacing) {
		this.current = aPlacing
		connectionDefinition = aPlacing.eContainer as ConnectionDefinition
	}
	
	def iDirectEditingInfoType() {  findDeclaredType(typeof(IDirectEditingInfo), current)  }
	def iSprayConstantsType() {  findDeclaredType(typeof(ISprayConstants), current)  }
	def listType() {  findDeclaredType(typeof(List), current)  }
	def arrayListType() {  findDeclaredType(typeof(ArrayList), current)  }
	def pointType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.styles.Point), current)  }
	def polylineType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Polyline), current)  }
	def iSprayStyleType() {  findDeclaredType(typeof(ISprayStyle), current)  }
	def polygonType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Polygon), current)  }
	def ellipseType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Ellipse), current)  }
	def textType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.Text), current)  }
	def multiTextType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.MultiText), current)  }
	def orientationType() {  findDeclaredType(typeof(Orientation), current)  }
	def connectionDecoratorType() {  findDeclaredType(typeof(ConnectionDecorator), current)  }
	
	
	def ITreeAppendable generatePlacing(ITreeAppendable appendable, PlacingDefinition pd) {
		var appendable1 = appendable.append('''
		{
			''').append(connectionDecoratorType).append(''' decorator = peCreateService.createConnectionDecorator(newConnection, false, «pd.offset», true);
			''') appendable1 = appendable1.createElement(pd.shapeCon, "decorator", "sprayStyle", pd.angle, pd.distance) appendable1 = appendable1.append('''
		}
		''')
		appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDLine element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)		
		var appendable1 = appendable.append('''
		''') appendable1 = appendable1.createPointList(element.layout.point, plname, x, y)
		appendable1 = appendable1.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «plname»);
		''').append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));''')
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout)
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable1 = appendable.append('''
		{
		// As Graphiti doesn´t allow rectangles, creating rectangle as polygon
		''').append(listType).append('''<''').append(pointType).append('''> «plname» = new ''').append(arrayListType).append('''<''').append(pointType).append('''>();
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor», 0, 0));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor», 0, 0));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor+element.layout.common.heigth», 0, 0));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor+element.layout.common.heigth», 0, 0));
		''').append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «plname»);
		''').append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));''')
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout) appendable1 = appendable1.newLine  appendable1 = appendable1.append('''
		}
     	''')
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDPolygon element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable1 = appendable.append('''
		''')
		appendable1 = appendable1.createPointList(element.layout.point, plname,x,y)
		appendable1 = appendable1.append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «plname»);
		''').append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));''')
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout) appendable1 = appendable1.append('''
     	''')
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDPolyline element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable1 = appendable.append('''
		''')
		appendable1 = appendable1.createPointList(element.layout.point, plname,x,y)
		appendable1 = appendable1.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «plname»);
		''').append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));''')
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout) appendable1 = appendable1.append('''
     	''')
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDRoundedRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable1 = appendable.append('''
		{
		// As Graphiti doesn´t allow rectangles, creating rounded rectangle as curved polygon
		''').append(listType).append('''<''').append(pointType).append('''> «plname» = new ''').append(arrayListType).append('''<''').append(pointType).append('''>();
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor», «element.layout.curveHeight», «element.layout.curveWidth»));
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor», «element.layout.curveWidth», «element.layout.curveHeight»);
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor+element.layout.common.heigth», «element.layout.curveHeight», «element.layout.curveWidth»);
		«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor+element.layout.common.heigth», «element.layout.curveWidth», «element.layout.curveHeight»);
		''').append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «plname»);
		''').append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));''')
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout) appendable1 = appendable1.append('''
     	''')
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDEllipse element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = "element"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable1 = appendable.append('''
		''').append(ellipseType).append(''' «attname» = gaService.createEllipse(«parentName»);
		''').append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram));
		gaService.setLocationAndSize(«attname», «element.layout.common.xcor+x», «element.layout.common.ycor+y», «element.layout.common.width», «element.layout.common.heigth»);''')  appendable1 = appendable1.newLine
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout) appendable1 = appendable1.append('''
     	''')
     	appendable1
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable appendable, CDText element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val editingname = "deinfo"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable1 = appendable.append('''
		decorator.setActive(true);''')
		if (element.texttype == TextType::DEFAULT) {
		appendable1 = appendable1.append(textType).append(''' «attname» = gaService.createText(«parentName»);''')
		} else {
		appendable1 = appendable1.append(multiTextType).append(''' «attname» = gaService.createMultiText(«parentName»);''')
		}
		appendable1 = appendable1.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;
		«attname».setStyle(style.getStyle(diagram)); ''').newLine.append('''
		«attname».setForeground(style.getFontColor(diagram)); ''').newLine.append('''
		gaService.setLocationAndSize(«attname», «x+element.layout.common.xcor», «y+element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»); ''').newLine.append('''
		«attname».setHorizontalAlignment(''').append(orientationType).append('''.«element.layout.HAlign.mapAlignment»); ''').newLine.append('''
		«attname».setVerticalAlignment(''').append(orientationType).append('''.«element.layout.VAlign.mapAlignment»); ''').newLine.append('''
		«attname».setValue(""); ''').newLine.append('''
		peService.setPropertyValue(«attname», ''').append(iSprayConstantsType).append('''.TEXT_ID, «textIds».«element.body.value».name()); ''').newLine.append('''
		''').append(iDirectEditingInfoType).append(''' «editingname» = getFeatureProvider().getDirectEditingInfo(); ''').newLine.append('''
		«editingname».setMainPictogramElement(newConnection); ''').newLine.append('''
		«editingname».setPictogramElement(decorator); ''').newLine.append('''
		«editingname».setGraphicsAlgorithm(«attname»);''')
		connectionStyleGenerator.current = element.layout.layout
		appendable1 = appendable1.generateStyleForConnection(attname, element.layout.layout) appendable1 = appendable1.append('''
     	''')
     	appendable1
	}
	
		def private packageName() { "org.eclipselabs.spray.shapes" }
	def private className(ConnectionDefinition c) { c.name.toFirstUpper }
	
	def textIds() {
		packageName + "." + connectionDefinition.className + "TextIds"
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

	def ITreeAppendable createPointList(ITreeAppendable appendable, EList<org.eclipselabs.spray.shapes.shapes.Point> pointlist, String plname, Integer x, Integer y) {
		appendable.append('''
		''').append(listType).append('''<''').append(pointType).append('''> «plname» = new ''').append(arrayListType).append('''<''').append(pointType).append('''>();
		«FOR point: pointlist»
			«plname».add(gaService.createPoint(«point.xcor+x», «point.ycor+y», «point.curveBefore», «point.curveAfter»));
		«ENDFOR»
		''')
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