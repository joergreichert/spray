package org.eclipselabs.spray.shapes.generator;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition;
import org.eclipselabs.spray.shapes.generator.GeneratorShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;

@SuppressWarnings("all")
public class ShapeGenerator implements IGenerator {
  @Inject
  private GeneratorShapeDefinition shapeGenerator;
  
  @Inject
  private GeneratorConnectionDefinition connectionGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<ShapeDefinition> _filter = IterableExtensions.<ShapeDefinition>filter(_iterable, org.eclipselabs.spray.shapes.shapes.ShapeDefinition.class);
      for (final ShapeDefinition shape : _filter) {
        String _filepath = this.shapeGenerator.filepath(shape);
        CharSequence _compile = this.shapeGenerator.compile(shape);
        fsa.generateFile(_filepath, _compile);
      }
      TreeIterator<EObject> _allContents_1 = resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<ConnectionDefinition> _filter_1 = IterableExtensions.<ConnectionDefinition>filter(_iterable_1, org.eclipselabs.spray.shapes.shapes.ConnectionDefinition.class);
      for (final ConnectionDefinition connection : _filter_1) {
        String _filepath_1 = this.connectionGenerator.filepath(connection);
        CharSequence _compile_1 = this.connectionGenerator.compile(connection);
        fsa.generateFile(_filepath_1, _compile_1);
      }
  }
}
