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
package org.eclipselabs.spray.generator.common.templates;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;

@SuppressWarnings("all")
public class TemplateUtil {
  public CharSequence header(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Spray ");
    Class<?> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains generated and should not be changed.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Use the extension point class (the direct subclass of this class) to add manual code");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence extensionHeader(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Spray ");
    Class<?> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file is an extension point: copy to \"src\" folder to manually add code to this");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* extension point.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence pluginHeader(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Spray ");
    Class<?> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("This file will be generated only once if it need to be regenerated, remove this file.");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("-->");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate an Override annotation and Javadoc inheritance
   */
  public CharSequence overrideHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* {@inheritDoc}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addOrSetReference(final EReference ref, final String containerName, final String elementName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isMany = ref.isMany();
      if (_isMany) {
        _builder.append(containerName, "");
        _builder.append(".get");
        String _name = ref.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("().add(");
        _builder.append(elementName, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append(containerName, "");
        _builder.append(".set");
        String _name_1 = ref.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper_1, "");
        _builder.append("(");
        _builder.append(elementName, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
