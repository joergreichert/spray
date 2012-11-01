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
        import org.eclipse.graphiti.features.context.IMoveShapeContext;
        import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
        import org.eclipse.graphiti.features.context.impl.AddContext;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Shape;

        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
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
         @Override
        public boolean canMoveShape(IMoveShapeContext context) {
            Shape sourceShape = (Shape) context.getPictogramElement();
            ContainerShape targetContainer = context.getTargetContainer();
            Object source = getBusinessObjectForPictogramElement(sourceShape );
            Object target = getBusinessObjectForPictogramElement(targetContainer);
            if( sourceShape.eContainer() == targetContainer ){
                return false;
            }
            «FOR ref : references»
                «IF ! ref.reference.containment»
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
                «ENDIF»
            «ENDFOR»
            return super.canMoveShape(context);
        }
    '''
    
    def generateMoveShape(ShapeFromDsl container, String className, Iterable<ShapeCompartmentAssignment> references)'''
        @Override
        public void moveShape(IMoveShapeContext context) {
            ContainerShape targetContainer = context.getTargetContainer();
            Object source = getBusinessObjectForPictogramElement(context.getPictogramElement());
            Object target = getBusinessObjectForPictogramElement(targetContainer);
            «FOR ref : references»
                «IF ! ref.reference.containment»
                if (target instanceof «ref.shape.represents.itfName») {
                    if (SprayLayoutService.isCompartment(context.getTargetContainer())) {
                        String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);
                        if ((id != null) && (id.equals("«ref.key.simpleName»"))) {
                            AddContext addContext = new AddContext();
                            addContext.setNewObject(source);
                            addContext.setLocation(context.getX(), context.getX());
                            addContext.setTargetContainer(targetContainer);
                            getFeatureProvider().addIfPossible(addContext);
                        }
                    }
                } else {
                    super.moveShape(context);
                }
                «ENDIF»
            «ENDFOR»
        }
     '''
}