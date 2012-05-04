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

class LayoutExtensions {
    def dispatch int width (ShapeDefinition shapeDef) {
        var w = 0;
        for (shape : shapeDef.eAllContents.toIterable.filter(typeof(Shape))) {
            w = max(w, shape.width)
        }
        w
    }
    def dispatch int height (ShapeDefinition shapeDef) {
        var h = 0;
        for (shape : shapeDef.eAllContents.toIterable.filter(typeof(Shape))) {
            h = max(h, shape.width)
        }
        h
    }
    def dispatch int x (EObject other) { 0 }
    def dispatch int y (EObject other) { 0 }
    def dispatch int width (EObject other) { 0 }
    def dispatch int height (EObject other) { 0 }
    
    // Rectangle
    def dispatch int x (Rectangle shape) { shape.layout.common.xcor }
    def dispatch int y (Rectangle shape) { shape.layout.common.ycor }
    def dispatch width (Rectangle shape) { shape.layout.common.width }
    def dispatch height (Rectangle shape) { shape.layout.common.heigth }

    // RoundedRectangle
    def dispatch int x (RoundedRectangle shape) { shape.eContainer.x + shape.layout.common.xcor }
    def dispatch int y (RoundedRectangle shape) { shape.eContainer.y + shape.layout.common.ycor }
    def dispatch width (RoundedRectangle shape) { shape.layout.common.width }
    def dispatch height (RoundedRectangle shape) { shape.layout.common.heigth }
    def rx (RoundedRectangle shape) { shape.layout.curveWidth }
    def ry (RoundedRectangle shape) { shape.layout.curveHeight }

	// Ellipse
    def dispatch int x (Ellipse shape) { shape.eContainer.x + shape.layout.common.xcor + shape.rx }
    def dispatch int y (Ellipse shape) { shape.eContainer.y + shape.layout.common.ycor + shape.ry}
    def rx (Ellipse shape) { shape.layout.common.width/2 }
    def ry (Ellipse shape) { shape.layout.common.heigth/2 }
    def isCircle (Ellipse shape) { shape.rx==shape.ry }
    
    // Text
    // in SVG x/y is left-bottom for text
    def dispatch int x (Text shape) { shape.eContainer.x + shape.layout.common.xcor }
    def dispatch int y (Text shape) { shape.eContainer.y + shape.layout.common.ycor + shape.layout.common.heigth }

    // Line
    def int x1 (Line shape) { shape.eContainer.x + shape.layout.point.get(0).xcor }
    def int y1 (Line shape) { shape.eContainer.y + shape.layout.point.get(0).ycor }
    def int x2 (Line shape) { shape.eContainer.x + shape.layout.point.get(1).xcor }
    def int y2 (Line shape) { shape.eContainer.y + shape.layout.point.get(1).ycor }
    
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