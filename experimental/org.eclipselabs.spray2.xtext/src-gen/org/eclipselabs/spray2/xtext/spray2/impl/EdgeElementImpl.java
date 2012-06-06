/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.spray2.xtext.spray2.EdgeElement;
import org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection;
import org.eclipselabs.spray2.xtext.spray2.Spray2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.EdgeElementImpl#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeElementImpl extends SprayElementImpl implements EdgeElement
{
  /**
   * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFigure()
   * @generated
   * @ordered
   */
  protected EdgeFigureSection figure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeElementImpl()
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
    return Spray2Package.Literals.EDGE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeFigureSection getFigure()
  {
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFigure(EdgeFigureSection newFigure, NotificationChain msgs)
  {
    EdgeFigureSection oldFigure = figure;
    figure = newFigure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spray2Package.EDGE_ELEMENT__FIGURE, oldFigure, newFigure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFigure(EdgeFigureSection newFigure)
  {
    if (newFigure != figure)
    {
      NotificationChain msgs = null;
      if (figure != null)
        msgs = ((InternalEObject)figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spray2Package.EDGE_ELEMENT__FIGURE, null, msgs);
      if (newFigure != null)
        msgs = ((InternalEObject)newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spray2Package.EDGE_ELEMENT__FIGURE, null, msgs);
      msgs = basicSetFigure(newFigure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.EDGE_ELEMENT__FIGURE, newFigure, newFigure));
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
      case Spray2Package.EDGE_ELEMENT__FIGURE:
        return basicSetFigure(null, msgs);
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
      case Spray2Package.EDGE_ELEMENT__FIGURE:
        return getFigure();
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
      case Spray2Package.EDGE_ELEMENT__FIGURE:
        setFigure((EdgeFigureSection)newValue);
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
      case Spray2Package.EDGE_ELEMENT__FIGURE:
        setFigure((EdgeFigureSection)null);
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
      case Spray2Package.EDGE_ELEMENT__FIGURE:
        return figure != null;
    }
    return super.eIsSet(featureID);
  }

} //EdgeElementImpl
