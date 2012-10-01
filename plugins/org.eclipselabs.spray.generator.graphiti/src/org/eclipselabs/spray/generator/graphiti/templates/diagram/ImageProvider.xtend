package org.eclipselabs.spray.generator.graphiti.templates.diagram

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

class ImageProvider extends FileGenerator<Diagram> {
    @Inject extension NamingExtensions
    
    override CharSequence generateBaseFile(Diagram modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(Diagram modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «diagram_package()»;
        
        public class «className» extends «className»Base {
        //    /**
        //     * The image identifier for ...
        //     */
        //    public static final String «diagram.name.toUpperCase»__MYIMAGEID     = PREFIX + "MYIMAGEID";
        //
        //    /**
        //     * {@inheritDoc}
        //     */
        //    @Override
        //    protected void addAvailableImages() {
        //        super.addAvailableImages();
        //        // register the path for each image identifier
        //       addImageFilePath(«diagram.name.toUpperCase»__MYIMAGEID, "icons/...");
        //    }
        }
    '''
    
    def mainFile(Diagram diagram, String className) '''
        «val icons = diagram.metaClasses.filter(m | m.icon!=null).map(m | m.icon).toSet()»
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
        
        public abstract class «className» extends AbstractImageProvider {
            // The prefix for all identifiers of this image provider
            public static final String PREFIX = "«diagram_package()».";
            «generate_additionalFields(diagram)»
        
            «FOR icon : icons»
                // The image identifier for an EReference.
                public static final String «diagram.getImageIdentifier(icon)»  = PREFIX + "«icon.imageBaseName»";
            «ENDFOR»
        
            @Override
            protected void addAvailableImages() {
                // register the path for each image identifier
            «FOR icon : icons»
                addImageFilePath(«diagram.getImageIdentifier(icon)», "icons/«icon»");
            «ENDFOR»
            }
            «generate_additionalMethods(diagram)»
        }
    '''
    
}