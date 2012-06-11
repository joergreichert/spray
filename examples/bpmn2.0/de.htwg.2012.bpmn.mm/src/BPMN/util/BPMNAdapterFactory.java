/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN.util;

import BPMN.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BPMN.BPMNPackage
 * @generated
 */
public class BPMNAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMNPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPMNPackage.eINSTANCE;
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
	protected BPMNSwitch modelSwitch =
		new BPMNSwitch() {
			public Object caseBPMNModelElement(BPMNModelElement object) {
				return createBPMNModelElementAdapter();
			}
			public Object caseBPMNEventStartDefault(BPMNEventStartDefault object) {
				return createBPMNEventStartDefaultAdapter();
			}
			public Object caseBPMNEventEndDefault(BPMNEventEndDefault object) {
				return createBPMNEventEndDefaultAdapter();
			}
			public Object caseBPMNEventEndUsed(BPMNEventEndUsed object) {
				return createBPMNEventEndUsedAdapter();
			}
			public Object caseBPMNEventMail(BPMNEventMail object) {
				return createBPMNEventMailAdapter();
			}
			public Object caseBPMNEventMailDash(BPMNEventMailDash object) {
				return createBPMNEventMailDashAdapter();
			}
			public Object caseBPMNEventMailDouble(BPMNEventMailDouble object) {
				return createBPMNEventMailDoubleAdapter();
			}
			public Object caseBPMNEventMailDoubleDash(BPMNEventMailDoubleDash object) {
				return createBPMNEventMailDoubleDashAdapter();
			}
			public Object caseBPMNEventMailInvertDouble(BPMNEventMailInvertDouble object) {
				return createBPMNEventMailInvertDoubleAdapter();
			}
			public Object caseBPMNEventMailInvertBold(BPMNEventMailInvertBold object) {
				return createBPMNEventMailInvertBoldAdapter();
			}
			public Object caseBPMNEventTimerDefault(BPMNEventTimerDefault object) {
				return createBPMNEventTimerDefaultAdapter();
			}
			public Object caseBPMNEventTimerDash(BPMNEventTimerDash object) {
				return createBPMNEventTimerDashAdapter();
			}
			public Object caseBPMNEventTimerDouble(BPMNEventTimerDouble object) {
				return createBPMNEventTimerDoubleAdapter();
			}
			public Object caseBPMNEventTimerDoubleDash(BPMNEventTimerDoubleDash object) {
				return createBPMNEventTimerDoubleDashAdapter();
			}
			public Object caseBPMNEventEskalationStart(BPMNEventEskalationStart object) {
				return createBPMNEventEskalationStartAdapter();
			}
			public Object caseBPMNEventEskalationDash(BPMNEventEskalationDash object) {
				return createBPMNEventEskalationDashAdapter();
			}
			public Object caseBPMNEventEskalationDouble(BPMNEventEskalationDouble object) {
				return createBPMNEventEskalationDoubleAdapter();
			}
			public Object caseBPMNEventEskalationDoubelDash(BPMNEventEskalationDoubelDash object) {
				return createBPMNEventEskalationDoubelDashAdapter();
			}
			public Object caseBPMNEventEskalationDoubelInvert(BPMNEventEskalationDoubelInvert object) {
				return createBPMNEventEskalationDoubelInvertAdapter();
			}
			public Object caseBPMNEventEskalationBoldInvert(BPMNEventEskalationBoldInvert object) {
				return createBPMNEventEskalationBoldInvertAdapter();
			}
			public Object caseBPMNEventIfDefault(BPMNEventIfDefault object) {
				return createBPMNEventIfDefaultAdapter();
			}
			public Object caseBPMNEventIfDash(BPMNEventIfDash object) {
				return createBPMNEventIfDashAdapter();
			}
			public Object caseBPMNEventIfDouble(BPMNEventIfDouble object) {
				return createBPMNEventIfDoubleAdapter();
			}
			public Object caseBPMNEventIfDoubleDash(BPMNEventIfDoubleDash object) {
				return createBPMNEventIfDoubleDashAdapter();
			}
			public Object caseBPMNEventLinkEntered(BPMNEventLinkEntered object) {
				return createBPMNEventLinkEnteredAdapter();
			}
			public Object caseBPMNEventLinkTriggerd(BPMNEventLinkTriggerd object) {
				return createBPMNEventLinkTriggerdAdapter();
			}
			public Object caseBPMNEventErrorDefault(BPMNEventErrorDefault object) {
				return createBPMNEventErrorDefaultAdapter();
			}
			public Object caseBPMNEventErrorDouble(BPMNEventErrorDouble object) {
				return createBPMNEventErrorDoubleAdapter();
			}
			public Object caseBPMNEventErrorBoldInvert(BPMNEventErrorBoldInvert object) {
				return createBPMNEventErrorBoldInvertAdapter();
			}
			public Object caseBPMNEventCancelDouble(BPMNEventCancelDouble object) {
				return createBPMNEventCancelDoubleAdapter();
			}
			public Object caseBPMNEventCancelBoldInvert(BPMNEventCancelBoldInvert object) {
				return createBPMNEventCancelBoldInvertAdapter();
			}
			public Object caseBPMNEventCompensationDefault(BPMNEventCompensationDefault object) {
				return createBPMNEventCompensationDefaultAdapter();
			}
			public Object caseBPMNEventCompensationDouble(BPMNEventCompensationDouble object) {
				return createBPMNEventCompensationDoubleAdapter();
			}
			public Object caseBPMNEventCompensationDoubleInvert(BPMNEventCompensationDoubleInvert object) {
				return createBPMNEventCompensationDoubleInvertAdapter();
			}
			public Object caseBPMNEventCompensationBoldInvert(BPMNEventCompensationBoldInvert object) {
				return createBPMNEventCompensationBoldInvertAdapter();
			}
			public Object caseBPMNEventSignalDefault(BPMNEventSignalDefault object) {
				return createBPMNEventSignalDefaultAdapter();
			}
			public Object caseBPMNEventSignalDash(BPMNEventSignalDash object) {
				return createBPMNEventSignalDashAdapter();
			}
			public Object caseBPMNEventSignalDouble(BPMNEventSignalDouble object) {
				return createBPMNEventSignalDoubleAdapter();
			}
			public Object caseBPMNEventSignalDoubleDash(BPMNEventSignalDoubleDash object) {
				return createBPMNEventSignalDoubleDashAdapter();
			}
			public Object caseBPMNEventSignalDoubleInvert(BPMNEventSignalDoubleInvert object) {
				return createBPMNEventSignalDoubleInvertAdapter();
			}
			public Object caseBPMNEventSignalBoldInvert(BPMNEventSignalBoldInvert object) {
				return createBPMNEventSignalBoldInvertAdapter();
			}
			public Object caseBPMNEventMultiDefault(BPMNEventMultiDefault object) {
				return createBPMNEventMultiDefaultAdapter();
			}
			public Object caseBPMNEventMultiDash(BPMNEventMultiDash object) {
				return createBPMNEventMultiDashAdapter();
			}
			public Object caseBPMNEventMultiDouble(BPMNEventMultiDouble object) {
				return createBPMNEventMultiDoubleAdapter();
			}
			public Object caseBPMNEventMultiDoubleDash(BPMNEventMultiDoubleDash object) {
				return createBPMNEventMultiDoubleDashAdapter();
			}
			public Object caseBPMNEventMultiDoubleInvert(BPMNEventMultiDoubleInvert object) {
				return createBPMNEventMultiDoubleInvertAdapter();
			}
			public Object caseBPMNEventMultiBoldInvert(BPMNEventMultiBoldInvert object) {
				return createBPMNEventMultiBoldInvertAdapter();
			}
			public Object caseBPMNEventParallelDefault(BPMNEventParallelDefault object) {
				return createBPMNEventParallelDefaultAdapter();
			}
			public Object caseBPMNEventParallelDash(BPMNEventParallelDash object) {
				return createBPMNEventParallelDashAdapter();
			}
			public Object caseBPMNEventParallelDouble(BPMNEventParallelDouble object) {
				return createBPMNEventParallelDoubleAdapter();
			}
			public Object caseBPMNEventParallelDoubleDash(BPMNEventParallelDoubleDash object) {
				return createBPMNEventParallelDoubleDashAdapter();
			}
			public Object caseBPMNEventTermination(BPMNEventTermination object) {
				return createBPMNEventTerminationAdapter();
			}
			public Object caseBPMNActivityTask(BPMNActivityTask object) {
				return createBPMNActivityTaskAdapter();
			}
			public Object caseBPMNActivityTransaction(BPMNActivityTransaction object) {
				return createBPMNActivityTransactionAdapter();
			}
			public Object caseBPMNActivityEventSubProcess(BPMNActivityEventSubProcess object) {
				return createBPMNActivityEventSubProcessAdapter();
			}
			public Object caseBPMNActivityCallActivity(BPMNActivityCallActivity object) {
				return createBPMNActivityCallActivityAdapter();
			}
			public Object caseBPMNGatewayXOR1(BPMNGatewayXOR1 object) {
				return createBPMNGatewayXOR1Adapter();
			}
			public Object caseBPMNGatewayXOR2(BPMNGatewayXOR2 object) {
				return createBPMNGatewayXOR2Adapter();
			}
			public Object caseBPMNGatewayEvent(BPMNGatewayEvent object) {
				return createBPMNGatewayEventAdapter();
			}
			public Object caseBPMNGatewayAnd(BPMNGatewayAnd object) {
				return createBPMNGatewayAndAdapter();
			}
			public Object caseBPMNGatewayOR(BPMNGatewayOR object) {
				return createBPMNGatewayORAdapter();
			}
			public Object caseBPMNGatewayComplex(BPMNGatewayComplex object) {
				return createBPMNGatewayComplexAdapter();
			}
			public Object caseBPMNGatewayXEvent(BPMNGatewayXEvent object) {
				return createBPMNGatewayXEventAdapter();
			}
			public Object caseBPMNGatewayAndEvent(BPMNGatewayAndEvent object) {
				return createBPMNGatewayAndEventAdapter();
			}
			public Object caseBPMNConversationDefault(BPMNConversationDefault object) {
				return createBPMNConversationDefaultAdapter();
			}
			public Object caseBPMNConversationBold(BPMNConversationBold object) {
				return createBPMNConversationBoldAdapter();
			}
			public Object caseBPMNOneData(BPMNOneData object) {
				return createBPMNOneDataAdapter();
			}
			public Object caseBPMNListData(BPMNListData object) {
				return createBPMNListDataAdapter();
			}
			public Object caseBPMNDataStorage(BPMNDataStorage object) {
				return createBPMNDataStorageAdapter();
			}
			public Object caseBPMNSequenceFlow(BPMNSequenceFlow object) {
				return createBPMNSequenceFlowAdapter();
			}
			public Object caseBPMNDefaultFlow(BPMNDefaultFlow object) {
				return createBPMNDefaultFlowAdapter();
			}
			public Object caseBPMNConditionalFlow(BPMNConditionalFlow object) {
				return createBPMNConditionalFlowAdapter();
			}
			public Object caseBPMNDataAssoziation(BPMNDataAssoziation object) {
				return createBPMNDataAssoziationAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNModelElement
	 * @generated
	 */
	public Adapter createBPMNModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventStartDefault <em>Event Start Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventStartDefault
	 * @generated
	 */
	public Adapter createBPMNEventStartDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEndDefault <em>Event End Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEndDefault
	 * @generated
	 */
	public Adapter createBPMNEventEndDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEndUsed <em>Event End Used</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEndUsed
	 * @generated
	 */
	public Adapter createBPMNEventEndUsedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMail <em>Event Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMail
	 * @generated
	 */
	public Adapter createBPMNEventMailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMailDash <em>Event Mail Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMailDash
	 * @generated
	 */
	public Adapter createBPMNEventMailDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMailDouble <em>Event Mail Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMailDouble
	 * @generated
	 */
	public Adapter createBPMNEventMailDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMailDoubleDash <em>Event Mail Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMailDoubleDash
	 * @generated
	 */
	public Adapter createBPMNEventMailDoubleDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMailInvertDouble <em>Event Mail Invert Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMailInvertDouble
	 * @generated
	 */
	public Adapter createBPMNEventMailInvertDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMailInvertBold <em>Event Mail Invert Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMailInvertBold
	 * @generated
	 */
	public Adapter createBPMNEventMailInvertBoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventTimerDefault <em>Event Timer Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventTimerDefault
	 * @generated
	 */
	public Adapter createBPMNEventTimerDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventTimerDash <em>Event Timer Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventTimerDash
	 * @generated
	 */
	public Adapter createBPMNEventTimerDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventTimerDouble <em>Event Timer Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventTimerDouble
	 * @generated
	 */
	public Adapter createBPMNEventTimerDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventTimerDoubleDash <em>Event Timer Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventTimerDoubleDash
	 * @generated
	 */
	public Adapter createBPMNEventTimerDoubleDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEskalationStart <em>Event Eskalation Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEskalationStart
	 * @generated
	 */
	public Adapter createBPMNEventEskalationStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEskalationDash <em>Event Eskalation Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEskalationDash
	 * @generated
	 */
	public Adapter createBPMNEventEskalationDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEskalationDouble <em>Event Eskalation Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEskalationDouble
	 * @generated
	 */
	public Adapter createBPMNEventEskalationDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEskalationDoubelDash <em>Event Eskalation Doubel Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEskalationDoubelDash
	 * @generated
	 */
	public Adapter createBPMNEventEskalationDoubelDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEskalationDoubelInvert <em>Event Eskalation Doubel Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEskalationDoubelInvert
	 * @generated
	 */
	public Adapter createBPMNEventEskalationDoubelInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventEskalationBoldInvert <em>Event Eskalation Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventEskalationBoldInvert
	 * @generated
	 */
	public Adapter createBPMNEventEskalationBoldInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventIfDefault <em>Event If Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventIfDefault
	 * @generated
	 */
	public Adapter createBPMNEventIfDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventIfDash <em>Event If Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventIfDash
	 * @generated
	 */
	public Adapter createBPMNEventIfDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventIfDouble <em>Event If Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventIfDouble
	 * @generated
	 */
	public Adapter createBPMNEventIfDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventIfDoubleDash <em>Event If Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventIfDoubleDash
	 * @generated
	 */
	public Adapter createBPMNEventIfDoubleDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventLinkEntered <em>Event Link Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventLinkEntered
	 * @generated
	 */
	public Adapter createBPMNEventLinkEnteredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventLinkTriggerd <em>Event Link Triggerd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventLinkTriggerd
	 * @generated
	 */
	public Adapter createBPMNEventLinkTriggerdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventErrorDefault <em>Event Error Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventErrorDefault
	 * @generated
	 */
	public Adapter createBPMNEventErrorDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventErrorDouble <em>Event Error Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventErrorDouble
	 * @generated
	 */
	public Adapter createBPMNEventErrorDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventErrorBoldInvert <em>Event Error Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventErrorBoldInvert
	 * @generated
	 */
	public Adapter createBPMNEventErrorBoldInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventCancelDouble <em>Event Cancel Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventCancelDouble
	 * @generated
	 */
	public Adapter createBPMNEventCancelDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventCancelBoldInvert <em>Event Cancel Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventCancelBoldInvert
	 * @generated
	 */
	public Adapter createBPMNEventCancelBoldInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventCompensationDefault <em>Event Compensation Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventCompensationDefault
	 * @generated
	 */
	public Adapter createBPMNEventCompensationDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventCompensationDouble <em>Event Compensation Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventCompensationDouble
	 * @generated
	 */
	public Adapter createBPMNEventCompensationDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventCompensationDoubleInvert <em>Event Compensation Double Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventCompensationDoubleInvert
	 * @generated
	 */
	public Adapter createBPMNEventCompensationDoubleInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventCompensationBoldInvert <em>Event Compensation Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventCompensationBoldInvert
	 * @generated
	 */
	public Adapter createBPMNEventCompensationBoldInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventSignalDefault <em>Event Signal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventSignalDefault
	 * @generated
	 */
	public Adapter createBPMNEventSignalDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventSignalDash <em>Event Signal Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventSignalDash
	 * @generated
	 */
	public Adapter createBPMNEventSignalDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventSignalDouble <em>Event Signal Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventSignalDouble
	 * @generated
	 */
	public Adapter createBPMNEventSignalDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventSignalDoubleDash <em>Event Signal Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventSignalDoubleDash
	 * @generated
	 */
	public Adapter createBPMNEventSignalDoubleDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventSignalDoubleInvert <em>Event Signal Double Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventSignalDoubleInvert
	 * @generated
	 */
	public Adapter createBPMNEventSignalDoubleInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventSignalBoldInvert <em>Event Signal Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventSignalBoldInvert
	 * @generated
	 */
	public Adapter createBPMNEventSignalBoldInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMultiDefault <em>Event Multi Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMultiDefault
	 * @generated
	 */
	public Adapter createBPMNEventMultiDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMultiDash <em>Event Multi Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMultiDash
	 * @generated
	 */
	public Adapter createBPMNEventMultiDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMultiDouble <em>Event Multi Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMultiDouble
	 * @generated
	 */
	public Adapter createBPMNEventMultiDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMultiDoubleDash <em>Event Multi Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMultiDoubleDash
	 * @generated
	 */
	public Adapter createBPMNEventMultiDoubleDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMultiDoubleInvert <em>Event Multi Double Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMultiDoubleInvert
	 * @generated
	 */
	public Adapter createBPMNEventMultiDoubleInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventMultiBoldInvert <em>Event Multi Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventMultiBoldInvert
	 * @generated
	 */
	public Adapter createBPMNEventMultiBoldInvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventParallelDefault <em>Event Parallel Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventParallelDefault
	 * @generated
	 */
	public Adapter createBPMNEventParallelDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventParallelDash <em>Event Parallel Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventParallelDash
	 * @generated
	 */
	public Adapter createBPMNEventParallelDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventParallelDouble <em>Event Parallel Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventParallelDouble
	 * @generated
	 */
	public Adapter createBPMNEventParallelDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventParallelDoubleDash <em>Event Parallel Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventParallelDoubleDash
	 * @generated
	 */
	public Adapter createBPMNEventParallelDoubleDashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNEventTermination <em>Event Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNEventTermination
	 * @generated
	 */
	public Adapter createBPMNEventTerminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNActivityTask <em>Activity Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNActivityTask
	 * @generated
	 */
	public Adapter createBPMNActivityTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNActivityTransaction <em>Activity Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNActivityTransaction
	 * @generated
	 */
	public Adapter createBPMNActivityTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNActivityEventSubProcess <em>Activity Event Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNActivityEventSubProcess
	 * @generated
	 */
	public Adapter createBPMNActivityEventSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNActivityCallActivity <em>Activity Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNActivityCallActivity
	 * @generated
	 */
	public Adapter createBPMNActivityCallActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayXOR1 <em>Gateway XOR1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayXOR1
	 * @generated
	 */
	public Adapter createBPMNGatewayXOR1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayXOR2 <em>Gateway XOR2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayXOR2
	 * @generated
	 */
	public Adapter createBPMNGatewayXOR2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayEvent <em>Gateway Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayEvent
	 * @generated
	 */
	public Adapter createBPMNGatewayEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayAnd <em>Gateway And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayAnd
	 * @generated
	 */
	public Adapter createBPMNGatewayAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayOR <em>Gateway OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayOR
	 * @generated
	 */
	public Adapter createBPMNGatewayORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayComplex <em>Gateway Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayComplex
	 * @generated
	 */
	public Adapter createBPMNGatewayComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayXEvent <em>Gateway XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayXEvent
	 * @generated
	 */
	public Adapter createBPMNGatewayXEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNGatewayAndEvent <em>Gateway And Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNGatewayAndEvent
	 * @generated
	 */
	public Adapter createBPMNGatewayAndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNConversationDefault <em>Conversation Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNConversationDefault
	 * @generated
	 */
	public Adapter createBPMNConversationDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNConversationBold <em>Conversation Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNConversationBold
	 * @generated
	 */
	public Adapter createBPMNConversationBoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNOneData <em>One Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNOneData
	 * @generated
	 */
	public Adapter createBPMNOneDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNListData <em>List Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNListData
	 * @generated
	 */
	public Adapter createBPMNListDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNDataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNDataStorage
	 * @generated
	 */
	public Adapter createBPMNDataStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNSequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNSequenceFlow
	 * @generated
	 */
	public Adapter createBPMNSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNDefaultFlow <em>Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNDefaultFlow
	 * @generated
	 */
	public Adapter createBPMNDefaultFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNConditionalFlow <em>Conditional Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNConditionalFlow
	 * @generated
	 */
	public Adapter createBPMNConditionalFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN.BPMNDataAssoziation <em>Data Assoziation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN.BPMNDataAssoziation
	 * @generated
	 */
	public Adapter createBPMNDataAssoziationAdapter() {
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

} //BPMNAdapterFactory
