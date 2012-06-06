/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;

import org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment;
import org.eclipselabs.spray2.xtext.spray2.Spray2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.CompartmentPropertyAssignmentImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.CompartmentPropertyAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentPropertyAssignmentImpl extends MinimalEObjectImpl.Container implements CompartmentPropertyAssignment
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentPropertyAssignmentImpl()
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
    return Spray2Package.Literals.COMPARTMENT_PROPERTY_ASSIGNMENT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__KEY, oldKey, key));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__KEY, oldKey, key));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
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
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__KEY:
        if (resolve) return getKey();
        return basicGetKey();
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
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
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__KEY:
        setKey((JvmEnumerationLiteral)newValue);
        return;
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        setAttribute((EAttribute)newValue);
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
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__KEY:
        setKey((JvmEnumerationLiteral)null);
        return;
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        setAttribute((EAttribute)null);
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
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__KEY:
        return key != null;
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE:
        return attribute != null;
    }
    return super.eIsSet(featureID);
  }

} //CompartmentPropertyAssignmentImpl
