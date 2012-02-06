package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*


class LayoutFromDslFeature extends FileGenerator<ShapeFromDsl> {
    @Inject extension NamingExtensions
    
    override CharSequence generateBaseFile(ShapeFromDsl modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ShapeFromDsl modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ShapeFromDsl container, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(ShapeFromDsl container, String className) '''
        «var diagramName = container.represents.diagram.name »
        «var pack = container.represents.type.EPackage.name »
        «var fullPackage = fullPackageName(container.represents.type) »
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.common.util.EList;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ILayoutContext;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractLayoutFeature;
        // MARKER_IMPORT
        
        public class «className» extends AbstractLayoutFeature {
            protected static final int MIN_HEIGHT = 30;
            protected static final int MIN_WIDTH = 50;
            «generate_additionalFields(container)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
         
            «generate_canLayout(container)»
            «generate_layout(container)»
            «generate_additionalFields(container)»
        }
        '''
        
        def generate_canLayout (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean canLayout(ILayoutContext context) {
               PictogramElement pe = context.getPictogramElement();
               if (!(pe instanceof ContainerShape)) {
                   return false;
               }
               EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
               return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof «container.represents.type.javaInterfaceName.shortName»);
            }
        '''
        
        def generate_layout (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean layout(ILayoutContext context) {
                return true; // container.layoutContainer(context);
            }
        '''
}