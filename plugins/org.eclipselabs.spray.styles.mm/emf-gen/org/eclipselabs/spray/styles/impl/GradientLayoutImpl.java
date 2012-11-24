/**
 */
package org.eclipselabs.spray.styles.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.styles.GradientColorArea;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.GradientLayoutImpl#getArea <em>Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradientLayoutImpl extends MinimalEObjectImpl.Container implements GradientLayout
{
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected EList<GradientColorArea> area;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientLayoutImpl()
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
		return StylesPackage.Literals.GRADIENT_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradientColorArea> getArea()
	{
		if (area == null)
		{
			area = new EObjectContainmentEList<GradientColorArea>(GradientColorArea.class, this, StylesPackage.GRADIENT_LAYOUT__AREA);
		}
		return area;
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
			case StylesPackage.GRADIENT_LAYOUT__AREA:
				return ((InternalEList<?>)getArea()).basicRemove(otherEnd, msgs);
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
			case StylesPackage.GRADIENT_LAYOUT__AREA:
				return getArea();
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
			case StylesPackage.GRADIENT_LAYOUT__AREA:
				getArea().clear();
				getArea().addAll((Collection<? extends GradientColorArea>)newValue);
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
			case StylesPackage.GRADIENT_LAYOUT__AREA:
				getArea().clear();
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
			case StylesPackage.GRADIENT_LAYOUT__AREA:
				return area != null && !area.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GradientLayoutImpl
