/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.CompartmentLayout;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.TextBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#getCompartmentLayout <em>Compartment Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#getStretchH <em>Stretch H</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#getStretchV <em>Stretch V</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentInfoImpl extends MinimalEObjectImpl.Container implements CompartmentInfo
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
     * The default value of the '{@link #getStretchH() <em>Stretch H</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStretchH()
     * @generated
     * @ordered
     */
	protected static final Boolean STRETCH_H_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStretchH() <em>Stretch H</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStretchH()
     * @generated
     * @ordered
     */
	protected Boolean stretchH = STRETCH_H_EDEFAULT;

	/**
     * The default value of the '{@link #getStretchV() <em>Stretch V</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStretchV()
     * @generated
     * @ordered
     */
	protected static final Boolean STRETCH_V_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStretchV() <em>Stretch V</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStretchV()
     * @generated
     * @ordered
     */
	protected Boolean stretchV = STRETCH_V_EDEFAULT;

	/**
     * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSpacing()
     * @generated
     * @ordered
     */
	protected static final int SPACING_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSpacing()
     * @generated
     * @ordered
     */
	protected int spacing = SPACING_EDEFAULT;

	/**
     * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMargin()
     * @generated
     * @ordered
     */
	protected static final int MARGIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMargin()
     * @generated
     * @ordered
     */
	protected int margin = MARGIN_EDEFAULT;

	/**
     * The default value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isInvisible()
     * @generated
     * @ordered
     */
	protected static final boolean INVISIBLE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isInvisible()
     * @generated
     * @ordered
     */
	protected boolean invisible = INVISIBLE_EDEFAULT;

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
	protected CompartmentInfoImpl()
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
        return ShapesPackage.Literals.COMPARTMENT_INFO;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__COMPARTMENT_LAYOUT, oldCompartmentLayout, compartmentLayout));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getStretchH()
	{
        return stretchH;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStretchH(Boolean newStretchH)
	{
        Boolean oldStretchH = stretchH;
        stretchH = newStretchH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__STRETCH_H, oldStretchH, stretchH));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getStretchV()
	{
        return stretchV;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStretchV(Boolean newStretchV)
	{
        Boolean oldStretchV = stretchV;
        stretchV = newStretchV;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__STRETCH_V, oldStretchV, stretchV));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getSpacing()
	{
        return spacing;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSpacing(int newSpacing)
	{
        int oldSpacing = spacing;
        spacing = newSpacing;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__SPACING, oldSpacing, spacing));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMargin()
	{
        return margin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMargin(int newMargin)
	{
        int oldMargin = margin;
        margin = newMargin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__MARGIN, oldMargin, margin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isInvisible()
	{
        return invisible;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInvisible(boolean newInvisible)
	{
        boolean oldInvisible = invisible;
        invisible = newInvisible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__INVISIBLE, oldInvisible, invisible));
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
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__ID, oldId, newId);
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
        if (newId != id) {
            NotificationChain msgs = null;
            if (id != null)
                msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT_INFO__ID, null, msgs);
            if (newId != null)
                msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPARTMENT_INFO__ID, null, msgs);
            msgs = basicSetId(newId, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPARTMENT_INFO__ID, newId, newId));
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
            case ShapesPackage.COMPARTMENT_INFO__ID:
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
        switch (featureID) {
            case ShapesPackage.COMPARTMENT_INFO__COMPARTMENT_LAYOUT:
                return getCompartmentLayout();
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_H:
                return getStretchH();
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_V:
                return getStretchV();
            case ShapesPackage.COMPARTMENT_INFO__SPACING:
                return getSpacing();
            case ShapesPackage.COMPARTMENT_INFO__MARGIN:
                return getMargin();
            case ShapesPackage.COMPARTMENT_INFO__INVISIBLE:
                return isInvisible();
            case ShapesPackage.COMPARTMENT_INFO__ID:
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
        switch (featureID) {
            case ShapesPackage.COMPARTMENT_INFO__COMPARTMENT_LAYOUT:
                setCompartmentLayout((CompartmentLayout)newValue);
                return;
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_H:
                setStretchH((Boolean)newValue);
                return;
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_V:
                setStretchV((Boolean)newValue);
                return;
            case ShapesPackage.COMPARTMENT_INFO__SPACING:
                setSpacing((Integer)newValue);
                return;
            case ShapesPackage.COMPARTMENT_INFO__MARGIN:
                setMargin((Integer)newValue);
                return;
            case ShapesPackage.COMPARTMENT_INFO__INVISIBLE:
                setInvisible((Boolean)newValue);
                return;
            case ShapesPackage.COMPARTMENT_INFO__ID:
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
        switch (featureID) {
            case ShapesPackage.COMPARTMENT_INFO__COMPARTMENT_LAYOUT:
                setCompartmentLayout(COMPARTMENT_LAYOUT_EDEFAULT);
                return;
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_H:
                setStretchH(STRETCH_H_EDEFAULT);
                return;
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_V:
                setStretchV(STRETCH_V_EDEFAULT);
                return;
            case ShapesPackage.COMPARTMENT_INFO__SPACING:
                setSpacing(SPACING_EDEFAULT);
                return;
            case ShapesPackage.COMPARTMENT_INFO__MARGIN:
                setMargin(MARGIN_EDEFAULT);
                return;
            case ShapesPackage.COMPARTMENT_INFO__INVISIBLE:
                setInvisible(INVISIBLE_EDEFAULT);
                return;
            case ShapesPackage.COMPARTMENT_INFO__ID:
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
        switch (featureID) {
            case ShapesPackage.COMPARTMENT_INFO__COMPARTMENT_LAYOUT:
                return compartmentLayout != COMPARTMENT_LAYOUT_EDEFAULT;
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_H:
                return STRETCH_H_EDEFAULT == null ? stretchH != null : !STRETCH_H_EDEFAULT.equals(stretchH);
            case ShapesPackage.COMPARTMENT_INFO__STRETCH_V:
                return STRETCH_V_EDEFAULT == null ? stretchV != null : !STRETCH_V_EDEFAULT.equals(stretchV);
            case ShapesPackage.COMPARTMENT_INFO__SPACING:
                return spacing != SPACING_EDEFAULT;
            case ShapesPackage.COMPARTMENT_INFO__MARGIN:
                return margin != MARGIN_EDEFAULT;
            case ShapesPackage.COMPARTMENT_INFO__INVISIBLE:
                return invisible != INVISIBLE_EDEFAULT;
            case ShapesPackage.COMPARTMENT_INFO__ID:
                return id != null;
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
        result.append(", stretchH: ");
        result.append(stretchH);
        result.append(", stretchV: ");
        result.append(stretchV);
        result.append(", spacing: ");
        result.append(spacing);
        result.append(", margin: ");
        result.append(margin);
        result.append(", invisible: ");
        result.append(invisible);
        result.append(')');
        return result.toString();
    }

} //CompartmentInfoImpl
