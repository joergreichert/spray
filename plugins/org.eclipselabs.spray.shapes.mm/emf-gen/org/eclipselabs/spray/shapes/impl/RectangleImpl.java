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

import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.RectangleImpl#getCompartmentInfo <em>Compartment Info</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.RectangleImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.RectangleImpl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangleImpl extends ShapeImpl implements Rectangle
{
	/**
     * The cached value of the '{@link #getCompartmentInfo() <em>Compartment Info</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompartmentInfo()
     * @generated
     * @ordered
     */
	protected CompartmentInfo compartmentInfo;

	/**
     * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLayout()
     * @generated
     * @ordered
     */
	protected RectangleEllipseLayout layout;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RectangleImpl()
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
        return ShapesPackage.Literals.RECTANGLE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentInfo getCompartmentInfo()
	{
        return compartmentInfo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCompartmentInfo(CompartmentInfo newCompartmentInfo, NotificationChain msgs)
	{
        CompartmentInfo oldCompartmentInfo = compartmentInfo;
        compartmentInfo = newCompartmentInfo;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE__COMPARTMENT_INFO, oldCompartmentInfo, newCompartmentInfo);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompartmentInfo(CompartmentInfo newCompartmentInfo)
	{
        if (newCompartmentInfo != compartmentInfo) {
            NotificationChain msgs = null;
            if (compartmentInfo != null)
                msgs = ((InternalEObject)compartmentInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE__COMPARTMENT_INFO, null, msgs);
            if (newCompartmentInfo != null)
                msgs = ((InternalEObject)newCompartmentInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE__COMPARTMENT_INFO, null, msgs);
            msgs = basicSetCompartmentInfo(newCompartmentInfo, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE__COMPARTMENT_INFO, newCompartmentInfo, newCompartmentInfo));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RectangleEllipseLayout getLayout()
	{
        return layout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLayout(RectangleEllipseLayout newLayout, NotificationChain msgs)
	{
        RectangleEllipseLayout oldLayout = layout;
        layout = newLayout;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE__LAYOUT, oldLayout, newLayout);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLayout(RectangleEllipseLayout newLayout)
	{
        if (newLayout != layout) {
            NotificationChain msgs = null;
            if (layout != null)
                msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE__LAYOUT, null, msgs);
            if (newLayout != null)
                msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE__LAYOUT, null, msgs);
            msgs = basicSetLayout(newLayout, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE__LAYOUT, newLayout, newLayout));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Shape> getShape()
	{
        if (shape == null) {
            shape = new EObjectContainmentEList<Shape>(Shape.class, this, ShapesPackage.RECTANGLE__SHAPE);
        }
        return shape;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
        switch (featureID) {
            case ShapesPackage.RECTANGLE__COMPARTMENT_INFO:
                return basicSetCompartmentInfo(null, msgs);
            case ShapesPackage.RECTANGLE__LAYOUT:
                return basicSetLayout(null, msgs);
            case ShapesPackage.RECTANGLE__SHAPE:
                return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
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
        switch (featureID) {
            case ShapesPackage.RECTANGLE__COMPARTMENT_INFO:
                return getCompartmentInfo();
            case ShapesPackage.RECTANGLE__LAYOUT:
                return getLayout();
            case ShapesPackage.RECTANGLE__SHAPE:
                return getShape();
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
        switch (featureID) {
            case ShapesPackage.RECTANGLE__COMPARTMENT_INFO:
                setCompartmentInfo((CompartmentInfo)newValue);
                return;
            case ShapesPackage.RECTANGLE__LAYOUT:
                setLayout((RectangleEllipseLayout)newValue);
                return;
            case ShapesPackage.RECTANGLE__SHAPE:
                getShape().clear();
                getShape().addAll((Collection<? extends Shape>)newValue);
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
        switch (featureID) {
            case ShapesPackage.RECTANGLE__COMPARTMENT_INFO:
                setCompartmentInfo((CompartmentInfo)null);
                return;
            case ShapesPackage.RECTANGLE__LAYOUT:
                setLayout((RectangleEllipseLayout)null);
                return;
            case ShapesPackage.RECTANGLE__SHAPE:
                getShape().clear();
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
        switch (featureID) {
            case ShapesPackage.RECTANGLE__COMPARTMENT_INFO:
                return compartmentInfo != null;
            case ShapesPackage.RECTANGLE__LAYOUT:
                return layout != null;
            case ShapesPackage.RECTANGLE__SHAPE:
                return shape != null && !shape.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RectangleImpl
