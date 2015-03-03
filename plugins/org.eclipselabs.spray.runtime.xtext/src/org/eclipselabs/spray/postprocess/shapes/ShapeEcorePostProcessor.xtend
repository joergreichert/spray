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
package org.eclipselabs.spray.postprocess.shapes

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor

class ShapeEcorePostProcessor implements IXtext2EcorePostProcessor {
	
	override process(GeneratedMetamodel metamodel) {
		metamodel.EPackage.process	
	}
	
	def process(EPackage ePackage) {
		for(c : ePackage.EClassifiers.filter(typeof(EClass))) {
			if(c.name == "PlacingDefinition") {
				c.processAttributes
			}
		}
	}
	
	def processAttributes(EClass eClass) {
		for(s: eClass.EStructuralFeatures) {
			if(s.name == "offset") {
				s.setDefaultValue(Double::MIN_VALUE)
			}
		}
	}
	
}