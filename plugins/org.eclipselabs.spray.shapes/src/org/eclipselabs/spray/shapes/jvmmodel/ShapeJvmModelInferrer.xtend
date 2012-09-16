package org.eclipselabs.spray.shapes.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition

class ShapeJvmModelInferrer extends AbstractModelInferrer {

	@Inject ShapeDefinitionTypeInferrer shapeTypeInferrer
	@Inject ConnectionDefinitionTypeInferrer connectionTypeInferrer

	def dispatch void infer(ShapeDefinition element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		shapeTypeInferrer.infer(element, acceptor, isPrelinkingPhase)
	}

	def dispatch void infer(ConnectionDefinition element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		connectionTypeInferrer.infer(element, acceptor, isPrelinkingPhase)
	}
}
