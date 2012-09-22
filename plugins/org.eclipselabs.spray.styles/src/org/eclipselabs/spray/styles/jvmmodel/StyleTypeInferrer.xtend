package org.eclipselabs.spray.styles.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.styles.styles.Style

class StyleTypeInferrer {
    @Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension StyleGenerator styleGenerator

	def void infer(Style element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		var JvmTypeReference varSuperTypeRef = null
		if(element.superStyle != null) {
			varSuperTypeRef = cloneWithProxies(element.superStyle)
		} else {
			val superType = typeReferences.findDeclaredType(typeof(DefaultSprayStyle), element)
			if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		}
		val superTypeRef = varSuperTypeRef
		
		styleGenerator.setCurrent(element)
		
		acceptor.accept(element.toClass(element.packageName + "." + element.className)).initializeLater [
			if(superTypeRef != null) superTypes += superTypeRef
			
			documentation = "This is a generated Style class for Spray.\nDescription: " + element.description
			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
			
			members += element.toMethod("newStyle", createTypeRef(styleType)) [
              documentation = "This method creates a Style and returns the defined style.\n Description: " + element.description
              annotations += element.toAnnotation(typeof(Override))
              parameters += element.toParameter("diagram", createTypeRef(diagramType))
              body = [ 
              	val appender = append(iGaServiceType).append(" gaService = ").append(graphitiType).append('''.getGaService();
				
				// Creating Style with given id and description
				''').append(styleType).append(''' style = super.newStyle(diagram);
				style.setId("«element.name»");
				style.setDescription("«element.description»");
				
				''')
				
				val newAppender = if(element.layout != null) appender.createLayout(element.layout) else appender.newLine 
				
				newAppender.append('''
				return style;
              ''')]
            ]
			
			members += element.toMethod("getFontColor", createTypeRef(colorType)) [
              documentation = 
             	'''This method returns the font color for the style. 
			 	The font color will be returned separated, because Graphiti allows just the foreground color.
			 	The foreground color will be used for lines and fonts at the same time.'''
              annotations += element.toAnnotation(typeof(Override))
              parameters += element.toParameter("aDiagram", createTypeRef(diagramType))
              body = [ 
              	if(element.layout != null) {
					createFontColor(element.layout)
				}
              ]
            ]
			
			members += element.toMethod("getColorSchema", createTypeRef(adaptedGradientColoredAreasType)) [
              documentation = "This method returns Color Schema of the Style"
              body = [
              	if(element.layout != null) {
              		createStyleColorSchema(element.layout)
              	}
              ]
            ]
		]
	}
}