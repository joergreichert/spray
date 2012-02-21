package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition

class ShapeLayoutGenerator {
	
	def generateLayout(ShapeDefinition s) {
		'''
		«IF s.shapeLayout.proportional != null»
		sprayStyle.setProportional(«s.shapeLayout.proportional»);	   
		«ELSE»
		sprayStyle.setProportional(false);
		«ENDIF»		
		«IF s.shapeLayout.stretchH != null»
		sprayStyle.setStretchH(«s.shapeLayout.stretchH»);	   
		«ELSE»
		sprayStyle.setStretchH(false);	   
		«ENDIF»		
		«IF s.shapeLayout.stretchV != null»
		sprayStyle.setStretchV(«s.shapeLayout.stretchH»);	   
		«ELSE»
		sprayStyle.setStretchV(false);	   
		«ENDIF»		
		'''
	}
	
}