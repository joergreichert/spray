/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.util;

import LanguageWorkbenchCompetition.*;

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
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage
 * @generated
 */
public class LanguageWorkbenchCompetitionSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LanguageWorkbenchCompetitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionSwitch() {
		if (modelPackage == null) {
			modelPackage = LanguageWorkbenchCompetitionPackage.eINSTANCE;
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
			case LanguageWorkbenchCompetitionPackage.LWC_MODEL_ELEMENT: {
				LWCModelElement lwcModelElement = (LWCModelElement)theEObject;
				Object result = caseLWCModelElement(lwcModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_HEAT_EXCHANGER: {
				LWCHeatExchanger lwcHeatExchanger = (LWCHeatExchanger)theEObject;
				Object result = caseLWCHeatExchanger(lwcHeatExchanger);
				if (result == null) result = caseLWCModelElement(lwcHeatExchanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_PIPE: {
				LWCPipe lwcPipe = (LWCPipe)theEObject;
				Object result = caseLWCPipe(lwcPipe);
				if (result == null) result = caseLWCModelElement(lwcPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START: {
				LWCSourceExhaustStart lwcSourceExhaustStart = (LWCSourceExhaustStart)theEObject;
				Object result = caseLWCSourceExhaustStart(lwcSourceExhaustStart);
				if (result == null) result = caseLWCModelElement(lwcSourceExhaustStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_VESSEL_VERTICAL: {
				LWCVesselVertical lwcVesselVertical = (LWCVesselVertical)theEObject;
				Object result = caseLWCVesselVertical(lwcVesselVertical);
				if (result == null) result = caseLWCModelElement(lwcVesselVertical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_VESSEL_HORIZONTAL: {
				LWCVesselHorizontal lwcVesselHorizontal = (LWCVesselHorizontal)theEObject;
				Object result = caseLWCVesselHorizontal(lwcVesselHorizontal);
				if (result == null) result = caseLWCModelElement(lwcVesselHorizontal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_VALVE: {
				LWCValve lwcValve = (LWCValve)theEObject;
				Object result = caseLWCValve(lwcValve);
				if (result == null) result = caseLWCModelElement(lwcValve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_VALVE_MANUEL: {
				LWCValveManuel lwcValveManuel = (LWCValveManuel)theEObject;
				Object result = caseLWCValveManuel(lwcValveManuel);
				if (result == null) result = caseLWCModelElement(lwcValveManuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_VALVE_CONTROL: {
				LWCValveControl lwcValveControl = (LWCValveControl)theEObject;
				Object result = caseLWCValveControl(lwcValveControl);
				if (result == null) result = caseLWCModelElement(lwcValveControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_PUMP: {
				LWCPump lwcPump = (LWCPump)theEObject;
				Object result = caseLWCPump(lwcPump);
				if (result == null) result = caseLWCModelElement(lwcPump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_PUMP_VACUUM: {
				LWCPumpVacuum lwcPumpVacuum = (LWCPumpVacuum)theEObject;
				Object result = caseLWCPumpVacuum(lwcPumpVacuum);
				if (result == null) result = caseLWCModelElement(lwcPumpVacuum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_SYSTEM_END: {
				LWCSystemEnd lwcSystemEnd = (LWCSystemEnd)theEObject;
				Object result = caseLWCSystemEnd(lwcSystemEnd);
				if (result == null) result = caseLWCModelElement(lwcSystemEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_JOINT: {
				LWCJoint lwcJoint = (LWCJoint)theEObject;
				Object result = caseLWCJoint(lwcJoint);
				if (result == null) result = caseLWCModelElement(lwcJoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_LOCATION_NO_LINE: {
				LWCLocationNoLine lwcLocationNoLine = (LWCLocationNoLine)theEObject;
				Object result = caseLWCLocationNoLine(lwcLocationNoLine);
				if (result == null) result = caseLWCModelElement(lwcLocationNoLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_LOCATION_SOLID_LINE: {
				LWCLocationSolidLine lwcLocationSolidLine = (LWCLocationSolidLine)theEObject;
				Object result = caseLWCLocationSolidLine(lwcLocationSolidLine);
				if (result == null) result = caseLWCModelElement(lwcLocationSolidLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_LOCATION_DASH_LINE: {
				LWCLocationDashLine lwcLocationDashLine = (LWCLocationDashLine)theEObject;
				Object result = caseLWCLocationDashLine(lwcLocationDashLine);
				if (result == null) result = caseLWCModelElement(lwcLocationDashLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_END: {
				LWCSourceExhaustEnd lwcSourceExhaustEnd = (LWCSourceExhaustEnd)theEObject;
				Object result = caseLWCSourceExhaustEnd(lwcSourceExhaustEnd);
				if (result == null) result = caseLWCModelElement(lwcSourceExhaustEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCModelElement(LWCModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Heat Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Heat Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCHeatExchanger(LWCHeatExchanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCPipe(LWCPipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Source Exhaust Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Source Exhaust Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCSourceExhaustStart(LWCSourceExhaustStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Vessel Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Vessel Vertical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCVesselVertical(LWCVesselVertical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Vessel Horizontal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Vessel Horizontal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCVesselHorizontal(LWCVesselHorizontal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCValve(LWCValve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Valve Manuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Valve Manuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCValveManuel(LWCValveManuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Valve Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Valve Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCValveControl(LWCValveControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Pump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Pump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCPump(LWCPump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Pump Vacuum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Pump Vacuum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCPumpVacuum(LWCPumpVacuum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC System End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC System End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCSystemEnd(LWCSystemEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Joint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Joint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCJoint(LWCJoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Location No Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Location No Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCLocationNoLine(LWCLocationNoLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Location Solid Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Location Solid Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCLocationSolidLine(LWCLocationSolidLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Location Dash Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Location Dash Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCLocationDashLine(LWCLocationDashLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWC Source Exhaust End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWC Source Exhaust End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLWCSourceExhaustEnd(LWCSourceExhaustEnd object) {
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

} //LanguageWorkbenchCompetitionSwitch
