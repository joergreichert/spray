/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipselabs.spray2.xtext.spray2.Spray2Package;
import org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextPropertyAssignmentImpl extends MinimalEObjectImpl.Container implements TextPropertyAssignment
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected JvmEnumerationLiteral key;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EAttribute attribute;

  /**
   * The cached value of the '{@link #getEditable() <em>Editable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditable()
   * @generated
   * @ordered
   */
  protected XExpression editable;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected XExpression format;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextPropertyAssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Spray2Package.Literals.TEXT_PROPERTY_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral getKey()
  {
    if (key != null && key.eIsProxy())
    {
      InternalEObject oldKey = (InternalEObject)key;
      key = (JvmEnumerationLiteral)eResolveProxy(oldKey);
      if (key != oldKey)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__KEY, oldKey, key));
      }
    }
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral basicGetKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(JvmEnumerationLiteral newKey)
  {
    JvmEnumerationLiteral oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (EAttribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(EAttribute newAttribute)
  {
    EAttribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getEditable()
  {
    return editable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEditable(XExpression newEditable, NotificationChain msgs)
  {
    XExpression oldEditable = editable;
    editable = newEditable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE, oldEditable, newEditable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditable(XExpression newEditable)
  {
    if (newEditable != editable)
    {
      NotificationChain msgs = null;
      if (editable != null)
        msgs = ((InternalEObject)editable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE, null, msgs);
      if (newEditable != null)
        msgs = ((InternalEObject)newEditable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE, null, msgs);
      msgs = basicSetEditable(newEditable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE, newEditable, newEditable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormat(XExpression newFormat, NotificationChain msgs)
  {
    XExpression oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT, oldFormat, newFormat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(XExpression newFormat)
  {
    if (newFormat != format)
    {
      NotificationChain msgs = null;
      if (format != null)
        msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT, null, msgs);
      if (newFormat != null)
        msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT, null, msgs);
      msgs = basicSetFormat(newFormat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT, newFormat, newFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE:
        return basicSetEditable(null, msgs);
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT:
        return basicSetFormat(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__KEY:
        if (resolve) return getKey();
        return basicGetKey();
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE:
        return getEditable();
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT:
        return getFormat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__KEY:
        setKey((JvmEnumerationLiteral)newValue);
        return;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        setAttribute((EAttribute)newValue);
        return;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE:
        setEditable((XExpression)newValue);
        return;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT:
        setFormat((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__KEY:
        setKey((JvmEnumerationLiteral)null);
        return;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        setAttribute((EAttribute)null);
        return;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE:
        setEditable((XExpression)null);
        return;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT:
        setFormat((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__KEY:
        return key != null;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        return attribute != null;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__EDITABLE:
        return editable != null;
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT__FORMAT:
        return format != null;
    }
    return super.eIsSet(featureID);
  }

} //TextPropertyAssignmentImpl
