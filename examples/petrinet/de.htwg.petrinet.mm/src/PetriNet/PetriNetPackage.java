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
	 * The meta object id for the '{@link PetriNet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PlaceImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PETRI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DESCRIPTION = PETRI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PETRI_MODELS = PETRI_NODE__PETRI_MODELS;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKEN = PETRI_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PETRI_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link PetriNet.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.TokenImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = PETRI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DESCRIPTION = PETRI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__PETRI_MODELS = PETRI_NODE__PETRI_MODELS;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = PETRI_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetriNet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.TransitionImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PETRI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = PETRI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PETRI_MODELS = PETRI_NODE__PETRI_MODELS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TEST = PETRI_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PETRI_NODE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link PetriNet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.ArcImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PETRI_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__DESCRIPTION = PETRI_EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Petri Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PETRI_MODELS = PETRI_EDGE__PETRI_MODELS;

	/**
	 * The feature id for the '<em><b>Petri From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PETRI_FROM = PETRI_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Petri To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PETRI_TO = PETRI_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PETRI_EDGE_FEATURE_COUNT + 2;


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
	 * Returns the meta object for class '{@link PetriNet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see PetriNet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link PetriNet.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token</em>'.
	 * @see PetriNet.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Token();

	/**
	 * Returns the meta object for class '{@link PetriNet.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see PetriNet.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link PetriNet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see PetriNet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link PetriNet.Transition#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see PetriNet.Transition#getTest()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Test();

	/**
	 * Returns the meta object for class '{@link PetriNet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see PetriNet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.Arc#getPetriFrom <em>Petri From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri From</em>'.
	 * @see PetriNet.Arc#getPetriFrom()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_PetriFrom();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.Arc#getPetriTo <em>Petri To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri To</em>'.
	 * @see PetriNet.Arc#getPetriTo()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_PetriTo();

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
		 * The meta object literal for the '{@link PetriNet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PlaceImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.TokenImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.TransitionImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TEST = eINSTANCE.getTransition_Test();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.ArcImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Petri From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PETRI_FROM = eINSTANCE.getArc_PetriFrom();

		/**
		 * The meta object literal for the '<em><b>Petri To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PETRI_TO = eINSTANCE.getArc_PetriTo();

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
