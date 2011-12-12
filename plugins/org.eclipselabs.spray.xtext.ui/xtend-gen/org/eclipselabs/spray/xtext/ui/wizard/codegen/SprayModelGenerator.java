package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.PackageHelper;

@SuppressWarnings("all")
public class SprayModelGenerator {
  @Inject
  private PackageHelper _packageHelper;
  
  public void doGenerate(final SprayProjectInfo info, final IFileSystemAccess fsa) {
      String _projectName = info.getProjectName();
      final String project = _projectName;
      String _sprayModelDir = info.getSprayModelDir();
      String _operator_plus = StringExtensions.operator_plus(_sprayModelDir, "/");
      String _diagramTypeName = info.getDiagramTypeName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _diagramTypeName);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".spray");
      String _projectName_1 = info.getProjectName();
      CharSequence _generateModel = this.generateModel(info);
      fsa.generateFile(_operator_plus_2, _projectName_1, _generateModel);
      String _sprayModelDir_1 = info.getSprayModelDir();
      String _operator_plus_3 = StringExtensions.operator_plus(_sprayModelDir_1, "/");
      String _diagramTypeName_1 = info.getDiagramTypeName();
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _diagramTypeName_1);
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, ".properties");
      String _projectName_2 = info.getProjectName();
      CharSequence _generateProperties = this.generateProperties(info);
      fsa.generateFile(_operator_plus_5, _projectName_2, _generateProperties);
  }
  
  public CharSequence generateModel(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Spray diagram definition");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains the definition of a graphical editor using the Spray Language.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* See also \u00AC\u00B4info.getDiagramTypeName\u00AC\u00AA.properties to configure generator properties.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.append("// Add import statements here, e.g.");
    _builder.newLine();
    _builder.append("// import \u00AC\u00B4info.modelTypeName.substring(0, info.modelTypeName.lastIndexOf(\'.\'))\u00AC\u00AA.*");
    _builder.newLine();
    _builder.append("import \u00AC\u00B4getPackage(info.epackageURI, info.modelTypeName)\u00AC\u00AA.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("diagram \u00AC\u00B4info.getDiagramTypeName\u00AC\u00AA for \u00AC\u00B4info.modelTypeName.substring(info.modelTypeName.lastIndexOf(\'.\')+1)\u00AC\u00AA");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Add class mappings here. Refer to EClasses here. Don\'t forget to configure a");
    _builder.newLine();
    _builder.append("// dependency to the plugin defining the EMF metamodel in META-INF/MANIFEST.MF.");
    _builder.newLine();
    _builder.append("// It is required to have a genmodel for the metamodel. If the Ecore model lies in");
    _builder.newLine();
    _builder.append("// a workspace project, this project must have the Xtext nature.");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Example class mapping:");
    _builder.newLine();
    _builder.append("//   class BusinessClass:");
    _builder.newLine();
    _builder.append("//     container  ( fill=dark_green ) ");
    _builder.newLine();
    _builder.append("//     {");
    _builder.newLine();
    _builder.append("//       text ( )  { \"<<\"+eClass.name+\">> \" + name};");
    _builder.newLine();
    _builder.append("//     }");
    _builder.newLine();
    _builder.append("//     behavior {");
    _builder.newLine();
    _builder.append("//       // Enable create feature for this class and add it to the palette \"Shapes\"");
    _builder.newLine();
    _builder.append("//       create into types palette \"Shapes\";");
    _builder.newLine();
    _builder.append("//     }");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateProperties(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("modelFileExtension = \u00AC\u00B4info.modelFileExtension\u00AC\u00AA");
    _builder.newLine();
    _builder.append("pluginId        = \u00AC\u00B4info.projectName\u00AC\u00AA");
    _builder.newLine();
    _builder.append("mainPackage     = \u00AC\u00B4info.getBasePackage\u00AC\u00AA");
    _builder.newLine();
    _builder.append("diagramPackage  = \u00AC\u00B4info.getBasePackage\u00AC\u00AA.\u00AC\u00B4info.diagramPackage\u00AC\u00AA");
    _builder.newLine();
    _builder.append("featurePackage  = \u00AC\u00B4info.getBasePackage\u00AC\u00AA.\u00AC\u00B4info.featurePackage\u00AC\u00AA");
    _builder.newLine();
    _builder.append("propertyPackage = \u00AC\u00B4info.getBasePackage\u00AC\u00AA.\u00AC\u00B4info.propertyPackage\u00AC\u00AA");
    _builder.newLine();
    _builder.append("utilPackage     = org.eclipselabs.spray.runtime.graphiti.containers");
    _builder.newLine();
    _builder.newLine();
    _builder.append("srcManPath      = \u00AC\u00B4info.javaMainSrcDir\u00AC\u00AA");
    _builder.newLine();
    _builder.append("srcGenPath      = \u00AC\u00B4info.javaGenSrcDir\u00AC\u00AA");
    _builder.newLine();
    _builder.append("resourceManPath = \u00AC\u00B4info.resourceManDir\u00AC\u00AA");
    _builder.newLine();
    _builder.append("resourceGenPath = \u00AC\u00B4info.resourceGenDir\u00AC\u00AA");
    _builder.newLine();
    _builder.append("projectPath     = ./\u00AC\u00B4info.projectName\u00AC\u00AA");
    _builder.newLine();
    _builder.append("headerTimestamp = \u00AC\u00B4info.createTimestamp\u00AC\u00AA");
    _builder.newLine();
    return _builder;
  }
}
