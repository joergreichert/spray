/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.IAbstractType;
import BusinessDomainDsl.IAssociation;
import BusinessDomainDsl.IBusinessDomainDslPackage;
import BusinessDomainDsl.IBusinessDomainModel;
import BusinessDomainDsl.IEnumeration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.BusinessDomainModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessDomainModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessDomainModelImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessDomainModelImpl extends ModelElementImpl implements IBusinessDomainModel {
    /**
     * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerations()
     * @generated
     * @ordered
     */
    protected EList<IEnumeration> enumerations;

    /**
     * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypes()
     * @generated
     * @ordered
     */
    protected EList<IAbstractType> types;

    /**
     * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociations()
     * @generated
     * @ordered
     */
    protected EList<IAssociation> associations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessDomainModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IBusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IEnumeration> getEnumerations() {
        if (enumerations == null) {
            enumerations = new EObjectContainmentWithInverseEList<IEnumeration>(IEnumeration.class, this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS, IBusinessDomainDslPackage.ENUMERATION__MODEL);
        }
        return enumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IAbstractType> getTypes() {
        if (types == null) {
            types = new EObjectContainmentWithInverseEList<IAbstractType>(IAbstractType.class, this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES, IBusinessDomainDslPackage.ABSTRACT_TYPE__MODEL);
        }
        return types;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IAssociation> getAssociations() {
        if (associations == null) {
            associations = new EObjectContainmentWithInverseEList<IAssociation>(IAssociation.class, this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS, IBusinessDomainDslPackage.ASSOCIATION__MODEL);
        }
        return associations;
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
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerations()).basicAdd(otherEnd, msgs);
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociations()).basicAdd(otherEnd, msgs);
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
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS:
                return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES:
                return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
                return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS:
                return getEnumerations();
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES:
                return getTypes();
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
                return getAssociations();
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
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS:
                getEnumerations().clear();
                getEnumerations().addAll((Collection<? extends IEnumeration>)newValue);
                return;
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES:
                getTypes().clear();
                getTypes().addAll((Collection<? extends IAbstractType>)newValue);
                return;
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
                getAssociations().clear();
                getAssociations().addAll((Collection<? extends IAssociation>)newValue);
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
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS:
                getEnumerations().clear();
                return;
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES:
                getTypes().clear();
                return;
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
                getAssociations().clear();
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
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS:
                return enumerations != null && !enumerations.isEmpty();
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__TYPES:
                return types != null && !types.isEmpty();
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
                return associations != null && !associations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BusinessDomainModelImpl
