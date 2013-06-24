/**
 */
package ErdiagramDSL.util;

import ErdiagramDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see ErdiagramDSL.ErdiagramDSLPackage
 * @generated
 */
public class ErdiagramDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErdiagramDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = ErdiagramDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ErdiagramDSLPackage.ERDIAGRAM: {
				Erdiagram erdiagram = (Erdiagram)theEObject;
				T result = caseErdiagram(erdiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_ELEMENT: {
				ChenElement chenElement = (ChenElement)theEObject;
				T result = caseChenElement(chenElement);
				if (result == null) result = caseDiagramElement(chenElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_ENTITY: {
				ChenEntity chenEntity = (ChenEntity)theEObject;
				T result = caseChenEntity(chenEntity);
				if (result == null) result = caseChenElement(chenEntity);
				if (result == null) result = caseDiagramElement(chenEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_RELATIONSHIP: {
				ChenRelationship chenRelationship = (ChenRelationship)theEObject;
				T result = caseChenRelationship(chenRelationship);
				if (result == null) result = caseChenElement(chenRelationship);
				if (result == null) result = caseDiagramElement(chenRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_ATTRIBUTE: {
				ChenAttribute chenAttribute = (ChenAttribute)theEObject;
				T result = caseChenAttribute(chenAttribute);
				if (result == null) result = caseChenElement(chenAttribute);
				if (result == null) result = caseDiagramElement(chenAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_CONNECTION: {
				ChenConnection chenConnection = (ChenConnection)theEObject;
				T result = caseChenConnection(chenConnection);
				if (result == null) result = caseDiagramElement(chenConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION: {
				ChenNormalToWeakConnection chenNormalToWeakConnection = (ChenNormalToWeakConnection)theEObject;
				T result = caseChenNormalToWeakConnection(chenNormalToWeakConnection);
				if (result == null) result = caseDiagramElement(chenNormalToWeakConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_WEAK_ELEMENT: {
				ChenWeakElement chenWeakElement = (ChenWeakElement)theEObject;
				T result = caseChenWeakElement(chenWeakElement);
				if (result == null) result = caseDiagramElement(chenWeakElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_WEAK_ENTITY: {
				ChenWeakEntity chenWeakEntity = (ChenWeakEntity)theEObject;
				T result = caseChenWeakEntity(chenWeakEntity);
				if (result == null) result = caseChenWeakElement(chenWeakEntity);
				if (result == null) result = caseDiagramElement(chenWeakEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_WEAK_RELATIONSHIP: {
				ChenWeakRelationship chenWeakRelationship = (ChenWeakRelationship)theEObject;
				T result = caseChenWeakRelationship(chenWeakRelationship);
				if (result == null) result = caseChenWeakElement(chenWeakRelationship);
				if (result == null) result = caseDiagramElement(chenWeakRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_WEAK_ATTRIBUTE: {
				ChenWeakAttribute chenWeakAttribute = (ChenWeakAttribute)theEObject;
				T result = caseChenWeakAttribute(chenWeakAttribute);
				if (result == null) result = caseChenWeakElement(chenWeakAttribute);
				if (result == null) result = caseDiagramElement(chenWeakAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.CHEN_WEAK_CONNECTION: {
				ChenWeakConnection chenWeakConnection = (ChenWeakConnection)theEObject;
				T result = caseChenWeakConnection(chenWeakConnection);
				if (result == null) result = caseDiagramElement(chenWeakConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.MARTIN_ELEMENT: {
				MartinElement martinElement = (MartinElement)theEObject;
				T result = caseMartinElement(martinElement);
				if (result == null) result = caseDiagramElement(martinElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.MARTIN_ENTITY: {
				MartinEntity martinEntity = (MartinEntity)theEObject;
				T result = caseMartinEntity(martinEntity);
				if (result == null) result = caseMartinElement(martinEntity);
				if (result == null) result = caseDiagramElement(martinEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.MARTIN_CONNECTION: {
				MartinConnection martinConnection = (MartinConnection)theEObject;
				T result = caseMartinConnection(martinConnection);
				if (result == null) result = caseDiagramElement(martinConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.MINMAX_ENTITY: {
				MinmaxEntity minmaxEntity = (MinmaxEntity)theEObject;
				T result = caseMinmaxEntity(minmaxEntity);
				if (result == null) result = caseDiagramElement(minmaxEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErdiagramDSLPackage.MINMAX_CONNECTION: {
				MinmaxConnection minmaxConnection = (MinmaxConnection)theEObject;
				T result = caseMinmaxConnection(minmaxConnection);
				if (result == null) result = caseDiagramElement(minmaxConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erdiagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erdiagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErdiagram(Erdiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenElement(ChenElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenEntity(ChenEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenRelationship(ChenRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenAttribute(ChenAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenConnection(ChenConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Normal To Weak Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Normal To Weak Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenNormalToWeakConnection(ChenNormalToWeakConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Weak Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Weak Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenWeakElement(ChenWeakElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Weak Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Weak Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenWeakEntity(ChenWeakEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Weak Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Weak Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenWeakRelationship(ChenWeakRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Weak Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Weak Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenWeakAttribute(ChenWeakAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chen Weak Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chen Weak Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChenWeakConnection(ChenWeakConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Martin Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Martin Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMartinElement(MartinElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Martin Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Martin Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMartinEntity(MartinEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Martin Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Martin Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMartinConnection(MartinConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minmax Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minmax Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinmaxEntity(MinmaxEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minmax Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minmax Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinmaxConnection(MinmaxConnection object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ErdiagramDSLSwitch
