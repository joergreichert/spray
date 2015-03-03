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
package org.eclipselabs.spray.shapes.generator.connections;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ConnectionDefinitionGenerator extends FileGenerator<ConnectionDefinition> {
  @Inject
  @Extension
  private GeneratorConnectionDefinition _generatorConnectionDefinition;
  
  @Override
  public String generate(final ConnectionDefinition connectionDefinition, final GenFile genFile) {
    String _xblockexpression = null;
    {
      String _packageName = this._generatorConnectionDefinition.packageName();
      String _gapClassName = this._generatorConnectionDefinition.gapClassName(connectionDefinition);
      ((JavaGenFile) genFile).setPackageAndClass(_packageName, _gapClassName);
      _xblockexpression = super.generate(connectionDefinition, genFile);
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generateBaseFile(final ConnectionDefinition connectionDefinition) {
    return this._generatorConnectionDefinition.compile(connectionDefinition);
  }
  
  @Override
  public CharSequence generateExtensionFile(final ConnectionDefinition connectionDefinition) {
    return this.mainExtensionPointFile(connectionDefinition);
  }
  
  public CharSequence mainExtensionPointFile(final ConnectionDefinition connectionDefinition) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this._generatorConnectionDefinition.packageName();
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
    String _gapClassName = this._generatorConnectionDefinition.gapClassName(connectionDefinition);
    _builder.append(_gapClassName, "");
    _builder.append(" extends ");
    String _className = this._generatorConnectionDefinition.className(connectionDefinition);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _gapClassName_1 = this._generatorConnectionDefinition.gapClassName(connectionDefinition);
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
