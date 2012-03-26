package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.xtext.util.GenModelHelper

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions


class CreateConnectionFeature extends FileGenerator<MetaClass>  {
    @Inject extension NamingExtensions
    @Inject extension GenModelHelper
    @Inject extension MetaClassExtensions
    
    override CharSequence generateBaseFile(MetaClass modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(MetaClass modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaClass metaClass, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
            @Override
            public boolean hasDoneChanges() {
                return false;
            }
        
        }
    '''

    def mainFile (MetaClass metaClass, String className) '''
        «header(this)»
        package «feature_package()»;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateConnectionContext;
        import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
        import org.eclipse.graphiti.mm.pictograms.Anchor;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateConnectionFeature;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateConnectionFeature {
            «generate_additionalFields(metaClass)»
        
            public «className»(IFeatureProvider fp) {
                // provide name and description for the UI, e.g. the palette
                super(fp, "«metaClass.uiLabel»", "Create «metaClass.uiLabel»");
                gaService = «metaClass.diagram.activatorClassName.shortName».get(IGaService.class);
            }
        
            «generate_canCreate(metaClass)»
            «generate_canStartConnection(metaClass)»
            «generate_create(metaClass)»
            «generate_getFromTypeForAnchor(metaClass)»
            «generate_getToTypeForAnchor(metaClass)»
            «generate_createEReference(metaClass)»
            «generate_getCreateImageId(metaClass)»
            «generate_additionalFields(metaClass)»
        }
    '''
    /**
     * Determine the name that appears in the dialog when asking for the name
     */
    def private getUiLabel (MetaClass mc) {
        if (mc.hasCreateBehavior && mc.createBehavior.label!=null)
            mc.createBehavior.label
        else
            mc.visibleName
    }

    def generate_canCreate (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        «val to = connection.to.EType as EClass»
        «overrideHeader»
        public boolean canCreate(ICreateConnectionContext context) {
            // return true if both anchors belong to an EClass
            // and those EClasses are not identical
            «from.javaInterfaceName.shortName» source = get«from.name»(context.getSourceAnchor());
            «to.javaInterfaceName.shortName» target = get«to.name»(context.getTargetAnchor());
            if ( (source != null) && (target != null) && (source != target) ) {
                return true;
            }
            return false;
        }
    '''
    
    def generate_canStartConnection (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        «overrideHeader»
        public boolean canStartConnection(ICreateConnectionContext context) {
            // return true if start anchor belongs to a EClass
            if (get«from.name»(context.getSourceAnchor()) != null) {
                return true;
            }
            return false;
        }
    '''
    
    def generate_create (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        «val to = connection.to.EType as EClass»
        «overrideHeader»
        public Connection create(ICreateConnectionContext context) {
            «val containmentRef = metaClass.behaviorsList.filter(typeof(CreateBehavior)).head.containmentReference»
            Connection newConnection = null;
    
            // get EClasses which should be connected
            final «from.name» source = get«from.name»(context.getSourceAnchor());
            final «to.name» target = get«to.name»(context.getTargetAnchor());
    
            if (source != null && target != null) {
                // create new business object
                final «metaClass.javaInterfaceName.shortName» eReference = create«metaClass.name»(source, target);
                // add the element to containment reference
                «IF containmentRef.many»
                    source.get«containmentRef.name.toFirstUpper»().add(eReference);
                «ELSE»
                    source.set«containmentRef.name.toFirstUpper»(eReference);
                «ENDIF»
                // add connection for business object
                final AddConnectionContext addContext = new AddConnectionContext(
                        context.getSourceAnchor(), context.getTargetAnchor());
                addContext.setNewObject(eReference);
                «IF metaClass.alias!=null»
                // store alias name
                addContext.putProperty(PROPERTY_ALIAS, "«metaClass.alias»");
                «ENDIF»
                newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
            }
    
            return newConnection;
        }
    '''
    
    def generate_getFromTypeForAnchor (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        /**
         * Returns the «from.name» belonging to the anchor, or null if not available.
         */
        private «from.name» get«from.name»(Anchor anchor) {
            if (anchor != null) {
                Object object = getBusinessObjectForPictogramElement(anchor.getParent());
                if (object instanceof «from.name») {
                    return («from.name») object;
                }
            }
            return null;
        }
    '''
    
    def generate_getToTypeForAnchor (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        «val to = connection.to.EType as EClass»
        «IF from.name != to.name»
        /**
         * Returns the «to.name» belonging to the anchor, or null if not available.
         */
        private «to.name» get«to.name»(Anchor anchor) {
            if (anchor != null) {
                Object object = getBusinessObjectForPictogramElement(anchor.getParent());
                if (object instanceof «to.name») {
                    return («to.name») object;
                }
            }
            return null;
        }
        «ENDIF»
    '''
    
    def generate_createEReference (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        «val to = connection.to.EType as EClass»
        /**
         * Creates a EReference between two EClasses.
         */
        protected «metaClass.name» create«metaClass.name»(«from.name» source, «to.name» target) {
            // TODO: Domain Object
            «metaClass.name» domainObject = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();
            «IF metaClass.type.EAttributes.exists(att|att.name == "name") »
                domainObject.setName("new «metaClass.visibleName»");
            «ENDIF»
            «IF connection.from.changeable»
                domainObject.set«connection.from.name.toFirstUpper»(source);
            «ELSE»
                // reference '«connection.from.name»' is not settable
            «ENDIF»
            domainObject.set«connection.to.name.toFirstUpper»(target);

            setDoneChanges(true);
            return domainObject;
        }
    '''
    
    def generate_getCreateImageId (MetaClass metaClass) '''
        «IF (metaClass.icon != null) && ! metaClass.icon.equalsIgnoreCase("")»
            @Override
            public String getCreateImageId() {
                return «metaClass.diagram.imageProviderClassName.shortName».«metaClass.diagram.getImageIdentifier(metaClass.icon)»; 
            }
        «ENDIF»
    '''
}