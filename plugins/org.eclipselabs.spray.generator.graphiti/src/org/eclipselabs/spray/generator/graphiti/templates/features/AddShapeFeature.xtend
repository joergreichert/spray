package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.graphiti.util.IColorConstant
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayElementNameProvider
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.LineInSpray
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.SprayElement
import org.eclipselabs.spray.mm.spray.TextInSpray

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.SprayStyleRef


class AddShapeFeature extends FileGenerator<ContainerInSpray>  {
    @Inject extension LayoutExtensions
    @Inject extension IQualifiedNameProvider
    @Inject extension NamingExtensions
    @Inject extension SprayElementNameProvider
    @Inject extension DiagramExtensions
    
    MetaClass metaClass = null
    SprayStyleRef styleRef = null
    
    def setAttributes(MetaClass cls, SprayStyleRef ssr){
        metaClass = cls
        if(metaClass.style != null) {
        	styleRef = metaClass.style
        } else if(ssr != null) {
        	styleRef = ssr
        }
    }
    
    override CharSequence generateBaseFile(ContainerInSpray modelElement) {
        mainFile( modelElement as ContainerInSpray, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ContainerInSpray modelElement) {
        mainExtensionPointFile( modelElement as ContainerInSpray, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ContainerInSpray container, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(ContainerInSpray container, String className) '''
        «var containerType = constainerClass(container)»
        «header(this)»
        package «feature_package()»;
        
        import «container.represents.javaInterfaceName»;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.algorithms.Polyline;
        import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import «util_package()».ISprayContainer;
        import «util_package()».«containerType»;
        import «util_package()».SprayContainerService;
        // MARKER_IMPORT

        public class «className» extends AbstractAddFeature {
            protected final static String typeOrAliasName = "«container.represents.visibleName»";
            protected Diagram targetDiagram = null;
            protected «containerType» container = null;
            «generate_additionalFields(container)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
                container = new «containerType»();
                gaService = «container.diagram.activatorClassName.shortName».get(IGaService.class);
            }
        
            «overrideHeader()»
            public boolean canAdd(IAddContext context) {
                final EObject newObject = (EObject) context.getNewObject();
                if (newObject instanceof «container.represents.name») {
                    // check if user wants to add to a diagram
                    if (context.getTargetContainer() instanceof Diagram) {
                        return true;
                    }
                }
                return false;
            }

            «overrideHeader»
            public PictogramElement add(IAddContext context) {
                «container.represents.name» addedModelElement = («container.represents.name») context.getNewObject();
                targetDiagram = peService.getDiagramForShape(context.getTargetContainer());
        
                ContainerShape containerShape = container.createContainer(context, addedModelElement);
                ContainerShape textContainer = SprayContainerService.findTextShape(containerShape);
                «IF container.hasFillColor»
                    textContainer.getGraphicsAlgorithm().setBackground(manageColor(«container.fillColor»));
                «ENDIF»    
                link(containerShape, addedModelElement);
                link(textContainer, addedModelElement);
        
                «FOR part : container.parts»
                    create«part.eClass.name»«part.shapeName.toFirstUpper»(context, addedModelElement, textContainer);
                «ENDFOR»
                
                // add a chopbox anchor to the shape
                peCreateService.createChopboxAnchor(containerShape);
        
                // call the update and layout features
                updatePictogramElement(containerShape);
                layoutPictogramElement(containerShape);
                
                setDoneChanges(true);
                
                return containerShape;
            }
            
            «FOR part : container.parts»
               «part.createShape(container.represents)»
            «ENDFOR»
            
            «generate_additionalFields(container)»
        }
        '''
        
        def dispatch createShape (SprayElement part, MetaClass cls) '''
            protected void create«part.eClass.name»«part.shapeName» (IAddContext context, «cls.name» addedModelElement, ContainerShape containerShape) {
                System.out.println("Spray: unhandled Container child [«part.getClass().name»]");
            }
        '''
        
        def dispatch createShape (LineInSpray line, MetaClass cls) '''
            «val varname = line.shapeName.toFirstLower»
            // Part is Line
            protected void createLineInSpray«line.shapeName» (IAddContext context, «cls.name» addedModelElement, ContainerShape containerShape) {
                // create shape for line
                Shape «varname» = peCreateService.createShape(containerShape, false);
                // create and set graphics algorithm
                Polyline polyline = gaService.createPolyline(«varname», new int[] { 0, 0, 0, 0 });
                polyline.setForeground(manageColor(«line.lineColor» ));
                polyline.setLineWidth(«line.layout.lineWidth»);
            «IF line.layout.lineWidth == 0»
                polyline.setLineVisible(false);
            «ENDIF»
                gaService.setLocation(polyline, 0, 0);
                peService.setPropertyValue(«varname», ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
            }
        '''
        
        def dispatch createShape (TextInSpray text, MetaClass cls) '''
            «val varname = text.shapeName.toFirstLower»
            // Part is Text
            protected void createTextInSpray«text.shapeName» (IAddContext context, «cls.name» addedModelElement, ContainerShape containerShape) {
                String type = "«text.fullyQualifiedName»";
                // create shape for text and set text graphics algorithm
                Shape «varname» = peCreateService.createShape(containerShape, false);
                Text text = gaService.createDefaultText(getDiagram(), «varname»);
                text.setFont(gaService.manageFont(getDiagram(), text.getFont().getName(), 12, «text.layout.italic», «text.layout.bold»));
                text.setForeground(manageColor(«text.lineColor»));
                text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
                text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
                gaService.setLocationAndSize(text, 0, 0, 0, 0);
                peService.setPropertyValue(«varname», ISprayConstants.PROPERTY_MODEL_TYPE, type);
                peService.setPropertyValue(«varname», ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
                // create link and wire it
                link(«varname», addedModelElement);
            }
        '''
        
        def dispatch createShape (MetaReference metaRef, MetaClass cls) '''
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