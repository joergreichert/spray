package org.eclipselabs.spray.generator.graphiti.util.mm;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.Shape;

@SuppressWarnings("all")
public class DiagramExtensions {
  public Diagram getDiagram(final EObject ctx) {
    Diagram _containerOfType = EcoreUtil2.<Diagram>getContainerOfType(ctx, org.eclipselabs.spray.mm.spray.Diagram.class);
    return _containerOfType;
  }
  
  /**
   * Spray MetaClass can either be represented by a Connection or any other kind of Shape.
   * This method will return those MetaClasses of a Diagram that <i>are <b>not</b></i> represented by a Connection.
   */
  public Iterable<MetaClass> getMetaClassesForShapes(final Diagram diagram) {
    MetaClass[] _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
        public Boolean apply(final MetaClass mc) {
          Shape _representedBy = mc.getRepresentedBy();
          boolean _operator_not = BooleanExtensions.operator_not((_representedBy instanceof Connection));
          return Boolean.valueOf(_operator_not);
        }
      };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
    return _filter;
  }
  
  /**
   * Spray MetaClass can either be represented by a Connection or any other kind of Shape.
   * This method will return those MetaClasses of a Diagram that <i>are</i> represented by a Connection.
   */
  public Iterable<MetaClass> getMetaClassesForConnections(final Diagram diagram) {
    MetaClass[] _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
        public Boolean apply(final MetaClass mc) {
          Shape _representedBy = mc.getRepresentedBy();
          return Boolean.valueOf((_representedBy instanceof Connection));
        }
      };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
    return _filter;
  }
  
  protected Iterable<MetaClass> _getElementsForTemplate(final Diagram diagram, final CreateShapeFeature template) {
    MetaClass[] _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
        public Boolean apply(final MetaClass mc) {
          boolean _operator_and = false;
          Shape _representedBy = mc.getRepresentedBy();
          boolean _operator_not = BooleanExtensions.operator_not((_representedBy instanceof Connection));
          if (!_operator_not) {
            _operator_and = false;
          } else {
            Behavior[] _behaviors = mc.getBehaviors();
            final Function1<Behavior,Boolean> _function = new Function1<Behavior,Boolean>() {
                public Boolean apply(final Behavior b) {
                  return Boolean.valueOf((b instanceof CreateBehavior));
                }
              };
            boolean _exists = IterableExtensions.<Behavior>exists(((Iterable<Behavior>)Conversions.doWrapArray(_behaviors)), _function);
            _operator_and = BooleanExtensions.operator_and(_operator_not, _exists);
          }
          return Boolean.valueOf(_operator_and);
        }
      };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
    return _filter;
  }
  
  protected Iterable<MetaClass> _getElementsForTemplate(final Diagram diagram, final CreateConnectionFeature template) {
    MetaClass[] _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
        public Boolean apply(final MetaClass mc) {
          boolean _operator_and = false;
          Shape _representedBy = mc.getRepresentedBy();
          if (!(_representedBy instanceof Connection)) {
            _operator_and = false;
          } else {
            Behavior[] _behaviors = mc.getBehaviors();
            final Function1<Behavior,Boolean> _function = new Function1<Behavior,Boolean>() {
                public Boolean apply(final Behavior b) {
                  return Boolean.valueOf((b instanceof CreateBehavior));
                }
              };
            boolean _exists = IterableExtensions.<Behavior>exists(((Iterable<Behavior>)Conversions.doWrapArray(_behaviors)), _function);
            _operator_and = BooleanExtensions.operator_and((_representedBy instanceof Connection), _exists);
          }
          return Boolean.valueOf(_operator_and);
        }
      };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
    return _filter;
  }
  
  public Iterable<MetaClass> getElementsForTemplate(final Diagram diagram, final FileGenerator template) {
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
