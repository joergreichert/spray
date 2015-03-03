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
package org.eclipselabs.spray.xtext.generator;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipselabs.spray.generator.common.templates.TemplateUtil;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;
import org.eclipselabs.spray.xtext.generator.importmanager.ImportUtil;

@SuppressWarnings("all")
public class FileGenerator<T extends Object> extends TemplateUtil {
  @Inject
  private ImportUtil importUtil;
  
  @Extension
  private GenFile genFile;
  
  @Extension
  private JavaGenFile javaGenFile;
  
  private boolean DEBUG = false;
  
  public JavaGenFile getJavaGenFile() {
    return this.javaGenFile;
  }
  
  public CharSequence generateBaseFile(final T modelElement) {
    return null;
  }
  
  public CharSequence generateExtensionFile(final T modelElement) {
    return null;
  }
  
  public String generate(final T modelElement, final GenFile genFile) {
    String _xblockexpression = null;
    {
      this.genFile = genFile;
      if ((genFile instanceof JavaGenFile)) {
        this.javaGenFile = ((JavaGenFile)genFile);
      } else {
        this.javaGenFile = null;
      }
      String fileContent = null;
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this.javaGenFile, null));
      if (_notEquals) {
        final Function1<String, String> _function = new Function1<String, String>() {
          @Override
          public String apply(final String s1) {
            String _printImports = FileGenerator.this.importUtil.printImports();
            return s1.replace("// MARKER_IMPORT", _printImports);
          }
        };
        final Function1<String, String> organizeImports = _function;
        if (this.javaGenFile.hasExtensionPoint) {
          boolean _extensionFileExists = this.javaGenFile.extensionFileExists();
          if (_extensionFileExists) {
            if (this.DEBUG) {
              String _fileName = this.javaGenFile.getFileName();
              String _plus = ("Not regenerating extension point [" + _fileName);
              String _plus_1 = (_plus + "]");
              InputOutput.<String>println(_plus_1);
            }
          } else {
            if (this.DEBUG) {
              String _pathName = this.javaGenFile.getPathName();
              String _plus_2 = ("generating " + _pathName);
              InputOutput.<String>println(_plus_2);
            }
            String _packageName = this.javaGenFile.getPackageName();
            this.importUtil.initImports(_packageName);
            CharSequence _generateExtensionFile = this.generateExtensionFile(modelElement);
            String _string = _generateExtensionFile.toString();
            fileContent = _string;
            String _apply = organizeImports.apply(fileContent);
            fileContent = _apply;
            String _pathName_1 = this.javaGenFile.getPathName();
            this.javaGenFile.generateBaseFile(_pathName_1, fileContent);
          }
          if (this.DEBUG) {
            String _basePathName = this.javaGenFile.getBasePathName();
            String _plus_3 = ("generating 1 " + _basePathName);
            String _plus_4 = (_plus_3 + " from ");
            Class<? extends FileGenerator> _class = this.getClass();
            String _name = _class.getName();
            String _plus_5 = (_plus_4 + _name);
            InputOutput.<String>println(_plus_5);
          }
          String _packageName_1 = this.javaGenFile.getPackageName();
          this.importUtil.initImports(_packageName_1);
          CharSequence _generateBaseFile = this.generateBaseFile(modelElement);
          String _string_1 = _generateBaseFile.toString();
          fileContent = _string_1;
          String _apply_1 = organizeImports.apply(fileContent);
          fileContent = _apply_1;
          String _basePathName_1 = this.javaGenFile.getBasePathName();
          genFile.generateFile(_basePathName_1, fileContent);
        } else {
          if (this.DEBUG) {
            String _pathName_2 = this.javaGenFile.getPathName();
            String _plus_6 = ("generating 2 " + _pathName_2);
            String _plus_7 = (_plus_6 + " from ");
            Class<? extends FileGenerator> _class_1 = this.getClass();
            String _name_1 = _class_1.getName();
            String _plus_8 = (_plus_7 + _name_1);
            InputOutput.<String>println(_plus_8);
          }
          String _packageName_2 = this.javaGenFile.getPackageName();
          this.importUtil.initImports(_packageName_2);
          CharSequence _generateBaseFile_1 = this.generateBaseFile(modelElement);
          String _string_2 = _generateBaseFile_1.toString();
          fileContent = _string_2;
          String _apply_2 = organizeImports.apply(fileContent);
          fileContent = _apply_2;
          String _pathName_3 = this.javaGenFile.getPathName();
          genFile.generateFile(_pathName_3, fileContent);
        }
      } else {
        CharSequence _generateBaseFile_2 = this.generateBaseFile(modelElement);
        String _string_3 = _generateBaseFile_2.toString();
        _xifexpression = fileContent = _string_3;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Call this template as a hook in a (Java) class body were additional fields or constants can be generated.
   */
  public CharSequence generate_additionalFields(final T context) {
    return null;
  }
  
  /**
   * Call this template as a hook in a (Java) class body were additional methods can be generated.
   */
  public CharSequence generate_additionalMethods(final T context) {
    return null;
  }
}
