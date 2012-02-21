package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import java.util.HashMap
import org.eclipselabs.spray.shapes.shapes.Line
import org.eclipselabs.spray.shapes.shapes.Rectangle
import org.eclipselabs.spray.shapes.shapes.Polygon
import org.eclipselabs.spray.shapes.shapes.Polyline
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.shapes.Ellipse
import org.eclipselabs.spray.shapes.shapes.Text

class ShapeSizeCalculator {
	
	def getContainerSize(ShapeDefinition s) {
		var sizeMap = new HashMap<String, Integer>();
		var width = 0
		var height = 0
		for(element : s.shape) {
			var elementSize = element.getSize()
			width = Math::max(width, elementSize.get("width"))
			height = Math::max(height, elementSize.get("height"))
		}
		sizeMap.put("width", width);
		sizeMap.put("height", height);
		return sizeMap;
	}
	
	def dispatch getSize(Line element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);		
		return sizeMap;
	}
	
	def dispatch getSize(Rectangle element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);	
		return sizeMap;
	}
	
	def dispatch getSize(Polygon element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}		
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);	
		return sizeMap;
	}
	
	def dispatch getSize(Polyline element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);	
		return sizeMap;
	}
	
	def dispatch getSize(RoundedRectangle element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0		
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);	
		return sizeMap;
	}
	
	def dispatch getSize(Ellipse element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);	
		return sizeMap;
	}
	
	def dispatch getSize(Text element){
		var sizeMap = new HashMap<String, Integer>();
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		sizeMap.put("width", maxX);
		sizeMap.put("height", maxY);	
		return sizeMap;
	}
	
}