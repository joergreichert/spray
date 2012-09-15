package org.eclipselabs.spray.styles.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipselabs.spray.styles.styles.Gradient
import org.eclipselabs.spray.styles.styles.Style

class StyleJvmModelInferrer extends AbstractModelInferrer {
	@Inject StyleTypeInferrer styleTypeInferrer
	@Inject GradientTypeInferrer gradientTypeInferrer

	def dispatch void infer(Style element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		styleTypeInferrer.infer(element, acceptor, isPrelinkingPhase)
	}

	def dispatch void infer(Gradient element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		gradientTypeInferrer.infer(element, acceptor, isPrelinkingPhase)
	}
}
