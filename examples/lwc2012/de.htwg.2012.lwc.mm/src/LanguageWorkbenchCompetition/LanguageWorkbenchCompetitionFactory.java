/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage
 * @generated
 */
public interface LanguageWorkbenchCompetitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguageWorkbenchCompetitionFactory eINSTANCE = LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LWC Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Model Element</em>'.
	 * @generated
	 */
	LWCModelElement createLWCModelElement();

	/**
	 * Returns a new object of class '<em>LWC Heat Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Heat Exchanger</em>'.
	 * @generated
	 */
	LWCHeatExchanger createLWCHeatExchanger();

	/**
	 * Returns a new object of class '<em>LWC Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Pipe</em>'.
	 * @generated
	 */
	LWCPipe createLWCPipe();

	/**
	 * Returns a new object of class '<em>LWC Source Exhaust Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Source Exhaust Start</em>'.
	 * @generated
	 */
	LWCSourceExhaustStart createLWCSourceExhaustStart();

	/**
	 * Returns a new object of class '<em>LWC Vessel Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Vessel Vertical</em>'.
	 * @generated
	 */
	LWCVesselVertical createLWCVesselVertical();

	/**
	 * Returns a new object of class '<em>LWC Vessel Horizontal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Vessel Horizontal</em>'.
	 * @generated
	 */
	LWCVesselHorizontal createLWCVesselHorizontal();

	/**
	 * Returns a new object of class '<em>LWC Valve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Valve</em>'.
	 * @generated
	 */
	LWCValve createLWCValve();

	/**
	 * Returns a new object of class '<em>LWC Valve Manuel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Valve Manuel</em>'.
	 * @generated
	 */
	LWCValveManuel createLWCValveManuel();

	/**
	 * Returns a new object of class '<em>LWC Valve Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Valve Control</em>'.
	 * @generated
	 */
	LWCValveControl createLWCValveControl();

	/**
	 * Returns a new object of class '<em>LWC Pump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Pump</em>'.
	 * @generated
	 */
	LWCPump createLWCPump();

	/**
	 * Returns a new object of class '<em>LWC Pump Vacuum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Pump Vacuum</em>'.
	 * @generated
	 */
	LWCPumpVacuum createLWCPumpVacuum();

	/**
	 * Returns a new object of class '<em>LWC System End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC System End</em>'.
	 * @generated
	 */
	LWCSystemEnd createLWCSystemEnd();

	/**
	 * Returns a new object of class '<em>LWC Joint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Joint</em>'.
	 * @generated
	 */
	LWCJoint createLWCJoint();

	/**
	 * Returns a new object of class '<em>LWC Location No Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Location No Line</em>'.
	 * @generated
	 */
	LWCLocationNoLine createLWCLocationNoLine();

	/**
	 * Returns a new object of class '<em>LWC Location Solid Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Location Solid Line</em>'.
	 * @generated
	 */
	LWCLocationSolidLine createLWCLocationSolidLine();

	/**
	 * Returns a new object of class '<em>LWC Location Dash Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Location Dash Line</em>'.
	 * @generated
	 */
	LWCLocationDashLine createLWCLocationDashLine();

	/**
	 * Returns a new object of class '<em>LWC Source Exhaust End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LWC Source Exhaust End</em>'.
	 * @generated
	 */
	LWCSourceExhaustEnd createLWCSourceExhaustEnd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LanguageWorkbenchCompetitionPackage getLanguageWorkbenchCompetitionPackage();

} //LanguageWorkbenchCompetitionFactory
