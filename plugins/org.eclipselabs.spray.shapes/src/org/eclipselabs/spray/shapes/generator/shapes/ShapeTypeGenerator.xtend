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

class ShapeTypeGenerator {
	
	@Inject extension ShapeTypeStyleGenerator
	@Inject extension ShapeSizeCalculator
	
	int element_index
	int plcount
	
	def generateCascadedElements(ShapeDefinition shapeDef) {
		element_index = -1
		plcount = 0
		var sizeMap = shapeDef.getContainerSize
		var containername = "containerShape"
		var attname = nextAttributeName
		var attname2 = attname
		if(shapeDef.shape.size > 1) {
			attname2 = nextAttributeName
		}
		'''
		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(«containername»);
		directEditingInfo.setPictogramElement(«containername»);
		
		GraphicsAlgorithm «attname» = gaService.createInvisibleRectangle(«containername»);
		«attname».setStyle(sprayStyle.getStyle(diagram));
		SprayLayoutService.setShapeFromDsl(«containername», true);
		gaService.setLocationAndSize(«attname», 0, 0, «sizeMap.width», «sizeMap.heigth + 20»);
		
		«IF shapeDef.shape.size > 1»
		// Invisible rectangle around the elements (because more then one element is on first layer).
		ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);
		SprayLayoutService.setId(invisibleShape, "invisibleShape");
		GraphicsAlgorithm «attname2» = gaService.createRectangle(invisibleShape);
		«attname2».setStyle(sprayStyle.getStyle(diagram));
		«attname2».setFilled(false);
		«attname2».setLineVisible(false);
		gaService.setLocationAndSize(«attname2», 0, 0, «sizeMap.width», «sizeMap.heigth»);
		«ENDIF»
		«FOR element : shapeDef.shape»
		«element.createElement(containername, "sprayStyle")»
		«ENDFOR»
		
		«shapeDef.description?.generateDescription(containername, "sprayStyle", sizeMap.heigth, sizeMap.width)»
		
		// Set start values for height and width as properties on the element for Layout Feature
		SprayLayoutManager.setSizePictogramProperties(«containername»);
		'''
	}
	
	def recursiveCreation(EList<Shape> shapeList, String attname, String shapeStyle) {	
		'''
		// start RECURSIVEcREATION «attname»
		«FOR element : shapeList»
		«element.createElement(attname,shapeStyle)»
      	«ENDFOR»
		// end RECURSIVEcREATION «attname»
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
		val gaName = nextAttributeName
		val shapeName = nextAttributeName
		val pointListName = nextPointListName
		'''
		«createPointList(element.layout.point, pointListName)»
		Shape «shapeName» = peCreateService.createShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Polyline «gaName» = gaService.createPolyline(«shapeName», «pointListName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«gaName».setStyle(style_«element_index».getStyle(diagram));
		«generateStyleForElement(gaName, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(Rectangle element, String parentName, String shapeStyle) { 
		val shapeName = nextShapeName
		val ganame = nextGaName
		'''
		// start createElement Rectangle parent «parentName»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Rectangle «ganame» = gaService.createRectangle(«shapeName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«ganame».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«ganame», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(ganame, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, "style_"+element_index)»
		// end createElement Rectangle parent «parentName»
     	'''
	}
	
	def dispatch createElement(Polygon element, String parentName, String shapeStyle) { 
		val shapeName = nextShapeName
		val gaName = nextGaName
		val pointListName = nextPointListName
		'''
		«createPointList(element.layout.point, pointListName)»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Polygon «gaName» = gaService.createPolygon(«shapeName», «pointListName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«gaName».setStyle(style_«element_index».getStyle(diagram));
		«generateStyleForElement(gaName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, "style_"+element_index)»
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
		val shapeName = nextShapeName
		val gaName = nextGaName
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		RoundedRectangle «gaName» = gaService.createRoundedRectangle(«shapeName», «element.layout.curveWidth», «element.layout.curveHeight»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«gaName».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«gaName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(gaName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Ellipse element, String parentName, String shapeStyle) {
		val shapeName = nextShapeName
		val gaName = nextGaName
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Ellipse «gaName» = gaService.createEllipse(«shapeName»);
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«gaName».setStyle(style_«element_index».getStyle(diagram));
		gaService.setLocationAndSize(«gaName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(gaName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, "style_"+element_index)»
     	'''
	}
	
	def dispatch createElement(Text element, String parentName, String shapeStyle) { 
		val shapeName = nextShapeName
		val gaName = nextGaName
		'''
		// start createElement Text parent «parentName»
		Shape «shapeName» = peCreateService.createShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		«IF element.texttype == TextType::DEFAULT»
		Text «gaName» = gaService.createText(«shapeName»);
		«ELSE»
		MultiText «gaName» = gaService.createMultiText(«shapeName»);
		«ENDIF»
		ISprayStyle style_«element_index» = «element.style.styleForElement(shapeStyle)»;
		«gaName».setStyle(style_«element_index».getStyle(diagram));
		«gaName».setForeground(style_«element_index».getFontColor(diagram));
		gaService.setLocationAndSize(«gaName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«gaName».setHorizontalAlignment(Orientation.«element.layout.HAlign.mapAlignment»);
		«gaName».setVerticalAlignment(Orientation.«element.layout.VAlign.mapAlignment»);
		peService.setPropertyValue(«gaName», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
		peService.setPropertyValue(«shapeName», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
		«gaName».setValue("");
		«generateStyleForElement(gaName, element.layout.layout)»
		getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(«gaName»);
		// END createElement Text parent «parentName»
     	'''
	}

	def generateDescription(Description d, String containerName, String styleName, int y, int width) {
		val shapeName = nextAttributeName
		val attname = nextAttributeName
		'''
		Shape «shapeName» = peCreateService.createShape(«containerName», false);
		Text «attname» = gaService.createText(«shapeName»);
		ISprayStyle style_«element_index» = «d.style.styleForElement(styleName)»;
		«attname».setStyle(style_«element_index».getStyle(diagram));
		«attname».setForeground(style_«element_index».getFontColor(diagram));
		gaService.setLocationAndSize(«attname», 0, «y», «width», 20);
		«attname».setHorizontalAlignment(Orientation.«d.HAlign.mapAlignment»);
		«attname».setVerticalAlignment(Orientation.«d.VAlign.mapAlignment»);
		peService.setPropertyValue(«attname», ISprayConstants.TEXT_ID, TextIds.«d.body.value».name());
		«attname».setValue("");
		directEditingInfo.setPictogramElement(«shapeName»);
		directEditingInfo.setGraphicsAlgorithm(«attname»);
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

	def nextShapeName() {
		element_index = element_index + 1;
		"shape_" + element_index
	}
	
	def nextGaName() {
		element_index = element_index + 1;
		"ga_" + element_index
	}
	
	def nextPointListName() {
		plcount = plcount + 1;
		"pointList_" + plcount 
	}
	
}