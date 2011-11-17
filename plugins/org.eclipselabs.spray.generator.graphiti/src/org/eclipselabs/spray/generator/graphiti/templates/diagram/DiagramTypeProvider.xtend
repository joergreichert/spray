package org.eclipselabs.spray.generator.graphiti.templates.diagram

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class DiagramTypeProvider extends FileGenerator {
    @Inject extension NamingExtensions
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
        import org.eclipse.graphiti.tb.IToolBehaviorProvider;
        // MARKER_IMPORT
        
        public class «className» extends AbstractDiagramTypeProvider {
            private IToolBehaviorProvider[] toolBehaviorProviders;
            «generate_additionalFields(diagram)»
        
            public «className»() {
                super();
                setFeatureProvider(new «diagram.name.toFirstUpper»FeatureProvider(this));
            }
        
            @Override
            public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
                if (toolBehaviorProviders == null) {
                    toolBehaviorProviders =
                        new IToolBehaviorProvider[] { new «diagram.name.toFirstUpper»ToolBehaviorProvider(
                            this) };
                }
                return toolBehaviorProviders;
            }
            
            «generate_additionalFields(diagram)»
        }
    '''

    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «GeneratorUtil::diagram_package()»;
         
        public class «className» extends «className»Base {
         
        }
    '''

}