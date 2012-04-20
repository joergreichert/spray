/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.IAbstractBusinessRule;
import BusinessDomainDsl.IBusinessClass;
import BusinessDomainDsl.IBusinessDomainDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.AbstractBusinessRuleImpl#getBusinessClass <em>Business Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBusinessRuleImpl extends ModelElementImpl implements IAbstractBusinessRule {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractBusinessRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IBusinessDomainDslPackage.Literals.ABSTRACT_BUSINESS_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClass getBusinessClass() {
        if (eContainerFeatureID() != IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS) return null;
        return (IBusinessClass)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessClass(IBusinessClass newBusinessClass, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBusinessClass, IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBusinessClass(IBusinessClass newBusinessClass) {
        if (newBusinessClass != eInternalContainer() || (eContainerFeatureID() != IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS && newBusinessClass != null)) {
            if (EcoreUtil.isAncestor(this, newBusinessClass))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBusinessClass != null)
                msgs = ((InternalEObject)newBusinessClass).eInverseAdd(this, IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES, IBusinessClass.class, msgs);
            msgs = basicSetBusinessClass(newBusinessClass, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS, newBusinessClass, newBusinessClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBusinessClass((IBusinessClass)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                return basicSetBusinessClass(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                return eInternalContainer().eInverseRemove(this, IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES, IBusinessClass.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                return getBusinessClass();
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
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                setBusinessClass((IBusinessClass)newValue);
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
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                setBusinessClass((IBusinessClass)null);
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
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS:
                return getBusinessClass() != null;
        }
        return super.eIsSet(featureID);
    }

} //AbstractBusinessRuleImpl
