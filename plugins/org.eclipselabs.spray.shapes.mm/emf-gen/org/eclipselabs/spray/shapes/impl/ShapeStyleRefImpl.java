/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.ShapesPackage;

import org.eclipselabs.spray.styles.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Style Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeStyleRefImpl#getJavaStyle <em>Java Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeStyleRefImpl#getDslStyle <em>Dsl Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeStyleRefImpl extends MinimalEObjectImpl.Container implements ShapeStyleRef
{
	/**
     * The cached value of the '{@link #getJavaStyle() <em>Java Style</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJavaStyle()
     * @generated
     * @ordered
     */
	protected JvmTypeReference javaStyle;

	/**
     * The cached value of the '{@link #getDslStyle() <em>Dsl Style</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDslStyle()
     * @generated
     * @ordered
     */
	protected Style dslStyle;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ShapeStyleRefImpl()
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
        return ShapesPackage.Literals.SHAPE_STYLE_REF;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JvmTypeReference getJavaStyle()
	{
        return javaStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJavaStyle(JvmTypeReference newJavaStyle, NotificationChain msgs)
	{
        JvmTypeReference oldJavaStyle = javaStyle;
        javaStyle = newJavaStyle;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE, oldJavaStyle, newJavaStyle);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJavaStyle(JvmTypeReference newJavaStyle)
	{
        if (newJavaStyle != javaStyle) {
            NotificationChain msgs = null;
            if (javaStyle != null)
                msgs = ((InternalEObject)javaStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE, null, msgs);
            if (newJavaStyle != null)
                msgs = ((InternalEObject)newJavaStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE, null, msgs);
            msgs = basicSetJavaStyle(newJavaStyle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE, newJavaStyle, newJavaStyle));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Style getDslStyle()
	{
        if (dslStyle != null && dslStyle.eIsProxy()) {
            InternalEObject oldDslStyle = (InternalEObject)dslStyle;
            dslStyle = (Style)eResolveProxy(oldDslStyle);
            if (dslStyle != oldDslStyle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShapesPackage.SHAPE_STYLE_REF__DSL_STYLE, oldDslStyle, dslStyle));
            }
        }
        return dslStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Style basicGetDslStyle()
	{
        return dslStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDslStyle(Style newDslStyle)
	{
        Style oldDslStyle = dslStyle;
        dslStyle = newDslStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPE_STYLE_REF__DSL_STYLE, oldDslStyle, dslStyle));
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
            case ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE:
                return basicSetJavaStyle(null, msgs);
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
            case ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE:
                return getJavaStyle();
            case ShapesPackage.SHAPE_STYLE_REF__DSL_STYLE:
                if (resolve) return getDslStyle();
                return basicGetDslStyle();
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
            case ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE:
                setJavaStyle((JvmTypeReference)newValue);
                return;
            case ShapesPackage.SHAPE_STYLE_REF__DSL_STYLE:
                setDslStyle((Style)newValue);
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
            case ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE:
                setJavaStyle((JvmTypeReference)null);
                return;
            case ShapesPackage.SHAPE_STYLE_REF__DSL_STYLE:
                setDslStyle((Style)null);
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
            case ShapesPackage.SHAPE_STYLE_REF__JAVA_STYLE:
                return javaStyle != null;
            case ShapesPackage.SHAPE_STYLE_REF__DSL_STYLE:
                return dslStyle != null;
        }
        return super.eIsSet(featureID);
    }

} //ShapeStyleRefImpl
