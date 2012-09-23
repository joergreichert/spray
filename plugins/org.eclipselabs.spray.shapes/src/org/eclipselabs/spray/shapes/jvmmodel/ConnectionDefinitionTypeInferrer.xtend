package org.eclipselabs.spray.shapes.jvmmodel

import com.google.inject.Inject
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.mm.pictograms.Anchor
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition
import org.eclipselabs.spray.shapes.generator.connections.ConnectionEnumGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.ConnectionStyle

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
			if(superTypeRef != null) superTypes += superTypeRef.cloneWithProxies

			members += element.toField("gaService", createTypeRef(iGaServiceType))
			members += element.toField("peService", createTypeRef(iPeServiceType))
			members += element.toField("peCreateService", createTypeRef(iPeCreateServiceType))
			
			annotations += element.toAnnotation(typeof(SuppressWarnings), "all")
			
			val aFeatureProvider = element.newTypeRef(typeof(IFeatureProvider))
			
			members += element.toConstructor [
				parameters += toParameter("aFeatureProvider" + element.name.toFirstUpper, aFeatureProvider)
				body = [
					append("super(aFeatureProvider" + element.name.toFirstUpper + ");")
				]
			]

          	val diagram = element.newTypeRef(typeof(Diagram))
           	val aSprayStyle = element.newTypeRef(typeof(ISprayStyle))
           	val startAnchor = element.newTypeRef(typeof(Anchor))
           	val endAnchor = element.newTypeRef(typeof(Anchor))
			
			members += element.toMethod("getConnection", createTypeRef(connectionType)) [
				annotations += element.toAnnotation(typeof(Override))
              	parameters += toParameter("diagram" + element.name.toFirstUpper, diagram)
              	parameters += toParameter("sprayStyle" + element.name.toFirstUpper, aSprayStyle)
              	parameters += toParameter("startAnchor" + element.name.toFirstUpper, startAnchor)
              	parameters += toParameter("endAnchor" + element.name.toFirstUpper, endAnchor)
              	body = [ 
              		var appendable = append(connectionGenerator.iSprayStyleType).append(''' sprayStyle = sprayStyle''' + element.name.toFirstUpper + ''';''').newLine
 					appendable = appendable.append(connectionGenerator.diagramType).append(''' diagram = diagram''' + element.name.toFirstUpper + ''';''').newLine             		
 					appendable = appendable.append(connectionGenerator.anchorType).append(''' startAnchor = startAnchor''' + element.name.toFirstUpper + ''';''').newLine             		
 					appendable = appendable.append(connectionGenerator.anchorType).append(''' endAnchor = endAnchor''' + element.name.toFirstUpper + ''';''').newLine             		
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