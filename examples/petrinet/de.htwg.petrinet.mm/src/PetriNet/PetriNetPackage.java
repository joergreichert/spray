/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

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
 * @see PetriNet.PetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface PetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PetriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.htwg.petrinet.mm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PetriNet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetPackage eINSTANCE = PetriNet.impl.PetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link PetriNet.impl.PetriModelImpl <em>Petri Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PetriModelImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPetriModel()
	 * @generated
	 */
	int PETRI_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_MODEL__PETRI_MODELS = 2;

	/**
	 * The number of structural features of the '<em>Petri Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link PetriNet.impl.PetriNodeImpl <em>Petri Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PetriNodeImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPetriNode()
	 * @generated
	 */
	int PETRI_NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NODE__NAME = PETRI_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NODE__DESCRIPTION = PETRI_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NODE__PETRI_MODELS = PETRI_MODEL__PETRI_MODELS;

	/**
	 * The number of structural features of the '<em>Petri Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NODE_FEATURE_COUNT = PETRI_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetriNet.impl.PlaceEClassImpl <em>Place EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PlaceEClassImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPlaceEClass()
	 * @generated
	 */
	int PLACE_ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ECLASS__NAME = PETRI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ECLASS__DESCRIPTION = PETRI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ECLASS__PETRI_MODELS = PETRI_NODE__PETRI_MODELS;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ECLASS__TOKEN = PETRI_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ECLASS_FEATURE_COUNT = PETRI_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link PetriNet.impl.TokenEClassImpl <em>Token EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.TokenEClassImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getTokenEClass()
	 * @generated
	 */
	int TOKEN_ECLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ECLASS__NAME = PETRI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ECLASS__DESCRIPTION = PETRI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ECLASS__PETRI_MODELS = PETRI_NODE__PETRI_MODELS;

	/**
	 * The number of structural features of the '<em>Token EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ECLASS_FEATURE_COUNT = PETRI_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetriNet.impl.TransitionEClassImpl <em>Transition EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.TransitionEClassImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getTransitionEClass()
	 * @generated
	 */
	int TRANSITION_ECLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ECLASS__NAME = PETRI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ECLASS__DESCRIPTION = PETRI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ECLASS__PETRI_MODELS = PETRI_NODE__PETRI_MODELS;

	/**
	 * The number of structural features of the '<em>Transition EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ECLASS_FEATURE_COUNT = PETRI_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetriNet.impl.PetriEdgeImpl <em>Petri Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PetriEdgeImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPetriEdge()
	 * @generated
	 */
	int PETRI_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_EDGE__NAME = PETRI_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_EDGE__DESCRIPTION = PETRI_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_EDGE__PETRI_MODELS = PETRI_MODEL__PETRI_MODELS;

	/**
	 * The number of structural features of the '<em>Petri Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_EDGE_FEATURE_COUNT = PETRI_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetriNet.impl.ArcEClassImpl <em>Arc EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.ArcEClassImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getArcEClass()
	 * @generated
	 */
	int ARC_ECLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_ECLASS__NAME = PETRI_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_ECLASS__DESCRIPTION = PETRI_EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_ECLASS__PETRI_MODELS = PETRI_EDGE__PETRI_MODELS;

	/**
	 * The feature id for the '<em><b>Petri From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_ECLASS__PETRI_FROM = PETRI_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Petri To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_ECLASS__PETRI_TO = PETRI_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_ECLASS_FEATURE_COUNT = PETRI_EDGE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link PetriNet.PetriNode <em>Petri Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Node</em>'.
	 * @see PetriNet.PetriNode
	 * @generated
	 */
	EClass getPetriNode();

	/**
	 * Returns the meta object for class '{@link PetriNet.PlaceEClass <em>Place EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place EClass</em>'.
	 * @see PetriNet.PlaceEClass
	 * @generated
	 */
	EClass getPlaceEClass();

	/**
	 * Returns the meta object for the containment reference '{@link PetriNet.PlaceEClass#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token</em>'.
	 * @see PetriNet.PlaceEClass#getToken()
	 * @see #getPlaceEClass()
	 * @generated
	 */
	EReference getPlaceEClass_Token();

	/**
	 * Returns the meta object for class '{@link PetriNet.TokenEClass <em>Token EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token EClass</em>'.
	 * @see PetriNet.TokenEClass
	 * @generated
	 */
	EClass getTokenEClass();

	/**
	 * Returns the meta object for class '{@link PetriNet.TransitionEClass <em>Transition EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition EClass</em>'.
	 * @see PetriNet.TransitionEClass
	 * @generated
	 */
	EClass getTransitionEClass();

	/**
	 * Returns the meta object for class '{@link PetriNet.ArcEClass <em>Arc EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc EClass</em>'.
	 * @see PetriNet.ArcEClass
	 * @generated
	 */
	EClass getArcEClass();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.ArcEClass#getPetriFrom <em>Petri From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri From</em>'.
	 * @see PetriNet.ArcEClass#getPetriFrom()
	 * @see #getArcEClass()
	 * @generated
	 */
	EReference getArcEClass_PetriFrom();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.ArcEClass#getPetriTo <em>Petri To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri To</em>'.
	 * @see PetriNet.ArcEClass#getPetriTo()
	 * @see #getArcEClass()
	 * @generated
	 */
	EReference getArcEClass_PetriTo();

	/**
	 * Returns the meta object for class '{@link PetriNet.PetriModel <em>Petri Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Model</em>'.
	 * @see PetriNet.PetriModel
	 * @generated
	 */
	EClass getPetriModel();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.PetriModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PetriNet.PetriModel#getName()
	 * @see #getPetriModel()
	 * @generated
	 */
	EAttribute getPetriModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.PetriModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PetriNet.PetriModel#getDescription()
	 * @see #getPetriModel()
	 * @generated
	 */
	EAttribute getPetriModel_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PetriNet.PetriModel#getPetriModels <em>Petri Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petri Models</em>'.
	 * @see PetriNet.PetriModel#getPetriModels()
	 * @see #getPetriModel()
	 * @generated
	 */
	EReference getPetriModel_PetriModels();

	/**
	 * Returns the meta object for class '{@link PetriNet.PetriEdge <em>Petri Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Edge</em>'.
	 * @see PetriNet.PetriEdge
	 * @generated
	 */
	EClass getPetriEdge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriNetFactory getPetriNetFactory();

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
		 * The meta object literal for the '{@link PetriNet.impl.PetriNodeImpl <em>Petri Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PetriNodeImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPetriNode()
		 * @generated
		 */
		EClass PETRI_NODE = eINSTANCE.getPetriNode();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.PlaceEClassImpl <em>Place EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PlaceEClassImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPlaceEClass()
		 * @generated
		 */
		EClass PLACE_ECLASS = eINSTANCE.getPlaceEClass();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_ECLASS__TOKEN = eINSTANCE.getPlaceEClass_Token();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.TokenEClassImpl <em>Token EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.TokenEClassImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getTokenEClass()
		 * @generated
		 */
		EClass TOKEN_ECLASS = eINSTANCE.getTokenEClass();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.TransitionEClassImpl <em>Transition EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.TransitionEClassImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getTransitionEClass()
		 * @generated
		 */
		EClass TRANSITION_ECLASS = eINSTANCE.getTransitionEClass();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.ArcEClassImpl <em>Arc EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.ArcEClassImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getArcEClass()
		 * @generated
		 */
		EClass ARC_ECLASS = eINSTANCE.getArcEClass();

		/**
		 * The meta object literal for the '<em><b>Petri From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_ECLASS__PETRI_FROM = eINSTANCE.getArcEClass_PetriFrom();

		/**
		 * The meta object literal for the '<em><b>Petri To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_ECLASS__PETRI_TO = eINSTANCE.getArcEClass_PetriTo();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.PetriModelImpl <em>Petri Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PetriModelImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPetriModel()
		 * @generated
		 */
		EClass PETRI_MODEL = eINSTANCE.getPetriModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_MODEL__NAME = eINSTANCE.getPetriModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_MODEL__DESCRIPTION = eINSTANCE.getPetriModel_Description();

		/**
		 * The meta object literal for the '<em><b>Petri Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_MODEL__PETRI_MODELS = eINSTANCE.getPetriModel_PetriModels();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.PetriEdgeImpl <em>Petri Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PetriEdgeImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPetriEdge()
		 * @generated
		 */
		EClass PETRI_EDGE = eINSTANCE.getPetriEdge();

	}

} //PetriNetPackage
