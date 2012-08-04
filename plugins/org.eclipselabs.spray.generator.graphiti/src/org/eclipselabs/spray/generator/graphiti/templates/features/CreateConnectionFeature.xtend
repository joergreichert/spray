package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.AskForHandler
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

class CreateConnectionFeature extends FileGenerator<MetaClass>  {
    @Inject extension NamingExtensions
    @Inject extension MetaClassExtensions
    @Inject extension AskForHandler
    
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
            public «className»(final IFeatureProvider fp) {
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
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateConnectionContext;
        import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
        import org.eclipse.graphiti.mm.pictograms.Anchor;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateConnectionFeature;
        import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCreateConnectionFeature {
            protected static String TITLE = "Create «metaClass.uiLabel»";
            protected static String USER_QUESTION = "Enter new «metaClass.uiLabel» name";
            «generate_additionalFields(metaClass)»
        
            public «className»(final IFeatureProvider fp) {
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
            «generate_additionalMethods(metaClass)»
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
        public boolean canCreate(final ICreateConnectionContext context) {
            if (context.getTargetAnchor() == null)
                return false;
            // return true if both anchors belong to an EClass
            // and those EClasses are not identical
            «from.itfName» source = get«from.name»(context.getSourceAnchor());
            «to.itfName» target = get«to.name»(context.getTargetAnchor());
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
        public boolean canStartConnection(final ICreateConnectionContext context) {
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
        public Connection create(final ICreateConnectionContext context) {
            «val containmentRef = metaClass.createBehavior.containmentReference»
            Connection newConnection = null;
    
            // get EClasses which should be connected
            final «from.itfName» source = get«from.name»(context.getSourceAnchor());
            final «to.itfName» target = get«to.name»(context.getTargetAnchor());
            «IF containmentRef.EType==from»
                final «from.name» container = source;
            «ELSE»
                // containment reference is not a feature of source
                final «containmentRef.EContainingClass.itfName» container = org.eclipse.xtext.EcoreUtil2.getContainerOfType(source, «containmentRef.EContainingClass.itfName».class);
            «ENDIF»
            if (source != null && target != null) {
                // create new business object
                final «metaClass.itfName» eReference = create«metaClass.type.name»(source, target);
                // add the element to containment reference
                «IF containmentRef.many»
                    container.get«containmentRef.name.toFirstUpper»().add(eReference);
                «ELSE»
                    container.set«containmentRef.name.toFirstUpper»(eReference);
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
                
                // activate direct editing after object creation
                getFeatureProvider().getDirectEditingInfo().setActive(true);
            }
    
            return newConnection;
        }
    '''
    
    def generate_getFromTypeForAnchor (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        /**
         * Returns the «from.name» belonging to the anchor, or <code>null</code> if not available.
         */
        private «from.itfName» get«from.name»(final Anchor anchor) {
            if (anchor != null) {
                final EObject bo = (EObject) getBusinessObjectForPictogramElement(anchor.getParent()); 
                if (bo instanceof «from.itfName») {
                    return («from.itfName») bo;
                }
            }
            return null;
        }
    '''
    
    def generate_getToTypeForAnchor (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «val from = connection.from.EType as EClass»
        «val to = connection.to.EType as EClass»
        «IF from.name != to.name» ««« only generate the method if 'to' type is different from 'from' type, since a method for 'from' was already generated
        /**
         * Returns the «to.name» belonging to the anchor, or <code>null</code> if not available.
         */
        private «to.itfName» get«to.name»(final Anchor anchor) {
            if (anchor != null) {
                final EObject bo = (EObject) getBusinessObjectForPictogramElement(anchor.getParent()); 
                if (bo instanceof «to.itfName») {
                    return («to.itfName») bo;
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
        «val createBehavior = metaClass.behaviorsList.filter(typeof(CreateBehavior)).head»
        /**
         * Creates a EReference between two EClasses.
         */
        protected «metaClass.itfName» create«metaClass.type.name»(final «from.itfName» source, final «to.itfName» target) {
            // TODO: Domain Object
            final «metaClass.itfName» domainObject = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();
            «handleAskFor(metaClass, "domainObject", createBehavior.askFor)»
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