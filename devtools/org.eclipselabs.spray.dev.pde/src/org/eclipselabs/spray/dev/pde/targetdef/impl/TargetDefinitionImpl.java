/**
 */
package org.eclipselabs.spray.dev.pde.targetdef.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.dev.pde.targetdef.Location;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefinitionImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetDefinitionImpl extends MinimalEObjectImpl.Container implements TargetDefinition {
    /**
     * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocations()
     * @generated
     * @ordered
     */
    protected EList<Location> locations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TargetDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetDefPackage.Literals.TARGET_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Location> getLocations() {
        if (locations == null) {
            locations = new EObjectContainmentEList<Location>(Location.class, this, TargetDefPackage.TARGET_DEFINITION__LOCATIONS);
        }
        return locations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TargetDefPackage.TARGET_DEFINITION__LOCATIONS:
                return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
            case TargetDefPackage.TARGET_DEFINITION__LOCATIONS:
                return getLocations();
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
            case TargetDefPackage.TARGET_DEFINITION__LOCATIONS:
                getLocations().clear();
                getLocations().addAll((Collection<? extends Location>)newValue);
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
            case TargetDefPackage.TARGET_DEFINITION__LOCATIONS:
                getLocations().clear();
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
            case TargetDefPackage.TARGET_DEFINITION__LOCATIONS:
                return locations != null && !locations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TargetDefinitionImpl
