/**
 */
package PetrinetDSL;

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
 * @see PetrinetDSL.PetrinetDSLFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PetrinetDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetDSLPackage eINSTANCE = PetrinetDSL.impl.PetrinetDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.PetrinetImpl <em>Petrinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.PetrinetImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getPetrinet()
	 * @generated
	 */
	int PETRINET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET__MAPELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Petrinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.NodeImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = PETRINET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = PETRINET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MAPELEMENTS = PETRINET__MAPELEMENTS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = PETRINET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.EdgeImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = PETRINET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESCRIPTION = PETRINET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__MAPELEMENTS = PETRINET__MAPELEMENTS;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = PETRINET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.TokenImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__MAPELEMENTS = NODE__MAPELEMENTS;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.TransitionImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__MAPELEMENTS = NODE__MAPELEMENTS;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.PlaceImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__MAPELEMENTS = NODE__MAPELEMENTS;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.PTEdgeImpl <em>PT Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.PTEdgeImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getPTEdge()
	 * @generated
	 */
	int PT_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_EDGE__DESCRIPTION = EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_EDGE__MAPELEMENTS = EDGE__MAPELEMENTS;

	/**
	 * The feature id for the '<em><b>From Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_EDGE__FROM_PLACE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_EDGE__TO_TRANSITION = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PT Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link PetrinetDSL.impl.TPEdgeImpl <em>TP Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetrinetDSL.impl.TPEdgeImpl
	 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getTPEdge()
	 * @generated
	 */
	int TP_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_EDGE__DESCRIPTION = EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_EDGE__MAPELEMENTS = EDGE__MAPELEMENTS;

	/**
	 * The feature id for the '<em><b>From Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_EDGE__FROM_TRANSITION = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_EDGE__TO_PLACE = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TP Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link PetrinetDSL.Petrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet</em>'.
	 * @see PetrinetDSL.Petrinet
	 * @generated
	 */
	EClass getPetrinet();

	/**
	 * Returns the meta object for the attribute '{@link PetrinetDSL.Petrinet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PetrinetDSL.Petrinet#getName()
	 * @see #getPetrinet()
	 * @generated
	 */
	EAttribute getPetrinet_Name();

	/**
	 * Returns the meta object for the attribute '{@link PetrinetDSL.Petrinet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PetrinetDSL.Petrinet#getDescription()
	 * @see #getPetrinet()
	 * @generated
	 */
	EAttribute getPetrinet_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PetrinetDSL.Petrinet#getMapelements <em>Mapelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapelements</em>'.
	 * @see PetrinetDSL.Petrinet#getMapelements()
	 * @see #getPetrinet()
	 * @generated
	 */
	EReference getPetrinet_Mapelements();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see PetrinetDSL.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see PetrinetDSL.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see PetrinetDSL.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see PetrinetDSL.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see PetrinetDSL.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link PetrinetDSL.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see PetrinetDSL.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Tokens();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.PTEdge <em>PT Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Edge</em>'.
	 * @see PetrinetDSL.PTEdge
	 * @generated
	 */
	EClass getPTEdge();

	/**
	 * Returns the meta object for the reference '{@link PetrinetDSL.PTEdge#getFromPlace <em>From Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Place</em>'.
	 * @see PetrinetDSL.PTEdge#getFromPlace()
	 * @see #getPTEdge()
	 * @generated
	 */
	EReference getPTEdge_FromPlace();

	/**
	 * Returns the meta object for the reference '{@link PetrinetDSL.PTEdge#getToTransition <em>To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Transition</em>'.
	 * @see PetrinetDSL.PTEdge#getToTransition()
	 * @see #getPTEdge()
	 * @generated
	 */
	EReference getPTEdge_ToTransition();

	/**
	 * Returns the meta object for class '{@link PetrinetDSL.TPEdge <em>TP Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TP Edge</em>'.
	 * @see PetrinetDSL.TPEdge
	 * @generated
	 */
	EClass getTPEdge();

	/**
	 * Returns the meta object for the reference '{@link PetrinetDSL.TPEdge#getFromTransition <em>From Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Transition</em>'.
	 * @see PetrinetDSL.TPEdge#getFromTransition()
	 * @see #getTPEdge()
	 * @generated
	 */
	EReference getTPEdge_FromTransition();

	/**
	 * Returns the meta object for the reference '{@link PetrinetDSL.TPEdge#getToPlace <em>To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Place</em>'.
	 * @see PetrinetDSL.TPEdge#getToPlace()
	 * @see #getTPEdge()
	 * @generated
	 */
	EReference getTPEdge_ToPlace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetDSLFactory getPetrinetDSLFactory();

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
		 * The meta object literal for the '{@link PetrinetDSL.impl.PetrinetImpl <em>Petrinet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.PetrinetImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getPetrinet()
		 * @generated
		 */
		EClass PETRINET = eINSTANCE.getPetrinet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRINET__NAME = eINSTANCE.getPetrinet_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRINET__DESCRIPTION = eINSTANCE.getPetrinet_Description();

		/**
		 * The meta object literal for the '<em><b>Mapelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINET__MAPELEMENTS = eINSTANCE.getPetrinet_Mapelements();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.NodeImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.EdgeImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.TokenImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.TransitionImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.PlaceImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.PTEdgeImpl <em>PT Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.PTEdgeImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getPTEdge()
		 * @generated
		 */
		EClass PT_EDGE = eINSTANCE.getPTEdge();

		/**
		 * The meta object literal for the '<em><b>From Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PT_EDGE__FROM_PLACE = eINSTANCE.getPTEdge_FromPlace();

		/**
		 * The meta object literal for the '<em><b>To Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PT_EDGE__TO_TRANSITION = eINSTANCE.getPTEdge_ToTransition();

		/**
		 * The meta object literal for the '{@link PetrinetDSL.impl.TPEdgeImpl <em>TP Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetrinetDSL.impl.TPEdgeImpl
		 * @see PetrinetDSL.impl.PetrinetDSLPackageImpl#getTPEdge()
		 * @generated
		 */
		EClass TP_EDGE = eINSTANCE.getTPEdge();

		/**
		 * The meta object literal for the '<em><b>From Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TP_EDGE__FROM_TRANSITION = eINSTANCE.getTPEdge_FromTransition();

		/**
		 * The meta object literal for the '<em><b>To Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TP_EDGE__TO_PLACE = eINSTANCE.getTPEdge_ToPlace();

	}

} //PetrinetDSLPackage
