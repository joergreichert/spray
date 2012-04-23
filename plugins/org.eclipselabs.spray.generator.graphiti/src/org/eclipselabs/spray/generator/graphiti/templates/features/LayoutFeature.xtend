package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ContainerInSpray

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*

class LayoutFeature extends FileGenerator<ContainerInSpray> {
    @Inject extension NamingExtensions
    
    override CharSequence generateBaseFile(ContainerInSpray modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ContainerInSpray modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ContainerInSpray container, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(ContainerInSpray container, String className) '''
        «var containerType = constainerClass(container)»
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.common.util.EList;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ILayoutContext;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractLayoutFeature;
        import «util_package()».«containerType»;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractLayoutFeature {
            protected static final int MIN_HEIGHT = 30;
            protected static final int MIN_WIDTH = 50;
            protected «containerType» container = null;
            «generate_additionalFields(container)»
        
            public «className»(final IFeatureProvider fp) {
                super(fp);
                container = new «containerType»();
            «IF container.layout.figure.matches(".*Concept.*")»
                container.setConcept(true);
            «ENDIF»
            }
         
            «generate_canLayout(container)»
            «generate_layout(container)»
            «generate_additionalMethods(container)»
        }
        '''
        
        def generate_canLayout (ContainerInSpray container) '''
            «overrideHeader»
            public boolean canLayout(final ILayoutContext context) {
               final PictogramElement pe = context.getPictogramElement();
               if (!(pe instanceof ContainerShape)) {
                   return false;
               }
               final EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
               return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof «container.represents.type.itfName»);
            }
        '''
        
        def generate_layout (ContainerInSpray container) '''
            «overrideHeader»
            public boolean layout(final ILayoutContext context) {
                return container.layoutContainer(context);
            }
        '''
}