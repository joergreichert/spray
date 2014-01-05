/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.shapes.generator.shapes

import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.shapes.Description
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.HAlign
import org.eclipselabs.spray.shapes.Line
import org.eclipselabs.spray.shapes.Point
import org.eclipselabs.spray.shapes.Polygon
import org.eclipselabs.spray.shapes.Polyline
import org.eclipselabs.spray.shapes.Rectangle
import org.eclipselabs.spray.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.Shape
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.ShapeStyleRef
import org.eclipselabs.spray.shapes.Text
import org.eclipselabs.spray.shapes.TextType
import org.eclipselabs.spray.shapes.VAlign
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator
import java.util.ArrayList
import java.util.List

class ShapeTypeGenerator {

    @Inject extension ShapeTypeStyleGenerator
    @Inject extension ShapeSizeCalculator

    int element_index
    ShapeDefinition sh
    List<CharSequence> methods

    def generateSetSizeAndlocation(String shapeName, String elementName, int x, int y, int width, int height) '''
        gaService.setLocationAndSize(«elementName», «x», «y», «width», «height»);
        SprayLayoutService.setLayoutData(«shapeName», «width», «height», true);
    '''

    def cascadedElementsMethodName() {
        "createCascadedElements"
    }

    def generateCascadedElementMethods(ShapeDefinition shapeDef, String containername) {
        sh = shapeDef
        element_index = 0
        var sizeMap = shapeDef.getContainerSize
        var elementName1 = elementName
        var elementName2 = ""
        if (shapeDef.shape.size > 1) {
            nextIndex
            elementName2 = elementName
        }
        methods = new ArrayList<CharSequence>()
        '''
            protected void «cascadedElementsMethodName»(Diagram diagram, ContainerShape «containername», ISprayStyle sprayStyle) {
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
                    
                    GraphicsAlgorithm «elementName2» = gaService.createPlainRectangle(invisibleShape);
                    «elementName2».setStyle(sprayStyle.getStyle(diagram));
                    «elementName2».setFilled(false);
                    «elementName2».setLineVisible(false);
                    gaService.setLocationAndSize(«elementName2», 0, 0, «sizeMap.width», «sizeMap.heigth»);
                «ENDIF»
                
                «FOR element : shapeDef.shape»
                    «element.createElementMethod(containername, "sprayStyle", true)»(diagram, «containername», sprayStyle);
                «ENDFOR»
                
                «shapeDef.description?.generateDescription(containername, "sprayStyle", sizeMap.heigth, sizeMap.width)»
                
                // Set start values for height and width as properties on the element for Layout Feature
                SprayLayoutManager.setSizePictogramProperties(«containername»);
            }
            
            «FOR method : methods»
                «method»
            «ENDFOR»
        '''
    }

    def recursiveCreation(EList<Shape> shapeList, String elementName, String shapeStyle, boolean flexible) '''
        «FOR element : shapeList»
            «element.createElementMethod(elementName, shapeStyle, flexible)»(diagram, «elementName», «shapeStyle»);
        «ENDFOR»
    '''

    def createPointList(EList<Point> pointlist, String plname) {
        '''
            List<Point> «plname» = new ArrayList<Point>();
            «FOR point : pointlist»
                «plname».add(gaService.createPoint(«point.xcor», «point.ycor», «point.curveBefore», «point.curveAfter»));
            «ENDFOR»
        '''
    }

    def String createElementMethod(Shape shape, String parentShape, String shapeStyle, boolean flexible) {
        nextIndex
        var methodName = '''create«elementName.toFirstUpper»'''
        methods.add(
            '''
                protected Shape «methodName»(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
                    «shape.createElement("parentShape", "sprayStyle", flexible)»
                }
            ''')

        // Return for method
        methodName
    }

    def dispatch createElement(Line element, String parentName, String shapeStyle, boolean flexible) {
        val shapeName = shapeName
        '''
            «createPointList(element.layout.point, pointListName)»
            Shape «shapeName» = peCreateService.createShape(«parentName», false);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            Polyline «elementName» = gaService.createPlainPolyline(«shapeName», «pointListName»);
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateStyleForElement(elementName, element.layout.layout)»
            return «shapeName»;
        '''
    }

