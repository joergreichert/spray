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
package org.eclipselabs.spray.shapes.generator.svg

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipselabs.spray.shapes.AnchorFixPointPosition
import org.eclipselabs.spray.shapes.AnchorRelativePosition
import org.eclipselabs.spray.shapes.CDEllipse
import org.eclipselabs.spray.shapes.CDLine
import org.eclipselabs.spray.shapes.CDPolygon
import org.eclipselabs.spray.shapes.CDPolyline
import org.eclipselabs.spray.shapes.CDRectangle
import org.eclipselabs.spray.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.CDText
import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.Line
import org.eclipselabs.spray.shapes.PlacingDefinition
import org.eclipselabs.spray.shapes.Point
import org.eclipselabs.spray.shapes.Polygon
import org.eclipselabs.spray.shapes.Polyline
import org.eclipselabs.spray.shapes.Rectangle
import org.eclipselabs.spray.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.Shape
import org.eclipselabs.spray.shapes.ShapeConnection
import org.eclipselabs.spray.shapes.ShapeContainerElement
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.Text
import org.eclipselabs.spray.styles.ColorConstantRef
import org.eclipselabs.spray.styles.ColorWithTransparency
import org.eclipselabs.spray.styles.LineStyle
import org.eclipselabs.spray.styles.RGBColor
import org.eclipselabs.spray.styles.StyleLayout

import static java.lang.Math.*

import static extension java.lang.Integer.*

class LayoutExtensions {
	
	def int defaultConnectionX1() { 10 }
	def int defaultConnectionY1() { 50 }
	def int defaultConnectionX2() { 110 }
	def int defaultConnectionY2() { 50 }
	def int defaultConnectionWidth() { defaultConnectionX2 - defaultConnectionX1 }
	def int defaultConnectionHeight() { defaultConnectionY2 - defaultConnectionY1 }
	
    def dispatch int width (ShapeDefinition shapeDef) {
        var w = 0;
        for (shape : shapeDef.eContents.filter(typeof(Shape))) {
            w = max(w, shape.x(false) + shape.width)
	        for (childShape : shape.eAllContents.toIterable.filter(typeof(Shape))) {
	            w = max(w, childShape.x(true) + shape.width)
	        }
        }
        w
    }
    
    def placingDefs(ConnectionDefinition shapeDef) {
    	shapeDef.eContents.filter(typeof(PlacingDefinition)).map(pd|pd.width())
    }
    
    def dispatch int width (ConnectionDefinition shapeDef) { defaultConnectionWidth + shapeDef.placingSpaceXShift + shapeDef.placingSpaceAdditionalWidth }
    def dispatch int width (PlacingDefinition shape) { if(shape.shapeCon != null) shape.shapeCon.width else defaultConnectionWidth }

    def dispatch int height (ShapeDefinition shapeDef) {
        var h = 0;
        for (shape : shapeDef.eContents.filter(typeof(Shape))) {
            h = max(h, shape.y(false) + shape.height)
	        for (childShape : shape.eAllContents.toIterable.filter(typeof(Shape))) {
	            h = max(h, childShape.y(true) + shape.height)
	        }
        }
        h
    }
    
    def dispatch int height (ConnectionDefinition shapeDef) { defaultConnectionHeight + shapeDef.placingSpaceYShift + shapeDef.placingSpaceAdditionalHeight }
    def dispatch int height (PlacingDefinition shape) { if(shape.shapeCon != null) shape.shapeCon.height else defaultConnectionHeight }

    // OFFSETS
    def dispatch int xoffset (EObject other) { 0 }
    def dispatch int xoffset (ConnectionDefinition shape) { 10 }
    def dispatch int xoffset (PlacingDefinition shape) { (shape.eContainer.xoffset + shape.offset*shape.width).nullSafeIntValue }
    def dispatch int xoffset (ShapeConnection shape) { shape.eContainer.xoffset }
    def dispatch int yoffset (EObject other) { 0 }
    def dispatch int yoffset (ConnectionDefinition shape) { 10 }
    def dispatch int yoffset (PlacingDefinition shape) { (shape.eContainer.yoffset + shape.offset*shape.width).nullSafeIntValue }
    def dispatch int yoffset (ShapeConnection shape) { shape.eContainer.yoffset }
    

    def dispatch int x (EObject other, boolean child) { 0 }
    def dispatch int y (EObject other, boolean child) { 0 }
    def dispatch int width (EObject other) { 0 }
    def dispatch int height (EObject other) { 0 }
    
