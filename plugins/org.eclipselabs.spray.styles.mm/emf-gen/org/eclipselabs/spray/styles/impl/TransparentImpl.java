/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.spray.styles.Transparent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transparent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.TransparentImpl#isTransparent <em>Transparent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransparentImpl extends ColorOrGradientImpl implements Transparent
{
	/**
     * The default value of the '{@link #isTransparent() <em>Transparent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isTransparent()
     * @generated
     * @ordered
     */
	protected static final boolean TRANSPARENT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isTransparent() <em>Transparent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isTransparent()
     * @generated
     * @ordered
     */
	protected boolean transparent = TRANSPARENT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TransparentImpl()
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
        return StylesPackage.Literals.TRANSPARENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isTransparent()
	{
        return transparent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransparent(boolean newTransparent)
	{
        boolean oldTransparent = transparent;
        transparent = newTransparent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.TRANSPARENT__TRANSPARENT, oldTransparent, transparent));
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
            case StylesPackage.TRANSPARENT__TRANSPARENT:
                return isTransparent();
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
            case StylesPackage.TRANSPARENT__TRANSPARENT:
                setTransparent((Boolean)newValue);
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
            case StylesPackage.TRANSPARENT__TRANSPARENT:
                setTransparent(TRANSPARENT_EDEFAULT);
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
            case StylesPackage.TRANSPARENT__TRANSPARENT:
                return transparent != TRANSPARENT_EDEFAULT;
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
        result.append(" (transparent: ");
        result.append(transparent);
        result.append(')');
        return result.toString();
    }

} //TransparentImpl
