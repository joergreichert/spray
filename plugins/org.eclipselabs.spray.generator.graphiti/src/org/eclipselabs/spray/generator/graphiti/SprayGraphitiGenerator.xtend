package org.eclipselabs.spray.generator.graphiti

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipselabs.spray.generator.graphiti.templates.ExecutableExtensionFactory
import org.eclipselabs.spray.generator.graphiti.templates.Filter
import org.eclipselabs.spray.generator.graphiti.templates.GuiceModule
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile
import org.eclipselabs.spray.generator.graphiti.templates.Plugin
import org.eclipselabs.spray.generator.graphiti.templates.PluginActivator
import org.eclipselabs.spray.generator.graphiti.templates.PropertySection
import org.eclipselabs.spray.generator.graphiti.templates.diagram.DiagramTypeProvider
import org.eclipselabs.spray.generator.graphiti.templates.diagram.FeatureProvider
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ImageProvider
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ModelService
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ToolBehaviorProvider
import org.eclipselabs.spray.generator.graphiti.templates.features.AddConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.AddReferenceAsConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.AddReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.AddShapeFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateReferenceAsConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CustomFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.DeleteReferenceFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.LayoutFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateShapeFeature
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.Connection
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.CustomBehavior
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.MetaClass

import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*

class SprayGraphitiGenerator implements IGenerator {
	@Inject extension NamingExtensions naming
	@Inject extension DiagramExtensions diagramExtensions
	
	@Inject PluginActivator pluginActivator
	@Inject ExecutableExtensionFactory executableExtensionFactory
	@Inject GuiceModule guiceModule
	@Inject Plugin plugin
	@Inject DiagramTypeProvider dtp
	@Inject FeatureProvider fp
	@Inject AddShapeFeature addShapeFeature
	@Inject AddConnectionFeature addConnectionFeature
	@Inject AddReferenceAsConnectionFeature addReferenceAsConnectionFeature
	@Inject AddReferenceAsListFeature addReferenceAsListFeature
	@Inject CreateConnectionFeature createConnectionFeature
	@Inject CreateShapeFeature createShapeFeature
	@Inject CreateReferenceAsListFeature createReferenceAsListFeature
	@Inject CreateReferenceAsConnectionFeature createReferenceAsConnectionFeature 
	@Inject UpdateConnectionFeature updateConnectionFeature
	@Inject LayoutFeature layoutFeature
	@Inject UpdateShapeFeature updateShapeFeature
	@Inject UpdateReferenceAsListFeature updateReferenceAsListFeature
	@Inject DeleteReferenceFeature deleteReferenceFeature
	@Inject ImageProvider imageProvider
	@Inject ToolBehaviorProvider toolBehaviourProvider
	@Inject PropertySection propertySection
	@Inject Filter filter
	@Inject Filter filter2
	@Inject CustomFeature customFeature
	@Inject ModelService modelService
	/**
	 * This method is a long sequence of calling all templates for the code generation
	 */
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {  
		//var String modelPath = resource.getURI().devicePath;
		//var String propertiesPath = StringHelpers::replaceLastSubstring(modelPath, "spray", "properties")
		ProjectProperties::setModelUri(resource.URI)

		var JavaGenFile java = getJavaGenFile(fsa)
		var Diagram diagram = resource.contents.head as Diagram

		generatePluginXml(diagram, fsa)
        generatePluginActivator(diagram, java, pluginActivator)
        generateExectuableExtensionFactory(diagram, java)
        generateModelService(diagram, java)
        generateGuiceModule(diagram, java)
		
		generateDiagramTypeProvider(diagram, java, dtp)
		generateFeatureProvider(diagram, java, fp)
		
		generateAddShapeFeatures(diagram, java, addShapeFeature)
		generateAddConnectionFeatures(diagram, java, addConnectionFeature)
		generateAddReferenceAsConnectionFeature(diagram, java, addReferenceAsConnectionFeature)
		generateAddReferenceAsListFeature(diagram, java, addReferenceAsListFeature)
		
		generateCreateConnectionFeature(diagram, java, createConnectionFeature)
		generateCreateShapeFeature(diagram, java, createShapeFeature)
		
		handleTypesInReferences(diagram, java, createReferenceAsListFeature)
		
		generateCreateReferenceAsConnectionFeature(diagram, java, createReferenceAsConnectionFeature)
		generateUpdateAndLayoutFeatures(diagram, java, updateShapeFeature, updateConnectionFeature, updateReferenceAsListFeature, layoutFeature)
		generateDeleteReferenceFeature(diagram, java, deleteReferenceFeature)
		
		generateImageProvider(diagram, java, imageProvider)
		generateToolBehaviourProvider(diagram, java, toolBehaviourProvider)
		
		generatePropertySection(diagram, java, propertySection)
		generateFilter(diagram, java, filter, filter2)
		
		generateCustomFeature(diagram, java, customFeature)
	}
	
