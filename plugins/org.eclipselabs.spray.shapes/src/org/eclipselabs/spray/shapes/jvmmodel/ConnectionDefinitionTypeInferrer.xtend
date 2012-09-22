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
              		var appendable = append(connectionGenerator.iSprayStyleType).append(''' sprayStyle = aSprayStyle;''').newLine
					if (element.connectionStyle == null) {
						appendable = appendable.append('''final ''').append(connectionGenerator.connectionType)
							.append(''' newConnection = peCreateService.createFreeFormConnection(diagram);''').newLine
					} else {
						if (element.connectionStyle == ConnectionStyle::FREEFORM) {
							appendable = appendable.append('''final ''').append(connectionGenerator.connectionType)
								.append(''' newConnection = peCreateService.createFreeFormConnection(diagram);''').newLine
						} else if (element.connectionStyle == ConnectionStyle::MANHATTEN) {
							appendable = appendable.append('''final ''').append(connectionGenerator.connectionType)
								.append(''' newConnection = peCreateService.createManhattanConnection(diagram);''').newLine
						}
					}
					appendable = appendable.append('''newConnection.setStart(startAnchor);''').newLine
					appendable = appendable.append('''newConnection.setEnd(endAnchor);''').newLine
					appendable = appendable.newLine
					appendable = appendable.append(connectionGenerator.polylineType).append(''' polyline = gaService.createPolyline(newConnection);''').newLine
					appendable = appendable.append('''polyline.setStyle(sprayStyle.getStyle(diagram));''').newLine
					appendable = appendable.newLine
					appendable = appendable.append('''// Define general layout of connection''').newLine
					connectionStyleGenerator.current = element.layout
					appendable = appendable.generateStyleForConnection("polyline", element.layout).newLine
					appendable = appendable.newLine
					appendable = appendable.append('''// Set the Placings of the connection''').newLine
					for (place : element.placing) {
						connectionPlacingGenerator.current = place
						appendable = appendable.generatePlacing(place).newLine
					}
					appendable = appendable.append('''return newConnection;''')
				]
			]
		]
	}	
}