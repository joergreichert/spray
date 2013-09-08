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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.spray.dev.pde.targetdef.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetDefFactoryImpl extends EFactoryImpl implements TargetDefFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TargetDefFactory init() {
        try {
            TargetDefFactory theTargetDefFactory = (TargetDefFactory)EPackage.Registry.INSTANCE.getEFactory(TargetDefPackage.eNS_URI);
            if (theTargetDefFactory != null) {
                return theTargetDefFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TargetDefFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDefFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TargetDefPackage.TARGET_DEFINITION: return createTargetDefinition();
            case TargetDefPackage.LOCATION: return createLocation();
            case TargetDefPackage.REPOSITORY: return createRepository();
            case TargetDefPackage.INSTALLABLE_UNIT: return createInstallableUnit();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDefinition createTargetDefinition() {
        TargetDefinitionImpl targetDefinition = new TargetDefinitionImpl();
        return targetDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location createLocation() {
        LocationImpl location = new LocationImpl();
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repository createRepository() {
        RepositoryImpl repository = new RepositoryImpl();
        return repository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstallableUnit createInstallableUnit() {
        InstallableUnitImpl installableUnit = new InstallableUnitImpl();
        return installableUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDefPackage getTargetDefPackage() {
        return (TargetDefPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TargetDefPackage getPackage() {
        return TargetDefPackage.eINSTANCE;
    }

} //TargetDefFactoryImpl
