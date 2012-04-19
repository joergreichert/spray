package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipse.xtext.xbase.XExpression
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler

/*
 * Template for generating Graphiti Update feature for a ContainerInSpray representing a MetaClass
 */
class UpdateShapeFromDslFeature extends FileGenerator<ShapeFromDsl>  {
    @Inject extension NamingExtensions
    @Inject extension DiagramExtensions
  	@Inject extension SprayCompiler
  	
  	String sprayShapeConstantsClassName = "org.eclipselabs.spray.shapes.ISprayShapeConstants"
  	String functionClassName = "com.google.common.base.Function"
  	
    override CharSequence generateBaseFile(ShapeFromDsl modelElement) {
        mainFile(modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ShapeFromDsl modelElement) {
        mainExtensionPointFile(modelElement, javaGenFile.className)
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
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        
        import «container.represents.javaInterfaceName»;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(container)»
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «container.diagram.activatorClassName.shortName».get(IGaService.class);
            }
         
            «generate_canUpdate(container)»
            «generate_updateNeeded(container)»
            «generate_checkUpdateNeededRecursively(container)»
            «generate_update(container)»
            «generate_updateChildsRecursively(container)»
            «generate_additionalMethods(container)»
        }
        '''
        
        def generate_canUpdate (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean canUpdate(final IUpdateContext context) {
                // return true, if linked business object is a «container.represents.name»
                final PictogramElement pictogramElement = context.getPictogramElement();
                final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                return (bo instanceof «container.represents.name») && (!(pictogramElement instanceof Diagram));
            }
        '''
        
        def generate_updateNeeded (ShapeFromDsl container) '''
            «overrideHeader»
            public IReason updateNeeded(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                if (!(bo instanceof «container.represents.name»)) {
                    return Reason.createFalseReason(); 
                }
                if(pictogramElement instanceof ContainerShape) {
                    ContainerShape conShape = (ContainerShape) pictogramElement;
                    «container.represents.name» eClass = («container.represents.name») bo;
                    return checkUpdateNeededRecursively(conShape.getGraphicsAlgorithm(), eClass);
                }
                return Reason.createFalseReason();
             }
        '''
        
		def generate_checkUpdateNeededRecursively(ShapeFromDsl container) '''
	    	private IReason checkUpdateNeededRecursively(final GraphicsAlgorithm graphicsAlgorithm, final «container.represents.name» eClass) {
	    		if(graphicsAlgorithm instanceof Text) {
	    			«IF !container.properties.empty»
	    			Text text = (Text) graphicsAlgorithm;
	    			String id = peService.getPropertyValue(graphicsAlgorithm, «sprayShapeConstantsClassName.shortName».TEXT_ID);
	    			«FOR property : container.properties»
	    			if(id.equals("«property.key.simpleName»")) {
	    				«IF property.value != null»
	    				«property.value.propertyAssignmentFunction("eClassValue", "String", container.represents.name, "eClass")»
	    				«ELSE»
	    				String eClassValue = eClass.get«property.attribute.name.toFirstUpper»();
	    				«ENDIF»
	    				String gAlgorithmValue = text.getValue();
	    				if(eClassValue != null && gAlgorithmValue != null) {
	    					if(!eClassValue.equals(gAlgorithmValue)) {
	    						return Reason.createTrueReason();
	    					}
	    				}
	    			}
	    			«ENDFOR»
	    			«ENDIF»
	    		}
	    		for(GraphicsAlgorithm gAlgorithmChild : graphicsAlgorithm.getGraphicsAlgorithmChildren()) {
	    			return checkUpdateNeededRecursively(gAlgorithmChild, eClass);
	    		}
	    		return Reason.createFalseReason();
	    	}
	    '''
    
        def generate_update (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean update(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final «container.represents.name» eClass = («container.represents.name») getBusinessObjectForPictogramElement(pictogramElement);
                if(pictogramElement instanceof ContainerShape) {
                    ContainerShape conShape = (ContainerShape) pictogramElement;
                    updateChildsRecursively(conShape.getGraphicsAlgorithm(), eClass);
                }
                return true;
                
            }
        '''
	        
	    def generate_updateChildsRecursively(ShapeFromDsl container) '''
	    	private void updateChildsRecursively(final GraphicsAlgorithm graphicsAlgorithm, final «container.represents.name» eClass) {
	    		if(graphicsAlgorithm instanceof Text) {
	    			«IF !container.properties.empty»
	    			Text text = (Text) graphicsAlgorithm;
	    			String id = peService.getPropertyValue(graphicsAlgorithm, «sprayShapeConstantsClassName.shortName».TEXT_ID);
	    			«FOR property : container.properties»
	    			if(id.equals("«property.key.simpleName»")) {
	    				«IF property.value != null»
	    				«property.value.propertyAssignmentFunction("value", "String", container.represents.name, "eClass")»
	    				text.setValue(value);
	    				«ELSE»
	    				text.setValue(eClass.get«property.attribute.name.toFirstUpper»());
	    				«ENDIF»
	    			}
	    			«ENDFOR»
	    			«ENDIF»
	    		}
	    		for(GraphicsAlgorithm gAlgorithmChild : graphicsAlgorithm.getGraphicsAlgorithmChildren()) {
	    			updateChildsRecursively(gAlgorithmChild, eClass);
	    		}
	    	}
	    '''
        
	   def propertyAssignmentFunction(XExpression xexp, String valueName, String returnType, String metaClassName, String metaClassAttribute) '''
	   		«returnType» «valueName» = new «functionClassName.shortName»<«metaClassName», «returnType»>() {
	   			public «returnType» apply(«metaClassName» modelElement) {
	   				«xexp.compileForPropertyAssignement("returnedValue", "modelElement")»
	   			}
	   		}.apply(«metaClassAttribute»); 
	   '''
}
