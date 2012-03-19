package org.eclipselabs.spray.shapes.generator;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorGenerator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeLayoutGenerator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeGenerator;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;

@SuppressWarnings("all")
public class GeneratorShapeDefinition {
  @Inject
  private ShapeTypeGenerator typeGenerator;
  
  @Inject
  private ShapeLayoutGenerator layoutGenerator;
  
  @Inject
  private ShapeAnchorGenerator anchorGenerator;
  
  public String packageName() {
    return "org.eclipselabs.spray.shapes";
  }
  
  public String packagePath() {
    return "org/eclipselabs/spray/shapes/";
  }
  
  public String filepath(final ShapeDefinition s) {
    String _packagePath = this.packagePath();
    String _className = this.className(s);
    String _operator_plus = StringExtensions.operator_plus(_packagePath, _className);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".java");
    return _operator_plus_1;
  }
  
  public String className(final ShapeDefinition s) {
    String _name = s.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public CharSequence compile(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _head = this.head(s);
    _builder.append(_head, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _body = this.body(s);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence head(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Shape for Spray");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package org.eclipselabs.spray.shapes;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Point;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeCreateService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.ColorConstant;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IColorConstant;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.styles.ISprayStyle;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.className(s);
    _builder.append(_className, "");
    _builder.append(" extends DefaultSprayShape {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private IPeCreateService peCreateService = Graphiti.getPeCreateService();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ContainerShape getShape(Diagram diagram, ISprayStyle sprayStyle) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ContainerShape containerShape = super.getShape(diagram, sprayStyle);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Creating the Anchorpoints");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _createAnchorPoints = this.anchorGenerator.createAnchorPoints(s);
    _builder.append(_createAnchorPoints, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return containerShape;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public GraphicsAlgorithm getShape(Diagram diagram, PictogramElement pictogramElement, ISprayStyle sprayStyle) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Define general layout");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _generateLayout = this.layoutGenerator.generateLayout(s);
    _builder.append(_generateLayout, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Creating the different figures");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _generateCascadedElements = this.typeGenerator.generateCascadedElements(s);
    _builder.append(_generateCascadedElements, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return invisibleRectangle;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<JvmFormalParameter> _param = s.getParam();
      for(final JvmFormalParameter param : _param) {
        _builder.append("\t");
        JvmTypeReference _parameterType = param.getParameterType();
        String _qualifiedName = _parameterType.getQualifiedName();
        _builder.append(_qualifiedName, "	");
        _builder.append(" ");
        String _name = param.getName();
        _builder.append(_name, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        JvmTypeReference _parameterType_1 = param.getParameterType();
        String _qualifiedName_1 = _parameterType_1.getQualifiedName();
        _builder.append(_qualifiedName_1, "	");
        _builder.append(" get");
        String _name_1 = param.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "	");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return this.");
        String _name_2 = param.getName();
        _builder.append(_name_2, "		");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _name_3 = param.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_1, "	");
        _builder.append("(");
        JvmTypeReference _parameterType_2 = param.getParameterType();
        String _qualifiedName_2 = _parameterType_2.getQualifiedName();
        _builder.append(_qualifiedName_2, "	");
        _builder.append(" ");
        String _name_4 = param.getName();
        _builder.append(_name_4, "	");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_5 = param.getName();
        _builder.append(_name_5, "		");
        _builder.append(" = ");
        String _name_6 = param.getName();
        _builder.append(_name_6, "		");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
