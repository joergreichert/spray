/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.util;

import PetriNet.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetPackage
 * @generated
 */
public class PetriNetSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetriNetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetSwitch() {
		if (modelPackage == null) {
			modelPackage = PetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PetriNetPackage.PETRI_NODE: {
				PetriNode petriNode = (PetriNode)theEObject;
				Object result = casePetriNode(petriNode);
				if (result == null) result = casePetriModel(petriNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.PLACE_ECLASS: {
				PlaceEClass placeEClass = (PlaceEClass)theEObject;
				Object result = casePlaceEClass(placeEClass);
				if (result == null) result = casePetriNode(placeEClass);
				if (result == null) result = casePetriModel(placeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.TOKEN_ECLASS: {
				TokenEClass tokenEClass = (TokenEClass)theEObject;
				Object result = caseTokenEClass(tokenEClass);
				if (result == null) result = casePetriNode(tokenEClass);
				if (result == null) result = casePetriModel(tokenEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.TRANSITION_ECLASS: {
				TransitionEClass transitionEClass = (TransitionEClass)theEObject;
				Object result = caseTransitionEClass(transitionEClass);
				if (result == null) result = casePetriNode(transitionEClass);
				if (result == null) result = casePetriModel(transitionEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.ARC_ECLASS: {
				ArcEClass arcEClass = (ArcEClass)theEObject;
				Object result = caseArcEClass(arcEClass);
				if (result == null) result = casePetriEdge(arcEClass);
				if (result == null) result = casePetriModel(arcEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.PETRI_MODEL: {
				PetriModel petriModel = (PetriModel)theEObject;
				Object result = casePetriModel(petriModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.PETRI_EDGE: {
				PetriEdge petriEdge = (PetriEdge)theEObject;
				Object result = casePetriEdge(petriEdge);
				if (result == null) result = casePetriModel(petriEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePetriNode(PetriNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePlaceEClass(PlaceEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTokenEClass(TokenEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransitionEClass(TransitionEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArcEClass(ArcEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePetriModel(PetriModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePetriEdge(PetriEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //PetriNetSwitch
