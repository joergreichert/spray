/**
 */
package org.eclipselabs.spray.dev.pde.targetdef.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit;
import org.eclipselabs.spray.dev.pde.targetdef.Location;
import org.eclipselabs.spray.dev.pde.targetdef.Repository;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefFactory;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetDefPackageImpl extends EPackageImpl implements TargetDefPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass locationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repositoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass installableUnitEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TargetDefPackageImpl() {
        super(eNS_URI, TargetDefFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TargetDefPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TargetDefPackage init() {
        if (isInited) return (TargetDefPackage)EPackage.Registry.INSTANCE.getEPackage(TargetDefPackage.eNS_URI);

        // Obtain or create and register package
        TargetDefPackageImpl theTargetDefPackage = (TargetDefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TargetDefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TargetDefPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theTargetDefPackage.createPackageContents();

        // Initialize created meta-data
        theTargetDefPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTargetDefPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TargetDefPackage.eNS_URI, theTargetDefPackage);
        return theTargetDefPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTargetDefinition() {
        return targetDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTargetDefinition_Locations() {
        return (EReference)targetDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocation() {
        return locationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocation_Repository() {
        return (EReference)locationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocation_Units() {
        return (EReference)locationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepository() {
        return repositoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRepository_Location() {
        return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstallableUnit() {
        return installableUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableUnit_Id() {
        return (EAttribute)installableUnitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableUnit_Version() {
        return (EAttribute)installableUnitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDefFactory getTargetDefFactory() {
        return (TargetDefFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        targetDefinitionEClass = createEClass(TARGET_DEFINITION);
        createEReference(targetDefinitionEClass, TARGET_DEFINITION__LOCATIONS);

        locationEClass = createEClass(LOCATION);
        createEReference(locationEClass, LOCATION__REPOSITORY);
        createEReference(locationEClass, LOCATION__UNITS);

        repositoryEClass = createEClass(REPOSITORY);
        createEAttribute(repositoryEClass, REPOSITORY__LOCATION);

        installableUnitEClass = createEClass(INSTALLABLE_UNIT);
        createEAttribute(installableUnitEClass, INSTALLABLE_UNIT__ID);
        createEAttribute(installableUnitEClass, INSTALLABLE_UNIT__VERSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(targetDefinitionEClass, TargetDefinition.class, "TargetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTargetDefinition_Locations(), this.getLocation(), null, "locations", null, 0, -1, TargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocation_Repository(), this.getRepository(), null, "repository", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLocation_Units(), this.getInstallableUnit(), null, "units", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRepository_Location(), ecorePackage.getEString(), "location", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(installableUnitEClass, InstallableUnit.class, "InstallableUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInstallableUnit_Id(), ecorePackage.getEString(), "id", null, 0, 1, InstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableUnit_Version(), ecorePackage.getEString(), "version", null, 0, 1, InstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //TargetDefPackageImpl
