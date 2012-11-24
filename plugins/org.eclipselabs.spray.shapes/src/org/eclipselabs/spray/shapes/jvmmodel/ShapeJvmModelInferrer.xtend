package org.eclipselabs.spray.shapes.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.access.IJvmTypeProvider$Factory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition
import org.eclipselabs.spray.shapes.generator.GeneratorShapeDefinition
import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.ShapeDefinition

class ShapeJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension GeneratorShapeDefinition shapeGenerator
    @Inject extension GeneratorConnectionDefinition connectionGenerator
    @Inject extension IJvmTypeProvider$Factory typeProviderFactory

   	def void infer(ShapeDefinition element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val JvmTypeReference superTypeRef = element.calculateSuperTypeRef
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
   	
   	def void infer(ConnectionDefinition element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val JvmTypeReference superTypeRef = element.calculateSuperTypeRef
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
   	
	def dispatch JvmTypeReference calculateSuperTypeRef(ShapeDefinition shape) {
		var JvmTypeReference varSuperTypeRef = null
		val superType = typeReferences.findDeclaredType(typeof(DefaultSprayShape), shape)
		if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		varSuperTypeRef
	} 
	
	def dispatch JvmTypeReference calculateSuperTypeRef(ConnectionDefinition shape) {
		var JvmTypeReference varSuperTypeRef = null
		val superType = typeReferences.findDeclaredType(typeof(DefaultSprayConnection), shape)
		if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		varSuperTypeRef
	}	
	
	def dispatch String getPackageName(ShapeDefinition shapeDefinition) {
		shapeGenerator.packageName
	}
	
	def dispatch String getPackageName(ConnectionDefinition connectionDefinition) {
		connectionGenerator.packageName
	}	
	
	def dispatch String getClassName(ShapeDefinition shapeDefinition) {
		shapeGenerator.className(shapeDefinition)
	}
	
	def dispatch String getClassName(ConnectionDefinition connectionDefinition) {
		connectionGenerator.className(connectionDefinition)
	}	
}

