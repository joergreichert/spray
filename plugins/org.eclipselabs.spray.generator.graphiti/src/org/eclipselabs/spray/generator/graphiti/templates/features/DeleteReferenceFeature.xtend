package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class DeleteReferenceFeature extends FileGenerator {
    @Inject extension NamingExtensions
    
    override CharSequence generateBaseFile(EObject modelElement) {
        mainFile( modelElement as MetaReference, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(EObject modelElement) {
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
        import org.eclipse.emf.ecore.util.EcoreUtil;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IRemoveFeature;
        import org.eclipse.graphiti.features.context.IDeleteContext;
        import org.eclipse.graphiti.features.context.IRemoveContext;
        import org.eclipse.graphiti.features.context.impl.RemoveContext;
        import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;
        // MARKER_IMPORT
        
        public class «className» extends DefaultDeleteFeature {
            «generate_additionalFields(reference)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
            
            «generate_delete(reference)»
            «generate_deleteReferences(reference)»
            «generate_deleteReference(reference)»
            «generate_additionalFields(reference)»
        }
    '''
    
    def generate_delete (MetaReference reference) '''
        «overrideHeader»
        public void delete(IDeleteContext context) {
            PictogramElement pe = context.getPictogramElement();
            String reference = peService.getPropertyValue(pe, ISprayConstants.PROPERTY_REFERENCE);
            String element   = peService.getPropertyValue(pe, ISprayConstants.PROPERTY_TARGETOBJECT);

            Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
            if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {
                if (!getUserDecision()) {
                    return;
                }
            }

            preDelete(context);

            // TRY
            if( pe instanceof Connection) {
                Connection line = (Connection)pe;
                AnchorContainer parent = line.getStart().getParent();
                // EObject start = getBusinessObjectForPictogramElement(parent);
                AnchorContainer child = line.getEnd().getParent();
                // EObject end = getBusinessObjectForPictogramElement(child);
            }
            //END TRY

            IRemoveContext rc = new RemoveContext(pe);
            IFeatureProvider featureProvider = getFeatureProvider();
            IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
            if (removeFeature != null) {
                removeFeature.remove(rc);
            }

            deleteReferences(businessObjectsForPictogramElement, reference, element);
            setDoneChanges(true);
            postDelete(context);
        }
    '''
    
    def generate_deleteReferences (MetaReference reference) '''
        /**
         * Delete business objects.
         * 
         * @param businessObjects
         *            the business objects
         */
        protected void deleteReferences(Object[] businessObjects, String reference, String element) {
            if (businessObjects != null) {
                for (Object bo : businessObjects) {
                    deleteReference((EObject)bo, reference, element);
                }
            }
        }
    '''
    
    def generate_deleteReference (MetaReference reference) '''
        «val target = reference.target» 
        /**
         * Delete business object.
         * 
         * @param bo
         *            the bo
         */
        protected void deleteReference(EObject bo, String reference, String element) {
            if( reference == null){
                EcoreUtil.delete(bo, true);
            } else {
                if( bo instanceof «reference.metaClass.javaInterfaceName.shortName» ){
                    «reference.metaClass.name» object = («reference.metaClass.name» ) bo;
                    
            «IF target.upperBound != 1»
                    «target.EReferenceType.javaInterfaceName.shortName» toBeRemoved = null;
                    for («target.EReferenceType.name» rule : object.get«target.name.toFirstUpper»()) {
                        if( rule.getName().equals(element)){
                            toBeRemoved = rule;
                        }
                    }    
                    if( toBeRemoved != null ){
                        object.get«target.name.toFirstUpper»().remove(toBeRemoved);
                        // TODO Must remove toBeRemoved if it is a containment reference !
                    }
            «ELSE»
                    object.set«reference.name.toFirstUpper»(null);
            «ENDIF»
                } else {
                    System.out.println("DELETE OBJECT " + bo);
                }
            }
        }
    '''
}