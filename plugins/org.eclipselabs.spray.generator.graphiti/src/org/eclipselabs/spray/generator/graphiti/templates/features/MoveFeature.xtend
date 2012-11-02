package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment

class MoveFeature extends FileGenerator<ShapeFromDsl>{

    @Inject extension NamingExtensions

    override CharSequence generateBaseFile(ShapeFromDsl modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ShapeFromDsl modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }

    def mainExtensionPointFile(ShapeFromDsl container, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;

        import org.eclipse.graphiti.features.IFeatureProvider;

        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(ShapeFromDsl container, String className) '''
        «header(this)»
        package «feature_package()»;

        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IRemoveFeature;
        import org.eclipse.graphiti.features.context.IMoveShapeContext;
        import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
        import org.eclipse.graphiti.features.context.impl.AddContext;
        import org.eclipse.graphiti.features.context.impl.RemoveContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
        import org.eclipselabs.spray.shapes.«container.shape.simpleName»;
        
        // MARKER_IMPORT
        
        public abstract class «className» extends DefaultMoveShapeFeature {

            SprayLayoutManager layoutManager; 
            «generate_additionalFields(container)»

            public «className»(final IFeatureProvider fp) {
                super(fp);
                layoutManager =  new «container.shape.simpleName»(fp).getShapeLayout( );
            }

            «var references = container.represents.referencesTo»
            «generateCanMoveShape(container, className, references)»
            «generateMoveShape(container, className, references)»
            «generate_additionalMethods(container)»
        }
    '''
    
    def generateCanMoveShape(ShapeFromDsl container, String className, Iterable<ShapeCompartmentAssignment> references)'''
         «overrideHeader»
        public boolean canMoveShape(IMoveShapeContext context) {
            Shape sourceShape = (Shape) context.getPictogramElement();
            ContainerShape targetContainer = context.getTargetContainer();
            Object source = getBusinessObjectForPictogramElement(sourceShape );
            Object target = getBusinessObjectForPictogramElement(targetContainer);
            // check whether it can move in the same container
            if( sourceShape.eContainer() == targetContainer ){
                if (!(SprayLayoutService.getLayoutManager(sourceShape) instanceof SprayFixedLayoutManager)) {
                    return false;
                }
            }
            «FOR ref : references.filter(ref | ! ref.reference.containment)»
                // Cannot drag from a location where the object is a non containment reference
                if ( getBusinessObjectForPictogramElement(sourceShape.getContainer())instanceof «ref.shape.represents.itfName») {
                    return false;
                }
            «ENDFOR»
            «FOR ref : references.filter(ref | ! ref.reference.containment)»
                // target is non containment, and does not contain reference to moved object 
                if (target instanceof «ref.shape.represents.itfName») {
                    if (SprayLayoutService.isCompartment(context.getTargetContainer())) {
                        String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);
                        if ((id != null) && (id.equals("«ref.key.simpleName»"))) {
                            if( ! ((«ref.shape.represents.itfName»)target).get«ref.reference.name.toFirstUpper»().contains(source) ){
                                return true;
                            }
                        }
                    }
                }
            «ENDFOR»
            «FOR ref : references.filter(ref | ref.reference.containment)»
                // Can move from containment to another containment compartment
                if (target instanceof «ref.shape.represents.itfName») {
                    if (SprayLayoutService.isCompartment(context.getTargetContainer())) {
                        String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);
                        if ((id != null) && (id.equals("«ref.key.simpleName»"))) {
                            return true;
                        }
                    }
                }
            «ENDFOR»
            return super.canMoveShape(context);
        }
    '''
    
    def generateMoveShape(ShapeFromDsl container, String className, Iterable<ShapeCompartmentAssignment> references)'''
        «overrideHeader»
        public void moveShape(IMoveShapeContext context) {
            PictogramElement sourceShape = context.getPictogramElement();
            ContainerShape targetContainer = context.getTargetContainer();
            ContainerShape sourceContainer = context.getSourceContainer();
            Object sourceParent = getBusinessObjectForPictogramElement(sourceContainer);
            Object source = getBusinessObjectForPictogramElement(sourceShape);
            Object target = getBusinessObjectForPictogramElement(targetContainer);
            «FOR ref : references.filter(ref | ! ref.reference.containment)»
                if (target instanceof «ref.shape.represents.itfName») {
                    if (SprayLayoutService.isCompartment(context.getTargetContainer())) {
                        String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);
                        if ((id != null) && (id.equals("«ref.key.simpleName»"))) {
                            «IF ref.reference.many»
                            ((«ref.shape.represents.itfName») target).get«ref.reference.name.toFirstUpper»().add((«container.represents.itfName») source);
                            «ELSE»
                            ((«ref.shape.represents.itfName») target).set«ref.reference.name.toFirstUpper»((«container.represents.itfName») source);
                            «ENDIF»
                            AddContext addContext = new AddContext();
                            addContext.putProperty(ISprayConstants.PROPERTY_ALIAS, GraphitiProperties.get(sourceShape, ISprayConstants.PROPERTY_ALIAS));
                            addContext.setNewObject(source);
                            addContext.setLocation(context.getX(), context.getX());
                            addContext.setTargetContainer(targetContainer);
                            getFeatureProvider().addIfPossible(addContext);
                        }
                    }
                }
            «ENDFOR»
            «FOR ref : references.filter(ref | ref.reference.containment)»
            if (target instanceof «ref.shape.represents.itfName») {
                if (SprayLayoutService.isCompartment(targetContainer) ) {
                    String id = GraphitiProperties.get(targetContainer, ISprayConstants.TEXT_ID);
                    if ((id != null) && (id.equals("«ref.key.simpleName»"))) {
                        // create AddCointext5 fist, because the PROPERT_ALIAS property will be set to null after removing it.
                        AddContext addContext = new AddContext();
                        addContext.putProperty(ISprayConstants.PROPERTY_ALIAS, GraphitiProperties.get(sourceShape, ISprayConstants.PROPERTY_ALIAS));

                        RemoveContext removeContext = new RemoveContext(sourceShape);
                        IRemoveFeature rem = getFeatureProvider().getRemoveFeature(removeContext);
                        rem.remove(removeContext);

                        // remove from source container and add to target container
                        «IF ref.reference.many»
                        ((«ref.shape.represents.itfName») sourceParent).get«ref.reference.name.toFirstUpper»().remove((«container.represents.itfName»)source);
                        ((«ref.shape.represents.itfName») target).get«ref.reference.name.toFirstUpper»().add((«container.represents.itfName») source);
                        «ELSE»
                        ((«ref.shape.represents.itfName») sourceParent).set«ref.reference.name.toFirstUpper»( null);
                        ((«ref.shape.represents.itfName») target).set«ref.reference.name.toFirstUpper»((«container.represents.itfName») source);
                        «ENDIF»
                        addContext.setNewObject(source);
                        addContext.setLocation(context.getX(), context.getX());
                        addContext.setTargetContainer(targetContainer);
                        getFeatureProvider().addIfPossible(addContext);
                        return;
                    }
                }
            }
            «ENDFOR»
        }
     '''
}