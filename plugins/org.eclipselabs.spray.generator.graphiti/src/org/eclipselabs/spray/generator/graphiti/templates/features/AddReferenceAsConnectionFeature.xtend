package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

class AddReferenceAsConnectionFeature extends FileGenerator<MetaReference>  {
    @Inject extension NamingExtensions
    @Inject extension MetaReferenceExtensions
    
    override CharSequence generateBaseFile(MetaReference modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(MetaReference modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaReference metaReference, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        //  /**
        //   * {@inheritDoc}
        //   */
        //  @Override
        //  protected GraphicsAlgorithm createConnectionStartDecorator (final IAddConnectionContext context,
        //          final Connection connection) {
        //      final ConnectionDecorator cd = peCreateService.createConnectionDecorator(
        //              connection, /* active */false, /* location */0.0, /* isRelative */
        //              true);
        //      final Polyline polyline = gaService.createPolyline(cd, new int[] {
        //              -15, 10, 0, 0, -15, -10 });
        //
        //      polyline.setForeground(manageColor(IColorConstant.BLACK));
        //      polyline.setLineWidth(1);
        //      
        //      return polyline;
        //      return null;
        //  }
        
        //  /**
        //   * {@inheritDoc}
        //   */
        //  @Override
        //  protected GraphicsAlgorithm createConnectionEndDecorator (final IAddConnectionContext context,
        //          final Connection connection) {
        //      final ConnectionDecorator cd = peCreateService.createConnectionDecorator(
        //              connection, /* active */false, /* location */1.0, /* isRelative */
        //              true);
        //      final Polygon polygon = gaService.createPolygon(cd, new int[] {
        //              -12, 8, 0, 0, -12, -8, -12, 8 });
        //
        //      polygon.setForeground(manageColor(IColorConstant.BLACK));
        //      polygon.setBackground(manageColor(IColorConstant.WHITE));
        //      polygon.setFilled(Boolean.TRUE);
        //      polygon.setLineWidth(1);
        //      
        //      return polygon;
        //  }
        }
    '''
    
    def mainFile(MetaReference reference, String className) '''
        «header(this)»
        package «feature_package()»;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddConnectionContext;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
        import org.eclipse.graphiti.mm.algorithms.Polyline;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;
        «IF reference.representedBy.connection != null»
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
        import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;
        import «reference.representedBy.connection.qualifiedName»;
        «ENDIF»
        // MARKER_IMPORT
        
        @SuppressWarnings("unused")
        public abstract class «className» extends AbstractAddConnectionFeature {
            «generate_additionalFields(reference)»
            
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «reference.diagram.activatorClassName.shortName».get(IGaService.class);
            }

            «generate_canAdd(reference)»
            «generate_add(reference)»
            «generate_removeExisting(reference)»
            «generate_additionalMethods(reference)»
        }
    '''
    
    def generate_add (MetaReference reference) '''
        «val target=reference.target»
        «overrideHeader()»
        public PictogramElement add(final IAddContext context) {
            final IAddConnectionContext addConContext = (IAddConnectionContext) context;
            «reference.metaClass.type.itfName» addedDomainObject = («reference.metaClass.itfName») context.getNewObject();
            «IF target.upperBound == 1»
            removeExisting(context);
            «ENDIF»        
            
            «IF reference.representedBy.connection == null»
            // CONNECTION WITH POLYLINE
            final Connection connection = peCreateService.createFreeFormConnection(getDiagram());
            connection.setStart(addConContext.getSourceAnchor());
            connection.setEnd(addConContext.getTargetAnchor());
            
            // TRY
            final AnchorContainer parent = connection.getStart().getParent();
            final EObject start = (EObject) getBusinessObjectForPictogramElement(parent);
            final AnchorContainer child = connection.getEnd().getParent();
            final EObject end = (EObject) getBusinessObjectForPictogramElement(child);
            //END TRY
            
            final Polyline polyline = gaService.createPolyline(connection);
            polyline.setLineWidth(1);
            «««polyline.setForeground(manageColor(«reference.lineColor»));

            // add static graphical decorator
            // ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
            //      No arrows
            //        createArrow(cd);
            decorateConnection (addConContext, connection);
            «ELSE»
            ISprayStyle style = new DefaultSprayStyle();
            ISprayConnection iSprayConnection = new «reference.representedBy.connection.simpleName»(getFeatureProvider());
            Connection connection = (Connection) iSprayConnection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());
            «ENDIF»
            // create link and wire it
            peService.setPropertyValue(connection, PROPERTY_MODEL_TYPE, "«reference.metaClass.type.name».«target.name»");
            peService.setPropertyValue(connection, PROPERTY_REFERENCE, (String)context.getProperty(PROPERTY_REFERENCE));
            peService.setPropertyValue(connection, PROPERTY_TARGETOBJECT, (String)context.getProperty(PROPERTY_TARGETOBJECT));
            link(connection, addedDomainObject);
            for(ConnectionDecorator conDecorator : connection.getConnectionDecorators()) {
                link(conDecorator, addedDomainObject);
            }
            
            setDoneChanges(true);
            return connection;
        }
    '''
    
    def generate_canAdd (MetaReference reference) '''
        «overrideHeader()»
        public boolean canAdd(final IAddContext context) {
            // return true if given business object is an «reference.metaClass.type.name»
            // note, that the context must be an instance of IAddConnectionContext
            if (context instanceof IAddConnectionContext
                && context.getNewObject() instanceof «reference.metaClass.itfName») {
                return true;
            }
            return false;
        }
    '''
    
    def generate_removeExisting (MetaReference reference) '''
        protected void removeExisting(final IAddContext context) {
            final IAddConnectionContext addConContext = (IAddConnectionContext) context;
            final «reference.metaClass.itfName» addedDomainObject = («reference.metaClass.itfName») context.getNewObject();
            final Object[] pictogramElements = peService.getLinkedPictogramElements(new EObject[] { addedDomainObject }, getDiagram());
            for (final Object pict : pictogramElements) {
                if( pict instanceof PictogramElement){
                    final PictogramElement p = (PictogramElement)pict;
                    if( "«reference.target.EType.name»".equals(peService.getPropertyValue(p, PROPERTY_REFERENCE))){
                        peService.deletePictogramElement(p) ;
                        setDoneChanges(true);
                    }
                }
            }
        }
    '''
    
    def generate_createArrow (MetaReference reference) '''
        protected Polyline createArrow(final GraphicsAlgorithmContainer gaContainer) {
            final Polyline polyline = gaCreateService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15, -10 });
    //        polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
            polyline.setLineWidth(1);
«««            polyline.setForeground(manageColor(«reference.lineColor»));
            return polyline;
        }
    '''
    
}