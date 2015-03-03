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
package org.eclipselabs.spray.generator.graphiti.templates.diagram;

import com.google.common.base.Objects;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ImageProvider extends FileGenerator<Diagram> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Override
  public CharSequence generateBaseFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("//    /**");
    _builder.newLine();
    _builder.append("//     * The image identifier for ...");
    _builder.newLine();
    _builder.append("//     */");
    _builder.newLine();
    _builder.append("//    public static final String ");
    String _name = diagram.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("__MYIMAGEID     = PREFIX + \"MYIMAGEID\";");
    _builder.newLineIfNotEmpty();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//    /**");
    _builder.newLine();
    _builder.append("//     * {@inheritDoc}");
    _builder.newLine();
    _builder.append("//     */");
    _builder.newLine();
    _builder.append("//    @Override");
    _builder.newLine();
    _builder.append("//    protected void addAvailableImages() {");
    _builder.newLine();
    _builder.append("//        super.addAvailableImages();");
    _builder.newLine();
    _builder.append("//        // register the path for each image identifier");
    _builder.newLine();
    _builder.append("//       addImageFilePath(");
    String _name_1 = diagram.getName();
    String _upperCase_1 = _name_1.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("__MYIMAGEID, \"icons/...\");");
    _builder.newLineIfNotEmpty();
    _builder.append("//    }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass m) {
        String _icon = m.getIcon();
        return Boolean.valueOf((!Objects.equal(_icon, null)));
      }
    };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
    final Function1<MetaClass, String> _function_1 = new Function1<MetaClass, String>() {
      @Override
      public String apply(final MetaClass m) {
        return m.getIcon();
      }
    };
    Iterable<String> _map = IterableExtensions.<MetaClass, String>map(_filter, _function_1);
    final Set<String> icons = IterableExtensions.<String>toSet(_map);
    _builder.newLineIfNotEmpty();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.AbstractImageProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractImageProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// The prefix for all identifiers of this image provider");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String PREFIX = \"");
    String _diagram_package_1 = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package_1, "    ");
    _builder.append(".\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(diagram);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final String icon : icons) {
        _builder.append("    ");
        _builder.append("// The image identifier for an EReference.");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public static final String ");
        String _imageIdentifier = this._namingExtensions.getImageIdentifier(diagram, icon);
        _builder.append(_imageIdentifier, "    ");
        _builder.append("  = PREFIX + \"");
        String _imageBaseName = this._namingExtensions.getImageBaseName(icon);
        _builder.append(_imageBaseName, "    ");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected void addAvailableImages() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// register the path for each image identifier");
    _builder.newLine();
    {
      for(final String icon_1 : icons) {
        _builder.append("    ");
        _builder.append("addImageFilePath(");
        String _imageIdentifier_1 = this._namingExtensions.getImageIdentifier(diagram, icon_1);
        _builder.append(_imageIdentifier_1, "    ");
        _builder.append(", \"icons/");
        _builder.append(icon_1, "    ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(diagram);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
