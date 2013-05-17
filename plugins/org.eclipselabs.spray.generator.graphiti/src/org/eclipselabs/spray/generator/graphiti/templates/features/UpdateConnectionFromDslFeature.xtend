package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XExpression
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment

class UpdateConnectionFromDslFeature extends FileGenerator<ConnectionInSpray>  {
    @Inject extension NamingExtensions
    @Inject extension DiagramExtensions
    @Inject extension SprayCompiler
    
    override CharSequence generateBaseFile(ConnectionInSpray modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ConnectionInSpray modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ConnectionInSpray connection, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        }
    '''
    
    def mainFile(ConnectionInSpray connection, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import java.util.ArrayList;
        import java.util.List;
        
        import org.eclipse.emf.ecore.EObject;
        import com.google.common.base.Function;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        
        import «connection.represents.javaInterfaceName»;
        // MARKER_IMPORT
                
        public abstract class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(connection)»
        
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «connection.diagram.activatorClassName.shortName».get(IGaService.class);
            }
        
            «generate_canUpdate(connection)»
            «generate_updateNeeded(connection)»
            «generate_update(connection)»
            «IF !connection.properties.empty»
            	«generate_searchChilds(connection)»
            «ENDIF»
            «generate_additionalMethods(connection)»
        }
    '''

    def generate_canUpdate (ConnectionInSpray connection) '''
        «val metaClassName = connection.represents.name»
        «overrideHeader()»
        public boolean canUpdate(final IUpdateContext context) {
            // return true, if linked business object is a EClass
            final PictogramElement pictogramElement = context.getPictogramElement();
            final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
            return (bo instanceof «metaClassName») && (!(pictogramElement instanceof Diagram));
        }
    '''

    def generate_updateNeeded (ConnectionInSpray connection) '''
        «val metaClassName = connection.represents.name»
        «overrideHeader()»
        public IReason updateNeeded(final IUpdateContext context) {
            final PictogramElement pictogramElement = context.getPictogramElement();
            final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
            if ( ! (bo instanceof «metaClassName»)) {
                return Reason.createFalseReason();
            }
            «IF !connection.properties.empty»
	            «metaClassName» eClass = («metaClassName») bo;
	            if(pictogramElement instanceof Connection) {
	                final Connection conShape = (Connection) pictogramElement;
	                List<String> changedTypes = new ArrayList<String>();
	                for(ConnectionDecorator dec : conShape.getConnectionDecorators()) {
	                    final GraphicsAlgorithm gAlg = dec.getGraphicsAlgorithm();
	                    searchChilds(gAlg, eClass, changedTypes, false);
	                    if(!changedTypes.isEmpty()) {
	                    	return Reason.createTrueReason(changedTypes.toString());
	                    }
	                }
	            }
            «ENDIF»
            return Reason.createFalseReason();
        }
    '''

    def generate_update (ConnectionInSpray connection) '''
        «overrideHeader()»
        public boolean update(IUpdateContext context) {
            «IF !connection.properties.empty»
		        «val metaClassName = connection.represents.name»
		        final PictogramElement pictogramElement = context.getPictogramElement();
		        final «metaClassName» eClass = («metaClassName») getBusinessObjectForPictogramElement(pictogramElement);
		        «handleNotEmptyConnectionProperties»
            «ELSE»
            	return false;
            «ENDIF»
        }
    '''
    
    def handleNotEmptyConnectionProperties() '''
		if(pictogramElement instanceof Connection) {
			final Connection conShape = (Connection) pictogramElement;
			for(ConnectionDecorator dec : conShape.getConnectionDecorators()) {
				final GraphicsAlgorithm gAlg = dec.getGraphicsAlgorithm();
				searchChilds(gAlg, eClass, new ArrayList<String>(), true);
			}
		}
		return true;
    '''
    
	def generate_searchChilds(ConnectionInSpray connection) '''
    	protected void searchChilds(GraphicsAlgorithm gAlg, «connection.represents.name» eClass, List<String> changedTypes, boolean performUpdate) {
    		if(gAlg instanceof Text) {
    			Text text = (Text) gAlg;
    			String id = peService.getPropertyValue(gAlg, TEXT_ID);
    			«connection.properties.map[generate_setTextValue(connection)].join()»
    		} else {
    			for(GraphicsAlgorithm gAlgChild : gAlg.getGraphicsAlgorithmChildren()) {
    				searchChilds(gAlgChild, eClass, changedTypes, performUpdate);
    			}
    		}
    	}
    '''
    
    def generate_setTextValue(ShapePropertyAssignment property, ConnectionInSpray connection) '''
		if(id.equals("«property.key.simpleName»")) {
			if(performUpdate) {
				«IF property.value != null»
				«property.value.propertyAssignmentFunction("value", "String", connection.represents.itfName, "eClass")»
				text.setValue(value);
				«ELSE»
				text.setValue(eClass.get«property.attribute.name.toFirstUpper»());
				«ENDIF»
				setDoneChanges(true);
			} else {
				«IF property.value != null»
					«property.value.propertyAssignmentFunction("eClassValue", "String", connection.represents.itfName, "eClass")»
				«ELSE»
					String eClassValue = eClass.get«property.attribute.name.toFirstUpper»();
				«ENDIF»
				String gAlgorithmValue = text.getValue();
				if(eClassValue != null) {
					if(!eClassValue.equals(gAlgorithmValue)) {
						changedTypes.add("«property.key.simpleName»");
					}
				}
			}
		}
    '''
   
	def propertyAssignmentFunction(XExpression xexp, String valueName, String returnType, String metaClassName, String metaClassAttribute) '''
   		«returnType» «valueName» = new Function<«metaClassName», «returnType»>() {
   			public «returnType» apply(«metaClassName» modelElement) {
   				«xexp.compileForPropertyAssignement("returnedValue", "modelElement")»
   			}
   		}.apply(«metaClassAttribute»); 
	'''
}