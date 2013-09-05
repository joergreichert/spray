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
package org.eclipselabs.spray.shapes.generator.connections

import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.CDText
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
		for(placing : c.placing) {
			if(placing.shapeCon instanceof CDText) {
				ids.add((placing.shapeCon as CDText).body.value);
			}
		}
		ids
	}
	
}