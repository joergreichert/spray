/**
 */
package PetrinetDSL.impl;

import PetrinetDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetDSLFactoryImpl extends EFactoryImpl implements PetrinetDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetDSLFactory init() {
		try {
			PetrinetDSLFactory thePetrinetDSLFactory = (PetrinetDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Petrinet"); 
			if (thePetrinetDSLFactory != null) {
				return thePetrinetDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetDSLFactoryImpl() {
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
			case PetrinetDSLPackage.PETRINET: return createPetrinet();
			case PetrinetDSLPackage.NODE: return createNode();
			case PetrinetDSLPackage.EDGE: return createEdge();
			case PetrinetDSLPackage.TOKEN: return createToken();
			case PetrinetDSLPackage.TRANSITION: return createTransition();
			case PetrinetDSLPackage.PLACE: return createPlace();
			case PetrinetDSLPackage.PT_EDGE: return createPTEdge();
			case PetrinetDSLPackage.TP_EDGE: return createTPEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet createPetrinet() {
		PetrinetImpl petrinet = new PetrinetImpl();
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTEdge createPTEdge() {
		PTEdgeImpl ptEdge = new PTEdgeImpl();
		return ptEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPEdge createTPEdge() {
		TPEdgeImpl tpEdge = new TPEdgeImpl();
		return tpEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetDSLPackage getPetrinetDSLPackage() {
		return (PetrinetDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetDSLPackage getPackage() {
		return PetrinetDSLPackage.eINSTANCE;
	}

} //PetrinetDSLFactoryImpl
