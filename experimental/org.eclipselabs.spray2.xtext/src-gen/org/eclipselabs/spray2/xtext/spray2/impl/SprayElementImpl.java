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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray2.xtext.spray2.Spray2Package;
import org.eclipselabs.spray2.xtext.spray2.SprayElement;
import org.eclipselabs.spray2.xtext.spray2.SprayStyleRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spray Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl#getTooling <em>Tooling</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SprayElementImpl extends MinimalEObjectImpl.Container implements SprayElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EClass type;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected SprayStyleRef style;

  /**
   * The default value of the '{@link #getTooling() <em>Tooling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooling()
   * @generated
   * @ordered
   */
  protected static final String TOOLING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTooling() <em>Tooling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooling()
   * @generated
   * @ordered
   */
  protected String tooling = TOOLING_EDEFAULT;

  /**
   * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected String behavior = BEHAVIOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SprayElementImpl()
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
    return Spray2Package.Literals.SPRAY_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.SPRAY_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (EClass)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spray2Package.SPRAY_ELEMENT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EClass newType)
  {
    EClass oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.SPRAY_ELEMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayStyleRef getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(SprayStyleRef newStyle, NotificationChain msgs)
  {
    SprayStyleRef oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spray2Package.SPRAY_ELEMENT__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(SprayStyleRef newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spray2Package.SPRAY_ELEMENT__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spray2Package.SPRAY_ELEMENT__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.SPRAY_ELEMENT__STYLE, newStyle, newStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTooling()
  {
    return tooling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooling(String newTooling)
  {
    String oldTooling = tooling;
    tooling = newTooling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.SPRAY_ELEMENT__TOOLING, oldTooling, tooling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehavior()
  {
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehavior(String newBehavior)
  {
    String oldBehavior = behavior;
    behavior = newBehavior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.SPRAY_ELEMENT__BEHAVIOR, oldBehavior, behavior));
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
      case Spray2Package.SPRAY_ELEMENT__STYLE:
        return basicSetStyle(null, msgs);
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
      case Spray2Package.SPRAY_ELEMENT__NAME:
        return getName();
      case Spray2Package.SPRAY_ELEMENT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case Spray2Package.SPRAY_ELEMENT__STYLE:
        return getStyle();
      case Spray2Package.SPRAY_ELEMENT__TOOLING:
        return getTooling();
      case Spray2Package.SPRAY_ELEMENT__BEHAVIOR:
        return getBehavior();
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
      case Spray2Package.SPRAY_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case Spray2Package.SPRAY_ELEMENT__TYPE:
        setType((EClass)newValue);
        return;
      case Spray2Package.SPRAY_ELEMENT__STYLE:
        setStyle((SprayStyleRef)newValue);
        return;
      case Spray2Package.SPRAY_ELEMENT__TOOLING:
        setTooling((String)newValue);
        return;
      case Spray2Package.SPRAY_ELEMENT__BEHAVIOR:
        setBehavior((String)newValue);
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
      case Spray2Package.SPRAY_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Spray2Package.SPRAY_ELEMENT__TYPE:
        setType((EClass)null);
        return;
      case Spray2Package.SPRAY_ELEMENT__STYLE:
        setStyle((SprayStyleRef)null);
        return;
      case Spray2Package.SPRAY_ELEMENT__TOOLING:
        setTooling(TOOLING_EDEFAULT);
        return;
      case Spray2Package.SPRAY_ELEMENT__BEHAVIOR:
        setBehavior(BEHAVIOR_EDEFAULT);
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
      case Spray2Package.SPRAY_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Spray2Package.SPRAY_ELEMENT__TYPE:
        return type != null;
      case Spray2Package.SPRAY_ELEMENT__STYLE:
        return style != null;
      case Spray2Package.SPRAY_ELEMENT__TOOLING:
        return TOOLING_EDEFAULT == null ? tooling != null : !TOOLING_EDEFAULT.equals(tooling);
      case Spray2Package.SPRAY_ELEMENT__BEHAVIOR:
        return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", tooling: ");
    result.append(tooling);
    result.append(", behavior: ");
    result.append(behavior);
    result.append(')');
    return result.toString();
  }

} //SprayElementImpl
