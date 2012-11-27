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

import org.eclipselabs.spray.styles.StyleContainer;
import org.eclipselabs.spray.styles.StyleContainerElement;
import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleContainerImpl#getStyleContainerElement <em>Style Container Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleContainerImpl extends MinimalEObjectImpl.Container implements StyleContainer
{
	/**
	 * The cached value of the '{@link #getStyleContainerElement() <em>Style Container Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleContainerElement()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleContainerElement> styleContainerElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleContainerImpl()
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
		return StylesPackage.Literals.STYLE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleContainerElement> getStyleContainerElement()
	{
		if (styleContainerElement == null)
		{
			styleContainerElement = new EObjectContainmentEList<StyleContainerElement>(StyleContainerElement.class, this, StylesPackage.STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT);
		}
		return styleContainerElement;
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
			case StylesPackage.STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT:
				return ((InternalEList<?>)getStyleContainerElement()).basicRemove(otherEnd, msgs);
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
			case StylesPackage.STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT:
				return getStyleContainerElement();
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
			case StylesPackage.STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT:
				getStyleContainerElement().clear();
				getStyleContainerElement().addAll((Collection<? extends StyleContainerElement>)newValue);
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
			case StylesPackage.STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT:
				getStyleContainerElement().clear();
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
			case StylesPackage.STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT:
				return styleContainerElement != null && !styleContainerElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StyleContainerImpl