    // Rectangle
    def dispatch int x (Rectangle shape, boolean child) { shape.xoffset + if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0 }
    def dispatch int y (Rectangle shape, boolean child) { shape.yoffset + if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0 }
    def dispatch int width (Rectangle shape) { shape.layout.common.width }
    def dispatch int height (Rectangle shape) { shape.layout.common.heigth }
    def dispatch int x (CDRectangle shape, boolean child) { if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor + shape.placingSpaceXShift else 0 }
    def dispatch int y (CDRectangle shape, boolean child) { if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor + shape.placingSpaceYShift else 0 }
    def dispatch int xWithoutShift (CDRectangle shape, boolean child) { if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0 }
    def dispatch int yWithoutShift (CDRectangle shape, boolean child) { if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0 }
    def dispatch int width (CDRectangle shape) { shape.layout.common.width }
    def dispatch int height (CDRectangle shape) { shape.layout.common.heigth }

    // RoundedRectangle
    def dispatch int x (RoundedRectangle shape, boolean child) { shape.xoffset + if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0 }
    def dispatch int y (RoundedRectangle shape, boolean child) { shape.yoffset + if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0 }
    def dispatch int width (RoundedRectangle shape) { shape.layout.common.width }
    def dispatch int height (RoundedRectangle shape) { shape.layout.common.heigth }
    def rx (RoundedRectangle shape) { shape.layout.curveWidth }
    def ry (RoundedRectangle shape) { shape.layout.curveHeight }
    def dispatch int x (CDRoundedRectangle shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor + shape.placingSpaceXShift else 0) }
    def dispatch int y (CDRoundedRectangle shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor + shape.placingSpaceYShift else 0) }
    def dispatch int xWithoutShift (CDRoundedRectangle shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0) }
    def dispatch int yWithoutShift (CDRoundedRectangle shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0) }
    def dispatch int width (CDRoundedRectangle shape) { shape.layout.common.width }
    def dispatch int height (CDRoundedRectangle shape) { shape.layout.common.heigth }
    def rx (CDRoundedRectangle shape) { shape.layout.curveWidth }
    def ry (CDRoundedRectangle shape) { shape.layout.curveHeight }

	// Ellipse
    def int x1 (Ellipse shape, boolean child) { shape.xoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0) }
    def int x2 (Ellipse shape, boolean child) { shape.xoffset + shape.layout.common.xcor + shape.width }
    def int y1 (Ellipse shape, boolean child) { shape.yoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0) }
    def int y2 (Ellipse shape, boolean child) { shape.yoffset + shape.layout.common.ycor + shape.height }
    def dispatch int x (Ellipse shape, boolean child) { shape.xoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0) + shape.rx }
    def dispatch int y (Ellipse shape, boolean child) { shape.yoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0) + shape.ry}
    def rx (Ellipse shape) { shape.layout.common.width/2 }
    def ry (Ellipse shape) { shape.layout.common.heigth/2 }
    def isCircle (Ellipse shape) { shape.rx==shape.ry }
    def dispatch int width (Ellipse shape) { shape.layout.common.width }
    def dispatch int height (Ellipse shape) { shape.layout.common.heigth }
    def dispatch int x (CDEllipse shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor + shape.placingSpaceXShift else 0) + shape.rx }
    def dispatch int y (CDEllipse shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor + shape.placingSpaceYShift else 0) + shape.ry}
    def dispatch int xWithoutShift (CDEllipse shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0) + shape.rx }
    def dispatch int yWithoutShift (CDEllipse shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0) + shape.ry}
    def rx (CDEllipse shape) { shape.layout.common.width/2 }
    def ry (CDEllipse shape) { shape.layout.common.heigth/2 }
    def isCircle (CDEllipse shape) { shape.rx==shape.ry }
    def dispatch int width (CDEllipse shape) { shape.layout.common.width }
    def dispatch int height (CDEllipse shape) { shape.layout.common.heigth }
    
    // Text
    // in SVG x/y is left-bottom for text
    def dispatch int x (Text shape, boolean child) { if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0 }
    def dispatch int y (Text shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0) + shape.layout.common.heigth }
    def dispatch int width (Text shape) { shape.layout.common.width }
    def dispatch int height (Text shape) { shape.layout.common.heigth }
    def dispatch int x (CDText shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor + shape.placingSpaceXShift else 0) }
    def dispatch int y (CDText shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor + shape.placingSpaceYShift else 0) + shape.layout.common.heigth }
    def dispatch int xWithoutShift (CDText shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.xcor else 0) }
    def dispatch int yWithoutShift (CDText shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.common.ycor else 0) + shape.layout.common.heigth }
    def dispatch int width (CDText shape) { shape.layout.common.width }
    def dispatch int height (CDText shape) { shape.layout.common.heigth }

    // Line
    def dispatch int x (Line shape, boolean child) { shape.xoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) {  if(shape.x1 < shape.x2) shape.x1 else shape.x2  } else 0)  }
    def dispatch int y (Line shape, boolean child) { shape.xoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) {  if(shape.y1 < shape.y2) shape.y1 else shape.y2  } else 0)  }
    def int x1 (Line shape) { shape.xoffset + shape.layout.point.get(0).xcor }
    def int y1 (Line shape) { shape.yoffset + shape.layout.point.get(0).ycor }
    def int x2 (Line shape) { shape.xoffset + shape.layout.point.get(1).xcor }
    def int y2 (Line shape) { shape.yoffset + shape.layout.point.get(1).ycor }
    def dispatch int width (Line shape) {  Math::abs(shape.layout.point.get(1).xcor - shape.layout.point.get(0).xcor) }
    def dispatch int height (Line shape) { Math::abs(shape.layout.point.get(1).ycor - shape.layout.point.get(0).ycor) }
    def dispatch int x (CDLine shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) {  if(shape.x1 < shape.x2) shape.x1 else shape.x2  } else 0) + shape.placingSpaceXShift  }
    def dispatch int y (CDLine shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) {  if(shape.y1 < shape.y2) shape.y1 else shape.y2  } else 0) + shape.placingSpaceYShift  }
    def dispatch int xWithoutShift (CDLine shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) {  if(shape.x1 < shape.x2) shape.x1 else shape.x2  } else 0)  }
    def dispatch int yWithoutShift (CDLine shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) {  if(shape.y1 < shape.y2) shape.y1 else shape.y2  } else 0)  }
    def int x1 (CDLine shape) { shape.layout.point.get(0).xcor }
    def int y1 (CDLine shape) { shape.layout.point.get(0).ycor }
    def int x2 (CDLine shape) { shape.layout.point.get(1).xcor }
    def int y2 (CDLine shape) { shape.layout.point.get(1).ycor }
    def dispatch int width (CDLine shape) {  Math::abs(shape.layout.point.get(1).xcor - shape.layout.point.get(0).xcor) }
    def dispatch int height (CDLine shape) { Math::abs(shape.layout.point.get(1).ycor - shape.layout.point.get(0).ycor) }

    // Polyline
    def dispatch int x (Polyline shape, boolean child) { shape.xoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minXPoint else 0) }
    def dispatch int y (Polyline shape, boolean child) { shape.yoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minYPoint else 0) }
    def dispatch int width (Polyline shape) { shape.layout.point.maxXPoint - shape.layout.point.minXPoint }
    def dispatch int height (Polyline shape) { shape.layout.point.maxYPoint - shape.layout.point.minYPoint }
    def dispatch int x (CDPolyline shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minXPoint + shape.placingSpaceXShift else 0) }
    def dispatch int y (CDPolyline shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minYPoint + shape.placingSpaceYShift else 0) }
    def dispatch int xWithoutShift (CDPolyline shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minXPoint else 0) }
    def dispatch int yWithoutShift (CDPolyline shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minYPoint else 0) }
    def dispatch int width (CDPolyline shape) { shape.layout.point.maxXPoint - shape.layout.point.minXPoint }
    def dispatch int height (CDPolyline shape) { shape.layout.point.maxYPoint - shape.layout.point.minYPoint }

	// Polygon
    def dispatch int x (Polygon shape, boolean child) { shape.xoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minXPoint else 0) }
    def dispatch int y (Polygon shape, boolean child) { shape.yoffset + (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minYPoint else 0) }
    def dispatch int width (Polygon shape) { shape.layout.point.maxXPoint - shape.layout.point.minXPoint }
    def dispatch int height (Polygon shape) { shape.layout.point.maxYPoint - shape.layout.point.minYPoint }
    def dispatch int x (CDPolygon shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minXPoint + shape.placingSpaceXShift else 0) }
    def dispatch int y (CDPolygon shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minYPoint + shape.placingSpaceYShift else 0) }
    def dispatch int xWithoutShift (CDPolygon shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minXPoint else 0) }
    def dispatch int yWithoutShift (CDPolygon shape, boolean child) { (if(child || shape.eContainer instanceof ShapeContainerElement) shape.layout.point.minYPoint else 0) }
    def dispatch int width (CDPolygon shape) { shape.layout.point.maxXPoint - shape.layout.point.minXPoint }
    def dispatch int height (CDPolygon shape) { shape.layout.point.maxYPoint - shape.layout.point.minYPoint }

    def dispatch int x (Point point, boolean child) { point.xoffset + point.xcor }
    def dispatch int y (Point point, boolean child) { point.xoffset + point.ycor }
    
    def private dispatch int grandParentX(Ellipse shape) { shape.parentX + shape.x1(shape.eContainer != null) }
    def private dispatch int grandParentY(Ellipse shape) { shape.parentY + shape.y1(shape.eContainer != null) }
    def private dispatch int grandParentX(EObject shape) { shape.parentX + shape.x(shape.eContainer != null) }
    def private dispatch int grandParentY(EObject shape) { shape.parentY + shape.y(shape.eContainer != null) }
    def private dispatch int grandParentX(Object shape) { 0 }
    def private dispatch int grandParentY(Object shape) { 0 }
    def dispatch int parentX(Ellipse shape) { if(shape.eContainer instanceof ShapeContainerElement) 0 else shape.eContainer.grandParentX }
    def dispatch int parentY(Ellipse shape) { if(shape.eContainer instanceof ShapeContainerElement) 0 else shape.eContainer.grandParentY }
    def dispatch int parentX(EObject shape) { if(shape.eContainer instanceof ShapeContainerElement) 0 else shape.eContainer.grandParentX }
    def dispatch int parentY(EObject shape) { if(shape.eContainer instanceof ShapeContainerElement) 0 else shape.eContainer.grandParentY }
    def dispatch int parentX(Object shape) { 0 }
    def dispatch int parentY(Object shape) { 0 }
    
    def minXPoint(List<Point> points) {
    	findPoint(points, [Point p|p.xcor], [Integer c1, Integer c2|c1 - c2]).head
    }

    def maxXPoint(List<Point> points) {
    	findPoint(points, [Point p|p.xcor], [Integer c1, Integer c2|c2 - c1]).head
    }

    def minYPoint(List<Point> points) {
    	findPoint(points, [Point p|p.ycor], [Integer c1, Integer c2|c1 - c2]).head
    }

    def maxYPoint(List<Point> points) {
    	findPoint(points, [Point p|p.ycor], [Integer c1, Integer c2|c2 - c1]).head
    }
    
    def findPoint(List<Point> points, (Point) => Integer coord, (Integer, Integer) => Integer compare) {
    	val mappedPoints = newArrayList
    	mappedPoints += points.map(p|coord.apply(p)).toList
    	mappedPoints.sort[coord1, coord2| compare.apply(coord1, coord2) ]
    	mappedPoints
    }
    
    def dispatch String lineStyle (ConnectionDefinition shape) {
        internalLineStyle(shape.layout?.layout)
    }
    
    def dispatch String lineStyle (Line shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDLine shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (Polyline shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDPolyline shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (Polygon shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDPolygon shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (Ellipse shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDEllipse shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (Rectangle shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDRectangle shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }    

    def dispatch String lineStyle (RoundedRectangle shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }
    
    def dispatch String lineStyle (CDRoundedRectangle shape) {
        internalLineStyle(shape.layout?.layout?.layout)
    }    
    
    def dispatch String lineStyle (StyleLayout layout) {
    	internalLineStyle(layout)
    }
    
    def dispatch String lineStyle (ShapestyleLayout layout) {
    	internalLineStyle(layout?.layout)
    }
    
    // no dispatch here, since the dispatcher methods will delegate to this here
    // with the fixed argument type
    def private String internalLineStyle (StyleLayout layout) {
        if (layout == null)
            return ""
        switch (layout.lineStyle) {
            case LineStyle::DOT: 'stroke-dasharray: ' + layout.dotDashArray
            case LineStyle::DASH: 'stroke-dasharray: ' + layout.dotDashDashArray
            case LineStyle::DASHDOT: 'stroke-dasharray: ' + layout.dashDotDashArray
            case LineStyle::DASHDOTDOT: 'stroke-dasharray: ' + layout.dashDotDotDashArray
            default: ""
        }
    }
    
    def private dotDashArray(StyleLayout layout) {
    	val ellipse = EcoreUtil2::getContainerOfType(layout, typeof(Ellipse))
    	if(ellipse != null) {
    		val b = ellipse.bowLength
    		integerValue(2*b) + "," + integerValue(2*b) 
    	} else "2,2"
    }

    def private dotDashDashArray(StyleLayout layout) {
    	val ellipse = EcoreUtil2::getContainerOfType(layout, typeof(Ellipse))
    	if(ellipse != null) {
    		val b = ellipse.bowLength
    		integerValue(8*b) + "," + integerValue(6*b) 
    	} else "8,6"
    }

    def private dashDotDashArray(StyleLayout layout) {
    	val ellipse = EcoreUtil2::getContainerOfType(layout, typeof(Ellipse))
    	if(ellipse != null) {
    		val b = ellipse.bowLength
    		integerValue(8*b) + "," + integerValue(4*b) + "," + integerValue(2*b) + "," + integerValue(4*b) 
    	} else "8,4,2,4"
    }

    def private dashDotDotDashArray(StyleLayout layout) {
    	val ellipse = EcoreUtil2::getContainerOfType(layout, typeof(Ellipse))
    	if(ellipse != null) {
    		val b = ellipse.bowLength
    		integerValue(8*b) + "," + integerValue(4*b) + "," + integerValue(2*b) + "," + integerValue(4*b) + "," + integerValue(2*b) + "," + integerValue(4*b) 
    	} else "8,4,2,4,2,4"
    }
    
    def bowLength(Ellipse ellipse) {
    	Math::PI * ellipse.rx * 2 / 180
    }
    
	def integerValue(Double doubleValue) {
		Double::valueOf(doubleValue).nullSafeIntValue
	}    

    def placingSpaceXShift(EObject shape) {
    	val connectionDefinition = EcoreUtil2::getContainerOfType(shape, typeof(ConnectionDefinition))
    	if(connectionDefinition != null) connectionDefinition.placingSpaceXShift else 0
    }
	
    def placingSpaceXShift(ConnectionDefinition shape) {
    	val x = shape.placing.map(pd|Double::valueOf(defaultConnectionX1 + defaultConnectionWidth * pd.offset + pd.shapeCon.xWithoutShift(true)).nullSafeIntValue).sort.head
    	if(x == null || x > 0) 0 else Math::abs(x)
    }

    def placingSpaceAdditionalWidth(ConnectionDefinition shape) {
    	shape.placing.map(pd|Double::valueOf(defaultConnectionX1 + (defaultConnectionWidth * pd.offset + (pd.shapeCon.xWithoutShift(true) + pd.shapeCon.width)) - defaultConnectionWidth).nullSafeIntValue).sort.last
    }
    
    def nullSafeIntValue(Double doubleValue) {
    	if(doubleValue == null) 0 else doubleValue.intValue
    }

    def placingSpaceYShift(EObject shape) {
    	val connectionDefinition = EcoreUtil2::getContainerOfType(shape, typeof(ConnectionDefinition))
    	if(connectionDefinition != null) connectionDefinition.placingSpaceYShift else 0
    }

    def placingSpaceYShift(ConnectionDefinition shape) {
    	val y = shape.placing.map(pd|Math::abs(defaultConnectionY1 + pd.shapeCon.yWithoutShift(true))).sort.head
    	if(y == null || y > 0) 0 else Math::abs(y)
    }
    
    def placingSpaceAdditionalHeight(ConnectionDefinition shape) {
    	shape.placing.map(pd|Double::valueOf(defaultConnectionY2 + (defaultConnectionHeight * pd.offset + (pd.shapeCon.yWithoutShift(true) + pd.shapeCon.height)) - defaultConnectionHeight).nullSafeIntValue).sort.last
    }
    
    // Anchors
    def dispatch int x (AnchorFixPointPosition pos, boolean child) { pos.xcor }
    def dispatch int y (AnchorFixPointPosition pos, boolean child) { pos.ycor }

    def dispatch int x (AnchorRelativePosition pos, boolean child) {
        val ShapeDefinition shapeDef = EcoreUtil2::getContainerOfType(pos, typeof(ShapeDefinition))
        0
    }
    
    def dispatch int y (AnchorRelativePosition pos, boolean child) {
        val ShapeDefinition shapeDef = EcoreUtil2::getContainerOfType(pos, typeof(ShapeDefinition))
        0
    }
    
    // Colors
    def dispatch color (RGBColor color) '''#«color.red.toHexString»«color.green.toHexString»«color.blue.toHexString»'''
    def dispatch color (ColorConstantRef color) { color.value.getName }
    def dispatch color (ColorWithTransparency color) { "white" }
    def hasTransparency (ShapestyleLayout ssl) { ssl.layout.transparency != Double::MIN_VALUE }
    def transparency (ShapestyleLayout ssl) { ssl.layout.transparency }
}