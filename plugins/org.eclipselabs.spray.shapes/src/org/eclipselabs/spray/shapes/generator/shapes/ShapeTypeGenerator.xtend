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
	
	def generateCascadedElements(ShapeDefinition s) {
		element_index = -1
		plcount = 0
		var sizeMap = s.getContainerSize
		var containername = "containerShape"
		var attname = nextAttributeName
		var attname2 = attname
		if(s.shape.size > 1) {
			attname2 = nextAttributeName
		}
		'''
		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(«containername»);
		directEditingInfo.setPictogramElement(«containername»);
		
		GraphicsAlgorithm «attname» = gaService.createInvisibleRectangle(«containername»);
		«attname».setStyle(sprayStyle.getStyle(diagram));
		peService.setPropertyValue(«attname», ISprayShapeConstants.IS_SHAPE_FROM_DSL, ISprayShapeConstants.IS_SHAPE_FROM_DSL_VALUE);
		gaService.setLocationAndSize(«attname», 0, 0, «sizeMap.width», «sizeMap.heigth + 20»);
		
		«IF s.shape.size > 1»
		// Invisible rectangle around the elements (because more then one element is on first layer).
		GraphicsAlgorithm «attname2» = gaService.createRectangle(«attname»);
		«attname2».setStyle(sprayStyle.getStyle(diagram));
		«attname2».setFilled(false);
		«attname2».setLineVisible(false);
		gaService.setLocationAndSize(«attname2», 0, 0, «sizeMap.width», «sizeMap.heigth»);
		«ENDIF»
		«FOR element : s.shape»
		«element.createElement(attname2, "sprayStyle")»
		«ENDFOR»
		
		«s.description?.generateDescription(containername, "sprayStyle", sizeMap.heigth, sizeMap.width)»
		
		// Set start values for height and width as properties on the element for Layout Feature
		SprayLayoutManager.setSizePictogramProperties(«containername»);
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
		peService.setPropertyValue(«attname», ISprayShapeConstants.TEXT_ID, TextIds.«element.body.value».name());
		«attname».setValue("");
		«generateStyleForElement(attname, element.layout.layout)»
		getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(«attname»);
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
		«attname».setForeground(style_1.getFontColor(diagram));
		gaService.setLocationAndSize(«attname», 0, «y», «width», 20);
		«attname».setHorizontalAlignment(Orientation.«d.HAlign.mapAlignment»);
		«attname».setVerticalAlignment(Orientation.«d.VAlign.mapAlignment»);
		peService.setPropertyValue(«attname», ISprayShapeConstants.TEXT_ID, TextIds.«d.body.value».name());
		«attname».setValue("");
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
	
	def nextPointListName() {
		plcount = plcount + 1;
		"pointList_" + plcount 
	}
	
}