package org.eclipselabs.spray.shapes.generator.connections

import java.util.List
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.shapes.CDEllipse
import org.eclipselabs.spray.shapes.CDLine
import org.eclipselabs.spray.shapes.CDPolygon
import org.eclipselabs.spray.shapes.CDPolyline
import org.eclipselabs.spray.shapes.CDRectangle
import org.eclipselabs.spray.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.CDText
import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.HAlign
import org.eclipselabs.spray.shapes.PlacingDefinition
import org.eclipselabs.spray.shapes.Point
import org.eclipselabs.spray.shapes.ShapeStyleRef
import org.eclipselabs.spray.shapes.TextType
import org.eclipselabs.spray.shapes.VAlign
import java.util.ArrayList
import java.lang.management.MemoryMXBean

class ConnectionPlacingGenerator {

    @Inject extension ConnectionStyleGenerator
    List<CharSequence> methods
    int decorator_index;

    def packageName() {
        ProjectProperties::stylesPackage
    }

    def connectionDecoratorMethodName() '''createConnectionDecorators'''

    def generateConnectionDecoratorMethods(ConnectionDefinition cd) {
        decorator_index = 0;
        methods = new ArrayList<CharSequence>()
        '''
            protected void «connectionDecoratorMethodName»(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
                «FOR place : cd.placing»
                    «place.generatePlacing»
                «ENDFOR»
            }
            
            «FOR method : methods»
                «method»
            «ENDFOR»
        '''
    }

