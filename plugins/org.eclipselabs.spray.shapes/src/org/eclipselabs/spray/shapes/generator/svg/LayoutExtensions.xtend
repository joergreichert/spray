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

class LayoutExtensions {
    def dispatch x (Rectangle shape) { shape.layout.common.xcor }

    def dispatch y (Rectangle shape) { shape.layout.common.ycor }

    def dispatch width (Rectangle shape) { shape.layout.common.width }
    def dispatch height (Rectangle shape) { shape.layout.common.heigth }

    // RoundedRectangle
    def dispatch x (RoundedRectangle shape) { shape.layout.common.xcor }
    def dispatch y (RoundedRectangle shape) { shape.layout.common.ycor }
    def dispatch width (RoundedRectangle shape) { shape.layout.common.width }
    def dispatch height (RoundedRectangle shape) { shape.layout.common.heigth }
    def rx (RoundedRectangle shape) { shape.layout.curveWidth }
    def ry (RoundedRectangle shape) { shape.layout.curveHeight }

	// Ellipse
    def dispatch x (Ellipse shape) { shape.layout.common.xcor + shape.rx }
    def dispatch y (Ellipse shape) { shape.layout.common.ycor + shape.ry}
    def rx (Ellipse shape) { shape.layout.common.width/2 }
    def ry (Ellipse shape) { shape.layout.common.heigth/2 }
    def isCircle (Ellipse shape) { shape.rx==shape.ry }
    
    // Text
    // in SVG x/y is left-bottom for text
    def dispatch x (Text shape) { shape.layout.common.xcor }
    def dispatch y (Text shape) { shape.layout.common.ycor + shape.layout.common.heigth }

    // Line
    def x1 (Line shape) { shape.layout.point.get(0).xcor }
    def y1 (Line shape) { shape.layout.point.get(0).ycor }
    def x2 (Line shape) { shape.layout.point.get(1).xcor }
    def y2 (Line shape) { shape.layout.point.get(1).ycor }
    
    // Colors
    def dispatch color (RGBColor color) '''#«color.red.toHexString»«color.green.toHexString»«color.blue.toHexString»'''
    def dispatch color (ColorConstantRef color) { color.value.name }
    def dispatch color (ColorWithTransparency color) { "white" }
    def hasTransparency (ShapestyleLayout ssl) { ssl.layout.transparency != Double::MIN_VALUE }
    def transparency (ShapestyleLayout ssl) { ssl.layout.transparency }
}