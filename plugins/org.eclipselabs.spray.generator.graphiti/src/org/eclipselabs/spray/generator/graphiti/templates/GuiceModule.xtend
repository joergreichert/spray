package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram


class GuiceModule extends FileGenerator {
    @Inject extension LayoutExtensions
    @Inject extension NamingExtensions
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «javaGenFile.packageName»;
        
        public class «className» extends «className»Base {
             // Add custom bindings here
             // public Class<? extends MyInterface> bindMyInterface () {
             //   return MyInterfaceImpl.class;
             // }
             //
             // Get instances through the Activator:
             // MyInterface instance = Activator.get(MyInterface.class);
        }
    '''
    
    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «javaGenFile.packageName»;

        import org.eclipse.ui.IWorkbench;
        import org.eclipse.ui.PlatformUI;
        import org.eclipse.xtext.service.AbstractGenericModule;
        import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;
        import org.eclipse.xtext.ui.editor.IURIEditorOpener;
        import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
        import org.eclipse.xtext.ui.resource.Storage2UriMapperImpl;
        import com.google.inject.Binder;
        
        public class «className» extends AbstractGenericModule {
            public Class<? extends IURIEditorOpener> bindIURIEditorOpener() {
                return GlobalURIEditorOpener.class;
            }

            @Override
            public void configure(Binder binder) {
                binder.bind(IStorage2UriMapper.class).to(Storage2UriMapperImpl.class);
                binder.bind(IWorkbench.class).toInstance(PlatformUI.getWorkbench());
            }
        }
   '''
}