package org.eclipselabs.spray.shapes.generator.connections

import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition

class ConnectionEnumGenerator {
		
	def generateTextIdsEnum(ConnectionDefinition c) '''
		public static enum TextIds {
			test,
			test1,
			test2
		}
	'''
	
}