/*******************************************************************************
 * Copyright (c) 2013 The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipselabs.spray.dev.pde.targetdef.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit;
import org.eclipselabs.spray.dev.pde.targetdef.Location;
import org.eclipselabs.spray.dev.pde.targetdef.Repository;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.impl.LocationImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.impl.LocationImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
    /**
     * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepository()
     * @generated
     * @ordered
     */
    protected Repository repository;

    /**
     * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected EList<InstallableUnit> units;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetDefPackage.Literals.LOCATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
        Repository oldRepository = repository;
        repository = newRepository;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetDefPackage.LOCATION__REPOSITORY, oldRepository, newRepository);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepository(Repository newRepository) {
        if (newRepository != repository) {
            NotificationChain msgs = null;
            if (repository != null)
                msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetDefPackage.LOCATION__REPOSITORY, null, msgs);
            if (newRepository != null)
                msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetDefPackage.LOCATION__REPOSITORY, null, msgs);
            msgs = basicSetRepository(newRepository, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetDefPackage.LOCATION__REPOSITORY, newRepository, newRepository));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InstallableUnit> getUnits() {
        if (units == null) {
            units = new EObjectContainmentEList<InstallableUnit>(InstallableUnit.class, this, TargetDefPackage.LOCATION__UNITS);
        }
        return units;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TargetDefPackage.LOCATION__REPOSITORY:
                return basicSetRepository(null, msgs);
            case TargetDefPackage.LOCATION__UNITS:
                return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
            case TargetDefPackage.LOCATION__REPOSITORY:
                return getRepository();
            case TargetDefPackage.LOCATION__UNITS:
                return getUnits();
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
            case TargetDefPackage.LOCATION__REPOSITORY:
                setRepository((Repository)newValue);
                return;
            case TargetDefPackage.LOCATION__UNITS:
                getUnits().clear();
                getUnits().addAll((Collection<? extends InstallableUnit>)newValue);
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
            case TargetDefPackage.LOCATION__REPOSITORY:
                setRepository((Repository)null);
                return;
            case TargetDefPackage.LOCATION__UNITS:
                getUnits().clear();
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
            case TargetDefPackage.LOCATION__REPOSITORY:
                return repository != null;
            case TargetDefPackage.LOCATION__UNITS:
                return units != null && !units.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LocationImpl
