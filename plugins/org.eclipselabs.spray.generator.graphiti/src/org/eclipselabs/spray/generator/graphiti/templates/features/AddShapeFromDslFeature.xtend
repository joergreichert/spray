package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.SprayStyleRef
import org.eclipselabs.spray.mm.spray.CompartmentBehavior
import org.eclipse.emf.ecore.EClass

class AddShapeFromDslFeature extends FileGenerator<ShapeFromDsl> {
	
    @Inject extension NamingExtensions
    
    MetaClass metaClass = null
    SprayStyleRef styleRef = null
    
    
    def setAttributes(MetaClass cls, SprayStyleRef ssr){
        metaClass = cls
        if(metaClass.style != null) {
        	styleRef = metaClass.style
        } else if(ssr != null) {
        	styleRef = ssr
        }
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
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(ShapeFromDsl container, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
        import org.eclipselabs.spray.shapes.ISprayShape;
        import «container.shape.qualifiedName»;
        «IF styleRef != null && styleRef.style != null»
        import «styleRef.style.qualifiedName»;
        «ELSE»
        import org.eclipselabs.spray.styles.DefaultSprayStyle;
        «ENDIF»
        import org.eclipselabs.spray.styles.ISprayStyle;
        
        import «metaClass.javaInterfaceName»;
        // MARKER_IMPORT

        @SuppressWarnings("unused")
        public abstract class «className» extends AbstractAddFeature {
            protected final static String typeOrAliasName = "«metaClass.visibleName»";
            protected Diagram targetDiagram = null;
        
            public «className»(final IFeatureProvider fp) {
                super(fp);

            }
        
            «overrideHeader()»
            public boolean canAdd(final IAddContext context) {
                final EObject newObject = (EObject) context.getNewObject();
                if (newObject instanceof «metaClass.name») {
                    // check if user wants to add to a diagram
                    if (context.getTargetContainer() instanceof Diagram) {
                        return true;
                    } else if (context.getTargetContainer() instanceof ContainerShape) {
                    	final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                    	«FOR behavior: metaClass.behaviors.filter(m | m instanceof CompartmentBehavior)»
                    	«FOR Refcompartment: (behavior as CompartmentBehavior).compartmentReference.filter(m | m.eContainer instanceof EClass)»
                    	if (target instanceof «(Refcompartment.eContainer as EClass).itfName») {
                    		return true;
                    	}
                    	«ENDFOR»
                    	«ENDFOR»
        	}
                }
                return false;
            }

            «overrideHeader»
            public PictogramElement add(final IAddContext context) {
                final «metaClass.name» addedModelElement = («metaClass.name») context.getNewObject();
                //targetDiagram = peService.getDiagramForShape(context.getTargetContainer());
                final ContainerShape targetContainer = context.getTargetContainer();
                «IF styleRef != null && styleRef.style != null»
                final ISprayStyle style = new «styleRef.style.simpleName»();
                «ELSE»
                final ISprayStyle style = new DefaultSprayStyle();
                «ENDIF»
                final ISprayShape shape = new «container.shape.simpleName»(getFeatureProvider());
                final ContainerShape conShape = shape.getShape(targetContainer, style);
                final IGaService gaService = Graphiti.getGaService();
                gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());
                link(conShape, addedModelElement);
                «IF metaClass.alias!=null»
                peService.setPropertyValue(conShape , PROPERTY_ALIAS, "«metaClass.alias»");
                «ENDIF»

                setDoneChanges(true);
                updatePictogramElement(conShape);
                
                return conShape;
            }
            
        }
        '''
}