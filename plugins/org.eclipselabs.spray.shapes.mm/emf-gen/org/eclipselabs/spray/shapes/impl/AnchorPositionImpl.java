/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.AnchorPosition;
import org.eclipselabs.spray.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.AnchorPositionImpl#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnchorPositionImpl extends MinimalEObjectImpl.Container implements AnchorPosition
{
	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected AnchorPositionPos pos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorPositionImpl()
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
		return ShapesPackage.Literals.ANCHOR_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorPositionPos getPos()
	{
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(AnchorPositionPos newPos, NotificationChain msgs)
	{
		AnchorPositionPos oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.ANCHOR_POSITION__POS, oldPos, newPos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(AnchorPositionPos newPos)
	{
		if (newPos != pos)
		{
			NotificationChain msgs = null;
			if (pos != null)
				msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.ANCHOR_POSITION__POS, null, msgs);
			if (newPos != null)
				msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.ANCHOR_POSITION__POS, null, msgs);
			msgs = basicSetPos(newPos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.ANCHOR_POSITION__POS, newPos, newPos));
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
			case ShapesPackage.ANCHOR_POSITION__POS:
				return basicSetPos(null, msgs);
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
			case ShapesPackage.ANCHOR_POSITION__POS:
				return getPos();
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
			case ShapesPackage.ANCHOR_POSITION__POS:
				setPos((AnchorPositionPos)newValue);
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
			case ShapesPackage.ANCHOR_POSITION__POS:
				setPos((AnchorPositionPos)null);
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
			case ShapesPackage.ANCHOR_POSITION__POS:
				return pos != null;
		}
		return super.eIsSet(featureID);
	}

} //AnchorPositionImpl
