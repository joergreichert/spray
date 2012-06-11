/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN.impl;

import BPMN.*;

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
public class BPMNFactoryImpl extends EFactoryImpl implements BPMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMNFactory init() {
		try {
			BPMNFactory theBPMNFactory = (BPMNFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.htwg.2012.bpmn"); 
			if (theBPMNFactory != null) {
				return theBPMNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BPMNPackage.BPMN_MODEL_ELEMENT: return createBPMNModelElement();
			case BPMNPackage.BPMN_EVENT_START_DEFAULT: return createBPMNEventStartDefault();
			case BPMNPackage.BPMN_EVENT_END_DEFAULT: return createBPMNEventEndDefault();
			case BPMNPackage.BPMN_EVENT_END_USED: return createBPMNEventEndUsed();
			case BPMNPackage.BPMN_EVENT_MAIL: return createBPMNEventMail();
			case BPMNPackage.BPMN_EVENT_MAIL_DASH: return createBPMNEventMailDash();
			case BPMNPackage.BPMN_EVENT_MAIL_DOUBLE: return createBPMNEventMailDouble();
			case BPMNPackage.BPMN_EVENT_MAIL_DOUBLE_DASH: return createBPMNEventMailDoubleDash();
			case BPMNPackage.BPMN_EVENT_MAIL_INVERT_DOUBLE: return createBPMNEventMailInvertDouble();
			case BPMNPackage.BPMN_EVENT_MAIL_INVERT_BOLD: return createBPMNEventMailInvertBold();
			case BPMNPackage.BPMN_EVENT_TIMER_DEFAULT: return createBPMNEventTimerDefault();
			case BPMNPackage.BPMN_EVENT_TIMER_DASH: return createBPMNEventTimerDash();
			case BPMNPackage.BPMN_EVENT_TIMER_DOUBLE: return createBPMNEventTimerDouble();
			case BPMNPackage.BPMN_EVENT_TIMER_DOUBLE_DASH: return createBPMNEventTimerDoubleDash();
			case BPMNPackage.BPMN_EVENT_ESKALATION_START: return createBPMNEventEskalationStart();
			case BPMNPackage.BPMN_EVENT_ESKALATION_DASH: return createBPMNEventEskalationDash();
			case BPMNPackage.BPMN_EVENT_ESKALATION_DOUBLE: return createBPMNEventEskalationDouble();
			case BPMNPackage.BPMN_EVENT_ESKALATION_DOUBEL_DASH: return createBPMNEventEskalationDoubelDash();
			case BPMNPackage.BPMN_EVENT_ESKALATION_DOUBEL_INVERT: return createBPMNEventEskalationDoubelInvert();
			case BPMNPackage.BPMN_EVENT_ESKALATION_BOLD_INVERT: return createBPMNEventEskalationBoldInvert();
			case BPMNPackage.BPMN_EVENT_IF_DEFAULT: return createBPMNEventIfDefault();
			case BPMNPackage.BPMN_EVENT_IF_DASH: return createBPMNEventIfDash();
			case BPMNPackage.BPMN_EVENT_IF_DOUBLE: return createBPMNEventIfDouble();
			case BPMNPackage.BPMN_EVENT_IF_DOUBLE_DASH: return createBPMNEventIfDoubleDash();
			case BPMNPackage.BPMN_EVENT_LINK_ENTERED: return createBPMNEventLinkEntered();
			case BPMNPackage.BPMN_EVENT_LINK_TRIGGERD: return createBPMNEventLinkTriggerd();
			case BPMNPackage.BPMN_EVENT_ERROR_DEFAULT: return createBPMNEventErrorDefault();
			case BPMNPackage.BPMN_EVENT_ERROR_DOUBLE: return createBPMNEventErrorDouble();
			case BPMNPackage.BPMN_EVENT_ERROR_BOLD_INVERT: return createBPMNEventErrorBoldInvert();
			case BPMNPackage.BPMN_EVENT_CANCEL_DOUBLE: return createBPMNEventCancelDouble();
			case BPMNPackage.BPMN_EVENT_CANCEL_BOLD_INVERT: return createBPMNEventCancelBoldInvert();
			case BPMNPackage.BPMN_EVENT_COMPENSATION_DEFAULT: return createBPMNEventCompensationDefault();
			case BPMNPackage.BPMN_EVENT_COMPENSATION_DOUBLE: return createBPMNEventCompensationDouble();
			case BPMNPackage.BPMN_EVENT_COMPENSATION_DOUBLE_INVERT: return createBPMNEventCompensationDoubleInvert();
			case BPMNPackage.BPMN_EVENT_COMPENSATION_BOLD_INVERT: return createBPMNEventCompensationBoldInvert();
			case BPMNPackage.BPMN_EVENT_SIGNAL_DEFAULT: return createBPMNEventSignalDefault();
			case BPMNPackage.BPMN_EVENT_SIGNAL_DASH: return createBPMNEventSignalDash();
			case BPMNPackage.BPMN_EVENT_SIGNAL_DOUBLE: return createBPMNEventSignalDouble();
			case BPMNPackage.BPMN_EVENT_SIGNAL_DOUBLE_DASH: return createBPMNEventSignalDoubleDash();
			case BPMNPackage.BPMN_EVENT_SIGNAL_DOUBLE_INVERT: return createBPMNEventSignalDoubleInvert();
			case BPMNPackage.BPMN_EVENT_SIGNAL_BOLD_INVERT: return createBPMNEventSignalBoldInvert();
			case BPMNPackage.BPMN_EVENT_MULTI_DEFAULT: return createBPMNEventMultiDefault();
			case BPMNPackage.BPMN_EVENT_MULTI_DASH: return createBPMNEventMultiDash();
			case BPMNPackage.BPMN_EVENT_MULTI_DOUBLE: return createBPMNEventMultiDouble();
			case BPMNPackage.BPMN_EVENT_MULTI_DOUBLE_DASH: return createBPMNEventMultiDoubleDash();
			case BPMNPackage.BPMN_EVENT_MULTI_DOUBLE_INVERT: return createBPMNEventMultiDoubleInvert();
			case BPMNPackage.BPMN_EVENT_MULTI_BOLD_INVERT: return createBPMNEventMultiBoldInvert();
			case BPMNPackage.BPMN_EVENT_PARALLEL_DEFAULT: return createBPMNEventParallelDefault();
			case BPMNPackage.BPMN_EVENT_PARALLEL_DASH: return createBPMNEventParallelDash();
			case BPMNPackage.BPMN_EVENT_PARALLEL_DOUBLE: return createBPMNEventParallelDouble();
			case BPMNPackage.BPMN_EVENT_PARALLEL_DOUBLE_DASH: return createBPMNEventParallelDoubleDash();
			case BPMNPackage.BPMN_EVENT_TERMINATION: return createBPMNEventTermination();
			case BPMNPackage.BPMN_ACTIVITY_TASK: return createBPMNActivityTask();
			case BPMNPackage.BPMN_ACTIVITY_TRANSACTION: return createBPMNActivityTransaction();
			case BPMNPackage.BPMN_ACTIVITY_EVENT_SUB_PROCESS: return createBPMNActivityEventSubProcess();
			case BPMNPackage.BPMN_ACTIVITY_CALL_ACTIVITY: return createBPMNActivityCallActivity();
			case BPMNPackage.BPMN_GATEWAY_XOR1: return createBPMNGatewayXOR1();
			case BPMNPackage.BPMN_GATEWAY_XOR2: return createBPMNGatewayXOR2();
			case BPMNPackage.BPMN_GATEWAY_EVENT: return createBPMNGatewayEvent();
			case BPMNPackage.BPMN_GATEWAY_AND: return createBPMNGatewayAnd();
			case BPMNPackage.BPMN_GATEWAY_OR: return createBPMNGatewayOR();
			case BPMNPackage.BPMN_GATEWAY_COMPLEX: return createBPMNGatewayComplex();
			case BPMNPackage.BPMN_GATEWAY_XEVENT: return createBPMNGatewayXEvent();
			case BPMNPackage.BPMN_GATEWAY_AND_EVENT: return createBPMNGatewayAndEvent();
			case BPMNPackage.BPMN_CONVERSATION_DEFAULT: return createBPMNConversationDefault();
			case BPMNPackage.BPMN_CONVERSATION_BOLD: return createBPMNConversationBold();
			case BPMNPackage.BPMN_ONE_DATA: return createBPMNOneData();
			case BPMNPackage.BPMN_LIST_DATA: return createBPMNListData();
			case BPMNPackage.BPMN_DATA_STORAGE: return createBPMNDataStorage();
			case BPMNPackage.BPMN_SEQUENCE_FLOW: return createBPMNSequenceFlow();
			case BPMNPackage.BPMN_DEFAULT_FLOW: return createBPMNDefaultFlow();
			case BPMNPackage.BPMN_CONDITIONAL_FLOW: return createBPMNConditionalFlow();
			case BPMNPackage.BPMN_DATA_ASSOZIATION: return createBPMNDataAssoziation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNModelElement createBPMNModelElement() {
		BPMNModelElementImpl bpmnModelElement = new BPMNModelElementImpl();
		return bpmnModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventStartDefault createBPMNEventStartDefault() {
		BPMNEventStartDefaultImpl bpmnEventStartDefault = new BPMNEventStartDefaultImpl();
		return bpmnEventStartDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEndDefault createBPMNEventEndDefault() {
		BPMNEventEndDefaultImpl bpmnEventEndDefault = new BPMNEventEndDefaultImpl();
		return bpmnEventEndDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEndUsed createBPMNEventEndUsed() {
		BPMNEventEndUsedImpl bpmnEventEndUsed = new BPMNEventEndUsedImpl();
		return bpmnEventEndUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMail createBPMNEventMail() {
		BPMNEventMailImpl bpmnEventMail = new BPMNEventMailImpl();
		return bpmnEventMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMailDash createBPMNEventMailDash() {
		BPMNEventMailDashImpl bpmnEventMailDash = new BPMNEventMailDashImpl();
		return bpmnEventMailDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMailDouble createBPMNEventMailDouble() {
		BPMNEventMailDoubleImpl bpmnEventMailDouble = new BPMNEventMailDoubleImpl();
		return bpmnEventMailDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMailDoubleDash createBPMNEventMailDoubleDash() {
		BPMNEventMailDoubleDashImpl bpmnEventMailDoubleDash = new BPMNEventMailDoubleDashImpl();
		return bpmnEventMailDoubleDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMailInvertDouble createBPMNEventMailInvertDouble() {
		BPMNEventMailInvertDoubleImpl bpmnEventMailInvertDouble = new BPMNEventMailInvertDoubleImpl();
		return bpmnEventMailInvertDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMailInvertBold createBPMNEventMailInvertBold() {
		BPMNEventMailInvertBoldImpl bpmnEventMailInvertBold = new BPMNEventMailInvertBoldImpl();
		return bpmnEventMailInvertBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventTimerDefault createBPMNEventTimerDefault() {
		BPMNEventTimerDefaultImpl bpmnEventTimerDefault = new BPMNEventTimerDefaultImpl();
		return bpmnEventTimerDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventTimerDash createBPMNEventTimerDash() {
		BPMNEventTimerDashImpl bpmnEventTimerDash = new BPMNEventTimerDashImpl();
		return bpmnEventTimerDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventTimerDouble createBPMNEventTimerDouble() {
		BPMNEventTimerDoubleImpl bpmnEventTimerDouble = new BPMNEventTimerDoubleImpl();
		return bpmnEventTimerDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventTimerDoubleDash createBPMNEventTimerDoubleDash() {
		BPMNEventTimerDoubleDashImpl bpmnEventTimerDoubleDash = new BPMNEventTimerDoubleDashImpl();
		return bpmnEventTimerDoubleDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEskalationStart createBPMNEventEskalationStart() {
		BPMNEventEskalationStartImpl bpmnEventEskalationStart = new BPMNEventEskalationStartImpl();
		return bpmnEventEskalationStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEskalationDash createBPMNEventEskalationDash() {
		BPMNEventEskalationDashImpl bpmnEventEskalationDash = new BPMNEventEskalationDashImpl();
		return bpmnEventEskalationDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEskalationDouble createBPMNEventEskalationDouble() {
		BPMNEventEskalationDoubleImpl bpmnEventEskalationDouble = new BPMNEventEskalationDoubleImpl();
		return bpmnEventEskalationDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEskalationDoubelDash createBPMNEventEskalationDoubelDash() {
		BPMNEventEskalationDoubelDashImpl bpmnEventEskalationDoubelDash = new BPMNEventEskalationDoubelDashImpl();
		return bpmnEventEskalationDoubelDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEskalationDoubelInvert createBPMNEventEskalationDoubelInvert() {
		BPMNEventEskalationDoubelInvertImpl bpmnEventEskalationDoubelInvert = new BPMNEventEskalationDoubelInvertImpl();
		return bpmnEventEskalationDoubelInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventEskalationBoldInvert createBPMNEventEskalationBoldInvert() {
		BPMNEventEskalationBoldInvertImpl bpmnEventEskalationBoldInvert = new BPMNEventEskalationBoldInvertImpl();
		return bpmnEventEskalationBoldInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventIfDefault createBPMNEventIfDefault() {
		BPMNEventIfDefaultImpl bpmnEventIfDefault = new BPMNEventIfDefaultImpl();
		return bpmnEventIfDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventIfDash createBPMNEventIfDash() {
		BPMNEventIfDashImpl bpmnEventIfDash = new BPMNEventIfDashImpl();
		return bpmnEventIfDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventIfDouble createBPMNEventIfDouble() {
		BPMNEventIfDoubleImpl bpmnEventIfDouble = new BPMNEventIfDoubleImpl();
		return bpmnEventIfDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventIfDoubleDash createBPMNEventIfDoubleDash() {
		BPMNEventIfDoubleDashImpl bpmnEventIfDoubleDash = new BPMNEventIfDoubleDashImpl();
		return bpmnEventIfDoubleDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventLinkEntered createBPMNEventLinkEntered() {
		BPMNEventLinkEnteredImpl bpmnEventLinkEntered = new BPMNEventLinkEnteredImpl();
		return bpmnEventLinkEntered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventLinkTriggerd createBPMNEventLinkTriggerd() {
		BPMNEventLinkTriggerdImpl bpmnEventLinkTriggerd = new BPMNEventLinkTriggerdImpl();
		return bpmnEventLinkTriggerd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventErrorDefault createBPMNEventErrorDefault() {
		BPMNEventErrorDefaultImpl bpmnEventErrorDefault = new BPMNEventErrorDefaultImpl();
		return bpmnEventErrorDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventErrorDouble createBPMNEventErrorDouble() {
		BPMNEventErrorDoubleImpl bpmnEventErrorDouble = new BPMNEventErrorDoubleImpl();
		return bpmnEventErrorDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventErrorBoldInvert createBPMNEventErrorBoldInvert() {
		BPMNEventErrorBoldInvertImpl bpmnEventErrorBoldInvert = new BPMNEventErrorBoldInvertImpl();
		return bpmnEventErrorBoldInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventCancelDouble createBPMNEventCancelDouble() {
		BPMNEventCancelDoubleImpl bpmnEventCancelDouble = new BPMNEventCancelDoubleImpl();
		return bpmnEventCancelDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventCancelBoldInvert createBPMNEventCancelBoldInvert() {
		BPMNEventCancelBoldInvertImpl bpmnEventCancelBoldInvert = new BPMNEventCancelBoldInvertImpl();
		return bpmnEventCancelBoldInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventCompensationDefault createBPMNEventCompensationDefault() {
		BPMNEventCompensationDefaultImpl bpmnEventCompensationDefault = new BPMNEventCompensationDefaultImpl();
		return bpmnEventCompensationDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventCompensationDouble createBPMNEventCompensationDouble() {
		BPMNEventCompensationDoubleImpl bpmnEventCompensationDouble = new BPMNEventCompensationDoubleImpl();
		return bpmnEventCompensationDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventCompensationDoubleInvert createBPMNEventCompensationDoubleInvert() {
		BPMNEventCompensationDoubleInvertImpl bpmnEventCompensationDoubleInvert = new BPMNEventCompensationDoubleInvertImpl();
		return bpmnEventCompensationDoubleInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventCompensationBoldInvert createBPMNEventCompensationBoldInvert() {
		BPMNEventCompensationBoldInvertImpl bpmnEventCompensationBoldInvert = new BPMNEventCompensationBoldInvertImpl();
		return bpmnEventCompensationBoldInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventSignalDefault createBPMNEventSignalDefault() {
		BPMNEventSignalDefaultImpl bpmnEventSignalDefault = new BPMNEventSignalDefaultImpl();
		return bpmnEventSignalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventSignalDash createBPMNEventSignalDash() {
		BPMNEventSignalDashImpl bpmnEventSignalDash = new BPMNEventSignalDashImpl();
		return bpmnEventSignalDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventSignalDouble createBPMNEventSignalDouble() {
		BPMNEventSignalDoubleImpl bpmnEventSignalDouble = new BPMNEventSignalDoubleImpl();
		return bpmnEventSignalDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventSignalDoubleDash createBPMNEventSignalDoubleDash() {
		BPMNEventSignalDoubleDashImpl bpmnEventSignalDoubleDash = new BPMNEventSignalDoubleDashImpl();
		return bpmnEventSignalDoubleDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventSignalDoubleInvert createBPMNEventSignalDoubleInvert() {
		BPMNEventSignalDoubleInvertImpl bpmnEventSignalDoubleInvert = new BPMNEventSignalDoubleInvertImpl();
		return bpmnEventSignalDoubleInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventSignalBoldInvert createBPMNEventSignalBoldInvert() {
		BPMNEventSignalBoldInvertImpl bpmnEventSignalBoldInvert = new BPMNEventSignalBoldInvertImpl();
		return bpmnEventSignalBoldInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMultiDefault createBPMNEventMultiDefault() {
		BPMNEventMultiDefaultImpl bpmnEventMultiDefault = new BPMNEventMultiDefaultImpl();
		return bpmnEventMultiDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMultiDash createBPMNEventMultiDash() {
		BPMNEventMultiDashImpl bpmnEventMultiDash = new BPMNEventMultiDashImpl();
		return bpmnEventMultiDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMultiDouble createBPMNEventMultiDouble() {
		BPMNEventMultiDoubleImpl bpmnEventMultiDouble = new BPMNEventMultiDoubleImpl();
		return bpmnEventMultiDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMultiDoubleDash createBPMNEventMultiDoubleDash() {
		BPMNEventMultiDoubleDashImpl bpmnEventMultiDoubleDash = new BPMNEventMultiDoubleDashImpl();
		return bpmnEventMultiDoubleDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMultiDoubleInvert createBPMNEventMultiDoubleInvert() {
		BPMNEventMultiDoubleInvertImpl bpmnEventMultiDoubleInvert = new BPMNEventMultiDoubleInvertImpl();
		return bpmnEventMultiDoubleInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventMultiBoldInvert createBPMNEventMultiBoldInvert() {
		BPMNEventMultiBoldInvertImpl bpmnEventMultiBoldInvert = new BPMNEventMultiBoldInvertImpl();
		return bpmnEventMultiBoldInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventParallelDefault createBPMNEventParallelDefault() {
		BPMNEventParallelDefaultImpl bpmnEventParallelDefault = new BPMNEventParallelDefaultImpl();
		return bpmnEventParallelDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventParallelDash createBPMNEventParallelDash() {
		BPMNEventParallelDashImpl bpmnEventParallelDash = new BPMNEventParallelDashImpl();
		return bpmnEventParallelDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventParallelDouble createBPMNEventParallelDouble() {
		BPMNEventParallelDoubleImpl bpmnEventParallelDouble = new BPMNEventParallelDoubleImpl();
		return bpmnEventParallelDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventParallelDoubleDash createBPMNEventParallelDoubleDash() {
		BPMNEventParallelDoubleDashImpl bpmnEventParallelDoubleDash = new BPMNEventParallelDoubleDashImpl();
		return bpmnEventParallelDoubleDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEventTermination createBPMNEventTermination() {
		BPMNEventTerminationImpl bpmnEventTermination = new BPMNEventTerminationImpl();
		return bpmnEventTermination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNActivityTask createBPMNActivityTask() {
		BPMNActivityTaskImpl bpmnActivityTask = new BPMNActivityTaskImpl();
		return bpmnActivityTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNActivityTransaction createBPMNActivityTransaction() {
		BPMNActivityTransactionImpl bpmnActivityTransaction = new BPMNActivityTransactionImpl();
		return bpmnActivityTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNActivityEventSubProcess createBPMNActivityEventSubProcess() {
		BPMNActivityEventSubProcessImpl bpmnActivityEventSubProcess = new BPMNActivityEventSubProcessImpl();
		return bpmnActivityEventSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNActivityCallActivity createBPMNActivityCallActivity() {
		BPMNActivityCallActivityImpl bpmnActivityCallActivity = new BPMNActivityCallActivityImpl();
		return bpmnActivityCallActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayXOR1 createBPMNGatewayXOR1() {
		BPMNGatewayXOR1Impl bpmnGatewayXOR1 = new BPMNGatewayXOR1Impl();
		return bpmnGatewayXOR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayXOR2 createBPMNGatewayXOR2() {
		BPMNGatewayXOR2Impl bpmnGatewayXOR2 = new BPMNGatewayXOR2Impl();
		return bpmnGatewayXOR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayEvent createBPMNGatewayEvent() {
		BPMNGatewayEventImpl bpmnGatewayEvent = new BPMNGatewayEventImpl();
		return bpmnGatewayEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayAnd createBPMNGatewayAnd() {
		BPMNGatewayAndImpl bpmnGatewayAnd = new BPMNGatewayAndImpl();
		return bpmnGatewayAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayOR createBPMNGatewayOR() {
		BPMNGatewayORImpl bpmnGatewayOR = new BPMNGatewayORImpl();
		return bpmnGatewayOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayComplex createBPMNGatewayComplex() {
		BPMNGatewayComplexImpl bpmnGatewayComplex = new BPMNGatewayComplexImpl();
		return bpmnGatewayComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayXEvent createBPMNGatewayXEvent() {
		BPMNGatewayXEventImpl bpmnGatewayXEvent = new BPMNGatewayXEventImpl();
		return bpmnGatewayXEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNGatewayAndEvent createBPMNGatewayAndEvent() {
		BPMNGatewayAndEventImpl bpmnGatewayAndEvent = new BPMNGatewayAndEventImpl();
		return bpmnGatewayAndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNConversationDefault createBPMNConversationDefault() {
		BPMNConversationDefaultImpl bpmnConversationDefault = new BPMNConversationDefaultImpl();
		return bpmnConversationDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNConversationBold createBPMNConversationBold() {
		BPMNConversationBoldImpl bpmnConversationBold = new BPMNConversationBoldImpl();
		return bpmnConversationBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNOneData createBPMNOneData() {
		BPMNOneDataImpl bpmnOneData = new BPMNOneDataImpl();
		return bpmnOneData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNListData createBPMNListData() {
		BPMNListDataImpl bpmnListData = new BPMNListDataImpl();
		return bpmnListData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDataStorage createBPMNDataStorage() {
		BPMNDataStorageImpl bpmnDataStorage = new BPMNDataStorageImpl();
		return bpmnDataStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNSequenceFlow createBPMNSequenceFlow() {
		BPMNSequenceFlowImpl bpmnSequenceFlow = new BPMNSequenceFlowImpl();
		return bpmnSequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDefaultFlow createBPMNDefaultFlow() {
		BPMNDefaultFlowImpl bpmnDefaultFlow = new BPMNDefaultFlowImpl();
		return bpmnDefaultFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNConditionalFlow createBPMNConditionalFlow() {
		BPMNConditionalFlowImpl bpmnConditionalFlow = new BPMNConditionalFlowImpl();
		return bpmnConditionalFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDataAssoziation createBPMNDataAssoziation() {
		BPMNDataAssoziationImpl bpmnDataAssoziation = new BPMNDataAssoziationImpl();
		return bpmnDataAssoziation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNPackage getBPMNPackage() {
		return (BPMNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static BPMNPackage getPackage() {
		return BPMNPackage.eINSTANCE;
	}

} //BPMNFactoryImpl
