/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.Description;
import org.eclipselabs.spray.shapes.HAlign;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.shapes.VAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.DescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.DescriptionImpl#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.DescriptionImpl#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.DescriptionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description
{
	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected ShapeStyleRef style;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected TextBody body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl()
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
		return ShapesPackage.Literals.DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeStyleRef getStyle()
	{
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(ShapeStyleRef newStyle, NotificationChain msgs)
	{
		ShapeStyleRef oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.DESCRIPTION__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(ShapeStyleRef newStyle)
	{
		if (newStyle != style)
		{
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.DESCRIPTION__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.DESCRIPTION__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.DESCRIPTION__STYLE, newStyle, newStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.DESCRIPTION__HALIGN, oldHAlign, hAlign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.DESCRIPTION__VALIGN, oldVAlign, vAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBody getBody()
	{
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(TextBody newBody, NotificationChain msgs)
	{
		TextBody oldBody = body;
		body = newBody;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.DESCRIPTION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(TextBody newBody)
	{
		if (newBody != body)
		{
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.DESCRIPTION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.DESCRIPTION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.DESCRIPTION__BODY, newBody, newBody));
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
			case ShapesPackage.DESCRIPTION__STYLE:
				return basicSetStyle(null, msgs);
			case ShapesPackage.DESCRIPTION__BODY:
				return basicSetBody(null, msgs);
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
			case ShapesPackage.DESCRIPTION__STYLE:
				return getStyle();
			case ShapesPackage.DESCRIPTION__HALIGN:
				return getHAlign();
			case ShapesPackage.DESCRIPTION__VALIGN:
				return getVAlign();
			case ShapesPackage.DESCRIPTION__BODY:
				return getBody();
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
			case ShapesPackage.DESCRIPTION__STYLE:
				setStyle((ShapeStyleRef)newValue);
				return;
			case ShapesPackage.DESCRIPTION__HALIGN:
				setHAlign((HAlign)newValue);
				return;
			case ShapesPackage.DESCRIPTION__VALIGN:
				setVAlign((VAlign)newValue);
				return;
			case ShapesPackage.DESCRIPTION__BODY:
				setBody((TextBody)newValue);
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
			case ShapesPackage.DESCRIPTION__STYLE:
				setStyle((ShapeStyleRef)null);
				return;
			case ShapesPackage.DESCRIPTION__HALIGN:
				setHAlign(HALIGN_EDEFAULT);
				return;
			case ShapesPackage.DESCRIPTION__VALIGN:
				setVAlign(VALIGN_EDEFAULT);
				return;
			case ShapesPackage.DESCRIPTION__BODY:
				setBody((TextBody)null);
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
			case ShapesPackage.DESCRIPTION__STYLE:
				return style != null;
			case ShapesPackage.DESCRIPTION__HALIGN:
				return hAlign != HALIGN_EDEFAULT;
			case ShapesPackage.DESCRIPTION__VALIGN:
				return vAlign != VALIGN_EDEFAULT;
			case ShapesPackage.DESCRIPTION__BODY:
				return body != null;
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

} //DescriptionImpl
