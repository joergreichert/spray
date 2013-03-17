package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

public class CopyFeature extends FileGenerator<Diagram> {

    @Inject extension NamingExtensions
        
    override generateExtensionFile(Diagram modelElement) {
		modelElement.mainExtensionPointFile(javaGenFile.className);
	}
	
	override generateBaseFile(Diagram modelElement) {
		modelElement.mainFile(javaGenFile.baseClassName)
	}
		
     def mainExtensionPointFile(Diagram metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(Diagram metaclass, String className) '''
        «header(this)» 
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICopyContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipse.graphiti.ui.features.AbstractCopyFeature;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCopyFeature  {
            «generate_additionalFields(metaclass)»
            
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
            
            «generate_canCopy(metaclass)»
            «generate_copy(metaclass)»
        }
    '''

	def generate_canCopy(Diagram metaclass)'''
		«overrideHeader»
		public boolean canCopy(ICopyContext context) {
		    final PictogramElement[] pes = context.getPictogramElements();
		    // nothing selected
		    if (pes == null || pes.length == 0) {
		        return false;
		    }
		    // return true, if all selected elements are a subtypes of «metaclass.modelType.itfName»
		    for (PictogramElement pe : pes) {
		        final Object bo = getBusinessObjectForPictogramElement(pe);
		        if (!(bo instanceof «metaclass.modelType.itfName»)) {
		            return false;
		        }
		    }
		    return true;
		}
    '''
    
    def generate_copy(Diagram metaclass)'''
		«overrideHeader»
		public void copy(ICopyContext context) {
		    // Copy PictogramElements instead of Objects because of the properties on Shapes.
		    PictogramElement[] pes = context.getPictogramElements();
		    putToClipboard(pes);
		}
    '''
}