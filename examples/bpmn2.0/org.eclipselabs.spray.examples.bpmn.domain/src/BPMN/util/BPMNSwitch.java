/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN.util;

import BPMN.*;

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
 * @see BPMN.BPMNPackage
 * @generated
 */
public class BPMNSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMNPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNSwitch() {
		if (modelPackage == null) {
			modelPackage = BPMNPackage.eINSTANCE;
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
			case BPMNPackage.BPMN_MODEL_ELEMENT: {
				BPMNModelElement bpmnModelElement = (BPMNModelElement)theEObject;
				Object result = caseBPMNModelElement(bpmnModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_START_DEFAULT: {
				BPMNEventStartDefault bpmnEventStartDefault = (BPMNEventStartDefault)theEObject;
				Object result = caseBPMNEventStartDefault(bpmnEventStartDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventStartDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_END_DEFAULT: {
				BPMNEventEndDefault bpmnEventEndDefault = (BPMNEventEndDefault)theEObject;
				Object result = caseBPMNEventEndDefault(bpmnEventEndDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventEndDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_END_USED: {
				BPMNEventEndUsed bpmnEventEndUsed = (BPMNEventEndUsed)theEObject;
				Object result = caseBPMNEventEndUsed(bpmnEventEndUsed);
				if (result == null) result = caseBPMNModelElement(bpmnEventEndUsed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MAIL: {
				BPMNEventMail bpmnEventMail = (BPMNEventMail)theEObject;
				Object result = caseBPMNEventMail(bpmnEventMail);
				if (result == null) result = caseBPMNModelElement(bpmnEventMail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MAIL_DASH: {
				BPMNEventMailDash bpmnEventMailDash = (BPMNEventMailDash)theEObject;
				Object result = caseBPMNEventMailDash(bpmnEventMailDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventMailDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MAIL_DOUBLE: {
				BPMNEventMailDouble bpmnEventMailDouble = (BPMNEventMailDouble)theEObject;
				Object result = caseBPMNEventMailDouble(bpmnEventMailDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventMailDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MAIL_DOUBLE_DASH: {
				BPMNEventMailDoubleDash bpmnEventMailDoubleDash = (BPMNEventMailDoubleDash)theEObject;
				Object result = caseBPMNEventMailDoubleDash(bpmnEventMailDoubleDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventMailDoubleDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MAIL_INVERT_DOUBLE: {
				BPMNEventMailInvertDouble bpmnEventMailInvertDouble = (BPMNEventMailInvertDouble)theEObject;
				Object result = caseBPMNEventMailInvertDouble(bpmnEventMailInvertDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventMailInvertDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MAIL_INVERT_BOLD: {
				BPMNEventMailInvertBold bpmnEventMailInvertBold = (BPMNEventMailInvertBold)theEObject;
				Object result = caseBPMNEventMailInvertBold(bpmnEventMailInvertBold);
				if (result == null) result = caseBPMNModelElement(bpmnEventMailInvertBold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_TIMER_DEFAULT: {
				BPMNEventTimerDefault bpmnEventTimerDefault = (BPMNEventTimerDefault)theEObject;
				Object result = caseBPMNEventTimerDefault(bpmnEventTimerDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventTimerDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_TIMER_DASH: {
				BPMNEventTimerDash bpmnEventTimerDash = (BPMNEventTimerDash)theEObject;
				Object result = caseBPMNEventTimerDash(bpmnEventTimerDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventTimerDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_TIMER_DOUBLE: {
				BPMNEventTimerDouble bpmnEventTimerDouble = (BPMNEventTimerDouble)theEObject;
				Object result = caseBPMNEventTimerDouble(bpmnEventTimerDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventTimerDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_TIMER_DOUBLE_DASH: {
				BPMNEventTimerDoubleDash bpmnEventTimerDoubleDash = (BPMNEventTimerDoubleDash)theEObject;
				Object result = caseBPMNEventTimerDoubleDash(bpmnEventTimerDoubleDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventTimerDoubleDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ESKALATION_START: {
				BPMNEventEskalationStart bpmnEventEskalationStart = (BPMNEventEskalationStart)theEObject;
				Object result = caseBPMNEventEskalationStart(bpmnEventEskalationStart);
				if (result == null) result = caseBPMNModelElement(bpmnEventEskalationStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ESKALATION_DASH: {
				BPMNEventEskalationDash bpmnEventEskalationDash = (BPMNEventEskalationDash)theEObject;
				Object result = caseBPMNEventEskalationDash(bpmnEventEskalationDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventEskalationDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ESKALATION_DOUBLE: {
				BPMNEventEskalationDouble bpmnEventEskalationDouble = (BPMNEventEskalationDouble)theEObject;
				Object result = caseBPMNEventEskalationDouble(bpmnEventEskalationDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventEskalationDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ESKALATION_DOUBEL_DASH: {
				BPMNEventEskalationDoubelDash bpmnEventEskalationDoubelDash = (BPMNEventEskalationDoubelDash)theEObject;
				Object result = caseBPMNEventEskalationDoubelDash(bpmnEventEskalationDoubelDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventEskalationDoubelDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ESKALATION_DOUBEL_INVERT: {
				BPMNEventEskalationDoubelInvert bpmnEventEskalationDoubelInvert = (BPMNEventEskalationDoubelInvert)theEObject;
				Object result = caseBPMNEventEskalationDoubelInvert(bpmnEventEskalationDoubelInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventEskalationDoubelInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ESKALATION_BOLD_INVERT: {
				BPMNEventEskalationBoldInvert bpmnEventEskalationBoldInvert = (BPMNEventEskalationBoldInvert)theEObject;
				Object result = caseBPMNEventEskalationBoldInvert(bpmnEventEskalationBoldInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventEskalationBoldInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_IF_DEFAULT: {
				BPMNEventIfDefault bpmnEventIfDefault = (BPMNEventIfDefault)theEObject;
				Object result = caseBPMNEventIfDefault(bpmnEventIfDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventIfDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_IF_DASH: {
				BPMNEventIfDash bpmnEventIfDash = (BPMNEventIfDash)theEObject;
				Object result = caseBPMNEventIfDash(bpmnEventIfDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventIfDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_IF_DOUBLE: {
				BPMNEventIfDouble bpmnEventIfDouble = (BPMNEventIfDouble)theEObject;
				Object result = caseBPMNEventIfDouble(bpmnEventIfDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventIfDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_IF_DOUBLE_DASH: {
				BPMNEventIfDoubleDash bpmnEventIfDoubleDash = (BPMNEventIfDoubleDash)theEObject;
				Object result = caseBPMNEventIfDoubleDash(bpmnEventIfDoubleDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventIfDoubleDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_LINK_ENTERED: {
				BPMNEventLinkEntered bpmnEventLinkEntered = (BPMNEventLinkEntered)theEObject;
				Object result = caseBPMNEventLinkEntered(bpmnEventLinkEntered);
				if (result == null) result = caseBPMNModelElement(bpmnEventLinkEntered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_LINK_TRIGGERD: {
				BPMNEventLinkTriggerd bpmnEventLinkTriggerd = (BPMNEventLinkTriggerd)theEObject;
				Object result = caseBPMNEventLinkTriggerd(bpmnEventLinkTriggerd);
				if (result == null) result = caseBPMNModelElement(bpmnEventLinkTriggerd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ERROR_DEFAULT: {
				BPMNEventErrorDefault bpmnEventErrorDefault = (BPMNEventErrorDefault)theEObject;
				Object result = caseBPMNEventErrorDefault(bpmnEventErrorDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventErrorDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ERROR_DOUBLE: {
				BPMNEventErrorDouble bpmnEventErrorDouble = (BPMNEventErrorDouble)theEObject;
				Object result = caseBPMNEventErrorDouble(bpmnEventErrorDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventErrorDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_ERROR_BOLD_INVERT: {
				BPMNEventErrorBoldInvert bpmnEventErrorBoldInvert = (BPMNEventErrorBoldInvert)theEObject;
				Object result = caseBPMNEventErrorBoldInvert(bpmnEventErrorBoldInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventErrorBoldInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_CANCEL_DOUBLE: {
				BPMNEventCancelDouble bpmnEventCancelDouble = (BPMNEventCancelDouble)theEObject;
				Object result = caseBPMNEventCancelDouble(bpmnEventCancelDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventCancelDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_CANCEL_BOLD_INVERT: {
				BPMNEventCancelBoldInvert bpmnEventCancelBoldInvert = (BPMNEventCancelBoldInvert)theEObject;
				Object result = caseBPMNEventCancelBoldInvert(bpmnEventCancelBoldInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventCancelBoldInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_COMPENSATION_DEFAULT: {
				BPMNEventCompensationDefault bpmnEventCompensationDefault = (BPMNEventCompensationDefault)theEObject;
				Object result = caseBPMNEventCompensationDefault(bpmnEventCompensationDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventCompensationDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_COMPENSATION_DOUBLE: {
				BPMNEventCompensationDouble bpmnEventCompensationDouble = (BPMNEventCompensationDouble)theEObject;
				Object result = caseBPMNEventCompensationDouble(bpmnEventCompensationDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventCompensationDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_COMPENSATION_DOUBLE_INVERT: {
				BPMNEventCompensationDoubleInvert bpmnEventCompensationDoubleInvert = (BPMNEventCompensationDoubleInvert)theEObject;
				Object result = caseBPMNEventCompensationDoubleInvert(bpmnEventCompensationDoubleInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventCompensationDoubleInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_COMPENSATION_BOLD_INVERT: {
				BPMNEventCompensationBoldInvert bpmnEventCompensationBoldInvert = (BPMNEventCompensationBoldInvert)theEObject;
				Object result = caseBPMNEventCompensationBoldInvert(bpmnEventCompensationBoldInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventCompensationBoldInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_SIGNAL_DEFAULT: {
				BPMNEventSignalDefault bpmnEventSignalDefault = (BPMNEventSignalDefault)theEObject;
				Object result = caseBPMNEventSignalDefault(bpmnEventSignalDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventSignalDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_SIGNAL_DASH: {
				BPMNEventSignalDash bpmnEventSignalDash = (BPMNEventSignalDash)theEObject;
				Object result = caseBPMNEventSignalDash(bpmnEventSignalDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventSignalDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_SIGNAL_DOUBLE: {
				BPMNEventSignalDouble bpmnEventSignalDouble = (BPMNEventSignalDouble)theEObject;
				Object result = caseBPMNEventSignalDouble(bpmnEventSignalDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventSignalDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_SIGNAL_DOUBLE_DASH: {
				BPMNEventSignalDoubleDash bpmnEventSignalDoubleDash = (BPMNEventSignalDoubleDash)theEObject;
				Object result = caseBPMNEventSignalDoubleDash(bpmnEventSignalDoubleDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventSignalDoubleDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_SIGNAL_DOUBLE_INVERT: {
				BPMNEventSignalDoubleInvert bpmnEventSignalDoubleInvert = (BPMNEventSignalDoubleInvert)theEObject;
				Object result = caseBPMNEventSignalDoubleInvert(bpmnEventSignalDoubleInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventSignalDoubleInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_SIGNAL_BOLD_INVERT: {
				BPMNEventSignalBoldInvert bpmnEventSignalBoldInvert = (BPMNEventSignalBoldInvert)theEObject;
				Object result = caseBPMNEventSignalBoldInvert(bpmnEventSignalBoldInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventSignalBoldInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MULTI_DEFAULT: {
				BPMNEventMultiDefault bpmnEventMultiDefault = (BPMNEventMultiDefault)theEObject;
				Object result = caseBPMNEventMultiDefault(bpmnEventMultiDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventMultiDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MULTI_DASH: {
				BPMNEventMultiDash bpmnEventMultiDash = (BPMNEventMultiDash)theEObject;
				Object result = caseBPMNEventMultiDash(bpmnEventMultiDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventMultiDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MULTI_DOUBLE: {
				BPMNEventMultiDouble bpmnEventMultiDouble = (BPMNEventMultiDouble)theEObject;
				Object result = caseBPMNEventMultiDouble(bpmnEventMultiDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventMultiDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MULTI_DOUBLE_DASH: {
				BPMNEventMultiDoubleDash bpmnEventMultiDoubleDash = (BPMNEventMultiDoubleDash)theEObject;
				Object result = caseBPMNEventMultiDoubleDash(bpmnEventMultiDoubleDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventMultiDoubleDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MULTI_DOUBLE_INVERT: {
				BPMNEventMultiDoubleInvert bpmnEventMultiDoubleInvert = (BPMNEventMultiDoubleInvert)theEObject;
				Object result = caseBPMNEventMultiDoubleInvert(bpmnEventMultiDoubleInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventMultiDoubleInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_MULTI_BOLD_INVERT: {
				BPMNEventMultiBoldInvert bpmnEventMultiBoldInvert = (BPMNEventMultiBoldInvert)theEObject;
				Object result = caseBPMNEventMultiBoldInvert(bpmnEventMultiBoldInvert);
				if (result == null) result = caseBPMNModelElement(bpmnEventMultiBoldInvert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_PARALLEL_DEFAULT: {
				BPMNEventParallelDefault bpmnEventParallelDefault = (BPMNEventParallelDefault)theEObject;
				Object result = caseBPMNEventParallelDefault(bpmnEventParallelDefault);
				if (result == null) result = caseBPMNModelElement(bpmnEventParallelDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_PARALLEL_DASH: {
				BPMNEventParallelDash bpmnEventParallelDash = (BPMNEventParallelDash)theEObject;
				Object result = caseBPMNEventParallelDash(bpmnEventParallelDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventParallelDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_PARALLEL_DOUBLE: {
				BPMNEventParallelDouble bpmnEventParallelDouble = (BPMNEventParallelDouble)theEObject;
				Object result = caseBPMNEventParallelDouble(bpmnEventParallelDouble);
				if (result == null) result = caseBPMNModelElement(bpmnEventParallelDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_PARALLEL_DOUBLE_DASH: {
				BPMNEventParallelDoubleDash bpmnEventParallelDoubleDash = (BPMNEventParallelDoubleDash)theEObject;
				Object result = caseBPMNEventParallelDoubleDash(bpmnEventParallelDoubleDash);
				if (result == null) result = caseBPMNModelElement(bpmnEventParallelDoubleDash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_EVENT_TERMINATION: {
				BPMNEventTermination bpmnEventTermination = (BPMNEventTermination)theEObject;
				Object result = caseBPMNEventTermination(bpmnEventTermination);
				if (result == null) result = caseBPMNModelElement(bpmnEventTermination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_ACTIVITY_TASK: {
				BPMNActivityTask bpmnActivityTask = (BPMNActivityTask)theEObject;
				Object result = caseBPMNActivityTask(bpmnActivityTask);
				if (result == null) result = caseBPMNModelElement(bpmnActivityTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_ACTIVITY_TRANSACTION: {
				BPMNActivityTransaction bpmnActivityTransaction = (BPMNActivityTransaction)theEObject;
				Object result = caseBPMNActivityTransaction(bpmnActivityTransaction);
				if (result == null) result = caseBPMNModelElement(bpmnActivityTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_ACTIVITY_EVENT_SUB_PROCESS: {
				BPMNActivityEventSubProcess bpmnActivityEventSubProcess = (BPMNActivityEventSubProcess)theEObject;
				Object result = caseBPMNActivityEventSubProcess(bpmnActivityEventSubProcess);
				if (result == null) result = caseBPMNModelElement(bpmnActivityEventSubProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_ACTIVITY_CALL_ACTIVITY: {
				BPMNActivityCallActivity bpmnActivityCallActivity = (BPMNActivityCallActivity)theEObject;
				Object result = caseBPMNActivityCallActivity(bpmnActivityCallActivity);
				if (result == null) result = caseBPMNModelElement(bpmnActivityCallActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_XOR1: {
				BPMNGatewayXOR1 bpmnGatewayXOR1 = (BPMNGatewayXOR1)theEObject;
				Object result = caseBPMNGatewayXOR1(bpmnGatewayXOR1);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayXOR1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_XOR2: {
				BPMNGatewayXOR2 bpmnGatewayXOR2 = (BPMNGatewayXOR2)theEObject;
				Object result = caseBPMNGatewayXOR2(bpmnGatewayXOR2);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayXOR2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_EVENT: {
				BPMNGatewayEvent bpmnGatewayEvent = (BPMNGatewayEvent)theEObject;
				Object result = caseBPMNGatewayEvent(bpmnGatewayEvent);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_AND: {
				BPMNGatewayAnd bpmnGatewayAnd = (BPMNGatewayAnd)theEObject;
				Object result = caseBPMNGatewayAnd(bpmnGatewayAnd);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_OR: {
				BPMNGatewayOR bpmnGatewayOR = (BPMNGatewayOR)theEObject;
				Object result = caseBPMNGatewayOR(bpmnGatewayOR);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayOR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_COMPLEX: {
				BPMNGatewayComplex bpmnGatewayComplex = (BPMNGatewayComplex)theEObject;
				Object result = caseBPMNGatewayComplex(bpmnGatewayComplex);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayComplex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_XEVENT: {
				BPMNGatewayXEvent bpmnGatewayXEvent = (BPMNGatewayXEvent)theEObject;
				Object result = caseBPMNGatewayXEvent(bpmnGatewayXEvent);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayXEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_GATEWAY_AND_EVENT: {
				BPMNGatewayAndEvent bpmnGatewayAndEvent = (BPMNGatewayAndEvent)theEObject;
				Object result = caseBPMNGatewayAndEvent(bpmnGatewayAndEvent);
				if (result == null) result = caseBPMNModelElement(bpmnGatewayAndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_CONVERSATION_DEFAULT: {
				BPMNConversationDefault bpmnConversationDefault = (BPMNConversationDefault)theEObject;
				Object result = caseBPMNConversationDefault(bpmnConversationDefault);
				if (result == null) result = caseBPMNModelElement(bpmnConversationDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_CONVERSATION_BOLD: {
				BPMNConversationBold bpmnConversationBold = (BPMNConversationBold)theEObject;
				Object result = caseBPMNConversationBold(bpmnConversationBold);
				if (result == null) result = caseBPMNModelElement(bpmnConversationBold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_ONE_DATA: {
				BPMNOneData bpmnOneData = (BPMNOneData)theEObject;
				Object result = caseBPMNOneData(bpmnOneData);
				if (result == null) result = caseBPMNModelElement(bpmnOneData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_LIST_DATA: {
				BPMNListData bpmnListData = (BPMNListData)theEObject;
				Object result = caseBPMNListData(bpmnListData);
				if (result == null) result = caseBPMNModelElement(bpmnListData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_DATA_STORAGE: {
				BPMNDataStorage bpmnDataStorage = (BPMNDataStorage)theEObject;
				Object result = caseBPMNDataStorage(bpmnDataStorage);
				if (result == null) result = caseBPMNModelElement(bpmnDataStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_SEQUENCE_FLOW: {
				BPMNSequenceFlow bpmnSequenceFlow = (BPMNSequenceFlow)theEObject;
				Object result = caseBPMNSequenceFlow(bpmnSequenceFlow);
				if (result == null) result = caseBPMNModelElement(bpmnSequenceFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_DEFAULT_FLOW: {
				BPMNDefaultFlow bpmnDefaultFlow = (BPMNDefaultFlow)theEObject;
				Object result = caseBPMNDefaultFlow(bpmnDefaultFlow);
				if (result == null) result = caseBPMNModelElement(bpmnDefaultFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_CONDITIONAL_FLOW: {
				BPMNConditionalFlow bpmnConditionalFlow = (BPMNConditionalFlow)theEObject;
				Object result = caseBPMNConditionalFlow(bpmnConditionalFlow);
				if (result == null) result = caseBPMNModelElement(bpmnConditionalFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPMNPackage.BPMN_DATA_ASSOZIATION: {
				BPMNDataAssoziation bpmnDataAssoziation = (BPMNDataAssoziation)theEObject;
				Object result = caseBPMNDataAssoziation(bpmnDataAssoziation);
				if (result == null) result = caseBPMNModelElement(bpmnDataAssoziation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNModelElement(BPMNModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Start Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Start Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventStartDefault(BPMNEventStartDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event End Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event End Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEndDefault(BPMNEventEndDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event End Used</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event End Used</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEndUsed(BPMNEventEndUsed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMail(BPMNEventMail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mail Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mail Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMailDash(BPMNEventMailDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mail Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mail Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMailDouble(BPMNEventMailDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mail Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mail Double Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMailDoubleDash(BPMNEventMailDoubleDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mail Invert Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mail Invert Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMailInvertDouble(BPMNEventMailInvertDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mail Invert Bold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mail Invert Bold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMailInvertBold(BPMNEventMailInvertBold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timer Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timer Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventTimerDefault(BPMNEventTimerDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timer Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timer Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventTimerDash(BPMNEventTimerDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timer Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timer Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventTimerDouble(BPMNEventTimerDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timer Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timer Double Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventTimerDoubleDash(BPMNEventTimerDoubleDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Eskalation Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Eskalation Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEskalationStart(BPMNEventEskalationStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Eskalation Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Eskalation Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEskalationDash(BPMNEventEskalationDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Eskalation Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Eskalation Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEskalationDouble(BPMNEventEskalationDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Eskalation Doubel Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Eskalation Doubel Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEskalationDoubelDash(BPMNEventEskalationDoubelDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Eskalation Doubel Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Eskalation Doubel Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEskalationDoubelInvert(BPMNEventEskalationDoubelInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Eskalation Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Eskalation Bold Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventEskalationBoldInvert(BPMNEventEskalationBoldInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event If Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event If Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventIfDefault(BPMNEventIfDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event If Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event If Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventIfDash(BPMNEventIfDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event If Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event If Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventIfDouble(BPMNEventIfDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event If Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event If Double Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventIfDoubleDash(BPMNEventIfDoubleDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Entered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Entered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventLinkEntered(BPMNEventLinkEntered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Triggerd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Triggerd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventLinkTriggerd(BPMNEventLinkTriggerd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Error Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Error Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventErrorDefault(BPMNEventErrorDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Error Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Error Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventErrorDouble(BPMNEventErrorDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Error Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Error Bold Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventErrorBoldInvert(BPMNEventErrorBoldInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Cancel Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Cancel Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventCancelDouble(BPMNEventCancelDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Cancel Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Cancel Bold Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventCancelBoldInvert(BPMNEventCancelBoldInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Compensation Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Compensation Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventCompensationDefault(BPMNEventCompensationDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Compensation Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Compensation Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventCompensationDouble(BPMNEventCompensationDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Compensation Double Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Compensation Double Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventCompensationDoubleInvert(BPMNEventCompensationDoubleInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Compensation Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Compensation Bold Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventCompensationBoldInvert(BPMNEventCompensationBoldInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Signal Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Signal Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventSignalDefault(BPMNEventSignalDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Signal Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Signal Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventSignalDash(BPMNEventSignalDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Signal Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Signal Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventSignalDouble(BPMNEventSignalDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Signal Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Signal Double Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventSignalDoubleDash(BPMNEventSignalDoubleDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Signal Double Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Signal Double Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventSignalDoubleInvert(BPMNEventSignalDoubleInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Signal Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Signal Bold Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventSignalBoldInvert(BPMNEventSignalBoldInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Multi Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Multi Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMultiDefault(BPMNEventMultiDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Multi Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Multi Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMultiDash(BPMNEventMultiDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Multi Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Multi Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMultiDouble(BPMNEventMultiDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Multi Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Multi Double Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMultiDoubleDash(BPMNEventMultiDoubleDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Multi Double Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Multi Double Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMultiDoubleInvert(BPMNEventMultiDoubleInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Multi Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Multi Bold Invert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventMultiBoldInvert(BPMNEventMultiBoldInvert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Parallel Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Parallel Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventParallelDefault(BPMNEventParallelDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Parallel Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Parallel Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventParallelDash(BPMNEventParallelDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Parallel Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Parallel Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventParallelDouble(BPMNEventParallelDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Parallel Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Parallel Double Dash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventParallelDoubleDash(BPMNEventParallelDoubleDash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Termination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Termination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNEventTermination(BPMNEventTermination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNActivityTask(BPMNActivityTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNActivityTransaction(BPMNActivityTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Event Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Event Sub Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNActivityEventSubProcess(BPMNActivityEventSubProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Call Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Call Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNActivityCallActivity(BPMNActivityCallActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway XOR1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway XOR1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayXOR1(BPMNGatewayXOR1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway XOR2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway XOR2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayXOR2(BPMNGatewayXOR2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayEvent(BPMNGatewayEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayAnd(BPMNGatewayAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayOR(BPMNGatewayOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayComplex(BPMNGatewayComplex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway XEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayXEvent(BPMNGatewayXEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway And Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway And Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNGatewayAndEvent(BPMNGatewayAndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversation Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversation Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNConversationDefault(BPMNConversationDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversation Bold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversation Bold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNConversationBold(BPMNConversationBold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNOneData(BPMNOneData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNListData(BPMNListData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNDataStorage(BPMNDataStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNSequenceFlow(BPMNSequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNDefaultFlow(BPMNDefaultFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNConditionalFlow(BPMNConditionalFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Assoziation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Assoziation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBPMNDataAssoziation(BPMNDataAssoziation object) {
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

} //BPMNSwitch
