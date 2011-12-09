package org.eclipselabs.spray.shapes.generator;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipselabs.spray.shapes.generator.ShapeLayoutGenerator;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.Polygon;
import org.eclipselabs.spray.shapes.shapes.Polyline;
import org.eclipselabs.spray.shapes.shapes.Rectangle;
import org.eclipselabs.spray.shapes.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.shapes.Shape;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.Text;

@SuppressWarnings("all")
public class ShapeGenerator implements IGenerator {
  @Inject
  private ShapeLayoutGenerator layoutGen;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<ShapeDefinition> _filter = IterableExtensions.<ShapeDefinition>filter(_allContentsIterable, org.eclipselabs.spray.shapes.shapes.ShapeDefinition.class);
    for (final ShapeDefinition shape : _filter) {
      String _filepath = this.filepath(shape);
      CharSequence _compile = this.compile(shape);
      fsa.generateFile(_filepath, _compile);
    }
  }
  
  private int element_index;
  
  public String filepath(final ShapeDefinition s) {
    String _name = s.getName();
    String _operator_plus = StringExtensions.operator_plus("org/eclipselabs/spray/shapes/", _name);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".java");
    return _operator_plus_1;
  }
  
  public CharSequence compile(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      this.element_index = 0;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _head = this.head(s);
      _builder.append(_head, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _body = this.body(s);
      _builder.append(_body, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
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
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.MultiText;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Ellipse;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Polyline;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Rectangle;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Font;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Orientation;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Style;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.ISprayShape;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(" implements ISprayShape {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ContainerShape getShape(Diagram diagram) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IPeCreateService peCreateService = Graphiti.getPeCreateService();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Creating ContainerShape with given id");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ContainerShape containerShape = peCreateService.createContainerShape(diagram, true);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// General Shape Layout definition");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _generateLayout = this.layoutGen.generateLayout(s);
    _builder.append(_generateLayout, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Creating the different figures");
    _builder.newLine();
    {
      EList<Shape> _shape = s.getShape();
      for(final Shape element : _shape) {
        _builder.append("\t\t");
        CharSequence _createElement = this.createElement(element, "containerShape");
        _builder.append(_createElement, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return containerShape;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Object shapeLayout(final ShapeDefinition s) {
    return null;
  }
  
  protected CharSequence _createElement(final Line line, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = line.getShape();
      String _recursiveCreation = this.recursiveCreation(_shape, attname);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Rectangle rectangle, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Rectangle ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createRectangle(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setWidth(");
      RectangleEllipseLayout _layout = rectangle.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _width = _common.getWidth();
      _builder.append(_width, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setHeight(");
      RectangleEllipseLayout _layout_1 = rectangle.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _heigth = _common_1.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_2 = rectangle.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _xcor = _common_2.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_3 = rectangle.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_4 = rectangle.getLayout();
      CommonLayout _common_4 = _layout_4.getCommon();
      int _width_1 = _common_4.getWidth();
      _builder.append(_width_1, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_5 = rectangle.getLayout();
      CommonLayout _common_5 = _layout_5.getCommon();
      int _heigth_1 = _common_5.getHeigth();
      _builder.append(_heigth_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = rectangle.getShape();
      String _recursiveCreation = this.recursiveCreation(_shape, attname);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Polygon polygon, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Polygon ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolygon(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = polygon.getShape();
      String _recursiveCreation = this.recursiveCreation(_shape, attname);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Polyline polyline, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = polyline.getShape();
      String _recursiveCreation = this.recursiveCreation(_shape, attname);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final RoundedRectangle roundedrectangle, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("RoundedRectangle ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createRoundedRectangle(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setWidth(");
      RoundedRectangleLayout _layout = roundedrectangle.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _width = _common.getWidth();
      _builder.append(_width, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setHeight(");
      RoundedRectangleLayout _layout_1 = roundedrectangle.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _heigth = _common_1.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_2 = roundedrectangle.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _xcor = _common_2.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_3 = roundedrectangle.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_4 = roundedrectangle.getLayout();
      CommonLayout _common_4 = _layout_4.getCommon();
      int _width_1 = _common_4.getWidth();
      _builder.append(_width_1, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_5 = roundedrectangle.getLayout();
      CommonLayout _common_5 = _layout_5.getCommon();
      int _heigth_1 = _common_5.getHeigth();
      _builder.append(_heigth_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = roundedrectangle.getShape();
      String _recursiveCreation = this.recursiveCreation(_shape, attname);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Ellipse ellipse, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Ellipse ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createEllipse(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setWidth(");
      RectangleEllipseLayout _layout = ellipse.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _width = _common.getWidth();
      _builder.append(_width, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setHeight(");
      RectangleEllipseLayout _layout_1 = ellipse.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _heigth = _common_1.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_2 = ellipse.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _xcor = _common_2.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_3 = ellipse.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_4 = ellipse.getLayout();
      CommonLayout _common_4 = _layout_4.getCommon();
      int _width_1 = _common_4.getWidth();
      _builder.append(_width_1, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_5 = ellipse.getLayout();
      CommonLayout _common_5 = _layout_5.getCommon();
      int _heigth_1 = _common_5.getHeigth();
      _builder.append(_heigth_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = ellipse.getShape();
      String _recursiveCreation = this.recursiveCreation(_shape, attname);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Text text, final String parentName) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttname = this.getNextAttname();
      final String attname = _nextAttname;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Text ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createText(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String getNextAttname() {
    String _xblockexpression = null;
    {
      int _operator_plus = IntegerExtensions.operator_plus(this.element_index, 1);
      this.element_index = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("element_", Integer.valueOf(this.element_index));
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  public String recursiveCreation(final EList<Shape> shapeList, final String attname) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder sb = _stringBuilder;
      for (final Shape element : shapeList) {
        CharSequence _createElement = this.createElement(element, attname);
        sb.append(_createElement);
      }
      String _string = sb.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public CharSequence createElement(final Shape ellipse, final String parentName) {
    if (ellipse instanceof Ellipse) {
      return _createElement((Ellipse)ellipse, parentName);
    } else if (ellipse instanceof Line) {
      return _createElement((Line)ellipse, parentName);
    } else if (ellipse instanceof Polygon) {
      return _createElement((Polygon)ellipse, parentName);
    } else if (ellipse instanceof Polyline) {
      return _createElement((Polyline)ellipse, parentName);
    } else if (ellipse instanceof Rectangle) {
      return _createElement((Rectangle)ellipse, parentName);
    } else if (ellipse instanceof RoundedRectangle) {
      return _createElement((RoundedRectangle)ellipse, parentName);
    } else if (ellipse instanceof Text) {
      return _createElement((Text)ellipse, parentName);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ellipse, parentName).toString());
    }
  }
}
