/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.util;

import PetriNet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetPackage
 * @generated
 */
public class PetriNetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetriNetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetSwitch modelSwitch =
		new PetriNetSwitch() {
			public Object casePetriNode(PetriNode object) {
				return createPetriNodeAdapter();
			}
			public Object casePlaceEClass(PlaceEClass object) {
				return createPlaceEClassAdapter();
			}
			public Object caseTokenEClass(TokenEClass object) {
				return createTokenEClassAdapter();
			}
			public Object caseTransitionEClass(TransitionEClass object) {
				return createTransitionEClassAdapter();
			}
			public Object caseArcEClass(ArcEClass object) {
				return createArcEClassAdapter();
			}
			public Object casePetriModel(PetriModel object) {
				return createPetriModelAdapter();
			}
			public Object casePetriEdge(PetriEdge object) {
				return createPetriEdgeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.PetriNode <em>Petri Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.PetriNode
	 * @generated
	 */
	public Adapter createPetriNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.PlaceEClass <em>Place EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.PlaceEClass
	 * @generated
	 */
	public Adapter createPlaceEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.TokenEClass <em>Token EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.TokenEClass
	 * @generated
	 */
	public Adapter createTokenEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.TransitionEClass <em>Transition EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.TransitionEClass
	 * @generated
	 */
	public Adapter createTransitionEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.ArcEClass <em>Arc EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.ArcEClass
	 * @generated
	 */
	public Adapter createArcEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.PetriModel <em>Petri Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.PetriModel
	 * @generated
	 */
	public Adapter createPetriModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PetriNet.PetriEdge <em>Petri Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PetriNet.PetriEdge
	 * @generated
	 */
	public Adapter createPetriEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PetriNetAdapterFactory
