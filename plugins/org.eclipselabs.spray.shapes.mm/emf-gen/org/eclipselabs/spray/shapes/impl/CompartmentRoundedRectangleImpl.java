/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.CompartmentRoundedRectangle;
import org.eclipselabs.spray.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.TextBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentRoundedRectangleImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentRoundedRectangleImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentRoundedRectangleImpl extends MinimalEObjectImpl.Container implements CompartmentRoundedRectangle
{
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected RoundedRectangleLayout layout;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected TextBody id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentRoundedRectangleImpl()
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
		return ShapesPackage.Literals.COMPARTMENT_ROUNDED_RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundedRectangleLayout getLayout()
	{
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(RoundedRectangleLayout newLayout, NotificationChain msgs)
	{
		RoundedRectangleLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(RoundedRectangleLayout newLayout)
	{
		if (newLayout != layout)
		{
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBody getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(TextBody newId, NotificationChain msgs)
	{
		TextBody oldId = id;
		id = newId;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(TextBody newId)
	{
		if (newId != id)
		{
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID, newId, newId));
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
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT:
				return basicSetLayout(null, msgs);
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID:
				return basicSetId(null, msgs);
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
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT:
				return getLayout();
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID:
				return getId();
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
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT:
				setLayout((RoundedRectangleLayout)newValue);
				return;
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID:
				setId((TextBody)newValue);
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
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT:
				setLayout((RoundedRectangleLayout)null);
				return;
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID:
				setId((TextBody)null);
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
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT:
				return layout != null;
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE__ID:
				return id != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentRoundedRectangleImpl
