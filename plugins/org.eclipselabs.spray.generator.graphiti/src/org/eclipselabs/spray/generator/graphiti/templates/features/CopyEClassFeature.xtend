package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.Diagram

public class CopyEClassFeature extends FileGenerator<Diagram> {

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
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        
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
        import «metaclass.modelType.javaInterfaceName»;
        
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCopyFeature  {
            «generate_additionalFields(metaclass)»
            
            protected IPeService peService = Graphiti.getPeService();
            
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
			if (pes == null || pes.length == 0) {  // nothing selected
				return false;
			}
			// return true, if all selected elements are a EClasses
			for (PictogramElement pe : pes) {
				final Object bo = getBusinessObjectForPictogramElement(pe);
				if (!(bo instanceof «metaclass.modelType.name»)) {
					return false;
				}
			}
			return true;
		}
    '''
    
    def generate_copy(Diagram metaclass)'''
		«overrideHeader»
		public void copy(ICopyContext context) {
			PictogramElement[] pes = context.getPictogramElements();
			putToClipboard(pes);
		}
    '''
}