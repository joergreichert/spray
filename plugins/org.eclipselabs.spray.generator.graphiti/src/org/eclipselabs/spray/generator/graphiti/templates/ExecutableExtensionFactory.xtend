package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class ExecutableExtensionFactory extends FileGenerator<Diagram>  {
    @Inject extension NamingExtensions
    
    override CharSequence generateBaseFile(Diagram modelElement) {
        mainFile( modelElement, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «javaGenFile.packageName»;

        import com.google.inject.Injector;
        import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
        import org.osgi.framework.Bundle;
        import «main_package()».Activator;
        public class «className» extends AbstractGuiceAwareExecutableExtensionFactory {
        
            @Override
            protected Bundle getBundle() {
                return «diagram.activatorSimpleClassName».getDefault().getBundle();
            }
        
            @Override
            protected Injector getInjector() {
                return «diagram.activatorSimpleClassName».getDefault().getInjector();
            }
        
        }

   '''
}