/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray2.xtext.spray2.Diagram;
import org.eclipselabs.spray2.xtext.spray2.Import;
import org.eclipselabs.spray2.xtext.spray2.Spray2Package;
import org.eclipselabs.spray2.xtext.spray2.SprayElement;
import org.eclipselabs.spray2.xtext.spray2.SprayStyleRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl#getSprayElements <em>Spray Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

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
   * The cached value of the '{@link #getModelType() <em>Model Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected EClass modelType;

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
   * The cached value of the '{@link #getSprayElements() <em>Spray Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSprayElements()
   * @generated
   * @ordered
   */
  protected EList<SprayElement> sprayElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramImpl()
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
    return Spray2Package.Literals.DIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, Spray2Package.DIAGRAM__IMPORTS);
    }
    return imports;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.DIAGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelType()
  {
    if (modelType != null && modelType.eIsProxy())
    {
      InternalEObject oldModelType = (InternalEObject)modelType;
      modelType = (EClass)eResolveProxy(oldModelType);
      if (modelType != oldModelType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spray2Package.DIAGRAM__MODEL_TYPE, oldModelType, modelType));
      }
    }
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetModelType()
  {
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelType(EClass newModelType)
  {
    EClass oldModelType = modelType;
    modelType = newModelType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.DIAGRAM__MODEL_TYPE, oldModelType, modelType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spray2Package.DIAGRAM__STYLE, oldStyle, newStyle);
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
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spray2Package.DIAGRAM__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spray2Package.DIAGRAM__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Spray2Package.DIAGRAM__STYLE, newStyle, newStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SprayElement> getSprayElements()
  {
    if (sprayElements == null)
    {
      sprayElements = new EObjectContainmentEList<SprayElement>(SprayElement.class, this, Spray2Package.DIAGRAM__SPRAY_ELEMENTS);
    }
    return sprayElements;
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
      case Spray2Package.DIAGRAM__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case Spray2Package.DIAGRAM__STYLE:
        return basicSetStyle(null, msgs);
      case Spray2Package.DIAGRAM__SPRAY_ELEMENTS:
        return ((InternalEList<?>)getSprayElements()).basicRemove(otherEnd, msgs);
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
      case Spray2Package.DIAGRAM__IMPORTS:
        return getImports();
      case Spray2Package.DIAGRAM__NAME:
        return getName();
      case Spray2Package.DIAGRAM__MODEL_TYPE:
        if (resolve) return getModelType();
        return basicGetModelType();
      case Spray2Package.DIAGRAM__STYLE:
        return getStyle();
      case Spray2Package.DIAGRAM__SPRAY_ELEMENTS:
        return getSprayElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Spray2Package.DIAGRAM__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case Spray2Package.DIAGRAM__NAME:
        setName((String)newValue);
        return;
      case Spray2Package.DIAGRAM__MODEL_TYPE:
        setModelType((EClass)newValue);
        return;
      case Spray2Package.DIAGRAM__STYLE:
        setStyle((SprayStyleRef)newValue);
        return;
      case Spray2Package.DIAGRAM__SPRAY_ELEMENTS:
        getSprayElements().clear();
        getSprayElements().addAll((Collection<? extends SprayElement>)newValue);
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
      case Spray2Package.DIAGRAM__IMPORTS:
        getImports().clear();
        return;
      case Spray2Package.DIAGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Spray2Package.DIAGRAM__MODEL_TYPE:
        setModelType((EClass)null);
        return;
      case Spray2Package.DIAGRAM__STYLE:
        setStyle((SprayStyleRef)null);
        return;
      case Spray2Package.DIAGRAM__SPRAY_ELEMENTS:
        getSprayElements().clear();
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
      case Spray2Package.DIAGRAM__IMPORTS:
        return imports != null && !imports.isEmpty();
      case Spray2Package.DIAGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Spray2Package.DIAGRAM__MODEL_TYPE:
        return modelType != null;
      case Spray2Package.DIAGRAM__STYLE:
        return style != null;
      case Spray2Package.DIAGRAM__SPRAY_ELEMENTS:
        return sprayElements != null && !sprayElements.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //DiagramImpl
