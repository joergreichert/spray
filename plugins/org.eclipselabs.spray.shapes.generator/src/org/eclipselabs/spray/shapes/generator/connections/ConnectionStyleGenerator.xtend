package org.eclipselabs.spray.shapes.generator.connections

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeStyleGenerator

class ConnectionStyleGenerator {
	
	@Inject extension ShapeTypeStyleGenerator
	
	def generateStyleForConnection(String attName, ShapestyleLayout csl) {
		return generateStyleForElement(attName, csl)
	}
}