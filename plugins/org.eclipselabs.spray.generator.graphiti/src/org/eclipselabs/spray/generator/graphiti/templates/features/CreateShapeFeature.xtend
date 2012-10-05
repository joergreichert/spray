package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions
import org.eclipselabs.spray.mm.spray.CompartmentBehavior
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipse.emf.ecore.EReference

class CreateShapeFeature extends FileGenerator<MetaClass> {
    @Inject extension NamingExtensions
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
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import «metaClass.javaInterfaceName»;
        import org.eclipse.graphiti.features.context.IAreaContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.features.context.impl.AddContext;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCreateFeature {
            protected static String TITLE = "Create «metaClass.uiLabel»";
            protected static String USER_QUESTION = "Enter new «metaClass.uiLabel» name";
            protected «diagram.modelServiceClassName.shortName» modelService;
            protected «metaClass.itfName» newClass = null;
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
           	final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        	«IF metaClass.createBehavior != null»
            // TODO: Respect the cardinality of the containment reference
            if (context.getTargetContainer() instanceof Diagram) {
            	return true;
            } else if (context.getTargetContainer() instanceof ContainerShape){
«««            	OLD STUFF
                «FOR behavior: metaClass.behaviors.filter(m | m instanceof CompartmentBehavior)»
                «FOR Refcompartment: (behavior as CompartmentBehavior).compartmentReference.filter(m | m.eContainer instanceof EClass)»
                if (target instanceof «(Refcompartment.eContainer as EClass).itfName») {
                	   	return true;
                	}
                }
                «ENDFOR»
                «ENDFOR»
        	}
        	«ENDIF»
//              And now the NEW stuff
            «var result = metaClass.referencesTo»
            «FOR cls : result »
                // cls «cls.shape.represents.name» refers to this metaClass»
                if( target instanceof «cls.shape.represents.javaInterfaceName» ){
                	if (SprayLayoutService.isCompartment(context.getTargetContainer())) {
                        String id = GraphitiProperties.get(context.getTargetContainer(), TEXT_ID);
                        if ( (id != null) && (id.equals("«cls.key.simpleName»")) ) {
                            return true;	
                        }
                    }
                }
            «ENDFOR»
            return false;
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
        «val modelClassName = diagram.modelType.itfName»
        «val createBehavior = metaClass.behaviorsList.filter(typeof(CreateBehavior)).head»
        «var EReference containmentRef = null»
//      «IF createBehavior != null» «containmentRef = createBehavior.containmentReference» «ENDIF»
        
        /**
         * Creates a new {@link «metaClass.itfName»} instance and adds it to the containing type.
         */
        protected «metaClass.itfName» create«metaClass.visibleName»(final ICreateContext context) {
            «handleAskFor(metaClass, createBehavior.askFor)»
            boolean isContainment = false;
            final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
            «FOR behavior: metaClass.behaviors.filter(m | m instanceof CompartmentBehavior)»
            «FOR Refcompartment : (behavior as CompartmentBehavior).compartmentReference.filter(m | m.eContainer instanceof EClass)»
            if (target instanceof «(Refcompartment.eContainer as EClass).itfName») {
                isContainment = true;
                «(Refcompartment.eContainer as EClass).itfName» model = («(Refcompartment.eContainer as EClass).itfName») target;
                «IF Refcompartment.many»
                model.get«Refcompartment.name.toFirstUpper»().add(newClass);
                «ELSE»
                model.set«Refcompartment.name.toFirstUpper»(newClass);
                «ENDIF»   
            }
            «ENDFOR»
            «ENDFOR»
            «IF containmentRef != null»
            if (!isContainment) {
                // add the element to containment reference
                «modelClassName» model = modelService.getModel();
                «IF containmentRef.many»
                	model.get«containmentRef.name.toFirstUpper»().add(newClass);
                «ELSE»
                model.set«containmentRef.name.toFirstUpper»(newClass);
            	«ENDIF»   
            }
            «ENDIF»
//              And now the NEW stuff
            «var result = metaClass.referencesTo»
            «FOR cls : result »
            «var domainName = cls.shape.represents.javaInterfaceName»
                if( target instanceof «domainName» ){
                	«domainName» domainObject = («domainName») target;
                    «IF cls.reference.many»
                        domainObject.get«cls.reference.name.toFirstUpper»().add(newClass);
                    «ELSE»»
                        domainObject.set«cls.reference.name.toFirstUpper»(newClass);
                    «ENDIF»
                }
            «ENDFOR»
            setDoneChanges(true);
            return newClass;
        }
    '''
    
    def handleAskFor(MetaClass metaClass, EAttribute attribute) '''
        // create «metaClass.name» instance
        final «metaClass.itfName» newClass = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();
        «IF attribute != null»
           // ask user for «metaClass.visibleName» «attribute.name»
           «IF (attribute.EType as EDataType).instanceClassName.matches('java.lang.String')»
              String new«attribute.name.toFirstUpper» = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
              if (new«attribute.name.toFirstUpper» == null || new«attribute.name.toFirstUpper».trim().length() == 0) {
                 return null;
              } else {
                 newClass.set«attribute.name.toFirstUpper»(new«attribute.name.toFirstUpper»);
              }
           «ELSE»
              «val type = (attribute.EType as EDataType).instanceClassName» 
              «val typeName = if("double".matches(type)) "Double" else if("int".matches(type)) "Integer" else "Object"»
              final «"org.eclipse.jface.dialogs.IInputValidator".shortName» validator = new IInputValidator() {
                 public String isValid(final String _newText) {
                    String message = null;
                    try {
                       «typeName».valueOf(_newText);
                    } catch(Exception nfe) {
                       message = _newText + " cannot be cast to «typeName»";
                    }
                    return message;
                 }
              };
              final String new«attribute.name.toFirstUpper»String = SampleUtil.askString(TITLE, USER_QUESTION, "", validator);
              final «typeName» new«attribute.name.toFirstUpper» = «typeName».valueOf(new«attribute.name.toFirstUpper»String);    
              newClass.set«attribute.name.toFirstUpper»(new«attribute.name.toFirstUpper»);
           «ENDIF»
        «ENDIF»
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
            ctx.putProperty(PROPERTY_ALIAS, "«metaClass.alias»");
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