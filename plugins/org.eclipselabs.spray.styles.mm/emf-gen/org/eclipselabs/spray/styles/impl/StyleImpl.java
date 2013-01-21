/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleImpl#getSuperStyle <em>Super Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleImpl#getSuperStyleFromDsl <em>Super Style From Dsl</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleImpl extends StyleContainerElementImpl implements Style
{
	/**
     * The cached value of the '{@link #getSuperStyle() <em>Super Style</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSuperStyle()
     * @generated
     * @ordered
     */
	protected JvmTypeReference superStyle;

	/**
     * The cached value of the '{@link #getSuperStyleFromDsl() <em>Super Style From Dsl</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSuperStyleFromDsl()
     * @generated
     * @ordered
     */
	protected Style superStyleFromDsl;

	/**
     * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLayout()
     * @generated
     * @ordered
     */
	protected StyleLayout layout;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StyleImpl()
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
        return StylesPackage.Literals.STYLE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JvmTypeReference getSuperStyle()
	{
        return superStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSuperStyle(JvmTypeReference newSuperStyle, NotificationChain msgs)
	{
        JvmTypeReference oldSuperStyle = superStyle;
        superStyle = newSuperStyle;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE__SUPER_STYLE, oldSuperStyle, newSuperStyle);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSuperStyle(JvmTypeReference newSuperStyle)
	{
        if (newSuperStyle != superStyle) {
            NotificationChain msgs = null;
            if (superStyle != null)
                msgs = ((InternalEObject)superStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE__SUPER_STYLE, null, msgs);
            if (newSuperStyle != null)
                msgs = ((InternalEObject)newSuperStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE__SUPER_STYLE, null, msgs);
            msgs = basicSetSuperStyle(newSuperStyle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE__SUPER_STYLE, newSuperStyle, newSuperStyle));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Style getSuperStyleFromDsl()
	{
        if (superStyleFromDsl != null && superStyleFromDsl.eIsProxy()) {
            InternalEObject oldSuperStyleFromDsl = (InternalEObject)superStyleFromDsl;
            superStyleFromDsl = (Style)eResolveProxy(oldSuperStyleFromDsl);
            if (superStyleFromDsl != oldSuperStyleFromDsl) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, StylesPackage.STYLE__SUPER_STYLE_FROM_DSL, oldSuperStyleFromDsl, superStyleFromDsl));
            }
        }
        return superStyleFromDsl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Style basicGetSuperStyleFromDsl()
	{
        return superStyleFromDsl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSuperStyleFromDsl(Style newSuperStyleFromDsl)
	{
        Style oldSuperStyleFromDsl = superStyleFromDsl;
        superStyleFromDsl = newSuperStyleFromDsl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE__SUPER_STYLE_FROM_DSL, oldSuperStyleFromDsl, superStyleFromDsl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StyleLayout getLayout()
	{
        return layout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLayout(StyleLayout newLayout, NotificationChain msgs)
	{
        StyleLayout oldLayout = layout;
        layout = newLayout;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE__LAYOUT, oldLayout, newLayout);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLayout(StyleLayout newLayout)
	{
        if (newLayout != layout) {
            NotificationChain msgs = null;
            if (layout != null)
                msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE__LAYOUT, null, msgs);
            if (newLayout != null)
                msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE__LAYOUT, null, msgs);
            msgs = basicSetLayout(newLayout, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE__LAYOUT, newLayout, newLayout));
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
            case StylesPackage.STYLE__SUPER_STYLE:
                return basicSetSuperStyle(null, msgs);
            case StylesPackage.STYLE__LAYOUT:
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
            case StylesPackage.STYLE__SUPER_STYLE:
                return getSuperStyle();
            case StylesPackage.STYLE__SUPER_STYLE_FROM_DSL:
                if (resolve) return getSuperStyleFromDsl();
                return basicGetSuperStyleFromDsl();
            case StylesPackage.STYLE__LAYOUT:
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
            case StylesPackage.STYLE__SUPER_STYLE:
                setSuperStyle((JvmTypeReference)newValue);
                return;
            case StylesPackage.STYLE__SUPER_STYLE_FROM_DSL:
                setSuperStyleFromDsl((Style)newValue);
                return;
            case StylesPackage.STYLE__LAYOUT:
                setLayout((StyleLayout)newValue);
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
            case StylesPackage.STYLE__SUPER_STYLE:
                setSuperStyle((JvmTypeReference)null);
                return;
            case StylesPackage.STYLE__SUPER_STYLE_FROM_DSL:
                setSuperStyleFromDsl((Style)null);
                return;
            case StylesPackage.STYLE__LAYOUT:
                setLayout((StyleLayout)null);
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
            case StylesPackage.STYLE__SUPER_STYLE:
                return superStyle != null;
            case StylesPackage.STYLE__SUPER_STYLE_FROM_DSL:
                return superStyleFromDsl != null;
            case StylesPackage.STYLE__LAYOUT:
                return layout != null;
        }
        return super.eIsSet(featureID);
    }

} //StyleImpl
