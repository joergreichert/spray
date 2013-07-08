package org.eclipselabs.spray.generator.graphiti.templates.features

import javax.inject.Inject
import org.eclipse.xtext.xbase.XExpression
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.SprayStyleRef
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

class AddConnectionFromDslFeature extends FileGenerator<MetaClass> {
   
    @Inject extension NamingExtensions
    @Inject extension SprayCompiler
    
    SprayStyleRef styleRef = null
    
    def setAttributes(MetaClass metaClass, SprayStyleRef ssr){
       	styleRef = ssr
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
        import org.eclipselabs.spray.runtime.graphiti.rendering.ConnectionRendering;
        «IF styleRef != null »
        import «styleRef.qualifiedName»;
        «ELSE»
        import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
        «ENDIF»
        import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;
        import «connection.connection.qualifiedName»Connection;
        import com.google.common.base.Function;
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
            «generate_additionalMethods(metaClass)»
        }
    '''
    
    def generate_canAdd (MetaClass metaClass) '''
            /**
         * {@inheritDoc}
         * 
         * @return <code>true</code> if given business object is an {@link «metaClass.itfName»} and context is of type {@link IAddConnectionContext}
         */
         @Override
         public boolean canAdd(IAddContext context) {
            if (context instanceof IAddConnectionContext
                && context.getNewObject() instanceof «metaClass.itfName») {
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
            «metaClass.itfName» addedDomainObject = («metaClass.itfName») context.getNewObject();
            «IF metaClass.style != null»
            final ISprayStyle style = new «metaClass.style.qualifiedName»();
            «ELSEIF styleRef != null »
            final ISprayStyle style = new «styleRef.qualifiedName»();
            «ELSE»
            final ISprayStyle style = new org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle();
            «ENDIF»
            ISprayConnection connection = new «connection.connection.simpleName»Connection(getFeatureProvider());
            Connection result = (Connection) connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());
            
            // render the connections between the same Start- and End-Anchor
            ConnectionRendering.startRendering(addConContext.getSourceAnchor(), addConContext.getTargetAnchor());
            
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
    
    def propertyAssignmentFunction(XExpression xexp, String valueName, String returnType, String metaClassName, String metaClassAttribute) '''
    	«returnType» «valueName» = new Function<«metaClassName», «returnType»>() {
    		public «returnType» apply(«metaClassName» modelElement) {
    			«xexp.compileForPropertyAssignement("returnedValue", "modelElement")»
    		}
    	}.apply(«metaClassAttribute»); 
    '''
    
}
