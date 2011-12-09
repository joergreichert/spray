package org.eclipselabs.spray.shapes.generator

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition

class ShapeLayoutGenerator {
	
	def generateLayout(ShapeDefinition s) {
		//Check if default size is set
		if(s.shapeLayout.defheight != null && s.shapeLayout.defwidth != null) {
			'''
			invisibleRectangle.setWidth(«s.shapeLayout.defwidth»);
			invisibleRectangle.setHeight(«s.shapeLayout.defheight»);
			'''
		}
		//Check if min size is set NOT IMPLEMENTED YET
		if(s.shapeLayout.minheight != null && s.shapeLayout.minwidth != null) {
			'''
//			styleInvisibleRectangle.
			'''
		}
		//Check if max size is set NOT IMPLEMENTED YET
		if(s.shapeLayout.maxheight != null && s.shapeLayout.maxwidth != null) {
			'''
			'''
		}
		//Set proportional,
		'''
			styleInvisibleRectangle.setProportional(«s.shapeLayout.proportional»);	   
		'''
		
		//Set strechting
		if(s.shapeLayout.stretchH != null){
		'''
			styleInvisibleRectangle.setStretchH(«s.shapeLayout.stretchH»);	   
		'''
		}else{
			'''
			styleInvisibleRectangle.setStretchH(true);
			'''
		}
		
		//Set proportional, strechting
		if(s.shapeLayout.stretchV != null){
		'''
			styleInvisibleRectangle.setStretchV(«s.shapeLayout.stretchV»);	   
		'''
		}else{
			'''
			styleInvisibleRectangle.setStretchV(true);
			'''
		}
		
		//Set Angle
		if(s.shapeLayout.angle != null){			
			'''
			int angle = «s.shapeLayout.angle»;
			styleInvisibleRectangle.setAngle(angle);
			'''
		}
	}
	
}