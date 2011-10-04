package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class CreateShapeFeature extends FileGenerator {
  
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private NamingExtensions naming;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((MetaClass) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((MetaClass) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    Diagram _diagram = metaClass.getDiagram();
    final Diagram diagram = _diagram;
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICreateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.AbstractCreateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.core.runtime.CoreException;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".SampleUtil;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _javaInterfaceName = this.naming.getJavaInterfaceName(metaClass);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractCreateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final String TITLE = \"Create ");
    String _visibleName = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private static final String USER_QUESTION = \"Enter new ");
    String _visibleName_1 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_1, "    ");
    _builder.append(" name\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public final static String typeOrAliasName = \"");
    String _visibleName_2 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_2, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// set name and description of the creation feature");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp, \"");
    String _visibleName_3 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_3, "        ");
    _builder.append("\", \"Create ");
    String _visibleName_4 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_4, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canCreate(ICreateContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return context.getTargetContainer() instanceof Diagram;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _name = this.e1.getName(metaClass);
    _builder.append(_name, "    ");
    _builder.append(" newClass = null;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Object[] create(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("newClass = create");
    String _visibleName_5 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_5, "        ");
    _builder.append("(context);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (newClass == null ) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return EMPTY;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// do the add");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("addGraphicalRepresentation(context, newClass);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return newly created business object(s)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new Object[] { newClass };");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _name_1 = this.e1.getName(metaClass);
    _builder.append(_name_1, "    ");
    _builder.append(" create");
    String _visibleName_6 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_6, "    ");
    _builder.append("(ICreateContext context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// ask user for ");
    _builder.append(className, "        ");
    _builder.append(" name");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("String newName = SampleUtil.askString(TITLE, USER_QUESTION, \"\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (newName == null || newName.trim().length() == 0) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("// create ");
    String _name_2 = this.e1.getName(metaClass);
    _builder.append(_name_2, "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _name_3 = this.e1.getName(metaClass);
    _builder.append(_name_3, "        ");
    _builder.append(" newClass = ");
    String _eFactoryInterfaceName = this.naming.getEFactoryInterfaceName(metaClass);
    String _shortName = this.shortName(_eFactoryInterfaceName);
    _builder.append(_shortName, "        ");
    _builder.append(".eINSTANCE.create");
    String _name_4 = this.e1.getName(metaClass);
    _builder.append(_name_4, "        ");
    _builder.append("();    ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("newClass.setName(newName);     ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//  default is to add it to a file resource, which is created if it does not exist.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("SampleUtil.saveToModelFile(newClass, getDiagram(), \"");
    String _modelfileExtension = diagram.getModelfileExtension();
    String _lowerCase = _modelfileExtension.toLowerCase();
    _builder.append(_lowerCase, "            ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("} catch (CoreException e) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return newClass;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      String _icon = metaClass.getIcon();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_icon, null);
      if (_operator_notEquals) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public String getCreateImageId() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return ");
        String _imageProviderClassName = this.naming.getImageProviderClassName(diagram);
        String _shortName_1 = this.shortName(_imageProviderClassName);
        _builder.append(_shortName_1, "        ");
        _builder.append(".");
        String _icon_1 = metaClass.getIcon();
        String _imageIdentifier = this.naming.getImageIdentifier(diagram, _icon_1);
        _builder.append(_imageIdentifier, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean hasDoneChanges() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canUndo(IContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}