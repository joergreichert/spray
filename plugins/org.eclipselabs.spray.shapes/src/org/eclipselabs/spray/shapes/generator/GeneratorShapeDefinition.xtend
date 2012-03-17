package org.eclipselabs.spray.shapes.generator

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeLayoutGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeGenerator
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition

class GeneratorShapeDefinition {
	
	@Inject extension ShapeTypeGenerator typeGenerator
	@Inject extension ShapeLayoutGenerator layoutGenerator
	@Inject extension ShapeAnchorGenerator anchorGenerator
	
	def packageName() { "org.eclipselabs.spray.shapes" }
	def packagePath() { "org/eclipselabs/spray/shapes/" }
	def filepath(ShapeDefinition s) { packagePath + s.className + ".java" }
	def className(ShapeDefinition s) { s.name.toFirstUpper }

	def compile(ShapeDefinition s) { 
		'''
		«s.head»
		
		«s.body»
		'''
	}
	 
	def head(ShapeDefinition s) {
	 	'''
		/**
		 * This is a generated Shape for Spray
		 */
		package org.eclipselabs.spray.shapes;
		
		import java.util.List;
		import java.util.ArrayList;
		import org.eclipse.graphiti.mm.algorithms.styles.Point;
		import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
		
		import org.eclipse.graphiti.features.context.IAddContext;
		import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.services.IPeCreateService;
		import org.eclipse.graphiti.util.ColorConstant;
		import org.eclipse.graphiti.util.IColorConstant;
		
		import org.eclipse.graphiti.mm.pictograms.*;
		import org.eclipse.graphiti.mm.algorithms.*;
		import org.eclipse.graphiti.mm.algorithms.styles.*;
		
		import org.eclipselabs.spray.styles.ISprayStyle;
		'''
	 }
	 
	 def body(ShapeDefinition s) {
		'''
		@SuppressWarnings("all")
		public class «s.className» extends DefaultSprayShape {
		    
			private IGaService gaService = Graphiti.getGaService();
			private IPeCreateService peCreateService = Graphiti.getPeCreateService();
				

			@Override
			public ContainerShape getShape(Diagram diagram, ISprayStyle sprayStyle) {
				ContainerShape containerShape = super.getShape(diagram, sprayStyle);
				
				// Creating the Anchorpoints
				«s.createAnchorPoints»
				
				return containerShape;
			}

			@Override
			public GraphicsAlgorithm getShape(Diagram diagram, PictogramElement pictogramElement, ISprayStyle sprayStyle) {
				// Define general layout
				«s.generateLayout»
				
				// Creating the different figures
				«s.generateCascadedElements»
				
				return invisibleRectangle;
			}
			
			«FOR param : s.param»
			«param.parameterType.qualifiedName» «param.name»;
			
			public «param.parameterType.qualifiedName» get«param.name.toFirstUpper»() {
				return this.«param.name»;
			}
			
			public void set«param.name.toFirstUpper»(«param.parameterType.qualifiedName» «param.name») {
				this.«param.name» = «param.name»;
			}
			«ENDFOR»
		}
		'''
	}
	
}