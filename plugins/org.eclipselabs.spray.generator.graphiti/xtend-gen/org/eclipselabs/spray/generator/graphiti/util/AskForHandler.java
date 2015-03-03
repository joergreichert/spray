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
package org.eclipselabs.spray.generator.graphiti.util;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.MetaClass;

@SuppressWarnings("all")
public class AskForHandler {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  public CharSequence handleAskFor(final MetaClass metaClass, final String instanceName, final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(attribute, null));
      if (_notEquals) {
        _builder.append("// ask user for ");
        String _visibleName = this._namingExtensions.getVisibleName(metaClass);
        _builder.append(_visibleName, "");
        _builder.append(" ");
        String _name = attribute.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
        {
          EClassifier _eType = attribute.getEType();
          String _instanceClassName = ((EDataType) _eType).getInstanceClassName();
          boolean _matches = _instanceClassName.matches("java.lang.String");
          if (_matches) {
            _builder.append("String new");
            String _name_1 = attribute.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_1);
            _builder.append(_firstUpper, "");
            _builder.append(" = SampleUtil.askString(TITLE, USER_QUESTION, \"\", null);");
            _builder.newLineIfNotEmpty();
            _builder.append("if (new");
            String _name_2 = attribute.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
            _builder.append(_firstUpper_1, "");
            _builder.append(" == null || new");
            String _name_3 = attribute.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
            _builder.append(_firstUpper_2, "");
            _builder.append(".trim().length() == 0) {");
            _builder.newLineIfNotEmpty();
            _builder.append("   ");
            _builder.append("return null;");
            _builder.newLine();
            _builder.append("} else {");
            _builder.newLine();
            _builder.append("   ");
            _builder.append(instanceName, "   ");
            _builder.append(".set");
            String _name_4 = attribute.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
            _builder.append(_firstUpper_3, "   ");
            _builder.append("(new");
            String _name_5 = attribute.getName();
            String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
            _builder.append(_firstUpper_4, "   ");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          } else {
            EClassifier _eType_1 = attribute.getEType();
            final String type = ((EDataType) _eType_1).getInstanceClassName();
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            String _xifexpression = null;
            boolean _matches_1 = "double".matches(type);
            if (_matches_1) {
              _xifexpression = "Double";
            } else {
              String _xifexpression_1 = null;
              boolean _matches_2 = "int".matches(type);
              if (_matches_2) {
                _xifexpression_1 = "Integer";
              } else {
                _xifexpression_1 = "Object";
              }
              _xifexpression = _xifexpression_1;
            }
            final String typeName = _xifexpression;
            _builder.newLineIfNotEmpty();
            _builder.append("final ");
            String _shortName = this._namingExtensions.shortName("org.eclipse.jface.dialogs.IInputValidator");
            _builder.append(_shortName, "");
            _builder.append(" validator = new IInputValidator() {");
            _builder.newLineIfNotEmpty();
            _builder.append("   ");
            _builder.append("public String isValid(final String _newText) {");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("String message = null;");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("         ");
            _builder.append(typeName, "         ");
            _builder.append(".valueOf(_newText);");
            _builder.newLineIfNotEmpty();
            _builder.append("      ");
            _builder.append("} catch(Exception nfe) {");
            _builder.newLine();
            _builder.append("         ");
            _builder.append("message = _newText + \" cannot be cast to ");
            _builder.append(typeName, "         ");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("      ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("return message;");
            _builder.newLine();
            _builder.append("   ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("};");
            _builder.newLine();
            _builder.append("final String new");
            String _name_6 = attribute.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_6);
            _builder.append(_firstUpper_5, "");
            _builder.append("String = SampleUtil.askString(TITLE, USER_QUESTION, \"\", validator);");
            _builder.newLineIfNotEmpty();
            _builder.append("final ");
            _builder.append(typeName, "");
            _builder.append(" new");
            String _name_7 = attribute.getName();
            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_7);
            _builder.append(_firstUpper_6, "");
            _builder.append(" = ");
            _builder.append(typeName, "");
            _builder.append(".valueOf(new");
            String _name_8 = attribute.getName();
            String _firstUpper_7 = StringExtensions.toFirstUpper(_name_8);
            _builder.append(_firstUpper_7, "");
            _builder.append("String);    ");
            _builder.newLineIfNotEmpty();
            _builder.append(instanceName, "");
            _builder.append(".set");
            String _name_9 = attribute.getName();
            String _firstUpper_8 = StringExtensions.toFirstUpper(_name_9);
            _builder.append(_firstUpper_8, "");
            _builder.append("(new");
            String _name_10 = attribute.getName();
            String _firstUpper_9 = StringExtensions.toFirstUpper(_name_10);
            _builder.append(_firstUpper_9, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