    def dispatch createElement(Rectangle element, String parentName, String shapeStyle, boolean flexible) {
        val isCompartment = (element.compartmentInfo != null)
        val shapeName = shapeName
        '''
            ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», «isCompartment»);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            SprayLayoutService.setCompartment(«shapeName», «isCompartment»);
            «IF element?.compartmentInfo?.id != null»
                GraphitiProperties.set(«shapeName», ISprayConstants.TEXT_ID, "«element.compartmentInfo.id.value»");
            «ENDIF»
            «IF element?.compartmentInfo?.compartmentLayout != null»
                SprayLayoutType «layoutName» = SprayLayoutType.«element.compartmentInfo.compartmentLayout.getName»;
                SprayLayoutService.setLayoutManager(«shapeName», «layoutName», «element.compartmentInfo.margin», «element.
                compartmentInfo.spacing», «flexible»);
                SprayLayoutService.setLayoutData(«shapeName», «element.layout.common.width», «element.layout.common.
                heigth»);
            «ENDIF»
            «IF element?.compartmentInfo?.stretchH != null»
                SprayLayoutService.getLayoutData(«shapeName»).setHorizontalStrechable(«element.compartmentInfo.stretchH»);
            «ENDIF»
            Rectangle «elementName» = gaService.createPlainRectangle(«shapeName»);
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor,
                element.layout.common.width, element.layout.common.heigth)»
            «generateStyleForElement(elementName, element.layout.layout)»
            «IF isCompartment && element.compartmentInfo.invisible»
                «elementName».setFilled(false);
                «elementName».setLineVisible(false);
            «ENDIF»
            «var boolean childFlexible = isCompartment &&
                (!element?.compartmentInfo?.compartmentLayout?.getName.equalsIgnoreCase("fixed"))» 
            «element.shape.recursiveCreation(shapeName, styleName, childFlexible)»
            return «shapeName»;
        '''
    }

    def dispatch createElement(Ellipse element, String parentName, String shapeStyle, boolean flexible) {
        val isCompartment = (element.compartmentInfo != null)
        val shapeName = shapeName
        '''
            ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», «isCompartment»);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            SprayLayoutService.setCompartment(«shapeName», «isCompartment»);
            «IF element?.compartmentInfo?.id != null»
                GraphitiProperties.set(«shapeName», ISprayConstants.TEXT_ID, "«element.compartmentInfo.id.value»");
            «ENDIF»
            «IF element?.compartmentInfo?.compartmentLayout != null»
                SprayLayoutType «layoutName» = SprayLayoutType.«element.compartmentInfo.compartmentLayout.getName»;
                SprayLayoutService.setLayoutManager(«shapeName», «layoutName», «element.compartmentInfo.margin», «element.
                compartmentInfo.spacing», «flexible»);
                SprayLayoutService.setLayoutData(«shapeName», «element.layout.common.width», «element.layout.common.
                heigth»);
            «ENDIF»
            «IF element?.compartmentInfo?.stretchH != null»
                SprayLayoutService.getLayoutData(«shapeName»).setHorizontalStrechable(«element.compartmentInfo.stretchH»);
            «ENDIF»
            
            Ellipse «elementName» = gaService.createPlainEllipse(«shapeName»);
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor,
                element.layout.common.width, element.layout.common.heigth)»
            «generateStyleForElement(elementName, element.layout.layout)»
            «IF isCompartment && element.compartmentInfo.invisible»
                «elementName».setFilled(false);
                «elementName».setLineVisible(false);
            «ENDIF»
            «var boolean childFlexible = isCompartment &&
                (!element?.compartmentInfo?.compartmentLayout?.getName.equalsIgnoreCase("fixed"))» 
            «element.shape.recursiveCreation(shapeName, styleName, childFlexible)»
            return «shapeName»;
        '''
    }

