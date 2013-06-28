package org.eclipselabs.spray.generator.graphiti.templates.diagram

import javax.inject.Inject
import java.util.ArrayList
import java.util.List
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

class FeatureProvider extends FileGenerator<Diagram> {
    @Inject extension NamingExtensions
    @Inject extension DiagramExtensions
    @Inject extension MetaClassExtensions
    
    override CharSequence generateBaseFile(Diagram modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(Diagram modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
        
        public class «className» extends «className»Base {
        
            public «className»(final IDiagramTypeProvider dtp) {
                super(dtp);
            }
        
        }
    '''
    
    def mainFile (Diagram it, String className) '''
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
        import org.eclipse.graphiti.features.IAddFeature;
        import org.eclipse.graphiti.features.ICreateConnectionFeature;
        import org.eclipse.graphiti.features.ICreateFeature;
        import org.eclipse.graphiti.features.ICopyFeature;
        import org.eclipse.graphiti.features.ILayoutFeature;
        import org.eclipse.graphiti.features.IMoveShapeFeature;
        import org.eclipse.graphiti.features.IPasteFeature;
        import org.eclipse.graphiti.features.IUpdateFeature;
        import org.eclipse.graphiti.features.IDeleteFeature;
        import org.eclipse.graphiti.features.IDirectEditingFeature;
        import org.eclipse.graphiti.features.IRemoveFeature;
        import org.eclipse.graphiti.features.IResizeShapeFeature;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.features.context.ICustomContext;
        import org.eclipse.graphiti.features.context.ICopyContext;
        import org.eclipse.graphiti.features.context.IDeleteContext;
        import org.eclipse.graphiti.features.context.IDirectEditingContext;
        import org.eclipse.graphiti.features.context.ILayoutContext;
        import org.eclipse.graphiti.features.context.IMoveShapeContext;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.context.IPasteContext;
        import org.eclipse.graphiti.features.context.IRemoveContext;
        import org.eclipse.graphiti.features.context.IResizeShapeContext;
        import org.eclipse.graphiti.features.custom.ICustomFeature;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;
        import org.eclipselabs.spray.runtime.graphiti.features.DefaultFeatureProvider;
        import org.eclipselabs.spray.runtime.graphiti.features.DefaultRemoveFeature;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;
        import «util_package()».OwnerPropertyDeleteFeature;
        «IF !metaClasses.empty»
        «ENDIF»
        // MARKER_IMPORT
        
        @SuppressWarnings("unused")
        public abstract class «className» extends DefaultFeatureProvider {
            «generate_additionalFields»
            public «className»(final IDiagramTypeProvider dtp) {
                super(dtp);
            }
        
            «generate_getAddFeature»
            «generate_getCopyFeature»
            «generate_getCreateFeatures»
            «generate_getCreateConnectionFeatures»
            «generate_getUpdateFeature»
            «generate_getLayoutFeature»
            «generate_getRemoveFeature»
            «generate_getDeleteFeature»
            «generate_getMoveShapeFeature»
            «generate_getPasteFeature»
            «generate_getDirectEditingFeatures»
            «generate_getCustomFeatures»
            «generate_getResizeFeatures»
            «generate_additionalMethods»
        }
    '''
    
    def generate_getAddFeature (Diagram it) '''
        «overrideHeader»
        public IAddFeature getAddFeature(final IAddContext context) {
            // is object for add request a EClass or EReference?
            final EObject bo = (EObject) context.getNewObject() ;
            final String reference = (String)context.getProperty(PROPERTY_REFERENCE);
            final String alias = (String)context.getProperty(PROPERTY_ALIAS);
            «FOR cls : metaClasses»
                if ( «generate_metaClassSwitchCondition(cls)») {
                    if ( reference == null ){
                        return new «cls.addFeatureClassName.shortName»(this);
                        «FOR reference : cls.references.filter(ref|ref.representedBy != null)  »
                        } else if( reference.equals(«reference.literalConstant».getName())){
                            return new «reference.addReferenceAsConnectionFeatureClassName.shortName»(this);
                        «ENDFOR»
                    }
                } 
            «ENDFOR»
            return super.getAddFeature(context);
        }
    '''
    
    def generate_getCreateFeatures (Diagram it) '''
        «overrideHeader»
        public ICreateFeature[] getCreateFeatures() {
            return new ICreateFeature[] { 
            «FOR featureClassName : getCreateFeatureClassNames SEPARATOR ","»
                new «featureClassName»(this) 
            «ENDFOR»
            };
        }    
    '''
    
    /**
     * Computes the class names of all Create Features of the diagram.
     */
    def private List<String> getCreateFeatureClassNames (Diagram it) {
        val result = new ArrayList<String>()
        
        for (mc : metaClassesForShapes.filter(mc|mc.hasCreateBehavior)) {
            result += mc.createFeatureClassName.shortName
        }
        return result
    }
    
    def generate_getUpdateFeature (Diagram it) '''
        «overrideHeader»
        public IUpdateFeature getUpdateFeature(final IUpdateContext context) {
            final PictogramElement pictogramElement = context.getPictogramElement();
            String alias ;
            if( pictogramElement  instanceof Shape ){
                Shape dslShape = SprayLayoutService.findDslShape(pictogramElement );
                alias = peService.getPropertyValue(dslShape,PROPERTY_ALIAS);
            } else {
                alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);
            }
        //    if (pictogramElement instanceof ContainerShape) {
                final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
                if (bo == null) {
                	return null;
                }
            «FOR cls : metaClasses »
                «IF ! (cls.representedBy instanceof ConnectionInSpray) »
                if ( «generate_metaClassSwitchCondition(cls)») { // 11
                    return new «cls.updateFeatureClassName.shortName»(this); 
                }
                «ENDIF»
                «IF cls.representedBy instanceof ConnectionInSpray»
                    «IF !cls.type.^abstract»
                        if (bo instanceof «cls.itfName» && «IF cls.alias==null»alias==null«ELSE»"«cls.alias»".equals(alias)«ENDIF») { // 33
                            return new «cls.updateFeatureClassName.shortName»(this); 
                        }
                    «ENDIF»
                «ENDIF»
            «ENDFOR»
    //        }
            return super.getUpdateFeature(context);
        }
    '''
    
    def generate_getLayoutFeature (Diagram it) '''
        «overrideHeader»
        public ILayoutFeature getLayoutFeature(final ILayoutContext context) {
            final PictogramElement pictogramElement = context.getPictogramElement();
            final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
            if (bo == null) {
            	return null;
            }
            final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);
            «FOR cls : metaClasses.filter(m |! (m.representedBy instanceof ConnectionInSpray) )  »
            if ( «generate_metaClassSwitchCondition(cls)» ) {
                return new «cls.layoutFeatureClassName.shortName»(this);
            }
            «ENDFOR»
            return super.getLayoutFeature(context);
        }
    '''

    def generate_getCreateConnectionFeatures (Diagram it) '''
        «overrideHeader»
        public ICreateConnectionFeature[] getCreateConnectionFeatures() {
            return new ICreateConnectionFeature[] {
                «handleConnections(getMetaclassesRepresentedByConnections, getMetaReferencesRepresentedByConnections)»
            };
        }
    '''
    
    def handleConnections(Iterable<MetaClass> metaclassesRepresentedByConnections, 
        Iterable<MetaReference> metaReferencesRepresentedByConnections) '''
        «IF metaclassesRepresentedByConnections.size > 0»
            «newCreateConnection(metaclassesRepresentedByConnections.head)»
            «FOR cls : metaclassesRepresentedByConnections.tail BEFORE ", " SEPARATOR "," »
                «newCreateConnection(cls)»
            «ENDFOR»
        «ENDIF»
        «IF !metaclassesRepresentedByConnections.isEmpty && 
            !metaReferencesRepresentedByConnections.isEmpty»
            , 
        «ENDIF»
        «IF metaReferencesRepresentedByConnections.size > 0»
            «newCreateConnection(metaReferencesRepresentedByConnections.head)»
            «FOR reference : metaReferencesRepresentedByConnections.tail BEFORE ", " SEPARATOR "," »
                «newCreateConnection(reference)»
            «ENDFOR»
        «ENDIF»
    '''
    
    def newCreateConnection(MetaClass it) '''
        new «createFeatureClassName.shortName»(this)«»
    '''

    def newCreateConnection(MetaReference it) '''
        new «createReferenceAsConnectionFeatureClassName.shortName»(this)
    '''
    
    /**
     * @return The metaclasses in the diagram that are represented as connection and which have a create behavior
     */
    def getMetaclassesRepresentedByConnections(Diagram diagram) {
        diagram.metaClasses.filter[representedBy instanceof ConnectionInSpray  && hasCreateBehavior]
    }
    
    def Iterable<MetaReference> getMetaReferencesRepresentedByConnections(Diagram diagram) {
        diagram.metaClasses.map[references.filter[representedBy != null]].flatten()
    }
    
    def generate_getRemoveFeature (Diagram it) '''
        «overrideHeader»
        public IRemoveFeature getRemoveFeature(final IRemoveContext context) {
            // Spray specific DefaultRemoveFeature
            final PictogramElement pictogramElement = context.getPictogramElement();
            return new DefaultRemoveFeature(this);
        }
    '''
    
    def generate_getDeleteFeature (Diagram it) '''
        public IDeleteFeature getDeleteFeature(final IDeleteContext context) {
            final PictogramElement pictogramElement = context.getPictogramElement();
            final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
            if (bo == null) {
            	return null;
            }
            final String reference = peService.getPropertyValue(pictogramElement, PROPERTY_REFERENCE);
            final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);

