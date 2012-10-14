package org.eclipselabs.spray.shapes.generator.svg

import org.eclipselabs.spray.shapes.shapes.Rectangle
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.shapes.Ellipse
import org.eclipselabs.spray.shapes.shapes.Line
import org.eclipselabs.spray.styles.styles.RGBColor
import org.eclipselabs.spray.styles.styles.ColorConstantRef
import org.eclipselabs.spray.styles.styles.ColorWithTransparency
import static extension java.lang.Integer.*
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.shapes.Text
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.shapes.shapes.AnchorRelativePosition
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipse.xtext.EcoreUtil2
import org.eclipselabs.spray.shapes.shapes.AnchorFixPointPosition
import static java.lang.Math.*
import org.eclipselabs.spray.shapes.shapes.Shape
import org.eclipselabs.spray.styles.styles.LineStyle
import org.eclipselabs.spray.styles.styles.StyleLayout
import org.eclipselabs.spray.shapes.shapes.Polyline
import org.eclipselabs.spray.shapes.shapes.Polygon
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.CDRectangle
import org.eclipselabs.spray.shapes.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.shapes.CDEllipse
import org.eclipselabs.spray.shapes.shapes.CDText
import org.eclipselabs.spray.shapes.shapes.CDLine
import org.eclipselabs.spray.shapes.shapes.CDPolyline
import org.eclipselabs.spray.shapes.shapes.CDPolygon
import org.eclipselabs.spray.shapes.shapes.ShapeConnection
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition

class LayoutExtensions {
	
    def dispatch int width (ShapeDefinition shapeDef) {
        var w = 0;
        for (shape : shapeDef.eAllContents.toIterable.filter(typeof(Shape))) {
            w = max(w, shape.x + shape.width)
        }
        w
    }
    
    def dispatch int width (ConnectionDefinition shapeDef) { 100 }
    def dispatch int width (PlacingDefinition shape) { shape.shapeCon.width }

    def dispatch int height (ShapeDefinition shapeDef) {
        var h = 0;
        for (shape : shapeDef.eAllContents.toIterable.filter(typeof(Shape))) {
            h = max(h, shape.y + shape.height)
        }
        h
    }
    
    def dispatch int height (ConnectionDefinition shapeDef) { 30 }
    def dispatch int height (PlacingDefinition shape) { shape.shapeCon.height }

    // OFFSETS
    def dispatch int xoffset (EObject other) { 0 }
    def dispatch int xoffset (ConnectionDefinition shape) { 10 }
    def dispatch int xoffset (PlacingDefinition shape) { (shape.eContainer.xoffset + shape.offset*shape.eContainer.width).intValue }
    def dispatch int xoffset (ShapeConnection shape) { shape.eContainer.xoffset }
    def dispatch int yoffset (EObject other) { 0 }
    def dispatch int yoffset (ConnectionDefinition shape) { 10 }
    def dispatch int yoffset (PlacingDefinition shape) { (shape.eContainer.yoffset + shape.offset*shape.eContainer.width).intValue }
    def dispatch int yoffset (ShapeConnection shape) { shape.eContainer.yoffset }
    

    def dispatch int x (EObject other) { 0 }
    def dispatch int y (EObject other) { 0 }
    def dispatch int width (EObject other) { 0 }
    def dispatch int height (EObject other) { 0 }
    
    // Rectangle
    def dispatch int x (Rectangle shape) { shape.layout.common.xcor }
    def dispatch int y (Rectangle shape) { shape.layout.common.ycor }
    def dispatch width (Rectangle shape) { shape.layout.common.width }
    def dispatch height (Rectangle shape) { shape.layout.common.heigth }
    def dispatch int x (CDRectangle shape) { shape.layout.common.xcor }
    def dispatch int y (CDRectangle shape) { shape.layout.common.ycor }
    def dispatch width (CDRectangle shape) { shape.layout.common.width }
    def dispatch height (CDRectangle shape) { shape.layout.common.heigth }

    // RoundedRectangle
    def dispatch int x (RoundedRectangle shape) { shape.eContainer.x + shape.layout.common.xcor }
    def dispatch int y (RoundedRectangle shape) { shape.eContainer.y + shape.layout.common.ycor }
    def dispatch width (RoundedRectangle shape) { shape.layout.common.width }
    def dispatch height (RoundedRectangle shape) { shape.layout.common.heigth }
    def rx (RoundedRectangle shape) { shape.layout.curveWidth }
    def ry (RoundedRectangle shape) { shape.layout.curveHeight }
    def dispatch int x (CDRoundedRectangle shape) { shape.xoffset + shape.layout.common.xcor }
    def dispatch int y (CDRoundedRectangle shape) { shape.yoffset + shape.layout.common.ycor }
    def dispatch width (CDRoundedRectangle shape) { shape.layout.common.width }
    def dispatch height (CDRoundedRectangle shape) { shape.layout.common.heigth }
    def rx (CDRoundedRectangle shape) { shape.layout.curveWidth }
    def ry (CDRoundedRectangle shape) { shape.layout.curveHeight }

