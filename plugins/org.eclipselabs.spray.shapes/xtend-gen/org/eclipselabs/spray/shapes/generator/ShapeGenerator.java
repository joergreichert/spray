package org.eclipselabs.spray.shapes.generator;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.generator.ShapeLayoutGenerator;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.Polygon;
import org.eclipselabs.spray.shapes.shapes.Polyline;
import org.eclipselabs.spray.shapes.shapes.Rectangle;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.shapes.Shape;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.Text;

@SuppressWarnings("all")
public class ShapeGenerator implements IGenerator {
  @Inject
  private ShapeLayoutGenerator layoutGen;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<ShapeDefinition> _filter = IterableExtensions.<ShapeDefinition>filter(_iterable, org.eclipselabs.spray.shapes.shapes.ShapeDefinition.class);
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
      _builder.append("\uFFFDs.head\uFFFD");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDs.body\uFFFD");
      _builder.newLine();
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
    _builder.append("public class \uFFFDs.name\uFFFD implements ISprayShape {");
    _builder.newLine();
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
    _builder.append("\uFFFDlayoutGen.generateLayout(s)\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Creating the different figures");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFDFOR element : s.shape\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFDelement.createElement(\"containerShape\")\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
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
      _builder.append("Polyline \uFFFDattname\uFFFD = gaService.createPolyline(\uFFFDparentName\uFFFD);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDline.shape.recursiveCreation(attname)\uFFFD");
      _builder.newLine();
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
      _builder.append("Rectangle \uFFFDattname\uFFFD = gaService.createRectangle(\uFFFDparentName\uFFFD);");
      _builder.newLine();
      _builder.append("\uFFFDattname\uFFFD.setWidth(\uFFFDrectangle.layout.common.width\uFFFD);");
      _builder.newLine();
      _builder.append("\uFFFDattname\uFFFD.setHeight(\uFFFDrectangle.layout.common.heigth\uFFFD);");
      _builder.newLine();
      _builder.append("gaService.setLocationAndSize(\uFFFDattname\uFFFD, \uFFFDrectangle.layout.common.xcor\uFFFD, \uFFFDrectangle.layout.common.ycor\uFFFD, \uFFFDrectangle.layout.common.width\uFFFD, \uFFFDrectangle.layout.common.heigth\uFFFD);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDrectangle.shape.recursiveCreation(attname)\uFFFD");
      _builder.newLine();
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
      _builder.append("Polygon \uFFFDattname\uFFFD = gaService.createPolygon(\uFFFDparentName\uFFFD);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDpolygon.shape.recursiveCreation(attname)\uFFFD");
      _builder.newLine();
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
      _builder.append("Polyline \uFFFDattname\uFFFD = gaService.createPolyline(\uFFFDparentName\uFFFD);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDpolyline.shape.recursiveCreation(attname)\uFFFD");
      _builder.newLine();
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
      _builder.append("RoundedRectangle \uFFFDattname\uFFFD = gaService.createRoundedRectangle(\uFFFDparentName\uFFFD);");
      _builder.newLine();
      _builder.append("\uFFFDattname\uFFFD.setWidth(\uFFFDroundedrectangle.layout.common.width\uFFFD);");
      _builder.newLine();
      _builder.append("\uFFFDattname\uFFFD.setHeight(\uFFFDroundedrectangle.layout.common.heigth\uFFFD);");
      _builder.newLine();
      _builder.append("gaService.setLocationAndSize(\uFFFDattname\uFFFD, \uFFFDroundedrectangle.layout.common.xcor\uFFFD, \uFFFDroundedrectangle.layout.common.ycor\uFFFD, \uFFFDroundedrectangle.layout.common.width\uFFFD, \uFFFDroundedrectangle.layout.common.heigth\uFFFD);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDroundedrectangle.shape.recursiveCreation(attname)\uFFFD");
      _builder.newLine();
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
      _builder.append("Ellipse \uFFFDattname\uFFFD = gaService.createEllipse(\uFFFDparentName\uFFFD);");
      _builder.newLine();
      _builder.append("\uFFFDattname\uFFFD.setWidth(\uFFFDellipse.layout.common.width\uFFFD);");
      _builder.newLine();
      _builder.append("\uFFFDattname\uFFFD.setHeight(\uFFFDellipse.layout.common.heigth\uFFFD);");
      _builder.newLine();
      _builder.append("gaService.setLocationAndSize(\uFFFDattname\uFFFD, \uFFFDellipse.layout.common.xcor\uFFFD, \uFFFDellipse.layout.common.ycor\uFFFD, \uFFFDellipse.layout.common.width\uFFFD, \uFFFDellipse.layout.common.heigth\uFFFD);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\uFFFDellipse.shape.recursiveCreation(attname)\uFFFD");
      _builder.newLine();
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
      _builder.append("Text \uFFFDattname\uFFFD = gaService.createText(\uFFFDparentName\uFFFD);");
      _builder.newLine();
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