            «FOR cls : metaClasses »
            if ( «generate_metaClassSwitchCondition(cls)» ) {
                if( reference == null ){
                    return new DefaultDeleteFeature(this); 
                «FOR reference : cls.references.filter[representedBy != null]  »
                } else if( reference.equals(«reference.literalConstant».getName())){
                    return new «reference.deleteReferenceFeatureClassName.shortName»(this);
                «ENDFOR»    
                }
            } 
            «ENDFOR»
            
            return new DefaultDeleteFeature(this); 
        }
    '''
    
    def generate_getMoveShapeFeature (Diagram it) '''
        /** 
         * Ensure that any shape with property {@link ISprayConstants#CAN_MOVE} set to false will not have a move feature.
         */
        «overrideHeader»
        public IMoveShapeFeature getMoveShapeFeature(final IMoveShapeContext context) {
            final Shape shape = context.getShape();
            final ContainerShape parent = shape.getContainer();
            EObject eObject = getBusinessObjectForPictogramElement(shape);
            ContainerShape targetContainer = context.getTargetContainer();
            EObject target = getBusinessObjectForPictogramElement(targetContainer);
            «FOR cls : metaClassesList.filter[representedBy instanceof ShapeFromDsl]»
            if( eObject instanceof «cls.itfName»){
                return new  «cls.moveFeatureClassName»(this);
            }
            
            «ENDFOR»
            return super.getMoveShapeFeature(context);
        }
    '''
    
    def generate_getCustomFeatures (Diagram it) '''
        «overrideHeader»
        public ICustomFeature[] getCustomFeatures(final ICustomContext context) {
            final EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
            if (bo == null) {
            	return new ICustomFeature[0];
            }
            final String alias = GraphitiProperties.get(context.getPictogramElements()[0], PROPERTY_ALIAS);
            «FOR metaClass : metaClasses »
                «val featureClasses = metaClass.customFeatureClassNames»
                «IF !featureClasses.isEmpty»
                    if(«generate_metaClassSwitchCondition(metaClass)»){
                    return new ICustomFeature[]{ 
                    «FOR featureClass : featureClasses SEPARATOR  ","»
                        new «featureClass.shortName»(this)
                    «ENDFOR»
                    };
                    }
                «ENDIF»
            «ENDFOR»
            return new ICustomFeature[0];
        }
    '''
    
    def generate_getDirectEditingFeatures(Diagram diagram) '''
	    «overrideHeader»
	    public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
	        final PictogramElement pictogramElement = context.getPictogramElement();
	        final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
	        if (bo == null) {
	            return null;
	        }
	        if (SprayLayoutService.isCompartment(pictogramElement)) {
	            return null; 
	        }
	        String alias = null;
	        if (pictogramElement instanceof Shape) {
	            Shape dslShape = SprayLayoutService.findDslShape(pictogramElement );
	            alias = peService.getPropertyValue(dslShape,PROPERTY_ALIAS);
	        } else {
	            alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);
	        }
	    	«FOR metaClass : diagram.metaClasses»
	    	if ( «generate_metaClassSwitchCondition(metaClass)» ) {
	    		return new «metaClass.directEditFeatureClassName.shortName»(this);
	    	}
            «ENDFOR»
	    	return super.getDirectEditingFeature(context);
	    }
    '''
    
    def generate_getCopyFeature(Diagram diagram) '''
	    «overrideHeader»
	    public ICopyFeature getCopyFeature(ICopyContext context) {
	    	return new «diagram.copyFeatureClassName.shortName»(this);
	    }
    '''
    
    def generate_getPasteFeature(Diagram diagram) '''
	    «overrideHeader»
	    public IPasteFeature getPasteFeature(IPasteContext context) {
	    	return new «diagram.pasteFeatureClassName.shortName»(this);
	    }
    '''
    
    def generate_getResizeFeatures(Diagram diagram) '''
    	«overrideHeader»
    	public IResizeShapeFeature getResizeShapeFeature (IResizeShapeContext context) {
    		final PictogramElement pictogramElement = context.getPictogramElement();
    		final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
    		if (bo == null) {
    			return null;
    		}
    		final String alias = peService.getPropertyValue(pictogramElement, PROPERTY_ALIAS);
    		«FOR crs : diagram.metaClasses.filter(m | m.representedBy instanceof ShapeFromDsl)»
    		if(«generate_metaClassSwitchCondition(crs)»){
    			return new «crs.resizeFeatureClassName.shortName»(this);    
    		}
            «ENDFOR»
    	return super.getResizeShapeFeature(context);
    }
    '''
    
    /**
     * Produces the condition used in the if-cascaded to switch for the specific features for an EObject
     * bo.eClass()==BusinessDomainDslPackage.Literals.ASSOCIATION && "Assoc1".equals(alias)
     */
    def generate_metaClassSwitchCondition (MetaClass cls) '''
        bo.eClass()==«cls.type.literalConstant» && «IF cls.alias==null»alias==null«ELSE»"«cls.alias»".equals(alias)«ENDIF»
    '''
}