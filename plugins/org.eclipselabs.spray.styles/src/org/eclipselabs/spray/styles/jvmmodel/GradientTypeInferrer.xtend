package org.eclipselabs.spray.styles.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.styles.generator.GradientGenerator
import org.eclipselabs.spray.styles.styles.Gradient

class GradientTypeInferrer {
    @Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension GradientGenerator gradientGenerator

	def void infer(Gradient element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		
		gradientGenerator.setCurrent(element)
		
		acceptor.accept(element.toClass(element.packageName + "." + element.className)).initializeLater [
			superTypes += createTypeRef(superType)
			superTypes += createTypeRef(interfaceType)
			
			documentation = "Description: " + element.description
			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
			
			members += element.toMethod("getGradientColoredAreas", createTypeRef(gradientColoredAreasType)) [
              documentation = "This method returns the gradient color area.\n Description: " + element.description
              body = [append('''
		         final «gradientColoredAreasType» gradientColoredAreas = «stylesFactoryType».eINSTANCE.createGradientColoredAreas();
		         final «eListType»<«gradientColoredAreaType»> gcas = gradientColoredAreas.getGradientColor();
		         «element.layout.createColorAreas»
		         return gradientColoredAreas;
              ''')]
            ]
		]
	}	
}