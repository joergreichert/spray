package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*

class UpdateConnectionFeature extends FileGenerator<ConnectionInSpray>  {
    @Inject extension NamingExtensions
    @Inject extension DiagramExtensions
    
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
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''
    
    def mainFile(ConnectionInSpray connection, String className) '''
        «header(this)»
        package «feature_package()»;

        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipse.xtext.xbase.lib.ObjectExtensions;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        import «connection.represents.javaInterfaceName»;
        // MARKER_IMPORT
                
        public class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(connection)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
                gaService = «connection.diagram.activatorClassName.shortName».get(IGaService.class);
            }
        
            «generate_canUpdate(connection)»
            «generate_updateNeeded(connection)»
            «generate_update(connection)»
            «generate_getValue(connection)»
            «generate_additionalFields(connection)»
        }
    '''

    def generate_canUpdate (ConnectionInSpray connection) '''
        «val metaClassName = connection.represents.name»
        «overrideHeader()»
        public boolean canUpdate(IUpdateContext context) {
            // return true, if linked business object is a EClass
            EObject bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
            PictogramElement pictogramElement = context.getPictogramElement();
            return (bo instanceof «metaClassName») && (!(pictogramElement instanceof Diagram));
        }
    '''

    def generate_updateNeeded (ConnectionInSpray connection) '''
        «val metaClassName = connection.represents.name»
        «overrideHeader()»
        public IReason updateNeeded(IUpdateContext context) {
            PictogramElement pictogramElement = context.getPictogramElement();
            EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
            if ( ! (bo instanceof «metaClassName»)) {
                return Reason.createFalseReason();
            }
            «metaClassName» eClass = («metaClassName») bo;

            if (pictogramElement instanceof FreeFormConnection) {
                FreeFormConnection free = (FreeFormConnection) pictogramElement;
                for (ConnectionDecorator decorator : free.getConnectionDecorators()) {
                    String type = peService.getPropertyValue(decorator, ISprayConstants.PROPERTY_MODEL_TYPE);
                    String value = getValue(type, eClass);
                    Text text = (Text) decorator.getGraphicsAlgorithm();
                    String current = text.getValue();
                    if (ObjectExtensions.operator_notEquals(current, value)) {
                        return Reason.createTrueReason(type + " is changed");
                    }
                }
            }
            return Reason.createFalseReason();
        }
    '''

    def generate_update (ConnectionInSpray connection) '''
        «val metaClassName = connection.represents.name»
        «overrideHeader()»
        public boolean update(IUpdateContext context) {
            PictogramElement pictogramElement = context.getPictogramElement();
            «metaClassName» eClass = («metaClassName») getBusinessObjectForPictogramElement(pictogramElement);

            FreeFormConnection free = (FreeFormConnection) pictogramElement;
            for (ConnectionDecorator decorator : free.getConnectionDecorators()) {
                String type = peService.getPropertyValue(decorator, ISprayConstants.PROPERTY_MODEL_TYPE);
                String value = getValue(type, eClass);
                Text text = (Text) decorator.getGraphicsAlgorithm();
                text.setValue(value);
            }
            return true;
        }
    '''
    
    def generate_getValue (ConnectionInSpray connection) '''
        protected String getValue(String type, «connection.represents.name» eClass) {
            String result = "";
            if(ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL.equals(type) ){
                «var fromLabel =  connection.fromLabel»
                «IF fromLabel != null»
                «valueGenerator(connection.fromLabel, "eClass")»
                «ENDIF»
            }
            if(ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL.equals(type) ){
                «IF connection.toLabel!=null»
                «valueGenerator(connection.toLabel, "eClass")»
                «ENDIF»
            }
            if(ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_LABEL.equals(type) ){
                «IF connection.connectionLabel!=null»
                «valueGenerator(connection.connectionLabel, "eClass")»
                «ENDIF»
            }
            return result;
        }
    '''
    
}