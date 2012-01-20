package org.eclipselabs.spray.shapes.generator

import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import com.google.inject.Inject
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator
import org.eclipselabs.spray.shapes.shapes.ConnectionStyle

class GeneratorConnectionDefinition {
	
	@Inject extension ConnectionStyleGenerator styleGenerator
	@Inject extension ConnectionPlacingGenerator placingGenerator
	
	def packageName() { "org.eclipselabs.spray.shapes" }
	def packagePath() { "org/eclipselabs/spray/shapes/" }
	def filepath(ConnectionDefinition c) { packagePath + c.className + ".java" }
	def className(ConnectionDefinition c) { c.name.toFirstUpper }
	
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
		package org.eclipselabs.spray.shapes;
		
		import java.util.ArrayList;
		import java.util.List;

		import org.eclipse.graphiti.mm.algorithms.*;
		import org.eclipse.graphiti.mm.algorithms.styles.*;
		import org.eclipse.graphiti.mm.pictograms.*;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.services.IPeCreateService;
		import org.eclipse.graphiti.util.IColorConstant;
		
		import org.eclipselabs.spray.styles.ISprayStyle;

		'''
	 }
	
	def body(ConnectionDefinition c) {
		'''
		@SuppressWarnings("all")
		public class «c.className» extends DefaultSprayConnection {
			
			private IGaService gaService = Graphiti.getGaService();
			private IPeCreateService peCreateService = Graphiti.getPeCreateService();
		    
			@Override
			public Connection getConnection(Diagram diagram, ISprayStyle iSprayStyle, Anchor startAnchor, Anchor endAnchor) {
				Style sprayStyle = iSprayStyle.getStyle(diagram);
				
				«IF c.connectionStyle == null»
				Connection newConnection = peCreateService.createFreeFormConnection(diagram);
				«ELSE»
					«IF c.connectionStyle == ConnectionStyle::FREEFORM»
					Connection newConnection = peCreateService.createFreeFormConnection(diagram);
					«ELSEIF c.connectionStyle == ConnectionStyle::MANHATTEN»
					Connection newConnection = peCreateService.createManhattanConnection(diagram);
					«ENDIF»
				«ENDIF»
				newConnection.setStart(startAnchor);
				newConnection.setEnd(endAnchor);
				
				Polyline polyline = gaService.createPolyline(newConnection);
				polyline.setStyle(sprayStyle);

				// Define general layout of connection
				«generateStyleForConnection("polyline", c.layout)»
				
				// Set the Placings of the connection
				«FOR place : c.placing»
					«place.generatePlacing»
				«ENDFOR»
				
				return newConnection;
			}
		}
		'''
	}
	
}