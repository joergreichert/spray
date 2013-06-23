/**
 */
package EpkDSL;

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
 * @see EpkDSL.EpkDSLFactory
 * @model kind="package"
 * @generated
 */
public interface EpkDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EpkDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Epk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "epk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpkDSLPackage eINSTANCE = EpkDSL.impl.EpkDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link EpkDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.NamedElementImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EpkImpl <em>Epk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EpkImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEpk()
	 * @generated
	 */
	int EPK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPK__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPK__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPK__CONNECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Epk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EdgeImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEdge()
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
	int EDGE__NAME = EPK__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NODES = EPK__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGES = EPK__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECTIONS = EPK__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = EPK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.NodeImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = EPK__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODES = EPK__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EDGES = EPK__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONNECTIONS = EPK__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = EPK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EventImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FunctionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.InOutputImpl <em>In Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.InOutputImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getInOutput()
	 * @generated
	 */
	int IN_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUTPUT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUTPUT__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUTPUT__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUTPUT__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>In Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUTPUT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.OrgUnitImpl <em>Org Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.OrgUnitImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getOrgUnit()
	 * @generated
	 */
	int ORG_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Org Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.ProcPathImpl <em>Proc Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.ProcPathImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getProcPath()
	 * @generated
	 */
	int PROC_PATH = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_PATH__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_PATH__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_PATH__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_PATH__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Proc Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_PATH_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.ConnectorImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EConnectorImpl <em>EConnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EConnectorImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEConnector()
	 * @generated
	 */
	int ECONNECTOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR__NODES = CONNECTOR__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR__EDGES = CONNECTOR__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR__CONNECTIONS = CONNECTOR__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>EConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FConnectorImpl <em>FConnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FConnectorImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFConnector()
	 * @generated
	 */
	int FCONNECTOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONNECTOR__NODES = CONNECTOR__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONNECTOR__EDGES = CONNECTOR__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONNECTOR__CONNECTIONS = CONNECTOR__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>FConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.DefaultConnectionImpl <em>Default Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.DefaultConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getDefaultConnection()
	 * @generated
	 */
	int DEFAULT_CONNECTION = 12;

	/**
	 * The number of structural features of the '<em>Default Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EvToFuConnectionImpl <em>Ev To Fu Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EvToFuConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEvToFuConnection()
	 * @generated
	 */
	int EV_TO_FU_CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_TO_FU_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_TO_FU_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ev To Fu Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_TO_FU_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FuToEvConnectionImpl <em>Fu To Ev Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FuToEvConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFuToEvConnection()
	 * @generated
	 */
	int FU_TO_EV_CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_EV_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_EV_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fu To Ev Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_EV_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EvToEConConnectionImpl <em>Ev To ECon Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EvToEConConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEvToEConConnection()
	 * @generated
	 */
	int EV_TO_ECON_CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_TO_ECON_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_TO_ECON_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ev To ECon Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_TO_ECON_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EConToFuConnectionImpl <em>ECon To Fu Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EConToFuConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEConToFuConnection()
	 * @generated
	 */
	int ECON_TO_FU_CONNECTION = 16;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECON_TO_FU_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECON_TO_FU_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECon To Fu Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECON_TO_FU_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FuToFConConnectionImpl <em>Fu To FCon Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FuToFConConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFuToFConConnection()
	 * @generated
	 */
	int FU_TO_FCON_CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_FCON_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_FCON_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fu To FCon Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_FCON_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FConToEvConnectionImpl <em>FCon To Ev Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FConToEvConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFConToEvConnection()
	 * @generated
	 */
	int FCON_TO_EV_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCON_TO_EV_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCON_TO_EV_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FCon To Ev Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCON_TO_EV_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.OuToFuConnectionImpl <em>Ou To Fu Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.OuToFuConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getOuToFuConnection()
	 * @generated
	 */
	int OU_TO_FU_CONNECTION = 19;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_TO_FU_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_TO_FU_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ou To Fu Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_TO_FU_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.IoToFuConnectionImpl <em>Io To Fu Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.IoToFuConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getIoToFuConnection()
	 * @generated
	 */
	int IO_TO_FU_CONNECTION = 20;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TO_FU_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TO_FU_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Io To Fu Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TO_FU_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.NodeToPpConnectionImpl <em>Node To Pp Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.NodeToPpConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getNodeToPpConnection()
	 * @generated
	 */
	int NODE_TO_PP_CONNECTION = 21;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PP_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PP_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node To Pp Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PP_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.PpToNodeConnectionImpl <em>Pp To Node Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.PpToNodeConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getPpToNodeConnection()
	 * @generated
	 */
	int PP_TO_NODE_CONNECTION = 22;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_TO_NODE_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_TO_NODE_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pp To Node Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_TO_NODE_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.StartEventImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.EndEventImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EDGES = NODE__EDGES;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__CONNECTIONS = NODE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.StartEvToFuConnectionImpl <em>Start Ev To Fu Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.StartEvToFuConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getStartEvToFuConnection()
	 * @generated
	 */
	int START_EV_TO_FU_CONNECTION = 25;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EV_TO_FU_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EV_TO_FU_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Ev To Fu Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EV_TO_FU_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.StartEvToEConConnectionImpl <em>Start Ev To ECon Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.StartEvToEConConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getStartEvToEConConnection()
	 * @generated
	 */
	int START_EV_TO_ECON_CONNECTION = 26;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EV_TO_ECON_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EV_TO_ECON_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Ev To ECon Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EV_TO_ECON_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FuToEndEvConnectionImpl <em>Fu To End Ev Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FuToEndEvConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFuToEndEvConnection()
	 * @generated
	 */
	int FU_TO_END_EV_CONNECTION = 27;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_END_EV_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_END_EV_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fu To End Ev Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FU_TO_END_EV_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EpkDSL.impl.FConToEndEvConnectionImpl <em>FCon To End Ev Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EpkDSL.impl.FConToEndEvConnectionImpl
	 * @see EpkDSL.impl.EpkDSLPackageImpl#getFConToEndEvConnection()
	 * @generated
	 */
	int FCON_TO_END_EV_CONNECTION = 28;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCON_TO_END_EV_CONNECTION__START = DEFAULT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCON_TO_END_EV_CONNECTION__END = DEFAULT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FCon To End Ev Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCON_TO_END_EV_CONNECTION_FEATURE_COUNT = DEFAULT_CONNECTION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link EpkDSL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see EpkDSL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link EpkDSL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EpkDSL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link EpkDSL.Epk <em>Epk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epk</em>'.
	 * @see EpkDSL.Epk
	 * @generated
	 */
	EClass getEpk();

	/**
	 * Returns the meta object for the containment reference list '{@link EpkDSL.Epk#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see EpkDSL.Epk#getNodes()
	 * @see #getEpk()
	 * @generated
	 */
	EReference getEpk_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link EpkDSL.Epk#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see EpkDSL.Epk#getEdges()
	 * @see #getEpk()
	 * @generated
	 */
	EReference getEpk_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link EpkDSL.Epk#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see EpkDSL.Epk#getConnections()
	 * @see #getEpk()
	 * @generated
	 */
	EReference getEpk_Connections();

	/**
	 * Returns the meta object for class '{@link EpkDSL.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see EpkDSL.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link EpkDSL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see EpkDSL.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link EpkDSL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see EpkDSL.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link EpkDSL.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see EpkDSL.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link EpkDSL.InOutput <em>In Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Output</em>'.
	 * @see EpkDSL.InOutput
	 * @generated
	 */
	EClass getInOutput();

	/**
	 * Returns the meta object for class '{@link EpkDSL.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Unit</em>'.
	 * @see EpkDSL.OrgUnit
	 * @generated
	 */
	EClass getOrgUnit();

	/**
	 * Returns the meta object for class '{@link EpkDSL.ProcPath <em>Proc Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proc Path</em>'.
	 * @see EpkDSL.ProcPath
	 * @generated
	 */
	EClass getProcPath();

	/**
	 * Returns the meta object for class '{@link EpkDSL.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see EpkDSL.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link EpkDSL.EConnector <em>EConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EConnector</em>'.
	 * @see EpkDSL.EConnector
	 * @generated
	 */
	EClass getEConnector();

	/**
	 * Returns the meta object for class '{@link EpkDSL.FConnector <em>FConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FConnector</em>'.
	 * @see EpkDSL.FConnector
	 * @generated
	 */
	EClass getFConnector();

	/**
	 * Returns the meta object for class '{@link EpkDSL.DefaultConnection <em>Default Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Connection</em>'.
	 * @see EpkDSL.DefaultConnection
	 * @generated
	 */
	EClass getDefaultConnection();

	/**
	 * Returns the meta object for class '{@link EpkDSL.EvToFuConnection <em>Ev To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ev To Fu Connection</em>'.
	 * @see EpkDSL.EvToFuConnection
	 * @generated
	 */
	EClass getEvToFuConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.EvToFuConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.EvToFuConnection#getStart()
	 * @see #getEvToFuConnection()
	 * @generated
	 */
	EReference getEvToFuConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.EvToFuConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.EvToFuConnection#getEnd()
	 * @see #getEvToFuConnection()
	 * @generated
	 */
	EReference getEvToFuConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.FuToEvConnection <em>Fu To Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fu To Ev Connection</em>'.
	 * @see EpkDSL.FuToEvConnection
	 * @generated
	 */
	EClass getFuToEvConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FuToEvConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.FuToEvConnection#getStart()
	 * @see #getFuToEvConnection()
	 * @generated
	 */
	EReference getFuToEvConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FuToEvConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.FuToEvConnection#getEnd()
	 * @see #getFuToEvConnection()
	 * @generated
	 */
	EReference getFuToEvConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.EvToEConConnection <em>Ev To ECon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ev To ECon Connection</em>'.
	 * @see EpkDSL.EvToEConConnection
	 * @generated
	 */
	EClass getEvToEConConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.EvToEConConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.EvToEConConnection#getStart()
	 * @see #getEvToEConConnection()
	 * @generated
	 */
	EReference getEvToEConConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.EvToEConConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.EvToEConConnection#getEnd()
	 * @see #getEvToEConConnection()
	 * @generated
	 */
	EReference getEvToEConConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.EConToFuConnection <em>ECon To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECon To Fu Connection</em>'.
	 * @see EpkDSL.EConToFuConnection
	 * @generated
	 */
	EClass getEConToFuConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.EConToFuConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.EConToFuConnection#getStart()
	 * @see #getEConToFuConnection()
	 * @generated
	 */
	EReference getEConToFuConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.EConToFuConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.EConToFuConnection#getEnd()
	 * @see #getEConToFuConnection()
	 * @generated
	 */
	EReference getEConToFuConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.FuToFConConnection <em>Fu To FCon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fu To FCon Connection</em>'.
	 * @see EpkDSL.FuToFConConnection
	 * @generated
	 */
	EClass getFuToFConConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FuToFConConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.FuToFConConnection#getStart()
	 * @see #getFuToFConConnection()
	 * @generated
	 */
	EReference getFuToFConConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FuToFConConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.FuToFConConnection#getEnd()
	 * @see #getFuToFConConnection()
	 * @generated
	 */
	EReference getFuToFConConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.FConToEvConnection <em>FCon To Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FCon To Ev Connection</em>'.
	 * @see EpkDSL.FConToEvConnection
	 * @generated
	 */
	EClass getFConToEvConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FConToEvConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.FConToEvConnection#getStart()
	 * @see #getFConToEvConnection()
	 * @generated
	 */
	EReference getFConToEvConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FConToEvConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.FConToEvConnection#getEnd()
	 * @see #getFConToEvConnection()
	 * @generated
	 */
	EReference getFConToEvConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.OuToFuConnection <em>Ou To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ou To Fu Connection</em>'.
	 * @see EpkDSL.OuToFuConnection
	 * @generated
	 */
	EClass getOuToFuConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.OuToFuConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.OuToFuConnection#getStart()
	 * @see #getOuToFuConnection()
	 * @generated
	 */
	EReference getOuToFuConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.OuToFuConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.OuToFuConnection#getEnd()
	 * @see #getOuToFuConnection()
	 * @generated
	 */
	EReference getOuToFuConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.IoToFuConnection <em>Io To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io To Fu Connection</em>'.
	 * @see EpkDSL.IoToFuConnection
	 * @generated
	 */
	EClass getIoToFuConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.IoToFuConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.IoToFuConnection#getStart()
	 * @see #getIoToFuConnection()
	 * @generated
	 */
	EReference getIoToFuConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.IoToFuConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.IoToFuConnection#getEnd()
	 * @see #getIoToFuConnection()
	 * @generated
	 */
	EReference getIoToFuConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.NodeToPpConnection <em>Node To Pp Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node To Pp Connection</em>'.
	 * @see EpkDSL.NodeToPpConnection
	 * @generated
	 */
	EClass getNodeToPpConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.NodeToPpConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.NodeToPpConnection#getStart()
	 * @see #getNodeToPpConnection()
	 * @generated
	 */
	EReference getNodeToPpConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.NodeToPpConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.NodeToPpConnection#getEnd()
	 * @see #getNodeToPpConnection()
	 * @generated
	 */
	EReference getNodeToPpConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.PpToNodeConnection <em>Pp To Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pp To Node Connection</em>'.
	 * @see EpkDSL.PpToNodeConnection
	 * @generated
	 */
	EClass getPpToNodeConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.PpToNodeConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.PpToNodeConnection#getStart()
	 * @see #getPpToNodeConnection()
	 * @generated
	 */
	EReference getPpToNodeConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.PpToNodeConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.PpToNodeConnection#getEnd()
	 * @see #getPpToNodeConnection()
	 * @generated
	 */
	EReference getPpToNodeConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see EpkDSL.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for class '{@link EpkDSL.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see EpkDSL.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link EpkDSL.StartEvToFuConnection <em>Start Ev To Fu Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Ev To Fu Connection</em>'.
	 * @see EpkDSL.StartEvToFuConnection
	 * @generated
	 */
	EClass getStartEvToFuConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.StartEvToFuConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.StartEvToFuConnection#getStart()
	 * @see #getStartEvToFuConnection()
	 * @generated
	 */
	EReference getStartEvToFuConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.StartEvToFuConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.StartEvToFuConnection#getEnd()
	 * @see #getStartEvToFuConnection()
	 * @generated
	 */
	EReference getStartEvToFuConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.StartEvToEConConnection <em>Start Ev To ECon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Ev To ECon Connection</em>'.
	 * @see EpkDSL.StartEvToEConConnection
	 * @generated
	 */
	EClass getStartEvToEConConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.StartEvToEConConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.StartEvToEConConnection#getStart()
	 * @see #getStartEvToEConConnection()
	 * @generated
	 */
	EReference getStartEvToEConConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.StartEvToEConConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.StartEvToEConConnection#getEnd()
	 * @see #getStartEvToEConConnection()
	 * @generated
	 */
	EReference getStartEvToEConConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.FuToEndEvConnection <em>Fu To End Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fu To End Ev Connection</em>'.
	 * @see EpkDSL.FuToEndEvConnection
	 * @generated
	 */
	EClass getFuToEndEvConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FuToEndEvConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.FuToEndEvConnection#getStart()
	 * @see #getFuToEndEvConnection()
	 * @generated
	 */
	EReference getFuToEndEvConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FuToEndEvConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.FuToEndEvConnection#getEnd()
	 * @see #getFuToEndEvConnection()
	 * @generated
	 */
	EReference getFuToEndEvConnection_End();

	/**
	 * Returns the meta object for class '{@link EpkDSL.FConToEndEvConnection <em>FCon To End Ev Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FCon To End Ev Connection</em>'.
	 * @see EpkDSL.FConToEndEvConnection
	 * @generated
	 */
	EClass getFConToEndEvConnection();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FConToEndEvConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see EpkDSL.FConToEndEvConnection#getStart()
	 * @see #getFConToEndEvConnection()
	 * @generated
	 */
	EReference getFConToEndEvConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link EpkDSL.FConToEndEvConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see EpkDSL.FConToEndEvConnection#getEnd()
	 * @see #getFConToEndEvConnection()
	 * @generated
	 */
	EReference getFConToEndEvConnection_End();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EpkDSLFactory getEpkDSLFactory();

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
		 * The meta object literal for the '{@link EpkDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.NamedElementImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EpkImpl <em>Epk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EpkImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEpk()
		 * @generated
		 */
		EClass EPK = eINSTANCE.getEpk();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPK__NODES = eINSTANCE.getEpk_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPK__EDGES = eINSTANCE.getEpk_Edges();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPK__CONNECTIONS = eINSTANCE.getEpk_Connections();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EdgeImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.NodeImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EventImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FunctionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.InOutputImpl <em>In Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.InOutputImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getInOutput()
		 * @generated
		 */
		EClass IN_OUTPUT = eINSTANCE.getInOutput();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.OrgUnitImpl <em>Org Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.OrgUnitImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getOrgUnit()
		 * @generated
		 */
		EClass ORG_UNIT = eINSTANCE.getOrgUnit();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.ProcPathImpl <em>Proc Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.ProcPathImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getProcPath()
		 * @generated
		 */
		EClass PROC_PATH = eINSTANCE.getProcPath();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.ConnectorImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EConnectorImpl <em>EConnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EConnectorImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEConnector()
		 * @generated
		 */
		EClass ECONNECTOR = eINSTANCE.getEConnector();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FConnectorImpl <em>FConnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FConnectorImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFConnector()
		 * @generated
		 */
		EClass FCONNECTOR = eINSTANCE.getFConnector();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.DefaultConnectionImpl <em>Default Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.DefaultConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getDefaultConnection()
		 * @generated
		 */
		EClass DEFAULT_CONNECTION = eINSTANCE.getDefaultConnection();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EvToFuConnectionImpl <em>Ev To Fu Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EvToFuConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEvToFuConnection()
		 * @generated
		 */
		EClass EV_TO_FU_CONNECTION = eINSTANCE.getEvToFuConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV_TO_FU_CONNECTION__START = eINSTANCE.getEvToFuConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV_TO_FU_CONNECTION__END = eINSTANCE.getEvToFuConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FuToEvConnectionImpl <em>Fu To Ev Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FuToEvConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFuToEvConnection()
		 * @generated
		 */
		EClass FU_TO_EV_CONNECTION = eINSTANCE.getFuToEvConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FU_TO_EV_CONNECTION__START = eINSTANCE.getFuToEvConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FU_TO_EV_CONNECTION__END = eINSTANCE.getFuToEvConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EvToEConConnectionImpl <em>Ev To ECon Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EvToEConConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEvToEConConnection()
		 * @generated
		 */
		EClass EV_TO_ECON_CONNECTION = eINSTANCE.getEvToEConConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV_TO_ECON_CONNECTION__START = eINSTANCE.getEvToEConConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV_TO_ECON_CONNECTION__END = eINSTANCE.getEvToEConConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EConToFuConnectionImpl <em>ECon To Fu Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EConToFuConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEConToFuConnection()
		 * @generated
		 */
		EClass ECON_TO_FU_CONNECTION = eINSTANCE.getEConToFuConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECON_TO_FU_CONNECTION__START = eINSTANCE.getEConToFuConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECON_TO_FU_CONNECTION__END = eINSTANCE.getEConToFuConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FuToFConConnectionImpl <em>Fu To FCon Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FuToFConConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFuToFConConnection()
		 * @generated
		 */
		EClass FU_TO_FCON_CONNECTION = eINSTANCE.getFuToFConConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FU_TO_FCON_CONNECTION__START = eINSTANCE.getFuToFConConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FU_TO_FCON_CONNECTION__END = eINSTANCE.getFuToFConConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FConToEvConnectionImpl <em>FCon To Ev Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FConToEvConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFConToEvConnection()
		 * @generated
		 */
		EClass FCON_TO_EV_CONNECTION = eINSTANCE.getFConToEvConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCON_TO_EV_CONNECTION__START = eINSTANCE.getFConToEvConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCON_TO_EV_CONNECTION__END = eINSTANCE.getFConToEvConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.OuToFuConnectionImpl <em>Ou To Fu Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.OuToFuConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getOuToFuConnection()
		 * @generated
		 */
		EClass OU_TO_FU_CONNECTION = eINSTANCE.getOuToFuConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OU_TO_FU_CONNECTION__START = eINSTANCE.getOuToFuConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OU_TO_FU_CONNECTION__END = eINSTANCE.getOuToFuConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.IoToFuConnectionImpl <em>Io To Fu Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.IoToFuConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getIoToFuConnection()
		 * @generated
		 */
		EClass IO_TO_FU_CONNECTION = eINSTANCE.getIoToFuConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TO_FU_CONNECTION__START = eINSTANCE.getIoToFuConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TO_FU_CONNECTION__END = eINSTANCE.getIoToFuConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.NodeToPpConnectionImpl <em>Node To Pp Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.NodeToPpConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getNodeToPpConnection()
		 * @generated
		 */
		EClass NODE_TO_PP_CONNECTION = eINSTANCE.getNodeToPpConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TO_PP_CONNECTION__START = eINSTANCE.getNodeToPpConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TO_PP_CONNECTION__END = eINSTANCE.getNodeToPpConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.PpToNodeConnectionImpl <em>Pp To Node Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.PpToNodeConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getPpToNodeConnection()
		 * @generated
		 */
		EClass PP_TO_NODE_CONNECTION = eINSTANCE.getPpToNodeConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PP_TO_NODE_CONNECTION__START = eINSTANCE.getPpToNodeConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PP_TO_NODE_CONNECTION__END = eINSTANCE.getPpToNodeConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.StartEventImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.EndEventImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.StartEvToFuConnectionImpl <em>Start Ev To Fu Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.StartEvToFuConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getStartEvToFuConnection()
		 * @generated
		 */
		EClass START_EV_TO_FU_CONNECTION = eINSTANCE.getStartEvToFuConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EV_TO_FU_CONNECTION__START = eINSTANCE.getStartEvToFuConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EV_TO_FU_CONNECTION__END = eINSTANCE.getStartEvToFuConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.StartEvToEConConnectionImpl <em>Start Ev To ECon Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.StartEvToEConConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getStartEvToEConConnection()
		 * @generated
		 */
		EClass START_EV_TO_ECON_CONNECTION = eINSTANCE.getStartEvToEConConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EV_TO_ECON_CONNECTION__START = eINSTANCE.getStartEvToEConConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EV_TO_ECON_CONNECTION__END = eINSTANCE.getStartEvToEConConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FuToEndEvConnectionImpl <em>Fu To End Ev Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FuToEndEvConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFuToEndEvConnection()
		 * @generated
		 */
		EClass FU_TO_END_EV_CONNECTION = eINSTANCE.getFuToEndEvConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FU_TO_END_EV_CONNECTION__START = eINSTANCE.getFuToEndEvConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FU_TO_END_EV_CONNECTION__END = eINSTANCE.getFuToEndEvConnection_End();

		/**
		 * The meta object literal for the '{@link EpkDSL.impl.FConToEndEvConnectionImpl <em>FCon To End Ev Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EpkDSL.impl.FConToEndEvConnectionImpl
		 * @see EpkDSL.impl.EpkDSLPackageImpl#getFConToEndEvConnection()
		 * @generated
		 */
		EClass FCON_TO_END_EV_CONNECTION = eINSTANCE.getFConToEndEvConnection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCON_TO_END_EV_CONNECTION__START = eINSTANCE.getFConToEndEvConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCON_TO_END_EV_CONNECTION__END = eINSTANCE.getFConToEndEvConnection_End();

	}

} //EpkDSLPackage
