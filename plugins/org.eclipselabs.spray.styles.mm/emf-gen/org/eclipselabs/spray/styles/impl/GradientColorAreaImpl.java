/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.GradientColorArea;
import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Color Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.GradientColorAreaImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.GradientColorAreaImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradientColorAreaImpl extends MinimalEObjectImpl.Container implements GradientColorArea
{
	/**
     * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
	protected Color color;

	/**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
	protected double offset = OFFSET_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GradientColorAreaImpl()
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
        return StylesPackage.Literals.GRADIENT_COLOR_AREA;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Color getColor()
	{
        return color;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
	{
        Color oldColor = color;
        color = newColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.GRADIENT_COLOR_AREA__COLOR, oldColor, newColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColor(Color newColor)
	{
        if (newColor != color) {
            NotificationChain msgs = null;
            if (color != null)
                msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.GRADIENT_COLOR_AREA__COLOR, null, msgs);
            if (newColor != null)
                msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.GRADIENT_COLOR_AREA__COLOR, null, msgs);
            msgs = basicSetColor(newColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.GRADIENT_COLOR_AREA__COLOR, newColor, newColor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public double getOffset()
	{
        return offset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOffset(double newOffset)
	{
        double oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.GRADIENT_COLOR_AREA__OFFSET, oldOffset, offset));
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
            case StylesPackage.GRADIENT_COLOR_AREA__COLOR:
                return basicSetColor(null, msgs);
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
            case StylesPackage.GRADIENT_COLOR_AREA__COLOR:
                return getColor();
            case StylesPackage.GRADIENT_COLOR_AREA__OFFSET:
                return getOffset();
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
            case StylesPackage.GRADIENT_COLOR_AREA__COLOR:
                setColor((Color)newValue);
                return;
            case StylesPackage.GRADIENT_COLOR_AREA__OFFSET:
                setOffset((Double)newValue);
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
            case StylesPackage.GRADIENT_COLOR_AREA__COLOR:
                setColor((Color)null);
                return;
            case StylesPackage.GRADIENT_COLOR_AREA__OFFSET:
                setOffset(OFFSET_EDEFAULT);
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
            case StylesPackage.GRADIENT_COLOR_AREA__COLOR:
                return color != null;
            case StylesPackage.GRADIENT_COLOR_AREA__OFFSET:
                return offset != OFFSET_EDEFAULT;
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
        result.append(" (offset: ");
        result.append(offset);
        result.append(')');
        return result.toString();
    }

} //GradientColorAreaImpl
