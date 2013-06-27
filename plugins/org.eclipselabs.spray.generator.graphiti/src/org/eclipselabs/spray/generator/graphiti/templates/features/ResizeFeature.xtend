package org.eclipselabs.spray.generator.graphiti.templates.features

import javax.inject.Inject
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

class ResizeFeature extends FileGenerator<ShapeFromDsl>{

    @Inject extension NamingExtensions

    override CharSequence generateBaseFile(ShapeFromDsl modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ShapeFromDsl modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
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

    	import org.eclipse.graphiti.features.IFeatureProvider;
    	import org.eclipse.graphiti.features.IResizeConfiguration;
    	import org.eclipse.graphiti.features.context.IResizeShapeContext;
    	import org.eclipse.graphiti.features.DefaultResizeConfiguration;
        import org.eclipselabs.spray.runtime.graphiti.features.DefaultResizeShapeFeature;
    	import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
    	import «ProjectProperties::shapesPackage».«container.shape.simpleName»Shape;
    	
    	// MARKER_IMPORT
    	
    	public abstract class «className» extends DefaultResizeShapeFeature {
    	
    		SprayLayoutManager layoutManager; 
            «generate_additionalFields(container)»
    	
    		public «className»(final IFeatureProvider fp) {
    			super(fp);
    			layoutManager =  new «container.shape.simpleName»Shape(fp).getShapeLayout( );
    		}
    	
            «generate_ResizeConfigurationClass(container)»
            «generate_getResizeConfiguration(container)»
            «generate_additionalMethods(container)»
    	}
        '''
 	
        def generate_ResizeConfigurationClass (ShapeFromDsl container) '''
			public class «"ResizeConfiguration_" + container.shape.simpleName» extends DefaultResizeConfiguration  {

			public boolean isHorizontalResizeAllowed() {
					return layoutManager.isStretchHorizontal( );
			}

			public boolean isVerticalResizeAllowed() {
					return layoutManager.isStretchVertical( );
			}

			}
        '''
        
        def generate_getResizeConfiguration (ShapeFromDsl container) '''
            «overrideHeader»
			public IResizeConfiguration getResizeConfiguration(IResizeShapeContext context) {
				return new «"ResizeConfiguration_" + container.shape.simpleName»( );
			}
        '''
	
}