package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XExpression
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import org.eclipselabs.spray.mm.spray.SprayStyleRef


class AddConnectionFromDslFeature extends FileGenerator<MetaClass> {
   
    @Inject extension NamingExtensions
    @Inject extension SprayCompiler
    
    SprayStyleRef styleRef = null
    
    def setAttributes(MetaClass metaClass, SprayStyleRef ssr){
        if(metaClass.style != null) {
        	styleRef = metaClass.style
        } else if(ssr != null) {
        	styleRef = ssr
        }
    }
    
    override CharSequence generateBaseFile(MetaClass modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(MetaClass modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaClass metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''
    
    def mainFile(MetaClass metaClass, String className) ''' 
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddConnectionContext;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
        import org.eclipse.graphiti.mm.algorithms.Polyline;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        «IF styleRef != null && styleRef.style != null»
        import «styleRef.style.qualifiedName»;
        «ELSE»
        import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
        «ENDIF»
        import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;
        import «connection.connection.qualifiedName»;
        import com.google.common.base.Function;
        
        import «metaClass.javaInterfaceName»;
        // MARKER_IMPORT
        
        @SuppressWarnings("unused")
        public abstract class «className» extends AbstractAddConnectionFeature {
            «generate_additionalFields(metaClass)»
        
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «metaClass.diagram.activatorClassName.shortName».get(IGaService.class);
            }

            «generate_canAdd(metaClass)»
            «generate_add(metaClass)»
            
            «generate_connectionToLabel(metaClass)»
            «generate_connectionLabel(metaClass)»
            «generate_connectionFromLabel(metaClass)»
            «generate_additionalMethods(metaClass)»
        }
    '''
    
    def generate_canAdd (MetaClass metaClass) '''
            /**
         * {@inheritDoc}
         * 
         * @return <code>true</code> if given business object is an {@link «metaClass.name»} and context is of type {@link IAddConnectionContext}
         */
         @Override
         public boolean canAdd(IAddContext context) {
            if (context instanceof IAddConnectionContext
                && context.getNewObject() instanceof «metaClass.name») {
                return true;
            }
            return false;
         }
    '''
    
    def generate_add (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «overrideHeader»
        public PictogramElement add(IAddContext context) {
            IAddConnectionContext addConContext = (IAddConnectionContext) context;
            // TODO: Domain object
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            «IF styleRef != null && styleRef.style != null»
            ISprayStyle style = new «styleRef.style.simpleName»();
            «ELSE»
            ISprayStyle style = new DefaultSprayStyle();
            «ENDIF»
            ISprayConnection connection = new «connection.connection.simpleName»(getFeatureProvider());
            Connection result = (Connection) connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());

            // create link and wire it
            peService.setPropertyValue(result , PROPERTY_MODEL_TYPE, «metaClass.literalConstant».getName());
            «IF metaClass.alias!=null»
            // store alias name
            peService.setPropertyValue(result , PROPERTY_ALIAS, "«metaClass.alias»");
            «ENDIF»
            link(result , addedDomainObject);
            for(ConnectionDecorator conDecorator : result.getConnectionDecorators()) {
                link(conDecorator, addedDomainObject);
            }
            
            setDoneChanges(true);
           	updatePictogramElement(result);
            
            return result;
        }
    '''
    

    def generate_connectionFromLabel (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «IF connection.fromLabel != null»
        «overrideHeader»
        protected GraphicsAlgorithm createConnectionFromLabel (IAddConnectionContext context, Connection connection) {
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            ConnectionDecorator fromDecorator = peCreateService.createConnectionDecorator(connection, true, 0.0, true);
            Text fromText = gaService.createDefaultText(getDiagram(), fromDecorator);
            gaLayoutService.setLocation(fromText, 10, 20);
            fromText.setValue(getFromLabel(addedDomainObject));
            peService.setPropertyValue(fromDecorator, PROPERTY_MODEL_TYPE, PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL);
            link(fromDecorator, addedDomainObject);
            return fromText;
        }
        protected String getFromLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.fromLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

    def generate_connectionToLabel (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «IF connection.toLabel != null»
        «overrideHeader»
        protected GraphicsAlgorithm createConnectionToLabel (IAddConnectionContext context, Connection connection) {
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            ConnectionDecorator toDecorator = peCreateService.createConnectionDecorator(connection, true, 1.0, true);
            Text text = gaService.createDefaultText(getDiagram(), toDecorator);
            
            GraphicsAlgorithm ga = context.getTargetAnchor().getParent().getGraphicsAlgorithm();
            int targetHeight = ga.getHeight();
            gaLayoutService.setLocation(text, 10, -(targetHeight / 2) - 20);
            text.setValue(getToLabel(addedDomainObject));
            peService.setPropertyValue(toDecorator, PROPERTY_MODEL_TYPE, PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL);
            link(toDecorator, addedDomainObject);
            return text;
        }

        protected String getToLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.toLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

    def generate_connectionLabel (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «IF connection.connectionLabel != null»
        «overrideHeader»
        protected GraphicsAlgorithm createConnectionLabel (IAddConnectionContext context, Connection connection) {
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            ConnectionDecorator connectionDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
            Text sourceText = gaService.createDefaultText(getDiagram(), connectionDecorator);
            gaLayoutService.setLocation(sourceText, 10, 0);
            sourceText.setValue(getConnectionLabel(addedDomainObject));
            peService.setPropertyValue(connectionDecorator, PROPERTY_MODEL_TYPE, PROPERTY_MODEL_TYPE_CONNECTION_LABEL);
            link(connectionDecorator, addedDomainObject);
            return sourceText;
        }

        protected String getConnectionLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.connectionLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

    def propertyAssignmentFunction(XExpression xexp, String valueName, String returnType, String metaClassName, String metaClassAttribute) '''
    	«returnType» «valueName» = new Function<«metaClassName», «returnType»>() {
    		public «returnType» apply(«metaClassName» modelElement) {
    			«xexp.compileForPropertyAssignement("returnedValue", "modelElement")»
    		}
    	}.apply(«metaClassAttribute»); 
    '''
}
