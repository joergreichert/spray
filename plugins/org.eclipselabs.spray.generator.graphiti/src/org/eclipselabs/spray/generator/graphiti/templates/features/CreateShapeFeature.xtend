package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.AskForHandler
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

class CreateShapeFeature extends FileGenerator<MetaClass> {
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
        }
    '''

    def mainFile (MetaClass metaClass, String className) '''
        «val diagram = metaClass.diagram»
        «header(this)»
        package «feature_package()»;

        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateContext;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;
        import «metaClass.javaInterfaceName»;
        «IF metaClass.alias!=null»
        import org.eclipse.graphiti.features.context.IAreaContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.features.context.impl.AddContext;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        «ENDIF»
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCreateFeature {
            protected static String TITLE = "Create «metaClass.uiLabel»";
            protected static String USER_QUESTION = "Enter new «metaClass.uiLabel» name";
            protected «diagram.modelServiceClassName.shortName» modelService;
            protected «metaClass.javaInterfaceName.shortName» newClass = null;
            «generate_additionalFields(metaClass)»
        
        
            public «className» (final IFeatureProvider fp) {
                // set name and description of the creation feature
                super(fp, "«metaClass.createFeatureLabel»", "«metaClass.createFeatureDescription»");
                modelService = new «diagram.modelServiceClassName.shortName»(fp.getDiagramTypeProvider());
            }
        
            «generate_canCreate(metaClass)»
            «generate_create(metaClass)»
            «generate_createModelElement(metaClass)»
            «generate_getCreateImageId(metaClass)»
            «generate_addGraphicalRepresentation(metaClass)»
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
        «overrideHeader()»
        public boolean canCreate(final ICreateContext context) {
            // TODO: Respect the cardinality of the containment reference
            return context.getTargetContainer() instanceof Diagram;
        }
    '''
    
    def generate_create (MetaClass metaClass) '''
        «overrideHeader()»
        public Object[] create(final ICreateContext context) {
            newClass = create«metaClass.visibleName»(context);
        
            if (newClass == null ) {
                return EMPTY;
            }

            // do the add
            addGraphicalRepresentation(context, newClass);
            
            // activate direct editing after object creation
            getFeatureProvider().getDirectEditingInfo().setActive(true);
            
            // return newly created business object(s)
            return new Object[] { newClass };
        }
    '''
    
    def generate_createModelElement (MetaClass metaClass) '''
        «val diagram = metaClass.diagram»
        «val modelClassName = diagram.modelType.javaInterfaceName.shortName»
        «val createBehavior = metaClass.behaviorsList.filter(typeof(CreateBehavior)).head»
        «val containmentRef = createBehavior.containmentReference»
        /**
         * Creates a new {@link «metaClass.javaInterfaceName.shortName»} instance and adds it to the containing type.
         */
        protected «metaClass.javaInterfaceName.shortName» create«metaClass.visibleName»(final ICreateContext context) {
        	// create «metaClass.name» instance
        	final «metaClass.javaInterfaceName.shortName» newClass = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();
            «handleAskFor(metaClass, "newClass", createBehavior.askFor)»
            
            «IF containmentRef != null»
               // add the element to containment reference
               «modelClassName» model = modelService.getModel();
               «IF containmentRef.many»
                   model.get«containmentRef.name.toFirstUpper»().add(newClass);
               «ELSE»
                   model.set«containmentRef.name.toFirstUpper»(newClass);
               «ENDIF»
               
            «ENDIF»
            setDoneChanges(true);
            return newClass;
        }
    '''
    

 
    /**
     * When a MetaClass is aliased we need to put a property with the alias name into the AddContext in order to
     * return the right AddFeature in the FeatureProvider
     */
    def generate_addGraphicalRepresentation (MetaClass metaClass) '''
        «IF metaClass.alias!=null»
        «overrideHeader()»
        protected PictogramElement addGraphicalRepresentation(final IAreaContext context, final Object newObject) {
            final AddContext ctx = new AddContext(context, newObject);
            ctx.putProperty(ISprayConstants.PROPERTY_ALIAS, "«metaClass.alias»");
            return getFeatureProvider().addIfPossible(ctx);
        }
        «ENDIF»
    '''
    
    def generate_getCreateImageId (MetaClass metaClass) '''
        «val diagram = metaClass.diagram»
        «IF (metaClass.icon != null)»
            «overrideHeader()»
            public String getCreateImageId() {
                return «diagram.imageProviderClassName.shortName».«diagram.getImageIdentifier(metaClass.icon)»;
            }
        «ENDIF»
    '''
    
}