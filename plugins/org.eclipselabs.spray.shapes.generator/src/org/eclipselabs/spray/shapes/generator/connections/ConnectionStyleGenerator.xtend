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

import javax.inject.Inject
import org.eclipselabs.spray.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeStyleGenerator

class ConnectionStyleGenerator {
	
	@Inject extension ShapeTypeStyleGenerator
	
	def generateStyleForConnection(String attName, ShapestyleLayout csl) {
		return generateStyleForElement(attName, csl)
	}
}