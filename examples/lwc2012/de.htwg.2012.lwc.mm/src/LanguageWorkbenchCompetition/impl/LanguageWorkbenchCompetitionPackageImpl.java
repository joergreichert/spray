<<<<<<< HEAD
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.impl;

import LanguageWorkbenchCompetition.LWCHeatExchanger;
import LanguageWorkbenchCompetition.LWCJoint;
import LanguageWorkbenchCompetition.LWCLocationDashLine;
import LanguageWorkbenchCompetition.LWCLocationNoLine;
import LanguageWorkbenchCompetition.LWCLocationSolidLine;
import LanguageWorkbenchCompetition.LWCModelElement;
import LanguageWorkbenchCompetition.LWCPipe;
import LanguageWorkbenchCompetition.LWCPump;
import LanguageWorkbenchCompetition.LWCPumpVacuum;
import LanguageWorkbenchCompetition.LWCSourceExhaustEnd;
import LanguageWorkbenchCompetition.LWCSourceExhaustStart;
import LanguageWorkbenchCompetition.LWCSystemEnd;
import LanguageWorkbenchCompetition.LWCValve;
import LanguageWorkbenchCompetition.LWCValveControl;
import LanguageWorkbenchCompetition.LWCValveManuel;
import LanguageWorkbenchCompetition.LWCVesselHorizontal;
import LanguageWorkbenchCompetition.LWCVesselVertical;
import LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionFactory;
import LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage;

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
public class LanguageWorkbenchCompetitionPackageImpl extends EPackageImpl implements LanguageWorkbenchCompetitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcHeatExchangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcSourceExhaustStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcVesselVerticalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcVesselHorizontalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcValveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcValveManuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcValveControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcPumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcPumpVacuumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcSystemEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcJointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcLocationNoLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcLocationSolidLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcLocationDashLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcSourceExhaustEndEClass = null;

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
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LanguageWorkbenchCompetitionPackageImpl() {
		super(eNS_URI, LanguageWorkbenchCompetitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LanguageWorkbenchCompetitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LanguageWorkbenchCompetitionPackage init() {
		if (isInited) return (LanguageWorkbenchCompetitionPackage)EPackage.Registry.INSTANCE.getEPackage(LanguageWorkbenchCompetitionPackage.eNS_URI);

		// Obtain or create and register package
		LanguageWorkbenchCompetitionPackageImpl theLanguageWorkbenchCompetitionPackage = (LanguageWorkbenchCompetitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LanguageWorkbenchCompetitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LanguageWorkbenchCompetitionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLanguageWorkbenchCompetitionPackage.createPackageContents();

		// Initialize created meta-data
		theLanguageWorkbenchCompetitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLanguageWorkbenchCompetitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LanguageWorkbenchCompetitionPackage.eNS_URI, theLanguageWorkbenchCompetitionPackage);
		return theLanguageWorkbenchCompetitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCModelElement() {
		return lwcModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCModelElement_Name() {
		return (EAttribute)lwcModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCModelElement_Description() {
		return (EAttribute)lwcModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCModelElement_ModelElements() {
		return (EReference)lwcModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCHeatExchanger() {
		return lwcHeatExchangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCPipe() {
		return lwcPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCPipe_FromElement() {
		return (EReference)lwcPipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCPipe_ToElement() {
		return (EReference)lwcPipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCSourceExhaustStart() {
		return lwcSourceExhaustStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustStart_FromElement() {
		return (EReference)lwcSourceExhaustStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustStart_ToElement() {
		return (EReference)lwcSourceExhaustStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCVesselVertical() {
		return lwcVesselVerticalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCVesselHorizontal() {
		return lwcVesselHorizontalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCValve() {
		return lwcValveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCValveManuel() {
		return lwcValveManuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCValveControl() {
		return lwcValveControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCPump() {
		return lwcPumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCPumpVacuum() {
		return lwcPumpVacuumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCSystemEnd() {
		return lwcSystemEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCJoint() {
		return lwcJointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCLocationNoLine() {
		return lwcLocationNoLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCLocationNoLine_Value() {
		return (EAttribute)lwcLocationNoLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCLocationSolidLine() {
		return lwcLocationSolidLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCLocationSolidLine_Value() {
		return (EAttribute)lwcLocationSolidLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCLocationDashLine() {
		return lwcLocationDashLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCLocationDashLine_Value() {
		return (EAttribute)lwcLocationDashLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCSourceExhaustEnd() {
		return lwcSourceExhaustEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustEnd_FromElement() {
		return (EReference)lwcSourceExhaustEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustEnd_ToElement() {
		return (EReference)lwcSourceExhaustEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionFactory getLanguageWorkbenchCompetitionFactory() {
		return (LanguageWorkbenchCompetitionFactory)getEFactoryInstance();
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
		lwcModelElementEClass = createEClass(LWC_MODEL_ELEMENT);
		createEAttribute(lwcModelElementEClass, LWC_MODEL_ELEMENT__NAME);
		createEAttribute(lwcModelElementEClass, LWC_MODEL_ELEMENT__DESCRIPTION);
		createEReference(lwcModelElementEClass, LWC_MODEL_ELEMENT__MODEL_ELEMENTS);

		lwcHeatExchangerEClass = createEClass(LWC_HEAT_EXCHANGER);

		lwcPipeEClass = createEClass(LWC_PIPE);
		createEReference(lwcPipeEClass, LWC_PIPE__FROM_ELEMENT);
		createEReference(lwcPipeEClass, LWC_PIPE__TO_ELEMENT);

		lwcSourceExhaustStartEClass = createEClass(LWC_SOURCE_EXHAUST_START);
		createEReference(lwcSourceExhaustStartEClass, LWC_SOURCE_EXHAUST_START__FROM_ELEMENT);
		createEReference(lwcSourceExhaustStartEClass, LWC_SOURCE_EXHAUST_START__TO_ELEMENT);

		lwcVesselVerticalEClass = createEClass(LWC_VESSEL_VERTICAL);

		lwcVesselHorizontalEClass = createEClass(LWC_VESSEL_HORIZONTAL);

		lwcValveEClass = createEClass(LWC_VALVE);

		lwcValveManuelEClass = createEClass(LWC_VALVE_MANUEL);

		lwcValveControlEClass = createEClass(LWC_VALVE_CONTROL);

		lwcPumpEClass = createEClass(LWC_PUMP);

		lwcPumpVacuumEClass = createEClass(LWC_PUMP_VACUUM);

		lwcSystemEndEClass = createEClass(LWC_SYSTEM_END);

		lwcJointEClass = createEClass(LWC_JOINT);

		lwcLocationNoLineEClass = createEClass(LWC_LOCATION_NO_LINE);
		createEAttribute(lwcLocationNoLineEClass, LWC_LOCATION_NO_LINE__VALUE);

		lwcLocationSolidLineEClass = createEClass(LWC_LOCATION_SOLID_LINE);
		createEAttribute(lwcLocationSolidLineEClass, LWC_LOCATION_SOLID_LINE__VALUE);

		lwcLocationDashLineEClass = createEClass(LWC_LOCATION_DASH_LINE);
		createEAttribute(lwcLocationDashLineEClass, LWC_LOCATION_DASH_LINE__VALUE);

		lwcSourceExhaustEndEClass = createEClass(LWC_SOURCE_EXHAUST_END);
		createEReference(lwcSourceExhaustEndEClass, LWC_SOURCE_EXHAUST_END__FROM_ELEMENT);
		createEReference(lwcSourceExhaustEndEClass, LWC_SOURCE_EXHAUST_END__TO_ELEMENT);
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
		lwcHeatExchangerEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcPipeEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcSourceExhaustStartEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcVesselVerticalEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcVesselHorizontalEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcValveEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcValveManuelEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcValveControlEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcPumpEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcPumpVacuumEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcSystemEndEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcJointEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcLocationNoLineEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcLocationSolidLineEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcLocationDashLineEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcSourceExhaustEndEClass.getESuperTypes().add(this.getLWCModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(lwcModelElementEClass, LWCModelElement.class, "LWCModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LWCModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLWCModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, LWCModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCModelElement_ModelElements(), this.getLWCModelElement(), null, "modelElements", null, 0, -1, LWCModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcHeatExchangerEClass, LWCHeatExchanger.class, "LWCHeatExchanger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcPipeEClass, LWCPipe.class, "LWCPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLWCPipe_FromElement(), this.getLWCModelElement(), null, "fromElement", null, 0, 1, LWCPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCPipe_ToElement(), this.getLWCModelElement(), null, "toElement", null, 0, 1, LWCPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcSourceExhaustStartEClass, LWCSourceExhaustStart.class, "LWCSourceExhaustStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLWCSourceExhaustStart_FromElement(), this.getLWCSystemEnd(), null, "fromElement", null, 0, 1, LWCSourceExhaustStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCSourceExhaustStart_ToElement(), this.getLWCModelElement(), null, "toElement", null, 0, 1, LWCSourceExhaustStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcVesselVerticalEClass, LWCVesselVertical.class, "LWCVesselVertical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcVesselHorizontalEClass, LWCVesselHorizontal.class, "LWCVesselHorizontal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcValveEClass, LWCValve.class, "LWCValve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcValveManuelEClass, LWCValveManuel.class, "LWCValveManuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcValveControlEClass, LWCValveControl.class, "LWCValveControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcPumpEClass, LWCPump.class, "LWCPump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcPumpVacuumEClass, LWCPumpVacuum.class, "LWCPumpVacuum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcSystemEndEClass, LWCSystemEnd.class, "LWCSystemEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcJointEClass, LWCJoint.class, "LWCJoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcLocationNoLineEClass, LWCLocationNoLine.class, "LWCLocationNoLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCLocationNoLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, LWCLocationNoLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcLocationSolidLineEClass, LWCLocationSolidLine.class, "LWCLocationSolidLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCLocationSolidLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, LWCLocationSolidLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcLocationDashLineEClass, LWCLocationDashLine.class, "LWCLocationDashLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCLocationDashLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, LWCLocationDashLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcSourceExhaustEndEClass, LWCSourceExhaustEnd.class, "LWCSourceExhaustEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLWCSourceExhaustEnd_FromElement(), this.getLWCModelElement(), null, "fromElement", null, 0, 1, LWCSourceExhaustEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCSourceExhaustEnd_ToElement(), this.getLWCSystemEnd(), null, "toElement", null, 0, 1, LWCSourceExhaustEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LanguageWorkbenchCompetitionPackageImpl
=======
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.impl;

import LanguageWorkbenchCompetition.LWCHeatExchanger;
import LanguageWorkbenchCompetition.LWCJoint;
import LanguageWorkbenchCompetition.LWCLocationDashLine;
import LanguageWorkbenchCompetition.LWCLocationNoLine;
import LanguageWorkbenchCompetition.LWCLocationSolidLine;
import LanguageWorkbenchCompetition.LWCModelElement;
import LanguageWorkbenchCompetition.LWCPipe;
import LanguageWorkbenchCompetition.LWCPump;
import LanguageWorkbenchCompetition.LWCPumpVacuum;
import LanguageWorkbenchCompetition.LWCSourceExhaustEnd;
import LanguageWorkbenchCompetition.LWCSourceExhaustStart;
import LanguageWorkbenchCompetition.LWCSystemEnd;
import LanguageWorkbenchCompetition.LWCValve;
import LanguageWorkbenchCompetition.LWCValveControl;
import LanguageWorkbenchCompetition.LWCValveManuel;
import LanguageWorkbenchCompetition.LWCVesselHorizontal;
import LanguageWorkbenchCompetition.LWCVesselVertical;
import LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionFactory;
import LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage;

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
public class LanguageWorkbenchCompetitionPackageImpl extends EPackageImpl implements LanguageWorkbenchCompetitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcHeatExchangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcSourceExhaustStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcVesselVerticalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcVesselHorizontalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcValveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcValveManuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcValveControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcPumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcPumpVacuumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcSystemEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcJointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcLocationNoLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcLocationSolidLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcLocationDashLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwcSourceExhaustEndEClass = null;

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
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LanguageWorkbenchCompetitionPackageImpl() {
		super(eNS_URI, LanguageWorkbenchCompetitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LanguageWorkbenchCompetitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LanguageWorkbenchCompetitionPackage init() {
		if (isInited) return (LanguageWorkbenchCompetitionPackage)EPackage.Registry.INSTANCE.getEPackage(LanguageWorkbenchCompetitionPackage.eNS_URI);

		// Obtain or create and register package
		LanguageWorkbenchCompetitionPackageImpl theLanguageWorkbenchCompetitionPackage = (LanguageWorkbenchCompetitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LanguageWorkbenchCompetitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LanguageWorkbenchCompetitionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLanguageWorkbenchCompetitionPackage.createPackageContents();

		// Initialize created meta-data
		theLanguageWorkbenchCompetitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLanguageWorkbenchCompetitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LanguageWorkbenchCompetitionPackage.eNS_URI, theLanguageWorkbenchCompetitionPackage);
		return theLanguageWorkbenchCompetitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCModelElement() {
		return lwcModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCModelElement_Name() {
		return (EAttribute)lwcModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCModelElement_Description() {
		return (EAttribute)lwcModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCModelElement_ModelElements() {
		return (EReference)lwcModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCHeatExchanger() {
		return lwcHeatExchangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCPipe() {
		return lwcPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCPipe_FromElement() {
		return (EReference)lwcPipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCPipe_ToElement() {
		return (EReference)lwcPipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCSourceExhaustStart() {
		return lwcSourceExhaustStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustStart_FromElement() {
		return (EReference)lwcSourceExhaustStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustStart_ToElement() {
		return (EReference)lwcSourceExhaustStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCVesselVertical() {
		return lwcVesselVerticalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCVesselHorizontal() {
		return lwcVesselHorizontalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCValve() {
		return lwcValveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCValveManuel() {
		return lwcValveManuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCValveControl() {
		return lwcValveControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCPump() {
		return lwcPumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCPumpVacuum() {
		return lwcPumpVacuumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCSystemEnd() {
		return lwcSystemEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCJoint() {
		return lwcJointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCLocationNoLine() {
		return lwcLocationNoLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCLocationNoLine_Value() {
		return (EAttribute)lwcLocationNoLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCLocationSolidLine() {
		return lwcLocationSolidLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCLocationSolidLine_Value() {
		return (EAttribute)lwcLocationSolidLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCLocationDashLine() {
		return lwcLocationDashLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLWCLocationDashLine_Value() {
		return (EAttribute)lwcLocationDashLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWCSourceExhaustEnd() {
		return lwcSourceExhaustEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustEnd_FromElement() {
		return (EReference)lwcSourceExhaustEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLWCSourceExhaustEnd_ToElement() {
		return (EReference)lwcSourceExhaustEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageWorkbenchCompetitionFactory getLanguageWorkbenchCompetitionFactory() {
		return (LanguageWorkbenchCompetitionFactory)getEFactoryInstance();
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
		lwcModelElementEClass = createEClass(LWC_MODEL_ELEMENT);
		createEAttribute(lwcModelElementEClass, LWC_MODEL_ELEMENT__NAME);
		createEAttribute(lwcModelElementEClass, LWC_MODEL_ELEMENT__DESCRIPTION);
		createEReference(lwcModelElementEClass, LWC_MODEL_ELEMENT__MODEL_ELEMENTS);

		lwcHeatExchangerEClass = createEClass(LWC_HEAT_EXCHANGER);

		lwcPipeEClass = createEClass(LWC_PIPE);
		createEReference(lwcPipeEClass, LWC_PIPE__FROM_ELEMENT);
		createEReference(lwcPipeEClass, LWC_PIPE__TO_ELEMENT);

		lwcSourceExhaustStartEClass = createEClass(LWC_SOURCE_EXHAUST_START);
		createEReference(lwcSourceExhaustStartEClass, LWC_SOURCE_EXHAUST_START__FROM_ELEMENT);
		createEReference(lwcSourceExhaustStartEClass, LWC_SOURCE_EXHAUST_START__TO_ELEMENT);

		lwcVesselVerticalEClass = createEClass(LWC_VESSEL_VERTICAL);

		lwcVesselHorizontalEClass = createEClass(LWC_VESSEL_HORIZONTAL);

		lwcValveEClass = createEClass(LWC_VALVE);

		lwcValveManuelEClass = createEClass(LWC_VALVE_MANUEL);

		lwcValveControlEClass = createEClass(LWC_VALVE_CONTROL);

		lwcPumpEClass = createEClass(LWC_PUMP);

		lwcPumpVacuumEClass = createEClass(LWC_PUMP_VACUUM);

		lwcSystemEndEClass = createEClass(LWC_SYSTEM_END);

		lwcJointEClass = createEClass(LWC_JOINT);

		lwcLocationNoLineEClass = createEClass(LWC_LOCATION_NO_LINE);
		createEAttribute(lwcLocationNoLineEClass, LWC_LOCATION_NO_LINE__VALUE);

		lwcLocationSolidLineEClass = createEClass(LWC_LOCATION_SOLID_LINE);
		createEAttribute(lwcLocationSolidLineEClass, LWC_LOCATION_SOLID_LINE__VALUE);

		lwcLocationDashLineEClass = createEClass(LWC_LOCATION_DASH_LINE);
		createEAttribute(lwcLocationDashLineEClass, LWC_LOCATION_DASH_LINE__VALUE);

		lwcSourceExhaustEndEClass = createEClass(LWC_SOURCE_EXHAUST_END);
		createEReference(lwcSourceExhaustEndEClass, LWC_SOURCE_EXHAUST_END__FROM_ELEMENT);
		createEReference(lwcSourceExhaustEndEClass, LWC_SOURCE_EXHAUST_END__TO_ELEMENT);
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
		lwcHeatExchangerEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcPipeEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcSourceExhaustStartEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcVesselVerticalEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcVesselHorizontalEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcValveEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcValveManuelEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcValveControlEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcPumpEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcPumpVacuumEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcSystemEndEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcJointEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcLocationNoLineEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcLocationSolidLineEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcLocationDashLineEClass.getESuperTypes().add(this.getLWCModelElement());
		lwcSourceExhaustEndEClass.getESuperTypes().add(this.getLWCModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(lwcModelElementEClass, LWCModelElement.class, "LWCModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LWCModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLWCModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, LWCModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCModelElement_ModelElements(), this.getLWCModelElement(), null, "modelElements", null, 0, -1, LWCModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcHeatExchangerEClass, LWCHeatExchanger.class, "LWCHeatExchanger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcPipeEClass, LWCPipe.class, "LWCPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLWCPipe_FromElement(), this.getLWCModelElement(), null, "fromElement", null, 0, 1, LWCPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCPipe_ToElement(), this.getLWCModelElement(), null, "toElement", null, 0, 1, LWCPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcSourceExhaustStartEClass, LWCSourceExhaustStart.class, "LWCSourceExhaustStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLWCSourceExhaustStart_FromElement(), this.getLWCSystemEnd(), null, "fromElement", null, 0, 1, LWCSourceExhaustStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCSourceExhaustStart_ToElement(), this.getLWCModelElement(), null, "toElement", null, 0, 1, LWCSourceExhaustStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcVesselVerticalEClass, LWCVesselVertical.class, "LWCVesselVertical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcVesselHorizontalEClass, LWCVesselHorizontal.class, "LWCVesselHorizontal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcValveEClass, LWCValve.class, "LWCValve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcValveManuelEClass, LWCValveManuel.class, "LWCValveManuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcValveControlEClass, LWCValveControl.class, "LWCValveControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcPumpEClass, LWCPump.class, "LWCPump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcPumpVacuumEClass, LWCPumpVacuum.class, "LWCPumpVacuum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcSystemEndEClass, LWCSystemEnd.class, "LWCSystemEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcJointEClass, LWCJoint.class, "LWCJoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwcLocationNoLineEClass, LWCLocationNoLine.class, "LWCLocationNoLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCLocationNoLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, LWCLocationNoLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcLocationSolidLineEClass, LWCLocationSolidLine.class, "LWCLocationSolidLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCLocationSolidLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, LWCLocationSolidLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcLocationDashLineEClass, LWCLocationDashLine.class, "LWCLocationDashLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLWCLocationDashLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, LWCLocationDashLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lwcSourceExhaustEndEClass, LWCSourceExhaustEnd.class, "LWCSourceExhaustEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLWCSourceExhaustEnd_FromElement(), this.getLWCModelElement(), null, "fromElement", null, 0, 1, LWCSourceExhaustEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLWCSourceExhaustEnd_ToElement(), this.getLWCSystemEnd(), null, "toElement", null, 0, 1, LWCSourceExhaustEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LanguageWorkbenchCompetitionPackageImpl
>>>>>>> eclipse_juno
