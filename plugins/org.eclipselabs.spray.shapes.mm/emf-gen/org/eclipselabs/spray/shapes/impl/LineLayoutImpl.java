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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.shapes.LineLayout;
import org.eclipselabs.spray.shapes.Point;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.ShapestyleLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.LineLayoutImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.LineLayoutImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineLayoutImpl extends MinimalEObjectImpl.Container implements LineLayout
{
	/**
     * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPoint()
     * @generated
     * @ordered
     */
	protected EList<Point> point;

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
	protected LineLayoutImpl()
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
        return ShapesPackage.Literals.LINE_LAYOUT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Point> getPoint()
	{
        if (point == null) {
            point = new EObjectContainmentEList<Point>(Point.class, this, ShapesPackage.LINE_LAYOUT__POINT);
        }
        return point;
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
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.LINE_LAYOUT__LAYOUT, oldLayout, newLayout);
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
        if (newLayout != layout) {
            NotificationChain msgs = null;
            if (layout != null)
                msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.LINE_LAYOUT__LAYOUT, null, msgs);
            if (newLayout != null)
                msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.LINE_LAYOUT__LAYOUT, null, msgs);
            msgs = basicSetLayout(newLayout, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.LINE_LAYOUT__LAYOUT, newLayout, newLayout));
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
            case ShapesPackage.LINE_LAYOUT__POINT:
                return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
            case ShapesPackage.LINE_LAYOUT__LAYOUT:
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
        switch (featureID) {
            case ShapesPackage.LINE_LAYOUT__POINT:
                return getPoint();
            case ShapesPackage.LINE_LAYOUT__LAYOUT:
                return getLayout();
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
            case ShapesPackage.LINE_LAYOUT__POINT:
                getPoint().clear();
                getPoint().addAll((Collection<? extends Point>)newValue);
                return;
            case ShapesPackage.LINE_LAYOUT__LAYOUT:
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
        switch (featureID) {
            case ShapesPackage.LINE_LAYOUT__POINT:
                getPoint().clear();
                return;
            case ShapesPackage.LINE_LAYOUT__LAYOUT:
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
        switch (featureID) {
            case ShapesPackage.LINE_LAYOUT__POINT:
                return point != null && !point.isEmpty();
            case ShapesPackage.LINE_LAYOUT__LAYOUT:
                return layout != null;
        }
        return super.eIsSet(featureID);
    }

} //LineLayoutImpl
