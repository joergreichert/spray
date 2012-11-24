/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.HAlign;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.TextLayout;
import org.eclipselabs.spray.shapes.VAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.TextLayoutImpl#getCommon <em>Common</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.TextLayoutImpl#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.TextLayoutImpl#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.TextLayoutImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextLayoutImpl extends MinimalEObjectImpl.Container implements TextLayout
{
	/**
	 * The cached value of the '{@link #getCommon() <em>Common</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommon()
	 * @generated
	 * @ordered
	 */
	protected CommonLayout common;

	/**
	 * The default value of the '{@link #getHAlign() <em>HAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAlign()
	 * @generated
	 * @ordered
	 */
	protected static final HAlign HALIGN_EDEFAULT = HAlign.LEFT;

	/**
	 * The cached value of the '{@link #getHAlign() <em>HAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAlign()
	 * @generated
	 * @ordered
	 */
	protected HAlign hAlign = HALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVAlign() <em>VAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAlign()
	 * @generated
	 * @ordered
	 */
	protected static final VAlign VALIGN_EDEFAULT = VAlign.TOP;

	/**
	 * The cached value of the '{@link #getVAlign() <em>VAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAlign()
	 * @generated
	 * @ordered
	 */
	protected VAlign vAlign = VALIGN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected ShapestyleLayout layout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextLayoutImpl()
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
		return ShapesPackage.Literals.TEXT_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonLayout getCommon()
	{
		return common;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommon(CommonLayout newCommon, NotificationChain msgs)
	{
		CommonLayout oldCommon = common;
		common = newCommon;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.TEXT_LAYOUT__COMMON, oldCommon, newCommon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommon(CommonLayout newCommon)
	{
		if (newCommon != common)
		{
			NotificationChain msgs = null;
			if (common != null)
				msgs = ((InternalEObject)common).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.TEXT_LAYOUT__COMMON, null, msgs);
			if (newCommon != null)
				msgs = ((InternalEObject)newCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.TEXT_LAYOUT__COMMON, null, msgs);
			msgs = basicSetCommon(newCommon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.TEXT_LAYOUT__COMMON, newCommon, newCommon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlign getHAlign()
	{
		return hAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHAlign(HAlign newHAlign)
	{
		HAlign oldHAlign = hAlign;
		hAlign = newHAlign == null ? HALIGN_EDEFAULT : newHAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.TEXT_LAYOUT__HALIGN, oldHAlign, hAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlign getVAlign()
	{
		return vAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAlign(VAlign newVAlign)
	{
		VAlign oldVAlign = vAlign;
		vAlign = newVAlign == null ? VALIGN_EDEFAULT : newVAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.TEXT_LAYOUT__VALIGN, oldVAlign, vAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapestyleLayout getLayout()
	{
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(ShapestyleLayout newLayout, NotificationChain msgs)
	{
		ShapestyleLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.TEXT_LAYOUT__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(ShapestyleLayout newLayout)
	{
		if (newLayout != layout)
		{
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.TEXT_LAYOUT__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.TEXT_LAYOUT__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.TEXT_LAYOUT__LAYOUT, newLayout, newLayout));
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
			case ShapesPackage.TEXT_LAYOUT__COMMON:
				return basicSetCommon(null, msgs);
			case ShapesPackage.TEXT_LAYOUT__LAYOUT:
				return basicSetLayout(null, msgs);
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
			case ShapesPackage.TEXT_LAYOUT__COMMON:
				return getCommon();
			case ShapesPackage.TEXT_LAYOUT__HALIGN:
				return getHAlign();
			case ShapesPackage.TEXT_LAYOUT__VALIGN:
				return getVAlign();
			case ShapesPackage.TEXT_LAYOUT__LAYOUT:
				return getLayout();
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
			case ShapesPackage.TEXT_LAYOUT__COMMON:
				setCommon((CommonLayout)newValue);
				return;
			case ShapesPackage.TEXT_LAYOUT__HALIGN:
				setHAlign((HAlign)newValue);
				return;
			case ShapesPackage.TEXT_LAYOUT__VALIGN:
				setVAlign((VAlign)newValue);
				return;
			case ShapesPackage.TEXT_LAYOUT__LAYOUT:
				setLayout((ShapestyleLayout)newValue);
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
			case ShapesPackage.TEXT_LAYOUT__COMMON:
				setCommon((CommonLayout)null);
				return;
			case ShapesPackage.TEXT_LAYOUT__HALIGN:
				setHAlign(HALIGN_EDEFAULT);
				return;
			case ShapesPackage.TEXT_LAYOUT__VALIGN:
				setVAlign(VALIGN_EDEFAULT);
				return;
			case ShapesPackage.TEXT_LAYOUT__LAYOUT:
				setLayout((ShapestyleLayout)null);
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
			case ShapesPackage.TEXT_LAYOUT__COMMON:
				return common != null;
			case ShapesPackage.TEXT_LAYOUT__HALIGN:
				return hAlign != HALIGN_EDEFAULT;
			case ShapesPackage.TEXT_LAYOUT__VALIGN:
				return vAlign != VALIGN_EDEFAULT;
			case ShapesPackage.TEXT_LAYOUT__LAYOUT:
				return layout != null;
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
		result.append(" (hAlign: ");
		result.append(hAlign);
		result.append(", vAlign: ");
		result.append(vAlign);
		result.append(')');
		return result.toString();
	}

} //TextLayoutImpl
