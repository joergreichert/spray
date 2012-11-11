package org.eclipselabs.spray.shapes.tests;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.shapes.ShapeInjectorProvider;
import org.eclipselabs.spray.shapes.generator.svg.LayoutExtensions;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner2.class)
@InjectWith(value = ShapeInjectorProvider.class)
@SuppressWarnings("all")
public class LayoutExtensionsTest extends XtextTest {
  @Inject
  private LayoutExtensions layoutExtensions;
  
  @Inject
  private ParseHelper parseHelper;
  
  @Test
  public void testGetParentX() {
    try {
      CharSequence _shapeDefinition = this.shapeDefinition();
      EObject _parse = this.parseHelper.parse(_shapeDefinition);
      EList<ShapeContainerElement> _shapeContainerElement = ((ShapeContainer) _parse).getShapeContainerElement();
      final ShapeContainerElement shape = IterableExtensions.<ShapeContainerElement>head(_shapeContainerElement);
      TreeIterator<EObject> _eAllContents = shape.eAllContents();
      Iterator<Ellipse> _filter = Iterators.<Ellipse>filter(_eAllContents, Ellipse.class);
      final Function1<Ellipse,Boolean> _function = new Function1<Ellipse,Boolean>() {
          public Boolean apply(final Ellipse e) {
            RectangleEllipseLayout _layout = e.getLayout();
            CommonLayout _common = _layout.getCommon();
            int _xcor = _common.getXcor();
            boolean _equals = (_xcor == 12);
            return Boolean.valueOf(_equals);
          }
        };
      Iterator<Ellipse> _filter_1 = IteratorExtensions.<Ellipse>filter(_filter, _function);
      final Ellipse outerEllipse = IteratorExtensions.<Ellipse>head(_filter_1);
      TreeIterator<EObject> _eAllContents_1 = shape.eAllContents();
      Iterator<Ellipse> _filter_2 = Iterators.<Ellipse>filter(_eAllContents_1, Ellipse.class);
      final Function1<Ellipse,Boolean> _function_1 = new Function1<Ellipse,Boolean>() {
          public Boolean apply(final Ellipse e) {
            RectangleEllipseLayout _layout = e.getLayout();
            CommonLayout _common = _layout.getCommon();
            int _xcor = _common.getXcor();
            boolean _equals = (_xcor == 2);
            return Boolean.valueOf(_equals);
          }
        };
      Iterator<Ellipse> _filter_3 = IteratorExtensions.<Ellipse>filter(_filter_2, _function_1);
      final Ellipse innerEllipse = IteratorExtensions.<Ellipse>head(_filter_3);
      final int outerEllipseParentX = this.layoutExtensions.parentX(outerEllipse);
      final int outerEllipseParentY = this.layoutExtensions.parentY(outerEllipse);
      final int innerEllipseParentX = this.layoutExtensions.parentX(innerEllipse);
      final int innerEllipseParentY = this.layoutExtensions.parentY(innerEllipse);
      final int outerEllipseX = this.layoutExtensions.x(outerEllipse, true);
      final int outerEllipseY = this.layoutExtensions.y(outerEllipse, true);
      final int innerEllipseX = this.layoutExtensions.x(innerEllipse, true);
      final int innerEllipseY = this.layoutExtensions.y(innerEllipse, true);
      Assert.assertEquals("outer ellipse parent x coord", 0, outerEllipseParentX);
      Assert.assertEquals("outer ellipse parent y coord", 0, outerEllipseParentY);
      Assert.assertEquals("inner ellipse parent x coord", 12, innerEllipseParentX);
      Assert.assertEquals("inner ellipse parent y coord", 12, innerEllipseParentY);
      Assert.assertEquals("inner ellipse x coord", 30, outerEllipseX);
      Assert.assertEquals("inner ellipse y coord", 30, outerEllipseY);
      Assert.assertEquals("inner ellipse x coord", 18, innerEllipseX);
      Assert.assertEquals("inner ellipse y coord", 18, innerEllipseY);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence shapeDefinition() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("shape BPMN_Gateway_Event {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("polygon {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("point (x=0, y=30)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("point (x=30, y=0)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("point (x=60, y=30)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("point (x=30, y=60)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ellipse {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("position (x=12, y=12)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("size (width=37, height=37)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ellipse {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("position (x=2, y=2)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("size (width=33, height=33)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("polyline {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("point (x=16, y=3)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("point (x=28, y=11)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("point (x=24, y=27)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("point (x=8, y=27)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("point (x=4, y=11)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("point (x=16, y=3)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
