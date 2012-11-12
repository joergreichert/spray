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
import org.eclipselabs.spray.shapes.shapes.CompartmentRectangle
import org.eclipselabs.spray.shapes.shapes.CompartmentEllipse 

class ShapeTypeGenerator {
	
	@Inject extension ShapeTypeStyleGenerator
	@Inject extension ShapeSizeCalculator
	
	int element_index
	ShapeDefinition sh
	

	def generateSetSizeAndlocation(String shapeName, String elementName, int x, int y, int width, int height)
	'''
		gaService.setLocationAndSize(«elementName», «x», «y», «width», «height»);
		SprayLayoutService.setLayoutData(«shapeName», «width», «height», true);
	'''

	def generateCascadedElements(ShapeDefinition shapeDef) {
		sh = shapeDef
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
		gaService.setLocationAndSize(«elementName1», 0, 0, «sizeMap.width», «sizeMap.heigth»);
		
		«IF shapeDef.shape.size > 1»
		// Invisible rectangle around the elements (because more then one element is on first layer).
		ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);
		SprayLayoutService.setId(invisibleShape, "«sh.name».invisibleShape");
		SprayLayoutType «layoutName» = SprayLayoutType.TOP;
		SprayLayoutService.setLayoutManager(«containername», «layoutName», 0, 0);

		GraphicsAlgorithm «elementName2» = gaService.createRectangle(invisibleShape);
		«elementName2».setStyle(sprayStyle.getStyle(diagram));
		«elementName2».setFilled(false);
		«elementName2».setLineVisible(false);
		gaService.setLocationAndSize(«elementName2», 0, 0, «sizeMap.width», «sizeMap.heigth»);
		«ENDIF»
		«FOR element : shapeDef.shape»
		«element.createElement(containername, "sprayStyle", true)»
		«ENDFOR»
		
		«shapeDef.description?.generateDescription(containername, "sprayStyle", sizeMap.heigth, sizeMap.width)»
		
		// Set start values for height and width as properties on the element for Layout Feature
		SprayLayoutManager.setSizePictogramProperties(«containername»);
		'''
	}
	
	def recursiveCreation(EList<Shape> shapeList, String elementName, String shapeStyle, boolean flexible) {	
		'''
		// start RECURSIVEcREATION «elementName»
		
		«FOR element : shapeList»
		«element.createElement(elementName,shapeStyle, flexible)»
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
	
	def dispatch createElement(Line element, String parentName, String shapeStyle, boolean flexible) {
		nextIndex
		'''
		«createPointList(element.layout.point, pointListName)»
		Shape «shapeName» = peCreateService.createShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		Polyline «elementName» = gaService.createPolyline(«shapeName», «pointListName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateStyleForElement(elementName, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(Rectangle element, String parentName, String shapeStyle, boolean flexible) { 
		nextIndex
		val isCompartment = (element.compartmentInfo != null)
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», «isCompartment»);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		SprayLayoutService.setCompartment(«shapeName», «isCompartment»);
		«IF element?.compartmentInfo?.id != null»
		GraphitiProperties.set(«shapeName», ISprayConstants.TEXT_ID, "«element.compartmentInfo.id.value»");
		«ENDIF»
		«IF element?.compartmentInfo?.compartmentLayout != null »
		SprayLayoutType «layoutName» = SprayLayoutType.«element.compartmentInfo.compartmentLayout.name»;
		SprayLayoutService.setLayoutManager(«shapeName», «layoutName», «element.compartmentInfo.margin», «element.compartmentInfo.spacing», «flexible»);
		SprayLayoutService.setLayoutData(«shapeName», «element.layout.common.width», «element.layout.common.heigth»);
		«ENDIF»
		«IF element?.compartmentInfo?.stretchH != null »
		SprayLayoutService.getLayoutData(«shapeName»).setHorizontalStrechable(«element.compartmentInfo.stretchH»);
		«ENDIF»
		Rectangle «elementName» = gaService.createRectangle(«shapeName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor, element.layout.common.width, element.layout.common.heigth)»
		«generateStyleForElement(elementName, element.layout.layout)»
		«IF isCompartment && element.compartmentInfo.invisible»
		«elementName».setFilled(false);
		«elementName».setLineVisible(false);
		«ENDIF»
		«var boolean childFlexible = isCompartment && (!element?.compartmentInfo?.compartmentLayout?.name.equalsIgnoreCase("fixed"))» 
		«element.shape.recursiveCreation(shapeName, styleName, childFlexible)»
     	'''
	}
	
