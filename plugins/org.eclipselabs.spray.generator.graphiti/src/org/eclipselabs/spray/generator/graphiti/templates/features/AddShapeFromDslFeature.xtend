package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.graphiti.util.IColorConstant
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayElementNameProvider
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.mm.spray.SprayElement
import org.eclipselabs.spray.shapes.shapes.Shape

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


//class AddShapeFromDslFeature extends FileGenerator<Shape>  {
class AddShapeFromDslFeature extends FileGenerator<ShapeFromDsl>  {
    @Inject extension LayoutExtensions
    @Inject extension IQualifiedNameProvider
    @Inject extension NamingExtensions
    @Inject extension SprayElementNameProvider
    @Inject extension DiagramExtensions
    
    MetaClass metaClass = null
    
    def setMetaClass(MetaClass cls){
    	metaClass = cls
    }
    
    override CharSequence generateBaseFile(ShapeFromDsl modelElement) {
        mainFile( modelElement as ShapeFromDsl, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ShapeFromDsl modelElement) {
        mainExtensionPointFile( modelElement as ShapeFromDsl, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ShapeFromDsl container, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(ShapeFromDsl container, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import «metaClass.javaInterfaceName»;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddContext;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
        import org.eclipselabs.spray.shapes.ISprayShape;
        import org.eclipselabs.spray.styles.ISprayStyle;
        import org.eclipselabs.spray.styles.DefaultSprayStyle;

        import org.eclipselabs.spray.shapes.«container.shape.name»;
        // MARKER_IMPORT

        public class «className» extends AbstractAddFeature {
            protected final static String typeOrAliasName = "«metaClass.visibleName»";
            protected Diagram targetDiagram = null;
        
            public «className»(IFeatureProvider fp) {
                super(fp);

            }
        
            «overrideHeader()»
            public boolean canAdd(IAddContext context) {
                final EObject newObject = (EObject) context.getNewObject();
                if (newObject instanceof «metaClass.name») {
                    // check if user wants to add to a diagram
                    if (context.getTargetContainer() instanceof Diagram) {
                        return true;
                    }
                }
                return false;
            }

            «overrideHeader»
            public PictogramElement add(IAddContext context) {
                «metaClass.name» addedModelElement = («metaClass.name») context.getNewObject();
                targetDiagram = peService.getDiagramForShape(context.getTargetContainer());
        
//                Diagram targetDiagram = (Diagram) context.getTargetContainer();
                ISprayStyle style = new DefaultSprayStyle();
                ISprayShape shape = new «container.shape.name»();
                ContainerShape conShape = shape.getShape(targetDiagram, style);
		        IGaService gaService = Graphiti.getGaService();
		        gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());
                link(conShape, addedModelElement);

                setDoneChanges(true);
                
                return conShape;
            }
            
        }
        '''
}