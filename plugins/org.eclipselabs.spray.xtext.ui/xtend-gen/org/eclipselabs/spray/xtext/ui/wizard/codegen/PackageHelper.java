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
package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class PackageHelper {
  public String getPackage(final String modelURI, final String element) {
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      URI _createURI = URI.createURI(modelURI);
      final Resource resource = rs.createResource(_createURI);
      resource.load(Collections.EMPTY_MAP);
      final int index = element.lastIndexOf(".");
      boolean _and = false;
      if (!(index > 0)) {
        _and = false;
      } else {
        int _length = element.length();
        boolean _lessThan = (index < _length);
        _and = _lessThan;
      }
      if (_and) {
        final String className = element.substring((index + 1));
        EPackage ePackage = null;
        TreeIterator<EObject> _allContents = resource.getAllContents();
        Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
        Iterable<EClass> _filter = Iterables.<EClass>filter(_iterable, EClass.class);
        for (final EClass clazz : _filter) {
          {
            EPackage _xifexpression = null;
            EObject _eContainer = clazz.eContainer();
            boolean _notEquals = (!Objects.equal(_eContainer, null));
            if (_notEquals) {
              EObject _eContainer_1 = clazz.eContainer();
              _xifexpression = ((EPackage) _eContainer_1);
            } else {
              _xifexpression = null;
            }
            ePackage = _xifexpression;
            boolean _and_1 = false;
            boolean _notEquals_1 = (!Objects.equal(ePackage, null));
            if (!_notEquals_1) {
              _and_1 = false;
            } else {
              String _name = clazz.getName();
              boolean _matches = _name.matches(className);
              _and_1 = _matches;
            }
            if (_and_1) {
              return ePackage.getName();
            }
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return element;
  }
}