	def JavaGenFile getJavaGenFile(IFileSystemAccess fsa) {
		
		var String genOutputPath = ProjectProperties::projectPath + "/" + ProjectProperties::srcGenPath;
		var String manOutputPath = ProjectProperties::projectPath + "/" + ProjectProperties::srcManPath;

		var JavaGenFile java
		if( fsa instanceof JavaIoFileSystemAccess) {
			java = handleJavaIoFileSystemAccess(fsa, genOutputPath, manOutputPath)
		}
		if( fsa instanceof EclipseResourceFileSystemAccess2 && java == null){
			java = handleEclipseResourceFileSystemAccess(fsa, genOutputPath, manOutputPath)
		}
		java
	}
	
	def JavaGenFile handleEclipseResourceFileSystemAccess(IFileSystemAccess fsa, String genOutputPath, String manOutputPath) {
		println("EclipseResourceFileSystemAccess: WARNING: dos not work yet")
		var JavaGenFile java
		if(  fsa != null ){
			java = new JavaGenFile(fsa as EclipseResourceFileSystemAccess2)
//			var IProject project  = EclipseHelpers::toEclipseResource(resource).project  
			java.setGenOutputPath(ProjectProperties::srcGenPath);
			java.setManOutputPath(ProjectProperties::srcManPath);
		}
		java
	}

	def JavaGenFile handleJavaIoFileSystemAccess(IFileSystemAccess fsa, String genOutputPath, String manOutputPath) {
		var JavaIoFileSystemAccess javaFsa = (fsa as JavaIoFileSystemAccess) 
		var JavaGenFile java
		if(  javaFsa != null ){
			java = new JavaGenFile(javaFsa)
			java.setGenOutputPath(genOutputPath)
			java.setManOutputPath(manOutputPath)
		}	
		java
	}

	def generatePluginXml(Diagram diagram, IFileSystemAccess fsa) {
		fsa.generateFile("plugin.xml", plugin.generate(diagram))
	}
	
	def generatePluginActivator(Diagram diagram, JavaGenFile java, PluginActivator activator) {
		java.hasExtensionPoint = false
		java.setPackageAndClass(diagram.activatorClassName)
        activator.generate(diagram, java)
	}
	
	def generateExectuableExtensionFactory(Diagram diagram, JavaGenFile java) {
        java.setPackageAndClass(diagram.extensionFactoryClassName)
        executableExtensionFactory.generate(diagram, java)
	}
	
	def generateModelService(Diagram diagram, JavaGenFile java) {
        java.setPackageAndClass(diagram.modelServiceClassName)
        modelService.generate(diagram, java)
	}
	
	def generateGuiceModule(Diagram diagram, JavaGenFile java) {
        java.hasExtensionPoint = true
        java.setPackageAndClass(diagram.guiceModuleClassName)
        guiceModule.generate(diagram, java)
	}
	
	def generateDiagramTypeProvider(Diagram diagram, JavaGenFile java, DiagramTypeProvider diagramTypeProvider) {
		java.setPackageAndClass(diagram.diagramTypeProviderClassName)
		diagramTypeProvider.generate(diagram, java)
	}
	
	def generateFeatureProvider(Diagram diagram, JavaGenFile java, FeatureProvider featureProvider) {
		java.setPackageAndClass(diagram.featureProviderClassName)
		featureProvider.generate(diagram, java)
	}
	
