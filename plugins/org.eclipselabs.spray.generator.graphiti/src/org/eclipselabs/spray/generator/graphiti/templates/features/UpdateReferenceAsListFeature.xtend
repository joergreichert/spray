package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions


class UpdateReferenceAsListFeature extends FileGenerator {
    @Inject extension NamingExtensions
    @Inject extension MetaReferenceExtensions
    
    EClass target 
    
    def setTarget(EClass m){
        target = m 
    }
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as MetaReference, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as MetaReference, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaReference metaReference, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(MetaReference reference, String className) '''
        «header(this)»
        package «feature_package()»;

        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(reference)»
            public «className»(IFeatureProvider fp) {
                super(fp);
                gaService = «reference.diagram.activatorClassName.shortName».get(IGaService.class);
            }
            
            «generate_canUpdate(reference)»
            «generate_updateNeeded(reference)»
            «generate_update(reference)»
            «generate_getText(reference)»
            «generate_additionalMethods(reference)»
        }
    '''
    
    def generate_canUpdate (MetaReference reference) '''
        «overrideHeader»
        public boolean canUpdate(IUpdateContext context) {
            // return true, if linked business object is a EClass
            EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
            return (bo instanceof «target.javaInterfaceName.shortName»);
        }
    '''
    
    def generate_updateNeeded (MetaReference reference) '''
        «overrideHeader»
        public IReason updateNeeded(IUpdateContext context) {
            // retrieve name from pictogram model
            String pictogramName = null;
            PictogramElement pictogramElement = context.getPictogramElement();
            if (pictogramElement instanceof Shape) {
                Shape cs = (Shape) pictogramElement;
                if (cs.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) cs.getGraphicsAlgorithm();
                    // peService.getPropertyValue(shape, "REFERENCE");
                    if( pictogramName == null ){
                        pictogramName = text.getValue();
                    }
                }
            }
     
            // retrieve name from business model
            String businessName = null;
            EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
            if (bo instanceof «target.name») {
                «target.name» «target.name.toFirstLower» = («target.name») bo;
                businessName = getText(context, «target.name.toFirstLower»);
            }
     
            // update needed, if names are different
            boolean updateNameNeeded =
                ((pictogramName == null && businessName != null) ||
                    (pictogramName != null && !pictogramName.equals(businessName)));
            if (updateNameNeeded) {
                return Reason.createTrueReason("Property Name is out of date");
            } else {
                return Reason.createFalseReason();
            }
          }
    '''
    
    def generate_update (MetaReference reference) '''
        «overrideHeader»
        public boolean update(IUpdateContext context) {
           // retrieve name from business model
            String businessName = null;
            PictogramElement pictogramElement = context.getPictogramElement();
            EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
            if (bo instanceof «target.name») {
                «target.name» «target.name.toFirstLower» = («target.name») bo;
                businessName = getText(context, «target.name.toFirstLower»);
            }

            // Set name in pictogram model
            if (pictogramElement instanceof Shape) {
                Shape cs = (Shape) pictogramElement;
                if (cs.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) cs.getGraphicsAlgorithm();
                    text.setValue(businessName);
                    layoutPictogramElement(cs.getContainer().getContainer());
                    return true;
                }
            }
            return false;
        }
    '''
    
    def generate_getText (MetaReference reference) '''
        /**
         * Computes the displayed text. Clients may override this method.
         */
        protected String getText (IUpdateContext context, «target.name» bo) {
            return bo.getName();
        }
    '''
}