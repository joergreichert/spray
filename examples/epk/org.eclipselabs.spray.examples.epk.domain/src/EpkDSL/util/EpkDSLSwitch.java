/**
 */
package EpkDSL.util;

import EpkDSL.*;

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
 * @see EpkDSL.EpkDSLPackage
 * @generated
 */
public class EpkDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EpkDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = EpkDSLPackage.eINSTANCE;
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
			case EpkDSLPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.EPK: {
				Epk epk = (Epk)theEObject;
				T result = caseEpk(epk);
				if (result == null) result = caseNamedElement(epk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseEpk(edge);
				if (result == null) result = caseNamedElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseEpk(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseNode(event);
				if (result == null) result = caseEpk(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNode(function);
				if (result == null) result = caseEpk(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.IN_OUTPUT: {
				InOutput inOutput = (InOutput)theEObject;
				T result = caseInOutput(inOutput);
				if (result == null) result = caseNode(inOutput);
				if (result == null) result = caseEpk(inOutput);
				if (result == null) result = caseNamedElement(inOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.ORG_UNIT: {
				OrgUnit orgUnit = (OrgUnit)theEObject;
				T result = caseOrgUnit(orgUnit);
				if (result == null) result = caseNode(orgUnit);
				if (result == null) result = caseEpk(orgUnit);
				if (result == null) result = caseNamedElement(orgUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.PROC_PATH: {
				ProcPath procPath = (ProcPath)theEObject;
				T result = caseProcPath(procPath);
				if (result == null) result = caseNode(procPath);
				if (result == null) result = caseEpk(procPath);
				if (result == null) result = caseNamedElement(procPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseNode(connector);
				if (result == null) result = caseEpk(connector);
				if (result == null) result = caseNamedElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.ECONNECTOR: {
				EConnector eConnector = (EConnector)theEObject;
				T result = caseEConnector(eConnector);
				if (result == null) result = caseConnector(eConnector);
				if (result == null) result = caseNode(eConnector);
				if (result == null) result = caseEpk(eConnector);
				if (result == null) result = caseNamedElement(eConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FCONNECTOR: {
				FConnector fConnector = (FConnector)theEObject;
				T result = caseFConnector(fConnector);
				if (result == null) result = caseConnector(fConnector);
				if (result == null) result = caseNode(fConnector);
				if (result == null) result = caseEpk(fConnector);
				if (result == null) result = caseNamedElement(fConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.DEFAULT_CONNECTION: {
				DefaultConnection defaultConnection = (DefaultConnection)theEObject;
				T result = caseDefaultConnection(defaultConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.EV_TO_FU_CONNECTION: {
				EvToFuConnection evToFuConnection = (EvToFuConnection)theEObject;
				T result = caseEvToFuConnection(evToFuConnection);
				if (result == null) result = caseDefaultConnection(evToFuConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FU_TO_EV_CONNECTION: {
				FuToEvConnection fuToEvConnection = (FuToEvConnection)theEObject;
				T result = caseFuToEvConnection(fuToEvConnection);
				if (result == null) result = caseDefaultConnection(fuToEvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.EV_TO_ECON_CONNECTION: {
				EvToEConConnection evToEConConnection = (EvToEConConnection)theEObject;
				T result = caseEvToEConConnection(evToEConConnection);
				if (result == null) result = caseDefaultConnection(evToEConConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.ECON_TO_FU_CONNECTION: {
				EConToFuConnection eConToFuConnection = (EConToFuConnection)theEObject;
				T result = caseEConToFuConnection(eConToFuConnection);
				if (result == null) result = caseDefaultConnection(eConToFuConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FU_TO_FCON_CONNECTION: {
				FuToFConConnection fuToFConConnection = (FuToFConConnection)theEObject;
				T result = caseFuToFConConnection(fuToFConConnection);
				if (result == null) result = caseDefaultConnection(fuToFConConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FCON_TO_EV_CONNECTION: {
				FConToEvConnection fConToEvConnection = (FConToEvConnection)theEObject;
				T result = caseFConToEvConnection(fConToEvConnection);
				if (result == null) result = caseDefaultConnection(fConToEvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.OU_TO_FU_CONNECTION: {
				OuToFuConnection ouToFuConnection = (OuToFuConnection)theEObject;
				T result = caseOuToFuConnection(ouToFuConnection);
				if (result == null) result = caseDefaultConnection(ouToFuConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.IO_TO_FU_CONNECTION: {
				IoToFuConnection ioToFuConnection = (IoToFuConnection)theEObject;
				T result = caseIoToFuConnection(ioToFuConnection);
				if (result == null) result = caseDefaultConnection(ioToFuConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.NODE_TO_PP_CONNECTION: {
				NodeToPpConnection nodeToPpConnection = (NodeToPpConnection)theEObject;
				T result = caseNodeToPpConnection(nodeToPpConnection);
				if (result == null) result = caseDefaultConnection(nodeToPpConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.PP_TO_NODE_CONNECTION: {
				PpToNodeConnection ppToNodeConnection = (PpToNodeConnection)theEObject;
				T result = casePpToNodeConnection(ppToNodeConnection);
				if (result == null) result = caseDefaultConnection(ppToNodeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.START_EVENT: {
				StartEvent startEvent = (StartEvent)theEObject;
				T result = caseStartEvent(startEvent);
				if (result == null) result = caseNode(startEvent);
				if (result == null) result = caseEpk(startEvent);
				if (result == null) result = caseNamedElement(startEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.END_EVENT: {
				EndEvent endEvent = (EndEvent)theEObject;
				T result = caseEndEvent(endEvent);
				if (result == null) result = caseNode(endEvent);
				if (result == null) result = caseEpk(endEvent);
				if (result == null) result = caseNamedElement(endEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.START_EV_TO_FU_CONNECTION: {
				StartEvToFuConnection startEvToFuConnection = (StartEvToFuConnection)theEObject;
				T result = caseStartEvToFuConnection(startEvToFuConnection);
				if (result == null) result = caseDefaultConnection(startEvToFuConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.START_EV_TO_ECON_CONNECTION: {
				StartEvToEConConnection startEvToEConConnection = (StartEvToEConConnection)theEObject;
				T result = caseStartEvToEConConnection(startEvToEConConnection);
				if (result == null) result = caseDefaultConnection(startEvToEConConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FU_TO_END_EV_CONNECTION: {
				FuToEndEvConnection fuToEndEvConnection = (FuToEndEvConnection)theEObject;
				T result = caseFuToEndEvConnection(fuToEndEvConnection);
				if (result == null) result = caseDefaultConnection(fuToEndEvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EpkDSLPackage.FCON_TO_END_EV_CONNECTION: {
				FConToEndEvConnection fConToEndEvConnection = (FConToEndEvConnection)theEObject;
				T result = caseFConToEndEvConnection(fConToEndEvConnection);
				if (result == null) result = caseDefaultConnection(fConToEndEvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpk(Epk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutput(InOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgUnit(OrgUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proc Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proc Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcPath(ProcPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EConnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EConnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEConnector(EConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FConnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FConnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFConnector(FConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultConnection(DefaultConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ev To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ev To Fu Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvToFuConnection(EvToFuConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fu To Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fu To Ev Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuToEvConnection(FuToEvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ev To ECon Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ev To ECon Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvToEConConnection(EvToEConConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECon To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECon To Fu Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEConToFuConnection(EConToFuConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fu To FCon Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fu To FCon Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuToFConConnection(FuToFConConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FCon To Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FCon To Ev Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFConToEvConnection(FConToEvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ou To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ou To Fu Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOuToFuConnection(OuToFuConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io To Fu Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoToFuConnection(IoToFuConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node To Pp Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node To Pp Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeToPpConnection(NodeToPpConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pp To Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pp To Node Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePpToNodeConnection(PpToNodeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Ev To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Ev To Fu Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvToFuConnection(StartEvToFuConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Ev To ECon Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Ev To ECon Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvToEConConnection(StartEvToEConConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fu To End Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fu To End Ev Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuToEndEvConnection(FuToEndEvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FCon To End Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FCon To End Ev Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFConToEndEvConnection(FConToEndEvConnection object) {
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

} //EpkDSLSwitch
