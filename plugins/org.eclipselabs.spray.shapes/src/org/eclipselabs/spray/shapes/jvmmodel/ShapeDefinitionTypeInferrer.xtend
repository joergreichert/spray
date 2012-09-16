package org.eclipselabs.spray.shapes.jvmmodel

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.shapes.generator.GeneratorShapeDefinition
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeLayoutGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeEnumGenerator

class ShapeDefinitionTypeInferrer {
    @Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension GeneratorShapeDefinition shapeGenerator
	@Inject extension ShapeTypeGenerator shapeTypeGenerator
	@Inject extension ShapeLayoutGenerator shapeLayoutGenerator
	@Inject extension ShapeAnchorGenerator shapeAnchorGenerator
	@Inject extension ShapeEnumGenerator shapeEnumGenerator 

	def void infer(ShapeDefinition element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		shapeGenerator.setCurrent(element)
		shapeLayoutGenerator.current = element
		shapeTypeGenerator.current = element
		shapeAnchorGenerator.current = element

		var JvmTypeReference varSuperTypeRef = null
		val superType = defaultSprayShapeType
		if(superType != null) varSuperTypeRef = typeReferences.createTypeRef(superType)
		val superTypeRef = varSuperTypeRef		
		
		val ids = element.searchTextIds
		if(ids.size > 0) {
			acceptor.accept(element.toEnumerationType(packageName + "." + element.className + "TextIds") [
				for (id : ids) {
					members += element.toEnumerationLiteral(id)
				}
			])	
		}
				
		acceptor.accept(element.toClass(packageName + "." + element.className)).initializeLater [
			if(superTypeRef != null) superTypes += superTypeRef
			
			documentation = "This is a generated Shape class for Spray.\nDescription: " + element.description
			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
			
			members += element.toConstructor [
				parameters += element.toParameter("fp", createTypeRef(iFeatureProviderType))
				body = [
					append("super(fp);")
				]
			]
			
			members += element.toMethod("getShape", createTypeRef(containerShapeType)) [
              annotations += element.toAnnotation(typeof(Override))
              parameters += element.toParameter("targetContainer", createTypeRef(containerShapeType))
              parameters += element.toParameter("sprayStyle", createTypeRef(iSprayStyleType))
              body = [ 
				var appendable1 = append('''// Create a ContainerShape for this Shape
				''').append(diagramType).append(''' diagram = peService.getDiagramForShape(targetContainer);
				''').append(containerShapeType).append(''' containerShape = peCreateService.createContainerShape(targetContainer, true);
				
				// define general layout for ContainerShape
				''') appendable1 = appendable1.append(element.generateLayout) appendable1 = appendable1.append('''
				
				// creates the cascaded elements (figures)
				''') appendable1 = appendable1.generateCascadedElements(element) appendable1 = appendable1.append('''
				
				// creates the anchors
				''') appendable1 = appendable1.createAnchorPoints(element) appendable1 = appendable1.append('''
				
				return containerShape;
              ''')]
            ]
			
			members += element.toMethod("getShapeLayout", createTypeRef(sprayLayoutManagerType)) [
              body = [ 
				append(sprayLayoutManagerType).append(''' layoutManager = new ''').append(sprayLayoutManagerType).append('''();
				«IF element.shapeLayout.minwidth != 0»
					layoutManager.setMinSizeWidth(«element.shapeLayout.minwidth»);	   
				«ELSE»
					layoutManager.setMinSizeWidth(-1);	
				«ENDIF»	
				«IF element.shapeLayout.maxwidth != 0»
					layoutManager.setMaxSizeWidth(«element.shapeLayout.maxwidth»);	   
				«ELSE»
					layoutManager.setMaxSizeWidth(-1);	
				«ENDIF»	
				«IF element.shapeLayout.minheight != 0»
					layoutManager.setMinSizeHeight(«element.shapeLayout.minheight»);	   
				«ELSE»
					layoutManager.setMinSizeHeight(-1);	
				«ENDIF»	
				«IF element.shapeLayout.maxheight != 0»
					layoutManager.setMaxSizeHeight(«element.shapeLayout.maxheight»);	   
				«ELSE»
					layoutManager.setMaxSizeHeight(-1);	
				«ENDIF»	
				«IF element.shapeLayout.stretchH != null»
					layoutManager.setStretchHorizontal(«element.shapeLayout.stretchH»); 
				«ELSE»
					layoutManager.setStretchHorizontal(true);		   
				«ENDIF»		
				«IF element.shapeLayout.stretchV != null»
					layoutManager.setStretchVertical(«element.shapeLayout.stretchV»);	   
				«ELSE»
					layoutManager.setStretchHorizontal(true);	   
				«ENDIF»		
				return layoutManager;''')
              ]
            ]
		]
	}	
}