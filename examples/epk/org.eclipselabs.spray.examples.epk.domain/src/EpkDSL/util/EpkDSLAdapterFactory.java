/**
 */
package EpkDSL.util;

import EpkDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see EpkDSL.EpkDSLPackage
 * @generated
 */
public class EpkDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EpkDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EpkDSLPackage.eINSTANCE;
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
	@Override
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
	protected EpkDSLSwitch<Adapter> modelSwitch =
		new EpkDSLSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEpk(Epk object) {
				return createEpkAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseInOutput(InOutput object) {
				return createInOutputAdapter();
			}
			@Override
			public Adapter caseOrgUnit(OrgUnit object) {
				return createOrgUnitAdapter();
			}
			@Override
			public Adapter caseProcPath(ProcPath object) {
				return createProcPathAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseEConnector(EConnector object) {
				return createEConnectorAdapter();
			}
			@Override
			public Adapter caseFConnector(FConnector object) {
				return createFConnectorAdapter();
			}
			@Override
			public Adapter caseDefaultConnection(DefaultConnection object) {
				return createDefaultConnectionAdapter();
			}
			@Override
			public Adapter caseEvToFuConnection(EvToFuConnection object) {
				return createEvToFuConnectionAdapter();
			}
			@Override
			public Adapter caseFuToEvConnection(FuToEvConnection object) {
				return createFuToEvConnectionAdapter();
			}
			@Override
			public Adapter caseEvToEConConnection(EvToEConConnection object) {
				return createEvToEConConnectionAdapter();
			}
			@Override
			public Adapter caseEConToFuConnection(EConToFuConnection object) {
				return createEConToFuConnectionAdapter();
			}
			@Override
			public Adapter caseFuToFConConnection(FuToFConConnection object) {
				return createFuToFConConnectionAdapter();
			}
			@Override
			public Adapter caseFConToEvConnection(FConToEvConnection object) {
				return createFConToEvConnectionAdapter();
			}
			@Override
			public Adapter caseOuToFuConnection(OuToFuConnection object) {
				return createOuToFuConnectionAdapter();
			}
			@Override
			public Adapter caseIoToFuConnection(IoToFuConnection object) {
				return createIoToFuConnectionAdapter();
			}
			@Override
			public Adapter caseNodeToPpConnection(NodeToPpConnection object) {
				return createNodeToPpConnectionAdapter();
			}
			@Override
			public Adapter casePpToNodeConnection(PpToNodeConnection object) {
				return createPpToNodeConnectionAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseEndEvent(EndEvent object) {
				return createEndEventAdapter();
			}
			@Override
			public Adapter caseStartEvToFuConnection(StartEvToFuConnection object) {
				return createStartEvToFuConnectionAdapter();
			}
			@Override
			public Adapter caseStartEvToEConConnection(StartEvToEConConnection object) {
				return createStartEvToEConConnectionAdapter();
			}
			@Override
			public Adapter caseFuToEndEvConnection(FuToEndEvConnection object) {
				return createFuToEndEvConnectionAdapter();
			}
			@Override
			public Adapter caseFConToEndEvConnection(FConToEndEvConnection object) {
				return createFConToEndEvConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.Epk <em>Epk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.Epk
	 * @generated
	 */
	public Adapter createEpkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.InOutput <em>In Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.InOutput
	 * @generated
	 */
	public Adapter createInOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.OrgUnit
	 * @generated
	 */
	public Adapter createOrgUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.ProcPath <em>Proc Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.ProcPath
	 * @generated
	 */
	public Adapter createProcPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.EConnector <em>EConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.EConnector
	 * @generated
	 */
	public Adapter createEConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.FConnector <em>FConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.FConnector
	 * @generated
	 */
	public Adapter createFConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.DefaultConnection <em>Default Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.DefaultConnection
	 * @generated
	 */
	public Adapter createDefaultConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.EvToFuConnection <em>Ev To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.EvToFuConnection
	 * @generated
	 */
	public Adapter createEvToFuConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.FuToEvConnection <em>Fu To Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.FuToEvConnection
	 * @generated
	 */
	public Adapter createFuToEvConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.EvToEConConnection <em>Ev To ECon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.EvToEConConnection
	 * @generated
	 */
	public Adapter createEvToEConConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.EConToFuConnection <em>ECon To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.EConToFuConnection
	 * @generated
	 */
	public Adapter createEConToFuConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.FuToFConConnection <em>Fu To FCon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.FuToFConConnection
	 * @generated
	 */
	public Adapter createFuToFConConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.FConToEvConnection <em>FCon To Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.FConToEvConnection
	 * @generated
	 */
	public Adapter createFConToEvConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.OuToFuConnection <em>Ou To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.OuToFuConnection
	 * @generated
	 */
	public Adapter createOuToFuConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.IoToFuConnection <em>Io To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.IoToFuConnection
	 * @generated
	 */
	public Adapter createIoToFuConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.NodeToPpConnection <em>Node To Pp Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.NodeToPpConnection
	 * @generated
	 */
	public Adapter createNodeToPpConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.PpToNodeConnection <em>Pp To Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.PpToNodeConnection
	 * @generated
	 */
	public Adapter createPpToNodeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.StartEvToFuConnection <em>Start Ev To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.StartEvToFuConnection
	 * @generated
	 */
	public Adapter createStartEvToFuConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.StartEvToEConConnection <em>Start Ev To ECon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.StartEvToEConConnection
	 * @generated
	 */
	public Adapter createStartEvToEConConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.FuToEndEvConnection <em>Fu To End Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.FuToEndEvConnection
	 * @generated
	 */
	public Adapter createFuToEndEvConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EpkDSL.FConToEndEvConnection <em>FCon To End Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EpkDSL.FConToEndEvConnection
	 * @generated
	 */
	public Adapter createFConToEndEvConnectionAdapter() {
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

} //EpkDSLAdapterFactory
