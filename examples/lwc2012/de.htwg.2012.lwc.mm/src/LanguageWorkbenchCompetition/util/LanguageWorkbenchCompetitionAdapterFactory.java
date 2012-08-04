<<<<<<< HEAD
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.util;

import LanguageWorkbenchCompetition.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage
 * @generated
 */
public class LanguageWorkbenchCompetitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LanguageWorkbenchCompetitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LanguageWorkbenchCompetitionPackage.eINSTANCE;
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
	protected LanguageWorkbenchCompetitionSwitch modelSwitch =
		new LanguageWorkbenchCompetitionSwitch() {
			public Object caseLWCModelElement(LWCModelElement object) {
				return createLWCModelElementAdapter();
			}
			public Object caseLWCHeatExchanger(LWCHeatExchanger object) {
				return createLWCHeatExchangerAdapter();
			}
			public Object caseLWCPipe(LWCPipe object) {
				return createLWCPipeAdapter();
			}
			public Object caseLWCSourceExhaustStart(LWCSourceExhaustStart object) {
				return createLWCSourceExhaustStartAdapter();
			}
			public Object caseLWCVesselVertical(LWCVesselVertical object) {
				return createLWCVesselVerticalAdapter();
			}
			public Object caseLWCVesselHorizontal(LWCVesselHorizontal object) {
				return createLWCVesselHorizontalAdapter();
			}
			public Object caseLWCValve(LWCValve object) {
				return createLWCValveAdapter();
			}
			public Object caseLWCValveManuel(LWCValveManuel object) {
				return createLWCValveManuelAdapter();
			}
			public Object caseLWCValveControl(LWCValveControl object) {
				return createLWCValveControlAdapter();
			}
			public Object caseLWCPump(LWCPump object) {
				return createLWCPumpAdapter();
			}
			public Object caseLWCPumpVacuum(LWCPumpVacuum object) {
				return createLWCPumpVacuumAdapter();
			}
			public Object caseLWCSystemEnd(LWCSystemEnd object) {
				return createLWCSystemEndAdapter();
			}
			public Object caseLWCJoint(LWCJoint object) {
				return createLWCJointAdapter();
			}
			public Object caseLWCLocationNoLine(LWCLocationNoLine object) {
				return createLWCLocationNoLineAdapter();
			}
			public Object caseLWCLocationSolidLine(LWCLocationSolidLine object) {
				return createLWCLocationSolidLineAdapter();
			}
			public Object caseLWCLocationDashLine(LWCLocationDashLine object) {
				return createLWCLocationDashLineAdapter();
			}
			public Object caseLWCSourceExhaustEnd(LWCSourceExhaustEnd object) {
				return createLWCSourceExhaustEndAdapter();
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
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCModelElement <em>LWC Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCModelElement
	 * @generated
	 */
	public Adapter createLWCModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCHeatExchanger <em>LWC Heat Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCHeatExchanger
	 * @generated
	 */
	public Adapter createLWCHeatExchangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCPipe <em>LWC Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCPipe
	 * @generated
	 */
	public Adapter createLWCPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart <em>LWC Source Exhaust Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustStart
	 * @generated
	 */
	public Adapter createLWCSourceExhaustStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCVesselVertical <em>LWC Vessel Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCVesselVertical
	 * @generated
	 */
	public Adapter createLWCVesselVerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCVesselHorizontal <em>LWC Vessel Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCVesselHorizontal
	 * @generated
	 */
	public Adapter createLWCVesselHorizontalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCValve <em>LWC Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCValve
	 * @generated
	 */
	public Adapter createLWCValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCValveManuel <em>LWC Valve Manuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCValveManuel
	 * @generated
	 */
	public Adapter createLWCValveManuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCValveControl <em>LWC Valve Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCValveControl
	 * @generated
	 */
	public Adapter createLWCValveControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCPump <em>LWC Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCPump
	 * @generated
	 */
	public Adapter createLWCPumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCPumpVacuum <em>LWC Pump Vacuum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCPumpVacuum
	 * @generated
	 */
	public Adapter createLWCPumpVacuumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCSystemEnd <em>LWC System End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCSystemEnd
	 * @generated
	 */
	public Adapter createLWCSystemEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCJoint <em>LWC Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCJoint
	 * @generated
	 */
	public Adapter createLWCJointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCLocationNoLine <em>LWC Location No Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCLocationNoLine
	 * @generated
	 */
	public Adapter createLWCLocationNoLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCLocationSolidLine <em>LWC Location Solid Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCLocationSolidLine
	 * @generated
	 */
	public Adapter createLWCLocationSolidLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCLocationDashLine <em>LWC Location Dash Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCLocationDashLine
	 * @generated
	 */
	public Adapter createLWCLocationDashLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCSourceExhaustEnd <em>LWC Source Exhaust End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustEnd
	 * @generated
	 */
	public Adapter createLWCSourceExhaustEndAdapter() {
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

} //LanguageWorkbenchCompetitionAdapterFactory
=======
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.util;

import LanguageWorkbenchCompetition.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage
 * @generated
 */
public class LanguageWorkbenchCompetitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LanguageWorkbenchCompetitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LanguageWorkbenchCompetitionPackage.eINSTANCE;
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
	protected LanguageWorkbenchCompetitionSwitch modelSwitch =
		new LanguageWorkbenchCompetitionSwitch() {
			public Object caseLWCModelElement(LWCModelElement object) {
				return createLWCModelElementAdapter();
			}
			public Object caseLWCHeatExchanger(LWCHeatExchanger object) {
				return createLWCHeatExchangerAdapter();
			}
			public Object caseLWCPipe(LWCPipe object) {
				return createLWCPipeAdapter();
			}
			public Object caseLWCSourceExhaustStart(LWCSourceExhaustStart object) {
				return createLWCSourceExhaustStartAdapter();
			}
			public Object caseLWCVesselVertical(LWCVesselVertical object) {
				return createLWCVesselVerticalAdapter();
			}
			public Object caseLWCVesselHorizontal(LWCVesselHorizontal object) {
				return createLWCVesselHorizontalAdapter();
			}
			public Object caseLWCValve(LWCValve object) {
				return createLWCValveAdapter();
			}
			public Object caseLWCValveManuel(LWCValveManuel object) {
				return createLWCValveManuelAdapter();
			}
			public Object caseLWCValveControl(LWCValveControl object) {
				return createLWCValveControlAdapter();
			}
			public Object caseLWCPump(LWCPump object) {
				return createLWCPumpAdapter();
			}
			public Object caseLWCPumpVacuum(LWCPumpVacuum object) {
				return createLWCPumpVacuumAdapter();
			}
			public Object caseLWCSystemEnd(LWCSystemEnd object) {
				return createLWCSystemEndAdapter();
			}
			public Object caseLWCJoint(LWCJoint object) {
				return createLWCJointAdapter();
			}
			public Object caseLWCLocationNoLine(LWCLocationNoLine object) {
				return createLWCLocationNoLineAdapter();
			}
			public Object caseLWCLocationSolidLine(LWCLocationSolidLine object) {
				return createLWCLocationSolidLineAdapter();
			}
			public Object caseLWCLocationDashLine(LWCLocationDashLine object) {
				return createLWCLocationDashLineAdapter();
			}
			public Object caseLWCSourceExhaustEnd(LWCSourceExhaustEnd object) {
				return createLWCSourceExhaustEndAdapter();
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
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCModelElement <em>LWC Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCModelElement
	 * @generated
	 */
	public Adapter createLWCModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCHeatExchanger <em>LWC Heat Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCHeatExchanger
	 * @generated
	 */
	public Adapter createLWCHeatExchangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCPipe <em>LWC Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCPipe
	 * @generated
	 */
	public Adapter createLWCPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart <em>LWC Source Exhaust Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustStart
	 * @generated
	 */
	public Adapter createLWCSourceExhaustStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCVesselVertical <em>LWC Vessel Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCVesselVertical
	 * @generated
	 */
	public Adapter createLWCVesselVerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCVesselHorizontal <em>LWC Vessel Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCVesselHorizontal
	 * @generated
	 */
	public Adapter createLWCVesselHorizontalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCValve <em>LWC Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCValve
	 * @generated
	 */
	public Adapter createLWCValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCValveManuel <em>LWC Valve Manuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCValveManuel
	 * @generated
	 */
	public Adapter createLWCValveManuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCValveControl <em>LWC Valve Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCValveControl
	 * @generated
	 */
	public Adapter createLWCValveControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCPump <em>LWC Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCPump
	 * @generated
	 */
	public Adapter createLWCPumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCPumpVacuum <em>LWC Pump Vacuum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCPumpVacuum
	 * @generated
	 */
	public Adapter createLWCPumpVacuumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCSystemEnd <em>LWC System End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCSystemEnd
	 * @generated
	 */
	public Adapter createLWCSystemEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCJoint <em>LWC Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCJoint
	 * @generated
	 */
	public Adapter createLWCJointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCLocationNoLine <em>LWC Location No Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCLocationNoLine
	 * @generated
	 */
	public Adapter createLWCLocationNoLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCLocationSolidLine <em>LWC Location Solid Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCLocationSolidLine
	 * @generated
	 */
	public Adapter createLWCLocationSolidLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCLocationDashLine <em>LWC Location Dash Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCLocationDashLine
	 * @generated
	 */
	public Adapter createLWCLocationDashLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LanguageWorkbenchCompetition.LWCSourceExhaustEnd <em>LWC Source Exhaust End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustEnd
	 * @generated
	 */
	public Adapter createLWCSourceExhaustEndAdapter() {
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

} //LanguageWorkbenchCompetitionAdapterFactory
>>>>>>> eclipse_juno
