package org.eclipselabs.spray.generator.graphiti.templates.diagram

import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class DiagramTypeProvider extends FileGenerator<Diagram> {
    
    override CharSequence generateBaseFile(Diagram modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(Diagram modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }

    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «GeneratorUtil::diagram_package()»;
         
        public class «className» extends «className»Base {
         
        }
    '''

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
        import org.eclipse.graphiti.tb.IToolBehaviorProvider;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractDiagramTypeProvider {
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
            
            «generate_additionalMethods(diagram)»
        }
    '''

}