/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionFactory
 * @model kind="package"
 * @generated
 */
public interface LanguageWorkbenchCompetitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LanguageWorkbenchCompetition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.htwg.2012.lwc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lwc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguageWorkbenchCompetitionPackage eINSTANCE = LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCModelElementImpl <em>LWC Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCModelElementImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCModelElement()
	 * @generated
	 */
	int LWC_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_MODEL_ELEMENT__MODEL_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>LWC Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCHeatExchangerImpl <em>LWC Heat Exchanger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCHeatExchangerImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCHeatExchanger()
	 * @generated
	 */
	int LWC_HEAT_EXCHANGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_HEAT_EXCHANGER__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_HEAT_EXCHANGER__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_HEAT_EXCHANGER__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Heat Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_HEAT_EXCHANGER_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCPipeImpl <em>LWC Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCPipeImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCPipe()
	 * @generated
	 */
	int LWC_PIPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PIPE__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PIPE__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PIPE__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PIPE__FROM_ELEMENT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PIPE__TO_ELEMENT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LWC Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PIPE_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCSourceExhaustStartImpl <em>LWC Source Exhaust Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCSourceExhaustStartImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCSourceExhaustStart()
	 * @generated
	 */
	int LWC_SOURCE_EXHAUST_START = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_START__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_START__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_START__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_START__FROM_ELEMENT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_START__TO_ELEMENT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LWC Source Exhaust Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_START_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCVesselVerticalImpl <em>LWC Vessel Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCVesselVerticalImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCVesselVertical()
	 * @generated
	 */
	int LWC_VESSEL_VERTICAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_VERTICAL__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_VERTICAL__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_VERTICAL__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Vessel Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_VERTICAL_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCVesselHorizontalImpl <em>LWC Vessel Horizontal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCVesselHorizontalImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCVesselHorizontal()
	 * @generated
	 */
	int LWC_VESSEL_HORIZONTAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_HORIZONTAL__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_HORIZONTAL__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_HORIZONTAL__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Vessel Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VESSEL_HORIZONTAL_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCValveImpl <em>LWC Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCValveImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCValve()
	 * @generated
	 */
	int LWC_VALVE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCValveManuelImpl <em>LWC Valve Manuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCValveManuelImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCValveManuel()
	 * @generated
	 */
	int LWC_VALVE_MANUEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_MANUEL__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_MANUEL__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_MANUEL__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Valve Manuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_MANUEL_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCValveControlImpl <em>LWC Valve Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCValveControlImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCValveControl()
	 * @generated
	 */
	int LWC_VALVE_CONTROL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_CONTROL__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_CONTROL__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_CONTROL__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Valve Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_VALVE_CONTROL_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCPumpImpl <em>LWC Pump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCPumpImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCPump()
	 * @generated
	 */
	int LWC_PUMP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Pump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCPumpVacuumImpl <em>LWC Pump Vacuum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCPumpVacuumImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCPumpVacuum()
	 * @generated
	 */
	int LWC_PUMP_VACUUM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP_VACUUM__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP_VACUUM__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP_VACUUM__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Pump Vacuum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_PUMP_VACUUM_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCSystemEndImpl <em>LWC System End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCSystemEndImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCSystemEnd()
	 * @generated
	 */
	int LWC_SYSTEM_END = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SYSTEM_END__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SYSTEM_END__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SYSTEM_END__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC System End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SYSTEM_END_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCJointImpl <em>LWC Joint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCJointImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCJoint()
	 * @generated
	 */
	int LWC_JOINT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_JOINT__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_JOINT__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_JOINT__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>LWC Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_JOINT_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCLocationNoLineImpl <em>LWC Location No Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCLocationNoLineImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCLocationNoLine()
	 * @generated
	 */
	int LWC_LOCATION_NO_LINE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_NO_LINE__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_NO_LINE__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_NO_LINE__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_NO_LINE__VALUE = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LWC Location No Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_NO_LINE_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCLocationSolidLineImpl <em>LWC Location Solid Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCLocationSolidLineImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCLocationSolidLine()
	 * @generated
	 */
	int LWC_LOCATION_SOLID_LINE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_SOLID_LINE__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_SOLID_LINE__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_SOLID_LINE__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_SOLID_LINE__VALUE = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LWC Location Solid Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_SOLID_LINE_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCLocationDashLineImpl <em>LWC Location Dash Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCLocationDashLineImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCLocationDashLine()
	 * @generated
	 */
	int LWC_LOCATION_DASH_LINE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_DASH_LINE__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_DASH_LINE__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_DASH_LINE__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_DASH_LINE__VALUE = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LWC Location Dash Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_LOCATION_DASH_LINE_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LanguageWorkbenchCompetition.impl.LWCSourceExhaustEndImpl <em>LWC Source Exhaust End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LanguageWorkbenchCompetition.impl.LWCSourceExhaustEndImpl
	 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCSourceExhaustEnd()
	 * @generated
	 */
	int LWC_SOURCE_EXHAUST_END = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_END__NAME = LWC_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_END__DESCRIPTION = LWC_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_END__MODEL_ELEMENTS = LWC_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_END__FROM_ELEMENT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_END__TO_ELEMENT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LWC Source Exhaust End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWC_SOURCE_EXHAUST_END_FEATURE_COUNT = LWC_MODEL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCModelElement <em>LWC Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Model Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCModelElement
	 * @generated
	 */
	EClass getLWCModelElement();

	/**
	 * Returns the meta object for the attribute '{@link LanguageWorkbenchCompetition.LWCModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LanguageWorkbenchCompetition.LWCModelElement#getName()
	 * @see #getLWCModelElement()
	 * @generated
	 */
	EAttribute getLWCModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link LanguageWorkbenchCompetition.LWCModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see LanguageWorkbenchCompetition.LWCModelElement#getDescription()
	 * @see #getLWCModelElement()
	 * @generated
	 */
	EAttribute getLWCModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link LanguageWorkbenchCompetition.LWCModelElement#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see LanguageWorkbenchCompetition.LWCModelElement#getModelElements()
	 * @see #getLWCModelElement()
	 * @generated
	 */
	EReference getLWCModelElement_ModelElements();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCHeatExchanger <em>LWC Heat Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Heat Exchanger</em>'.
	 * @see LanguageWorkbenchCompetition.LWCHeatExchanger
	 * @generated
	 */
	EClass getLWCHeatExchanger();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCPipe <em>LWC Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Pipe</em>'.
	 * @see LanguageWorkbenchCompetition.LWCPipe
	 * @generated
	 */
	EClass getLWCPipe();

	/**
	 * Returns the meta object for the reference '{@link LanguageWorkbenchCompetition.LWCPipe#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCPipe#getFromElement()
	 * @see #getLWCPipe()
	 * @generated
	 */
	EReference getLWCPipe_FromElement();

	/**
	 * Returns the meta object for the reference '{@link LanguageWorkbenchCompetition.LWCPipe#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCPipe#getToElement()
	 * @see #getLWCPipe()
	 * @generated
	 */
	EReference getLWCPipe_ToElement();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart <em>LWC Source Exhaust Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Source Exhaust Start</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustStart
	 * @generated
	 */
	EClass getLWCSourceExhaustStart();

	/**
	 * Returns the meta object for the reference '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustStart#getFromElement()
	 * @see #getLWCSourceExhaustStart()
	 * @generated
	 */
	EReference getLWCSourceExhaustStart_FromElement();

	/**
	 * Returns the meta object for the reference '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustStart#getToElement()
	 * @see #getLWCSourceExhaustStart()
	 * @generated
	 */
	EReference getLWCSourceExhaustStart_ToElement();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCVesselVertical <em>LWC Vessel Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Vessel Vertical</em>'.
	 * @see LanguageWorkbenchCompetition.LWCVesselVertical
	 * @generated
	 */
	EClass getLWCVesselVertical();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCVesselHorizontal <em>LWC Vessel Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Vessel Horizontal</em>'.
	 * @see LanguageWorkbenchCompetition.LWCVesselHorizontal
	 * @generated
	 */
	EClass getLWCVesselHorizontal();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCValve <em>LWC Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Valve</em>'.
	 * @see LanguageWorkbenchCompetition.LWCValve
	 * @generated
	 */
	EClass getLWCValve();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCValveManuel <em>LWC Valve Manuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Valve Manuel</em>'.
	 * @see LanguageWorkbenchCompetition.LWCValveManuel
	 * @generated
	 */
	EClass getLWCValveManuel();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCValveControl <em>LWC Valve Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Valve Control</em>'.
	 * @see LanguageWorkbenchCompetition.LWCValveControl
	 * @generated
	 */
	EClass getLWCValveControl();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCPump <em>LWC Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Pump</em>'.
	 * @see LanguageWorkbenchCompetition.LWCPump
	 * @generated
	 */
	EClass getLWCPump();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCPumpVacuum <em>LWC Pump Vacuum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Pump Vacuum</em>'.
	 * @see LanguageWorkbenchCompetition.LWCPumpVacuum
	 * @generated
	 */
	EClass getLWCPumpVacuum();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCSystemEnd <em>LWC System End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC System End</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSystemEnd
	 * @generated
	 */
	EClass getLWCSystemEnd();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCJoint <em>LWC Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Joint</em>'.
	 * @see LanguageWorkbenchCompetition.LWCJoint
	 * @generated
	 */
	EClass getLWCJoint();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCLocationNoLine <em>LWC Location No Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Location No Line</em>'.
	 * @see LanguageWorkbenchCompetition.LWCLocationNoLine
	 * @generated
	 */
	EClass getLWCLocationNoLine();

	/**
	 * Returns the meta object for the attribute '{@link LanguageWorkbenchCompetition.LWCLocationNoLine#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see LanguageWorkbenchCompetition.LWCLocationNoLine#getValue()
	 * @see #getLWCLocationNoLine()
	 * @generated
	 */
	EAttribute getLWCLocationNoLine_Value();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCLocationSolidLine <em>LWC Location Solid Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Location Solid Line</em>'.
	 * @see LanguageWorkbenchCompetition.LWCLocationSolidLine
	 * @generated
	 */
	EClass getLWCLocationSolidLine();

	/**
	 * Returns the meta object for the attribute '{@link LanguageWorkbenchCompetition.LWCLocationSolidLine#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see LanguageWorkbenchCompetition.LWCLocationSolidLine#getValue()
	 * @see #getLWCLocationSolidLine()
	 * @generated
	 */
	EAttribute getLWCLocationSolidLine_Value();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCLocationDashLine <em>LWC Location Dash Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Location Dash Line</em>'.
	 * @see LanguageWorkbenchCompetition.LWCLocationDashLine
	 * @generated
	 */
	EClass getLWCLocationDashLine();

	/**
	 * Returns the meta object for the attribute '{@link LanguageWorkbenchCompetition.LWCLocationDashLine#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see LanguageWorkbenchCompetition.LWCLocationDashLine#getValue()
	 * @see #getLWCLocationDashLine()
	 * @generated
	 */
	EAttribute getLWCLocationDashLine_Value();

	/**
	 * Returns the meta object for class '{@link LanguageWorkbenchCompetition.LWCSourceExhaustEnd <em>LWC Source Exhaust End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWC Source Exhaust End</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustEnd
	 * @generated
	 */
	EClass getLWCSourceExhaustEnd();

	/**
	 * Returns the meta object for the reference '{@link LanguageWorkbenchCompetition.LWCSourceExhaustEnd#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustEnd#getFromElement()
	 * @see #getLWCSourceExhaustEnd()
	 * @generated
	 */
	EReference getLWCSourceExhaustEnd_FromElement();

	/**
	 * Returns the meta object for the reference '{@link LanguageWorkbenchCompetition.LWCSourceExhaustEnd#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see LanguageWorkbenchCompetition.LWCSourceExhaustEnd#getToElement()
	 * @see #getLWCSourceExhaustEnd()
	 * @generated
	 */
	EReference getLWCSourceExhaustEnd_ToElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LanguageWorkbenchCompetitionFactory getLanguageWorkbenchCompetitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCModelElementImpl <em>LWC Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCModelElementImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCModelElement()
		 * @generated
		 */
		EClass LWC_MODEL_ELEMENT = eINSTANCE.getLWCModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LWC_MODEL_ELEMENT__NAME = eINSTANCE.getLWCModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LWC_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getLWCModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_MODEL_ELEMENT__MODEL_ELEMENTS = eINSTANCE.getLWCModelElement_ModelElements();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCHeatExchangerImpl <em>LWC Heat Exchanger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCHeatExchangerImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCHeatExchanger()
		 * @generated
		 */
		EClass LWC_HEAT_EXCHANGER = eINSTANCE.getLWCHeatExchanger();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCPipeImpl <em>LWC Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCPipeImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCPipe()
		 * @generated
		 */
		EClass LWC_PIPE = eINSTANCE.getLWCPipe();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_PIPE__FROM_ELEMENT = eINSTANCE.getLWCPipe_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_PIPE__TO_ELEMENT = eINSTANCE.getLWCPipe_ToElement();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCSourceExhaustStartImpl <em>LWC Source Exhaust Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCSourceExhaustStartImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCSourceExhaustStart()
		 * @generated
		 */
		EClass LWC_SOURCE_EXHAUST_START = eINSTANCE.getLWCSourceExhaustStart();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_SOURCE_EXHAUST_START__FROM_ELEMENT = eINSTANCE.getLWCSourceExhaustStart_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_SOURCE_EXHAUST_START__TO_ELEMENT = eINSTANCE.getLWCSourceExhaustStart_ToElement();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCVesselVerticalImpl <em>LWC Vessel Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCVesselVerticalImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCVesselVertical()
		 * @generated
		 */
		EClass LWC_VESSEL_VERTICAL = eINSTANCE.getLWCVesselVertical();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCVesselHorizontalImpl <em>LWC Vessel Horizontal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCVesselHorizontalImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCVesselHorizontal()
		 * @generated
		 */
		EClass LWC_VESSEL_HORIZONTAL = eINSTANCE.getLWCVesselHorizontal();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCValveImpl <em>LWC Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCValveImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCValve()
		 * @generated
		 */
		EClass LWC_VALVE = eINSTANCE.getLWCValve();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCValveManuelImpl <em>LWC Valve Manuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCValveManuelImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCValveManuel()
		 * @generated
		 */
		EClass LWC_VALVE_MANUEL = eINSTANCE.getLWCValveManuel();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCValveControlImpl <em>LWC Valve Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCValveControlImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCValveControl()
		 * @generated
		 */
		EClass LWC_VALVE_CONTROL = eINSTANCE.getLWCValveControl();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCPumpImpl <em>LWC Pump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCPumpImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCPump()
		 * @generated
		 */
		EClass LWC_PUMP = eINSTANCE.getLWCPump();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCPumpVacuumImpl <em>LWC Pump Vacuum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCPumpVacuumImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCPumpVacuum()
		 * @generated
		 */
		EClass LWC_PUMP_VACUUM = eINSTANCE.getLWCPumpVacuum();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCSystemEndImpl <em>LWC System End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCSystemEndImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCSystemEnd()
		 * @generated
		 */
		EClass LWC_SYSTEM_END = eINSTANCE.getLWCSystemEnd();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCJointImpl <em>LWC Joint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCJointImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCJoint()
		 * @generated
		 */
		EClass LWC_JOINT = eINSTANCE.getLWCJoint();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCLocationNoLineImpl <em>LWC Location No Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCLocationNoLineImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCLocationNoLine()
		 * @generated
		 */
		EClass LWC_LOCATION_NO_LINE = eINSTANCE.getLWCLocationNoLine();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LWC_LOCATION_NO_LINE__VALUE = eINSTANCE.getLWCLocationNoLine_Value();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCLocationSolidLineImpl <em>LWC Location Solid Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCLocationSolidLineImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCLocationSolidLine()
		 * @generated
		 */
		EClass LWC_LOCATION_SOLID_LINE = eINSTANCE.getLWCLocationSolidLine();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LWC_LOCATION_SOLID_LINE__VALUE = eINSTANCE.getLWCLocationSolidLine_Value();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCLocationDashLineImpl <em>LWC Location Dash Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCLocationDashLineImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCLocationDashLine()
		 * @generated
		 */
		EClass LWC_LOCATION_DASH_LINE = eINSTANCE.getLWCLocationDashLine();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LWC_LOCATION_DASH_LINE__VALUE = eINSTANCE.getLWCLocationDashLine_Value();

		/**
		 * The meta object literal for the '{@link LanguageWorkbenchCompetition.impl.LWCSourceExhaustEndImpl <em>LWC Source Exhaust End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LanguageWorkbenchCompetition.impl.LWCSourceExhaustEndImpl
		 * @see LanguageWorkbenchCompetition.impl.LanguageWorkbenchCompetitionPackageImpl#getLWCSourceExhaustEnd()
		 * @generated
		 */
		EClass LWC_SOURCE_EXHAUST_END = eINSTANCE.getLWCSourceExhaustEnd();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_SOURCE_EXHAUST_END__FROM_ELEMENT = eINSTANCE.getLWCSourceExhaustEnd_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LWC_SOURCE_EXHAUST_END__TO_ELEMENT = eINSTANCE.getLWCSourceExhaustEnd_ToElement();

	}

} //LanguageWorkbenchCompetitionPackage
