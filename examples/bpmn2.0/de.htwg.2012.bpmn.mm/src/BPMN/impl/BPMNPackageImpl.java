/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN.impl;

import BPMN.BPMNActivityCallActivity;
import BPMN.BPMNActivityEventSubProcess;
import BPMN.BPMNActivityTask;
import BPMN.BPMNActivityTransaction;
import BPMN.BPMNConditionalFlow;
import BPMN.BPMNConversationBold;
import BPMN.BPMNConversationDefault;
import BPMN.BPMNDataAssoziation;
import BPMN.BPMNDataStorage;
import BPMN.BPMNDefaultFlow;
import BPMN.BPMNEventCancelBoldInvert;
import BPMN.BPMNEventCancelDouble;
import BPMN.BPMNEventCompensationBoldInvert;
import BPMN.BPMNEventCompensationDefault;
import BPMN.BPMNEventCompensationDouble;
import BPMN.BPMNEventCompensationDoubleInvert;
import BPMN.BPMNEventEndDefault;
import BPMN.BPMNEventEndUsed;
import BPMN.BPMNEventErrorBoldInvert;
import BPMN.BPMNEventErrorDefault;
import BPMN.BPMNEventErrorDouble;
import BPMN.BPMNEventEskalationBoldInvert;
import BPMN.BPMNEventEskalationDash;
import BPMN.BPMNEventEskalationDoubelDash;
import BPMN.BPMNEventEskalationDoubelInvert;
import BPMN.BPMNEventEskalationDouble;
import BPMN.BPMNEventEskalationStart;
import BPMN.BPMNEventIfDash;
import BPMN.BPMNEventIfDefault;
import BPMN.BPMNEventIfDouble;
import BPMN.BPMNEventIfDoubleDash;
import BPMN.BPMNEventLinkEntered;
import BPMN.BPMNEventLinkTriggerd;
import BPMN.BPMNEventMail;
import BPMN.BPMNEventMailDash;
import BPMN.BPMNEventMailDouble;
import BPMN.BPMNEventMailDoubleDash;
import BPMN.BPMNEventMailInvertBold;
import BPMN.BPMNEventMailInvertDouble;
import BPMN.BPMNEventMultiBoldInvert;
import BPMN.BPMNEventMultiDash;
import BPMN.BPMNEventMultiDefault;
import BPMN.BPMNEventMultiDouble;
import BPMN.BPMNEventMultiDoubleDash;
import BPMN.BPMNEventMultiDoubleInvert;
import BPMN.BPMNEventParallelDash;
import BPMN.BPMNEventParallelDefault;
import BPMN.BPMNEventParallelDouble;
import BPMN.BPMNEventParallelDoubleDash;
import BPMN.BPMNEventSignalBoldInvert;
import BPMN.BPMNEventSignalDash;
import BPMN.BPMNEventSignalDefault;
import BPMN.BPMNEventSignalDouble;
import BPMN.BPMNEventSignalDoubleDash;
import BPMN.BPMNEventSignalDoubleInvert;
import BPMN.BPMNEventStartDefault;
import BPMN.BPMNEventTermination;
import BPMN.BPMNEventTimerDash;
import BPMN.BPMNEventTimerDefault;
import BPMN.BPMNEventTimerDouble;
import BPMN.BPMNEventTimerDoubleDash;
import BPMN.BPMNFactory;
import BPMN.BPMNGatewayAnd;
import BPMN.BPMNGatewayAndEvent;
import BPMN.BPMNGatewayComplex;
import BPMN.BPMNGatewayEvent;
import BPMN.BPMNGatewayOR;
import BPMN.BPMNGatewayXEvent;
import BPMN.BPMNGatewayXOR1;
import BPMN.BPMNGatewayXOR2;
import BPMN.BPMNListData;
import BPMN.BPMNModelElement;
import BPMN.BPMNOneData;
import BPMN.BPMNPackage;
import BPMN.BPMNSequenceFlow;

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
public class BPMNPackageImpl extends EPackageImpl implements BPMNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventStartDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEndDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEndUsedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMailDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMailDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMailDoubleDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMailInvertDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMailInvertBoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventTimerDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventTimerDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventTimerDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventTimerDoubleDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEskalationStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEskalationDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEskalationDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEskalationDoubelDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEskalationDoubelInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEskalationBoldInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventIfDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventIfDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventIfDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventIfDoubleDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventLinkEnteredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventLinkTriggerdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventErrorDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventErrorDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventErrorBoldInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventCancelDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventCancelBoldInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventCompensationDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventCompensationDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventCompensationDoubleInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventCompensationBoldInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventSignalDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventSignalDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventSignalDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventSignalDoubleDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventSignalDoubleInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventSignalBoldInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMultiDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMultiDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMultiDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMultiDoubleDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMultiDoubleInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventMultiBoldInvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventParallelDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventParallelDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventParallelDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventParallelDoubleDashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventTerminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnActivityTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnActivityTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnActivityEventSubProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnActivityCallActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayXOR1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayXOR2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayOREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayComplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayXEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnGatewayAndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnConversationDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnConversationBoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnOneDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnListDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnDataStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnSequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnDefaultFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnConditionalFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnDataAssoziationEClass = null;

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
	 * @see BPMN.BPMNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPMNPackageImpl() {
		super(eNS_URI, BPMNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BPMNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPMNPackage init() {
		if (isInited) return (BPMNPackage)EPackage.Registry.INSTANCE.getEPackage(BPMNPackage.eNS_URI);

		// Obtain or create and register package
		BPMNPackageImpl theBPMNPackage = (BPMNPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BPMNPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BPMNPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBPMNPackage.createPackageContents();

		// Initialize created meta-data
		theBPMNPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPMNPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPMNPackage.eNS_URI, theBPMNPackage);
		return theBPMNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNModelElement() {
		return bpmnModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNModelElement_Name() {
		return (EAttribute)bpmnModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNModelElement_Description() {
		return (EAttribute)bpmnModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNModelElement_ModelElements() {
		return (EReference)bpmnModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventStartDefault() {
		return bpmnEventStartDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEndDefault() {
		return bpmnEventEndDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEndUsed() {
		return bpmnEventEndUsedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMail() {
		return bpmnEventMailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMailDash() {
		return bpmnEventMailDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMailDouble() {
		return bpmnEventMailDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMailDoubleDash() {
		return bpmnEventMailDoubleDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMailInvertDouble() {
		return bpmnEventMailInvertDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMailInvertBold() {
		return bpmnEventMailInvertBoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventTimerDefault() {
		return bpmnEventTimerDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventTimerDash() {
		return bpmnEventTimerDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventTimerDouble() {
		return bpmnEventTimerDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventTimerDoubleDash() {
		return bpmnEventTimerDoubleDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEskalationStart() {
		return bpmnEventEskalationStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEskalationDash() {
		return bpmnEventEskalationDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEskalationDouble() {
		return bpmnEventEskalationDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEskalationDoubelDash() {
		return bpmnEventEskalationDoubelDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEskalationDoubelInvert() {
		return bpmnEventEskalationDoubelInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventEskalationBoldInvert() {
		return bpmnEventEskalationBoldInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventIfDefault() {
		return bpmnEventIfDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventIfDash() {
		return bpmnEventIfDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventIfDouble() {
		return bpmnEventIfDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventIfDoubleDash() {
		return bpmnEventIfDoubleDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventLinkEntered() {
		return bpmnEventLinkEnteredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventLinkTriggerd() {
		return bpmnEventLinkTriggerdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventErrorDefault() {
		return bpmnEventErrorDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventErrorDouble() {
		return bpmnEventErrorDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventErrorBoldInvert() {
		return bpmnEventErrorBoldInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventCancelDouble() {
		return bpmnEventCancelDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventCancelBoldInvert() {
		return bpmnEventCancelBoldInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventCompensationDefault() {
		return bpmnEventCompensationDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventCompensationDouble() {
		return bpmnEventCompensationDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventCompensationDoubleInvert() {
		return bpmnEventCompensationDoubleInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventCompensationBoldInvert() {
		return bpmnEventCompensationBoldInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventSignalDefault() {
		return bpmnEventSignalDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventSignalDash() {
		return bpmnEventSignalDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventSignalDouble() {
		return bpmnEventSignalDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventSignalDoubleDash() {
		return bpmnEventSignalDoubleDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventSignalDoubleInvert() {
		return bpmnEventSignalDoubleInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventSignalBoldInvert() {
		return bpmnEventSignalBoldInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMultiDefault() {
		return bpmnEventMultiDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMultiDash() {
		return bpmnEventMultiDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMultiDouble() {
		return bpmnEventMultiDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMultiDoubleDash() {
		return bpmnEventMultiDoubleDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMultiDoubleInvert() {
		return bpmnEventMultiDoubleInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventMultiBoldInvert() {
		return bpmnEventMultiBoldInvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventParallelDefault() {
		return bpmnEventParallelDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventParallelDash() {
		return bpmnEventParallelDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventParallelDouble() {
		return bpmnEventParallelDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventParallelDoubleDash() {
		return bpmnEventParallelDoubleDashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEventTermination() {
		return bpmnEventTerminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNActivityTask() {
		return bpmnActivityTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNActivityTransaction() {
		return bpmnActivityTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNActivityEventSubProcess() {
		return bpmnActivityEventSubProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNActivityCallActivity() {
		return bpmnActivityCallActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayXOR1() {
		return bpmnGatewayXOR1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayXOR2() {
		return bpmnGatewayXOR2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayEvent() {
		return bpmnGatewayEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayAnd() {
		return bpmnGatewayAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayOR() {
		return bpmnGatewayOREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayComplex() {
		return bpmnGatewayComplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayXEvent() {
		return bpmnGatewayXEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNGatewayAndEvent() {
		return bpmnGatewayAndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNConversationDefault() {
		return bpmnConversationDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNConversationBold() {
		return bpmnConversationBoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNOneData() {
		return bpmnOneDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNListData() {
		return bpmnListDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNDataStorage() {
		return bpmnDataStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNSequenceFlow() {
		return bpmnSequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNSequenceFlow_FormElement() {
		return (EReference)bpmnSequenceFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNSequenceFlow_ToElement() {
		return (EReference)bpmnSequenceFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNDefaultFlow() {
		return bpmnDefaultFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNDefaultFlow_FormElement() {
		return (EReference)bpmnDefaultFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNDefaultFlow_ToElement() {
		return (EReference)bpmnDefaultFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNConditionalFlow() {
		return bpmnConditionalFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNConditionalFlow_FormElement() {
		return (EReference)bpmnConditionalFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNConditionalFlow_ToElement() {
		return (EReference)bpmnConditionalFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNDataAssoziation() {
		return bpmnDataAssoziationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNDataAssoziation_FormElement() {
		return (EReference)bpmnDataAssoziationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNDataAssoziation_ToElement() {
		return (EReference)bpmnDataAssoziationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNFactory getBPMNFactory() {
		return (BPMNFactory)getEFactoryInstance();
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
		bpmnModelElementEClass = createEClass(BPMN_MODEL_ELEMENT);
		createEAttribute(bpmnModelElementEClass, BPMN_MODEL_ELEMENT__NAME);
		createEAttribute(bpmnModelElementEClass, BPMN_MODEL_ELEMENT__DESCRIPTION);
		createEReference(bpmnModelElementEClass, BPMN_MODEL_ELEMENT__MODEL_ELEMENTS);

		bpmnEventStartDefaultEClass = createEClass(BPMN_EVENT_START_DEFAULT);

		bpmnEventEndDefaultEClass = createEClass(BPMN_EVENT_END_DEFAULT);

		bpmnEventEndUsedEClass = createEClass(BPMN_EVENT_END_USED);

		bpmnEventMailEClass = createEClass(BPMN_EVENT_MAIL);

		bpmnEventMailDashEClass = createEClass(BPMN_EVENT_MAIL_DASH);

		bpmnEventMailDoubleEClass = createEClass(BPMN_EVENT_MAIL_DOUBLE);

		bpmnEventMailDoubleDashEClass = createEClass(BPMN_EVENT_MAIL_DOUBLE_DASH);

		bpmnEventMailInvertDoubleEClass = createEClass(BPMN_EVENT_MAIL_INVERT_DOUBLE);

		bpmnEventMailInvertBoldEClass = createEClass(BPMN_EVENT_MAIL_INVERT_BOLD);

		bpmnEventTimerDefaultEClass = createEClass(BPMN_EVENT_TIMER_DEFAULT);

		bpmnEventTimerDashEClass = createEClass(BPMN_EVENT_TIMER_DASH);

		bpmnEventTimerDoubleEClass = createEClass(BPMN_EVENT_TIMER_DOUBLE);

		bpmnEventTimerDoubleDashEClass = createEClass(BPMN_EVENT_TIMER_DOUBLE_DASH);

		bpmnEventEskalationStartEClass = createEClass(BPMN_EVENT_ESKALATION_START);

		bpmnEventEskalationDashEClass = createEClass(BPMN_EVENT_ESKALATION_DASH);

		bpmnEventEskalationDoubleEClass = createEClass(BPMN_EVENT_ESKALATION_DOUBLE);

		bpmnEventEskalationDoubelDashEClass = createEClass(BPMN_EVENT_ESKALATION_DOUBEL_DASH);

		bpmnEventEskalationDoubelInvertEClass = createEClass(BPMN_EVENT_ESKALATION_DOUBEL_INVERT);

		bpmnEventEskalationBoldInvertEClass = createEClass(BPMN_EVENT_ESKALATION_BOLD_INVERT);

		bpmnEventIfDefaultEClass = createEClass(BPMN_EVENT_IF_DEFAULT);

		bpmnEventIfDashEClass = createEClass(BPMN_EVENT_IF_DASH);

		bpmnEventIfDoubleEClass = createEClass(BPMN_EVENT_IF_DOUBLE);

		bpmnEventIfDoubleDashEClass = createEClass(BPMN_EVENT_IF_DOUBLE_DASH);

		bpmnEventLinkEnteredEClass = createEClass(BPMN_EVENT_LINK_ENTERED);

		bpmnEventLinkTriggerdEClass = createEClass(BPMN_EVENT_LINK_TRIGGERD);

		bpmnEventErrorDefaultEClass = createEClass(BPMN_EVENT_ERROR_DEFAULT);

		bpmnEventErrorDoubleEClass = createEClass(BPMN_EVENT_ERROR_DOUBLE);

		bpmnEventErrorBoldInvertEClass = createEClass(BPMN_EVENT_ERROR_BOLD_INVERT);

		bpmnEventCancelDoubleEClass = createEClass(BPMN_EVENT_CANCEL_DOUBLE);

		bpmnEventCancelBoldInvertEClass = createEClass(BPMN_EVENT_CANCEL_BOLD_INVERT);

		bpmnEventCompensationDefaultEClass = createEClass(BPMN_EVENT_COMPENSATION_DEFAULT);

		bpmnEventCompensationDoubleEClass = createEClass(BPMN_EVENT_COMPENSATION_DOUBLE);

		bpmnEventCompensationDoubleInvertEClass = createEClass(BPMN_EVENT_COMPENSATION_DOUBLE_INVERT);

		bpmnEventCompensationBoldInvertEClass = createEClass(BPMN_EVENT_COMPENSATION_BOLD_INVERT);

		bpmnEventSignalDefaultEClass = createEClass(BPMN_EVENT_SIGNAL_DEFAULT);

		bpmnEventSignalDashEClass = createEClass(BPMN_EVENT_SIGNAL_DASH);

		bpmnEventSignalDoubleEClass = createEClass(BPMN_EVENT_SIGNAL_DOUBLE);

		bpmnEventSignalDoubleDashEClass = createEClass(BPMN_EVENT_SIGNAL_DOUBLE_DASH);

		bpmnEventSignalDoubleInvertEClass = createEClass(BPMN_EVENT_SIGNAL_DOUBLE_INVERT);

		bpmnEventSignalBoldInvertEClass = createEClass(BPMN_EVENT_SIGNAL_BOLD_INVERT);

		bpmnEventMultiDefaultEClass = createEClass(BPMN_EVENT_MULTI_DEFAULT);

		bpmnEventMultiDashEClass = createEClass(BPMN_EVENT_MULTI_DASH);

		bpmnEventMultiDoubleEClass = createEClass(BPMN_EVENT_MULTI_DOUBLE);

		bpmnEventMultiDoubleDashEClass = createEClass(BPMN_EVENT_MULTI_DOUBLE_DASH);

		bpmnEventMultiDoubleInvertEClass = createEClass(BPMN_EVENT_MULTI_DOUBLE_INVERT);

		bpmnEventMultiBoldInvertEClass = createEClass(BPMN_EVENT_MULTI_BOLD_INVERT);

		bpmnEventParallelDefaultEClass = createEClass(BPMN_EVENT_PARALLEL_DEFAULT);

		bpmnEventParallelDashEClass = createEClass(BPMN_EVENT_PARALLEL_DASH);

		bpmnEventParallelDoubleEClass = createEClass(BPMN_EVENT_PARALLEL_DOUBLE);

		bpmnEventParallelDoubleDashEClass = createEClass(BPMN_EVENT_PARALLEL_DOUBLE_DASH);

		bpmnEventTerminationEClass = createEClass(BPMN_EVENT_TERMINATION);

		bpmnActivityTaskEClass = createEClass(BPMN_ACTIVITY_TASK);

		bpmnActivityTransactionEClass = createEClass(BPMN_ACTIVITY_TRANSACTION);

		bpmnActivityEventSubProcessEClass = createEClass(BPMN_ACTIVITY_EVENT_SUB_PROCESS);

		bpmnActivityCallActivityEClass = createEClass(BPMN_ACTIVITY_CALL_ACTIVITY);

		bpmnGatewayXOR1EClass = createEClass(BPMN_GATEWAY_XOR1);

		bpmnGatewayXOR2EClass = createEClass(BPMN_GATEWAY_XOR2);

		bpmnGatewayEventEClass = createEClass(BPMN_GATEWAY_EVENT);

		bpmnGatewayAndEClass = createEClass(BPMN_GATEWAY_AND);

		bpmnGatewayOREClass = createEClass(BPMN_GATEWAY_OR);

		bpmnGatewayComplexEClass = createEClass(BPMN_GATEWAY_COMPLEX);

		bpmnGatewayXEventEClass = createEClass(BPMN_GATEWAY_XEVENT);

		bpmnGatewayAndEventEClass = createEClass(BPMN_GATEWAY_AND_EVENT);

		bpmnConversationDefaultEClass = createEClass(BPMN_CONVERSATION_DEFAULT);

		bpmnConversationBoldEClass = createEClass(BPMN_CONVERSATION_BOLD);

		bpmnOneDataEClass = createEClass(BPMN_ONE_DATA);

		bpmnListDataEClass = createEClass(BPMN_LIST_DATA);

		bpmnDataStorageEClass = createEClass(BPMN_DATA_STORAGE);

		bpmnSequenceFlowEClass = createEClass(BPMN_SEQUENCE_FLOW);
		createEReference(bpmnSequenceFlowEClass, BPMN_SEQUENCE_FLOW__FORM_ELEMENT);
		createEReference(bpmnSequenceFlowEClass, BPMN_SEQUENCE_FLOW__TO_ELEMENT);

		bpmnDefaultFlowEClass = createEClass(BPMN_DEFAULT_FLOW);
		createEReference(bpmnDefaultFlowEClass, BPMN_DEFAULT_FLOW__FORM_ELEMENT);
		createEReference(bpmnDefaultFlowEClass, BPMN_DEFAULT_FLOW__TO_ELEMENT);

		bpmnConditionalFlowEClass = createEClass(BPMN_CONDITIONAL_FLOW);
		createEReference(bpmnConditionalFlowEClass, BPMN_CONDITIONAL_FLOW__FORM_ELEMENT);
		createEReference(bpmnConditionalFlowEClass, BPMN_CONDITIONAL_FLOW__TO_ELEMENT);

		bpmnDataAssoziationEClass = createEClass(BPMN_DATA_ASSOZIATION);
		createEReference(bpmnDataAssoziationEClass, BPMN_DATA_ASSOZIATION__FORM_ELEMENT);
		createEReference(bpmnDataAssoziationEClass, BPMN_DATA_ASSOZIATION__TO_ELEMENT);
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

		// Add supertypes to classes
		bpmnEventStartDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEndDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEndUsedEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMailEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMailDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMailDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMailDoubleDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMailInvertDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMailInvertBoldEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventTimerDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventTimerDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventTimerDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventTimerDoubleDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEskalationStartEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEskalationDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEskalationDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEskalationDoubelDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEskalationDoubelInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventEskalationBoldInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventIfDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventIfDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventIfDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventIfDoubleDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventLinkEnteredEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventLinkTriggerdEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventErrorDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventErrorDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventErrorBoldInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventCancelDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventCancelBoldInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventCompensationDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventCompensationDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventCompensationDoubleInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventCompensationBoldInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventSignalDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventSignalDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventSignalDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventSignalDoubleDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventSignalDoubleInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventSignalBoldInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMultiDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMultiDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMultiDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMultiDoubleDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMultiDoubleInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventMultiBoldInvertEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventParallelDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventParallelDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventParallelDoubleEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventParallelDoubleDashEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnEventTerminationEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnActivityTaskEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnActivityTransactionEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnActivityEventSubProcessEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnActivityCallActivityEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayXOR1EClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayXOR2EClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayEventEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayAndEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayOREClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayComplexEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayXEventEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnGatewayAndEventEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnConversationDefaultEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnConversationBoldEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnOneDataEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnListDataEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnDataStorageEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnSequenceFlowEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnDefaultFlowEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnConditionalFlowEClass.getESuperTypes().add(this.getBPMNModelElement());
		bpmnDataAssoziationEClass.getESuperTypes().add(this.getBPMNModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(bpmnModelElementEClass, BPMNModelElement.class, "BPMNModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, BPMNModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, BPMNModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNModelElement_ModelElements(), this.getBPMNModelElement(), null, "modelElements", null, 0, -1, BPMNModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnEventStartDefaultEClass, BPMNEventStartDefault.class, "BPMNEventStartDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEndDefaultEClass, BPMNEventEndDefault.class, "BPMNEventEndDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEndUsedEClass, BPMNEventEndUsed.class, "BPMNEventEndUsed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMailEClass, BPMNEventMail.class, "BPMNEventMail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMailDashEClass, BPMNEventMailDash.class, "BPMNEventMailDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMailDoubleEClass, BPMNEventMailDouble.class, "BPMNEventMailDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMailDoubleDashEClass, BPMNEventMailDoubleDash.class, "BPMNEventMailDoubleDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMailInvertDoubleEClass, BPMNEventMailInvertDouble.class, "BPMNEventMailInvertDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMailInvertBoldEClass, BPMNEventMailInvertBold.class, "BPMNEventMailInvertBold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventTimerDefaultEClass, BPMNEventTimerDefault.class, "BPMNEventTimerDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventTimerDashEClass, BPMNEventTimerDash.class, "BPMNEventTimerDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventTimerDoubleEClass, BPMNEventTimerDouble.class, "BPMNEventTimerDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventTimerDoubleDashEClass, BPMNEventTimerDoubleDash.class, "BPMNEventTimerDoubleDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEskalationStartEClass, BPMNEventEskalationStart.class, "BPMNEventEskalationStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEskalationDashEClass, BPMNEventEskalationDash.class, "BPMNEventEskalationDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEskalationDoubleEClass, BPMNEventEskalationDouble.class, "BPMNEventEskalationDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEskalationDoubelDashEClass, BPMNEventEskalationDoubelDash.class, "BPMNEventEskalationDoubelDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEskalationDoubelInvertEClass, BPMNEventEskalationDoubelInvert.class, "BPMNEventEskalationDoubelInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventEskalationBoldInvertEClass, BPMNEventEskalationBoldInvert.class, "BPMNEventEskalationBoldInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventIfDefaultEClass, BPMNEventIfDefault.class, "BPMNEventIfDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventIfDashEClass, BPMNEventIfDash.class, "BPMNEventIfDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventIfDoubleEClass, BPMNEventIfDouble.class, "BPMNEventIfDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventIfDoubleDashEClass, BPMNEventIfDoubleDash.class, "BPMNEventIfDoubleDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventLinkEnteredEClass, BPMNEventLinkEntered.class, "BPMNEventLinkEntered", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventLinkTriggerdEClass, BPMNEventLinkTriggerd.class, "BPMNEventLinkTriggerd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventErrorDefaultEClass, BPMNEventErrorDefault.class, "BPMNEventErrorDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventErrorDoubleEClass, BPMNEventErrorDouble.class, "BPMNEventErrorDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventErrorBoldInvertEClass, BPMNEventErrorBoldInvert.class, "BPMNEventErrorBoldInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventCancelDoubleEClass, BPMNEventCancelDouble.class, "BPMNEventCancelDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventCancelBoldInvertEClass, BPMNEventCancelBoldInvert.class, "BPMNEventCancelBoldInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventCompensationDefaultEClass, BPMNEventCompensationDefault.class, "BPMNEventCompensationDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventCompensationDoubleEClass, BPMNEventCompensationDouble.class, "BPMNEventCompensationDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventCompensationDoubleInvertEClass, BPMNEventCompensationDoubleInvert.class, "BPMNEventCompensationDoubleInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventCompensationBoldInvertEClass, BPMNEventCompensationBoldInvert.class, "BPMNEventCompensationBoldInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventSignalDefaultEClass, BPMNEventSignalDefault.class, "BPMNEventSignalDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventSignalDashEClass, BPMNEventSignalDash.class, "BPMNEventSignalDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventSignalDoubleEClass, BPMNEventSignalDouble.class, "BPMNEventSignalDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventSignalDoubleDashEClass, BPMNEventSignalDoubleDash.class, "BPMNEventSignalDoubleDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventSignalDoubleInvertEClass, BPMNEventSignalDoubleInvert.class, "BPMNEventSignalDoubleInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventSignalBoldInvertEClass, BPMNEventSignalBoldInvert.class, "BPMNEventSignalBoldInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMultiDefaultEClass, BPMNEventMultiDefault.class, "BPMNEventMultiDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMultiDashEClass, BPMNEventMultiDash.class, "BPMNEventMultiDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMultiDoubleEClass, BPMNEventMultiDouble.class, "BPMNEventMultiDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMultiDoubleDashEClass, BPMNEventMultiDoubleDash.class, "BPMNEventMultiDoubleDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMultiDoubleInvertEClass, BPMNEventMultiDoubleInvert.class, "BPMNEventMultiDoubleInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventMultiBoldInvertEClass, BPMNEventMultiBoldInvert.class, "BPMNEventMultiBoldInvert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventParallelDefaultEClass, BPMNEventParallelDefault.class, "BPMNEventParallelDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventParallelDashEClass, BPMNEventParallelDash.class, "BPMNEventParallelDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventParallelDoubleEClass, BPMNEventParallelDouble.class, "BPMNEventParallelDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventParallelDoubleDashEClass, BPMNEventParallelDoubleDash.class, "BPMNEventParallelDoubleDash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnEventTerminationEClass, BPMNEventTermination.class, "BPMNEventTermination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnActivityTaskEClass, BPMNActivityTask.class, "BPMNActivityTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnActivityTransactionEClass, BPMNActivityTransaction.class, "BPMNActivityTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnActivityEventSubProcessEClass, BPMNActivityEventSubProcess.class, "BPMNActivityEventSubProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnActivityCallActivityEClass, BPMNActivityCallActivity.class, "BPMNActivityCallActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayXOR1EClass, BPMNGatewayXOR1.class, "BPMNGatewayXOR1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayXOR2EClass, BPMNGatewayXOR2.class, "BPMNGatewayXOR2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayEventEClass, BPMNGatewayEvent.class, "BPMNGatewayEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayAndEClass, BPMNGatewayAnd.class, "BPMNGatewayAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayOREClass, BPMNGatewayOR.class, "BPMNGatewayOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayComplexEClass, BPMNGatewayComplex.class, "BPMNGatewayComplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayXEventEClass, BPMNGatewayXEvent.class, "BPMNGatewayXEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnGatewayAndEventEClass, BPMNGatewayAndEvent.class, "BPMNGatewayAndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnConversationDefaultEClass, BPMNConversationDefault.class, "BPMNConversationDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnConversationBoldEClass, BPMNConversationBold.class, "BPMNConversationBold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnOneDataEClass, BPMNOneData.class, "BPMNOneData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnListDataEClass, BPMNListData.class, "BPMNListData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnDataStorageEClass, BPMNDataStorage.class, "BPMNDataStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnSequenceFlowEClass, BPMNSequenceFlow.class, "BPMNSequenceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNSequenceFlow_FormElement(), this.getBPMNModelElement(), null, "formElement", null, 0, 1, BPMNSequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNSequenceFlow_ToElement(), this.getBPMNModelElement(), null, "toElement", null, 0, 1, BPMNSequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnDefaultFlowEClass, BPMNDefaultFlow.class, "BPMNDefaultFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNDefaultFlow_FormElement(), this.getBPMNModelElement(), null, "formElement", null, 0, 1, BPMNDefaultFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDefaultFlow_ToElement(), this.getBPMNModelElement(), null, "toElement", null, 0, 1, BPMNDefaultFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnConditionalFlowEClass, BPMNConditionalFlow.class, "BPMNConditionalFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNConditionalFlow_FormElement(), this.getBPMNModelElement(), null, "formElement", null, 0, 1, BPMNConditionalFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNConditionalFlow_ToElement(), this.getBPMNModelElement(), null, "toElement", null, 0, 1, BPMNConditionalFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnDataAssoziationEClass, BPMNDataAssoziation.class, "BPMNDataAssoziation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNDataAssoziation_FormElement(), this.getBPMNModelElement(), null, "formElement", null, 0, 1, BPMNDataAssoziation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDataAssoziation_ToElement(), this.getBPMNModelElement(), null, "toElement", null, 0, 1, BPMNDataAssoziation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BPMNPackageImpl