	// Ellipse
    def dispatch int x (Ellipse shape) { shape.eContainer.x + shape.layout.common.xcor + shape.rx }
    def dispatch int y (Ellipse shape) { shape.eContainer.y + shape.layout.common.ycor + shape.ry}
    def rx (Ellipse shape) { shape.layout.common.width/2 }
    def ry (Ellipse shape) { shape.layout.common.heigth/2 }
    def isCircle (Ellipse shape) { shape.rx==shape.ry }
    def dispatch width (Ellipse shape) { shape.layout.common.width }
    def dispatch height (Ellipse shape) { shape.layout.common.heigth }
    def dispatch int x (CDEllipse shape) { shape.xoffset + shape.layout.common.xcor + shape.rx }
    def dispatch int y (CDEllipse shape) { shape.yoffset + shape.layout.common.ycor + shape.ry}
    def rx (CDEllipse shape) { shape.layout.common.width/2 }
    def ry (CDEllipse shape) { shape.layout.common.heigth/2 }
    def isCircle (CDEllipse shape) { shape.rx==shape.ry }
    def dispatch width (CDEllipse shape) { shape.layout.common.width }
    def dispatch height (CDEllipse shape) { shape.layout.common.heigth }
    
    // Text
    // in SVG x/y is left-bottom for text
    def dispatch int x (Text shape) { shape.eContainer.x + shape.layout.common.xcor }
    def dispatch int y (Text shape) { shape.eContainer.y + shape.layout.common.ycor + shape.layout.common.heigth }
    def dispatch width (Text shape) { shape.layout.common.width }
    def dispatch height (Text shape) { shape.layout.common.heigth }
    def dispatch int x (CDText shape) { shape.xoffset + shape.layout.common.xcor }
    def dispatch int y (CDText shape) { shape.yoffset + shape.layout.common.ycor + shape.layout.common.heigth }
    def dispatch width (CDText shape) { shape.layout.common.width }
    def dispatch height (CDText shape) { shape.layout.common.heigth }

    // Line
    def int x1 (Line shape) { shape.eContainer.x + shape.layout.point.get(0).xcor }
    def int y1 (Line shape) { shape.eContainer.y + shape.layout.point.get(0).ycor }
    def int x2 (Line shape) { shape.eContainer.x + shape.layout.point.get(1).xcor }
    def int y2 (Line shape) { shape.eContainer.y + shape.layout.point.get(1).ycor }
    def dispatch width (Line shape) {  Math::abs(shape.layout.point.get(1).xcor - shape.layout.point.get(0).xcor) }
    def dispatch height (Line shape) { Math::abs(shape.layout.point.get(1).ycor - shape.layout.point.get(0).ycor) }
    def int x1 (CDLine shape) { shape.xoffset + shape.layout.point.get(0).xcor }
    def int y1 (CDLine shape) { shape.yoffset + shape.layout.point.get(0).ycor }
    def int x2 (CDLine shape) { shape.xoffset + shape.layout.point.get(1).xcor }
    def int y2 (CDLine shape) { shape.yoffset + shape.layout.point.get(1).ycor }
    def dispatch width (CDLine shape) {  Math::abs(shape.layout.point.get(1).xcor - shape.layout.point.get(0).xcor) }
    def dispatch height (CDLine shape) { Math::abs(shape.layout.point.get(1).ycor - shape.layout.point.get(0).ycor) }
    
    def dispatch String lineStyle (ConnectionDefinition shape) {
        lineStyle(shape.layout?.layout)
    }
    
    def dispatch String lineStyle (Line shape) {
        lineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDLine shape) {
        lineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (Polyline shape) {
        lineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDPolyline shape) {
        lineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (Polygon shape) {
        lineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDPolygon shape) {
        lineStyle(shape.layout?.layout?.layout)
    }
    
    // no dispatch here, since the dispatcher methods will delegate to this here
    // with the fixed argument type
    def String lineStyle (StyleLayout layout) {
        if (layout == null)
            return ""
        switch (layout.lineStyle) {
            case LineStyle::DOT: 'stroke-dasharray="2,2"' 
            case LineStyle::DASH: 'stroke-dasharray="8,6"' 
            case LineStyle::DASHDOT: 'stroke-dasharray="8,4,2,4"' 
            case LineStyle::DASHDOTDOT: 'stroke-dasharray="8,4,2,4,2,4"' 
            default: ""
        }
    }
    
    // Anchors
    def dispatch int x (AnchorFixPointPosition pos) { pos.xcor }
    def dispatch int y (AnchorFixPointPosition pos) { pos.ycor }

    def dispatch int x (AnchorRelativePosition pos) {
        val ShapeDefinition shapeDef = EcoreUtil2::getContainerOfType(pos, typeof(ShapeDefinition))
        0
    }
    
    def dispatch int y (AnchorRelativePosition pos) {
        val ShapeDefinition shapeDef = EcoreUtil2::getContainerOfType(pos, typeof(ShapeDefinition))
        0
    }
    
    // Colors
    def dispatch color (RGBColor color) '''#«color.red.toHexString»«color.green.toHexString»«color.blue.toHexString»'''
    def dispatch color (ColorConstantRef color) { color.value.name }
    def dispatch color (ColorWithTransparency color) { "white" }
    def hasTransparency (ShapestyleLayout ssl) { ssl.layout.transparency != Double::MIN_VALUE }
    def transparency (ShapestyleLayout ssl) { ssl.layout.transparency }
}