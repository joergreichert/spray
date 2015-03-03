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

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition;
import org.eclipselabs.spray.shapes.generator.ImageConstants;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionDefinitionGenerator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeDefinitionGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ShapeGenerator implements IGenerator {
  @Inject
  private Provider<JavaGenFile> genFileProvider;
  
  @Inject
  private ShapeDefinitionGenerator shapeDefinition;
  
  @Inject
  private ConnectionDefinitionGenerator connectionDefinition;
  
  @Inject
  private GeneratorSVGDefinition svgDefinition;
  
  private static Log LOGGER = LogFactory.getLog("ShapeGenerator");
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      URI _uRI = resource.getURI();
      String _lastSegment = _uRI.lastSegment();
      boolean _endsWith = _lastSegment.endsWith(ProjectProperties.SHAPES_FILE_EXTENSION);
      boolean _not = (!_endsWith);
      if (_not) {
        URI _uRI_1 = resource.getURI();
        String _plus = ("Shape generator is NOT producing Graphiti code for model " + _uRI_1);
        ShapeGenerator.LOGGER.info(_plus);
        return;
      }
      URI _uRI_2 = resource.getURI();
      String _plus_1 = ("Shape generator is producing Graphiti code for model " + _uRI_2);
      ShapeGenerator.LOGGER.info(_plus_1);
      URI _uRI_3 = resource.getURI();
      ProjectProperties.setModelUri(_uRI_3);
      boolean _isLoaded = resource.isLoaded();
      boolean _not_1 = (!_isLoaded);
      if (_not_1) {
        resource.load(null);
      }
      final JavaGenFile java = this.genFileProvider.get();
      java.setAccess(fsa);
      final String svgOutputConfName = "svgOutputConf";
      this.addSVGOutputConfiguration(fsa, svgOutputConfName);
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<ShapeContainerElement> _filter = Iterables.<ShapeContainerElement>filter(_iterable, ShapeContainerElement.class);
      for (final ShapeContainerElement shapeContainerElement : _filter) {
        this.generateJava(java, shapeContainerElement);
      }
      TreeIterator<EObject> _allContents_1 = resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<ShapeContainerElement> _filter_1 = Iterables.<ShapeContainerElement>filter(_iterable_1, ShapeContainerElement.class);
      for (final ShapeContainerElement shapeContainerElement_1 : _filter_1) {
        {
          final CharSequence svgContent = this.svgDefinition.compile(shapeContainerElement_1);
          String _filepath = this.svgDefinition.filepath(shapeContainerElement_1);
          fsa.generateFile(_filepath, svgOutputConfName, svgContent);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _generateJava(final JavaGenFile java, final ShapeDefinition shape) {
    String _xblockexpression = null;
    {
      java.hasExtensionPoint = true;
      _xblockexpression = this.shapeDefinition.generate(shape, java);
    }
    return _xblockexpression;
  }
  
  protected String _generateJava(final JavaGenFile java, final ConnectionDefinition connection) {
    String _xblockexpression = null;
    {
      java.hasExtensionPoint = true;
      _xblockexpression = this.connectionDefinition.generate(connection, java);
    }
    return _xblockexpression;
  }
  
  private void addSVGOutputConfiguration(final IFileSystemAccess fsa, final String svgOutputConfName) {
    this.addImageOutputConfiguration(fsa, svgOutputConfName, ImageConstants.SVG_PATH);
  }
  
  private void addImageOutputConfiguration(final IFileSystemAccess fsa, final String outputConfName, final String path) {
    if ((fsa instanceof AbstractFileSystemAccess)) {
      Map<String, OutputConfiguration> _outputConfigurations = ((AbstractFileSystemAccess)fsa).getOutputConfigurations();
      boolean _containsKey = _outputConfigurations.containsKey(outputConfName);
      boolean _not = (!_containsKey);
      if (_not) {
        final HashMap<String, OutputConfiguration> outputConfigurations = CollectionLiterals.<String, OutputConfiguration>newHashMap();
        Map<String, OutputConfiguration> _outputConfigurations_1 = ((AbstractFileSystemAccess)fsa).getOutputConfigurations();
        outputConfigurations.putAll(_outputConfigurations_1);
        final OutputConfiguration imageOutputConfiguration = new OutputConfiguration(outputConfName);
        imageOutputConfiguration.setOutputDirectory(path);
        imageOutputConfiguration.setCreateOutputDirectory(true);
        imageOutputConfiguration.setOverrideExistingResources(true);
        imageOutputConfiguration.setSetDerivedProperty(true);
        outputConfigurations.put(outputConfName, imageOutputConfiguration);
        ((AbstractFileSystemAccess)fsa).setOutputConfigurations(outputConfigurations);
      }
    }
  }
  
  public String generateJava(final JavaGenFile java, final ShapeContainerElement connection) {
    if (connection instanceof ConnectionDefinition) {
      return _generateJava(java, (ConnectionDefinition)connection);
    } else if (connection instanceof ShapeDefinition) {
      return _generateJava(java, (ShapeDefinition)connection);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(java, connection).toString());
    }
  }
}
