/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CommonLayoutImpl#getXcor <em>Xcor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CommonLayoutImpl#getYcor <em>Ycor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CommonLayoutImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CommonLayoutImpl#getHeigth <em>Heigth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonLayoutImpl extends MinimalEObjectImpl.Container implements CommonLayout
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected int heigth = HEIGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonLayoutImpl()
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
		return ShapesPackage.Literals.COMMON_LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMMON_LAYOUT__XCOR, oldXcor, xcor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMMON_LAYOUT__YCOR, oldYcor, ycor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth()
	{
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth)
	{
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMMON_LAYOUT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeigth()
	{
		return heigth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigth(int newHeigth)
	{
		int oldHeigth = heigth;
		heigth = newHeigth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMMON_LAYOUT__HEIGTH, oldHeigth, heigth));
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
			case ShapesPackage.COMMON_LAYOUT__XCOR:
				return getXcor();
			case ShapesPackage.COMMON_LAYOUT__YCOR:
				return getYcor();
			case ShapesPackage.COMMON_LAYOUT__WIDTH:
				return getWidth();
			case ShapesPackage.COMMON_LAYOUT__HEIGTH:
				return getHeigth();
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
			case ShapesPackage.COMMON_LAYOUT__XCOR:
				setXcor((Integer)newValue);
				return;
			case ShapesPackage.COMMON_LAYOUT__YCOR:
				setYcor((Integer)newValue);
				return;
			case ShapesPackage.COMMON_LAYOUT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ShapesPackage.COMMON_LAYOUT__HEIGTH:
				setHeigth((Integer)newValue);
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
			case ShapesPackage.COMMON_LAYOUT__XCOR:
				setXcor(XCOR_EDEFAULT);
				return;
			case ShapesPackage.COMMON_LAYOUT__YCOR:
				setYcor(YCOR_EDEFAULT);
				return;
			case ShapesPackage.COMMON_LAYOUT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ShapesPackage.COMMON_LAYOUT__HEIGTH:
				setHeigth(HEIGTH_EDEFAULT);
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
			case ShapesPackage.COMMON_LAYOUT__XCOR:
				return xcor != XCOR_EDEFAULT;
			case ShapesPackage.COMMON_LAYOUT__YCOR:
				return ycor != YCOR_EDEFAULT;
			case ShapesPackage.COMMON_LAYOUT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ShapesPackage.COMMON_LAYOUT__HEIGTH:
				return heigth != HEIGTH_EDEFAULT;
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
		result.append(", width: ");
		result.append(width);
		result.append(", heigth: ");
		result.append(heigth);
		result.append(')');
		return result.toString();
	}

} //CommonLayoutImpl
