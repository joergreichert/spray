/**
 */
package ConceptMapDSL.impl;

import ConceptMapDSL.ArrowConnection;
import ConceptMapDSL.ConceptMap;
import ConceptMapDSL.ConceptMapDSLFactory;
import ConceptMapDSL.ConceptMapDSLPackage;
import ConceptMapDSL.DefaultConnection;
import ConceptMapDSL.DoubleArrowConnection;
import ConceptMapDSL.Element;
import ConceptMapDSL.MapElements;
import ConceptMapDSL.NamedElement;

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
public class ConceptMapDSLPackageImpl extends EPackageImpl implements ConceptMapDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleArrowConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultConnectionEClass = null;

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
	 * @see ConceptMapDSL.ConceptMapDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConceptMapDSLPackageImpl() {
		super(eNS_URI, ConceptMapDSLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConceptMapDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConceptMapDSLPackage init() {
		if (isInited) return (ConceptMapDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ConceptMapDSLPackage.eNS_URI);

		// Obtain or create and register package
		ConceptMapDSLPackageImpl theConceptMapDSLPackage = (ConceptMapDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConceptMapDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConceptMapDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConceptMapDSLPackage.createPackageContents();

		// Initialize created meta-data
		theConceptMapDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConceptMapDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConceptMapDSLPackage.eNS_URI, theConceptMapDSLPackage);
		return theConceptMapDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMap() {
		return conceptMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Mapelements() {
		return (EReference)conceptMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapElements() {
		return mapElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrowConnection() {
		return arrowConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrowConnection_FromElement() {
		return (EReference)arrowConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrowConnection_ToElement() {
		return (EReference)arrowConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleArrowConnection() {
		return doubleArrowConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleArrowConnection_FromElement() {
		return (EReference)doubleArrowConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleArrowConnection_ToElement() {
		return (EReference)doubleArrowConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultConnection() {
		return defaultConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultConnection_FromElement() {
		return (EReference)defaultConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultConnection_ToElement() {
		return (EReference)defaultConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDSLFactory getConceptMapDSLFactory() {
		return (ConceptMapDSLFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		conceptMapEClass = createEClass(CONCEPT_MAP);
		createEReference(conceptMapEClass, CONCEPT_MAP__MAPELEMENTS);

		mapElementsEClass = createEClass(MAP_ELEMENTS);

		elementEClass = createEClass(ELEMENT);

		arrowConnectionEClass = createEClass(ARROW_CONNECTION);
		createEReference(arrowConnectionEClass, ARROW_CONNECTION__FROM_ELEMENT);
		createEReference(arrowConnectionEClass, ARROW_CONNECTION__TO_ELEMENT);

		doubleArrowConnectionEClass = createEClass(DOUBLE_ARROW_CONNECTION);
		createEReference(doubleArrowConnectionEClass, DOUBLE_ARROW_CONNECTION__FROM_ELEMENT);
		createEReference(doubleArrowConnectionEClass, DOUBLE_ARROW_CONNECTION__TO_ELEMENT);

		defaultConnectionEClass = createEClass(DEFAULT_CONNECTION);
		createEReference(defaultConnectionEClass, DEFAULT_CONNECTION__FROM_ELEMENT);
		createEReference(defaultConnectionEClass, DEFAULT_CONNECTION__TO_ELEMENT);
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
		conceptMapEClass.getESuperTypes().add(this.getNamedElement());
		mapElementsEClass.getESuperTypes().add(this.getNamedElement());
		elementEClass.getESuperTypes().add(this.getMapElements());
		arrowConnectionEClass.getESuperTypes().add(this.getMapElements());
		doubleArrowConnectionEClass.getESuperTypes().add(this.getMapElements());
		defaultConnectionEClass.getESuperTypes().add(this.getMapElements());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptMapEClass, ConceptMap.class, "ConceptMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptMap_Mapelements(), this.getMapElements(), null, "mapelements", null, 0, -1, ConceptMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapElementsEClass, MapElements.class, "MapElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrowConnectionEClass, ArrowConnection.class, "ArrowConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrowConnection_FromElement(), this.getElement(), null, "fromElement", null, 0, 1, ArrowConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrowConnection_ToElement(), this.getElement(), null, "toElement", null, 0, 1, ArrowConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleArrowConnectionEClass, DoubleArrowConnection.class, "DoubleArrowConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoubleArrowConnection_FromElement(), this.getElement(), null, "fromElement", null, 0, 1, DoubleArrowConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoubleArrowConnection_ToElement(), this.getElement(), null, "toElement", null, 0, 1, DoubleArrowConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultConnectionEClass, DefaultConnection.class, "DefaultConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultConnection_FromElement(), this.getElement(), null, "fromElement", null, 0, 1, DefaultConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultConnection_ToElement(), this.getElement(), null, "toElement", null, 0, 1, DefaultConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConceptMapDSLPackageImpl
