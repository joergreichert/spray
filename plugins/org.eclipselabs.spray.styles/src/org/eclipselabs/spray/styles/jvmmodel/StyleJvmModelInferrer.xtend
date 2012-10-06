package org.eclipselabs.spray.styles.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.styles.styles.Style
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator

class StyleJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension StyleGenerator styleGenerator
    @Inject extension IJvmTypeProvider$Factory typeProviderFactory
    @Inject extension IJvmModelAssociator associator

	def void infer(Style element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		var JvmTypeReference varSuperTypeRef = null
		if(element.superStyle != null) {
			varSuperTypeRef = cloneWithProxies(element.superStyle)
		} else {
			val superType = typeReferences.findDeclaredType(typeof(DefaultSprayStyle), element)
			if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		}
		val superTypeRef = varSuperTypeRef
		val typeProvider = typeProviderFactory.createTypeProvider
		var existingClass = typeProvider.findTypeByName(element.packageName + "." + element.className)
		if(existingClass == null) {
			acceptor.accept(element.toClass(element.packageName + "." + element.className)).initializeLater [
				if(superTypeRef != null) superTypes += superTypeRef.cloneWithProxies
			]
		} else {
			if(existingClass instanceof JvmDeclaredType) {
				element.associate(existingClass)
				acceptor.accept(existingClass as JvmDeclaredType)
			}
		}
	}
}