	def generateAddShapeFeatures(Diagram diagram, JavaGenFile java, AddShapeFeature asf) {
		// Generate for all Container Shapes
		for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof Container)){
			var container = metaClass.representedBy as Container
			java.setPackageAndClass(metaClass.addFeatureClassName)
			
			asf.generate(container, java)
		}
	}	

	def generateAddConnectionFeatures(Diagram diagram, JavaGenFile java, AddConnectionFeature acf) {
		// Generate for all Connection
		for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof Connection)){
			//var connection = metaClass.representedBy as Connection
			java.setPackageAndClass(metaClass.addFeatureClassName)
			acf.generate(metaClass, java)
		}
	}
	
	def generateAddReferenceAsConnectionFeature(Diagram diagram, JavaGenFile java, AddReferenceAsConnectionFeature aracf) {
		// Generate for all EReferences as Connection   TODO metaClass.name ==> metaClass.visibleName()
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references.filter(ref|ref.representedBy != null) ){
				java.setPackageAndClass(reference.addReferenceAsConnectionFeatureClassName)
				
				aracf.generate(reference, java)
			}
		}
	}	
	
	def generateAddReferenceAsListFeature(Diagram diagram, JavaGenFile java, AddReferenceAsListFeature aralf) {
		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Container ){
				var container = metaClass.representedBy as Container
				for(metaRef : container.parts.filter(typeof(MetaReference)) ){
					java.setPackageAndClass(metaRef.addReferenceAsListFeatureClassName)
					aralf.generate(metaRef, java)
				}
			}
		}
	}
	
	def generateCreateConnectionFeature(Diagram diagram, JavaGenFile java, CreateConnectionFeature ccf) {
		for( metaClass : diagram.getElementsForTemplate(createConnectionFeature)) {
			java.setPackageAndClass(metaClass.createFeatureClassName)
			ccf.generate(metaClass, java)
		}
	}
	
	def generateCreateShapeFeature(Diagram diagram, JavaGenFile java, CreateShapeFeature csf) {
        for( metaClass : diagram.getElementsForTemplate(createShapeFeature)) {
            java.setPackageAndClass(metaClass.createFeatureClassName)
            csf.generate(metaClass, java)
        }
	}
	
	def handleTypesInReferences(Diagram diagram, JavaGenFile java, CreateReferenceAsListFeature cralf) {
//		println("1 : " +  diagram.metaClasses.filter( m | m.container != null))
		for( reference : diagram.metaClasses.filter( m | m.representedBy != null).map(m | m.representedBy).filter(typeof(Container)).map(c | (c as Container).parts.filter(typeof(MetaReference))).flatten) {
			val referenceName = reference.getName
			var metaClass = (reference.eContainer as Container).represents
			var target = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName) 
			var targetType = target.EReferenceType 
			handleTargetType(java, cralf, reference, targetType)
		}
	}
	
	def handleTargetType(JavaGenFile java, CreateReferenceAsListFeature cralf, MetaReference reference, EClass targetType) {
		if( !targetType.abstract ) {
			println("NOT ABSTRACT: " + targetType.name)
			java.setPackageAndClass(reference.createReferenceAsListFeatureClassName)
			cralf.setTarget(targetType)
			cralf.generate(reference, java)
		} else {
			println("ABSTRACT: " + targetType.name)
//			java.setPackageAndClass(feature_package(), metaClass.diagram.name.toFirstUpper + "Create" + metaClass.name + reference.name + targetType.name + "Feature")
//			var CreateReferenceAsListFeature ft = new CreateReferenceAsListFeature()
//			ft.setTarget(targetType)
//			ft.generate(reference, java)
		}
		handleTargetTypeSubClasses(java, cralf, reference, targetType)
	}
	
	def handleTargetTypeSubClasses(JavaGenFile java, CreateReferenceAsListFeature cralf, MetaReference reference, EClass targetType) {
		for( subclass : targetType.getSubclasses() ){
			if( ! subclass.abstract ){
				println("NOT ABSTRACT subclass: " + subclass.name)
				java.setPackageAndClass(reference.getCreateReferenceAsListFeatureClassName(subclass))
				cralf.setTarget(subclass)
				cralf.generate(reference, java)
			} else {
				println("ABSTRACT subclass: " +subclass.name)
				java.setPackageAndClass(reference.getCreateReferenceAsListFeatureClassName(subclass))
				cralf.setTarget(subclass)
				cralf.generate(reference, java)
			}
		}	
	}
	
	def generateCreateReferenceAsConnectionFeature(Diagram diagram, JavaGenFile java, CreateReferenceAsConnectionFeature cracf) {
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references.filter(ref|ref.representedBy != null) ) {
				java.setPackageAndClass(reference.getCreateReferenceAsConnectionFeatureClassName)
				cracf.generate(reference, java)
		    }
 	    }
	}
	
	def generateUpdateAndLayoutFeatures(Diagram diagram, JavaGenFile java, UpdateShapeFeature usf, UpdateConnectionFeature ucf, UpdateReferenceAsListFeature uralf, LayoutFeature lf) {
		for( metaClass : diagram.metaClasses ) {
			if( metaClass.representedBy instanceof Connection ) {
				//    No layout feature needed
				val connection = metaClass.representedBy as Connection
				generateUpdateConnectionFeature(metaClass, connection, java, ucf)
			} else if( metaClass.representedBy instanceof Container ) {
				val container = metaClass.representedBy as Container
				generateLayoutFeature(metaClass, container, java, lf)
				generateUpdateShapeFeature(metaClass, container, java, usf)
				generateUpdateReferenceAsListFeature(metaClass, java, uralf)
			}
		}	
	}

	def generateUpdateShapeFeature(MetaClass metaClass, Container container, JavaGenFile java, UpdateShapeFeature usf) {
		java.setPackageAndClass(metaClass.updateFeatureClassName)
		usf.generate(container, java)
	}
	
	def generateUpdateConnectionFeature(MetaClass metaClass, Connection connection, JavaGenFile java, UpdateConnectionFeature ucf) {
		java.setPackageAndClass(metaClass.updateFeatureClassName)
		ucf.generate(connection, java)
	}
	
	def generateLayoutFeature(MetaClass metaClass, Container container, JavaGenFile java, LayoutFeature lf) {
		java.setPackageAndClass(metaClass.layoutFeatureClassName)
		lf.generate(container, java)
	}

	def generateUpdateReferenceAsListFeature(MetaClass metaClass, JavaGenFile java, UpdateReferenceAsListFeature uralf) {
		var container = metaClass.representedBy as Container
		for( reference : container.parts.filter(p | p instanceof MetaReference).map(p | p as MetaReference) ) {
			val referenceName = reference.getName
			var eClass = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName).EReferenceType 
			uralf.setTarget(eClass)
			java.setPackageAndClass(reference.updateReferenceAsListFeatureClassName)
			uralf.generate(reference, java)
		}
	}
	
	def generateDeleteReferenceFeature(Diagram diagram, JavaGenFile java, DeleteReferenceFeature drf) {
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references ) {
				java.setPackageAndClass(reference.deleteReferenceFeatureClassName)
				drf.generate(reference, java)
			}
		}
	}	
	
	def generateImageProvider(Diagram diagram, JavaGenFile java, ImageProvider ip) {
		java.setPackageAndClass(diagram.imageProviderClassName)
		ip.generate(diagram, java)
	}	
	
	def generateToolBehaviourProvider(Diagram diagram, JavaGenFile java, ToolBehaviorProvider tbp) {
		java.setPackageAndClass(diagram.toolBehaviorProviderClassName)
		tbp.generate(diagram, java)
	}	
	
	def generatePropertySection(Diagram diagram, JavaGenFile java, PropertySection ps) {
		for( metaClass : diagram.metaClasses) {
			generatePropertySectionForEClassAttributes(diagram, java, metaClass.type, ps)
			if( metaClass.representedBy instanceof Container ){
				generatePropertySectionForReferenceAttributes(diagram, java, metaClass, ps)
			}
		}		
	}	

	def generatePropertySectionForReferenceAttributes(Diagram diagram, JavaGenFile java, MetaClass metaClass, PropertySection ps) {
		val container = metaClass.representedBy as Container
		for( reference : container.parts.filter(p | p instanceof MetaReference).map(p | p as MetaReference)) {
			val referenceName = reference.getName
			var eClass = metaClass.type.EAllReferences.findFirst(r | r.name == referenceName).EReferenceType
			generatePropertySectionForEClassAttributes(diagram, java, eClass, ps)
		}
	}

	def generatePropertySectionForEClassAttributes(Diagram diagram, JavaGenFile java, EClass eClass, PropertySection ps) {
		for( attribute : eClass.EAllAttributes){
			generatePropertySectionForAttribute(diagram, java, eClass, attribute, ps)
		}
	}

	def generatePropertySectionForAttribute(Diagram diagram, JavaGenFile java, EClass eClass, EAttribute attribute, PropertySection ps) {
		java.setPackageAndClass(naming.getPropertySectionClassName(eClass, attribute))
		ps.setDiagram(diagram)
		ps.generate(attribute, java)
	}
	
	def generateFilter(Diagram diagram, JavaGenFile java, Filter f, Filter f2) {
		for( metaClass : diagram.metaClasses) {
			generateFilter(diagram, java, metaClass, f)

			if( metaClass.representedBy instanceof Container){
				generateFilterForReference(diagram, java, f2, metaClass)
			}
		}
	}	
	
	def generateFilterForReference(Diagram diagram, JavaGenFile java, Filter f, MetaClass metaClass) {
		val container = metaClass.representedBy as Container
		for( reference : container.parts.filter( p | p instanceof MetaReference).map(p | p as MetaReference)){
			val referenceName = reference.getName
			val eClass = metaClass.type.EAllReferences.findFirst(ref| ref.name == referenceName).EReferenceType 
			generateFilter(diagram, java, eClass, f)
		}
	}

	def generateFilter(Diagram diagram, JavaGenFile java, MetaClass metaClass, Filter f) {
		f.setDiagram(diagram)
		java.setPackageAndClass(metaClass.filterClassName)
		f.generate(metaClass.type, java)
	}	
	
	def generateFilter(Diagram diagram, JavaGenFile java, EClass eClass, Filter f) {
		f.setDiagram(diagram)
		java.setPackageAndClass(eClass.filterClassName)
		f.generate(eClass, java)
	}	
	
	def generateCustomFeature(Diagram diagram, JavaGenFile java, CustomFeature cf) {
		for( metaClass : diagram.metaClasses) {
			for(CustomBehavior behavior : metaClass.behaviors.filter(typeof(CustomBehavior))) {
				java.setPackageAndClass(behavior.customFeatureClassName)
				cf.generate(behavior, java)
			}
		}
	}
}
