package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;

@SuppressWarnings("all")
public class PackageHelper {
  public String getPackage(final String modelURI, final String element) {
      try {
        {
          ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
          final ResourceSetImpl rs = _resourceSetImpl;
          URI _createURI = URI.createURI(modelURI);
          Resource _createResource = rs.createResource(_createURI);
          final Resource resource = _createResource;
          resource.load(Collections.EMPTY_MAP);
          int _lastIndexOf = element.lastIndexOf(".");
          final int index = _lastIndexOf;
          String foundPackageName = null;
          boolean _operator_and = false;
          boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)index), ((Integer)0));
          if (!_operator_greaterThan) {
            _operator_and = false;
          } else {
            int _length = element.length();
            boolean _operator_lessThan = ComparableExtensions.<Integer>operator_lessThan(((Integer)index), ((Integer)_length));
            _operator_and = BooleanExtensions.operator_and(_operator_greaterThan, _operator_lessThan);
          }
          if (_operator_and) {
            {
              String _substring = element.substring(0, index);
              final String packageName = _substring;
              int _operator_plus = IntegerExtensions.operator_plus(((Integer)index), ((Integer)1));
              String _substring_1 = element.substring(_operator_plus);
              final String className = _substring_1;
              EPackage ePackage = null;
              Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
              Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_allContentsIterable, org.eclipse.emf.ecore.EClass.class);
              for (final EClass clazz : _filter) {
                {
                  EPackage _xifexpression = null;
                  EObject _eContainer = clazz.eContainer();
                  boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_eContainer, null);
                  if (_operator_notEquals) {
                    EObject _eContainer_1 = clazz.eContainer();
                    _xifexpression = ((EPackage) _eContainer_1);
                  } else {
                    _xifexpression = null;
                  }
                  ePackage = _xifexpression;
                  boolean _operator_and_1 = false;
                  boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(ePackage, null);
                  if (!_operator_notEquals_1) {
                    _operator_and_1 = false;
                  } else {
                    String _name = clazz.getName();
                    boolean _matches = _name.matches(className);
                    _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_1, _matches);
                  }
                  if (_operator_and_1) {
                    String _name_1 = ePackage.getName();
                    return _name_1;
                  }
                }
              }
            }
          }
        }
      } catch (final Exception e) {
        e.printStackTrace();
      }
      return element;
  }
}
