/**
 */
package EpkDSL.impl;

import EpkDSL.Connector;
import EpkDSL.DefaultConnection;
import EpkDSL.EConToFuConnection;
import EpkDSL.EConnector;
import EpkDSL.Edge;
import EpkDSL.EndEvent;
import EpkDSL.Epk;
import EpkDSL.EpkDSLFactory;
import EpkDSL.EpkDSLPackage;
import EpkDSL.EvToEConConnection;
import EpkDSL.EvToFuConnection;
import EpkDSL.Event;
import EpkDSL.FConToEndEvConnection;
import EpkDSL.FConToEvConnection;
import EpkDSL.FConnector;
import EpkDSL.FuToEndEvConnection;
import EpkDSL.FuToEvConnection;
import EpkDSL.FuToFConConnection;
import EpkDSL.Function;
import EpkDSL.InOutput;
import EpkDSL.IoToFuConnection;
import EpkDSL.NamedElement;
import EpkDSL.Node;
import EpkDSL.NodeToPpConnection;
import EpkDSL.OrgUnit;
import EpkDSL.OuToFuConnection;
import EpkDSL.PpToNodeConnection;
import EpkDSL.ProcPath;
import EpkDSL.StartEvToEConConnection;
import EpkDSL.StartEvToFuConnection;
import EpkDSL.StartEvent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpkDSLPackageImpl extends EPackageImpl implements EpkDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evToFuConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuToEvConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evToEConConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eConToFuConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuToFConConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fConToEvConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ouToFuConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioToFuConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeToPpConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppToNodeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEvToFuConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEvToEConConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuToEndEvConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fConToEndEvConnectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see EpkDSL.EpkDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EpkDSLPackageImpl() {
		super(eNS_URI, EpkDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EpkDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EpkDSLPackage init() {
		if (isInited) return (EpkDSLPackage)EPackage.Registry.INSTANCE.getEPackage(EpkDSLPackage.eNS_URI);

		// Obtain or create and register package
		EpkDSLPackageImpl theEpkDSLPackage = (EpkDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EpkDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EpkDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEpkDSLPackage.createPackageContents();

		// Initialize created meta-data
		theEpkDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEpkDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EpkDSLPackage.eNS_URI, theEpkDSLPackage);
		return theEpkDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpk() {
		return epkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpk_Nodes() {
		return (EReference)epkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpk_Edges() {
		return (EReference)epkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpk_Connections() {
		return (EReference)epkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInOutput() {
		return inOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrgUnit() {
		return orgUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcPath() {
		return procPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEConnector() {
		return eConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFConnector() {
		return fConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultConnection() {
		return defaultConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvToFuConnection() {
		return evToFuConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvToFuConnection_Start() {
		return (EReference)evToFuConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvToFuConnection_End() {
		return (EReference)evToFuConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuToEvConnection() {
		return fuToEvConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuToEvConnection_Start() {
		return (EReference)fuToEvConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuToEvConnection_End() {
		return (EReference)fuToEvConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvToEConConnection() {
		return evToEConConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvToEConConnection_Start() {
		return (EReference)evToEConConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvToEConConnection_End() {
		return (EReference)evToEConConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEConToFuConnection() {
		return eConToFuConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEConToFuConnection_Start() {
		return (EReference)eConToFuConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEConToFuConnection_End() {
		return (EReference)eConToFuConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuToFConConnection() {
		return fuToFConConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuToFConConnection_Start() {
		return (EReference)fuToFConConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuToFConConnection_End() {
		return (EReference)fuToFConConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFConToEvConnection() {
		return fConToEvConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFConToEvConnection_Start() {
		return (EReference)fConToEvConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFConToEvConnection_End() {
		return (EReference)fConToEvConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOuToFuConnection() {
		return ouToFuConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOuToFuConnection_Start() {
		return (EReference)ouToFuConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOuToFuConnection_End() {
		return (EReference)ouToFuConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoToFuConnection() {
		return ioToFuConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoToFuConnection_Start() {
		return (EReference)ioToFuConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoToFuConnection_End() {
		return (EReference)ioToFuConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeToPpConnection() {
		return nodeToPpConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeToPpConnection_Start() {
		return (EReference)nodeToPpConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeToPpConnection_End() {
		return (EReference)nodeToPpConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPpToNodeConnection() {
		return ppToNodeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPpToNodeConnection_Start() {
		return (EReference)ppToNodeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPpToNodeConnection_End() {
		return (EReference)ppToNodeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvToFuConnection() {
		return startEvToFuConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEvToFuConnection_Start() {
		return (EReference)startEvToFuConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEvToFuConnection_End() {
		return (EReference)startEvToFuConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvToEConConnection() {
		return startEvToEConConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEvToEConConnection_Start() {
		return (EReference)startEvToEConConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEvToEConConnection_End() {
		return (EReference)startEvToEConConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuToEndEvConnection() {
		return fuToEndEvConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuToEndEvConnection_Start() {
		return (EReference)fuToEndEvConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuToEndEvConnection_End() {
		return (EReference)fuToEndEvConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFConToEndEvConnection() {
		return fConToEndEvConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFConToEndEvConnection_Start() {
		return (EReference)fConToEndEvConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFConToEndEvConnection_End() {
		return (EReference)fConToEndEvConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLFactory getEpkDSLFactory() {
		return (EpkDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		epkEClass = createEClass(EPK);
		createEReference(epkEClass, EPK__NODES);
		createEReference(epkEClass, EPK__EDGES);
		createEReference(epkEClass, EPK__CONNECTIONS);

		edgeEClass = createEClass(EDGE);

		nodeEClass = createEClass(NODE);

		eventEClass = createEClass(EVENT);

		functionEClass = createEClass(FUNCTION);

		inOutputEClass = createEClass(IN_OUTPUT);

		orgUnitEClass = createEClass(ORG_UNIT);

		procPathEClass = createEClass(PROC_PATH);

		connectorEClass = createEClass(CONNECTOR);

		eConnectorEClass = createEClass(ECONNECTOR);

		fConnectorEClass = createEClass(FCONNECTOR);

		defaultConnectionEClass = createEClass(DEFAULT_CONNECTION);

		evToFuConnectionEClass = createEClass(EV_TO_FU_CONNECTION);
		createEReference(evToFuConnectionEClass, EV_TO_FU_CONNECTION__START);
		createEReference(evToFuConnectionEClass, EV_TO_FU_CONNECTION__END);

		fuToEvConnectionEClass = createEClass(FU_TO_EV_CONNECTION);
		createEReference(fuToEvConnectionEClass, FU_TO_EV_CONNECTION__START);
		createEReference(fuToEvConnectionEClass, FU_TO_EV_CONNECTION__END);

		evToEConConnectionEClass = createEClass(EV_TO_ECON_CONNECTION);
		createEReference(evToEConConnectionEClass, EV_TO_ECON_CONNECTION__START);
		createEReference(evToEConConnectionEClass, EV_TO_ECON_CONNECTION__END);

		eConToFuConnectionEClass = createEClass(ECON_TO_FU_CONNECTION);
		createEReference(eConToFuConnectionEClass, ECON_TO_FU_CONNECTION__START);
		createEReference(eConToFuConnectionEClass, ECON_TO_FU_CONNECTION__END);

		fuToFConConnectionEClass = createEClass(FU_TO_FCON_CONNECTION);
		createEReference(fuToFConConnectionEClass, FU_TO_FCON_CONNECTION__START);
		createEReference(fuToFConConnectionEClass, FU_TO_FCON_CONNECTION__END);

		fConToEvConnectionEClass = createEClass(FCON_TO_EV_CONNECTION);
		createEReference(fConToEvConnectionEClass, FCON_TO_EV_CONNECTION__START);
		createEReference(fConToEvConnectionEClass, FCON_TO_EV_CONNECTION__END);

		ouToFuConnectionEClass = createEClass(OU_TO_FU_CONNECTION);
		createEReference(ouToFuConnectionEClass, OU_TO_FU_CONNECTION__START);
		createEReference(ouToFuConnectionEClass, OU_TO_FU_CONNECTION__END);

		ioToFuConnectionEClass = createEClass(IO_TO_FU_CONNECTION);
		createEReference(ioToFuConnectionEClass, IO_TO_FU_CONNECTION__START);
		createEReference(ioToFuConnectionEClass, IO_TO_FU_CONNECTION__END);

		nodeToPpConnectionEClass = createEClass(NODE_TO_PP_CONNECTION);
		createEReference(nodeToPpConnectionEClass, NODE_TO_PP_CONNECTION__START);
		createEReference(nodeToPpConnectionEClass, NODE_TO_PP_CONNECTION__END);

		ppToNodeConnectionEClass = createEClass(PP_TO_NODE_CONNECTION);
		createEReference(ppToNodeConnectionEClass, PP_TO_NODE_CONNECTION__START);
		createEReference(ppToNodeConnectionEClass, PP_TO_NODE_CONNECTION__END);

		startEventEClass = createEClass(START_EVENT);

		endEventEClass = createEClass(END_EVENT);

		startEvToFuConnectionEClass = createEClass(START_EV_TO_FU_CONNECTION);
		createEReference(startEvToFuConnectionEClass, START_EV_TO_FU_CONNECTION__START);
		createEReference(startEvToFuConnectionEClass, START_EV_TO_FU_CONNECTION__END);

		startEvToEConConnectionEClass = createEClass(START_EV_TO_ECON_CONNECTION);
		createEReference(startEvToEConConnectionEClass, START_EV_TO_ECON_CONNECTION__START);
		createEReference(startEvToEConConnectionEClass, START_EV_TO_ECON_CONNECTION__END);

		fuToEndEvConnectionEClass = createEClass(FU_TO_END_EV_CONNECTION);
		createEReference(fuToEndEvConnectionEClass, FU_TO_END_EV_CONNECTION__START);
		createEReference(fuToEndEvConnectionEClass, FU_TO_END_EV_CONNECTION__END);

		fConToEndEvConnectionEClass = createEClass(FCON_TO_END_EV_CONNECTION);
		createEReference(fConToEndEvConnectionEClass, FCON_TO_END_EV_CONNECTION__START);
		createEReference(fConToEndEvConnectionEClass, FCON_TO_END_EV_CONNECTION__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		epkEClass.getESuperTypes().add(this.getNamedElement());
		edgeEClass.getESuperTypes().add(this.getEpk());
		nodeEClass.getESuperTypes().add(this.getEpk());
		eventEClass.getESuperTypes().add(this.getNode());
		functionEClass.getESuperTypes().add(this.getNode());
		inOutputEClass.getESuperTypes().add(this.getNode());
		orgUnitEClass.getESuperTypes().add(this.getNode());
		procPathEClass.getESuperTypes().add(this.getNode());
		connectorEClass.getESuperTypes().add(this.getNode());
		eConnectorEClass.getESuperTypes().add(this.getConnector());
		fConnectorEClass.getESuperTypes().add(this.getConnector());
		evToFuConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		fuToEvConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		evToEConConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		eConToFuConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		fuToFConConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		fConToEvConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		ouToFuConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		ioToFuConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		nodeToPpConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		ppToNodeConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		startEventEClass.getESuperTypes().add(this.getNode());
		endEventEClass.getESuperTypes().add(this.getNode());
		startEvToFuConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		startEvToEConConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		fuToEndEvConnectionEClass.getESuperTypes().add(this.getDefaultConnection());
		fConToEndEvConnectionEClass.getESuperTypes().add(this.getDefaultConnection());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epkEClass, Epk.class, "Epk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEpk_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Epk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpk_Edges(), this.getEdge(), null, "edges", null, 0, -1, Epk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpk_Connections(), this.getDefaultConnection(), null, "connections", null, 0, -1, Epk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inOutputEClass, InOutput.class, "InOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orgUnitEClass, OrgUnit.class, "OrgUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procPathEClass, ProcPath.class, "ProcPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eConnectorEClass, EConnector.class, "EConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fConnectorEClass, FConnector.class, "FConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultConnectionEClass, DefaultConnection.class, "DefaultConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evToFuConnectionEClass, EvToFuConnection.class, "EvToFuConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvToFuConnection_Start(), this.getEvent(), null, "start", null, 1, 1, EvToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvToFuConnection_End(), this.getFunction(), null, "end", null, 1, 1, EvToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuToEvConnectionEClass, FuToEvConnection.class, "FuToEvConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuToEvConnection_Start(), this.getFunction(), null, "start", null, 1, 1, FuToEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuToEvConnection_End(), this.getEvent(), null, "end", null, 1, 1, FuToEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evToEConConnectionEClass, EvToEConConnection.class, "EvToEConConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvToEConConnection_Start(), this.getEvent(), null, "start", null, 1, 1, EvToEConConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvToEConConnection_End(), this.getEConnector(), null, "end", null, 1, 1, EvToEConConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eConToFuConnectionEClass, EConToFuConnection.class, "EConToFuConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEConToFuConnection_Start(), this.getEConnector(), null, "start", null, 1, 1, EConToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEConToFuConnection_End(), this.getFunction(), null, "end", null, 1, 1, EConToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuToFConConnectionEClass, FuToFConConnection.class, "FuToFConConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuToFConConnection_Start(), this.getFunction(), null, "start", null, 1, 1, FuToFConConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuToFConConnection_End(), this.getFConnector(), null, "end", null, 1, 1, FuToFConConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fConToEvConnectionEClass, FConToEvConnection.class, "FConToEvConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFConToEvConnection_Start(), this.getFConnector(), null, "start", null, 1, 1, FConToEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFConToEvConnection_End(), this.getEvent(), null, "end", null, 1, 1, FConToEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ouToFuConnectionEClass, OuToFuConnection.class, "OuToFuConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOuToFuConnection_Start(), this.getOrgUnit(), null, "start", null, 1, 1, OuToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuToFuConnection_End(), this.getFunction(), null, "end", null, 1, 1, OuToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioToFuConnectionEClass, IoToFuConnection.class, "IoToFuConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoToFuConnection_Start(), this.getInOutput(), null, "start", null, 1, 1, IoToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIoToFuConnection_End(), this.getFunction(), null, "end", null, 1, 1, IoToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeToPpConnectionEClass, NodeToPpConnection.class, "NodeToPpConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeToPpConnection_Start(), this.getNode(), null, "start", null, 1, 1, NodeToPpConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeToPpConnection_End(), this.getProcPath(), null, "end", null, 1, 1, NodeToPpConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ppToNodeConnectionEClass, PpToNodeConnection.class, "PpToNodeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPpToNodeConnection_Start(), this.getProcPath(), null, "start", null, 1, 1, PpToNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPpToNodeConnection_End(), this.getNode(), null, "end", null, 1, 1, PpToNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEvToFuConnectionEClass, StartEvToFuConnection.class, "StartEvToFuConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartEvToFuConnection_Start(), this.getStartEvent(), null, "start", null, 1, 1, StartEvToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartEvToFuConnection_End(), this.getFunction(), null, "end", null, 1, 1, StartEvToFuConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEvToEConConnectionEClass, StartEvToEConConnection.class, "StartEvToEConConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartEvToEConConnection_Start(), this.getStartEvent(), null, "start", null, 1, 1, StartEvToEConConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartEvToEConConnection_End(), this.getEConnector(), null, "end", null, 1, 1, StartEvToEConConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuToEndEvConnectionEClass, FuToEndEvConnection.class, "FuToEndEvConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuToEndEvConnection_Start(), this.getFunction(), null, "start", null, 1, 1, FuToEndEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuToEndEvConnection_End(), this.getEndEvent(), null, "end", null, 1, 1, FuToEndEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fConToEndEvConnectionEClass, FConToEndEvConnection.class, "FConToEndEvConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFConToEndEvConnection_Start(), this.getFConnector(), null, "start", null, 1, 1, FConToEndEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFConToEndEvConnection_End(), this.getEndEvent(), null, "end", null, 1, 1, FConToEndEvConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EpkDSLPackageImpl
