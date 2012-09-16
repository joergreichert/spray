package org.eclipselabs.spray.shapes.generator

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeLayoutGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeGenerator
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.generator.shapes.ShapeEnumGenerator
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipselabs.spray.xtext.generator.DefaultCompilationUnitImportManager
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.mm.pictograms.ContainerShape
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle
import org.eclipse.graphiti.mm.pictograms.Diagram

class GeneratorShapeDefinition {
	@Inject extension DefaultCompilationUnitImportManager importManager
    @Inject extension TypeReferences typeReferences
	
	@Inject extension ShapeTypeGenerator shapeTypeGenerator
	@Inject extension ShapeLayoutGenerator shapeLayoutGenerator
	@Inject extension ShapeAnchorGenerator shapeAnchorGenerator
	@Inject extension ShapeEnumGenerator shapeEnumGenerator
	
	def packageName() { "org.eclipselabs.spray.shapes" }
	def packagePath() { "org/eclipselabs/spray/shapes/" }
	def filepath(ShapeDefinition s) { packagePath + s.className + ".java" }
	def className(ShapeDefinition s) { s.name.toFirstUpper }
	
	private ShapeDefinition current = null 
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(shape : resource.allContents.toIterable.filter(typeof(ShapeDefinition))) {
    		// create the Shapes
			current = shape
			shapeLayoutGenerator.current = shape
			shapeTypeGenerator.current = shape
			importManager.enter(packageName)
			importManager.registerShapeImports(shape)
            fsa.generateFile(filepath(shape), new FakeTreeAppendable().compile(shape).content)
			importManager.exit
   		}
	}
	
	def setCurrent(ShapeDefinition aShape) {
		this.current = aShape
	}
	

	def ITreeAppendable compile(ITreeAppendable appendable, ShapeDefinition s) { 
		var appendable1 = appendable.append('''
		«s.head»
		
		''') appendable1 = appendable1.body(s)
		appendable1
	}
	 
	def head(ShapeDefinition s) {
	 	'''
		/**
		 * This is a generated Shape for Spray
		 */
		package «packageName()»;
		
		«importManager.insertImports»
		
		'''
	 }
	 
	 def registerShapeImports(DefaultCompilationUnitImportManager importManager, ShapeDefinition s) {
	 	this.importManager = importManager
		importManager.addImports(	
			"java.util.List",
			"java.util.ArrayList",
			"org.eclipse.graphiti.mm.algorithms.styles.Point",
			"org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm",
			
			"org.eclipse.graphiti.features.*",
			"org.eclipse.graphiti.features.context.IAddContext",
			"org.eclipse.graphiti.features.impl.AbstractAddShapeFeature",
			"org.eclipse.graphiti.services.Graphiti",
			"org.eclipse.graphiti.services.IGaService",
			"org.eclipse.graphiti.services.IPeService",
			"org.eclipse.graphiti.services.IPeCreateService",
			"org.eclipse.graphiti.util.ColorConstant",
			"org.eclipse.graphiti.util.IColorConstant",
			
			"org.eclipse.graphiti.mm.pictograms.*",
			"org.eclipse.graphiti.mm.algorithms.*",
			"org.eclipse.graphiti.mm.algorithms.styles.*",
			
			"org.eclipselabs.spray.runtime.graphiti.ISprayConstants",
			"org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape",
			"org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager",
			"org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle"
	 	)
	 }
	 
	 def defaultSprayShapeType() {  findDeclaredType(typeof(DefaultSprayShape), current)  }
	 def iFeatureProviderType() {  findDeclaredType(typeof(IFeatureProvider), current)  }
	 def containerShapeType() {  findDeclaredType(typeof(ContainerShape), current)  }
	 def iSprayStyleType() {  findDeclaredType(typeof(ISprayStyle), current)  }
	 def diagramType() {  findDeclaredType(typeof(Diagram), current)  }
	 
	 def ITreeAppendable body(ITreeAppendable appendable, ShapeDefinition s) {
		var appendable1 = appendable.append('''
		@SuppressWarnings("all")
		public class «s.className» extends ''').append(defaultSprayShapeType).append(''' {
		    
			''')  appendable1 = appendable1.append(s.generateTextIdsEnum) appendable1 = appendable1.append('''
			
			public «s.className»(''').append(iFeatureProviderType).append(''' fp) {
				super(fp);
			}
			
			@Override
			public ''').append(containerShapeType).append(''' getShape(''').append(containerShapeType).append(''' targetContainer, ''').append(iSprayStyleType).append(''' sprayStyle) {
				// Create a ContainerShape for this Shape
				''').append(diagramType).append(''' diagram = peService.getDiagramForShape(targetContainer);
				''').append(containerShapeType).append(''' containerShape = peCreateService.createContainerShape(targetContainer, true);
				
				// define general layout for ContainerShape
				''') appendable1 = appendable1.append(s.generateLayout) appendable1 = appendable1.append('''
				
				// creates the cascaded elements (figures)
				''') appendable1 = appendable1.generateCascadedElements(s) appendable1 = appendable1.append('''
				
				// creates the anchors
				''') appendable1 = appendable1.append(s.createAnchorPoints) appendable1 = appendable1.append('''
				
				return containerShape;
			}

			''') appendable1 = appendable1.generateGetLayoutMethod(s)
			
//			«FOR param : s.param»
//			«param.parameterType.qualifiedName» «param.name»;
//			
//			public «param.parameterType.qualifiedName» get«param.name.toFirstUpper»() {
//				return this.«param.name»;
//			}
//			
//			public void set«param.name.toFirstUpper»(«param.parameterType.qualifiedName» «param.name») {
//				this.«param.name» = «param.name»;
//			}
//			«ENDFOR»
		appendable1
	}
}