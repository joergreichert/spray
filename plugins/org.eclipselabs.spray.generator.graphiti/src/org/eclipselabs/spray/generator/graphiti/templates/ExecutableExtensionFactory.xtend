package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*
import static org.eclipselabs.spray.generator.common.templates.TemplateUtil.*
import org.eclipselabs.spray.xtext.generator.FileGenerator

class ExecutableExtensionFactory extends org.eclipselabs.spray.xtext.generator.FileGenerator<Diagram>  {
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
        
            «overrideHeader»
            protected Bundle getBundle() {
                return «diagram.activatorSimpleClassName».getDefault().getBundle();
            }
        
            «overrideHeader»
            protected Injector getInjector() {
                return «diagram.activatorSimpleClassName».getDefault().getInjector();
            }
        
        }

   '''
}
