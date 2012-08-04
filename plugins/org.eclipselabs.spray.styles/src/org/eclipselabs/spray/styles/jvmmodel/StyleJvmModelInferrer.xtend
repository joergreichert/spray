package org.eclipselabs.spray.styles.jvmmodel

import com.google.inject.Inject
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipse.graphiti.util.PredefinedColoredAreas
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient
import org.eclipselabs.spray.styles.generator.GradientGenerator
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.styles.styles.Color
import org.eclipselabs.spray.styles.styles.Gradient
import org.eclipselabs.spray.styles.styles.Style

class StyleJvmModelInferrer extends AbstractModelInferrer {
    @Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension StyleGenerator
    @Inject extension GradientGenerator

//	def dispatch void infer(Style element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
//		var JvmTypeReference varSuperTypeRef = null
//		if(element.superStyle != null) {
//			varSuperTypeRef = cloneWithProxies(element.superStyle)
//		} else {
//			val superType = typeReferences.findDeclaredType(typeof(DefaultSprayStyle), element)
//			varSuperTypeRef = typeReferences.createTypeRef(superType)
//		}
//		val superTypeRef = varSuperTypeRef
//		
//		val styleType = findDeclaredType(typeof(Style), element)
//		val diagramType = findDeclaredType(typeof(Diagram), element)
//		val colorType = findDeclaredType(typeof(Color), element)
//		val adaptedGradientColoredAreasType = findDeclaredType(typeof(AdaptedGradientColoredAreas), element)
//		
//		acceptor.accept(element.toClass(element.packageName + "." + element.className)).initializeLater [
//			superTypes += superTypeRef
//			
//			documentation = "This is a generated Style class for Spray.\nDescription: " + element.description
//			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
//			
//			members += element.toMethod("newStyle", createTypeRef(styleType)) [
//              documentation = "This method creates a Style and returns the defined style.\n Description: " + element.description
//              annotations += element.toAnnotation(typeof(Override))
//              parameters += element.toParameter("diagram", createTypeRef(diagramType))
//              body = [append('''
//				IGaService gaService = Graphiti.getGaService();
//				
//				// Creating Style with given id and description
//				Style style = super.newStyle(diagram);
//				style.setId("«element.name»");
//				style.setDescription("«element.description»");
//				
//				«element.layout.createLayout»
//				return style;
//              ''')]
//            ]
//			
//			members += element.toMethod("getFontColor", createTypeRef(colorType)) [
//              documentation = 
//             	'''This method returns the font color for the style. 
//			 	The font color will be returned separated, because Graphiti allows just the foreground color.
//			 	The foreground color will be used for lines and fonts at the same time.'''
//              annotations += element.toAnnotation(typeof(Override))
//              parameters += element.toParameter("diagram", createTypeRef(diagramType))
//              body = [append('''
//				«element.layout.createFontColor»
//              ''')]
//            ]
//			
//			members += element.toMethod("getColorSchema", createTypeRef(adaptedGradientColoredAreasType)) [
//              documentation = "This method returns Color Schema of the Style"
//              body = [append('''
//				«element.layout.createStyleColorSchema»
//              ''')]
//            ]
//		]
//	}
//
//	def dispatch void infer(Gradient element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
//        
//		val superType = findDeclaredType(typeof(PredefinedColoredAreas), element)
//		val interfaceType = findDeclaredType(typeof(ISprayGradient), element)
//		val gradientColoredAreasType = findDeclaredType(typeof(GradientColoredAreas), element)
//		
//		acceptor.accept(element.toClass(element.packageName + "." + element.className)).initializeLater [
//			superTypes += createTypeRef(superType)
//			superTypes += createTypeRef(interfaceType)
//			
//			documentation = "Description: " + element.description
//			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
//			
//			members += element.toMethod("getGradientColoredAreas", createTypeRef(gradientColoredAreasType)) [
//              documentation = "This method returns the gradient color area.\n Description: " + element.description
//              body = [append('''
//		         final GradientColoredAreas gradientColoredAreas = org.eclipse.graphiti.mm.algorithms.styles.StylesFactory.eINSTANCE.createGradientColoredAreas();
//		         final org.eclipse.emf.common.util.EList<org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();
//		         «element.layout.createColorAreas»
//		         return gradientColoredAreas;
//              ''')]
//            ]
//		]
//	}
}
