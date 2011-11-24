package org.eclipselabs.spray.generator.graphiti.templates.diagram

import com.google.inject.Inject
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.SprayPackage

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*

class ToolBehaviorProvider extends FileGenerator {
    @Inject extension NamingExtensions
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
         
        public class «className» extends «className»Base {
            public «className»(IDiagramTypeProvider dtp) {
                super(dtp);
            }
        }
    '''

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «diagram_package()»;

        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
        import org.eclipse.graphiti.features.IFeature;
        import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
        import org.eclipselabs.spray.runtime.graphiti.tb.AbstractSprayToolBehaviorProvider;
        
        import com.google.common.collect.Lists;
        // MARKER_IMPORT
        public abstract class «className» extends AbstractSprayToolBehaviorProvider {
            «generate_compartmentConstants(diagram)»
            «generate_additionalFields(diagram)»
            public «className»(IDiagramTypeProvider dtp) {
                super(dtp);
            }
        
            «generate_buildCreationTools(diagram)»
            «generate_buildPaletteCompartments(diagram)»
            «generate_getPaletteCompartmentForFeature(diagram)»
            «generate_additionalMethods(diagram)»
        }
    '''
    
    
    def List<CreateBehavior> getAllCreateBehaviors (Diagram diagram) {
        diagram.eAllOfType(typeof(CreateBehavior))
    }
    
    def getPaletteCompartmentNames (Diagram diagram) {
        val result = new HashSet<String>()
        for (behavior: diagram.allCreateBehaviors.filter(b|b.paletteCompartment!=null)) {
            result += behavior.paletteCompartment
        }
        result
    }

    def generate_compartmentConstants (Diagram diagram) '''
        «FOR compartmentName : diagram.paletteCompartmentNames»
            protected static final String COMPARTMENT_«compartmentName.toUpperCase» = "«compartmentName»";
        «ENDFOR»
    '''

    def generate_buildCreationTools(Diagram diagram) '''
        «overrideHeader»
        protected void buildCreationTools() {
            «FOR featureName: diagram.allCreateFeatureNames»
                buildCreationTool(new «featureName»(this.getFeatureProvider()));
            «ENDFOR»
            // Compartments
            «FOR reference: diagram.listReferences.toSet»
                «val target = reference.target »  
                «IF ! target.EReferenceType.abstract»
                    buildCreationTool(new «reference.createFeatureClassName.shortName»(this.getFeatureProvider()));
                «ENDIF»
                «FOR subclass : target.EReferenceType.getSubclasses().filter(c|!c.abstract) »
                        buildCreationTool(new «reference.getCreateReferenceAsListFeatureClassName(subclass).shortName»(this.getFeatureProvider()));
                «ENDFOR»
            «ENDFOR»
        }
    '''
    
    def Iterable<String> getAllCreateFeatureNames (Diagram diagram) {
        val result = new ArrayList<String>()
        result += diagram.allCreateBehaviors.map(b|b.createFeatureClassName)
        for (MetaReference ref: diagram.connectionReferences) {
            result += ref.createReferenceAsConnectionFeatureClassName.shortName
        }
        result
    }
    
    def generate_buildPaletteCompartments(Diagram diagram) '''
        «overrideHeader»
        protected Iterable<IPaletteCompartmentEntry> buildPaletteCompartments() {
            return Lists.newArrayList(
                «FOR compartmentName : diagram.paletteCompartmentNames SEPARATOR ", "»
                    getPaletteCompartment(COMPARTMENT_«compartmentName.toUpperCase»)
                «ENDFOR»
                , getPaletteCompartment(COMPARTMENT_DEFAULT)
            );
        }
    '''

    def generate_getPaletteCompartmentForFeature(Diagram diagram) '''
        «overrideHeader»
        protected IPaletteCompartmentEntry getPaletteCompartmentForFeature(IFeature feature) {
            «FOR behavior: diagram.allCreateBehaviors.filter(b|b.paletteCompartment!=null) SEPARATOR "else"»
                if (feature instanceof «behavior.createFeatureClassName») {
                    return getPaletteCompartment(COMPARTMENT_«behavior.paletteCompartment.toUpperCase»);
                }
            «ENDFOR»
            return super.getPaletteCompartmentForFeature(feature);
        }
    '''
    
    def String getCreateFeatureClassName (CreateBehavior behavior) {
        val mc = behavior.getContainerOfType(typeof(MetaClass))
        
        mc.createFeatureClassName.shortName
    }
    
    def getConnectionReferences (Diagram diagram) {
        val result = new ArrayList<MetaReference>()
        for (mc: diagram.metaClasses) {
            result += mc.references
        }
        result
    }
    
    def getListReferences (Diagram diagram) {
        val result = new ArrayList<MetaReference>()
        for (mc: diagram.metaClasses) {
            result += mc.eAllOfType(typeof(MetaReference)).filter(mr|mr.isListReference)
        }
        result
    }
    
    def isListReference (MetaReference ref) {
        ref.eContainer.eClass!=SprayPackage::eINSTANCE.metaClass
    }
}