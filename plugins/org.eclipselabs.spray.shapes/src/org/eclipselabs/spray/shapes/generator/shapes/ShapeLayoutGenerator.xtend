package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition

class ShapeLayoutGenerator {
	
	def generateLayout(ShapeDefinition s) {
		val sb = new StringBuilder()
		
		//Check if min size is set NOT IMPLEMENTED YET
		if (s.shapeLayout.minheight != null && s.shapeLayout.minwidth != null) {
			sb.append('''
			// sprayStyle.
			''')
		}
		
		//Check if max size is set NOT IMPLEMENTED YET
		if (s.shapeLayout.maxheight != null && s.shapeLayout.maxwidth != null) {
			sb.append('''
			''')
		}
		
		//Set proportional,
		if (s.shapeLayout.proportional != null) {
			sb.append('''
			sprayStyle.setProportional(«s.shapeLayout.proportional»);	   
			''')
		}else{
			sb.append('''
			sprayStyle.setProportional(false);
			''')
		}
		
		//Set strechting
		if (s.shapeLayout.stretchH != null) {
			sb.append('''
			sprayStyle.setStretchH(«s.shapeLayout.stretchH»);	   
			''')
		} else {
			sb.append('''
			sprayStyle.setStretchH(true);
			''')
		}
		
		//Set proportional, strechting
		if (s.shapeLayout.stretchV != null) {
			sb.append('''
			sprayStyle.setStretchV(«s.shapeLayout.stretchV»);	   
			''')
		} else {
			sb.append('''
			sprayStyle.setStretchV(true);
			''')
		}
		
		sb.toString
	}
	
}