package org.eclipselabs.spray.generator.graphiti

import com.google.inject.Inject
import com.google.inject.Provider
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipselabs.spray.generator.graphiti.templates.ExecutableExtensionFactory
import org.eclipselabs.spray.generator.graphiti.templates.Filter
import org.eclipselabs.spray.generator.graphiti.templates.GuiceModule
import org.eclipselabs.spray.generator.graphiti.templates.Plugin
import org.eclipselabs.spray.generator.graphiti.templates.PluginActivator
import org.eclipselabs.spray.generator.graphiti.templates.PropertySection
import org.eclipselabs.spray.generator.graphiti.templates.diagram.DiagramTypeProvider
import org.eclipselabs.spray.generator.graphiti.templates.diagram.FeatureProvider
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ImageProvider
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ModelService
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ToolBehaviorProvider
import org.eclipselabs.spray.generator.graphiti.templates.features.AddConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.AddConnectionFromDslFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.AddReferenceAsConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.AddShapeFromDslFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CopyFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateReferenceAsConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CustomFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.DeleteReferenceFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.DirectEditFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.LayoutFromDslFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.MoveFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.PasteFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.ResizeFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateConnectionFromDslFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateShapeFromDslFeature
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.CustomBehavior
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.SprayGraphitiGenerator.*
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.xtext.generator.JavaGenFile

class SprayGraphitiGenerator implements IGenerator {
    @Inject Provider<JavaGenFile> genFileProvider
    @Inject extension NamingExtensions naming
    @Inject extension DiagramExtensions diagramExtensions
    
    @Inject PluginActivator pluginActivator
    @Inject ExecutableExtensionFactory executableExtensionFactory
    @Inject GuiceModule guiceModule
    @Inject Plugin plugin
    @Inject DiagramTypeProvider dtp
    @Inject FeatureProvider fp
    @Inject AddShapeFromDslFeature addShapeFromDslFeature
    @Inject AddConnectionFeature addConnectionFeature
    @Inject AddConnectionFromDslFeature addConnectionFromDslFeature
    @Inject AddReferenceAsConnectionFeature addReferenceAsConnectionFeature
    @Inject CreateConnectionFeature createConnectionFeature
    @Inject CreateShapeFeature createShapeFeature
    @Inject CreateReferenceAsConnectionFeature createReferenceAsConnectionFeature 
    @Inject UpdateConnectionFeature updateConnectionFeature
    @Inject UpdateConnectionFromDslFeature updateConnectionFromDslFeature
    @Inject MoveFeature moveFeature
    @Inject LayoutFromDslFeature layoutFromDslFeature
    @Inject UpdateShapeFromDslFeature updateShapeFromDslFeature
    @Inject UpdateReferenceAsListFeature updateReferenceAsListFeature
    @Inject DeleteReferenceFeature deleteReferenceFeature
    @Inject ImageProvider imageProvider
    @Inject ToolBehaviorProvider toolBehaviourProvider
    @Inject PropertySection propertySection
    @Inject Filter filter
    @Inject Filter filter2
    @Inject CustomFeature customFeature
    @Inject ModelService modelService
    @Inject DirectEditFeature directEditFeature
    @Inject CopyFeature copyFeature
    @Inject PasteFeature pasteFeature
    @Inject ResizeFeature resizeFeature
    
