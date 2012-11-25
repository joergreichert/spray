/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientRef;
import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.GradientRefImpl#getGradientRef <em>Gradient Ref</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.GradientRefImpl#getGradientRefFromDsl <em>Gradient Ref From Dsl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradientRefImpl extends ColorOrGradientImpl implements GradientRef {
    /**
     * The cached value of the '{@link #getGradientRef() <em>Gradient Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGradientRef()
     * @generated
     * @ordered
     */
    protected JvmTypeReference gradientRef;

    /**
     * The cached value of the '{@link #getGradientRefFromDsl() <em>Gradient Ref From Dsl</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGradientRefFromDsl()
     * @generated
     * @ordered
     */
    protected Gradient gradientRefFromDsl;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GradientRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StylesPackage.Literals.GRADIENT_REF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JvmTypeReference getGradientRef() {
        return gradientRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGradientRef(JvmTypeReference newGradientRef, NotificationChain msgs) {
        JvmTypeReference oldGradientRef = gradientRef;
        gradientRef = newGradientRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.GRADIENT_REF__GRADIENT_REF, oldGradientRef, newGradientRef);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGradientRef(JvmTypeReference newGradientRef) {
        if (newGradientRef != gradientRef) {
            NotificationChain msgs = null;
            if (gradientRef != null)
                msgs = ((InternalEObject)gradientRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.GRADIENT_REF__GRADIENT_REF, null, msgs);
            if (newGradientRef != null)
                msgs = ((InternalEObject)newGradientRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.GRADIENT_REF__GRADIENT_REF, null, msgs);
            msgs = basicSetGradientRef(newGradientRef, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.GRADIENT_REF__GRADIENT_REF, newGradientRef, newGradientRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gradient getGradientRefFromDsl() {
        if (gradientRefFromDsl != null && gradientRefFromDsl.eIsProxy()) {
            InternalEObject oldGradientRefFromDsl = (InternalEObject)gradientRefFromDsl;
            gradientRefFromDsl = (Gradient)eResolveProxy(oldGradientRefFromDsl);
            if (gradientRefFromDsl != oldGradientRefFromDsl) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, StylesPackage.GRADIENT_REF__GRADIENT_REF_FROM_DSL, oldGradientRefFromDsl, gradientRefFromDsl));
            }
        }
        return gradientRefFromDsl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gradient basicGetGradientRefFromDsl() {
        return gradientRefFromDsl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGradientRefFromDsl(Gradient newGradientRefFromDsl) {
        Gradient oldGradientRefFromDsl = gradientRefFromDsl;
        gradientRefFromDsl = newGradientRefFromDsl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.GRADIENT_REF__GRADIENT_REF_FROM_DSL, oldGradientRefFromDsl, gradientRefFromDsl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case StylesPackage.GRADIENT_REF__GRADIENT_REF:
                return basicSetGradientRef(null, msgs);
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
            case StylesPackage.GRADIENT_REF__GRADIENT_REF:
                return getGradientRef();
            case StylesPackage.GRADIENT_REF__GRADIENT_REF_FROM_DSL:
                if (resolve) return getGradientRefFromDsl();
                return basicGetGradientRefFromDsl();
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
            case StylesPackage.GRADIENT_REF__GRADIENT_REF:
                setGradientRef((JvmTypeReference)newValue);
                return;
            case StylesPackage.GRADIENT_REF__GRADIENT_REF_FROM_DSL:
                setGradientRefFromDsl((Gradient)newValue);
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
            case StylesPackage.GRADIENT_REF__GRADIENT_REF:
                setGradientRef((JvmTypeReference)null);
                return;
            case StylesPackage.GRADIENT_REF__GRADIENT_REF_FROM_DSL:
                setGradientRefFromDsl((Gradient)null);
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
            case StylesPackage.GRADIENT_REF__GRADIENT_REF:
                return gradientRef != null;
            case StylesPackage.GRADIENT_REF__GRADIENT_REF_FROM_DSL:
                return gradientRefFromDsl != null;
        }
        return super.eIsSet(featureID);
    }

} //GradientRefImpl
