package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.graphiti.util.IColorConstant
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Connection
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*


class AddConnectionFeature extends FileGenerator {
    @Inject extension LayoutExtensions
    @Inject extension NamingExtensions
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as MetaClass, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as MetaClass, javaGenFile.className)
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
        «val connection = metaClass.representedBy as Connection»
        «header(this)»
        package «feature_package()»;
        
        import «metaClass.javaInterfaceName»;
        import org.eclipse.emf.ecore.util.EcoreUtil;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddConnectionContext;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
        import org.eclipse.graphiti.mm.algorithms.Polyline;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
        import static org.eclipselabs.spray.runtime.graphiti.ISprayConstants.PROPERTY_URI;
        import static org.eclipselabs.spray.runtime.graphiti.ISprayConstants.PROPERTY_MODEL_TYPE;
        // MARKER_IMPORT
        
        public class «className» extends AbstractAddFeature {
            «generate_additionalFields(metaClass)»
        
            public «className»(IFeatureProvider fp) {
                super(fp);
            }

            «generate_canAdd(metaClass)»
            «generate_add(metaClass)»
            «generate_connectionLine(metaClass)»
            
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
        «val connection = metaClass.representedBy as Connection»
        «overrideHeader»
        public PictogramElement add(IAddContext context) {
            IAddConnectionContext addConContext = (IAddConnectionContext) context;
            // TODO: Domain object
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();

            Connection connection = createConnectionLine (addConContext);
            «IF connection.toLabel != null»
                createConnectionToLabel (addConContext, connection);
            «ENDIF»
            «IF connection.connectionLabel != null»
                createConnectionLabel (addConContext, connection);
            «ENDIF»
            «IF connection.fromLabel != null»
                createConnectionToLabel (addConContext, connection);
            «ENDIF»
     
            // create link and wire it
            peService.setPropertyValue(connection, PROPERTY_MODEL_TYPE, "«metaClass.name»");
            link(connection, addedDomainObject);

            setDoneChanges(true);
            return connection;
        }
    '''
    
    def generate_connectionLine (MetaClass metaClass) '''
        protected Connection createConnectionLine (IAddConnectionContext context) {
            // CONNECTION WITH POLYLINE
            Connection connection = peCreateService.createFreeFormConnection(getDiagram());
            connection.setStart(context.getSourceAnchor());
            connection.setEnd(context.getTargetAnchor());
     
            Polyline polyline = gaService.createPolyline(connection);
            polyline.setLineWidth(«metaClass.representedBy.layout.lineWidth»);
            polyline.setForeground(manageColor(«metaClass.lineColor»));
            return connection;
        }
    '''

    def generate_connectionFromLabel (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as Connection»
        «IF connection.fromLabel != null»
        protected void createConnectionFromLabel (IAddConnectionContext context, Connection connection) {
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            ConnectionDecorator fromDecorator = peCreateService.createConnectionDecorator(connection, true, 0.0, true);
            Text fromText = gaService.createDefaultText(getDiagram(), fromDecorator);
            fromText.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
            gaLayoutService.setLocation(fromText, 10, 20);
            fromText.setValue(getFromLabel(addedDomainObject));
            peService.setPropertyValue(fromDecorator, PROPERTY_MODEL_TYPE, "FROM_LABEL");
            link(fromDecorator, addedDomainObject);
        }
        protected String getFromLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.fromLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

    def generate_connectionToLabel (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as Connection»
        «IF connection.toLabel != null»
        protected void createConnectionToLabel (IAddConnectionContext context, Connection connection) {
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            ConnectionDecorator toDecorator = peCreateService.createConnectionDecorator(connection, true, 1.0, true);
            Text text = gaService.createDefaultText(getDiagram(), toDecorator);
            text.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
            
            GraphicsAlgorithm ga = context.getTargetAnchor().getParent().getGraphicsAlgorithm();
            int targetHeight = ga.getHeight();
            gaLayoutService.setLocation(text, 10, -(targetHeight / 2) - 20);
            text.setValue(getToLabel(addedDomainObject));
            peService.setPropertyValue(toDecorator, PROPERTY_MODEL_TYPE, "TO_LABEL");
            link(toDecorator, addedDomainObject);
        }

        protected String getToLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.toLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

    def generate_connectionLabel (MetaClass metaClass) '''
        «val connection = metaClass.representedBy as Connection»
        «IF connection.connectionLabel != null»
        protected void createConnectionLabel (IAddConnectionContext context, Connection connection) {
            «metaClass.name» addedDomainObject = («metaClass.name») context.getNewObject();
            ConnectionDecorator connectionDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
            Text sourceText = gaService.createDefaultText(getDiagram(), connectionDecorator);
            sourceText.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
            gaLayoutService.setLocation(sourceText, 10, 0);
            sourceText.setValue(getConnectionLabel(addedDomainObject));
            peService.setPropertyValue(connectionDecorator, PROPERTY_MODEL_TYPE, "CONNECTION_LABEL");
            link(connectionDecorator, addedDomainObject);
        }

        protected String getConnectionLabel («metaClass.name» addedDomainObject) {
            «valueGenerator(connection.connectionLabel, "addedDomainObject")»
        }
        «ENDIF»
    '''

}
