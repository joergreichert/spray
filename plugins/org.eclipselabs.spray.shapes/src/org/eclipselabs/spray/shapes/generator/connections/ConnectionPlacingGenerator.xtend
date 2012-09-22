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
import org.eclipse.xtext.EcoreUtil2

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
	
	def ITreeAppendable generatePlacing(ITreeAppendable givenAppendable, PlacingDefinition pd) {
		var appendable = givenAppendable.append('''{''').newLine
		appendable = appendable.increaseIndentation.newLine
			appendable = appendable.append(connectionDecoratorType).append(''' decorator = peCreateService.createConnectionDecorator(''')
				.append('''newConnection, false, «pd.offset», true);''').newLine
			if(pd.shapeCon != null) {
				appendable = appendable.createElement(pd.shapeCon, "decorator", "sprayStyle", pd.angle, pd.distance).newLine
			}
			appendable = appendable.decreaseIndentation
		appendable = appendable.append('''}''')
		appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDLine element, String parentName, String shapeStyle, Integer angle, Integer distance) {
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)		
		var appendable = givenAppendable.createPointList(element.layout.point, plname, x, y).newLine
		appendable = appendable.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «plname»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram));''').newLine
		if(element.layout?.layout != null) {
			connectionStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
		}
     	appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDRectangle element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable = givenAppendable.append('''{''').newLine
		appendable = appendable.increaseIndentation.newLine
			appendable = appendable.append('''// As Graphiti doesn´t allow rectangles, creating rectangle as polygon''').newLine
			appendable = appendable.append(listType).append('''<''').append(pointType).append('''> «plname» = new ''')
				.append(arrayListType).append('''<''').append(pointType).append('''>();''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor», 0, 0));''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor», 0, 0));''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», «y+element.layout.common.ycor+element.layout.common.heigth», 0, 0));''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor», «y+element.layout.common.ycor+element.layout.common.heigth», 0, 0));''').newLine
			appendable = appendable.append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «plname»);''').newLine
			appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
			appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram));''').newLine
			if(element.layout?.layout != null) {
				connectionStyleGenerator.current = element.layout.layout
				appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
			}
			appendable = appendable.decreaseIndentation
		appendable = givenAppendable.append('''}''')
     	appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDPolygon element, String parentName, String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable = givenAppendable.createPointList(element.layout.point, plname,x,y).newLine
		appendable = appendable.append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «plname»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram));''')
		if(element.layout?.layout != null) {
			connectionStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
		}
     	appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDPolyline element, String parentName, 
		String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable = givenAppendable.createPointList(element.layout.point, plname, x, y).newLine
		appendable = appendable.append(polylineType).append(''' «attname» = gaService.createPolyline(«parentName», «plname»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram));''').newLine
		if(element.layout?.layout != null) {
			connectionStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
		}
     	appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDRoundedRectangle element, String parentName, 
		String shapeStyle, Integer angle, Integer distance) { 
		val attname = "element"
		val plname = "pointList"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable = givenAppendable.append('''{''').newLine
		appendable = appendable.increaseIndentation
			appendable = appendable.append('''// As Graphiti doesn´t allow rectangles, creating rounded rectangle as curved polygon''').newLine
			appendable = appendable.append(listType).append('''<''').append(pointType).append('''> «plname» = new ''')
				.append(arrayListType).append('''<''').append(pointType).append('''>();''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor», ''')
				.append('''«y+element.layout.common.ycor», «element.layout.curveHeight», «element.layout.curveWidth»));''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», ''')
				.append('''«y+element.layout.common.ycor», «element.layout.curveWidth», «element.layout.curveHeight»);''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor+element.layout.common.width», ''')
				.append('''«y+element.layout.common.ycor+element.layout.common.heigth», «element.layout.curveHeight», «element.layout.curveWidth»);''').newLine
			appendable = appendable.append('''«plname».add(gaService.createPoint(«x+element.layout.common.xcor», ''')
				.append('''«y+element.layout.common.ycor+element.layout.common.heigth», «element.layout.curveWidth», «element.layout.curveHeight»);''').newLine
			appendable = appendable.append(polygonType).append(''' «attname» = gaService.createPolygon(«parentName», «plname»);''').newLine
			appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
			appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram));''').newLine
			if(element.layout?.layout != null) {
				connectionStyleGenerator.current = element.layout.layout
				appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
			}
			appendable = appendable.decreaseIndentation
		appendable = givenAppendable.append('''}''')
     	appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDEllipse element, String parentName, 
		String shapeStyle, Integer angle, Integer distance) {
		val attname = "element"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable = givenAppendable.append(ellipseType).append(''' «attname» = gaService.createEllipse(«parentName»);''').newLine
		appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram));''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», «element.layout.common.xcor+x», ''')
			.append('''«element.layout.common.ycor+y», «element.layout.common.width», «element.layout.common.heigth»);''').newLine
		if(element.layout?.layout != null) {	
			connectionStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
		}
     	appendable
	}
	
	def dispatch ITreeAppendable createElement(ITreeAppendable givenAppendable, CDText element, String parentName, String shapeStyle, 
		Integer angle, Integer distance) { 
		val attname = "element"
		val editingname = "deinfo"
		var x = getXPositionforAngle(distance, angle)
		var y = getYPositionforAngle(distance, angle)
		var appendable = givenAppendable.append('''decorator.setActive(true);''').newLine
		if (element.texttype == TextType::DEFAULT) {
			appendable = appendable.append(textType).append(''' «attname» = gaService.createText(«parentName»);''').newLine
		} else {
			appendable = appendable.append(multiTextType).append(''' «attname» = gaService.createMultiText(«parentName»);''').newLine
		}
		appendable = appendable.append(iSprayStyleType).append(''' style = «element.style.styleForElement(shapeStyle)»;''').newLine
		appendable = appendable.append('''«attname».setStyle(style.getStyle(diagram)); ''').newLine
		appendable = appendable.append('''«attname».setForeground(style.getFontColor(diagram)); ''').newLine
		appendable = appendable.append('''gaService.setLocationAndSize(«attname», «x+element.layout.common.xcor», «y+element.layout.common.ycor», ''')
			.append('''«element.layout.common.width», «element.layout.common.heigth»); ''').newLine
		appendable = appendable.append('''«attname».setHorizontalAlignment(''').append(orientationType)
			.append('''.«element.layout.HAlign.mapAlignment»);''').newLine
		appendable = appendable.append('''«attname».setVerticalAlignment(''').append(orientationType)
			.append('''.«element.layout.VAlign.mapAlignment»); ''').newLine
		appendable = appendable.append('''«attname».setValue(""); ''').newLine
		appendable = appendable.append('''peService.setPropertyValue(«attname», ''').append(iSprayConstantsType)
			.append('''.TEXT_ID, «element.textIds».«element.body.value».name()); ''').newLine
		appendable = appendable.append(iDirectEditingInfoType)
			.append(''' «editingname» = getFeatureProvider().getDirectEditingInfo(); ''').newLine
		appendable = appendable.append('''«editingname».setMainPictogramElement(newConnection); ''').newLine
		appendable = appendable.append('''«editingname».setPictogramElement(decorator); ''').newLine
		appendable = appendable.append('''«editingname».setGraphicsAlgorithm(«attname»);''').newLine
		if(element.layout?.layout != null) {
			connectionStyleGenerator.current = element.layout.layout
			appendable = appendable.generateStyleForConnection(attname, element.layout.layout).newLine
		}
     	appendable
	}
	
	def private packageName() { "org.eclipselabs.spray.shapes" }
	def private className(ConnectionDefinition c) { c.name.toFirstUpper }
	
	def textIds(CDText text) {
		val container = EcoreUtil2::getContainerOfType(text, typeof(ConnectionDefinition))
		packageName + "." + (if(container != null) container else connectionDefinition).className + "TextIds"
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

	def ITreeAppendable createPointList(ITreeAppendable givenAppendable, EList<org.eclipselabs.spray.shapes.shapes.Point> pointlist, 
			String plname, Integer x, Integer y) {
		var appendable = givenAppendable.append(listType).append('''<''').append(pointType).append('''> «plname» = new ''')
			.append(arrayListType).append('''<''').append(pointType).append('''>();''').newLine
		for (point: pointlist) {
			appendable = appendable.append('''«plname».add(gaService.createPoint(«point.xcor+x», «point.ycor+y», «point.curveBefore», «point.curveAfter»));''')
		}
		appendable
	}
	
	def styleForElement(ShapeStyleRef s, String styleName) {
		if(s != null) {
			'''new «s.style.qualifiedName»()'''
		} else {
			styleName
		}
	}
	
	def getXPositionforAngle(Integer distance, Integer angle) {
		// special cases 0/90/180/270/>=360
		if(angle == 90 || angle == 270) {
			0
		} else if(angle == 180) {
			-distance
		} else if(angle == 0 || angle >= 360) {
			distance
		} else if(angle < 90) { // quadrant 1
			var posx = (Math::cos(Math::toRadians(angle))*distance).intValue
			posx
		} else if(angle < 180) { // quadrant 2
			var newangle = 180 - angle
			var posx = (Math::cos(Math::toRadians(newangle))*distance).intValue
			posx * -1
		} else if (angle < 270) { // quadrant 3
			var newangle1 = angle - 180
			var posx = (Math::cos(Math::toRadians(newangle1))*distance).intValue
			posx * -1
		} else if (angle < 360) { // quadrant 4
			var newangle = 360 - angle
			var posx = (Math::cos(Math::toRadians(newangle))*distance).intValue
			posx
		}
	}
	
	def getYPositionforAngle(Integer distance, Integer angle) {
		// special cases 0/90/180/270/>=360
		if(angle == 90) {
			-distance
		} else if(angle == 0 || angle == 180 || angle >= 360) {
			0
		} else if(angle == 270) {
			distance
		} else if(angle < 90) { // quadrant 1
			var posy = (Math::sin(Math::toRadians(angle))*distance).intValue
			posy * -1
		} else if(angle < 180) { // quadrant 2
			var newangle = 180 - angle
			var posy = (Math::sin(Math::toRadians(newangle))*distance).intValue
			posy * -1
		} else if (angle < 270) { // quadrant 3
			var newangle1 = angle - 180
			var posy = (Math::sin(Math::toRadians(newangle1))*distance).intValue
			posy
		} else if (angle < 360) { // quadrant 4
			var newangle = 360 - angle
			var posy = (Math::sin(Math::toRadians(newangle))*distance).intValue
			posy
		}
	}
}