package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class CreateReferenceAsConnectionFeature extends FileGenerator  {
    @Inject extension NamingExtensions
    @Inject extension MetaReferenceExtensions
    
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
        //    /**
        //     * {@inheritDoc}
        //     */
        //    @Override
        //    public String getCreateImageId() {
        //        return «metaReference.diagram.imageProviderSimpleClassName».«metaReference.diagram.name.toUpperCase»__MYIMAGEID;
        //    }
        }
    '''

    def mainFile(MetaReference reference, String className) '''
        «val target = reference.target»
        «val diagramName = reference.metaClass.diagram.name »
        «header(this)»
        package «feature_package()»;

        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateConnectionContext;
        import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
        import org.eclipse.graphiti.mm.pictograms.Anchor;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateConnectionFeature;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateConnectionFeature {
            «generate_additionalFields(reference)»
        
            «generate_constructor(reference, className)»
            «generate_canCreate(reference)»
            «generate_canStartConnection(reference)»
            «generate_create(reference)»
            «generate_getMetaClassForReference(reference)»
            «generate_getReferenceTargetAnchor(reference)»
            «generate_createTargetType(reference)»
            «generate_additionalFields(reference)»
        
        }
    '''
    
    def generate_constructor (MetaReference reference, String className) '''
        «val target = reference.target»
        public «className»(IFeatureProvider fp) {
            // set name and description of the creation feature
            this(fp, "«target.name»", "Create «target.name»");
        }
        protected «className»(IFeatureProvider fp, String name, String description) {
            // provide name and description for the UI, e.g. the palette
            super(fp, name, description);
        }
    '''

    def generate_canCreate (MetaReference reference) '''
        «val target = reference.target»
        «overrideHeader»
        public boolean canCreate(ICreateConnectionContext context) {
            // return true if both anchors belong to an EClass
            // and those EClasses are not identical
            «reference.metaClass.javaInterfaceName.shortName» source = get«reference.metaClass.name»(context.getSourceAnchor());
            «target.EReferenceType.javaInterfaceName.shortName» target = get«target.name.toFirstUpper»(context.getTargetAnchor());
            if ( (source != null) && (target != null) && (source != target) ) {
                return true;
            }
            return false;
        }
    '''
    
    def generate_canStartConnection (MetaReference reference) '''
        «val target = reference.target»
        «overrideHeader»
        public boolean canStartConnection(ICreateConnectionContext context) {
            // return true if start anchor belongs to a EClass
            «reference.metaClass.name» «reference.metaClass.name.toFirstLower» = («reference.metaClass.name») get«reference.metaClass.name»(context.getSourceAnchor());
            if («reference.metaClass.name.toFirstLower» == null) {
                return false;
            }
            «IF target.many && target.upperBound >= 0»
                // multi-valued reference with fixed upper bound. can only be started if maximum size is not reached yet
                final int maxSize = «target.upperBound»;
                return «reference.metaClass.name.toFirstLower».get«target.name.toFirstUpper»().size() < maxSize;
            «ELSEIF !target.many»
                // single valued reference. can only be started if the reference is not set yet.
                return «reference.metaClass.name.toFirstLower».get«target.name.toFirstUpper»() == null;
            «ENDIF»
        }
    '''
    
    def generate_create (MetaReference reference) '''
        «val target = reference.target»
        «overrideHeader»
        public Connection create(ICreateConnectionContext context) {
            Connection newConnection = null;
    
            // get EClasses which should be connected
            «reference.metaClass.name» source = get«reference.metaClass.name»(context.getSourceAnchor());
            «target.EReferenceType.name» target = get«target.name.toFirstUpper»(context.getTargetAnchor());
    
            if (source != null && target != null) {
                // create new business object
                set«target.name.toFirstUpper()»(source, target);
                // add connection for business object
                AddConnectionContext addContext = new AddConnectionContext( context.getSourceAnchor(), context.getTargetAnchor());
                addContext.setNewObject(source);
                addContext.putProperty(ISprayConstants.PROPERTY_REFERENCE, «reference.literalConstant».getName());
                // TODO: assume that the target object has a Name property
        //        addContext.putProperty("TARGETOBJECT", target.getName());
                newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
            }
    
            return newConnection;
        }
    '''
 
    def generate_getMetaClassForReference (MetaReference reference) '''
        /**
         * Returns the «reference.metaClass.name» belonging to the anchor, or <code>null</code> if not available.
         */
        protected «reference.metaClass.name» get«reference.metaClass.name»(Anchor anchor) {
            if (anchor != null) {
                Object object = getBusinessObjectForPictogramElement(anchor.getParent());
                if (object instanceof «reference.metaClass.name») {
                    return («reference.metaClass.name») object;
                }
            }
            return null;
        }
    '''
    
    def generate_getReferenceTargetAnchor (MetaReference reference) '''
        «val target = reference.target»
        «IF reference.metaClass.name != target.name»
        /**
         * Returns the «target.name» belonging to the anchor, or <code>null</code> if not available.
         */
        protected «target.EReferenceType.name» get«target.name.toFirstUpper»(Anchor anchor) {
            if (anchor != null) {
                Object object = getBusinessObjectForPictogramElement(anchor.getParent());
                if (object instanceof «target.EReferenceType.name») {
                    return («target.EReferenceType.name») object;
                }
            }
            return null;
        }
        «ENDIF»
    '''
    
    def generate_createTargetType (MetaReference reference) '''
        «val target = reference.target»
        /**
         * Creates a «target.name» .
         */
        protected void set«target.name.toFirstUpper»(«reference.metaClass.name» source, «target.EReferenceType.name» target) {
            «IF !target.many» 
                source.set«target.name.toFirstUpper»(target);
            «ELSE»
                source.get«target.name.toFirstUpper»().add(target);
            «ENDIF»
        }
    '''
}