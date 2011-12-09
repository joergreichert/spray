package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;

@SuppressWarnings("all")
public class GuiceModule extends FileGenerator {
  @Inject
  private LayoutExtensions _layoutExtensions;
  
  @Inject
  private NamingExtensions _namingExtensions;
  
  public CharSequence generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public CharSequence generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((Diagram) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("// Add custom bindings here");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// public Class<? extends MyInterface> bindMyInterface () {");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("//   return MyInterfaceImpl.class;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// }");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("//");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// Get instances through the Activator:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// MyInterface instance = Activator.get(MyInterface.class);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.ui.IWorkbench;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.PlatformUI;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.service.AbstractGenericModule;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.IURIEditorOpener;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.resource.IStorage2UriMapper;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.resource.Storage2UriMapperImpl;");
    _builder.newLine();
    _builder.append("import com.google.inject.Binder;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractGenericModule {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public Class<? extends IURIEditorOpener> bindIURIEditorOpener() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return GlobalURIEditorOpener.class;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void configure(Binder binder) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IStorage2UriMapper.class).to(Storage2UriMapperImpl.class);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IWorkbench.class).toInstance(PlatformUI.getWorkbench());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
