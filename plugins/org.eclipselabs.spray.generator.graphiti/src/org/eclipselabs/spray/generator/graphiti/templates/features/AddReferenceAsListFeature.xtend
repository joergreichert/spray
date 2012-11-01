package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class AddReferenceAsListFeature extends FileGenerator<MetaReference>  {
    @Inject extension NamingExtensions
    
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
        }
    '''

    def mainFile(MetaReference reference, String className) '''
        «val metaClass = (reference.eContainer as ContainerInSpray).represents»
        «header(this)»
        package «feature_package()»;
        import java.util.ArrayList;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.datatypes.IDimension;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.services.IGaService;
        import «util_package()».ISprayContainer;
        import «util_package()».SprayContainerService;
        import «util_package()».ISprayColorConstants;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
        // MARKER_IMPORT
        
        @SuppressWarnings("unused")
        public abstract class «className» extends AbstractAddFeature {
            private static final ArrayList<org.eclipse.graphiti.mm.Property> EMPTY_PROPERTIES_LIST = new ArrayList<org.eclipse.graphiti.mm.Property>(0);
            «generate_additionalFields(reference)»
        
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «metaClass.diagram.activatorClassName.shortName».get(IGaService.class);
            }

            «generate_canAdd(reference)»
            «generate_add(reference)»
            «generate_createShape(reference)»
            «generate_getText(reference)»
            «generate_additionalMethods(reference)»
        }
    '''
    
    def generate_canAdd (MetaReference reference) '''
        «val target = reference.target» 
        «val metaClass = (reference.eContainer as ContainerInSpray).represents»
        «overrideHeader»
        public boolean canAdd(final IAddContext context) {
            final EObject newObject = (EObject) context.getNewObject();
            if (newObject instanceof «target.EReferenceType.itfName») {
                // check if user wants to add to a diagram
                final Shape target = context.getTargetContainer();
                EObject domainObject = getBusinessObjectForPictogramElement(target);
                if (domainObject instanceof «metaClass.itfName») {
                    return true;
                }
            }
            return false;
        }    
    '''

    def generate_add (MetaReference reference) '''
        «val target = reference.target» 
        /**
         * {@inheritDoc}
         * This method very much depends on the structure of the standard rectangle shape.
         */
         @Override
        public PictogramElement add(final IAddContext context) {
            final «target.EReferenceType.itfName» addedModelElement = («target.EReferenceType.itfName») context.getNewObject();
            final ContainerShape containerShape= (ContainerShape) context.getTargetContainer();

            // CONTAINER SHAPE WITH ROUNDED RECTANGLE
            Shape found = null;
            int index = 0; 
            int i = 0;
            ContainerShape textbox = SprayContainerService.findTextShape(containerShape);
            for (Shape shape : textbox.getChildren()) {
               GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
                IDimension size = gaService.calculateSize(graphicsAlgorithm, true);
                gaService.setLocation(graphicsAlgorithm, 0, 0);
                String modelType = peService.getPropertyValue(shape, PROPERTY_MODEL_TYPE);
                if( modelType != null && modelType.equals(«target.EReferenceType.literalConstant».getName()) ){
                    found = shape; index = i; 
                }
                i++;
            }

            // LIST of PROPERTIES
            Shape newShape = createShape(textbox, index);
            peService.setPropertyValue(newShape, PROPERTY_STATIC, Boolean.TRUE.toString());
            peService.setPropertyValue(newShape, PROPERTY_MODEL_TYPE, «target.EReferenceType.literalConstant».getName());
            peService.setPropertyValue(newShape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
            // TODO Name attribute should not be default
            Text text = gaService.createDefaultText(getDiagram(), newShape, getText(context, addedModelElement)/*, addedModelElement.get«reference.labelPropertyName.toFirstUpper»()*/);
            // TODO find the right text color
            text.setForeground(manageColor(ISprayColorConstants.CLASS_TEXT_FOREGROUND));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
            text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
            gaService.setLocationAndSize(text, 0, 0, 0, 0);
            // create link and wire it
            link(newShape, addedModelElement);
            layoutPictogramElement(containerShape);
            
            setDoneChanges(true);
            
            return containerShape;
        }
    '''
    
    def generate_createShape (MetaReference reference) '''
        protected Shape createShape(final ContainerShape containerShape, int index) {
            final Shape newShape  = PictogramsFactory.eINSTANCE.createShape();
            newShape.getProperties().addAll(EMPTY_PROPERTIES_LIST);
            newShape.setVisible(true);
            newShape.setActive(true);
            containerShape.getChildren().add(index, newShape);
            return newShape;
        }
    '''

    def generate_getText (MetaReference reference) '''
        /**
         * Computes the displayed text. Clients may override this method.
         */
        protected String getText (final IAddContext context, «reference.target.EReferenceType.itfName» bo) {
            return bo.get«reference.labelPropertyName.toFirstUpper»();
        }
    '''

}