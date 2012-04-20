/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.IAbstractBusinessRule;
import BusinessDomainDsl.IAssociation;
import BusinessDomainDsl.IBusinessClass;
import BusinessDomainDsl.IBusinessDomainDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getBusinessRules <em>Business Rules</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getAssociationsTo <em>Associations To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassImpl extends AbstractBusinessClassImpl implements IBusinessClass {
    /**
     * The cached value of the '{@link #getBusinessRules() <em>Business Rules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessRules()
     * @generated
     * @ordered
     */
    protected EList<IAbstractBusinessRule> businessRules;

    /**
     * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperclass()
     * @generated
     * @ordered
     */
    protected IBusinessClass superclass;

    /**
     * The cached value of the '{@link #getAssociationsTo() <em>Associations To</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociationsTo()
     * @generated
     * @ordered
     */
    protected EList<IAssociation> associationsTo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IBusinessDomainDslPackage.Literals.BUSINESS_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IAbstractBusinessRule> getBusinessRules() {
        if (businessRules == null) {
            businessRules = new EObjectContainmentWithInverseEList<IAbstractBusinessRule>(IAbstractBusinessRule.class, this, IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES, IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS);
        }
        return businessRules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClass getSuperclass() {
        if (superclass != null && superclass.eIsProxy()) {
            InternalEObject oldSuperclass = (InternalEObject)superclass;
            superclass = (IBusinessClass)eResolveProxy(oldSuperclass);
            if (superclass != oldSuperclass) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, IBusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS, oldSuperclass, superclass));
            }
        }
        return superclass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClass basicGetSuperclass() {
        return superclass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperclass(IBusinessClass newSuperclass) {
        IBusinessClass oldSuperclass = superclass;
        superclass = newSuperclass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS, oldSuperclass, superclass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IAssociation> getAssociationsTo() {
        if (associationsTo == null) {
            associationsTo = new EObjectWithInverseResolvingEList<IAssociation>(IAssociation.class, this, IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, IBusinessDomainDslPackage.ASSOCIATION__SOURCE);
        }
        return associationsTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessRules()).basicAdd(otherEnd, msgs);
            case IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationsTo()).basicAdd(otherEnd, msgs);
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
            case IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return ((InternalEList<?>)getBusinessRules()).basicRemove(otherEnd, msgs);
            case IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return ((InternalEList<?>)getAssociationsTo()).basicRemove(otherEnd, msgs);
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
            case IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return getBusinessRules();
            case IBusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                if (resolve) return getSuperclass();
                return basicGetSuperclass();
            case IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return getAssociationsTo();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                getBusinessRules().clear();
                getBusinessRules().addAll((Collection<? extends IAbstractBusinessRule>)newValue);
                return;
            case IBusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                setSuperclass((IBusinessClass)newValue);
                return;
            case IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                getAssociationsTo().clear();
                getAssociationsTo().addAll((Collection<? extends IAssociation>)newValue);
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
            case IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                getBusinessRules().clear();
                return;
            case IBusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                setSuperclass((IBusinessClass)null);
                return;
            case IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                getAssociationsTo().clear();
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
            case IBusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return businessRules != null && !businessRules.isEmpty();
            case IBusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                return superclass != null;
            case IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return associationsTo != null && !associationsTo.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BusinessClassImpl
