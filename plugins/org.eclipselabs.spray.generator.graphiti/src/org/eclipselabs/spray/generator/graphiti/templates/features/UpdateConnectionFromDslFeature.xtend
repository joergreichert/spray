package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XExpression
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

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
            «generate_searchChilds(connection)»
            «generate_getValue(connection)»
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
            «metaClassName» eClass = («metaClassName») bo;

«««            if (pictogramElement instanceof Connection) {
«««                final Connection free = (Connection) pictogramElement;
«««                for(ConnectionDecorator dec : free.getConnectionDecorators()) {
«««                    final GraphicsAlgorithm gAlg = dec.getGraphicsAlgorithm();
«««                    searchChilds(gAlg, eClass);
«««                }
«««            }
            return Reason.createTrueReason();
        }
    '''

    def generate_update (ConnectionInSpray connection) '''
        «val metaClassName = connection.represents.name»
        «overrideHeader()»
        public boolean update(IUpdateContext context) {
            final PictogramElement pictogramElement = context.getPictogramElement();
            final «metaClassName» eClass = («metaClassName») getBusinessObjectForPictogramElement(pictogramElement);
            
            if(pictogramElement instanceof Connection) {
                final Connection conShape = (Connection) pictogramElement;
                for(ConnectionDecorator dec : conShape.getConnectionDecorators()) {
                    final GraphicsAlgorithm gAlg = dec.getGraphicsAlgorithm();
                    searchChilds(gAlg, eClass);
                }
            }

            return true;
        }
    '''
    
	def generate_searchChilds(ConnectionInSpray connection) '''
    	protected void searchChilds(GraphicsAlgorithm gAlg, «connection.represents.name» eClass) {
    		if(gAlg instanceof Text) {
    			Text text = (Text) gAlg;
    			String id = peService.getPropertyValue(gAlg, TEXT_ID);
    			«FOR property : connection.properties»
    			if(id.equals("«property.key.simpleName»")) {
    				«IF property.value != null»
    				«property.value.propertyAssignmentFunction("value", "String", connection.represents.name, "eClass")»
    				text.setValue(value);
    				«ELSE»
    				text.setValue(eClass.get«property.attribute.name.toFirstUpper»());
    				«ENDIF»
    			}
    			«ENDFOR»
    		}
    		for(GraphicsAlgorithm gAlgChild : gAlg.getGraphicsAlgorithmChildren()) {
    			searchChilds(gAlgChild, eClass);
    		}
    	}
    '''
    
    def generate_getValue (ConnectionInSpray connection) '''
        protected String getValue(final String type, final «connection.represents.name» eClass) {
            String result = "";
«««            «IF connection.fromLabel != null»
«««            if(PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL.equals(type) ){
«««                «valueGenerator(connection.fromLabel, "eClass")»
«««            }
«««            «ENDIF»
«««            «IF connection.toLabel!=null»
«««            if(PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL.equals(type) ){
«««                «valueGenerator(connection.toLabel, "eClass")»
«««            }
«««            «ENDIF»
«««            «IF connection.connectionLabel!=null»
«««            if(PROPERTY_MODEL_TYPE_CONNECTION_LABEL.equals(type) ){
«««                «valueGenerator(connection.connectionLabel, "eClass")»
«««            }
«««            «ENDIF»
            return result;
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