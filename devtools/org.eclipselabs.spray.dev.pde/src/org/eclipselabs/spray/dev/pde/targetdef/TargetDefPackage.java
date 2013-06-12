/**
 */
package org.eclipselabs.spray.dev.pde.targetdef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefFactory
 * @model kind="package"
 * @generated
 */
public interface TargetDefPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "targetdef";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://code.google.com/a/eclipselabs.org/p/spray/targetdef";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "targetdef";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TargetDefPackage eINSTANCE = org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefinitionImpl <em>Target Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefinitionImpl
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getTargetDefinition()
     * @generated
     */
    int TARGET_DEFINITION = 0;

    /**
     * The feature id for the '<em><b>Locations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEFINITION__LOCATIONS = 0;

    /**
     * The number of structural features of the '<em>Target Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEFINITION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Target Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEFINITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.LocationImpl
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getLocation()
     * @generated
     */
    int LOCATION = 1;

    /**
     * The feature id for the '<em><b>Repository</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION__REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION__UNITS = 1;

    /**
     * The number of structural features of the '<em>Location</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Location</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.RepositoryImpl
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getRepository()
     * @generated
     */
    int REPOSITORY = 2;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY__LOCATION = 0;

    /**
     * The number of structural features of the '<em>Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.InstallableUnitImpl <em>Installable Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.InstallableUnitImpl
     * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getInstallableUnit()
     * @generated
     */
    int INSTALLABLE_UNIT = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTALLABLE_UNIT__ID = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTALLABLE_UNIT__VERSION = 1;

    /**
     * The number of structural features of the '<em>Installable Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTALLABLE_UNIT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Installable Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTALLABLE_UNIT_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition <em>Target Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Target Definition</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition
     * @generated
     */
    EClass getTargetDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition#getLocations <em>Locations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Locations</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition#getLocations()
     * @see #getTargetDefinition()
     * @generated
     */
    EReference getTargetDefinition_Locations();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.dev.pde.targetdef.Location <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Location</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.Location
     * @generated
     */
    EClass getLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.dev.pde.targetdef.Location#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Repository</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.Location#getRepository()
     * @see #getLocation()
     * @generated
     */
    EReference getLocation_Repository();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.dev.pde.targetdef.Location#getUnits <em>Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Units</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.Location#getUnits()
     * @see #getLocation()
     * @generated
     */
    EReference getLocation_Units();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.dev.pde.targetdef.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repository</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.Repository
     * @generated
     */
    EClass getRepository();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.dev.pde.targetdef.Repository#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.Repository#getLocation()
     * @see #getRepository()
     * @generated
     */
    EAttribute getRepository_Location();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit <em>Installable Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Installable Unit</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit
     * @generated
     */
    EClass getInstallableUnit();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getId()
     * @see #getInstallableUnit()
     * @generated
     */
    EAttribute getInstallableUnit_Id();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getVersion()
     * @see #getInstallableUnit()
     * @generated
     */
    EAttribute getInstallableUnit_Version();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TargetDefFactory getTargetDefFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefinitionImpl <em>Target Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefinitionImpl
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getTargetDefinition()
         * @generated
         */
        EClass TARGET_DEFINITION = eINSTANCE.getTargetDefinition();

        /**
         * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TARGET_DEFINITION__LOCATIONS = eINSTANCE.getTargetDefinition_Locations();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.LocationImpl <em>Location</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.LocationImpl
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getLocation()
         * @generated
         */
        EClass LOCATION = eINSTANCE.getLocation();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION__REPOSITORY = eINSTANCE.getLocation_Repository();

        /**
         * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION__UNITS = eINSTANCE.getLocation_Units();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.RepositoryImpl <em>Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.RepositoryImpl
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getRepository()
         * @generated
         */
        EClass REPOSITORY = eINSTANCE.getRepository();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REPOSITORY__LOCATION = eINSTANCE.getRepository_Location();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.dev.pde.targetdef.impl.InstallableUnitImpl <em>Installable Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.InstallableUnitImpl
         * @see org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefPackageImpl#getInstallableUnit()
         * @generated
         */
        EClass INSTALLABLE_UNIT = eINSTANCE.getInstallableUnit();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INSTALLABLE_UNIT__ID = eINSTANCE.getInstallableUnit_Id();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INSTALLABLE_UNIT__VERSION = eINSTANCE.getInstallableUnit_Version();

    }

} //TargetDefPackage
