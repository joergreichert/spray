<<<<<<< HEAD
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import PetriNet.ArcEClass;
import PetriNet.PetriEdge;
import PetriNet.PetriModel;
import PetriNet.PetriNetFactory;
import PetriNet.PetriNetPackage;
import PetriNet.PetriNode;
import PetriNet.PlaceEClass;
import PetriNet.TokenEClass;
import PetriNet.TransitionEClass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetPackageImpl extends EPackageImpl implements PetriNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriEdgeEClass = null;

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
	 * @see PetriNet.PetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetriNetPackageImpl() {
		super(eNS_URI, PetriNetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetriNetPackage init() {
		if (isInited) return (PetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(PetriNetPackage.eNS_URI);

		// Obtain or create and register package
		PetriNetPackageImpl thePetriNetPackage = (PetriNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetriNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetriNetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePetriNetPackage.createPackageContents();

		// Initialize created meta-data
		thePetriNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetriNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetriNetPackage.eNS_URI, thePetriNetPackage);
		return thePetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNode() {
		return petriNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceEClass() {
		return placeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceEClass_Token() {
		return (EReference)placeEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenEClass() {
		return tokenEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionEClass() {
		return transitionEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcEClass() {
		return arcEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcEClass_PetriFrom() {
		return (EReference)arcEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcEClass_PetriTo() {
		return (EReference)arcEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriModel() {
		return petriModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriModel_Name() {
		return (EAttribute)petriModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriModel_Description() {
		return (EAttribute)petriModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriModel_PetriModels() {
		return (EReference)petriModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriEdge() {
		return petriEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetFactory getPetriNetFactory() {
		return (PetriNetFactory)getEFactoryInstance();
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
		petriNodeEClass = createEClass(PETRI_NODE);

		placeEClassEClass = createEClass(PLACE_ECLASS);
		createEReference(placeEClassEClass, PLACE_ECLASS__TOKEN);

		tokenEClassEClass = createEClass(TOKEN_ECLASS);

		transitionEClassEClass = createEClass(TRANSITION_ECLASS);

		arcEClassEClass = createEClass(ARC_ECLASS);
		createEReference(arcEClassEClass, ARC_ECLASS__PETRI_FROM);
		createEReference(arcEClassEClass, ARC_ECLASS__PETRI_TO);

		petriModelEClass = createEClass(PETRI_MODEL);
		createEAttribute(petriModelEClass, PETRI_MODEL__NAME);
		createEAttribute(petriModelEClass, PETRI_MODEL__DESCRIPTION);
		createEReference(petriModelEClass, PETRI_MODEL__PETRI_MODELS);

		petriEdgeEClass = createEClass(PETRI_EDGE);
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

		// Add supertypes to classes
		petriNodeEClass.getESuperTypes().add(this.getPetriModel());
		placeEClassEClass.getESuperTypes().add(this.getPetriNode());
		tokenEClassEClass.getESuperTypes().add(this.getPetriNode());
		transitionEClassEClass.getESuperTypes().add(this.getPetriNode());
		arcEClassEClass.getESuperTypes().add(this.getPetriEdge());
		petriEdgeEClass.getESuperTypes().add(this.getPetriModel());

		// Initialize classes and features; add operations and parameters
		initEClass(petriNodeEClass, PetriNode.class, "PetriNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClassEClass, PlaceEClass.class, "PlaceEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceEClass_Token(), this.getTokenEClass(), null, "token", null, 0, 1, PlaceEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClassEClass, TokenEClass.class, "TokenEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClassEClass, TransitionEClass.class, "TransitionEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcEClassEClass, ArcEClass.class, "ArcEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcEClass_PetriFrom(), this.getPetriNode(), null, "petriFrom", null, 0, 1, ArcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcEClass_PetriTo(), this.getPetriNode(), null, "petriTo", null, 0, 1, ArcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriModelEClass, PetriModel.class, "PetriModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPetriModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PetriModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPetriModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, PetriModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriModel_PetriModels(), this.getPetriModel(), null, "petriModels", null, 0, -1, PetriModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriEdgeEClass, PetriEdge.class, "PetriEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PetriNetPackageImpl
=======
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import PetriNet.ArcEClass;
import PetriNet.PetriEdge;
import PetriNet.PetriModel;
import PetriNet.PetriNetFactory;
import PetriNet.PetriNetPackage;
import PetriNet.PetriNode;
import PetriNet.PlaceEClass;
import PetriNet.TokenEClass;
import PetriNet.TransitionEClass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetPackageImpl extends EPackageImpl implements PetriNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriEdgeEClass = null;

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
	 * @see PetriNet.PetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetriNetPackageImpl() {
		super(eNS_URI, PetriNetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetriNetPackage init() {
		if (isInited) return (PetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(PetriNetPackage.eNS_URI);

		// Obtain or create and register package
		PetriNetPackageImpl thePetriNetPackage = (PetriNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetriNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetriNetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePetriNetPackage.createPackageContents();

		// Initialize created meta-data
		thePetriNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetriNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetriNetPackage.eNS_URI, thePetriNetPackage);
		return thePetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNode() {
		return petriNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceEClass() {
		return placeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceEClass_Token() {
		return (EReference)placeEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenEClass() {
		return tokenEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionEClass() {
		return transitionEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcEClass() {
		return arcEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcEClass_PetriFrom() {
		return (EReference)arcEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcEClass_PetriTo() {
		return (EReference)arcEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriModel() {
		return petriModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriModel_Name() {
		return (EAttribute)petriModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriModel_Description() {
		return (EAttribute)petriModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriModel_PetriModels() {
		return (EReference)petriModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriEdge() {
		return petriEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetFactory getPetriNetFactory() {
		return (PetriNetFactory)getEFactoryInstance();
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
		petriNodeEClass = createEClass(PETRI_NODE);

		placeEClassEClass = createEClass(PLACE_ECLASS);
		createEReference(placeEClassEClass, PLACE_ECLASS__TOKEN);

		tokenEClassEClass = createEClass(TOKEN_ECLASS);

		transitionEClassEClass = createEClass(TRANSITION_ECLASS);

		arcEClassEClass = createEClass(ARC_ECLASS);
		createEReference(arcEClassEClass, ARC_ECLASS__PETRI_FROM);
		createEReference(arcEClassEClass, ARC_ECLASS__PETRI_TO);

		petriModelEClass = createEClass(PETRI_MODEL);
		createEAttribute(petriModelEClass, PETRI_MODEL__NAME);
		createEAttribute(petriModelEClass, PETRI_MODEL__DESCRIPTION);
		createEReference(petriModelEClass, PETRI_MODEL__PETRI_MODELS);

		petriEdgeEClass = createEClass(PETRI_EDGE);
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

		// Add supertypes to classes
		petriNodeEClass.getESuperTypes().add(this.getPetriModel());
		placeEClassEClass.getESuperTypes().add(this.getPetriNode());
		tokenEClassEClass.getESuperTypes().add(this.getPetriNode());
		transitionEClassEClass.getESuperTypes().add(this.getPetriNode());
		arcEClassEClass.getESuperTypes().add(this.getPetriEdge());
		petriEdgeEClass.getESuperTypes().add(this.getPetriModel());

		// Initialize classes and features; add operations and parameters
		initEClass(petriNodeEClass, PetriNode.class, "PetriNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClassEClass, PlaceEClass.class, "PlaceEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceEClass_Token(), this.getTokenEClass(), null, "token", null, 0, 1, PlaceEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClassEClass, TokenEClass.class, "TokenEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClassEClass, TransitionEClass.class, "TransitionEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcEClassEClass, ArcEClass.class, "ArcEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcEClass_PetriFrom(), this.getPetriNode(), null, "petriFrom", null, 0, 1, ArcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcEClass_PetriTo(), this.getPetriNode(), null, "petriTo", null, 0, 1, ArcEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriModelEClass, PetriModel.class, "PetriModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPetriModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PetriModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPetriModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, PetriModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriModel_PetriModels(), this.getPetriModel(), null, "petriModels", null, 0, -1, PetriModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriEdgeEClass, PetriEdge.class, "PetriEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PetriNetPackageImpl
>>>>>>> eclipse_juno