	def dispatch createElement(Ellipse element, String parentName, String shapeStyle, boolean flexible) {
		nextIndex
		val isCompartment = (element.compartmentInfo != null)
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», «isCompartment»);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		SprayLayoutService.setCompartment(«shapeName», «isCompartment»);
		«IF element?.compartmentInfo?.id != null»
		GraphitiProperties.set(«shapeName», ISprayConstants.TEXT_ID, "«element.compartmentInfo.id.value»");
		«ENDIF»
		«IF element?.compartmentInfo?.compartmentLayout != null »
		SprayLayoutType «layoutName» = SprayLayoutType.«element.compartmentInfo.compartmentLayout.name»;
		SprayLayoutService.setLayoutManager(«shapeName», «layoutName», «element.compartmentInfo.margin», «element.compartmentInfo.spacing», «flexible»);
		SprayLayoutService.setLayoutData(«shapeName», «element.layout.common.width», «element.layout.common.heigth»);
		«ENDIF»
		«IF element?.compartmentInfo?.stretchH != null »
		SprayLayoutService.getLayoutData(«shapeName»).setHorizontalStrechable(«element.compartmentInfo.stretchH»);
		«ENDIF»

		Ellipse «elementName» = gaService.createEllipse(«shapeName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor, element.layout.common.width, element.layout.common.heigth)»
		«generateStyleForElement(elementName, element.layout.layout)»
		«IF isCompartment && element.compartmentInfo.invisible»
		«elementName».setFilled(false);
		«elementName».setLineVisible(false);
		«ENDIF»
		«var boolean childFlexible = isCompartment && (!element?.compartmentInfo?.compartmentLayout?.name.equalsIgnoreCase("fixed"))» 
		«element.shape.recursiveCreation(shapeName, styleName, childFlexible)»
     	'''
	}
	
//	def dispatch createElement(Compartment element, String parentName, String shapeStyle) { 
//		nextIndex
//		'''
//		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», true);
//		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
//		SprayLayoutService.setCompartment(«shapeName», true);
//		GraphitiProperties.set(«shapeName», ISprayConstants.TEXT_ID, "«element.shape.id.value»");
//		SprayLayoutType «layoutName» = SprayLayoutType.«element.compartmentLayout.name»;
//		SprayLayoutService.setLayoutManager(«shapeName», «layoutName», 5, 5);
//		«IF element.shape instanceof CompartmentRectangle»
//		Rectangle «elementName» = gaService.createRectangle(«shapeName»);
//		«ELSEIF element.shape instanceof CompartmentEllipse»
//		Ellipse «elementName» = gaService.createEllipse(«shapeName»);
//        «ENDIF»
//«««		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
//«««		«elementName».setStyle(«styleName».getStyle(diagram));
//		«generateSetSizeAndlocation(shapeName, elementName, element.shape.layout.common.xcor, element.shape.layout.common.ycor, element.shape.layout.common.width, element.shape.layout.common.heigth)»
//		«elementName».setLineVisible(false);
//		«elementName».setFilled(false);
//     	'''
//	}

	def dispatch createElement(Polygon element, String parentName, String shapeStyle, boolean flexible) { 
		nextIndex
		'''
		«createPointList(element.layout.point, pointListName)»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		Polygon «elementName» = gaService.createPolygon(«shapeName», «pointListName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateStyleForElement(elementName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, styleName, false)»
     	'''
	}
	
	def dispatch createElement(Polyline element, String parentName, String shapeStyle, boolean flexible) { 
		nextIndex
		'''
		«createPointList(element.layout.point, pointListName)»
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		Polyline «elementName» = gaService.createPolyline(«shapeName», «pointListName»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateStyleForElement(elementName, element.layout.layout)»
     	'''
	}
	
	def dispatch createElement(RoundedRectangle element, String parentName, String shapeStyle, boolean flexible) { 
		nextIndex
		'''
		ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		RoundedRectangle «elementName» = gaService.createRoundedRectangle(«shapeName», «element.layout.curveWidth», «element.layout.curveHeight»);
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor, element.layout.common.width, element.layout.common.heigth)»
		«generateStyleForElement(elementName, element.layout.layout)»
		«element.shape.recursiveCreation(shapeName, styleName, false)»
     	'''
	}
	
	def dispatch createElement(Text element, String parentName, String shapeStyle, boolean flexible) { 
		nextIndex
		'''
		Shape «shapeName» = peCreateService.createShape(«parentName», false);
		SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
		«IF element.texttype == TextType::DEFAULT»
		Text «elementName» = gaService.createText(«shapeName»);
		«ELSE»
		MultiText «elementName» = gaService.createMultiText(«shapeName»);
		«ENDIF»
		SprayAbstractLayoutManager.setDefaultTextAttributes(diagram, «elementName», "<<dummy>>") ;
		ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
		«elementName».setStyle(«styleName».getStyle(diagram));
		«elementName».setForeground(«styleName».getFontColor(diagram));
		«elementName».setFont(«styleName».getStyle(diagram).getFont());
		«generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor, element.layout.common.width, element.layout.common.heigth)»
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

	def layoutName() {
		"layout_" + element_index
	}

	def pointListName() {
		"pointList_" + element_index
	}

	def nextIndex() {
		element_index = element_index + 1;
	}
		
}