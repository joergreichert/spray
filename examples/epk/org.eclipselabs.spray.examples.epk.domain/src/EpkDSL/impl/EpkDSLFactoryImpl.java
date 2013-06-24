/**
 */
package EpkDSL.impl;

import EpkDSL.*;

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
public class EpkDSLFactoryImpl extends EFactoryImpl implements EpkDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EpkDSLFactory init() {
		try {
			EpkDSLFactory theEpkDSLFactory = (EpkDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Epk"); 
			if (theEpkDSLFactory != null) {
				return theEpkDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EpkDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLFactoryImpl() {
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
			case EpkDSLPackage.NAMED_ELEMENT: return createNamedElement();
			case EpkDSLPackage.EPK: return createEpk();
			case EpkDSLPackage.EDGE: return createEdge();
			case EpkDSLPackage.NODE: return createNode();
			case EpkDSLPackage.EVENT: return createEvent();
			case EpkDSLPackage.FUNCTION: return createFunction();
			case EpkDSLPackage.IN_OUTPUT: return createInOutput();
			case EpkDSLPackage.ORG_UNIT: return createOrgUnit();
			case EpkDSLPackage.PROC_PATH: return createProcPath();
			case EpkDSLPackage.CONNECTOR: return createConnector();
			case EpkDSLPackage.ECONNECTOR: return createEConnector();
			case EpkDSLPackage.FCONNECTOR: return createFConnector();
			case EpkDSLPackage.DEFAULT_CONNECTION: return createDefaultConnection();
			case EpkDSLPackage.EV_TO_FU_CONNECTION: return createEvToFuConnection();
			case EpkDSLPackage.FU_TO_EV_CONNECTION: return createFuToEvConnection();
			case EpkDSLPackage.EV_TO_ECON_CONNECTION: return createEvToEConConnection();
			case EpkDSLPackage.ECON_TO_FU_CONNECTION: return createEConToFuConnection();
			case EpkDSLPackage.FU_TO_FCON_CONNECTION: return createFuToFConConnection();
			case EpkDSLPackage.FCON_TO_EV_CONNECTION: return createFConToEvConnection();
			case EpkDSLPackage.OU_TO_FU_CONNECTION: return createOuToFuConnection();
			case EpkDSLPackage.IO_TO_FU_CONNECTION: return createIoToFuConnection();
			case EpkDSLPackage.NODE_TO_PP_CONNECTION: return createNodeToPpConnection();
			case EpkDSLPackage.PP_TO_NODE_CONNECTION: return createPpToNodeConnection();
			case EpkDSLPackage.START_EVENT: return createStartEvent();
			case EpkDSLPackage.END_EVENT: return createEndEvent();
			case EpkDSLPackage.START_EV_TO_FU_CONNECTION: return createStartEvToFuConnection();
			case EpkDSLPackage.START_EV_TO_ECON_CONNECTION: return createStartEvToEConConnection();
			case EpkDSLPackage.FU_TO_END_EV_CONNECTION: return createFuToEndEvConnection();
			case EpkDSLPackage.FCON_TO_END_EV_CONNECTION: return createFConToEndEvConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epk createEpk() {
		EpkImpl epk = new EpkImpl();
		return epk;
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
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutput createInOutput() {
		InOutputImpl inOutput = new InOutputImpl();
		return inOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcPath createProcPath() {
		ProcPathImpl procPath = new ProcPathImpl();
		return procPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConnector createEConnector() {
		EConnectorImpl eConnector = new EConnectorImpl();
		return eConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FConnector createFConnector() {
		FConnectorImpl fConnector = new FConnectorImpl();
		return fConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConnection createDefaultConnection() {
		DefaultConnectionImpl defaultConnection = new DefaultConnectionImpl();
		return defaultConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvToFuConnection createEvToFuConnection() {
		EvToFuConnectionImpl evToFuConnection = new EvToFuConnectionImpl();
		return evToFuConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuToEvConnection createFuToEvConnection() {
		FuToEvConnectionImpl fuToEvConnection = new FuToEvConnectionImpl();
		return fuToEvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvToEConConnection createEvToEConConnection() {
		EvToEConConnectionImpl evToEConConnection = new EvToEConConnectionImpl();
		return evToEConConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConToFuConnection createEConToFuConnection() {
		EConToFuConnectionImpl eConToFuConnection = new EConToFuConnectionImpl();
		return eConToFuConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuToFConConnection createFuToFConConnection() {
		FuToFConConnectionImpl fuToFConConnection = new FuToFConConnectionImpl();
		return fuToFConConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FConToEvConnection createFConToEvConnection() {
		FConToEvConnectionImpl fConToEvConnection = new FConToEvConnectionImpl();
		return fConToEvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuToFuConnection createOuToFuConnection() {
		OuToFuConnectionImpl ouToFuConnection = new OuToFuConnectionImpl();
		return ouToFuConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoToFuConnection createIoToFuConnection() {
		IoToFuConnectionImpl ioToFuConnection = new IoToFuConnectionImpl();
		return ioToFuConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeToPpConnection createNodeToPpConnection() {
		NodeToPpConnectionImpl nodeToPpConnection = new NodeToPpConnectionImpl();
		return nodeToPpConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpToNodeConnection createPpToNodeConnection() {
		PpToNodeConnectionImpl ppToNodeConnection = new PpToNodeConnectionImpl();
		return ppToNodeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvToFuConnection createStartEvToFuConnection() {
		StartEvToFuConnectionImpl startEvToFuConnection = new StartEvToFuConnectionImpl();
		return startEvToFuConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvToEConConnection createStartEvToEConConnection() {
		StartEvToEConConnectionImpl startEvToEConConnection = new StartEvToEConConnectionImpl();
		return startEvToEConConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuToEndEvConnection createFuToEndEvConnection() {
		FuToEndEvConnectionImpl fuToEndEvConnection = new FuToEndEvConnectionImpl();
		return fuToEndEvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FConToEndEvConnection createFConToEndEvConnection() {
		FConToEndEvConnectionImpl fConToEndEvConnection = new FConToEndEvConnectionImpl();
		return fConToEndEvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLPackage getEpkDSLPackage() {
		return (EpkDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EpkDSLPackage getPackage() {
		return EpkDSLPackage.eINSTANCE;
	}

} //EpkDSLFactoryImpl
