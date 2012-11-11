package org.eclipselabs.spray.shapes.tests;

import java.io.FileWriter;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.ShapeInjectorProvider;
import org.eclipselabs.spray.shapes.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner2.class)
@InjectWith(value = ShapeInjectorProvider.class)
@SuppressWarnings("all")
public class SVGGeneratorTestGenerator extends XtextTest {
  public void generate() {
    this.generate("bpmn", "bpmn");
    this.generate("busmod", "mydiagram");
    this.generate("lwc2012", "lwc2012");
    this.generate("petrinet", "petrinet");
  }
  
  private void generate(final String segment, final String shapeFileName) {
    try {
      String _firstUpper = StringExtensions.toFirstUpper(segment);
      String _plus = ("src/org/eclipselabs/spray/shapes/tests/svg/" + _firstUpper);
      final String path = (_plus + "SVGGeneratorTest.xtend");
      FileWriter _fileWriter = new FileWriter(path);
      final FileWriter fw = _fileWriter;
      CharSequence _generateTest = this.generateTest(segment, shapeFileName);
      String _string = _generateTest.toString();
      fw.write(_string);
      fw.close();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private CharSequence generateTest(final String segment, final String shapeFileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.eclipselabs.spray.shapes.tests.svg");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.xtext.utils.unittesting.XtextRunner2");
    _builder.newLine();
    _builder.append("import org.junit.runner.RunWith");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.junit4.InjectWith");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.shapes.ShapeInjectorProvider");
    _builder.newLine();
    _builder.append("import org.eclipselabs.xtext.utils.unittesting.XtextTest");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.append("import org.junit.Before");
    _builder.newLine();
    _builder.append("import org.junit.Test");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.shapes.shapes.ShapeContainer");
    _builder.newLine();
    _builder.append("import com.google.inject.Inject");
    _builder.newLine();
    _builder.append("import java.util.Scanner");
    _builder.newLine();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.junit.Assert.*");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RunWith(typeof(XtextRunner2))");
    _builder.newLine();
    _builder.append("@InjectWith(typeof(ShapeInjectorProvider))");
    _builder.newLine();
    _builder.append("class ");
    String _firstUpper = StringExtensions.toFirstUpper(segment);
    _builder.append(_firstUpper, "");
    _builder.append("SVGGeneratorTest extends XtextTest {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private var ShapeContainer shapeContainer");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private GeneratorSVGDefinition generatorSVGDefinition");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Before");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void setUp() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val uri = URI::createURI(resourceRoot + \"/testcases/svgs/");
    _builder.append(segment, "		");
    _builder.append("/");
    _builder.append(shapeFileName, "		");
    _builder.append(".shape\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      ArrayList<CharSequence> _generateTests = this.generateTests(segment, shapeFileName);
      for(final CharSequence method : _generateTests) {
        _builder.append("\t");
        _builder.append(method, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def private getExpectedSVGContent(String pathSegment, ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String shapeContainerElementName) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val scanner = new Scanner(new File(\t\"model//testcases/svgs/\" + ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("pathSegment + \"/expected/\" + shapeContainerElementName + \".svg\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val expectedSVG = scanner.useDelimiter(\"\\\\A\").next();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("scanner.close();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("expectedSVG");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private ArrayList<CharSequence> generateTests(final String pathSegment, final String shapeFileName) {
    ArrayList<CharSequence> _xblockexpression = null;
    {
      String _plus = (this.resourceRoot + "/testcases/svgs/");
      String _plus_1 = (_plus + pathSegment);
      String _plus_2 = (_plus_1 + "/");
      String _plus_3 = (_plus_2 + shapeFileName);
      String _plus_4 = (_plus_3 + ".shape");
      final URI uri = URI.createURI(_plus_4);
      Class<? extends EObject> _rootObjectType = this.getRootObjectType(uri);
      EObject _loadModel = this.loadModel(this.resourceSet, uri, _rootObjectType);
      final ShapeContainer shapeContainer = ((ShapeContainer) _loadModel);
      EList<ShapeContainerElement> _shapeContainerElement = shapeContainer.getShapeContainerElement();
      ArrayList<CharSequence> _generateTestMethods = this.generateTestMethods(pathSegment, shapeFileName, _shapeContainerElement);
      _xblockexpression = (_generateTestMethods);
    }
    return _xblockexpression;
  }
  
  private ArrayList<CharSequence> generateTestMethods(final String pathSegment, final String shapeFileName, final Iterable<? extends ShapeContainerElement> elements) {
    ArrayList<CharSequence> _xblockexpression = null;
    {
      final ArrayList<CharSequence> list = CollectionLiterals.<CharSequence>newArrayList();
      for (final ShapeContainerElement element : elements) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Test");
        _builder.newLine();
        _builder.append("def void test");
        String _name = element.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("val element = shapeContainer.shapeContainerElement.filter(sd|\"");
        String _name_1 = element.getName();
        _builder.append(_name_1, "	");
        _builder.append("\".matches(sd.name)).head");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("assertEquals(\"SVG generated for ");
        String _name_2 = element.getName();
        _builder.append(_name_2, "	");
        _builder.append("\", getExpectedSVGContent(\"");
        _builder.append(pathSegment, "	");
        _builder.append("\", \"");
        String _name_3 = element.getName();
        _builder.append(_name_3, "	");
        _builder.append("\"), generatorSVGDefinition.compile(element).toString)");
        _builder.newLineIfNotEmpty();
        _builder.append("}\t");
        _builder.newLine();
        list.add(_builder);
      }
      _xblockexpression = (list);
    }
    return _xblockexpression;
  }
}
