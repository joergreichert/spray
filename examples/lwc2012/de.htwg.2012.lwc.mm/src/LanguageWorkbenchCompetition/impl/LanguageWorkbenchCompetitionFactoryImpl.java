/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.impl;

import LanguageWorkbenchCompetition.*;

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
public class LanguageWorkbenchCompetitionFactoryImpl extends EFactoryImpl implements LanguageWorkbenchCompetitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageWorkbenchCompetitionFactory init() {
		try {
			LanguageWorkbenchCompetitionFactory theLanguageWorkbenchCompetitionFactory = (LanguageWorkbenchCompetitionFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.htwg.2012.lwc"); 
			if (theLanguageWorkbenchCompetitionFactory != null) {
				return theLanguageWorkbenchCompetitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LanguageWorkbenchCompetitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LanguageWorkbenchCompetitionPackage.LWC_MODEL_ELEMENT: return createLWCModelElement();
			case LanguageWorkbenchCompetitionPackage.LWC_HEAT_EXCHANGER: return createLWCHeatExchanger();
			case LanguageWorkbenchCompetitionPackage.LWC_PIPE: return createLWCPipe();
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START: return createLWCSourceExhaustStart();
			case LanguageWorkbenchCompetitionPackage.LWC_VESSEL_VERTICAL: return createLWCVesselVertical();
			case LanguageWorkbenchCompetitionPackage.LWC_VESSEL_HORIZONTAL: return createLWCVesselHorizontal();
			case LanguageWorkbenchCompetitionPackage.LWC_VALVE: return createLWCValve();
			case LanguageWorkbenchCompetitionPackage.LWC_VALVE_MANUEL: return createLWCValveManuel();
			case LanguageWorkbenchCompetitionPackage.LWC_VALVE_CONTROL: return createLWCValveControl();
			case LanguageWorkbenchCompetitionPackage.LWC_PUMP: return createLWCPump();
			case LanguageWorkbenchCompetitionPackage.LWC_PUMP_VACUUM: return createLWCPumpVacuum();
			case LanguageWorkbenchCompetitionPackage.LWC_SYSTEM_END: return createLWCSystemEnd();
			case LanguageWorkbenchCompetitionPackage.LWC_JOINT: return createLWCJoint();
			case LanguageWorkbenchCompetitionPackage.LWC_LOCATION_NO_LINE: return createLWCLocationNoLine();
			case LanguageWorkbenchCompetitionPackage.LWC_LOCATION_SOLID_LINE: return createLWCLocationSolidLine();
			case LanguageWorkbenchCompetitionPackage.LWC_LOCATION_DASH_LINE: return createLWCLocationDashLine();
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_END: return createLWCSourceExhaustEnd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCModelElement createLWCModelElement() {
		LWCModelElementImpl lwcModelElement = new LWCModelElementImpl();
		return lwcModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCHeatExchanger createLWCHeatExchanger() {
		LWCHeatExchangerImpl lwcHeatExchanger = new LWCHeatExchangerImpl();
		return lwcHeatExchanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCPipe createLWCPipe() {
		LWCPipeImpl lwcPipe = new LWCPipeImpl();
		return lwcPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCSourceExhaustStart createLWCSourceExhaustStart() {
		LWCSourceExhaustStartImpl lwcSourceExhaustStart = new LWCSourceExhaustStartImpl();
		return lwcSourceExhaustStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCVesselVertical createLWCVesselVertical() {
		LWCVesselVerticalImpl lwcVesselVertical = new LWCVesselVerticalImpl();
		return lwcVesselVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCVesselHorizontal createLWCVesselHorizontal() {
		LWCVesselHorizontalImpl lwcVesselHorizontal = new LWCVesselHorizontalImpl();
		return lwcVesselHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCValve createLWCValve() {
		LWCValveImpl lwcValve = new LWCValveImpl();
		return lwcValve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCValveManuel createLWCValveManuel() {
		LWCValveManuelImpl lwcValveManuel = new LWCValveManuelImpl();
		return lwcValveManuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCValveControl createLWCValveControl() {
		LWCValveControlImpl lwcValveControl = new LWCValveControlImpl();
		return lwcValveControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCPump createLWCPump() {
		LWCPumpImpl lwcPump = new LWCPumpImpl();
		return lwcPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCPumpVacuum createLWCPumpVacuum() {
		LWCPumpVacuumImpl lwcPumpVacuum = new LWCPumpVacuumImpl();
		return lwcPumpVacuum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCSystemEnd createLWCSystemEnd() {
		LWCSystemEndImpl lwcSystemEnd = new LWCSystemEndImpl();
		return lwcSystemEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCJoint createLWCJoint() {
		LWCJointImpl lwcJoint = new LWCJointImpl();
		return lwcJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCLocationNoLine createLWCLocationNoLine() {
		LWCLocationNoLineImpl lwcLocationNoLine = new LWCLocationNoLineImpl();
		return lwcLocationNoLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCLocationSolidLine createLWCLocationSolidLine() {
		LWCLocationSolidLineImpl lwcLocationSolidLine = new LWCLocationSolidLineImpl();
		return lwcLocationSolidLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCLocationDashLine createLWCLocationDashLine() {
		LWCLocationDashLineImpl lwcLocationDashLine = new LWCLocationDashLineImpl();
		return lwcLocationDashLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCSourceExhaustEnd createLWCSourceExhaustEnd() {
		LWCSourceExhaustEndImpl lwcSourceExhaustEnd = new LWCSourceExhaustEndImpl();
		return lwcSourceExhaustEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionPackage getLanguageWorkbenchCompetitionPackage() {
		return (LanguageWorkbenchCompetitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LanguageWorkbenchCompetitionPackage getPackage() {
		return LanguageWorkbenchCompetitionPackage.eINSTANCE;
	}

} //LanguageWorkbenchCompetitionFactoryImpl
