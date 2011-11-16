package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.xtext.util.GenModelHelper

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.CreateBehavior


class CreateShapeFeature extends FileGenerator  {
    @Inject extension NamingExtensions
    @Inject extension GenModelHelper
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as MetaClass, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as MetaClass, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaClass metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile (MetaClass metaClass, String className) '''
        «val diagram = metaClass.diagram»
        «header(this)»
        package «feature_package()»;

        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.context.ICreateContext;
        import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;
        import «metaClass.javaInterfaceName»;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateFeature {
            public final static String typeOrAliasName = "«metaClass.visibleName»";
            protected static String TITLE = "Create «metaClass.visibleName»";
            protected static String USER_QUESTION = "Enter new «metaClass.visibleName» name";
            protected IPeService peService;
            protected boolean dirty;
            protected «diagram.modelServiceClassName.shortName» modelService;
            protected «metaClass.name» newClass = null;
        
        
            public «className»(IFeatureProvider fp) {
                // set name and description of the creation feature
                super(fp, "«metaClass.visibleName»", "Create «metaClass.visibleName»");
                peService = Graphiti.getPeService();
                modelService = new «diagram.modelServiceClassName.shortName»(fp.getDiagramTypeProvider());
            }
        
            «generate_canCreate(metaClass)»
            «generate_create(metaClass)»
            «generate_createModelElement(metaClass)»
            «generate_getCreateImageId(metaClass)»
            «generate_hasDoneChanges(metaClass)»
            «generate_canUndo(metaClass)»
        }
    '''
    
    def generate_canCreate (MetaClass metaClass) '''
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canCreate(ICreateContext context) {
            // TODO: Respect the cardinality of the containment reference
            return context.getTargetContainer() instanceof Diagram;
        }
    '''
    
    def generate_create (MetaClass metaClass) '''
        /**
         * {@inheritDoc}
         */
        @Override
        public Object[] create(final ICreateContext context) {
            newClass = create«metaClass.visibleName»(context);
        
            if (newClass == null ) {
                return EMPTY;
            }

            // do the add
            addGraphicalRepresentation(context, newClass);
            // return newly created business object(s)
            return new Object[] { newClass };
        }
    '''
    
    def generate_createModelElement (MetaClass metaClass) '''
        «val diagram = metaClass.diagram»
        «val modelClassName = diagram.modelType.javaInterfaceName.shortName»
        «val containmentRef = metaClass.behaviorsList.filter(typeof(CreateBehavior)).head.containmentReference»
        /**
         * Creates a new {@link «metaClass.name»} instance and adds it to the containing type.
         */
        protected «metaClass.name» create«metaClass.visibleName»(ICreateContext context) {
            // ask user for «metaClass.visibleName» name
            String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
            if (newName == null || newName.trim().length() == 0) {
                return null;
            }
             // create «metaClass.name» instance
            «metaClass.name» newClass = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();    
            newClass.setName(newName);
            
            // add the element to containment reference
            «modelClassName» model = modelService.getModel();
            «IF containmentRef.many»
                model.get«containmentRef.name.toFirstUpper»().add(newClass);
            «ELSE»
                model.set«containmentRef.name.toFirstUpper»(newClass);
            «ENDIF»
            
            dirty = true;
            return newClass;
        }
    '''
    
    def generate_getCreateImageId (MetaClass metaClass) '''
        «val diagram = metaClass.diagram»
        «IF (metaClass.icon != null)»
            /**
             * {@inheritDoc}
             */
            @Override
            public String getCreateImageId() {
                return «diagram.imageProviderClassName.shortName».«diagram.getImageIdentifier(metaClass.icon)»;
            }
        «ENDIF»
    '''
    
    def generate_hasDoneChanges (MetaClass metaClass) '''
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean hasDoneChanges() {
            return dirty;
        }
    '''
    
    def generate_canUndo (MetaClass metaClass) '''
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canUndo(IContext context) {
            return false;
        }
    '''
}