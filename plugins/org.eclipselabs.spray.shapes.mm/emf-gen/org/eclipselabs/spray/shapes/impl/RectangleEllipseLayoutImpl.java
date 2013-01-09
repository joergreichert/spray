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
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.ShapestyleLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle Ellipse Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.RectangleEllipseLayoutImpl#getCommon <em>Common</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.RectangleEllipseLayoutImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangleEllipseLayoutImpl extends MinimalEObjectImpl.Container implements RectangleEllipseLayout
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
	protected RectangleEllipseLayoutImpl()
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
        return ShapesPackage.Literals.RECTANGLE_ELLIPSE_LAYOUT;
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
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON, oldCommon, newCommon);
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
        if (newCommon != common) {
            NotificationChain msgs = null;
            if (common != null)
                msgs = ((InternalEObject)common).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON, null, msgs);
            if (newCommon != null)
                msgs = ((InternalEObject)newCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON, null, msgs);
            msgs = basicSetCommon(newCommon, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON, newCommon, newCommon));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT, oldLayout, newLayout);
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
                msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT, null, msgs);
            if (newLayout != null)
                msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT, null, msgs);
            msgs = basicSetLayout(newLayout, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT, newLayout, newLayout));
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
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON:
                return basicSetCommon(null, msgs);
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT:
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
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON:
                return getCommon();
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT:
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
        switch (featureID) {
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON:
                setCommon((CommonLayout)newValue);
                return;
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT:
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
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON:
                setCommon((CommonLayout)null);
                return;
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT:
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
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__COMMON:
                return common != null;
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT__LAYOUT:
                return layout != null;
        }
        return super.eIsSet(featureID);
    }

} //RectangleEllipseLayoutImpl
