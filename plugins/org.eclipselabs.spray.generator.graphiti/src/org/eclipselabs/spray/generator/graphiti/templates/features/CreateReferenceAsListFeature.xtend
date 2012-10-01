package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class CreateReferenceAsListFeature extends FileGenerator<MetaReference>  {
    @Inject extension NamingExtensions
    @Inject extension MetaReferenceExtensions
    
    EClass target 
    
    def setTarget(EClass m){
        target = m
    }
    
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

    def mainFile (MetaReference reference, String className) '''
        «header(this)»
        package «feature_package()»;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateContext;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;
        import «util_package()».SampleUtil;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCreateFeature {
            protected static String TITLE = "Create «target.name»";
            protected static String USER_QUESTION = "Enter new «target.name» «reference.labelPropertyName»";
            «generate_additionalFields(reference)»
            
            «generate_constructor(reference, className)»
            «generate_canCreate(reference)»
            «generate_create(reference)»
            «generate_additionalMethods(reference)»
        }
    '''
    
    def generate_constructor (MetaReference reference, String className) '''
        public «className»(final IFeatureProvider fp) {
            // set name and description of the creation feature
            this(fp, "«target.name»", "Create «target.name»");
        }
        protected «className»(final IFeatureProvider fp, final String name, final String description) {
            // provide name and description for the UI, e.g. the palette
            super(fp, name, description);
        }
    '''
    
    def generate_canCreate (MetaReference ref) '''
        «val metaClass = (ref.eContainer as ContainerInSpray).represents»
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canCreate(final ICreateContext context) {
            final Shape target = context.getTargetContainer();
            final EObject domainObject = getBusinessObjectForPictogramElement(target);
            return domainObject instanceof «metaClass.itfName»;
        }
    '''
    
    def generate_create (MetaReference ref) '''
        «val metaClass = (ref.eContainer as ContainerInSpray).represents»
        /**
         * {@inheritDoc}
         */
        @Override
        public Object[] create(final ICreateContext context) {
            // ask user for «target.name» name
            final String newName = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
            if (newName == null || newName.trim().length() == 0) {
                return EMPTY;
            }

            final Shape target = context.getTargetContainer();
            final «metaClass.itfName» owner = («metaClass.itfName») getBusinessObjectForPictogramElement(target);

            // create «target.name»
            final «target.itfName» newDomainObject = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«target.name»();
            newDomainObject.set«ref.labelPropertyName.toFirstUpper»(newName);
            owner.get«ref.name.toFirstUpper»().add(newDomainObject);

            // do the add
            addGraphicalRepresentation(context, newDomainObject);
            // return newly created business object(s)
            
            setDoneChanges(true);
            return new Object[] { newDomainObject };
        }
    '''
}