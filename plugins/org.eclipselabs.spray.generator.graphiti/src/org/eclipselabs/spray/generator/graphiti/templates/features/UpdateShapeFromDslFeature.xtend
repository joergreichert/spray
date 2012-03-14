package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

/*
 * Template for generating Graphiti Update feature for a ContainerInSpray representing a MetaClass
 */
class UpdateShapeFromDslFeature extends FileGenerator<ShapeFromDsl>  {
    @Inject extension NamingExtensions
    @Inject extension DiagramExtensions

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
        «header(this)»
        package «feature_package()»;

        import java.util.HashMap;
        import java.util.Map;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        import «util_package()».SprayContainerService;
        import «container?.represents?.javaInterfaceName»;
        // MARKER_IMPORT
        
        public class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(container)»
            public «className»(IFeatureProvider fp) {
                super(fp);
                gaService = «container?.diagram?.activatorClassName?.shortName».get(IGaService.class);
            }
         
            «generate_canUpdate(container)»
            «generate_updateNeeded(container)»
            «generate_update(container)»
            «generate_valueMapping(container)»
            «generate_additionalFields(container)»
        }
        '''
        
        def generate_canUpdate (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean canUpdate(IUpdateContext context) {
                // return true, if linked business object is a EClass
                EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
                PictogramElement pictogramElement = context.getPictogramElement();
                return (bo instanceof «container?.represents?.name»)&& (!(pictogramElement instanceof Diagram));
            }
        '''
        
        def generate_updateNeeded (ShapeFromDsl container) '''
            «overrideHeader»
            public IReason updateNeeded(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof «container?.represents?.name»)) {
                    return Reason.createFalseReason(); 
                }
                return Reason.createFalseReason();
             }
        '''
        
        def generate_update (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean update(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                  «container?.represents?.name» eClass = («container?.represents?.name») bo;
                return true; // SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
        '''
        
        def generate_valueMapping (ShapeFromDsl container) '''
            Map<String, String> values = null; 
            protected Map<String, String> getValues(«container?.represents?.name» eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }

            protected void fillValues(«container?.represents?.name» eClass) {
                String type, value;
            }
            
            protected String getValue (String type, «container?.represents?.name» eClass) {
                return "UNKNOWN";
            }
        '''
}