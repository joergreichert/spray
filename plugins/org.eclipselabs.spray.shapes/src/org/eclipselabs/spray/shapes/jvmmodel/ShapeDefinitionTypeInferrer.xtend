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
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle
import org.eclipse.graphiti.mm.pictograms.ContainerShape

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
		val superType = shapeGenerator.defaultSprayShapeType
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
			if(superTypeRef != null) superTypes += superTypeRef.cloneWithProxies
			
			documentation = "This is a generated Shape class for Spray.\nDescription: " + element.description
			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
			
			val fp = element.newTypeRef(typeof(IFeatureProvider))
			
			members += element.toConstructor [
				parameters += element.toParameter("featureProvider" + element.name.toFirstUpper, fp)
				body = [
					append("super(featureProvider" + element.name.toFirstUpper + ");")
				]
			]
			
			val targetContainer = element.newTypeRef(typeof(ContainerShape))
			val sprayStyle = element.newTypeRef(typeof(ISprayStyle))
			
			members += element.toMethod("getShape", createTypeRef(shapeGenerator.containerShapeType)) [
				annotations += element.toAnnotation(typeof(Override))
				parameters += element.toParameter("targetContainer" + element.name.toFirstUpper, targetContainer)
				parameters += element.toParameter("sprayStyle" + element.name.toFirstUpper, sprayStyle)
				body = [ 
					var appendable = append('''// Create a ContainerShape for this Shape''').newLine
					appendable = appendable.append(shapeGenerator.containerShapeType).append(''' targetContainer = targetContainer''' + element.name.toFirstUpper + ''';''').newLine
					appendable = appendable.append(shapeGenerator.iSprayStyleType).append(''' sprayStyle = sprayStyle''' + element.name.toFirstUpper + ''';''').newLine
					appendable = appendable.append(shapeGenerator.diagramType).append(''' diagram = peService.getDiagramForShape(targetContainer);''').newLine
					appendable = appendable.append(shapeGenerator.containerShapeType).append(''' containerShape = peCreateService.createContainerShape(targetContainer, true);''').newLine
					appendable = appendable.newLine
					appendable = appendable.append('''// define general layout for ContainerShape''').newLine
					appendable = appendable.append(element.generateLayout).newLine
					appendable = appendable.newLine
					appendable = appendable.append('''// creates the cascaded elements (figures)''').newLine
					appendable = appendable.generateCascadedElements(element).newLine
					appendable = appendable.newLine
					appendable = appendable.append('''// creates the anchors''').newLine
					appendable = appendable.createAnchorPoints(element).newLine
					appendable = appendable.newLine
					appendable = appendable.append('''return containerShape;''')
              	]
            ]
			
			members += element.toMethod("getShapeLayout", createTypeRef(shapeLayoutGenerator.sprayLayoutManagerType)) [
				body = [ 
					var appendable = append(sprayLayoutManagerType).append(''' layoutManager = new ''').append(sprayLayoutManagerType).append('''();''').newLine
					if (element.shapeLayout.minwidth != 0) {
						appendable = appendable.append('''layoutManager.setMinSizeWidth(«element.shapeLayout.minwidth»);''').newLine
					} else {
						appendable = appendable.append('''layoutManager.setMinSizeWidth(-1);''').newLine
					}	
					if (element.shapeLayout.maxwidth != 0) {
						appendable = appendable.append('''layoutManager.setMaxSizeWidth(«element.shapeLayout.maxwidth»);''').newLine
					} else {
						appendable = appendable.append('''layoutManager.setMaxSizeWidth(-1);''').newLine
					}
					if (element.shapeLayout.minheight != 0) {
						appendable = appendable.append('''layoutManager.setMinSizeHeight(«element.shapeLayout.minheight»);''').newLine
					} else {
						appendable = appendable.append('''layoutManager.setMinSizeHeight(-1);''').newLine
					}	
					if (element.shapeLayout.maxheight != 0) {
						appendable = appendable.append('''layoutManager.setMaxSizeHeight(«element.shapeLayout.maxheight»);''').newLine
					} else {
						appendable = appendable.append('''layoutManager.setMaxSizeHeight(-1);''').newLine
					}	
					if (element.shapeLayout.stretchH != null) {
						appendable = appendable.append('''layoutManager.setStretchHorizontal(«element.shapeLayout.stretchH»);''').newLine
					} else {
						appendable = appendable.append('''layoutManager.setStretchHorizontal(true);''').newLine
					}		
					if (element.shapeLayout.stretchV != null) {
						appendable = appendable.append('''layoutManager.setStretchVertical(«element.shapeLayout.stretchV»);''').newLine
					} else {
						appendable = appendable.append('''layoutManager.setStretchHorizontal(true);''').newLine
					}		
					appendable = appendable.append('''return layoutManager;''').newLine
				]
            ]
		]
	}	
}