package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.Text

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions

/*
 * Template for generating Graphiti Update feature for a Container representing a MetaClass
 */
class UpdateShapeFeature extends FileGenerator  {
    @Inject extension NamingExtensions
    @Inject extension IQualifiedNameProvider
    @Inject extension DiagramExtensions

    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Container, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Container, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Container container, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(Container container, String className) '''
        «header(this)»
        package «feature_package()»;

        import java.util.HashMap;
        import java.util.Map;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        import «util_package()».SprayContainerService;
        import «container.represents.javaInterfaceName»;
        // MARKER_IMPORT
        
        public class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(container)»
            public «className»(IFeatureProvider fp) {
                super(fp);
                gaService = «container.diagram.activatorClassName.shortName».get(IGaService.class);
            }
         
            «generate_canUpdate(container)»
            «generate_updateNeeded(container)»
            «generate_update(container)»
            «generate_valueMapping(container)»
            «generate_additionalFields(container)»
        }
        '''
        
        def generate_canUpdate (Container container) '''
            «overrideHeader»
            public boolean canUpdate(IUpdateContext context) {
                // return true, if linked business object is a EClass
                EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
                PictogramElement pictogramElement = context.getPictogramElement();
                return (bo instanceof «container.represents.name»)&& (!(pictogramElement instanceof Diagram));
            }
        '''
        
        def generate_updateNeeded (Container container) '''
            «overrideHeader»
            public IReason updateNeeded(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof «container.represents.name»)) {
                    return Reason.createFalseReason(); 
                }
                   «container.represents.name» eClass = («container.represents.name») bo;

                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    ContainerShape cs = (ContainerShape) pictogramElement;
                    ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            Text text = (Text) shape.getGraphicsAlgorithm();
                            String type = peService.getPropertyValue(shape, "MODEL_TYPE");
                            String value = getValues(eClass).get(type);
                            if( value != null){
                                   String pictogramName = text.getValue();

                                 // update needed, if names are different
                                boolean updateNameNeeded =((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));
                                if (updateNameNeeded) {
                                    return Reason.createTrueReason("Name [" + pictogramName + "] is out of date");
                                }
                            }
                        }
                    }
                }
                return Reason.createFalseReason();
             }
        '''
        
        def generate_update (Container container) '''
            «overrideHeader»
            public boolean update(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                  «container.represents.name» eClass = («container.represents.name») bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
        '''
        
        def generate_valueMapping (Container container) '''
            Map<String, String> values = null; 
            protected Map<String, String> getValues(«container.represents.name» eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }

            protected void fillValues(«container.represents.name» eClass) {
                String type, value;
            «FOR part :  container.parts »
                «IF part instanceof Text»
                    «var text = part as Text»
                type = "«text.fullyQualifiedName»";
                value = getValue(type, eClass);
                values.put(type, value);
                «ENDIF»
            «ENDFOR»            
            }
            
            protected String getValue (String type, «container.represents.name» eClass) {
            «FOR part :  container.parts »
                «IF part instanceof Text»
                    «var text = part as Text»
                    if ("«text.fullyQualifiedName»".equals(type)) {
                        «valueGenerator(text, "eClass")»
                    }
                «ENDIF»
            «ENDFOR»            
                throw new IllegalArgumentException(type);
            }
        '''
}