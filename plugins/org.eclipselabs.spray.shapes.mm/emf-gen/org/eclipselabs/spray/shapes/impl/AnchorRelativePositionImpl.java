/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.spray.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor Relative Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.AnchorRelativePositionImpl#getXoffset <em>Xoffset</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.AnchorRelativePositionImpl#getYoffset <em>Yoffset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnchorRelativePositionImpl extends AnchorPositionPosImpl implements AnchorRelativePosition
{
	/**
	 * The default value of the '{@link #getXoffset() <em>Xoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoffset()
	 * @generated
	 * @ordered
	 */
	protected static final double XOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXoffset() <em>Xoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoffset()
	 * @generated
	 * @ordered
	 */
	protected double xoffset = XOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoffset() <em>Yoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoffset()
	 * @generated
	 * @ordered
	 */
	protected static final double YOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYoffset() <em>Yoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoffset()
	 * @generated
	 * @ordered
	 */
	protected double yoffset = YOFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorRelativePositionImpl()
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
		return ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXoffset()
	{
		return xoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoffset(double newXoffset)
	{
		double oldXoffset = xoffset;
		xoffset = newXoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.ANCHOR_RELATIVE_POSITION__XOFFSET, oldXoffset, xoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYoffset()
	{
		return yoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoffset(double newYoffset)
	{
		double oldYoffset = yoffset;
		yoffset = newYoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.ANCHOR_RELATIVE_POSITION__YOFFSET, oldYoffset, yoffset));
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
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__XOFFSET:
				return getXoffset();
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__YOFFSET:
				return getYoffset();
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
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__XOFFSET:
				setXoffset((Double)newValue);
				return;
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__YOFFSET:
				setYoffset((Double)newValue);
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
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__XOFFSET:
				setXoffset(XOFFSET_EDEFAULT);
				return;
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__YOFFSET:
				setYoffset(YOFFSET_EDEFAULT);
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
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__XOFFSET:
				return xoffset != XOFFSET_EDEFAULT;
			case ShapesPackage.ANCHOR_RELATIVE_POSITION__YOFFSET:
				return yoffset != YOFFSET_EDEFAULT;
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
		result.append(" (xoffset: ");
		result.append(xoffset);
		result.append(", yoffset: ");
		result.append(yoffset);
		result.append(')');
		return result.toString();
	}

} //AnchorRelativePositionImpl
