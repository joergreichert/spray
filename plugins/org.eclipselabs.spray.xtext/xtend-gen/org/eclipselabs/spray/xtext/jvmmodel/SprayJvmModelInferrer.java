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
package org.eclipselabs.spray.xtext.jvmmodel;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

@SuppressWarnings("all")
public class SprayJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private TypeReferences typeReferences;
  
  @Inject
  @Extension
  private GenModelHelper _genModelHelper;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameConverter converter;
  
  protected void _infer(final MetaClass clazz, final IJvmDeclaredTypeAcceptor acceptor, final boolean prelinkingPhase) {
    boolean _or = false;
    EClass _type = clazz.getType();
    boolean _equals = Objects.equal(_type, null);
    if (_equals) {
      _or = true;
    } else {
      EClass _type_1 = clazz.getType();
      boolean _eIsProxy = _type_1.eIsProxy();
      _or = _eIsProxy;
    }
    if (_or) {
      return;
    }
    try {
      EClass _type_2 = clazz.getType();
      this._genModelHelper.getJavaInterfaceName(_type_2);
    } catch (final Throwable _t) {
      if (_t instanceof IllegalStateException) {
        final IllegalStateException e = (IllegalStateException)_t;
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    EClass _type_3 = clazz.getType();
    final String instanceClassName = this._genModelHelper.getJavaInterfaceName(_type_3);
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(instanceClassName);
    if (_isNullOrEmpty) {
      return;
    }
    final JvmTypeReference eClassJvmType = this.typeReferences.getTypeForName(instanceClassName, clazz, null);
    boolean _or_1 = false;
    boolean _equals_1 = Objects.equal(eClassJvmType, null);
    if (_equals_1) {
      _or_1 = true;
    } else {
      boolean _eIsProxy_1 = eClassJvmType.eIsProxy();
      _or_1 = _eIsProxy_1;
    }
    if (_or_1) {
      return;
    }
    String _xifexpression = null;
    String _alias = clazz.getAlias();
    boolean _equals_2 = Objects.equal(_alias, null);
    if (_equals_2) {
      EClass _type_4 = clazz.getType();
      _xifexpression = _type_4.getName();
    } else {
      _xifexpression = clazz.getAlias();
    }
    final String clazzName = _xifexpression;
    EClass _type_5 = clazz.getType();
    EPackage _ePackage = _type_5.getEPackage();
    String _name = _ePackage.getName();
    String _plus = ("org.eclipselabs.spray." + _name);
    String _plus_1 = (_plus + ".");
    String _plus_2 = (_plus_1 + clazzName);
    QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_2);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(clazz, _qualifiedName);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      final JvmField field = this._jvmTypesBuilder.toField(clazz, "ecoreClass", eClassJvmType);
      EList<JvmMember> _members = it.getMembers();
      this._jvmTypesBuilder.<JvmField>operator_add(_members, field);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmOperation _getter = this._jvmTypesBuilder.toGetter(clazz, "ecoreClass", eClassJvmType);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public void infer(final EObject clazz, final IJvmDeclaredTypeAcceptor acceptor, final boolean prelinkingPhase) {
    if (clazz instanceof MetaClass) {
      _infer((MetaClass)clazz, acceptor, prelinkingPhase);
      return;
    } else if (clazz != null) {
      _infer(clazz, acceptor, prelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(clazz, acceptor, prelinkingPhase).toString());
    }
  }
}
