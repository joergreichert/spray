package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition

class ShapeLayoutGenerator {
	
	def generateLayout(ShapeDefinition s) {
		'''
		«IF s.shapeLayout.proportional != null»
		sprayStyle.getStyle(diagram).setProportional(«s.shapeLayout.proportional»);	   
		«ELSE»
		sprayStyle.getStyle(diagram).setProportional(false);
		«ENDIF»		
		«IF s.shapeLayout.stretchH != null»
		sprayStyle.getStyle(diagram).setStretchH(«s.shapeLayout.stretchH»);	   
		«ELSE»
		sprayStyle.getStyle(diagram).setStretchH(false);	   
		«ENDIF»		
		«IF s.shapeLayout.stretchV != null»
		sprayStyle.getStyle(diagram).setStretchV(«s.shapeLayout.stretchH»);	   
		«ELSE»
		sprayStyle.getStyle(diagram).setStretchV(false);	   
		«ENDIF»		
		'''
	}
	
}