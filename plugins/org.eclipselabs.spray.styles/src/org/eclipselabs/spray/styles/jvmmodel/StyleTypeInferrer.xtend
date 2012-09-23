package org.eclipselabs.spray.styles.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.styles.styles.Style
import org.eclipse.graphiti.mm.pictograms.Diagram

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
			if(superTypeRef != null) superTypes += superTypeRef.cloneWithProxies
			
			documentation = "This is a generated Style class for Spray." + (if(!element.description.nullOrEmpty) "\nDescription: " + element.description else "")
			annotations += toAnnotation(typeof(SuppressWarnings), "all")
			
			members += toMethod("newStyle", createTypeRef(styleType)) [
              	documentation = "This method creates a Style and returns the defined style.\n Description: " + element.description
              	annotations += element.toAnnotation(typeof(Override))
              	parameters += toParameter("diagram", element.newTypeRef(typeof(Diagram)))
              	body = [ 
					var appender = append(iGaServiceType).append(" gaService = ").append(graphitiType).append('''.getGaService();''').newLine
					appender = appender.newLine
					appender = appender.append('''// Creating Style with given id and description''').newLine
					appender = appender.append(styleType).append(''' style = super.newStyle(diagram);''').newLine
					appender = appender.append('''style.setId("«element.name»");''').newLine
					appender = appender.append('''style.setDescription("«element.description»");''').newLine
					if(element.layout != null) appender = appender.createLayout(element.layout) else appender = appender.newLine 
					appender = appender.append('''return style;''')
			  	]
            ]
			
			members += toMethod("getFontColor", createTypeRef(colorType)) [
              	documentation = 
             		'''This method returns the font color for the style. 
			 		The font color will be returned separated, because Graphiti allows just the foreground color.
			 		The foreground color will be used for lines and fonts at the same time.'''
              	annotations += element.toAnnotation(typeof(Override))
              	parameters += toParameter("aDiagram", element.newTypeRef(typeof(Diagram)))
              	body = [ 
              		if(element.layout != null) {
						createFontColor(element.layout)
					}
              	]
            ]
			
			members += toMethod("getColorSchema", createTypeRef(adaptedGradientColoredAreasType)) [
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