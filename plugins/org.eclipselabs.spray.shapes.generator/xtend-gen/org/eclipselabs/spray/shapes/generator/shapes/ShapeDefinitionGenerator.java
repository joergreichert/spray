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

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.generator.GeneratorShapeDefinition;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ShapeDefinitionGenerator extends FileGenerator<ShapeDefinition> {
  @Inject
  @Extension
  private GeneratorShapeDefinition _generatorShapeDefinition;
  
  @Override
  public String generate(final ShapeDefinition shapeDefinition, final GenFile genFile) {
    String _xblockexpression = null;
    {
      String _packageName = this._generatorShapeDefinition.packageName();
      String _gapClassName = this._generatorShapeDefinition.gapClassName(shapeDefinition);
      ((JavaGenFile) genFile).setPackageAndClass(_packageName, _gapClassName);
      _xblockexpression = super.generate(shapeDefinition, genFile);
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generateBaseFile(final ShapeDefinition shapeDefinition) {
    return this._generatorShapeDefinition.compile(shapeDefinition);
  }
  
  @Override
  public CharSequence generateExtensionFile(final ShapeDefinition shapeDefinition) {
    return this.mainExtensionPointFile(shapeDefinition);
  }
  
  public CharSequence mainExtensionPointFile(final ShapeDefinition shapeDefinition) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this._generatorShapeDefinition.packageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class ");
    String _gapClassName = this._generatorShapeDefinition.gapClassName(shapeDefinition);
    _builder.append(_gapClassName, "");
    _builder.append(" extends ");
    String _className = this._generatorShapeDefinition.className(shapeDefinition);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _gapClassName_1 = this._generatorShapeDefinition.gapClassName(shapeDefinition);
    _builder.append(_gapClassName_1, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
