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
package org.eclipselabs.spray.styles.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import javax.inject.Inject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.generator.GradientGenerator;
import org.eclipselabs.spray.styles.generator.StyleGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class StylesGenerator extends JvmModelGenerator implements IGenerator {
  @Inject
  private Provider<JavaGenFile> genFileProvider;
  
  @Inject
  @Extension
  private GradientGenerator gradientGenerator;
  
  @Inject
  @Extension
  private StyleGenerator styleGenerator;
  
  private static Log LOGGER = LogFactory.getLog("StyleGenerator");
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    String _lastSegment = _uRI.lastSegment();
    boolean _endsWith = _lastSegment.endsWith(ProjectProperties.STYLES_FILE_EXTENSION);
    boolean _not = (!_endsWith);
    if (_not) {
      URI _uRI_1 = resource.getURI();
      String _plus = ("Style generator is NOT producing Graphiti code for model " + _uRI_1);
      StylesGenerator.LOGGER.info(_plus);
      return;
    }
    URI _uRI_2 = resource.getURI();
    String _plus_1 = ("Style generator is producing Graphiti code for model " + _uRI_2);
    StylesGenerator.LOGGER.info(_plus_1);
    URI _uRI_3 = resource.getURI();
    ProjectProperties.setModelUri(_uRI_3);
    super.doGenerate(resource, fsa);
    final JavaGenFile java = this.genFileProvider.get();
    java.setAccess(fsa);
    this.doGenerateGradient(resource, java);
    this.doGenerateStyle(resource, java);
  }
  
  public void doGenerateStyle(final Resource resource, final JavaGenFile java) {
    try {
      URI _uRI = resource.getURI();
      String _plus = ("Spray: generating style for model " + _uRI);
      StylesGenerator.LOGGER.info(_plus);
      boolean _isLoaded = resource.isLoaded();
      boolean _not = (!_isLoaded);
      if (_not) {
        resource.load(null);
      }
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Style> _filter = Iterables.<Style>filter(_iterable, Style.class);
      for (final Style style : _filter) {
        this.doGenerateStyle(java, style);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doGenerateGradient(final Resource resource, final JavaGenFile java) {
    try {
      URI _uRI = resource.getURI();
      String _plus = ("Spray: generating gradient for model " + _uRI);
      StylesGenerator.LOGGER.info(_plus);
      boolean _isLoaded = resource.isLoaded();
      boolean _not = (!_isLoaded);
      if (_not) {
        resource.load(null);
      }
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Gradient> _filter = Iterables.<Gradient>filter(_iterable, Gradient.class);
      for (final Gradient gradient : _filter) {
        this.doGenerateGradient(java, gradient);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doGenerateGradient(final JavaGenFile java, final Gradient gradient) {
    java.hasExtensionPoint = true;
    this.gradientGenerator.generate(gradient, java);
  }
  
  public void doGenerateStyle(final JavaGenFile java, final Style style) {
    java.hasExtensionPoint = true;
    this.styleGenerator.generate(style, java);
  }
}
