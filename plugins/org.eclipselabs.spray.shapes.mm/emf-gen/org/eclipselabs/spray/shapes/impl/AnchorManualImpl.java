/**
 */
package org.eclipselabs.spray.shapes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.shapes.AnchorManual;
import org.eclipselabs.spray.shapes.AnchorPosition;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor Manual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.AnchorManualImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnchorManualImpl extends AnchorTypeImpl implements AnchorManual
{
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<AnchorPosition> position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorManualImpl()
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
		return ShapesPackage.Literals.ANCHOR_MANUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnchorPosition> getPosition()
	{
		if (position == null)
		{
			position = new EObjectContainmentEList<AnchorPosition>(AnchorPosition.class, this, ShapesPackage.ANCHOR_MANUAL__POSITION);
		}
		return position;
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
			case ShapesPackage.ANCHOR_MANUAL__POSITION:
				return ((InternalEList<?>)getPosition()).basicRemove(otherEnd, msgs);
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
			case ShapesPackage.ANCHOR_MANUAL__POSITION:
				return getPosition();
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
			case ShapesPackage.ANCHOR_MANUAL__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends AnchorPosition>)newValue);
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
			case ShapesPackage.ANCHOR_MANUAL__POSITION:
				getPosition().clear();
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
			case ShapesPackage.ANCHOR_MANUAL__POSITION:
				return position != null && !position.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnchorManualImpl
