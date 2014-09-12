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
package org.eclipselabs.spray.styles.jvmmodel

import javax.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.access.IJvmTypeProvider$Factory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle
import org.eclipselabs.spray.styles.Gradient
import org.eclipselabs.spray.styles.Style
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient
import org.eclipselabs.spray.generator.common.ProjectProperties

class StyleJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension IJvmTypeProvider$Factory typeProviderFactory

	def void infer(Style element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		val JvmTypeReference superTypeRef = element.calculateSuperTypeRef
		val typeProvider = typeProviderFactory.createTypeProvider
		var existingClass = typeProvider.findTypeByName(element.packageName + "." + element.className)
		if(existingClass == null) {
			acceptor.accept(element.toClass(element.packageName + "." + element.className)) [
				if(superTypeRef != null) superTypes += superTypeRef.cloneWithProxies
			]
		} else {
			if(existingClass instanceof JvmDeclaredType) {
				element.associate(existingClass)
				acceptor.accept(existingClass)
			}
		}
	}

	def void infer(Gradient element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		val typeProvider = typeProviderFactory.createTypeProvider
		var existingClass = typeProvider.findTypeByName(element.packageName + "." + element.className)
		if(existingClass == null) {
			acceptor.accept(element.toClass(element.packageName + "." + element.className))
		} else {
			if(existingClass instanceof JvmDeclaredType) {
				element.associate(existingClass)
				acceptor.accept(existingClass)
			}
		}
	}
	
	def dispatch String getPackageName(Style style) {
		ProjectProperties::stylesPackage
	}
	
	def dispatch String getPackageName(Gradient gradient) {
		ProjectProperties::gradientsPackage
	}	
	
	def dispatch String getClassName(Style style) {
		style.name.toFirstUpper
	}
	
	def dispatch String getClassName(Gradient gradient) {
		gradient.name.toFirstUpper
	}	
	
	def dispatch JvmTypeReference calculateSuperTypeRef(Style style) {
		var JvmTypeReference varSuperTypeRef = null
		if(style.superStyle != null) {
			varSuperTypeRef = cloneWithProxies(style.superStyle)
		} else {
			val superType = typeReferences.findDeclaredType(typeof(DefaultSprayStyle), style)
			if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		}
		varSuperTypeRef
	}
	
	def dispatch JvmTypeReference calculateSuperTypeRef(Gradient gradient) {
		var JvmTypeReference varSuperTypeRef = null
		val superType = typeReferences.findDeclaredType(typeof(ISprayGradient), gradient)
		if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		varSuperTypeRef
	}	
}

