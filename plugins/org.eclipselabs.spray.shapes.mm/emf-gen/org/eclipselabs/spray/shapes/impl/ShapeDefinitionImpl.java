/**
 */
package org.eclipselabs.spray.shapes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.shapes.Anchor;
import org.eclipselabs.spray.shapes.Description;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeLayout;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl#getShapeLayout <em>Shape Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeDefinitionImpl extends ShapeContainerElementImpl implements ShapeDefinition
{
	/**
	 * The cached value of the '{@link #getShapeLayout() <em>Shape Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeLayout()
	 * @generated
	 * @ordered
	 */
	protected ShapeLayout shapeLayout;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> shape;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected Anchor anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeDefinitionImpl()
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
		return ShapesPackage.Literals.SHAPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeLayout getShapeLayout()
	{
		return shapeLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeLayout(ShapeLayout newShapeLayout, NotificationChain msgs)
	{
		ShapeLayout oldShapeLayout = shapeLayout;
		shapeLayout = newShapeLayout;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT, oldShapeLayout, newShapeLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeLayout(ShapeLayout newShapeLayout)
	{
		if (newShapeLayout != shapeLayout)
		{
			NotificationChain msgs = null;
			if (shapeLayout != null)
				msgs = ((InternalEObject)shapeLayout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT, null, msgs);
			if (newShapeLayout != null)
				msgs = ((InternalEObject)newShapeLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT, null, msgs);
			msgs = basicSetShapeLayout(newShapeLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT, newShapeLayout, newShapeLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getShape()
	{
		if (shape == null)
		{
			shape = new EObjectContainmentEList<Shape>(Shape.class, this, ShapesPackage.SHAPE_DEFINITION__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs)
	{
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription)
	{
		if (newDescription != description)
		{
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anchor getAnchor()
	{
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchor(Anchor newAnchor, NotificationChain msgs)
	{
		Anchor oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_DEFINITION__ANCHOR, oldAnchor, newAnchor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor(Anchor newAnchor)
	{
		if (newAnchor != anchor)
		{
			NotificationChain msgs = null;
			if (anchor != null)
				msgs = ((InternalEObject)anchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_DEFINITION__ANCHOR, null, msgs);
			if (newAnchor != null)
				msgs = ((InternalEObject)newAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_DEFINITION__ANCHOR, null, msgs);
			msgs = basicSetAnchor(newAnchor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_DEFINITION__ANCHOR, newAnchor, newAnchor));
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
			case ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT:
				return basicSetShapeLayout(null, msgs);
			case ShapesPackage.SHAPE_DEFINITION__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case ShapesPackage.SHAPE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ShapesPackage.SHAPE_DEFINITION__ANCHOR:
				return basicSetAnchor(null, msgs);
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
			case ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT:
				return getShapeLayout();
			case ShapesPackage.SHAPE_DEFINITION__SHAPE:
				return getShape();
			case ShapesPackage.SHAPE_DEFINITION__DESCRIPTION:
				return getDescription();
			case ShapesPackage.SHAPE_DEFINITION__ANCHOR:
				return getAnchor();
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
			case ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT:
				setShapeLayout((ShapeLayout)newValue);
				return;
			case ShapesPackage.SHAPE_DEFINITION__SHAPE:
				getShape().clear();
				getShape().addAll((Collection<? extends Shape>)newValue);
				return;
			case ShapesPackage.SHAPE_DEFINITION__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case ShapesPackage.SHAPE_DEFINITION__ANCHOR:
				setAnchor((Anchor)newValue);
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
			case ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT:
				setShapeLayout((ShapeLayout)null);
				return;
			case ShapesPackage.SHAPE_DEFINITION__SHAPE:
				getShape().clear();
				return;
			case ShapesPackage.SHAPE_DEFINITION__DESCRIPTION:
				setDescription((Description)null);
				return;
			case ShapesPackage.SHAPE_DEFINITION__ANCHOR:
				setAnchor((Anchor)null);
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
			case ShapesPackage.SHAPE_DEFINITION__SHAPE_LAYOUT:
				return shapeLayout != null;
			case ShapesPackage.SHAPE_DEFINITION__SHAPE:
				return shape != null && !shape.isEmpty();
			case ShapesPackage.SHAPE_DEFINITION__DESCRIPTION:
				return description != null;
			case ShapesPackage.SHAPE_DEFINITION__ANCHOR:
				return anchor != null;
		}
		return super.eIsSet(featureID);
	}

} //ShapeDefinitionImpl
