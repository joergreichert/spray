package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.TextInSpray

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import com.google.common.collect.Lists

/*
 * Template for generating Graphiti Update feature for a ContainerInSpray representing a MetaClass
 */
class UpdateShapeFeature extends FileGenerator<ContainerInSpray>  {
    @Inject extension NamingExtensions
    @Inject extension IQualifiedNameProvider
    @Inject extension DiagramExtensions

    override CharSequence generateBaseFile(ContainerInSpray modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ContainerInSpray modelElement) {
            mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ContainerInSpray container, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(ContainerInSpray container, String className) '''
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
        import «container?.represents?.javaInterfaceName»;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(container)»
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «container?.diagram?.activatorClassName?.shortName».get(IGaService.class);
            }
         
            «generate_canUpdate(container)»
            «generate_updateNeeded(container)»
            «generate_update(container)»
            «generate_valueMapping(container)»
            «generate_additionalMethods(container)»
        }
        '''
        
        def generate_canUpdate (ContainerInSpray container) '''
            «overrideHeader»
            public boolean canUpdate(final IUpdateContext context) {
                // return true, if linked business object is a EClass
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                return (bo instanceof «container.represents.itfName»)&& (!(pictogramElement instanceof Diagram));
            }
        '''
        
        def generate_updateNeeded (ContainerInSpray container) '''
            «overrideHeader»
            public IReason updateNeeded(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof «container.represents.itfName»)) {
                    return Reason.createFalseReason(); 
                }
                final «container.represents.itfName» eClass = («container.represents.itfName») bo;

                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    final ContainerShape cs = (ContainerShape) pictogramElement;
                    final ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (final Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            final Text text = (Text) shape.getGraphicsAlgorithm();
                            final String type = peService.getPropertyValue(shape, PROPERTY_MODEL_TYPE);
                            final String value = getValues(eClass).get(type);
                            if(value != null){
                                final String pictogramName = text.getValue();

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
        
        def generate_update (ContainerInSpray container) '''
            «overrideHeader»
            public boolean update(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                final «container.represents.itfName» eClass = («container.represents.itfName») bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
        '''
        
        def generate_valueMapping (ContainerInSpray container) '''
            Map<String, String> values = null; 
            protected Map<String, String> getValues(final «container.represents.itfName» eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }

            protected void fillValues(final «container.represents.itfName» eClass) {
                String type, value;
            «FOR part : if(container?.parts != null) container?.parts else Lists::newArrayList.toArray »
                «IF part instanceof TextInSpray»
                    «var text = part as TextInSpray»
                type = "«text.fullyQualifiedName»";
                value = getValue(type, eClass);
                values.put(type, value);
                «ENDIF»
            «ENDFOR»            
            }
            
            protected String getValue (final String type, final «container.represents.itfName» eClass) {
            «FOR part :  if(container?.parts != null) container?.parts else Lists::newArrayList.toArray »
                «IF part instanceof TextInSpray»
                    «var text = part as TextInSpray»
                    if ("«text.fullyQualifiedName»".equals(type)) {
                        «valueGenerator(text, "eClass")»
                    }
                «ENDIF»
            «ENDFOR»            
                throw new IllegalArgumentException(type);
            }
        '''
}