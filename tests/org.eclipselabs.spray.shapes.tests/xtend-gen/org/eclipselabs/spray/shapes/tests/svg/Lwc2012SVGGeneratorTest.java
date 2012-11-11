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
public class Lwc2012SVGGeneratorTest extends XtextTest {
  private ShapeContainer shapeContainer;
  
  @Inject
  private GeneratorSVGDefinition generatorSVGDefinition;
  
  @Before
  public void setUp() {
    String _plus = (this.resourceRoot + "/testcases/svgs/lwc2012/lwc2012.shape");
    final URI uri = URI.createURI(_plus);
    Class<? extends EObject> _rootObjectType = this.getRootObjectType(uri);
    EObject _loadModel = this.loadModel(this.resourceSet, uri, _rootObjectType);
    this.shapeContainer = ((ShapeContainer) _loadModel);
  }
  
  @Test
  public void testLWC_Vessel_Vertical() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Vessel_Vertical".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Vessel_Vertical");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Vessel_Vertical", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Vessel_Horizontal() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Vessel_Horizontal".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Vessel_Horizontal");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Vessel_Horizontal", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_HeatExchanger() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_HeatExchanger".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_HeatExchanger");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_HeatExchanger", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Valve() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Valve".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Valve");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Valve", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Valve_Manual() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Valve_Manual".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Valve_Manual");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Valve_Manual", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Valve_Control() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Valve_Control".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Valve_Control");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Valve_Control", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Pump() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Pump".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Pump");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Pump", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Pump_Vacuum() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Pump_Vacuum".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Pump_Vacuum");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Pump_Vacuum", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_SystemEnd() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_SystemEnd".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_SystemEnd");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_SystemEnd", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Joint() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Joint".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Joint");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Joint", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Location_NoLine() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Location_NoLine".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Location_NoLine");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Location_NoLine", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Location_SolidLine() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Location_SolidLine".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Location_SolidLine");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Location_SolidLine", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Location_DashedLine() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Location_DashedLine".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Location_DashedLine");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Location_DashedLine", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Pipe() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Pipe".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Pipe");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Pipe", _expectedSVGContent, _string);
  }
  
  @Test
  public void testLWC_Source_Exhaust() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
        public Boolean apply(final ShapeContainerElement sd) {
          String _name = sd.getName();
          boolean _matches = "LWC_Source_Exhaust".matches(_name);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("lwc2012", "LWC_Source_Exhaust");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    Assert.assertEquals("SVG generated for LWC_Source_Exhaust", _expectedSVGContent, _string);
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
