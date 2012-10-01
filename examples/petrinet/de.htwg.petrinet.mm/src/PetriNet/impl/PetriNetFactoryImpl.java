/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import PetriNet.*;

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
public class PetriNetFactoryImpl extends EFactoryImpl implements PetriNetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetriNetFactory init() {
		try {
			PetriNetFactory thePetriNetFactory = (PetriNetFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.htwg.petrinet.mm/"); 
			if (thePetriNetFactory != null) {
				return thePetriNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetriNetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PetriNetPackage.PETRI_NODE: return createPetriNode();
			case PetriNetPackage.PLACE_ECLASS: return createPlaceEClass();
			case PetriNetPackage.TOKEN_ECLASS: return createTokenEClass();
			case PetriNetPackage.TRANSITION_ECLASS: return createTransitionEClass();
			case PetriNetPackage.ARC_ECLASS: return createArcEClass();
			case PetriNetPackage.PETRI_MODEL: return createPetriModel();
			case PetriNetPackage.PETRI_EDGE: return createPetriEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNode createPetriNode() {
		PetriNodeImpl petriNode = new PetriNodeImpl();
		return petriNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceEClass createPlaceEClass() {
		PlaceEClassImpl placeEClass = new PlaceEClassImpl();
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenEClass createTokenEClass() {
		TokenEClassImpl tokenEClass = new TokenEClassImpl();
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEClass createTransitionEClass() {
		TransitionEClassImpl transitionEClass = new TransitionEClassImpl();
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcEClass createArcEClass() {
		ArcEClassImpl arcEClass = new ArcEClassImpl();
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriModel createPetriModel() {
		PetriModelImpl petriModel = new PetriModelImpl();
		return petriModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriEdge createPetriEdge() {
		PetriEdgeImpl petriEdge = new PetriEdgeImpl();
		return petriEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetPackage getPetriNetPackage() {
		return (PetriNetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PetriNetPackage getPackage() {
		return PetriNetPackage.eINSTANCE;
	}

} //PetriNetFactoryImpl