    def generatePlacing(PlacingDefinition pd) {
        nextIndex
        var methodName = '''create«decoratorName.toFirstUpper»'''
        methods.add(
            '''
                protected ConnectionDecorator «methodName»(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
                	ConnectionDecorator «decoratorName» = peCreateService.createConnectionDecorator(connection, false, «pd.
                    offset», true);
                	«pd.shapeCon.createElement(decoratorName, "sprayStyle", pd.angle, pd.distance)»
                	return «decoratorName»;
                }
            ''')
        '''«methodName»(diagram, connection, sprayStyle);'''
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

    def dispatch createElement(CDRectangle element, String parentName, String shapeStyle, Integer angle,
        Integer distance) {
        val attname = "element"
        val plname = "pointList"
        var x = getXPositionforAngle(distance, angle)
        var y = getYPositionforAngle(distance, angle)
        '''
            {
            // As Graphiti doesn´t allow rectangles, creating rectangle as polygon
            List<Point> «plname» = new ArrayList<Point>();
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor», «y + element.layout.common.ycor», 0, 0));
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor + element.layout.common.width», «y +
                element.layout.common.ycor», 0, 0));
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor + element.layout.common.width», «y +
                element.layout.common.ycor + element.layout.common.heigth», 0, 0));
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor», «y + element.layout.common.ycor +
                element.layout.common.heigth», 0, 0));
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
            «createPointList(element.layout.point, plname, x, y)»
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
            «createPointList(element.layout.point, plname, x, y)»
            Polyline «attname» = gaService.createPolyline(«parentName», «plname»);
            ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
            «attname».setStyle(style.getStyle(diagram));
            «generateStyleForConnection(attname, element.layout.layout)»
        '''
    }

    def dispatch createElement(CDRoundedRectangle element, String parentName, String shapeStyle, Integer angle,
        Integer distance) {
        val attname = "element"
        val plname = "pointList"
        var x = getXPositionforAngle(distance, angle)
        var y = getYPositionforAngle(distance, angle)
        '''
            {
            // As Graphiti doesn´t allow rectangles, creating rounded rectangle as curved polygon
            List<Point> «plname» = new ArrayList<Point>();
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor», «y + element.layout.common.ycor», «element.
                layout.curveHeight», «element.layout.curveWidth»));
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor + element.layout.common.width», «y +
                element.layout.common.ycor», «element.layout.curveWidth», «element.layout.curveHeight»);
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor + element.layout.common.width», «y +
                element.layout.common.ycor + element.layout.common.heigth», «element.layout.curveHeight», «element.layout.
                curveWidth»);
            «plname».add(gaService.createPoint(«x + element.layout.common.xcor», «y + element.layout.common.ycor +
                element.layout.common.heigth», «element.layout.curveWidth», «element.layout.curveHeight»);
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
            gaService.setLocationAndSize(«attname», «element.layout.common.xcor + x», «element.layout.common.ycor + y», «element.
                layout.common.width», «element.layout.common.heigth»);
            «generateStyleForConnection(attname, element.layout.layout)»
        '''
    }

    def dispatch createElement(CDText element, String parentName, String shapeStyle, Integer angle, Integer distance) {
        val attname = "element"
        val editingname = "deinfo"
        var x = getXPositionforAngle(distance, angle)
        var y = getYPositionforAngle(distance, angle)
        '''
            «parentName».setActive(true);
            «IF element.texttype == TextType::DEFAULT»
                Text «attname» = gaService.createText(«parentName»);
            «ELSE»
                MultiText «attname» = gaService.createMultiText(«parentName»);
            «ENDIF»
            ISprayStyle style = «element.style.styleForElement(shapeStyle)»;
            «attname».setStyle(style.getStyle(diagram));
            «attname».setForeground(style.getFontColor(diagram));
            gaService.setLocationAndSize(«attname», «x + element.layout.common.xcor», «y + element.layout.common.ycor», «element.
                layout.common.width», «element.layout.common.heigth»);
            «attname».setHorizontalAlignment(Orientation.«element.layout.HAlign.mapAlignment»);
            «attname».setVerticalAlignment(Orientation.«element.layout.VAlign.mapAlignment»);
            «attname».setValue("");
            peService.setPropertyValue(«attname», ISprayConstants.TEXT_ID, TextIds.«element.body.value».name());
            IDirectEditingInfo «editingname» = getFeatureProvider().getDirectEditingInfo();
            «editingname».setMainPictogramElement(connection);
            «editingname».setPictogramElement(«parentName»);
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
            «FOR point : pointlist»
                «plname».add(gaService.createPoint(«point.xcor + x», «point.ycor + y», «point.curveBefore», «point.
                curveAfter»));
            «ENDFOR»
        '''
    }

    def styleForElement(ShapeStyleRef s, String styleName) {
        if (s != null) {
            if (s.javaStyle != null) {
                return '''new «s.javaStyle.qualifiedName»()'''
            } else if (s.dslStyle != null) {
                return '''new «packageName()».«s.dslStyle.name.toFirstUpper»()'''
            }
        } else {
            return styleName
        }
    }

    def getXPositionforAngle(Integer distance, Integer angle) {

        // Spezialfälle 0/90/180/270/>=360
        if (angle == 90 || angle == 270) {
            0
        } else if (angle == 180) {
            -distance
        } else if (angle == 0 || angle >= 360) {
            distance
        } else if (angle < 90) { // Quadrant 1
            var posx = (Math::cos(Math::toRadians(angle)) * distance).intValue
            posx
        } else if (angle < 180) { // Quadrant 2
            var newangle = 180 - angle
            var posx = (Math::cos(Math::toRadians(newangle)) * distance).intValue
            posx * -1
        } else if (angle < 270) { // Quadrant 3
            var newangle1 = angle - 180
            var posx = (Math::cos(Math::toRadians(newangle1)) * distance).intValue
            posx * -1
        } else if (angle < 360) { // Quadrant 4
            var newangle = 360 - angle
            var posx = (Math::cos(Math::toRadians(newangle)) * distance).intValue
            posx
        }
    }

    def getYPositionforAngle(Integer distance, Integer angle) {

        // Spezialfälle 0/90/180/270/>=360
        if (angle == 90) {
            -distance
        } else if (angle == 0 || angle == 180 || angle >= 360) {
            0
        } else if (angle == 270) {
            distance
        } else if (angle < 90) { // Quadrant 1
            var posy = (Math::sin(Math::toRadians(angle)) * distance).intValue
            posy * -1
        } else if (angle < 180) { // Quadrant 2
            var newangle = 180 - angle
            var posy = (Math::sin(Math::toRadians(newangle)) * distance).intValue
            posy * -1
        } else if (angle < 270) { // Quadrant 3
            var newangle1 = angle - 180
            var posy = (Math::sin(Math::toRadians(newangle1)) * distance).intValue
            posy
        } else if (angle < 360) { // Quadrant 4
            var newangle = 360 - angle
            var posy = (Math::sin(Math::toRadians(newangle)) * distance).intValue
            posy
        }
    }

    def nextIndex() {
        decorator_index = decorator_index + 1
    }

    def decoratorName() {
        "decorator_" + decorator_index
    }

}
