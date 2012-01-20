package org.eclipselabs.spray.shapes.generator.shapes;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorCalculator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.shapes.Anchor;
import org.eclipselabs.spray.shapes.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.shapes.AnchorManual;
import org.eclipselabs.spray.shapes.shapes.AnchorPosition;
import org.eclipselabs.spray.shapes.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.shapes.AnchorPredefinied;
import org.eclipselabs.spray.shapes.shapes.AnchorPredefiniedEnum;
import org.eclipselabs.spray.shapes.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.shapes.AnchorType;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;

@SuppressWarnings("all")
public class ShapeAnchorGenerator {
  @Inject
  private ShapeSizeCalculator sizeCalculator;
  
  @Inject
  private ShapeAnchorCalculator anchorCalculator;
  
  public CharSequence createAnchorPoints(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      HashMap<String,Integer> _containerSize = this.sizeCalculator.getContainerSize(s);
      HashMap<String,Integer> sizeMap = _containerSize;
      StringConcatenation _builder = new StringConcatenation();
      {
        Anchor _anchor = s.getAnchor();
        boolean _operator_equals = ObjectExtensions.operator_equals(_anchor, null);
        if (_operator_equals) {
          _builder.append("peCreateService.createChopboxAnchor(containerShape);");
          _builder.newLine();
        } else {
          Anchor _anchor_1 = s.getAnchor();
          AnchorType _type = _anchor_1.getType();
          CharSequence _generatorAnchorType = this.generatorAnchorType(_type, sizeMap);
          _builder.append(_generatorAnchorType, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generatorAnchorType(final AnchorPredefinied anchorpredefinied, final HashMap<String,Integer> sizeMap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AnchorPredefiniedEnum _value = anchorpredefinied.getValue();
      boolean _operator_equals = ObjectExtensions.operator_equals(_value, AnchorPredefiniedEnum.CENTER);
      if (_operator_equals) {
        _builder.append("peCreateService.createChopboxAnchor(containerShape);");
        _builder.newLine();
      } else {
        AnchorPredefiniedEnum _value_1 = anchorpredefinied.getValue();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_value_1, AnchorPredefiniedEnum.CORNERS);
        if (_operator_equals_1) {
          _builder.append("for(double aWidth = 0.0; aWidth <= 1.0; aWidth+=0.5) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("for(double aHeigth = 0.0; aHeigth <= 1.0; aHeigth+=0.5) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("//No anchor in center");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("if(aWidth == 0.5 && aHeigth == 0.5 ) {  ");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("} else {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("boxAnchor.setRelativeWidth(aWidth);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("boxAnchor.setRelativeHeight(aHeigth);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("Rectangle rectangle = gaService.createInvisibleRectangle(boxAnchor);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("rectangle.setFilled(true);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("rectangle.setWidth(10);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("rectangle.setHeight(10);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("if(aWidth == 0.0 && aHeigth == 0.0 ) { rectangle.setX(0); rectangle.setY(0); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 0.0 && aHeigth == 0.5 ) { rectangle.setX(0); rectangle.setY(-5); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 0.0 && aHeigth == 1.0 ) { rectangle.setX(0); rectangle.setY(-10); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 0.5 && aHeigth == 0.0 ) { rectangle.setX(-5); rectangle.setY(0); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 0.5 && aHeigth == 1.0 ) { rectangle.setX(-5); rectangle.setY(-10); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 1.0 && aHeigth == 0.0 ) { rectangle.setX(-10); rectangle.setY(0); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 1.0 && aHeigth == 0.5 ) { rectangle.setX(-10); rectangle.setY(-5); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("else if(aWidth == 1.0 && aHeigth == 1.0 ) { rectangle.setX(-10); rectangle.setY(-10); }");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _generatorAnchorType(final AnchorManual manualAnchor, final HashMap<String,Integer> sizeMap) {
    CharSequence _xblockexpression = null;
    {
      int widthA = 6;
      int heightA = 6;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<AnchorPosition> _position = manualAnchor.getPosition();
        for(final AnchorPosition position : _position) {
          AnchorPositionPos _pos = position.getPos();
          CharSequence _generateAnchor = this.generateAnchor(_pos, sizeMap, widthA, heightA);
          _builder.append(_generateAnchor, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateAnchor(final AnchorRelativePosition position, final HashMap<String,Integer> sizeMap, final int widthA, final int heightA) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boxAnchor.setRelativeWidth(");
    double _xoffset = position.getXoffset();
    _builder.append(_xoffset, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("boxAnchor.setRelativeHeight(");
    double _yoffset = position.getYoffset();
    _builder.append(_yoffset, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Rectangle rectangle = gaService.createInvisibleRectangle(boxAnchor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rectangle.setX(");
    Integer _get = sizeMap.get("width");
    String _string = _get.toString();
    int _parseInt = Integer.parseInt(_string);
    double _xoffset_1 = position.getXoffset();
    int _calculateCorrection = this.anchorCalculator.calculateCorrection(_parseInt, widthA, _xoffset_1);
    _builder.append(_calculateCorrection, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rectangle.setY(");
    Integer _get_1 = sizeMap.get("height");
    String _string_1 = _get_1.toString();
    int _parseInt_1 = Integer.parseInt(_string_1);
    double _yoffset_1 = position.getYoffset();
    int _calculateCorrection_1 = this.anchorCalculator.calculateCorrection(_parseInt_1, heightA, _yoffset_1);
    _builder.append(_calculateCorrection_1, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rectangle.setWidth(");
    _builder.append(widthA, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rectangle.setHeight(");
    _builder.append(heightA, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateAnchor(final AnchorFixPointPosition position, final HashMap<String,Integer> sizeMap, final int widthA, final int heightA) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FixPointAnchor fixAnchor = peCreateService.createFixPointAnchor(containerShape);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Point fixAnchorPoint = gaService.createPoint(");
    int _xcor = position.getXcor();
    _builder.append(_xcor, "	");
    _builder.append(", ");
    int _ycor = position.getYcor();
    _builder.append(_ycor, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("fixAnchor.setLocation(fixAnchorPoint);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Rectangle rectangle = gaService.createInvisibleRectangle(fixAnchor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rectangle.setX(");
    int _xcor_1 = position.getXcor();
    Integer _get = sizeMap.get("width");
    String _string = _get.toString();
    int _parseInt = Integer.parseInt(_string);
    int _calculateCorrection = this.anchorCalculator.calculateCorrection(_xcor_1, _parseInt, widthA);
    _builder.append(_calculateCorrection, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rectangle.setY(");
    int _ycor_1 = position.getYcor();
    Integer _get_1 = sizeMap.get("height");
    String _string_1 = _get_1.toString();
    int _parseInt_1 = Integer.parseInt(_string_1);
    int _calculateCorrection_1 = this.anchorCalculator.calculateCorrection(_ycor_1, _parseInt_1, heightA);
    _builder.append(_calculateCorrection_1, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rectangle.setWidth(");
    _builder.append(widthA, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rectangle.setHeight(");
    _builder.append(heightA, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatorAnchorType(final AnchorType manualAnchor, final HashMap<String,Integer> sizeMap) {
    if (manualAnchor instanceof AnchorManual) {
      return _generatorAnchorType((AnchorManual)manualAnchor, sizeMap);
    } else if (manualAnchor instanceof AnchorPredefinied) {
      return _generatorAnchorType((AnchorPredefinied)manualAnchor, sizeMap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(manualAnchor, sizeMap).toString());
    }
  }
  
  public CharSequence generateAnchor(final AnchorPositionPos position, final HashMap<String,Integer> sizeMap, final int widthA, final int heightA) {
    if (position instanceof AnchorFixPointPosition) {
      return _generateAnchor((AnchorFixPointPosition)position, sizeMap, widthA, heightA);
    } else if (position instanceof AnchorRelativePosition) {
      return _generateAnchor((AnchorRelativePosition)position, sizeMap, widthA, heightA);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(position, sizeMap, widthA, heightA).toString());
    }
  }
}
