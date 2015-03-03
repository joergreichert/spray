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
package org.eclipselabs.spray.shapes.generator;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ConnectionStyle;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionEnumGenerator;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionPlacingGenerator;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator;

@SuppressWarnings("all")
public class GeneratorConnectionDefinition {
  @Inject
  @Extension
  private ConnectionStyleGenerator _connectionStyleGenerator;
  
  @Inject
  @Extension
  private ConnectionPlacingGenerator _connectionPlacingGenerator;
  
  @Inject
  @Extension
  private ConnectionEnumGenerator _connectionEnumGenerator;
  
  public String packageName() {
    return ProjectProperties.getShapesPackage();
  }
  
  public String packagePath() {
    String _shapesPackage = ProjectProperties.getShapesPackage();
    return ProjectProperties.toPath(_shapesPackage);
  }
  
  public String filepath(final ConnectionDefinition c) {
    String _packagePath = this.packagePath();
    String _className = this.className(c);
    String _plus = (_packagePath + _className);
    return (_plus + ".java");
  }
  
  public String gapClassName(final ConnectionDefinition c) {
    String _name = c.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Connection");
  }
  
  public String className(final ConnectionDefinition c) {
    String _gapClassName = this.gapClassName(c);
    return (_gapClassName + "Base");
  }
  
  public CharSequence compile(final ConnectionDefinition c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _head = this.head(c);
    _builder.append(_head, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _body = this.body(c);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence head(final ConnectionDefinition c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Shape for Spray");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = this.packageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeCreateService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IColorConstant;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection;");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final ConnectionDefinition c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.className(c);
    _builder.append(_className, "");
    _builder.append(" extends DefaultSprayConnection {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private IPeService peService = Graphiti.getPeService();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private IPeCreateService peCreateService = Graphiti.getPeCreateService();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateTextIdsEnum = this._connectionEnumGenerator.generateTextIdsEnum(c);
    _builder.append(_generateTextIdsEnum, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("public ");
    String _className_1 = this.className(c);
    _builder.append(_className_1, "\t   ");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Connection getConnection(final Diagram diagram, ISprayStyle sprayStyle, final Anchor startAnchor, final Anchor endAnchor) {");
    _builder.newLine();
    {
      ConnectionStyle _connectionStyle = c.getConnectionStyle();
      boolean _equals = Objects.equal(_connectionStyle, null);
      if (_equals) {
        _builder.append("\t\t");
        _builder.append("final Connection connection = peCreateService.createFreeFormConnection(diagram);");
        _builder.newLine();
      } else {
        {
          ConnectionStyle _connectionStyle_1 = c.getConnectionStyle();
          boolean _equals_1 = Objects.equal(_connectionStyle_1, ConnectionStyle.FREEFORM);
          if (_equals_1) {
            _builder.append("\t\t");
            _builder.append("final Connection connection = peCreateService.createFreeFormConnection(diagram);");
            _builder.newLine();
          } else {
            ConnectionStyle _connectionStyle_2 = c.getConnectionStyle();
            boolean _equals_2 = Objects.equal(_connectionStyle_2, ConnectionStyle.MANHATTEN);
            if (_equals_2) {
              _builder.append("\t\t");
              _builder.append("final Connection connection = peCreateService.createManhattanConnection(diagram);");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("connection.setStart(startAnchor);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("connection.setEnd(endAnchor);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    ShapeStyleRef _style = c.getStyle();
    CharSequence _overwriteStyle = null;
    if (_style!=null) {
      _overwriteStyle=this.overwriteStyle(_style, "sprayStyle");
    }
    _builder.append(_overwriteStyle, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final Polyline polyline = gaService.createPolyline(connection);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("polyline.setStyle(sprayStyle.getStyle(diagram));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Define general layout of connection");
    _builder.newLine();
    _builder.append("\t\t");
    ShapestyleLayout _layout = c.getLayout();
    CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection("polyline", _layout);
    _builder.append(_generateStyleForConnection, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Set the Placings of the connection");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _connectionDecoratorMethodName = this._connectionPlacingGenerator.connectionDecoratorMethodName();
    _builder.append(_connectionDecoratorMethodName, "\t\t");
    _builder.append("(diagram, connection, sprayStyle);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return connection;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// START GENERATING CONNECTION DECORATOR METHODS");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateConnectionDecoratorMethods = this._connectionPlacingGenerator.generateConnectionDecoratorMethods(c);
    _builder.append(_generateConnectionDecoratorMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// STOP GENERATING CONNECTION DECORATOR METHODS");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence overwriteStyle(final ShapeStyleRef s, final String styleName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name is undefined for the type GeneratorConnectionDefinition"
      + "\ntoFirstUpper cannot be resolved");
  }
}
