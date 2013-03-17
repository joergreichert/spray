package org.eclipselabs.spray.shapes.util

import org.eclipselabs.spray.shapes.ShapeDefinition

import org.eclipselabs.spray.shapes.Line
import org.eclipselabs.spray.shapes.Rectangle
import org.eclipselabs.spray.shapes.Polygon
import org.eclipselabs.spray.shapes.Polyline
import org.eclipselabs.spray.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.Text

class ShapeSizeCalculator {
	
	def getContainerSize(ShapeDefinition s) {
		var width = 0
		var height = 0
		for(element : s.shape) {
			var elementSize = element.getSize()
			width = Math::max(width, elementSize.width)
			height = Math::max(height, elementSize.heigth)
		}
		var size = new ShapeSizeWrapper(width, height);
		return size;
	}
	
	def dispatch getSize(Line element){
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Rectangle element){
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Polygon element){
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}		
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Polyline element){
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(RoundedRectangle element){
		var maxX = 0
		var maxY = 0		
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Ellipse element){
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Text element){
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
}