package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*


class AddConnectionFromDslFeature extends FileGenerator<MetaClass> {
    @Inject extension LayoutExtensions
    @Inject extension NamingExtensions
    
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
        «val diagramName = metaClass.diagram.name »
        «val packge = metaClass.type.EPackage.name »
        «val fullPackage = fullPackageName(metaClass.type) »
        «val connection = metaClass.representedBy as ConnectionInSpray»
        «header(this)»
        package «feature_package()»;
        
        import «metaClass.javaInterfaceName»;
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
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;
        import org.eclipselabs.spray.shapes.ISprayConnection;
        import org.eclipselabs.spray.styles.ISprayStyle;
        import org.eclipselabs.spray.styles.DefaultSprayStyle;
        import static org.eclipselabs.spray.runtime.graphiti.ISprayConstants.PROPERTY_MODEL_TYPE;
        import org.eclipselabs.spray.shapes.«connection.connection.name»;
        // MARKER_IMPORT
        
        public class «className» extends AbstractAddConnectionFeature {
            «generate_additionalFields(metaClass)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
                gaService = «metaClass.diagram.activatorClassName.shortName».get(IGaService.class);
            }

            «generate_canAdd(metaClass)»
            «generate_add(metaClass)»
            
            «generate_connectionToLabel(metaClass)»
            «generate_connectionLabel(metaClass)»
            «generate_connectionFromLabel(metaClass)»
            «generate_additionalFields(metaClass)»
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

            ISprayStyle style = new DefaultSprayStyle();
            ISprayConnection  connection = new «connection.connection.name»();
            PictogramElement result = connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());

            // create link and wire it
            peService.setPropertyValue(result , PROPERTY_MODEL_TYPE, «metaClass.literalConstant».getName());
//            decorateConnection (addConContext, result );
            link(result , addedDomainObject);

            setDoneChanges(true);
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
            peService.setPropertyValue(fromDecorator, PROPERTY_MODEL_TYPE, ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL);
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
            peService.setPropertyValue(toDecorator, PROPERTY_MODEL_TYPE, ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL);
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
            peService.setPropertyValue(connectionDecorator, PROPERTY_MODEL_TYPE, ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_LABEL);
            link(connectionDecorator, addedDomainObject);
            return sourceText;
        }

        protected String getConnectionLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.connectionLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

}
