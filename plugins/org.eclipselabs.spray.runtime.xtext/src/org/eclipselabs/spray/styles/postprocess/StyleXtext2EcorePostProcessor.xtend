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
package org.eclipselabs.spray.styles.postprocess

import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EcoreFactory

class StyleXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {
	
	override process(GeneratedMetamodel metamodel) {
		metamodel.EPackage.process	
	}
	
	def process(EPackage ePackage) {
		for(eEnum : ePackage.EClassifiers.filter(typeof(EEnum))) {
			eEnum.processEnum
		}
		for(c : ePackage.EClassifiers.filter(typeof(EClass))) {
			if(c.name == "StyleLayout") {
				c.processAttributes
			}
		}
	}
	
	def processAttributes(EClass eClass) {
		for(s: eClass.EStructuralFeatures) {
			if(s.name == "transparency") {
				s.setDefaultValue(Double::MIN_VALUE)
			}
			if(s.name == "lineWidth") {
				s.setDefaultValue(Integer::MIN_VALUE)
			}
			if(s.name == "lineStyle") {
				s.setDefaultValueLiteral("null")
			}
			if(s.name == "fontSize") {
				s.setDefaultValue(Integer::MIN_VALUE)
			}
			if(s.name == "fontItalic") {
				s.setDefaultValueLiteral("null")
			}
			if(s.name == "fontBold") {
				s.setDefaultValueLiteral("null")
			}
		}
	}
	
	def processEnum(EEnum eEnum) {
		eEnum.ELiterals.add(newLiteral('null', 'NULL', eEnum.ELiterals.size))
	}
	
	def newLiteral(String literal, String name, int value) {
		val enumLit = EcoreFactory::eINSTANCE.createEEnumLiteral
		enumLit.setLiteral(literal)
		enumLit.setName(name)
		enumLit.setValue(value)
		enumLit
	}
}