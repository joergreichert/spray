package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

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
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.mm.pictograms.ContainerShape;
		import org.eclipse.graphiti.mm.pictograms.Shape;

		import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
		import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
		import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
		import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;
		import org.eclipselabs.spray.runtime.graphiti.layout.SprayFitLayoutManager;
		import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;
		import org.eclipselabs.spray.runtime.graphiti.layout.SprayTopLayoutManager;
		import org.eclipselabs.spray.runtime.graphiti.layout.SprayDiagramLayoutManager;
		import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
		import «ProjectProperties::shapesPackage».«container.shape.simpleName»Shape;

		// MARKER_IMPORT

		public abstract class «className» extends DefaultMoveShapeFeature {

			SprayLayoutManager layoutManager; 
			«generate_additionalFields(container)»

			public «className»(final IFeatureProvider fp) {
				super(fp);
				layoutManager =  new «container.shape.simpleName»Shape(fp).getShapeLayout( );
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
				if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFixedLayoutManager)) {
					return true;
				}
				if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayTopLayoutManager)) {
					return true;
				}
				if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayDiagramLayoutManager)) {
					return true;
				}
				if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFitLayoutManager)) {
					return true;
				}
				return false;
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
						if ((id != null) && (id.equals("«ref.shapeDslKey.simpleName»"))) {
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
						if ((id != null) && (id.equals("«ref.shapeDslKey.simpleName»"))) {
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
			if( sourceShape.eContainer() == targetContainer ){ 
				super.moveShape(context);
				final Diagram diagram = this.getDiagram();
				ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(diagram);
				// TODO: Fixme: Need to layout twice, probably because this is a fit within a fit layout
				//  Only neccesary when contents is moved to xcoordinates < 0
				mgr.layout();
				mgr.layout();
				return;   
			}
			«FOR ref : references.filter(ref | ! ref.reference.containment)»
				if (target instanceof «ref.shape.represents.itfName») {
					if (SprayLayoutService.isCompartment(context.getTargetContainer())) {
						String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);
						if ((id != null) && (id.equals("«ref.shapeDslKey.simpleName»"))) {
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
							return;
						}
					}
				}
			«ENDFOR»
			«FOR ref : references.filter(ref | ref.reference.containment)»
			if (target instanceof «ref.shape.represents.itfName») {  // For shape «container.represents.alias» + «container.shape.dslShape.name»
				if (SprayLayoutService.isCompartment(targetContainer) ) {
					String id = GraphitiProperties.get(targetContainer, ISprayConstants.TEXT_ID);
					if ((id != null) && (id.equals("«ref.shapeDslKey.simpleName»"))) {

						sourceContainer.getChildren().remove(source);
						ContainerShape sourceTop = SprayLayoutService.findTopDslShape(sourceContainer);
						if( sourceTop != null ){
							SprayLayoutService.getLayoutManager(sourceTop).layout();
						}
						// remove from source container and add to target container

						«IF ref.reference.many»
«««                        ((«ref.shape.represents.itfName») sourceParent).get«ref.reference.name.toFirstUpper»().remove((«container.represents.itfName»)source);
						((«ref.shape.represents.itfName») target).get«ref.reference.name.toFirstUpper»().add((«container.represents.itfName») source);
						«ELSE»
«««                        ((«ref.shape.represents.itfName») sourceParent).set«ref.reference.name.toFirstUpper»( null);
						((«ref.shape.represents.itfName») target).set«ref.reference.name.toFirstUpper»((«container.represents.itfName») source);
						«ENDIF»
						sourceShape.getGraphicsAlgorithm().setX(context.getX());
						sourceShape.getGraphicsAlgorithm().setY(context.getY());
						targetContainer.getChildren().add((Shape)sourceShape);
						ContainerShape targetTop = SprayLayoutService.findTopDslShape(targetContainer);
						if (targetTop != null) {
							SprayLayoutService.getLayoutManager(targetTop).layout();
						}
						return;
					}
				}
			}
			«ENDFOR»
		}
     '''
}