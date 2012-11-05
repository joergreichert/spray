package org.eclipselabs.spray.generator.graphiti.templates.features

import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.mm.spray.ShapeFromDsl

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

class ResizeFeature extends FileGenerator<ShapeFromDsl>{

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
    	import org.eclipselabs.spray.shapes.«container.shape.simpleName»;
    	
    	// MARKER_IMPORT
    	
    	public abstract class «className» extends DefaultResizeShapeFeature {
    	
    		SprayLayoutManager layoutManager; 
            «generate_additionalFields(container)»
    	
    		public «className»(final IFeatureProvider fp) {
    			super(fp);
    			layoutManager =  new «container.shape.simpleName»(fp).getShapeLayout( );
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