    private static Log   LOGGER       = LogFactory::getLog("SprayGraphitiGenerator");
    /**
     * This method is a long sequence of calling all templates for the code generation
     */
    override void doGenerate(Resource resource, IFileSystemAccess fsa) {  
        //var String modelPath = resource.getURI().devicePath;
        //var String propertiesPath = StringHelpers::replaceLastSubstring(modelPath, "spray", "properties")
        if (!resource.URI.lastSegment().endsWith(ProjectProperties::SPRAY_FILE_EXTENSION)) {
            LOGGER.info("Spray NOT generating Graphiti for model " + resource.URI)
            return;
        }
        LOGGER.info("Spray generating Graphiti for model " + resource.URI)
        
        ProjectProperties::setModelUri(resource.URI)

        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
        var Diagram diagram = resource.contents.head as Diagram

        generatePluginXml(diagram, fsa)
        generatePluginActivator(diagram, java, pluginActivator)
        generateExectuableExtensionFactory(diagram, java)
        generateModelService(diagram, java)
        generateGuiceModule(diagram, java)
        
        generateDiagramTypeProvider(diagram, java, dtp)
        generateFeatureProvider(diagram, java, fp)
        
        generateAddShapeFromDslFeatures(diagram, java, addShapeFromDslFeature)
        generateAddConnectionFeatures(diagram, java, addConnectionFeature)
        generateAddReferenceAsConnectionFeature(diagram, java, addReferenceAsConnectionFeature)
        
        generateCreateConnectionFeature(diagram, java, createConnectionFeature)
        generateCreateShapeFeature(diagram, java, createShapeFeature)
        
        generateCreateReferenceAsConnectionFeature(diagram, java, createReferenceAsConnectionFeature)
        generateUpdateAndLayoutFeatures(diagram, java, updateConnectionFeature, updateReferenceAsListFeature)
        generateUpdateAndLayoutFromDslFeatures(diagram, java, updateShapeFromDslFeature, layoutFromDslFeature)
        generateDeleteReferenceFeature(diagram, java, deleteReferenceFeature)
        
        generateImageProvider(diagram, java, imageProvider)
        generateToolBehaviourProvider(diagram, java, toolBehaviourProvider)
        
        generatePropertySection(diagram, java, propertySection)
        generateFilter(diagram, java, filter, filter2)
        
        generateCustomFeature(diagram, java, customFeature)
        generateDirectEditFeature(diagram, java, directEditFeature)
        
        generateCopyFeature(diagram, java, copyFeature)
        generatePasteFeature(diagram, java, pasteFeature)
        generateResizeFeature(diagram, java, resizeFeature)
        generateMoveFeature(diagram, java, moveFeature)
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
    
    def generateAddShapeFromDslFeatures(Diagram diagram, JavaGenFile java, AddShapeFromDslFeature asf) {
        for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof ShapeFromDsl )){
            var container = metaClass.representedBy as ShapeFromDsl
            java.setPackageAndClass(metaClass.addFeatureClassName)
            asf.setAttributes(metaClass, diagram.style)
            asf.generate(container, java)
        }
    }    

    def generateAddConnectionFeatures(Diagram diagram, JavaGenFile java, AddConnectionFeature acf) {
        // Generate for all Connection
        for( metaClass : diagram.metaClasses.filter(m | (m.representedBy instanceof ConnectionInSpray) && ( (m.representedBy as ConnectionInSpray).connection == null) )){
            //var connection = metaClass.representedBy as Connection
            java.setPackageAndClass(metaClass.addFeatureClassName)
            acf.generate(metaClass, java)
        }
        for( metaClass : diagram.metaClasses.filter(m | (m.representedBy instanceof ConnectionInSpray) && ( (m.representedBy as ConnectionInSpray).connection != null) )){
            //var connection = metaClass.representedBy as Connection
            java.setPackageAndClass(metaClass.addFeatureClassName)
            addConnectionFromDslFeature.setAttributes(metaClass, diagram.style)
            addConnectionFromDslFeature.generate(metaClass, java)
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
    
//    def handleTargetType(JavaGenFile java, CreateReferenceAsListFeature cralf, MetaReference reference, EClass targetType) {
//        if( !targetType.^abstract ) {
////            println("NOT ABSTRACT: " + targetType.name)
//            java.setPackageAndClass(reference.createReferenceAsListFeatureClassName)
//            cralf.setTarget(targetType)
//            cralf.generate(reference, java)
//        } else {
////            println("ABSTRACT: " + targetType.name)
////            java.setPackageAndClass(feature_package(), metaClass.diagram.name.toFirstUpper + "Create" + metaClass.name + reference.name + targetType.name + "Feature")
////            var CreateReferenceAsListFeature ft = new CreateReferenceAsListFeature()
////            ft.setTarget(targetType)
////            ft.generate(reference, java)
//        }
//        handleTargetTypeSubClasses(java, cralf, reference, targetType)
//    }
//    
//    def handleTargetTypeSubClasses(JavaGenFile java, CreateReferenceAsListFeature cralf, MetaReference reference, EClass targetType) {
//        for( subclass : targetType.getSubclasses() ){
//            if( ! subclass.^abstract ){
//                println("NOT ABSTRACT subclass: " + subclass.name)
//                java.setPackageAndClass(reference.getCreateReferenceAsListFeatureClassName(subclass))
//                cralf.setTarget(subclass)
//                cralf.generate(reference, java)
//            } else {
//                println("ABSTRACT subclass: " +subclass.name)
//                java.setPackageAndClass(reference.getCreateReferenceAsListFeatureClassName(subclass))
//                cralf.setTarget(subclass)
//                cralf.generate(reference, java)
//            }
//        }    
//    }
    
    def generateCreateReferenceAsConnectionFeature(Diagram diagram, JavaGenFile java, CreateReferenceAsConnectionFeature cracf) {
        for( metaClass : diagram.metaClasses) {
            for( reference : metaClass.references.filter(ref|ref.representedBy != null) ) {
                java.setPackageAndClass(reference.getCreateReferenceAsConnectionFeatureClassName)
                cracf.generate(reference, java)
            }
         }
    }
    
    def generateUpdateAndLayoutFeatures(Diagram diagram, JavaGenFile java, UpdateConnectionFeature ucf, UpdateReferenceAsListFeature uralf) {
        for( metaClass : diagram.metaClasses ) {
            if( (metaClass.representedBy instanceof ConnectionInSpray ) && ( (metaClass.representedBy as ConnectionInSpray).connection == null)) {
                //    No layout feature needed
                val connection = metaClass.representedBy as ConnectionInSpray
                generateUpdateConnectionFeature(metaClass, connection, java, ucf)
            }
        }    
    }

    def generateUpdateAndLayoutFromDslFeatures(Diagram diagram, JavaGenFile java, UpdateShapeFromDslFeature usf, LayoutFromDslFeature lf) {
        for( metaClass : diagram.metaClasses ) {
            if( (metaClass.representedBy instanceof ConnectionInSpray ) && ( (metaClass.representedBy as ConnectionInSpray).connection != null)) {
                //    No layout feature needed
                val connection = metaClass.representedBy as ConnectionInSpray
                generateUpdateConnectionFromDslFeature(metaClass, connection, java, updateConnectionFromDslFeature)
            } else if( metaClass.representedBy instanceof ShapeFromDsl ) {
                val container = metaClass.representedBy as ShapeFromDsl
                generateLayoutFromDslFeature(metaClass, container, java, lf)
                generateUpdateShapeFromDslFeature(metaClass, container, java, usf)
            }
        }    
    }

    def generateUpdateShapeFromDslFeature(MetaClass metaClass, ShapeFromDsl container, JavaGenFile java, UpdateShapeFromDslFeature usf) {
        java.setPackageAndClass(metaClass.updateFeatureClassName)
        usf.generate(container, java)
    }
    
    def generateUpdateConnectionFeature(MetaClass metaClass, ConnectionInSpray connection, JavaGenFile java, UpdateConnectionFeature ucf) {
        java.setPackageAndClass(metaClass.updateFeatureClassName)
        ucf.generate(connection, java)
    }
    def generateUpdateConnectionFromDslFeature(MetaClass metaClass, ConnectionInSpray connection, JavaGenFile java, UpdateConnectionFromDslFeature ucf) {
        java.setPackageAndClass(metaClass.updateFeatureClassName)
        ucf.generate(connection, java)
    }
    
    def generateLayoutFromDslFeature(MetaClass metaClass, ShapeFromDsl container, JavaGenFile java, LayoutFromDslFeature lf) {
        java.setPackageAndClass(metaClass.layoutFeatureClassName)
        lf.generate(container, java)
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
        for(CustomBehavior behavior : diagram.getBehaviorsForTemplate(cf)) {
            java.setPackageAndClass(behavior.customFeatureClassName)
            cf.generate(behavior, java)
        }
    }
    
    def generateDirectEditFeature(Diagram diagram, JavaGenFile java, DirectEditFeature df) {
        for(metaClass : diagram.metaClasses) {
            java.setPackageAndClass(metaClass.directEditFeatureClassName)
            df.generate(metaClass, java)
        }
    }
    
    def generateCopyFeature(Diagram diagram, JavaGenFile java, CopyFeature cf) {
            java.setPackageAndClass(diagram.copyFeatureClassName)
            cf.generate(diagram, java)
    }
    
    def generatePasteFeature(Diagram diagram, JavaGenFile java, PasteFeature pf) {
            java.setPackageAndClass(diagram.pasteFeatureClassName)
            pf.generate(diagram, java)
        
    }
    
    def generateResizeFeature(Diagram diagram, JavaGenFile java, ResizeFeature lf) {
        for(metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof ShapeFromDsl)) {
            val container = metaClass.representedBy as ShapeFromDsl
            java.setPackageAndClass(metaClass.resizeFeatureClassName)
            lf.generate(container, java)
        }   
    }

    def generateMoveFeature(Diagram diagram, JavaGenFile java, MoveFeature lf) {
        for(metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof ShapeFromDsl)) {
            val container = metaClass.representedBy as ShapeFromDsl
            java.setPackageAndClass(metaClass.moveFeatureClassName)
            lf.generate(container, java)
        }   
    }
}
