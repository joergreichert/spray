package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions
import org.eclipselabs.spray.mm.spray.MetaReference

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class AddReferenceAsConnectionFeature extends FileGenerator<MetaReference>  {
    @Inject extension NamingExtensions
    @Inject extension LayoutExtensions
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
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        //  /**
        //   * {@inheritDoc}
        //   */
        //  @Override
        //  protected GraphicsAlgorithm createConnectionStartDecorator (IAddConnectionContext context,
        //          Connection connection) {
        //      ConnectionDecorator cd = peCreateService.createConnectionDecorator(
        //              connection, /* active */false, /* location */0.0, /* isRelative */
        //              true);
        //      Polyline polyline = gaService.createPolyline(cd, new int[] {
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
        //  protected GraphicsAlgorithm createConnectionEndDecorator (IAddConnectionContext context,
        //          Connection connection) {
        //      ConnectionDecorator cd = peCreateService.createConnectionDecorator(
        //              connection, /* active */false, /* location */1.0, /* isRelative */
        //              true);
        //      Polygon polygon = gaService.createPolygon(cd, new int[] {
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
        import org.eclipse.graphiti.mm.algorithms.Polyline;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;
        // MARKER_IMPORT
        
        @SuppressWarnings("unused")
        public abstract class «className» extends AbstractAddConnectionFeature {
            «generate_additionalFields(reference)»
            
            public «className»(IFeatureProvider fp) {
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
        public PictogramElement add(IAddContext context) {
            IAddConnectionContext addConContext = (IAddConnectionContext) context;
            «reference.metaClass.type.javaInterfaceName.shortName» addedDomainObject = («reference.metaClass.name») context.getNewObject();
        «IF target.upperBound == 1»
            removeExisting(context);
        «ENDIF»        
          
            // CONNECTION WITH POLYLINE
            Connection connection = peCreateService.createFreeFormConnection(getDiagram());
            connection.setStart(addConContext.getSourceAnchor());
            connection.setEnd(addConContext.getTargetAnchor());
     
            // TRY
            AnchorContainer parent = connection.getStart().getParent();
            Object start = getBusinessObjectForPictogramElement(parent);
            AnchorContainer child = connection.getEnd().getParent();
            Object end = getBusinessObjectForPictogramElement(child);
            //END TRY
    
            Polyline polyline = gaService.createPolyline(connection);
            polyline.setLineWidth(«reference.representedBy.layout.lineWidth»);
            polyline.setForeground(manageColor(«reference.lineColor»));
             
            // create link and wire it
            peService.setPropertyValue(connection, ISprayConstants.PROPERTY_MODEL_TYPE, "«reference.metaClass.name».«target.name»");
            peService.setPropertyValue(connection, ISprayConstants.PROPERTY_REFERENCE, (String)context.getProperty(ISprayConstants.PROPERTY_REFERENCE));
            peService.setPropertyValue(connection, ISprayConstants.PROPERTY_TARGETOBJECT, (String)context.getProperty(ISprayConstants.PROPERTY_TARGETOBJECT));
            link(connection, addedDomainObject);
    
            // add static graphical decorator
            // ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
            //      No arrows
            //        createArrow(cd);
            decorateConnection (addConContext, connection);
            setDoneChanges(true);
            return connection;
        }
    '''
    
    def generate_canAdd (MetaReference reference) '''
        «overrideHeader()»
        public boolean canAdd(IAddContext context) {
            // return true if given business object is an «reference.metaClass.name»
            // note, that the context must be an instance of IAddConnectionContext
            if (context instanceof IAddConnectionContext
                && context.getNewObject() instanceof «reference.metaClass.name») {
                return true;
            }
            return false;
        }
    '''
    
    def generate_removeExisting (MetaReference reference) '''
        protected void removeExisting(IAddContext context) {
            IAddConnectionContext addConContext = (IAddConnectionContext) context;
            «reference.metaClass.name» addedDomainObject = («reference.metaClass.name») context.getNewObject();
            Object[] pictogramElements = peService.getLinkedPictogramElements(new EObject[] { addedDomainObject }, getDiagram());
            for (Object pict : pictogramElements) {
                if( pict instanceof PictogramElement){
                    PictogramElement p = (PictogramElement)pict;
                    String reference = peService.getPropertyValue(p, ISprayConstants.PROPERTY_REFERENCE);
                    if( "«reference.name»".equals(reference)){
                        peService.deletePictogramElement(p) ;
                        setDoneChanges(true);
                    }
                }
            }
        }
    '''
    
    def generate_createArrow (MetaReference reference) '''
        private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
            Polyline polyline = gaCreateService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15, -10 });
    //        polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
            polyline.setLineWidth(«reference.representedBy.layout.lineWidth»);
            polyline.setForeground(manageColor(«reference.lineColor»));
            return polyline;
        }
    '''
    
}