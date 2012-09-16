package org.eclipselabs.spray.shapes.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition
import org.eclipselabs.spray.shapes.generator.connections.ConnectionEnumGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.ConnectionStyle
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle

class ConnectionDefinitionTypeInferrer {
    @Inject extension TypeReferences typeReferences
    @Inject extension JvmTypesBuilder
    @Inject extension GeneratorConnectionDefinition connectionGenerator
	@Inject extension ConnectionStyleGenerator connectionStyleGenerator
	@Inject extension ConnectionPlacingGenerator connectionPlacingGenerator
	@Inject extension ConnectionEnumGenerator
	
	def void infer(ConnectionDefinition element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		connectionGenerator.current = element

		var JvmTypeReference varSuperTypeRef = null
		val superType = connectionGenerator.defaultSprayConnectionType
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

			members += element.toField("gaService", createTypeRef(connectionGenerator.iGaServiceType))
			members += element.toField("peService", createTypeRef(connectionGenerator.iPeServiceType))
			members += element.toField("peCreateService", createTypeRef(connectionGenerator.iPeCreateServiceType))
			
			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
			
			members += element.toConstructor [
				parameters += element.toParameter("aFp", createTypeRef(connectionGenerator.iFeatureProviderType))
				body = [
					append("super(aFp);")
				]
			]
			
			members += element.toMethod("getConnection", createTypeRef(connectionType)) [
              annotations += element.toAnnotation(typeof(Override))
              parameters += element.toParameter("diagram", createTypeRef(connectionGenerator.diagramType))
              parameters += element.toParameter("aSprayStyle", createTypeRef(findDeclaredType(typeof(ISprayStyle), element)))
              parameters += element.toParameter("startAnchor", createTypeRef(connectionGenerator.anchorType))
              parameters += element.toParameter("endAnchor", createTypeRef(connectionGenerator.anchorType))
              body = [ 
              	var appendable1 = append(connectionGenerator.iSprayStyleType).append(''' sprayStyle = aSprayStyle;''').newLine
				if (element.connectionStyle == null) {
				appendable1 = appendable1.append('''final ''').append(connectionGenerator.connectionType).append(''' newConnection = peCreateService.createFreeFormConnection(diagram);''')
				} else {
					if (element.connectionStyle == ConnectionStyle::FREEFORM) {
						appendable1 = appendable1.append('''final ''').append(connectionGenerator.connectionType).append(''' newConnection = peCreateService.createFreeFormConnection(diagram);''')
					} else if (element.connectionStyle == ConnectionStyle::MANHATTEN) {
						appendable1 = appendable1.append('''final ''').append(connectionGenerator.connectionType).append(''' newConnection = peCreateService.createManhattanConnection(diagram);''')
					}
				}
				appendable1 = appendable1.append('''newConnection.setStart(startAnchor);
				newConnection.setEnd(endAnchor);
				
				final ''').append(connectionGenerator.polylineType).append(''' polyline = gaService.createPolyline(newConnection);
				polyline.setStyle(sprayStyle.getStyle(diagram));

				// Define general layout of connection''')
				connectionStyleGenerator.current = element.layout
				appendable1 = appendable1.generateStyleForConnection("polyline", element.layout) appendable1 = appendable1.append('''
				
				// Set the Placings of the connection''')  appendable1 = appendable1.newLine
				for (place : element.placing) {
					connectionPlacingGenerator.current = place
					appendable1 = appendable1.generatePlacing(place)
				}
				appendable1 = appendable1.append('''
				return newConnection;''')
              ]
           ]
		]
	}	
}