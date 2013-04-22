package org.eclipselabs.spray.shapes.generator

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.ConnectionStyle
import org.eclipselabs.spray.shapes.generator.connections.ConnectionEnumGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator
import org.eclipselabs.spray.generator.common.ProjectProperties

class GeneratorConnectionDefinition {
	
	@Inject extension ConnectionStyleGenerator
	@Inject extension ConnectionPlacingGenerator
	@Inject extension ConnectionEnumGenerator
	
	def packageName() { ProjectProperties::shapesPackage }
	def packagePath() { ProjectProperties::toPath(ProjectProperties::shapesPackage)  }
	def filepath(ConnectionDefinition c) { packagePath + c.className + ".java" }
	def gapClassName(ConnectionDefinition c) { c.name.toFirstUpper }
	def className(ConnectionDefinition c) { c.gapClassName + "Base" }
	
	def compile(ConnectionDefinition c) {
		'''
		«c.head»
		
		«c.body»
		'''
	}
	
	def head(ConnectionDefinition c) {
	 	'''
		/**
		 * This is a generated Shape for Spray
		 */
		package «packageName»;
		
		import java.util.ArrayList;
		import java.util.List;

		import org.eclipse.graphiti.features.*;
		import org.eclipse.graphiti.mm.algorithms.*;
		import org.eclipse.graphiti.mm.algorithms.styles.*;
		import org.eclipse.graphiti.mm.pictograms.*;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.services.IPeService;
		import org.eclipse.graphiti.services.IPeCreateService;
		import org.eclipse.graphiti.util.IColorConstant;
		
		import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
		import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
		import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection;

		'''
	 }
	
	def body(ConnectionDefinition c) {
		'''
		@SuppressWarnings("all")
		public class «c.className» extends DefaultSprayConnection {
			
			private IGaService gaService = Graphiti.getGaService();
			private IPeService peService = Graphiti.getPeService();
			private IPeCreateService peCreateService = Graphiti.getPeCreateService();
			
			«c.generateTextIdsEnum»
		    
		    public «c.className»(final IFeatureProvider fp) {
				super(fp);
			}
		    
			@Override
			public Connection getConnection(final Diagram diagram, final ISprayStyle sprayStyle, final Anchor startAnchor, final Anchor endAnchor) {
				«IF c.connectionStyle == null»
				final Connection newConnection = peCreateService.createFreeFormConnection(diagram);
				«ELSE»
					«IF c.connectionStyle == ConnectionStyle::FREEFORM»
					final Connection newConnection = peCreateService.createFreeFormConnection(diagram);
					«ELSEIF c.connectionStyle == ConnectionStyle::MANHATTEN»
					final Connection newConnection = peCreateService.createManhattanConnection(diagram);
					«ENDIF»
				«ENDIF»
				newConnection.setStart(startAnchor);
				newConnection.setEnd(endAnchor);
				
				final Polyline polyline = gaService.createPolyline(newConnection);
				polyline.setStyle(sprayStyle.getStyle(diagram));

				// Define general layout of connection
				«generateStyleForConnection("polyline", c.layout)»
				
				// Set the Placings of the connection
				«FOR place : c.placing»
					«place.generatePlacing»
				«ENDFOR»
				
				return newConnection;
			}
«««			«FOR param : c.param»
«««			«param.parameterType.qualifiedName» «param.name»;
«««			
«««			public «param.parameterType.qualifiedName» get«param.name.toFirstUpper»() {
«««				return this.«param.name»;
«««			}
«««			
«««			public void set«param.name.toFirstUpper»(final «param.parameterType.qualifiedName» «param.name») {
«««				this.«param.name» = «param.name»;
«««			}
«««			«ENDFOR»
		}
		'''
	}
	
}