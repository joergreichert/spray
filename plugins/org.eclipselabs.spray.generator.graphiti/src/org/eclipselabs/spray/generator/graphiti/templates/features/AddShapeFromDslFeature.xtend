package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.graphiti.util.IColorConstant
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayElementNameProvider
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.SprayElement
import org.eclipselabs.spray.shapes.shapes.Shape

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class AddShapeFromDslFeature extends FileGenerator<Shape>  {
    @Inject extension LayoutExtensions
    @Inject extension IQualifiedNameProvider
    @Inject extension NamingExtensions
    @Inject extension SprayElementNameProvider
    @Inject extension DiagramExtensions
    
    MetaClass metaClass = null
    
    def setMetaClass(MetaClass cls){
    	metaClass = cls
    }
    
    override CharSequence generateBaseFile(Shape modelElement) {
        mainFile( modelElement as Shape, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(Shape modelElement) {
        mainExtensionPointFile( modelElement as Shape, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Shape container, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(Shape container, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import «metaClass.javaInterfaceName»;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
        // MARKER_IMPORT

        public class «className» extends AbstractAddFeature {
            protected final static String typeOrAliasName = "«metaClass.visibleName»";
            protected Diagram targetDiagram = null;
            «generate_additionalFields(container)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
                gaService = «container.diagram.activatorClassName.shortName».get(IGaService.class);
            }
        
            «overrideHeader()»
            public boolean canAdd(IAddContext context) {
                final EObject newObject = (EObject) context.getNewObject();
                if (newObject instanceof «metaClass.name») {
                    // check if user wants to add to a diagram
                    if (context.getTargetContainer() instanceof Diagram) {
                        return true;
                    }
                }
                return false;
            }

            «overrideHeader»
            public PictogramElement add(IAddContext context) {
                «metaClass.name» addedModelElement = («metaClass.name») context.getNewObject();
                targetDiagram = peService.getDiagramForShape(context.getTargetContainer());
        
                ContainerShape containerShape = container.createContainer(context, addedModelElement);
                ContainerShape textContainer = SprayContainerService.findTextShape(containerShape);
                link(containerShape, addedModelElement);
                link(textContainer, addedModelElement);
        
                
                // add a chopbox anchor to the shape
                peCreateService.createChopboxAnchor(containerShape);
        
                // call the update and layout features
                updatePictogramElement(containerShape);
                layoutPictogramElement(containerShape);
                
                setDoneChanges(true);
                
                return containerShape;
            }
            
            «generate_additionalFields(container)»
        }
        '''
        
        def dispatch createShape (SprayElement part, MetaClass cls) '''
            protected void create«part.eClass.name»«part.shapeName» (IAddContext context, «cls.name» addedModelElement, ContainerShape containerShape) {
                System.out.println("Spray: unhandled Container child [«part.getClass().name»]");
            }
        '''
        
        
        
        def dispatch createShape (MetaReference metaRef, MetaClass cls) '''
            «val varname = metaRef.name.toFirstLower»
            «val target = metaRef.target» 
            // Part is reference list
            protected void createMetaReference«metaRef.shapeName» (IAddContext context, «cls.name» addedModelElement, ContainerShape containerShape) {
                // Create a dummy invisible line to have an anchor point for adding new elements to the list
                Shape dummy = peCreateService.createShape(containerShape, false);
                peService.setPropertyValue(dummy, ISprayConstants.PROPERTY_MODEL_TYPE, «target.EReferenceType.literalConstant».getName());
                Polyline p = gaService.createPolyline(dummy, new int[] { 0, 0, 0, 0 });
                p.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
                p.setLineWidth(0);
                p.setLineVisible(false);
                gaService.setLocation(p, 0, 0);
                peService.setPropertyValue(dummy, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
                for («target.EReferenceType.javaInterfaceName.shortName» prop: addedModelElement.get«target.name.toFirstUpper»()) {
                    
                }
                « /* 
                for («target.EReferenceType.javaInterfaceName.shortName» prop : addedModelElement.get«target.name.toFirstUpper»()) {
                    Shape «varname» = peCreateService.createContainerShape(containerShape, true);
                    peService.setPropertyValue(«varname», ISprayConstants.PROPERTY_STATIC, Boolean.TRUE.toString());
                    peService.setPropertyValue(«varname», ISprayConstants.PROPERTY_MODEL_TYPE, «target.EReferenceType.literalConstant».getName());
                    peService.setPropertyValue(«varname», ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
                    // create and set text graphics algorithm
                    Text text = gaService.createDefaultText(getDiagram(), «varname», prop.get«metaRef.labelPropertyName.toFirstUpper»());
                    // TODO should have a text color here, refer to representation of reference type
                    text.setForeground(manageColor(«metaRef.container.textColor»)); 
                    text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
                    text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
                    gaService.setLocationAndSize(text, 0, 0, 0, 0);
                    // create link and wire it
                    link(«varname», prop);
                }
                */ »
            }
        '''
}