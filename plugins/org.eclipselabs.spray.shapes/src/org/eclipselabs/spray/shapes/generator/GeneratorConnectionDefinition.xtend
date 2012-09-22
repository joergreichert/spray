package org.eclipselabs.spray.shapes.generator

import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import com.google.inject.Inject
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator
import org.eclipselabs.spray.shapes.shapes.ConnectionStyle
import org.eclipselabs.spray.shapes.generator.connections.ConnectionEnumGenerator
import org.eclipselabs.spray.xtext.generator.DefaultCompilationUnitImportManager
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection
import org.eclipse.graphiti.services.IGaService
import org.eclipse.graphiti.services.Graphiti
import org.eclipse.graphiti.services.IPeService
import org.eclipse.graphiti.services.IPeCreateService
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.mm.pictograms.Connection
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle
import org.eclipse.graphiti.mm.pictograms.Anchor
import org.eclipse.graphiti.mm.algorithms.Polyline

class GeneratorConnectionDefinition {
	@Inject extension DefaultCompilationUnitImportManager importManager
    @Inject extension TypeReferences typeReferences
	
	@Inject extension ConnectionStyleGenerator connectionStyleGenerator
	@Inject extension ConnectionPlacingGenerator connectionPlacingGenerator
	@Inject extension ConnectionEnumGenerator
	
	def packageName() { "org.eclipselabs.spray.shapes" }
	def packagePath() { "org/eclipselabs/spray/shapes/" }
	def filepath(ConnectionDefinition c) { packagePath + c.className + ".java" }
	def className(ConnectionDefinition c) { c.name.toFirstUpper }
	
	private ConnectionDefinition current = null 
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
   		for(connection : resource.allContents.toIterable.filter(typeof(ConnectionDefinition))) {
    		// create the connections
			current = connection
			importManager.enter(packageName)
			importManager.registerConnectionImports(connection)
            fsa.generateFile(filepath(connection), new FakeTreeAppendable().compile(connection).content)
			importManager.exit
   		}
	}
	
	def setCurrent(ConnectionDefinition aConnection) {
		this.current = aConnection
	}
	
	def ITreeAppendable compile(ITreeAppendable appendable, ConnectionDefinition c) {
		var appendable1 = appendable.append('''
		«c.head»
		
		''')
		appendable1 = appendable1.body(c)
		appendable1
	}
	
	def head(ConnectionDefinition c) {
	 	'''
		/**
		 * This is a generated Shape for Spray
		 */
		package «packageName»;
		
		«importManager.insertImports»

		'''
	 }
	 
	 def registerConnectionImports(DefaultCompilationUnitImportManager importManager, ConnectionDefinition c) {
	 	this.importManager = importManager
		importManager.addImports(	
			"java.util.ArrayList",
			"java.util.List",
	
			"org.eclipse.graphiti.features.*",
			"org.eclipse.graphiti.mm.algorithms.*",
			"org.eclipse.graphiti.mm.algorithms.styles.*",
			"org.eclipse.graphiti.mm.pictograms.*",
			"org.eclipse.graphiti.services.Graphiti",
			"org.eclipse.graphiti.services.IGaService",
			"org.eclipse.graphiti.services.IPeService",
			"org.eclipse.graphiti.services.IPeCreateService",
			"org.eclipse.graphiti.util.IColorConstant",
			
			"org.eclipselabs.spray.runtime.graphiti.ISprayConstants",
			"org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle",
			"org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection"
	 	)
	 }
	 
	def defaultSprayConnectionType() {  findDeclaredType(typeof(DefaultSprayConnection), current)  }
	def iGaServiceType() {  findDeclaredType(typeof(IGaService), current)  }
	def graphitiType() {  findDeclaredType(typeof(Graphiti), current)  }
	def iPeServiceType() {  findDeclaredType(typeof(IPeService), current)  }
	def iPeCreateServiceType() {  findDeclaredType(typeof(IPeCreateService), current)  }
	def iFeatureProviderType() {  findDeclaredType(typeof(IFeatureProvider), current)  }
	def connectionType() {  findDeclaredType(typeof(Connection), current)  }
	def diagramType() {  findDeclaredType(typeof(Diagram), current)  }
	def iSprayStyleType() {  findDeclaredType(typeof(ISprayStyle), current)  }
	def anchorType() {  findDeclaredType(typeof(Anchor), current)  }
	def polylineType() {  findDeclaredType(typeof(Polyline), current)  }
	 
	
	def ITreeAppendable body(ITreeAppendable appendable, ConnectionDefinition c) {
		var appendable1 = appendable.append('''
		@SuppressWarnings("all")
		public class «c.className» extends ''').append(defaultSprayConnectionType).append(''' {
			
			private ''').append(iGaServiceType).append(''' gaService = ''').append(graphitiType).append('''.getGaService();
			private ''').append(iPeServiceType).append(''' peService = ''').append(graphitiType).append('''.getPeService();
			private ''').append(iPeCreateServiceType).append(''' peCreateService = ''').append(graphitiType).append('''.getPeCreateService();
			
			«c.generateTextIdsEnum»
		    
		    public «c.className»(final ''').append(iFeatureProviderType).append(''' fp) {
				super(fp);
			}
		    
			@Override
			public ''').append(connectionType).append(''' getConnection(final ''').append(diagramType).append(''' diagram, final ''').append(iSprayStyleType).append(''' sprayStyle, final ''').append(anchorType).append(''' startAnchor, final ''').append(anchorType).append(''' endAnchor) {''')
				if (c.connectionStyle == null) {
				appendable1 = appendable1.append('''final ''').append(connectionType).append(''' newConnection = peCreateService.createFreeFormConnection(diagram);''')
				} else {
					if (c.connectionStyle == ConnectionStyle::FREEFORM) {
					appendable1 = appendable1.append('''final ''').append(connectionType).append(''' newConnection = peCreateService.createFreeFormConnection(diagram);''')
					} else if (c.connectionStyle == ConnectionStyle::MANHATTEN) {
					appendable1 = appendable1.append('''final ''').append(connectionType).append(''' newConnection = peCreateService.createManhattanConnection(diagram);''')
					}
				}
				appendable1 = appendable1.append('''newConnection.setStart(startAnchor);
				newConnection.setEnd(endAnchor);
				
				final ''').append(polylineType).append(''' polyline = gaService.createPolyline(newConnection);
				polyline.setStyle(sprayStyle.getStyle(diagram));

				// Define general layout of connection''')
				connectionStyleGenerator.current = c.layout
				appendable1 = appendable1.generateStyleForConnection("polyline", c.layout) appendable1 = appendable1.append('''
				
				// Set the Placings of the connection''')
				for (place : c.placing) {
					connectionPlacingGenerator.current = place
					appendable1 = appendable1.generatePlacing(place)
				}
				appendable1 = appendable1.append('''
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
		''')
		appendable1
	}
	
}