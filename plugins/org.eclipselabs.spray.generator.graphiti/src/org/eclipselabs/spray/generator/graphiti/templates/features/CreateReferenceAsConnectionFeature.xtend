package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*


class CreateReferenceAsConnectionFeature extends FileGenerator<MetaReference>  {
    @Inject extension NamingExtensions
    @Inject extension MetaReferenceExtensions
    
    override CharSequence generateBaseFile(MetaReference modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(MetaReference modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaReference metaReference, String className) '''    
         «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
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
        «header(this)»
        package «feature_package()»;

        import org.eclipse.emf.common.util.EList;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateConnectionContext;
        import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
        import org.eclipse.graphiti.mm.pictograms.Anchor;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateConnectionFeature;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCreateConnectionFeature {
            «generate_additionalFields(reference)»
        
            «generate_constructor(reference, className)»
            «generate_canCreate(reference)»
            «generate_canStartConnection(reference)»
            «generate_create(reference)»
            «generate_getMetaClassForReference(reference)»
            «generate_getReferenceTargetAnchor(reference)»
            «generate_createTargetType(reference)»
            «generate_additionalMethods(reference)»
            «generateGetDslShapeAchor»        
        }
    '''
    
    def generate_constructor (MetaReference reference, String className) '''
        «val target = reference.target»
        public «className»(final IFeatureProvider fp) {
            // set name and description of the creation feature
            this(fp, "«target.name»", "Create «target.name»");
        }
        protected «className»(final IFeatureProvider fp, final String name, final String description) {
            // provide name and description for the UI, e.g. the palette
            super(fp, name, description);
        }
    '''

    def generate_canCreate (MetaReference reference) '''
        «val target = reference.target»
        «overrideHeader»
        public boolean canCreate(final ICreateConnectionContext context) {
            // return true if both anchors belong to an EClass of the correct type and those EClasses are not identical
            Anchor targetAnchor = getDslShapeAnchor(context.getTargetPictogramElement());
            Anchor sourceAnchor = getDslShapeAnchor(context.getSourcePictogramElement());
            final «reference.metaClass.itfName» source = get«reference.metaClass.type.name»(sourceAnchor);
            final «target.EReferenceType.itfName» target = get«target.name.toFirstUpper»(targetAnchor);
            if ( (source != null) && (target != null) && (source != target) ) {
                return true;
            }
            return false;
        }
    '''
    
    def generate_canStartConnection (MetaReference reference) '''
        «val target = reference.target»
        «overrideHeader»
        public boolean canStartConnection(final ICreateConnectionContext context) {
            // return true if start anchor belongs to a EClass of the right type
            Anchor sourceAnchor = getDslShapeAnchor(context.getSourcePictogramElement());
            final «reference.metaClass.itfName» «reference.metaClass.itfName.toFirstLower» = («reference.metaClass.itfName») get«reference.metaClass.type.name»(sourceAnchor);
            if («reference.metaClass.itfName.toFirstLower» == null) {
                return false;
            }
            «IF target.many && target.upperBound >= 0»
                // multi-valued reference with fixed upper bound. can only be started if maximum size is not reached yet
                final int maxSize = «target.upperBound»;
                return «reference.metaClass.itfName.toFirstLower».get«target.name.toFirstUpper»().size() < maxSize;
            «ELSEIF !target.many»
                // single valued reference. can only be started if the reference is not set yet.
                return «reference.metaClass.itfName.toFirstLower».get«target.name.toFirstUpper»() == null;
            «ELSE»
                return true;
            «ENDIF»
        }
    '''
    
    def generate_create (MetaReference reference) '''
        «val target = reference.target»
        «overrideHeader»
        public Connection create(final ICreateConnectionContext context) {
            Connection newConnection = null;
            Anchor sourceAnchor = getDslShapeAnchor(context.getSourcePictogramElement());
            Anchor targetAnchor = getDslShapeAnchor(context.getTargetPictogramElement());
    
            // get EClasses which should be connected
            final «reference.metaClass.itfName» source = get«reference.metaClass.type.name»(sourceAnchor);
            final «target.EReferenceType.itfName» target = get«target.name.toFirstUpper»(targetAnchor);
    
            if (source != null && target != null) {
                // create new business object
                set«target.name.toFirstUpper()»(source, target);
                // add connection for business object
                final AddConnectionContext addContext = new AddConnectionContext( sourceAnchor, targetAnchor);
                addContext.setNewObject(source);
                addContext.putProperty(PROPERTY_REFERENCE, «reference.literalConstant».getName());
                // TODO: assume that the target object has a Name property
        //        addContext.putProperty("TARGETOBJECT", target.getName());
                newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
            }
    
            return newConnection;
        }
    '''
 
    def generate_getMetaClassForReference (MetaReference reference) '''
        /**
         * Returns the «reference.metaClass.itfName» belonging to the anchor, or <code>null</code> if not available.
         */
        protected «reference.metaClass.itfName» get«reference.metaClass.type.name»(final Anchor anchor) {
            if( anchor != null) {
                final Object bo = getBusinessObjectForPictogramElement(anchor.getParent());
                if (anchor != null && bo instanceof «reference.metaClass.itfName») {
                    return («reference.metaClass.itfName») bo;
                }
            }
            return null;
        }
    '''
    
    def generate_getReferenceTargetAnchor (MetaReference reference) '''
        «val target = reference.target»
        «IF reference.metaClass.type.name != target.name»
        /**
         * Returns the «target.name» belonging to the anchor, or <code>null</code> if not available.
         */
        protected «target.EReferenceType.itfName» get«target.name.toFirstUpper»(final Anchor anchor) {
            if( anchor != null) {
                final Object bo = getBusinessObjectForPictogramElement(anchor.getParent());
                if (anchor != null && bo instanceof «target.EReferenceType.itfName») {
                    return («target.EReferenceType.itfName») bo;
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
        protected void set«target.name.toFirstUpper»(final «reference.metaClass.itfName» source, final «target.EReferenceType.itfName» target) {
            «IF !target.many» 
                source.set«target.name.toFirstUpper»(target);
            «ELSE»
                source.get«target.name.toFirstUpper»().add(target);
            «ENDIF»
        }
    '''
    
        def generateGetDslShapeAchor()'''
        protected Anchor getDslShapeAnchor(PictogramElement pe) {
            if( pe == null ){
                return null;
            }
            Shape dslShape = SprayLayoutService.findDslShape(pe);
            if (dslShape != null) {
                EList<Anchor> anchors = dslShape.getAnchors();
                if (!anchors.isEmpty()) {
                    return anchors.get(0);
                }
            }
            return null;
        }
    '''
    
}