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
package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class PropertySection extends FileGenerator<EAttribute> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  private Diagram diagram;
  
  public Diagram setDiagram(final Diagram d) {
    return this.diagram = d;
  }
  
  @Override
  public CharSequence generateBaseFile(final EAttribute modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final EAttribute modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final EAttribute eAttribute, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _property_package = GeneratorUtil.property_package();
    _builder.append(_property_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final EAttribute eAttribute, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    final EClass eClass = eAttribute.getEContainingClass();
    _builder.newLineIfNotEmpty();
    final String propertyName = eAttribute.getName();
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    EDataType _eAttributeType = eAttribute.getEAttributeType();
    final boolean isEnum = (_eAttributeType instanceof EEnum);
    _builder.newLineIfNotEmpty();
    EDataType _eAttributeType_1 = eAttribute.getEAttributeType();
    String _name = _eAttributeType_1.getName();
    final boolean isBoolean = Objects.equal(_name, "EBoolean");
    _builder.newLineIfNotEmpty();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _property_package = GeneratorUtil.property_package();
    _builder.append(_property_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.transaction.RecordingCommand;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.transaction.TransactionalEditingDomain;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.GFPropertySection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;");
    _builder.newLine();
    _builder.append("import org.eclipse.jface.action.IStatusLineManager;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.SWT;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.custom.CLabel;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.FocusEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.FocusListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.ModifyEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.ModifyListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionAdapter;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FormAttachment;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FormData;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Composite;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.custom.CCombo;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import ");
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(eClass);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      if (isEnum) {
        _builder.append("import ");
        EDataType _eAttributeType_2 = eAttribute.getEAttributeType();
        String _javaInterfaceName_1 = this._namingExtensions.getJavaInterfaceName(_eAttributeType_2);
        _builder.append(_javaInterfaceName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends GFPropertySection implements ITabbedPropertyConstants {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _itfName = this._namingExtensions.getItfName(eClass);
    _builder.append(_itfName, "    ");
    _builder.append(" bc = null;");
    _builder.newLineIfNotEmpty();
    {
      boolean _or = false;
      if (isEnum) {
        _or = true;
      } else {
        _or = isBoolean;
      }
      if (_or) {
        _builder.append("    ");
        _builder.append("protected CCombo ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("protected Text ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(eAttribute);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.createControls(parent, tabbedPropertySheetPage);");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Composite composite = factory.createFlatFormComposite(parent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("FormData data;");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _or_1 = false;
      if (isEnum) {
        _or_1 = true;
      } else {
        _or_1 = isBoolean;
      }
      if (_or_1) {
        _builder.append("    ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget = factory.createCCombo(composite);");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget = factory.createText(composite, \"\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("data = new FormData();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.right = new FormAttachment(100, 0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.top = new FormAttachment(0, VSPACE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(propertyName, "        ");
    _builder.append("Widget.setLayoutData(data);");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("CLabel valueLabel = factory.createCLabel(composite, \"");
    String _firstUpper = StringExtensions.toFirstUpper(propertyName);
    _builder.append(_firstUpper, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("data = new FormData();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.left = new FormAttachment(0, 0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.right = new FormAttachment(");
    _builder.append(propertyName, "        ");
    _builder.append("Widget, -HSPACE);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("data.top = new FormAttachment(");
    _builder.append(propertyName, "        ");
    _builder.append("Widget, 0, SWT.CENTER);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("valueLabel.setLayoutData(data);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    {
      if ((!(isEnum || isBoolean))) {
        CharSequence _overrideHeader_1 = this.overrideHeader();
        _builder.append(_overrideHeader_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("public void refresh() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget.removeModifyListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final PictogramElement pe = getSelectedPictogramElement();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (pe != null) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("final EObject bo = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);");
        _builder.newLine();
        _builder.append("       ");
        _builder.append("// the filter assured, that it is a ");
        String _name_1 = eClass.getName();
        _builder.append(_name_1, "       ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("if (bo == null)");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("bc = (");
        String _itfName_1 = this._namingExtensions.getItfName(eClass);
        _builder.append(_itfName_1, "        ");
        _builder.append(")bo;");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("String value = \"\";");
        _builder.newLine();
        {
          EDataType _eAttributeType_3 = eAttribute.getEAttributeType();
          String _name_2 = _eAttributeType_3.getName();
          boolean _equals = Objects.equal(_name_2, "EString");
          if (_equals) {
            _builder.append("value = bc.get");
            String _firstUpper_1 = StringExtensions.toFirstUpper(propertyName);
            _builder.append(_firstUpper_1, "");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          } else {
            EDataType _eAttributeType_4 = eAttribute.getEAttributeType();
            String _name_3 = _eAttributeType_4.getName();
            boolean _equals_1 = Objects.equal(_name_3, "EInt");
            if (_equals_1) {
              _builder.append("value = Integer.toString( bc.get");
              String _firstUpper_2 = StringExtensions.toFirstUpper(propertyName);
              _builder.append(_firstUpper_2, "");
              _builder.append("() );");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("value = \"unknown\";");
              _builder.newLine();
            }
          }
        }
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.setText(value == null ? \"\" : value);");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.addModifyListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("private ModifyListener nameListener = new ModifyListener() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void modifyText(ModifyEvent arg0) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("TransactionalEditingDomain editingDomain = getDiagramContainer().getDiagramBehavior().getEditingDomain();");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("protected void doExecute() {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("changePropertyValue();");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("});");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("};");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      if ((!(isEnum || isBoolean))) {
        _builder.append("protected void changePropertyValue(){");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("String newValue = ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget.getText();");
        _builder.newLineIfNotEmpty();
        {
          boolean _and = false;
          boolean _isDerived = eAttribute.isDerived();
          boolean _not = (!_isDerived);
          if (!_not) {
            _and = false;
          } else {
            boolean _isChangeable = eAttribute.isChangeable();
            _and = _isChangeable;
          }
          if (_and) {
            {
              EDataType _eAttributeType_5 = eAttribute.getEAttributeType();
              String _name_4 = _eAttributeType_5.getName();
              boolean _equals_2 = Objects.equal(_name_4, "EBoolean");
              if (_equals_2) {
                _builder.append("String oldValue = ( bc.is");
                String _firstUpper_3 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_3, "");
                _builder.append("() ? \"true\" : \"false\" );");
                _builder.newLineIfNotEmpty();
                _builder.append("if( ! newValue.equals(oldValue) ) { ");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("bc.set");
                String _firstUpper_4 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_4, "    ");
                _builder.append("(! bc.is");
                String _firstUpper_5 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_5, "    ");
                _builder.append("() );");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              } else {
                EDataType _eAttributeType_6 = eAttribute.getEAttributeType();
                String _name_5 = _eAttributeType_6.getName();
                boolean _equals_3 = Objects.equal(_name_5, "EString");
                if (_equals_3) {
                  _builder.append("if( ! newValue.equals(bc.get");
                  String _firstUpper_6 = StringExtensions.toFirstUpper(propertyName);
                  _builder.append(_firstUpper_6, "");
                  _builder.append("() ) ) { ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("    ");
                  _builder.append("bc.set");
                  String _firstUpper_7 = StringExtensions.toFirstUpper(propertyName);
                  _builder.append(_firstUpper_7, "    ");
                  _builder.append("(newValue);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  EDataType _eAttributeType_7 = eAttribute.getEAttributeType();
                  String _name_6 = _eAttributeType_7.getName();
                  boolean _equals_4 = Objects.equal(_name_6, "EInt");
                  if (_equals_4) {
                    _builder.append("try {");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("int newIntValue = Integer.parseInt(newValue);");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("bc.set");
                    String _firstUpper_8 = StringExtensions.toFirstUpper(propertyName);
                    _builder.append(_firstUpper_8, "    ");
                    _builder.append("( newIntValue );");
                    _builder.newLineIfNotEmpty();
                    _builder.append("} catch(Exception e) {");
                    _builder.newLine();
                    _builder.append("       ");
                    _builder.append("IStatusLineManager mgr = GraphitiUiInternal.getWorkbenchService().getActiveStatusLineManager();");
                    _builder.newLine();
                    _builder.append("    ");
                    _builder.append("mgr.setErrorMessage(e.getMessage() + \" should be a number\");");
                    _builder.newLine();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      boolean _or_2 = false;
      if (isEnum) {
        _or_2 = true;
      } else {
        _or_2 = isBoolean;
      }
      if (_or_2) {
        _builder.append("    ");
        CharSequence _overrideHeader_2 = this.overrideHeader();
        _builder.append(_overrideHeader_2, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("public void refresh() {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.removeSelectionListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.setItems(getEnumerationFeatureValues());");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.setText(getFeatureAsText());");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.addSelectionListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("* @return An Array of all the String representations of Multiplicity enumeration values");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("protected String[] getEnumerationFeatureValues() {");
        _builder.newLine();
        {
          if (isEnum) {
            _builder.append("    ");
            _builder.append("List<");
            EDataType _eAttributeType_8 = eAttribute.getEAttributeType();
            String _name_7 = _eAttributeType_8.getName();
            _builder.append(_name_7, "    ");
            _builder.append("> values = ");
            EDataType _eAttributeType_9 = eAttribute.getEAttributeType();
            String _name_8 = _eAttributeType_9.getName();
            _builder.append(_name_8, "    ");
            _builder.append(".VALUES;");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("String[] ret = new String[values.size()];");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("for (int i = 0; i < values.size(); i++) {");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("ret[i] = ((");
            EDataType _eAttributeType_10 = eAttribute.getEAttributeType();
            String _name_9 = _eAttributeType_10.getName();
            _builder.append(_name_9, "        ");
            _builder.append(") values.get(i)).getName();");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          } else {
            EDataType _eAttributeType_11 = eAttribute.getEAttributeType();
            String _name_10 = _eAttributeType_11.getName();
            boolean _equals_5 = Objects.equal(_name_10, "EBoolean");
            if (_equals_5) {
              _builder.append("    ");
              _builder.append("String[] ret = new String[] {\"false\", \"true\"};");
              _builder.newLine();
            }
          }
        }
        _builder.append("        ");
        _builder.append("return ret;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("//        value = ( bc.is");
        String _firstUpper_9 = StringExtensions.toFirstUpper(propertyName);
        _builder.append(_firstUpper_9, "");
        _builder.append("() ? \"true\" : \"false\" );");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("* @return The string representation of the current value of \'sourceMultiplicity\' of the selected Association");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("protected String getFeatureAsText() {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("final PictogramElement pe = getSelectedPictogramElement();");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if (pe != null) {");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("final EObject bo = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("// the filter assured, that it is a ");
        String _name_11 = eClass.getName();
        _builder.append(_name_11, "            ");
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.append("if (bo == null) {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("return \"unknown \";");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("bc = (");
        String _itfName_2 = this._namingExtensions.getItfName(eClass);
        _builder.append(_itfName_2, "            ");
        _builder.append(") bo;");
        _builder.newLineIfNotEmpty();
        {
          if (isEnum) {
            _builder.append("    ");
            _builder.append("if( bc.get");
            String _name_12 = eAttribute.getName();
            String _firstUpper_10 = StringExtensions.toFirstUpper(_name_12);
            _builder.append(_firstUpper_10, "    ");
            _builder.append("() == null ){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return \"Null value for ");
            String _name_13 = eAttribute.getName();
            _builder.append(_name_13, "        ");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("return bc.get");
            String _name_14 = eAttribute.getName();
            String _firstUpper_11 = StringExtensions.toFirstUpper(_name_14);
            _builder.append(_firstUpper_11, "    ");
            _builder.append("().getName();");
            _builder.newLineIfNotEmpty();
          } else {
            if (isBoolean) {
              _builder.append("    ");
              _builder.append("   ");
              String _name_15 = eAttribute.getName();
              String _firstUpper_12 = StringExtensions.toFirstUpper(_name_15);
              final String name = ("is" + _firstUpper_12);
              _builder.newLineIfNotEmpty();
              _builder.append("    ");
              _builder.append("return ( bc.");
              _builder.append(name, "    ");
              _builder.append("() ? \"true\" : \"false\" );");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("return \"unknown \";");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("     ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("private SelectionListener nameListener = new SelectionAdapter() {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("public void widgetSelected(SelectionEvent event) {");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("TransactionalEditingDomain editingDomain = getDiagramContainer().getDiagramBehavior().getEditingDomain();");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("protected void doExecute() {");
        _builder.newLine();
        _builder.append("                    ");
        _builder.append("changePropertyValue();");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("});");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("};");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("protected void changePropertyValue(){");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("int index = ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.getSelectionIndex();");
        _builder.newLineIfNotEmpty();
        {
          boolean _and_1 = false;
          boolean _isDerived_1 = eAttribute.isDerived();
          boolean _not_1 = (!_isDerived_1);
          if (!_not_1) {
            _and_1 = false;
          } else {
            boolean _isChangeable_1 = eAttribute.isChangeable();
            _and_1 = _isChangeable_1;
          }
          if (_and_1) {
            {
              if (isEnum) {
                _builder.append("    ");
                EDataType _eAttributeType_12 = eAttribute.getEAttributeType();
                String _name_16 = _eAttributeType_12.getName();
                _builder.append(_name_16, "    ");
                _builder.append(" value = (");
                EDataType _eAttributeType_13 = eAttribute.getEAttributeType();
                String _name_17 = _eAttributeType_13.getName();
                _builder.append(_name_17, "    ");
                _builder.append(") ");
                EDataType _eAttributeType_14 = eAttribute.getEAttributeType();
                String _name_18 = _eAttributeType_14.getName();
                _builder.append(_name_18, "    ");
                _builder.append(".VALUES.get(index);");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("bc.set");
                String _name_19 = eAttribute.getName();
                String _firstUpper_13 = StringExtensions.toFirstUpper(_name_19);
                _builder.append(_firstUpper_13, "    ");
                _builder.append("(value);");
                _builder.newLineIfNotEmpty();
              } else {
                if (isBoolean) {
                  _builder.append("    ");
                  _builder.append("   ");
                  _builder.append("boolean newValue = (index == 0 ? false : true);");
                  _builder.newLine();
                  _builder.append("    ");
                  _builder.append("   ");
                  String _name_20 = eAttribute.getName();
                  String _firstUpper_14 = StringExtensions.toFirstUpper(_name_20);
                  final String name_1 = ("is" + _firstUpper_14);
                  _builder.newLineIfNotEmpty();
                  _builder.append("    ");
                  _builder.append("if( newValue != bc.");
                  _builder.append(name_1, "    ");
                  _builder.append("() ) { ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("    ");
                  _builder.append("    ");
                  _builder.append("bc.set");
                  String _name_21 = eAttribute.getName();
                  String _firstUpper_15 = StringExtensions.toFirstUpper(_name_21);
                  _builder.append(_firstUpper_15, "        ");
                  _builder.append("(newValue );");
                  _builder.newLineIfNotEmpty();
                  _builder.append("    ");
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(eAttribute);
    _builder.append(_generate_additionalMethods, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
