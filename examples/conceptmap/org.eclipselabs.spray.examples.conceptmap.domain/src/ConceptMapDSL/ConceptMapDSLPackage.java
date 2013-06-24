/**
 */
package ConceptMapDSL;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ConceptMapDSL.ConceptMapDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptMapDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConceptMapDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Conceptmap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptmap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptMapDSLPackage eINSTANCE = ConceptMapDSL.impl.ConceptMapDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.NamedElementImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.ConceptMapImpl <em>Concept Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.ConceptMapImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getConceptMap()
	 * @generated
	 */
	int CONCEPT_MAP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__MAPELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.MapElementsImpl <em>Map Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.MapElementsImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getMapElements()
	 * @generated
	 */
	int MAP_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENTS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Map Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENTS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.ElementImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.ArrowConnectionImpl <em>Arrow Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.ArrowConnectionImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getArrowConnection()
	 * @generated
	 */
	int ARROW_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_CONNECTION__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_CONNECTION__FROM_ELEMENT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_CONNECTION__TO_ELEMENT = MAP_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrow Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_CONNECTION_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.DoubleArrowConnectionImpl <em>Double Arrow Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.DoubleArrowConnectionImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getDoubleArrowConnection()
	 * @generated
	 */
	int DOUBLE_ARROW_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARROW_CONNECTION__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARROW_CONNECTION__FROM_ELEMENT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARROW_CONNECTION__TO_ELEMENT = MAP_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Arrow Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARROW_CONNECTION_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.DefaultConnectionImpl <em>Default Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.DefaultConnectionImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getDefaultConnection()
	 * @generated
	 */
	int DEFAULT_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONNECTION__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONNECTION__FROM_ELEMENT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONNECTION__TO_ELEMENT = MAP_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONNECTION_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ConceptMapDSL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ConceptMapDSL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptMapDSL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.ConceptMap <em>Concept Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Map</em>'.
	 * @see ConceptMapDSL.ConceptMap
	 * @generated
	 */
	EClass getConceptMap();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptMapDSL.ConceptMap#getMapelements <em>Mapelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapelements</em>'.
	 * @see ConceptMapDSL.ConceptMap#getMapelements()
	 * @see #getConceptMap()
	 * @generated
	 */
	EReference getConceptMap_Mapelements();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.MapElements <em>Map Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Elements</em>'.
	 * @see ConceptMapDSL.MapElements
	 * @generated
	 */
	EClass getMapElements();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ConceptMapDSL.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.ArrowConnection <em>Arrow Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow Connection</em>'.
	 * @see ConceptMapDSL.ArrowConnection
	 * @generated
	 */
	EClass getArrowConnection();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.ArrowConnection#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ConceptMapDSL.ArrowConnection#getFromElement()
	 * @see #getArrowConnection()
	 * @generated
	 */
	EReference getArrowConnection_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.ArrowConnection#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ConceptMapDSL.ArrowConnection#getToElement()
	 * @see #getArrowConnection()
	 * @generated
	 */
	EReference getArrowConnection_ToElement();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.DoubleArrowConnection <em>Double Arrow Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Arrow Connection</em>'.
	 * @see ConceptMapDSL.DoubleArrowConnection
	 * @generated
	 */
	EClass getDoubleArrowConnection();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.DoubleArrowConnection#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ConceptMapDSL.DoubleArrowConnection#getFromElement()
	 * @see #getDoubleArrowConnection()
	 * @generated
	 */
	EReference getDoubleArrowConnection_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.DoubleArrowConnection#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ConceptMapDSL.DoubleArrowConnection#getToElement()
	 * @see #getDoubleArrowConnection()
	 * @generated
	 */
	EReference getDoubleArrowConnection_ToElement();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.DefaultConnection <em>Default Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Connection</em>'.
	 * @see ConceptMapDSL.DefaultConnection
	 * @generated
	 */
	EClass getDefaultConnection();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.DefaultConnection#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ConceptMapDSL.DefaultConnection#getFromElement()
	 * @see #getDefaultConnection()
	 * @generated
	 */
	EReference getDefaultConnection_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.DefaultConnection#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ConceptMapDSL.DefaultConnection#getToElement()
	 * @see #getDefaultConnection()
	 * @generated
	 */
	EReference getDefaultConnection_ToElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptMapDSLFactory getConceptMapDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.NamedElementImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.ConceptMapImpl <em>Concept Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.ConceptMapImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getConceptMap()
		 * @generated
		 */
		EClass CONCEPT_MAP = eINSTANCE.getConceptMap();

		/**
		 * The meta object literal for the '<em><b>Mapelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_MAP__MAPELEMENTS = eINSTANCE.getConceptMap_Mapelements();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.MapElementsImpl <em>Map Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.MapElementsImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getMapElements()
		 * @generated
		 */
		EClass MAP_ELEMENTS = eINSTANCE.getMapElements();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.ElementImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.ArrowConnectionImpl <em>Arrow Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.ArrowConnectionImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getArrowConnection()
		 * @generated
		 */
		EClass ARROW_CONNECTION = eINSTANCE.getArrowConnection();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW_CONNECTION__FROM_ELEMENT = eINSTANCE.getArrowConnection_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW_CONNECTION__TO_ELEMENT = eINSTANCE.getArrowConnection_ToElement();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.DoubleArrowConnectionImpl <em>Double Arrow Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.DoubleArrowConnectionImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getDoubleArrowConnection()
		 * @generated
		 */
		EClass DOUBLE_ARROW_CONNECTION = eINSTANCE.getDoubleArrowConnection();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOUBLE_ARROW_CONNECTION__FROM_ELEMENT = eINSTANCE.getDoubleArrowConnection_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOUBLE_ARROW_CONNECTION__TO_ELEMENT = eINSTANCE.getDoubleArrowConnection_ToElement();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.DefaultConnectionImpl <em>Default Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.DefaultConnectionImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getDefaultConnection()
		 * @generated
		 */
		EClass DEFAULT_CONNECTION = eINSTANCE.getDefaultConnection();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_CONNECTION__FROM_ELEMENT = eINSTANCE.getDefaultConnection_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_CONNECTION__TO_ELEMENT = eINSTANCE.getDefaultConnection_ToElement();

	}

} //ConceptMapDSLPackage
