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
import org.eclipselabs.spray.shapes.shapes.Compartment 

class ShapeTypeGenerator {
	
	@Inject extension ShapeTypeStyleGenerator
	@Inject extension ShapeSizeCalculator
	
	int element_index
	
	def generateCascadedElements(ShapeDefinition shapeDef) {
		element_index = 0
		var sizeMap = shapeDef.getContainerSize
		var containername = "containerShape"
		var elementName1 = elementName
		var elementName2 = ""
		if(shapeDef.shape.size > 1) {
			nextIndex
			elementName2 = elementName
		}
		'''
		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(«containername»);
		directEditingInfo.setPictogramElement(«containername»);
		
		GraphicsAlgorithm «elementName1» = gaService.createInvisibleRectangle(«containername»);
		«elementName1».setStyle(sprayStyle.getStyle(diagram));
		SprayLayoutService.setShapeFromDsl(«containername», true);
		gaService.setLocationAndSize(«elementName1», 0, 0, «sizeMap.width», «sizeMap.heigth + 20»);
		
		«IF shapeDef.shape.size > 1»
		// Invisible rectangle around the elements (because more then one element is on first layer).
		ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);
		SprayLayoutService.setId(invisibleShape, "invisibleShape");
		GraphicsAlgorithm «elementName2» = gaService.createRectangle(invisibleShape);
		«elementName2».setStyle(sprayStyle.getStyle(diagram));
		«elementName2».setFilled(false);
		«elementName2».setLineVisible(false);
		gaService.setLocationAndSize(«elementName2», 0, 0, «sizeMap.width», «sizeMap.heigth»);
		«ENDIF»
		«FOR element : shapeDef.shape»
		«element.createElement(containername, "sprayStyle")»
		«ENDFOR»
		
		«shapeDef.description?.generateDescription(containername, "sprayStyle", sizeMap.heigth, sizeMap.width)»
		
		// Set start values for height and width as properties on the element for Layout Feature
		SprayLayoutManager.setSizePictogramProperties(«containername»);
		'''
	}
	
	def recursiveCreation(EList<Shape> shapeList, String elementName, String shapeStyle) {	
		'''
		// start RECURSIVEcREATION «elementName»
		«FOR element : shapeList»
		«element.createElement(elementName,shapeStyle)»
      	«ENDFOR»
		// end RECURSIVEcREATION «elementName»
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
		nextIndex
		'''
		«createPointList(element.layout.point, pointListName)»
		Shape «shapeName» = peCreateService.createShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Polyline «elementName» = gaService.createPolyline(«shapeName», «pointListName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateStyleForElement(elementName, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(Rectangle element, String parentName, String shapeStyle) { 
		nextIndex
		'''
		// start createElement Rectangle parent «parentName»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Rectangle «elementName» = gaService.createRectangle(«shapeName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		gaService.setLocationAndSize(«elementName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(elementName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, styleName)»
		// end createElement Rectangle parent «parentName»
     	'''
	}
	
	def dispatch createElement(Polygon element, String parentName, String shapeStyle) { 
		nextIndex
		'''
		«createPointList(element.layout.point, pointListName)»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Polygon «elementName» = gaService.createPolygon(«shapeName», «pointListName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateStyleForElement(elementName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, styleName)»
     	'''
	}
	
	def dispatch createElement(Polyline element, String parentName, String shapeStyle) { 
		nextIndex
		'''
		«createPointList(element.layout.point, pointListName)»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Polyline «elementName» = gaService.createPolyline(«shapeName», «pointListName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateStyleForElement(elementName, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(RoundedRectangle element, String parentName, String shapeStyle) { 
		nextIndex
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		RoundedRectangle «elementName» = gaService.createRoundedRectangle(«shapeName», «element.layout.curveWidth», «element.layout.curveHeight»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		gaService.setLocationAndSize(«elementName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(elementName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, styleName)»
     	'''
	}
	
	def dispatch createElement(Ellipse element, String parentName, String shapeStyle) {
		nextIndex
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		Ellipse «elementName» = gaService.createEllipse(«shapeName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		gaService.setLocationAndSize(«elementName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«generateStyleForElement(elementName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, styleName)»
     	'''
	}
	
	def dispatch createElement(Compartment element, String parentName, String shapeStyle) { 
		nextIndex
		'''
		// start createElement Compartment parent «parentName»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», true);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		SprayLayoutService.setCompartment(«shapeName», true);
		GraphitiProperties.set(«shapeName», ISprayConstants.TEXT_ID, "«element.body.value»");
		Rectangle «elementName» = gaService.createRectangle(«shapeName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		gaService.setLocationAndSize(«elementName», «element.common.xcor», «element.common.ycor», «element.common.width», «element.common.heigth»);
		«elementName».setLineVisible(false);
		«elementName».setFilled(false);
     	'''
	}
	def dispatch createElement(Text element, String parentName, String shapeStyle) { 
		nextIndex
		'''
		// start createElement Text parent «parentName»
		Shape «shapeName» = peCreateService.createShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«shapeName»");
		«IF element.texttype == TextType::DEFAULT»
		Text «elementName» = gaService.createText(«shapeName»);
		«ELSE»
		MultiText «elementName» = gaService.createMultiText(«shapeName»);
		«ENDIF»
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«elementName».setForeground(«styleName».getFontColor(diagram));
		gaService.setLocationAndSize(«elementName», «element.layout.common.xcor», «element.layout.common.ycor», «element.layout.common.width», «element.layout.common.heigth»);
		«elementName».setHorizontalAlignment(Orientation.«element.layout.HAlign.mapAlignment»);
		«elementName».setVerticalAlignment(Orientation.«element.layout.VAlign.mapAlignment»);
		peService.setPropertyValue(«elementName», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
		peService.setPropertyValue(«shapeName», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
		«elementName».setValue("");
		«generateStyleForElement(elementName, element.layout.layout)»
		getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(«elementName»);
		// END createElement Text parent «parentName»
     	'''
	}

	def generateDescription(Description d, String containerName, String parentStyleName, int y, int width) {
		nextIndex
		'''
		Shape «shapeName» = peCreateService.createShape(«containerName», false);
		Text «elementName» = gaService.createText(«shapeName»);
		ISprayStyle «styleName» = «d.style.styleForElement(parentStyleName)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«elementName».setForeground(«styleName».getFontColor(diagram));
		gaService.setLocationAndSize(«elementName», 0, «y», «width», 20);
		«elementName».setHorizontalAlignment(Orientation.«d.HAlign.mapAlignment»);
		«elementName».setVerticalAlignment(Orientation.«d.VAlign.mapAlignment»);
		peService.setPropertyValue(«elementName», ISprayConstants.TEXT_ID, TextIds.«d.body.value».name());
		«elementName».setValue("");
		directEditingInfo.setPictogramElement(«shapeName»);
		directEditingInfo.setGraphicsAlgorithm(«elementName»);
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
	
	def shapeName() {
		"shape_" + element_index
	}

	def elementName() {
		"element_" + element_index
	}

	def styleName() {
		"style_" + element_index
	}

	def pointListName() {
		"pointList_" + element_index
	}

	def nextIndex() {
		element_index = element_index + 1;
	}
		
}