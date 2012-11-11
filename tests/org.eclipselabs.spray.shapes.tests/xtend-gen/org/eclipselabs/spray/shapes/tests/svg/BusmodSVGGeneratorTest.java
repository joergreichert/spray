package org.eclipselabs.spray.shapes.tests.svg;

import com.google.inject.Inject;
import java.io.File;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.shapes.ShapeInjectorProvider;
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner2.class)
@InjectWith(value = ShapeInjectorProvider.class)
@SuppressWarnings("all")
public class BusmodSVGGeneratorTest extends XtextTest {
  private ShapeContainer shapeContainer;
  
  @Inject
  private GeneratorSVGDefinition generatorSVGDefinition;
  
  @Before
  public void setUp() {
    String _plus = (this.resourceRoot + "/testcases/svgs/busmod/mydiagram.shape");
    final URI uri = URI.createURI(_plus);
    Class<? extends EObject> _rootObjectType = this.getRootObjectType(uri);
    EObject _loadModel = this.loadModel(this.resourceSet, uri, _rootObjectType);
    this.shapeContainer = ((ShapeContainer) _loadModel);
  }
  
  @Test
  public void testRectangleShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "RectangleShape".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("busmod", "RectangleShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for RectangleShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testClassShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "ClassShape".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("busmod", "ClassShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for ClassShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testTextShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "TextShape".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("busmod", "TextShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for TextShape", _expectedSVGContent, _string);
  }
  
  private String getExpectedSVGContent(final String pathSegment, final String shapeContainerElementName) {
    try {
      String _xblockexpression = null;
      {
        String _plus = ("model//testcases/svgs/" + pathSegment);
        String _plus_1 = (_plus + "/expected/");
        String _plus_2 = (_plus_1 + shapeContainerElementName);
        String _plus_3 = (_plus_2 + ".svg");
        File _file = new File(_plus_3);
        Scanner _scanner = new Scanner(_file);
        final Scanner scanner = _scanner;
        Scanner _useDelimiter = scanner.useDelimiter("\\A");
        final String expectedSVG = _useDelimiter.next();
        scanner.close();
        _xblockexpression = (expectedSVG);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
