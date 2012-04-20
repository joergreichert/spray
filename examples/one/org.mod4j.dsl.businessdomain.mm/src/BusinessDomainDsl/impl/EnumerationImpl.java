/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.IBusinessDomainDslPackage;
import BusinessDomainDsl.IBusinessDomainModel;
import BusinessDomainDsl.IEnumeration;
import BusinessDomainDsl.IEnumerationLiteral;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends ModelElementImpl implements IEnumeration {
    /**
     * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerationLiterals()
     * @generated
     * @ordered
     */
    protected EList<IEnumerationLiteral> enumerationLiterals;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IBusinessDomainDslPackage.Literals.ENUMERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IEnumerationLiteral> getEnumerationLiterals() {
        if (enumerationLiterals == null) {
            enumerationLiterals = new EObjectContainmentWithInverseEList<IEnumerationLiteral>(IEnumerationLiteral.class, this, IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS, IBusinessDomainDslPackage.ENUMERATION_LITERAL__ENUMERATION);
        }
        return enumerationLiterals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessDomainModel getModel() {
        if (eContainerFeatureID() != IBusinessDomainDslPackage.ENUMERATION__MODEL) return null;
        return (IBusinessDomainModel)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(IBusinessDomainModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, IBusinessDomainDslPackage.ENUMERATION__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(IBusinessDomainModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != IBusinessDomainDslPackage.ENUMERATION__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS, IBusinessDomainModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ENUMERATION__MODEL, newModel, newModel));
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
            case IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerationLiterals()).basicAdd(otherEnd, msgs);
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((IBusinessDomainModel)otherEnd, msgs);
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
            case IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return ((InternalEList<?>)getEnumerationLiterals()).basicRemove(otherEnd, msgs);
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                return basicSetModel(null, msgs);
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
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                return eInternalContainer().eInverseRemove(this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS, IBusinessDomainModel.class, msgs);
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
            case IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return getEnumerationLiterals();
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                return getModel();
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
            case IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                getEnumerationLiterals().clear();
                getEnumerationLiterals().addAll((Collection<? extends IEnumerationLiteral>)newValue);
                return;
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                setModel((IBusinessDomainModel)newValue);
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
            case IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                getEnumerationLiterals().clear();
                return;
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                setModel((IBusinessDomainModel)null);
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
            case IBusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return enumerationLiterals != null && !enumerationLiterals.isEmpty();
            case IBusinessDomainDslPackage.ENUMERATION__MODEL:
                return getModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //EnumerationImpl
