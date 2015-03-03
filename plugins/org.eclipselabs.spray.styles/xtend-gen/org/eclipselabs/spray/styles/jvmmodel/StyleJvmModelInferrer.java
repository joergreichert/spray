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
package org.eclipselabs.spray.styles.jvmmodel;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleContainerElement;

@SuppressWarnings("all")
public class StyleJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private TypeReferences typeReferences;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IJvmTypeProvider.Factory typeProviderFactory;
  
  public void infer(final Style element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    final JvmTypeReference superTypeRef = this.calculateSuperTypeRef(element);
    final IJvmTypeProvider typeProvider = this.typeProviderFactory.createTypeProvider();
    String _packageName = this.getPackageName(element);
    String _plus = (_packageName + ".");
    String _className = this.getClassName(element);
    String _plus_1 = (_plus + _className);
    JvmType existingClass = typeProvider.findTypeByName(_plus_1);
    boolean _equals = Objects.equal(existingClass, null);
    if (_equals) {
      String _packageName_1 = this.getPackageName(element);
      String _plus_2 = (_packageName_1 + ".");
      String _className_1 = this.getClassName(element);
      String _plus_3 = (_plus_2 + _className_1);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus_3);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        @Override
        public void apply(final JvmGenericType it) {
          boolean _notEquals = (!Objects.equal(superTypeRef, null));
          if (_notEquals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _cloneWithProxies = StyleJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(superTypeRef);
            StyleJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
          }
        }
      };
      acceptor.<JvmGenericType>accept(_class, _function);
    } else {
      if ((existingClass instanceof JvmDeclaredType)) {
        this._jvmTypesBuilder.<JvmDeclaredType>associate(element, ((JvmDeclaredType)existingClass));
        acceptor.<JvmDeclaredType>accept(((JvmDeclaredType)existingClass));
      }
    }
  }
  
  public void infer(final Gradient element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    final IJvmTypeProvider typeProvider = this.typeProviderFactory.createTypeProvider();
    String _packageName = this.getPackageName(element);
    String _plus = (_packageName + ".");
    String _className = this.getClassName(element);
    String _plus_1 = (_plus + _className);
    JvmType existingClass = typeProvider.findTypeByName(_plus_1);
    boolean _equals = Objects.equal(existingClass, null);
    if (_equals) {
      String _packageName_1 = this.getPackageName(element);
      String _plus_2 = (_packageName_1 + ".");
      String _className_1 = this.getClassName(element);
      String _plus_3 = (_plus_2 + _className_1);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus_3);
      acceptor.<JvmGenericType>accept(_class);
    } else {
      if ((existingClass instanceof JvmDeclaredType)) {
        this._jvmTypesBuilder.<JvmDeclaredType>associate(element, ((JvmDeclaredType)existingClass));
        acceptor.<JvmDeclaredType>accept(((JvmDeclaredType)existingClass));
      }
    }
  }
  
  protected String _getPackageName(final Style style) {
    return ProjectProperties.getStylesPackage();
  }
  
  protected String _getPackageName(final Gradient gradient) {
    return ProjectProperties.getGradientsPackage();
  }
  
  protected String _getClassName(final Style style) {
    String _name = style.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  protected String _getClassName(final Gradient gradient) {
    String _name = gradient.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  protected JvmTypeReference _calculateSuperTypeRef(final Style style) {
    JvmTypeReference _xblockexpression = null;
    {
      JvmTypeReference varSuperTypeRef = null;
      JvmTypeReference _superStyle = style.getSuperStyle();
      boolean _notEquals = (!Objects.equal(_superStyle, null));
      if (_notEquals) {
        JvmTypeReference _superStyle_1 = style.getSuperStyle();
        JvmTypeReference _cloneWithProxies = this._jvmTypesBuilder.cloneWithProxies(_superStyle_1);
        varSuperTypeRef = _cloneWithProxies;
      } else {
        final JvmType superType = this.typeReferences.findDeclaredType(DefaultSprayStyle.class, style);
        boolean _notEquals_1 = (!Objects.equal(superType, null));
        if (_notEquals_1) {
          JvmParameterizedTypeReference _createTypeRef = this.typeReferences.createTypeRef(superType);
          varSuperTypeRef = _createTypeRef;
        }
      }
      _xblockexpression = varSuperTypeRef;
    }
    return _xblockexpression;
  }
  
  protected JvmTypeReference _calculateSuperTypeRef(final Gradient gradient) {
    JvmTypeReference _xblockexpression = null;
    {
      JvmTypeReference varSuperTypeRef = null;
      final JvmType superType = this.typeReferences.findDeclaredType(ISprayGradient.class, gradient);
      boolean _notEquals = (!Objects.equal(superType, null));
      if (_notEquals) {
        JvmParameterizedTypeReference _createTypeRef = this.typeReferences.createTypeRef(superType);
        varSuperTypeRef = _createTypeRef;
      }
      _xblockexpression = varSuperTypeRef;
    }
    return _xblockexpression;
  }
  
  public String getPackageName(final StyleContainerElement gradient) {
    if (gradient instanceof Gradient) {
      return _getPackageName((Gradient)gradient);
    } else if (gradient instanceof Style) {
      return _getPackageName((Style)gradient);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gradient).toString());
    }
  }
  
  public String getClassName(final StyleContainerElement gradient) {
    if (gradient instanceof Gradient) {
      return _getClassName((Gradient)gradient);
    } else if (gradient instanceof Style) {
      return _getClassName((Style)gradient);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gradient).toString());
    }
  }
  
  public JvmTypeReference calculateSuperTypeRef(final StyleContainerElement gradient) {
    if (gradient instanceof Gradient) {
      return _calculateSuperTypeRef((Gradient)gradient);
    } else if (gradient instanceof Style) {
      return _calculateSuperTypeRef((Style)gradient);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gradient).toString());
    }
  }
}