    def dispatch createElement(Polygon element, String parentName, String shapeStyle, boolean flexible) {
        val shapeName = shapeName
        '''
            «createPointList(element.layout.point, pointListName)»
            ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            Polygon «elementName» = gaService.createPlainPolygon(«shapeName», «pointListName»);
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateStyleForElement(elementName, element.layout.layout)»
            IDimension «sizeName» = gaService.calculateSize(«elementName»);
            SprayLayoutManager.resizePolygon(«elementName», «sizeName», 1, 1);
            gaService.setLocationAndSize(«elementName», «elementName».getX(), «elementName».getY(), «sizeName».getWidth(), «sizeName».getHeight());
            SprayLayoutService.setLayoutData(«shapeName», «sizeName».getWidth(), «sizeName».getHeight(), true);
            «element.shape.recursiveCreation(shapeName, styleName, false)»
            return «shapeName»;
        '''
    }

    def dispatch createElement(Polyline element, String parentName, String shapeStyle, boolean flexible) {
        val shapeName = shapeName
        '''
            «createPointList(element.layout.point, pointListName)»
            ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            Polyline «elementName» = gaService.createPlainPolyline(«shapeName», «pointListName»);
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateStyleForElement(elementName, element.layout.layout)»
            return «shapeName»;
        '''
    }

    def dispatch createElement(RoundedRectangle element, String parentName, String shapeStyle, boolean flexible) {
        val shapeName = shapeName
        '''
            ContainerShape «shapeName» = peCreateService.createContainerShape(«parentName», false);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            RoundedRectangle «elementName» = gaService.createPlainRoundedRectangle(«shapeName», «element.layout.
                curveWidth», «element.layout.curveHeight»);
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor,
                element.layout.common.width, element.layout.common.heigth)»
            «generateStyleForElement(elementName, element.layout.layout)»
            «element.shape.recursiveCreation(shapeName, styleName, false)»
            return «shapeName»;
        '''
    }

    def dispatch createElement(Text element, String parentName, String shapeStyle, boolean flexible) {
        val shapeName = shapeName
        '''
            Shape «shapeName» = peCreateService.createShape(«parentName», false);
            SprayLayoutService.setId(«shapeName», "«sh.name».«shapeName»");
            «IF element.texttype == TextType::DEFAULT»
                Text «elementName» = gaService.createPlainText(«shapeName»);
            «ELSE»
                MultiText «elementName» = gaService.createPlainMultiText(«shapeName»);
            «ENDIF»
            ISprayStyle «styleName» = «element.style.styleForElement(shapeStyle)»;
            «elementName».setStyle(«styleName».getStyle(diagram));
            «generateSetSizeAndlocation(shapeName, elementName, element.layout.common.xcor, element.layout.common.ycor,
                element.layout.common.width, element.layout.common.heigth)»
            «elementName».setHorizontalAlignment(Orientation.«element.layout.HAlign.mapAlignment»);
            «elementName».setVerticalAlignment(Orientation.«element.layout.VAlign.mapAlignment»);
            peService.setPropertyValue(«elementName», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
            peService.setPropertyValue(«shapeName», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
            «elementName».setValue("");
            «generateStyleForElement(elementName, element.layout.layout)»
            getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(«elementName»);
            return «shapeName»;
        '''
    }

    def generateDescription(Description d, String containerName, String parentStyleName, int y, int width) {
        val shapeName = shapeName
        '''
            Shape «shapeName» = peCreateService.createShape(«containerName», false);
            Text «elementName» = gaService.createPlainText(«shapeName»);
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

    def styleForElement(ShapeStyleRef s, String styleName) {
        if (s != null) {
            if (s.javaStyle != null) {
                return '''new «s.javaStyle.qualifiedName»()'''
            } else if (s.dslStyle != null) {
                return '''new «ProjectProperties::stylesPackage».«s.dslStyle.name.toFirstUpper»()'''
            }
        } else {
            return styleName
        }
    }

    def shapeName() {
        "shape_" + element_index
    }

    def sizeName() {
        "size_" + element_index
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
