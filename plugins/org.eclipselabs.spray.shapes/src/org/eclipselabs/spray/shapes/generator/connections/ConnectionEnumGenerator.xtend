package org.eclipselabs.spray.shapes.generator.connections

import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.CDText
import java.util.ArrayList

class ConnectionEnumGenerator {
		
	def generateTextIdsEnum(ConnectionDefinition c) {
		val ids = c.searchTextIds
		'''
		public static enum TextIds {
			«FOR id : ids»
				«IF !(ids.last == id)»
					«id»,
				«ELSE»
					«id»
				«ENDIF»
			«ENDFOR»
		}
		'''
	}
	
	def searchTextIds(ConnectionDefinition c) {
		val ids = new ArrayList<String>();
		if(c.placing != null) {
			for(placing : c.placing) {
				if(placing.shapeCon instanceof CDText) {
					ids.add((placing.shapeCon as CDText).body.value);
				}
			}
		}
		ids
	}	
}