package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.SprayModelGenerator;

@SuppressWarnings("all")
public class NewProjectGenerator {
  @Inject
  private SprayModelGenerator generateModel;
  
  public void doGenerate(final SprayProjectInfo projectInfo, final IFileSystemAccess fsa) {
      this.generateModel.doGenerate(projectInfo, fsa);
      this.generateBuildProperties(projectInfo, fsa);
  }
  
  public void generateBuildProperties(final SprayProjectInfo pi, final IFileSystemAccess fsa) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source.. = \u00AC\u00B4pi.javaMainSrcDir\u00AC\u00AA/,\\");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("\u00AC\u00B4pi.javaGenSrcDir\u00AC\u00AA/,\\");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("\u00AC\u00B4pi.sprayModelDir\u00AC\u00AA/");
      _builder.newLine();
      _builder.append("bin.includes = META-INF/,\\");
      _builder.newLine();
      _builder.append("               ");
      _builder.append("plugin.xml,\\");
      _builder.newLine();
      _builder.append("               ");
      _builder.append("icons/,\\");
      _builder.newLine();
      _builder.append("               ");
      _builder.append("\u00AC\u00B4pi.sprayModelDir\u00AC\u00AA/");
      _builder.newLine();
      final CharSequence content = _builder;
      String _projectName = pi.getProjectName();
      fsa.generateFile("build.properties", _projectName, content);
  }
}
