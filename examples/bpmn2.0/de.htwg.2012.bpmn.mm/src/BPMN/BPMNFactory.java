/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BPMN.BPMNPackage
 * @generated
 */
public interface BPMNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMNFactory eINSTANCE = BPMN.impl.BPMNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element</em>'.
	 * @generated
	 */
	BPMNModelElement createBPMNModelElement();

	/**
	 * Returns a new object of class '<em>Event Start Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Start Default</em>'.
	 * @generated
	 */
	BPMNEventStartDefault createBPMNEventStartDefault();

	/**
	 * Returns a new object of class '<em>Event End Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event End Default</em>'.
	 * @generated
	 */
	BPMNEventEndDefault createBPMNEventEndDefault();

	/**
	 * Returns a new object of class '<em>Event End Used</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event End Used</em>'.
	 * @generated
	 */
	BPMNEventEndUsed createBPMNEventEndUsed();

	/**
	 * Returns a new object of class '<em>Event Mail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mail</em>'.
	 * @generated
	 */
	BPMNEventMail createBPMNEventMail();

	/**
	 * Returns a new object of class '<em>Event Mail Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mail Dash</em>'.
	 * @generated
	 */
	BPMNEventMailDash createBPMNEventMailDash();

	/**
	 * Returns a new object of class '<em>Event Mail Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mail Double</em>'.
	 * @generated
	 */
	BPMNEventMailDouble createBPMNEventMailDouble();

	/**
	 * Returns a new object of class '<em>Event Mail Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mail Double Dash</em>'.
	 * @generated
	 */
	BPMNEventMailDoubleDash createBPMNEventMailDoubleDash();

	/**
	 * Returns a new object of class '<em>Event Mail Invert Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mail Invert Double</em>'.
	 * @generated
	 */
	BPMNEventMailInvertDouble createBPMNEventMailInvertDouble();

	/**
	 * Returns a new object of class '<em>Event Mail Invert Bold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mail Invert Bold</em>'.
	 * @generated
	 */
	BPMNEventMailInvertBold createBPMNEventMailInvertBold();

	/**
	 * Returns a new object of class '<em>Event Timer Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Timer Default</em>'.
	 * @generated
	 */
	BPMNEventTimerDefault createBPMNEventTimerDefault();

	/**
	 * Returns a new object of class '<em>Event Timer Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Timer Dash</em>'.
	 * @generated
	 */
	BPMNEventTimerDash createBPMNEventTimerDash();

	/**
	 * Returns a new object of class '<em>Event Timer Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Timer Double</em>'.
	 * @generated
	 */
	BPMNEventTimerDouble createBPMNEventTimerDouble();

	/**
	 * Returns a new object of class '<em>Event Timer Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Timer Double Dash</em>'.
	 * @generated
	 */
	BPMNEventTimerDoubleDash createBPMNEventTimerDoubleDash();

	/**
	 * Returns a new object of class '<em>Event Eskalation Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Eskalation Start</em>'.
	 * @generated
	 */
	BPMNEventEskalationStart createBPMNEventEskalationStart();

	/**
	 * Returns a new object of class '<em>Event Eskalation Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Eskalation Dash</em>'.
	 * @generated
	 */
	BPMNEventEskalationDash createBPMNEventEskalationDash();

	/**
	 * Returns a new object of class '<em>Event Eskalation Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Eskalation Double</em>'.
	 * @generated
	 */
	BPMNEventEskalationDouble createBPMNEventEskalationDouble();

	/**
	 * Returns a new object of class '<em>Event Eskalation Doubel Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Eskalation Doubel Dash</em>'.
	 * @generated
	 */
	BPMNEventEskalationDoubelDash createBPMNEventEskalationDoubelDash();

	/**
	 * Returns a new object of class '<em>Event Eskalation Doubel Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Eskalation Doubel Invert</em>'.
	 * @generated
	 */
	BPMNEventEskalationDoubelInvert createBPMNEventEskalationDoubelInvert();

	/**
	 * Returns a new object of class '<em>Event Eskalation Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Eskalation Bold Invert</em>'.
	 * @generated
	 */
	BPMNEventEskalationBoldInvert createBPMNEventEskalationBoldInvert();

	/**
	 * Returns a new object of class '<em>Event If Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event If Default</em>'.
	 * @generated
	 */
	BPMNEventIfDefault createBPMNEventIfDefault();

	/**
	 * Returns a new object of class '<em>Event If Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event If Dash</em>'.
	 * @generated
	 */
	BPMNEventIfDash createBPMNEventIfDash();

	/**
	 * Returns a new object of class '<em>Event If Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event If Double</em>'.
	 * @generated
	 */
	BPMNEventIfDouble createBPMNEventIfDouble();

	/**
	 * Returns a new object of class '<em>Event If Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event If Double Dash</em>'.
	 * @generated
	 */
	BPMNEventIfDoubleDash createBPMNEventIfDoubleDash();

	/**
	 * Returns a new object of class '<em>Event Link Entered</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link Entered</em>'.
	 * @generated
	 */
	BPMNEventLinkEntered createBPMNEventLinkEntered();

	/**
	 * Returns a new object of class '<em>Event Link Triggerd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link Triggerd</em>'.
	 * @generated
	 */
	BPMNEventLinkTriggerd createBPMNEventLinkTriggerd();

	/**
	 * Returns a new object of class '<em>Event Error Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Error Default</em>'.
	 * @generated
	 */
	BPMNEventErrorDefault createBPMNEventErrorDefault();

	/**
	 * Returns a new object of class '<em>Event Error Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Error Double</em>'.
	 * @generated
	 */
	BPMNEventErrorDouble createBPMNEventErrorDouble();

	/**
	 * Returns a new object of class '<em>Event Error Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Error Bold Invert</em>'.
	 * @generated
	 */
	BPMNEventErrorBoldInvert createBPMNEventErrorBoldInvert();

	/**
	 * Returns a new object of class '<em>Event Cancel Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Cancel Double</em>'.
	 * @generated
	 */
	BPMNEventCancelDouble createBPMNEventCancelDouble();

	/**
	 * Returns a new object of class '<em>Event Cancel Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Cancel Bold Invert</em>'.
	 * @generated
	 */
	BPMNEventCancelBoldInvert createBPMNEventCancelBoldInvert();

	/**
	 * Returns a new object of class '<em>Event Compensation Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Compensation Default</em>'.
	 * @generated
	 */
	BPMNEventCompensationDefault createBPMNEventCompensationDefault();

	/**
	 * Returns a new object of class '<em>Event Compensation Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Compensation Double</em>'.
	 * @generated
	 */
	BPMNEventCompensationDouble createBPMNEventCompensationDouble();

	/**
	 * Returns a new object of class '<em>Event Compensation Double Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Compensation Double Invert</em>'.
	 * @generated
	 */
	BPMNEventCompensationDoubleInvert createBPMNEventCompensationDoubleInvert();

	/**
	 * Returns a new object of class '<em>Event Compensation Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Compensation Bold Invert</em>'.
	 * @generated
	 */
	BPMNEventCompensationBoldInvert createBPMNEventCompensationBoldInvert();

	/**
	 * Returns a new object of class '<em>Event Signal Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Signal Default</em>'.
	 * @generated
	 */
	BPMNEventSignalDefault createBPMNEventSignalDefault();

	/**
	 * Returns a new object of class '<em>Event Signal Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Signal Dash</em>'.
	 * @generated
	 */
	BPMNEventSignalDash createBPMNEventSignalDash();

	/**
	 * Returns a new object of class '<em>Event Signal Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Signal Double</em>'.
	 * @generated
	 */
	BPMNEventSignalDouble createBPMNEventSignalDouble();

	/**
	 * Returns a new object of class '<em>Event Signal Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Signal Double Dash</em>'.
	 * @generated
	 */
	BPMNEventSignalDoubleDash createBPMNEventSignalDoubleDash();

	/**
	 * Returns a new object of class '<em>Event Signal Double Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Signal Double Invert</em>'.
	 * @generated
	 */
	BPMNEventSignalDoubleInvert createBPMNEventSignalDoubleInvert();

	/**
	 * Returns a new object of class '<em>Event Signal Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Signal Bold Invert</em>'.
	 * @generated
	 */
	BPMNEventSignalBoldInvert createBPMNEventSignalBoldInvert();

	/**
	 * Returns a new object of class '<em>Event Multi Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Multi Default</em>'.
	 * @generated
	 */
	BPMNEventMultiDefault createBPMNEventMultiDefault();

	/**
	 * Returns a new object of class '<em>Event Multi Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Multi Dash</em>'.
	 * @generated
	 */
	BPMNEventMultiDash createBPMNEventMultiDash();

	/**
	 * Returns a new object of class '<em>Event Multi Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Multi Double</em>'.
	 * @generated
	 */
	BPMNEventMultiDouble createBPMNEventMultiDouble();

	/**
	 * Returns a new object of class '<em>Event Multi Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Multi Double Dash</em>'.
	 * @generated
	 */
	BPMNEventMultiDoubleDash createBPMNEventMultiDoubleDash();

	/**
	 * Returns a new object of class '<em>Event Multi Double Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Multi Double Invert</em>'.
	 * @generated
	 */
	BPMNEventMultiDoubleInvert createBPMNEventMultiDoubleInvert();

	/**
	 * Returns a new object of class '<em>Event Multi Bold Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Multi Bold Invert</em>'.
	 * @generated
	 */
	BPMNEventMultiBoldInvert createBPMNEventMultiBoldInvert();

	/**
	 * Returns a new object of class '<em>Event Parallel Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Parallel Default</em>'.
	 * @generated
	 */
	BPMNEventParallelDefault createBPMNEventParallelDefault();

	/**
	 * Returns a new object of class '<em>Event Parallel Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Parallel Dash</em>'.
	 * @generated
	 */
	BPMNEventParallelDash createBPMNEventParallelDash();

	/**
	 * Returns a new object of class '<em>Event Parallel Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Parallel Double</em>'.
	 * @generated
	 */
	BPMNEventParallelDouble createBPMNEventParallelDouble();

	/**
	 * Returns a new object of class '<em>Event Parallel Double Dash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Parallel Double Dash</em>'.
	 * @generated
	 */
	BPMNEventParallelDoubleDash createBPMNEventParallelDoubleDash();

	/**
	 * Returns a new object of class '<em>Event Termination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Termination</em>'.
	 * @generated
	 */
	BPMNEventTermination createBPMNEventTermination();

	/**
	 * Returns a new object of class '<em>Activity Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Task</em>'.
	 * @generated
	 */
	BPMNActivityTask createBPMNActivityTask();

	/**
	 * Returns a new object of class '<em>Activity Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Transaction</em>'.
	 * @generated
	 */
	BPMNActivityTransaction createBPMNActivityTransaction();

	/**
	 * Returns a new object of class '<em>Activity Event Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Event Sub Process</em>'.
	 * @generated
	 */
	BPMNActivityEventSubProcess createBPMNActivityEventSubProcess();

	/**
	 * Returns a new object of class '<em>Activity Call Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Call Activity</em>'.
	 * @generated
	 */
	BPMNActivityCallActivity createBPMNActivityCallActivity();

	/**
	 * Returns a new object of class '<em>Gateway XOR1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway XOR1</em>'.
	 * @generated
	 */
	BPMNGatewayXOR1 createBPMNGatewayXOR1();

	/**
	 * Returns a new object of class '<em>Gateway XOR2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway XOR2</em>'.
	 * @generated
	 */
	BPMNGatewayXOR2 createBPMNGatewayXOR2();

	/**
	 * Returns a new object of class '<em>Gateway Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Event</em>'.
	 * @generated
	 */
	BPMNGatewayEvent createBPMNGatewayEvent();

	/**
	 * Returns a new object of class '<em>Gateway And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway And</em>'.
	 * @generated
	 */
	BPMNGatewayAnd createBPMNGatewayAnd();

	/**
	 * Returns a new object of class '<em>Gateway OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway OR</em>'.
	 * @generated
	 */
	BPMNGatewayOR createBPMNGatewayOR();

	/**
	 * Returns a new object of class '<em>Gateway Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Complex</em>'.
	 * @generated
	 */
	BPMNGatewayComplex createBPMNGatewayComplex();

	/**
	 * Returns a new object of class '<em>Gateway XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway XEvent</em>'.
	 * @generated
	 */
	BPMNGatewayXEvent createBPMNGatewayXEvent();

	/**
	 * Returns a new object of class '<em>Gateway And Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway And Event</em>'.
	 * @generated
	 */
	BPMNGatewayAndEvent createBPMNGatewayAndEvent();

	/**
	 * Returns a new object of class '<em>Conversation Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversation Default</em>'.
	 * @generated
	 */
	BPMNConversationDefault createBPMNConversationDefault();

	/**
	 * Returns a new object of class '<em>Conversation Bold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversation Bold</em>'.
	 * @generated
	 */
	BPMNConversationBold createBPMNConversationBold();

	/**
	 * Returns a new object of class '<em>One Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Data</em>'.
	 * @generated
	 */
	BPMNOneData createBPMNOneData();

	/**
	 * Returns a new object of class '<em>List Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Data</em>'.
	 * @generated
	 */
	BPMNListData createBPMNListData();

	/**
	 * Returns a new object of class '<em>Data Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Storage</em>'.
	 * @generated
	 */
	BPMNDataStorage createBPMNDataStorage();

	/**
	 * Returns a new object of class '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow</em>'.
	 * @generated
	 */
	BPMNSequenceFlow createBPMNSequenceFlow();

	/**
	 * Returns a new object of class '<em>Default Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Flow</em>'.
	 * @generated
	 */
	BPMNDefaultFlow createBPMNDefaultFlow();

	/**
	 * Returns a new object of class '<em>Conditional Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Flow</em>'.
	 * @generated
	 */
	BPMNConditionalFlow createBPMNConditionalFlow();

	/**
	 * Returns a new object of class '<em>Data Assoziation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Assoziation</em>'.
	 * @generated
	 */
	BPMNDataAssoziation createBPMNDataAssoziation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BPMNPackage getBPMNPackage();

} //BPMNFactory
