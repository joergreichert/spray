/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.Compartment;
import org.eclipselabs.spray.shapes.CompartmentLayout;
import org.eclipselabs.spray.shapes.CompartmentShape;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentImpl#getCompartmentLayout <em>Compartment Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentImpl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentImpl extends MinimalEObjectImpl.Container implements Compartment
{
	/**
	 * The default value of the '{@link #getCompartmentLayout() <em>Compartment Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentLayout()
	 * @generated
	 * @ordered
	 */
	protected static final CompartmentLayout COMPARTMENT_LAYOUT_EDEFAULT = CompartmentLayout.FIXED;

	/**
	 * The cached value of the '{@link #getCompartmentLayout() <em>Compartment Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentLayout()
	 * @generated
	 * @ordered
	 */
	protected CompartmentLayout compartmentLayout = COMPARTMENT_LAYOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected CompartmentShape shape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentImpl()
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
		return ShapesPackage.Literals.COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentLayout getCompartmentLayout()
	{
		return compartmentLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentLayout(CompartmentLayout newCompartmentLayout)
	{
		CompartmentLayout oldCompartmentLayout = compartmentLayout;
		compartmentLayout = newCompartmentLayout == null ? COMPARTMENT_LAYOUT_EDEFAULT : newCompartmentLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT__COMPARTMENT_LAYOUT, oldCompartmentLayout, compartmentLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentShape getShape()
	{
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(CompartmentShape newShape, NotificationChain msgs)
	{
		CompartmentShape oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT__SHAPE, oldShape, newShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(CompartmentShape newShape)
	{
		if (newShape != shape)
		{
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT__SHAPE, newShape, newShape));
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
			case ShapesPackage.COMPARTMENT__SHAPE:
				return basicSetShape(null, msgs);
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
			case ShapesPackage.COMPARTMENT__COMPARTMENT_LAYOUT:
				return getCompartmentLayout();
			case ShapesPackage.COMPARTMENT__SHAPE:
				return getShape();
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
			case ShapesPackage.COMPARTMENT__COMPARTMENT_LAYOUT:
				setCompartmentLayout((CompartmentLayout)newValue);
				return;
			case ShapesPackage.COMPARTMENT__SHAPE:
				setShape((CompartmentShape)newValue);
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
			case ShapesPackage.COMPARTMENT__COMPARTMENT_LAYOUT:
				setCompartmentLayout(COMPARTMENT_LAYOUT_EDEFAULT);
				return;
			case ShapesPackage.COMPARTMENT__SHAPE:
				setShape((CompartmentShape)null);
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
			case ShapesPackage.COMPARTMENT__COMPARTMENT_LAYOUT:
				return compartmentLayout != COMPARTMENT_LAYOUT_EDEFAULT;
			case ShapesPackage.COMPARTMENT__SHAPE:
				return shape != null;
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
		result.append(" (compartmentLayout: ");
		result.append(compartmentLayout);
		result.append(')');
		return result.toString();
	}

} //CompartmentImpl
