/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.shapes.generator.shapes;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.shapes.Anchor;
import org.eclipselabs.spray.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.AnchorManual;
import org.eclipselabs.spray.shapes.AnchorPosition;
import org.eclipselabs.spray.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.AnchorPredefinied;
import org.eclipselabs.spray.shapes.AnchorPredefiniedEnum;
import org.eclipselabs.spray.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.AnchorType;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.generator.util.ShapeAnchorCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;

@SuppressWarnings("all")
public class ShapeAnchorGenerator {
  @Inject
  @Extension
  private ShapeSizeCalculator _shapeSizeCalculator;
  
  @Inject
  @Extension
  private ShapeAnchorCalculator _shapeAnchorCalculator;
  
  public CharSequence createAnchorPoints(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      ShapeSizeWrapper size = this._shapeSizeCalculator.getContainerSize(s);
      StringConcatenation _builder = new StringConcatenation();
      {
        Anchor _anchor = s.getAnchor();
        boolean _equals = Objects.equal(_anchor, null);
        if (_equals) {
          _builder.append("peCreateService.createChopboxAnchor(containerShape);");
          _builder.newLine();
        } else {
          Anchor _anchor_1 = s.getAnchor();
          AnchorType _type = _anchor_1.getType();
          CharSequence _generatorAnchorType = this.generatorAnchorType(_type, size);
          _builder.append(_generatorAnchorType, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generatorAnchorType(final AnchorPredefinied anchorpredefinied, final ShapeSizeWrapper shapeSize) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AnchorPredefiniedEnum _value = anchorpredefinied.getValue();
      boolean _equals = Objects.equal(_value, AnchorPredefiniedEnum.CENTER);
      if (_equals) {
        _builder.append("peCreateService.createChopboxAnchor(containerShape);");
        _builder.newLine();
      } else {
        AnchorPredefiniedEnum _value_1 = anchorpredefinied.getValue();
        boolean _equals_1 = Objects.equal(_value_1, AnchorPredefiniedEnum.CORNERS);
        if (_equals_1) {
          _builder.append("for(double aWidth = 0.0; aWidth <= 1.0; aWidth+=0.5) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("for(double aHeigth = 0.0; aHeigth <= 1.0; aHeigth+=0.5) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("//No anchor in center");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("if(!(aWidth == 0.5 & aHeigth == 0.5)) {");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("int sizeAnchor = 6;");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("boxAnchor.setRelativeWidth(aWidth);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("boxAnchor.setRelativeHeight(aHeigth);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("Ellipse ellipse = gaService.createEllipse(boxAnchor);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("ellipse.setFilled(true);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("ellipse.setLineVisible(false);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("ellipse.setWidth(sizeAnchor);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("ellipse.setHeight(sizeAnchor);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("if(aWidth == 0.0 && aHeigth == 0.0 ) { ellipse.setX(0); ellipse.setY(0); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 0.0 && aHeigth == 0.5 ) { ellipse.setX(0); ellipse.setY(-(sizeAnchor/2)); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 0.0 && aHeigth == 1.0 ) { ellipse.setX(0); ellipse.setY(-sizeAnchor); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 0.5 && aHeigth == 0.0 ) { ellipse.setX(-(sizeAnchor/2)); ellipse.setY(0); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 0.5 && aHeigth == 1.0 ) { ellipse.setX(-(sizeAnchor/2)); ellipse.setY(-sizeAnchor); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 1.0 && aHeigth == 0.0 ) { ellipse.setX(-sizeAnchor); ellipse.setY(0); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 1.0 && aHeigth == 0.5 ) { ellipse.setX(-sizeAnchor); ellipse.setY(-(sizeAnchor/2)); }");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("else if(aWidth == 1.0 && aHeigth == 1.0 ) { ellipse.setX(-sizeAnchor); ellipse.setY(-sizeAnchor); }");
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
  
  protected CharSequence _generatorAnchorType(final AnchorManual manualAnchor, final ShapeSizeWrapper shapeSize) {
    CharSequence _xblockexpression = null;
    {
      int widthA = 6;
      int heightA = 6;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<AnchorPosition> _position = manualAnchor.getPosition();
        for(final AnchorPosition position : _position) {
          AnchorPositionPos _pos = position.getPos();
          CharSequence _generateAnchor = this.generateAnchor(_pos, shapeSize, widthA, heightA);
          _builder.append(_generateAnchor, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateAnchor(final AnchorRelativePosition position, final ShapeSizeWrapper shapeSize, final int widthA, final int heightA) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boxAnchor.setRelativeWidth(");
    double _xoffset = position.getXoffset();
    _builder.append(_xoffset, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("boxAnchor.setRelativeHeight(");
    double _yoffset = position.getYoffset();
    _builder.append(_yoffset, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Ellipse ellipse = gaService.createEllipse(boxAnchor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setFilled(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setLineVisible(false);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setX(");
    int _width = shapeSize.getWidth();
    double _xoffset_1 = position.getXoffset();
    int _calculateCorrection = this._shapeAnchorCalculator.calculateCorrection(_width, widthA, _xoffset_1);
    _builder.append(_calculateCorrection, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ellipse.setY(");
    int _heigth = shapeSize.getHeigth();
    double _yoffset_1 = position.getYoffset();
    int _calculateCorrection_1 = this._shapeAnchorCalculator.calculateCorrection(_heigth, heightA, _yoffset_1);
    _builder.append(_calculateCorrection_1, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ellipse.setWidth(");
    _builder.append(widthA, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ellipse.setHeight(");
    _builder.append(heightA, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateAnchor(final AnchorFixPointPosition position, final ShapeSizeWrapper shapeSize, final int widthA, final int heightA) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FixPointAnchor fixAnchor = peCreateService.createFixPointAnchor(containerShape);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Point fixAnchorPoint = gaService.createPoint(");
    int _xcor = position.getXcor();
    _builder.append(_xcor, "\t");
    _builder.append(", ");
    int _ycor = position.getYcor();
    _builder.append(_ycor, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("fixAnchor.setLocation(fixAnchorPoint);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Ellipse ellipse = gaService.createEllipse(fixAnchor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setFilled(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setLineVisible(false);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ellipse.setX(");
    int _xcor_1 = position.getXcor();
    int _width = shapeSize.getWidth();
    int _calculateCorrection = this._shapeAnchorCalculator.calculateCorrection(_xcor_1, _width, widthA);
    _builder.append(_calculateCorrection, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ellipse.setY(");
    int _ycor_1 = position.getYcor();
    int _heigth = shapeSize.getHeigth();
    int _calculateCorrection_1 = this._shapeAnchorCalculator.calculateCorrection(_ycor_1, _heigth, heightA);
    _builder.append(_calculateCorrection_1, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ellipse.setWidth(");
    _builder.append(widthA, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ellipse.setHeight(");
    _builder.append(heightA, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatorAnchorType(final AnchorType manualAnchor, final ShapeSizeWrapper shapeSize) {
    if (manualAnchor instanceof AnchorManual) {
      return _generatorAnchorType((AnchorManual)manualAnchor, shapeSize);
    } else if (manualAnchor instanceof AnchorPredefinied) {
      return _generatorAnchorType((AnchorPredefinied)manualAnchor, shapeSize);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(manualAnchor, shapeSize).toString());
    }
  }
  
  public CharSequence generateAnchor(final AnchorPositionPos position, final ShapeSizeWrapper shapeSize, final int widthA, final int heightA) {
    if (position instanceof AnchorFixPointPosition) {
      return _generateAnchor((AnchorFixPointPosition)position, shapeSize, widthA, heightA);
    } else if (position instanceof AnchorRelativePosition) {
      return _generateAnchor((AnchorRelativePosition)position, shapeSize, widthA, heightA);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(position, shapeSize, widthA, heightA).toString());
    }
  }
}
