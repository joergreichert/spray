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
package org.eclipselabs.spray.generator.graphiti.util.mm;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CustomFeature;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.xtext.generator.FileGenerator;

@SuppressWarnings("all")
public class DiagramExtensions {
  @Inject
  @Extension
  private MetaClassExtensions _metaClassExtensions;
  
  public Diagram getDiagram(final EObject ctx) {
    return EcoreUtil2.<Diagram>getContainerOfType(ctx, Diagram.class);
  }
  
  /**
   * Spray MetaClass can either be represented by a Connection or any other kind of Shape.
   * This method will return those MetaClasses of a Diagram that <i>are <b>not</b></i> represented by a Connection.
   */
  public Iterable<MetaClass> getMetaClassesForShapes(final Diagram diagram) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass mc) {
        ShapeInSpray _representedBy = mc.getRepresentedBy();
        return Boolean.valueOf((!(_representedBy instanceof ConnectionInSpray)));
      }
    };
    return IterableExtensions.<MetaClass>filter(_metaClasses, _function);
  }
  
  /**
   * Spray MetaClass can either be represented by a Connection or any other kind of Shape.
   * This method will return those MetaClasses of a Diagram that <i>are</i> represented by a Connection.
   */
  public Iterable<MetaClass> getMetaClassesForConnections(final Diagram diagram) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass mc) {
        ShapeInSpray _representedBy = mc.getRepresentedBy();
        return Boolean.valueOf((_representedBy instanceof ConnectionInSpray));
      }
    };
    return IterableExtensions.<MetaClass>filter(_metaClasses, _function);
  }
  
  protected Iterable<MetaClass> _getElementsForTemplate(final Diagram diagram, final CreateShapeFeature template) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass mc) {
        ShapeInSpray _representedBy = mc.getRepresentedBy();
        return Boolean.valueOf((!(_representedBy instanceof ConnectionInSpray)));
      }
    };
    return IterableExtensions.<MetaClass>filter(_metaClasses, _function);
  }
  
  protected Iterable<MetaClass> _getElementsForTemplate(final Diagram diagram, final CreateConnectionFeature template) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass mc) {
        boolean _and = false;
        ShapeInSpray _representedBy = mc.getRepresentedBy();
        if (!(_representedBy instanceof ConnectionInSpray)) {
          _and = false;
        } else {
          EList<Behavior> _behaviors = mc.getBehaviors();
          final Function1<Behavior, Boolean> _function = new Function1<Behavior, Boolean>() {
            @Override
            public Boolean apply(final Behavior b) {
              return Boolean.valueOf((b instanceof CreateBehavior));
            }
          };
          boolean _exists = IterableExtensions.<Behavior>exists(_behaviors, _function);
          _and = _exists;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<MetaClass>filter(_metaClasses, _function);
  }
  
  /**
   * Returns all generateable CustomBehavior instances for the diagram. Not generateable are those that are realized by a concrete JVM type
   */
  public Iterable<CustomBehavior> getBehaviorsForTemplate(final Diagram diagram, final CustomFeature template) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Iterable<Behavior>> _function = new Function1<MetaClass, Iterable<Behavior>>() {
      @Override
      public Iterable<Behavior> apply(final MetaClass mc) {
        return DiagramExtensions.this._metaClassExtensions.getAllBehaviors(mc);
      }
    };
    List<Iterable<Behavior>> _map = ListExtensions.<MetaClass, Iterable<Behavior>>map(_metaClasses, _function);
    Iterable<Behavior> _flatten = Iterables.<Behavior>concat(_map);
    Set<Behavior> _set = IterableExtensions.<Behavior>toSet(_flatten);
    Iterable<CustomBehavior> _filter = Iterables.<CustomBehavior>filter(_set, CustomBehavior.class);
    final Function1<CustomBehavior, Boolean> _function_1 = new Function1<CustomBehavior, Boolean>() {
      @Override
      public Boolean apply(final CustomBehavior b) {
        JvmTypeReference _realizedBy = b.getRealizedBy();
        return Boolean.valueOf(Objects.equal(_realizedBy, null));
      }
    };
    return IterableExtensions.<CustomBehavior>filter(_filter, _function_1);
  }
  
  public Iterable<MetaClass> getElementsForTemplate(final Diagram diagram, final FileGenerator<MetaClass> template) {
    if (template instanceof CreateConnectionFeature) {
      return _getElementsForTemplate(diagram, (CreateConnectionFeature)template);
    } else if (template instanceof CreateShapeFeature) {
      return _getElementsForTemplate(diagram, (CreateShapeFeature)template);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(diagram, template).toString());
    }
  }
}
