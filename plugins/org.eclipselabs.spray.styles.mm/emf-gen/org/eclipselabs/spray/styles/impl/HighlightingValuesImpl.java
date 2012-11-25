/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.HighlightingValues;
import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highlighting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.HighlightingValuesImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.HighlightingValuesImpl#getMultiselected <em>Multiselected</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.HighlightingValuesImpl#getAllowed <em>Allowed</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.HighlightingValuesImpl#getUnallowed <em>Unallowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HighlightingValuesImpl extends MinimalEObjectImpl.Container implements HighlightingValues {
    /**
     * The cached value of the '{@link #getSelected() <em>Selected</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelected()
     * @generated
     * @ordered
     */
    protected ColorOrGradient selected;

    /**
     * The cached value of the '{@link #getMultiselected() <em>Multiselected</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiselected()
     * @generated
     * @ordered
     */
    protected ColorOrGradient multiselected;

    /**
     * The cached value of the '{@link #getAllowed() <em>Allowed</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllowed()
     * @generated
     * @ordered
     */
    protected ColorOrGradient allowed;

    /**
     * The cached value of the '{@link #getUnallowed() <em>Unallowed</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnallowed()
     * @generated
     * @ordered
     */
    protected ColorOrGradient unallowed;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HighlightingValuesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StylesPackage.Literals.HIGHLIGHTING_VALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorOrGradient getSelected() {
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelected(ColorOrGradient newSelected, NotificationChain msgs) {
        ColorOrGradient oldSelected = selected;
        selected = newSelected;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__SELECTED, oldSelected, newSelected);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelected(ColorOrGradient newSelected) {
        if (newSelected != selected) {
            NotificationChain msgs = null;
            if (selected != null)
                msgs = ((InternalEObject)selected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__SELECTED, null, msgs);
            if (newSelected != null)
                msgs = ((InternalEObject)newSelected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__SELECTED, null, msgs);
            msgs = basicSetSelected(newSelected, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__SELECTED, newSelected, newSelected));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorOrGradient getMultiselected() {
        return multiselected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMultiselected(ColorOrGradient newMultiselected, NotificationChain msgs) {
        ColorOrGradient oldMultiselected = multiselected;
        multiselected = newMultiselected;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED, oldMultiselected, newMultiselected);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiselected(ColorOrGradient newMultiselected) {
        if (newMultiselected != multiselected) {
            NotificationChain msgs = null;
            if (multiselected != null)
                msgs = ((InternalEObject)multiselected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED, null, msgs);
            if (newMultiselected != null)
                msgs = ((InternalEObject)newMultiselected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED, null, msgs);
            msgs = basicSetMultiselected(newMultiselected, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED, newMultiselected, newMultiselected));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorOrGradient getAllowed() {
        return allowed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAllowed(ColorOrGradient newAllowed, NotificationChain msgs) {
        ColorOrGradient oldAllowed = allowed;
        allowed = newAllowed;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__ALLOWED, oldAllowed, newAllowed);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAllowed(ColorOrGradient newAllowed) {
        if (newAllowed != allowed) {
            NotificationChain msgs = null;
            if (allowed != null)
                msgs = ((InternalEObject)allowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__ALLOWED, null, msgs);
            if (newAllowed != null)
                msgs = ((InternalEObject)newAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__ALLOWED, null, msgs);
            msgs = basicSetAllowed(newAllowed, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__ALLOWED, newAllowed, newAllowed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorOrGradient getUnallowed() {
        return unallowed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUnallowed(ColorOrGradient newUnallowed, NotificationChain msgs) {
        ColorOrGradient oldUnallowed = unallowed;
        unallowed = newUnallowed;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED, oldUnallowed, newUnallowed);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnallowed(ColorOrGradient newUnallowed) {
        if (newUnallowed != unallowed) {
            NotificationChain msgs = null;
            if (unallowed != null)
                msgs = ((InternalEObject)unallowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED, null, msgs);
            if (newUnallowed != null)
                msgs = ((InternalEObject)newUnallowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED, null, msgs);
            msgs = basicSetUnallowed(newUnallowed, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED, newUnallowed, newUnallowed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case StylesPackage.HIGHLIGHTING_VALUES__SELECTED:
                return basicSetSelected(null, msgs);
            case StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED:
                return basicSetMultiselected(null, msgs);
            case StylesPackage.HIGHLIGHTING_VALUES__ALLOWED:
                return basicSetAllowed(null, msgs);
            case StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED:
                return basicSetUnallowed(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case StylesPackage.HIGHLIGHTING_VALUES__SELECTED:
                return getSelected();
            case StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED:
                return getMultiselected();
            case StylesPackage.HIGHLIGHTING_VALUES__ALLOWED:
                return getAllowed();
            case StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED:
                return getUnallowed();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case StylesPackage.HIGHLIGHTING_VALUES__SELECTED:
                setSelected((ColorOrGradient)newValue);
                return;
            case StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED:
                setMultiselected((ColorOrGradient)newValue);
                return;
            case StylesPackage.HIGHLIGHTING_VALUES__ALLOWED:
                setAllowed((ColorOrGradient)newValue);
                return;
            case StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED:
                setUnallowed((ColorOrGradient)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case StylesPackage.HIGHLIGHTING_VALUES__SELECTED:
                setSelected((ColorOrGradient)null);
                return;
            case StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED:
                setMultiselected((ColorOrGradient)null);
                return;
            case StylesPackage.HIGHLIGHTING_VALUES__ALLOWED:
                setAllowed((ColorOrGradient)null);
                return;
            case StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED:
                setUnallowed((ColorOrGradient)null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case StylesPackage.HIGHLIGHTING_VALUES__SELECTED:
                return selected != null;
            case StylesPackage.HIGHLIGHTING_VALUES__MULTISELECTED:
                return multiselected != null;
            case StylesPackage.HIGHLIGHTING_VALUES__ALLOWED:
                return allowed != null;
            case StylesPackage.HIGHLIGHTING_VALUES__UNALLOWED:
                return unallowed != null;
        }
        return super.eIsSet(featureID);
    }

} //HighlightingValuesImpl
