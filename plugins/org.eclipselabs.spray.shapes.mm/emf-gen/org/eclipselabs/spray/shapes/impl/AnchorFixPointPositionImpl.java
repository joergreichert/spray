/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.spray.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor Fix Point Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.AnchorFixPointPositionImpl#getXcor <em>Xcor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.AnchorFixPointPositionImpl#getYcor <em>Ycor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnchorFixPointPositionImpl extends AnchorPositionPosImpl implements AnchorFixPointPosition
{
	/**
	 * The default value of the '{@link #getXcor() <em>Xcor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcor()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXcor() <em>Xcor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcor()
	 * @generated
	 * @ordered
	 */
	protected int xcor = XCOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getYcor() <em>Ycor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYcor()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYcor() <em>Ycor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYcor()
	 * @generated
	 * @ordered
	 */
	protected int ycor = YCOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorFixPointPositionImpl()
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
		return ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXcor()
	{
		return xcor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXcor(int newXcor)
	{
		int oldXcor = xcor;
		xcor = newXcor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.ANCHOR_FIX_POINT_POSITION__XCOR, oldXcor, xcor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYcor()
	{
		return ycor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYcor(int newYcor)
	{
		int oldYcor = ycor;
		ycor = newYcor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.ANCHOR_FIX_POINT_POSITION__YCOR, oldYcor, ycor));
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
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__XCOR:
				return getXcor();
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__YCOR:
				return getYcor();
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
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__XCOR:
				setXcor((Integer)newValue);
				return;
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__YCOR:
				setYcor((Integer)newValue);
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
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__XCOR:
				setXcor(XCOR_EDEFAULT);
				return;
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__YCOR:
				setYcor(YCOR_EDEFAULT);
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
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__XCOR:
				return xcor != XCOR_EDEFAULT;
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION__YCOR:
				return ycor != YCOR_EDEFAULT;
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
		result.append(" (xcor: ");
		result.append(xcor);
		result.append(", ycor: ");
		result.append(ycor);
		result.append(')');
		return result.toString();
	}

} //AnchorFixPointPositionImpl
