package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.Container


class CreateReferenceAsListFeature extends FileGenerator  {
    @Inject extension NamingExtensions
    
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

    def mainFile (MetaReference reference, String className) '''
        «header(this)»
        package «feature_package()»;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import «util_package()».SampleUtil;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateFeature {
        
            protected static String TITLE = "Create «target.name»";
            protected static String USER_QUESTION = "Enter new «target.name» «reference.labelPropertyName»";
            
            private boolean doneChanges;
        
            public «className»(IFeatureProvider fp) {
                // set name and description of the creation feature
                super(fp, "«target.name»", "Create «target.name»");
            }
            
            «generate_canCreate(reference)»
            «generate_create(reference)»
        
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean hasDoneChanges() {
                return doneChanges;
            }
        
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean canUndo(IContext context) {
                return false;
            }
        
        }
    '''
    
    def generate_canCreate (MetaReference ref) '''
        «val metaClass = (ref.eContainer as Container).represents»
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canCreate(ICreateContext context) {
            Shape target = context.getTargetContainer();
            Object domainObject = getBusinessObjectForPictogramElement(target);
            return domainObject instanceof «metaClass.name»;
        }
    '''
    
    def generate_create (MetaReference ref) '''
        «val metaClass = (ref.eContainer as Container).represents»
        /**
         * {@inheritDoc}
         */
        @Override
        public Object[] create(ICreateContext context) {
            // ask user for «target.name» name
            String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
            if (newName == null || newName.trim().length() == 0) {
                return EMPTY;
            }

            Shape target = context.getTargetContainer();
            Object domainObject = getBusinessObjectForPictogramElement(target);
            «metaClass.javaInterfaceName.shortName» owner = («metaClass.name») getBusinessObjectForPictogramElement(target);

            // create «target.name»
            «target.javaInterfaceName.shortName» newDomainObject = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«target.name»();
            newDomainObject.set«ref.labelPropertyName.toFirstUpper»(newName);
            owner.get«ref.name.toFirstUpper»().add(newDomainObject);

            // do the add
            addGraphicalRepresentation(context, newDomainObject);
            // return newly created business object(s)
            
            doneChanges = true;
            return new Object[] { newDomainObject };
        }
    '''
}