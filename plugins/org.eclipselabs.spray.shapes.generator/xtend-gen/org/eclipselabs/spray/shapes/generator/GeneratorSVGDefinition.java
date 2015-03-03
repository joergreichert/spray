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

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.generator.svg.LayoutExtensions;
import org.eclipselabs.spray.shapes.generator.svg.SVGShapeGenerator;

@SuppressWarnings("all")
public class GeneratorSVGDefinition {
  @Inject
  private SVGShapeGenerator shapeGenerator;
  
  @Inject
  @Extension
  private LayoutExtensions _layoutExtensions;
  
  public String filepath(final ShapeContainerElement s) {
    String _name = s.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + ".svg");
  }
  
  public CharSequence compile(final ShapeContainerElement s) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _head = this.head(s);
    _builder.append(_head, "");
    _builder.newLineIfNotEmpty();
    CharSequence _body = this.body(s);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    CharSequence _tail = this.tail(s);
    _builder.append(_tail, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence head(final ShapeContainerElement s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" standalone=\"no\" ?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 20010904//EN\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd\">");
    _builder.newLine();
    _builder.append("<svg width=\"");
    int _width = this._layoutExtensions.width(s);
    int _plus = (_width + 5);
    _builder.append(_plus, "");
    _builder.append("\" height=\"");
    int _height = this._layoutExtensions.height(s);
    int _plus_1 = (_height + 5);
    _builder.append(_plus_1, "");
    _builder.append("\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<title>Shape: ");
    String _name = s.getName();
    _builder.append(_name, "    ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _metadata = this.metadata(s);
    _builder.append(_metadata, "    ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence tail(final ShapeContainerElement s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</svg>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final ShapeContainerElement s) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generate = this.shapeGenerator.generate(s);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence metadata(final ShapeContainerElement s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<metadata>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("xmlns:dc=\"http://purl.org/dc/elements/1.1/\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<rdf:Description rdf:about=\"http://code.google.com/a/eclipselabs.org/p/spray/\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<dc:creator>");
    Class<? extends GeneratorSVGDefinition> _class = this.getClass();
    String _name = _class.getName();
    _builder.append(_name, "            ");
    _builder.append("</dc:creator>");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("<dc:subject>Spray SVG Shape</dc:subject>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<dc:source>http://code.google.com/a/eclipselabs.org/p/spray/</dc:source>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<dc:format>image/svg+xml</dc:format>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<dc:type>Image</dc:type>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</rdf:Description>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</rdf:RDF>");
    _builder.newLine();
    _builder.append("</metadata>");
    _builder.newLine();
    return _builder;
  }
}
