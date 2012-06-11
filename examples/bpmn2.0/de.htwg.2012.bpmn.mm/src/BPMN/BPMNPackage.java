/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN;

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
 * @see BPMN.BPMNFactory
 * @model kind="package"
 * @generated
 */
public interface BPMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BPMN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.htwg.2012.bpmn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMNPackage eINSTANCE = BPMN.impl.BPMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNModelElementImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNModelElement()
	 * @generated
	 */
	int BPMN_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_MODEL_ELEMENT__MODEL_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventStartDefaultImpl <em>Event Start Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventStartDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventStartDefault()
	 * @generated
	 */
	int BPMN_EVENT_START_DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_START_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_START_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_START_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Start Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_START_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEndDefaultImpl <em>Event End Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEndDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEndDefault()
	 * @generated
	 */
	int BPMN_EVENT_END_DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event End Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEndUsedImpl <em>Event End Used</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEndUsedImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEndUsed()
	 * @generated
	 */
	int BPMN_EVENT_END_USED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_USED__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_USED__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_USED__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event End Used</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_END_USED_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMailImpl <em>Event Mail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMailImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMail()
	 * @generated
	 */
	int BPMN_EVENT_MAIL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMailDashImpl <em>Event Mail Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMailDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailDash()
	 * @generated
	 */
	int BPMN_EVENT_MAIL_DASH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Mail Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMailDoubleImpl <em>Event Mail Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMailDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailDouble()
	 * @generated
	 */
	int BPMN_EVENT_MAIL_DOUBLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Mail Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMailDoubleDashImpl <em>Event Mail Double Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMailDoubleDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailDoubleDash()
	 * @generated
	 */
	int BPMN_EVENT_MAIL_DOUBLE_DASH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Mail Double Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_DOUBLE_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMailInvertDoubleImpl <em>Event Mail Invert Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMailInvertDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailInvertDouble()
	 * @generated
	 */
	int BPMN_EVENT_MAIL_INVERT_DOUBLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Mail Invert Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMailInvertBoldImpl <em>Event Mail Invert Bold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMailInvertBoldImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailInvertBold()
	 * @generated
	 */
	int BPMN_EVENT_MAIL_INVERT_BOLD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_BOLD__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_BOLD__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_BOLD__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Mail Invert Bold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MAIL_INVERT_BOLD_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventTimerDefaultImpl <em>Event Timer Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventTimerDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDefault()
	 * @generated
	 */
	int BPMN_EVENT_TIMER_DEFAULT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Timer Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventTimerDashImpl <em>Event Timer Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventTimerDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDash()
	 * @generated
	 */
	int BPMN_EVENT_TIMER_DASH = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Timer Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventTimerDoubleImpl <em>Event Timer Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventTimerDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDouble()
	 * @generated
	 */
	int BPMN_EVENT_TIMER_DOUBLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Timer Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventTimerDoubleDashImpl <em>Event Timer Double Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventTimerDoubleDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDoubleDash()
	 * @generated
	 */
	int BPMN_EVENT_TIMER_DOUBLE_DASH = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Timer Double Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TIMER_DOUBLE_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEskalationStartImpl <em>Event Eskalation Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEskalationStartImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationStart()
	 * @generated
	 */
	int BPMN_EVENT_ESKALATION_START = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_START__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_START__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_START__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Eskalation Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_START_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEskalationDashImpl <em>Event Eskalation Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEskalationDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDash()
	 * @generated
	 */
	int BPMN_EVENT_ESKALATION_DASH = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Eskalation Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEskalationDoubleImpl <em>Event Eskalation Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEskalationDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDouble()
	 * @generated
	 */
	int BPMN_EVENT_ESKALATION_DOUBLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Eskalation Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEskalationDoubelDashImpl <em>Event Eskalation Doubel Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEskalationDoubelDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDoubelDash()
	 * @generated
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_DASH = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Eskalation Doubel Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEskalationDoubelInvertImpl <em>Event Eskalation Doubel Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEskalationDoubelInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDoubelInvert()
	 * @generated
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_INVERT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Eskalation Doubel Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_DOUBEL_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventEskalationBoldInvertImpl <em>Event Eskalation Bold Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventEskalationBoldInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationBoldInvert()
	 * @generated
	 */
	int BPMN_EVENT_ESKALATION_BOLD_INVERT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_BOLD_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_BOLD_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_BOLD_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Eskalation Bold Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ESKALATION_BOLD_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventIfDefaultImpl <em>Event If Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventIfDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDefault()
	 * @generated
	 */
	int BPMN_EVENT_IF_DEFAULT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event If Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventIfDashImpl <em>Event If Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventIfDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDash()
	 * @generated
	 */
	int BPMN_EVENT_IF_DASH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event If Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventIfDoubleImpl <em>Event If Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventIfDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDouble()
	 * @generated
	 */
	int BPMN_EVENT_IF_DOUBLE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event If Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventIfDoubleDashImpl <em>Event If Double Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventIfDoubleDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDoubleDash()
	 * @generated
	 */
	int BPMN_EVENT_IF_DOUBLE_DASH = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event If Double Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_IF_DOUBLE_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventLinkEnteredImpl <em>Event Link Entered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventLinkEnteredImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventLinkEntered()
	 * @generated
	 */
	int BPMN_EVENT_LINK_ENTERED = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_ENTERED__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_ENTERED__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_ENTERED__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Link Entered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_ENTERED_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventLinkTriggerdImpl <em>Event Link Triggerd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventLinkTriggerdImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventLinkTriggerd()
	 * @generated
	 */
	int BPMN_EVENT_LINK_TRIGGERD = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_TRIGGERD__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_TRIGGERD__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_TRIGGERD__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Link Triggerd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_LINK_TRIGGERD_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventErrorDefaultImpl <em>Event Error Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventErrorDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventErrorDefault()
	 * @generated
	 */
	int BPMN_EVENT_ERROR_DEFAULT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Error Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventErrorDoubleImpl <em>Event Error Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventErrorDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventErrorDouble()
	 * @generated
	 */
	int BPMN_EVENT_ERROR_DOUBLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Error Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventErrorBoldInvertImpl <em>Event Error Bold Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventErrorBoldInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventErrorBoldInvert()
	 * @generated
	 */
	int BPMN_EVENT_ERROR_BOLD_INVERT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_BOLD_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_BOLD_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_BOLD_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Error Bold Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_ERROR_BOLD_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventCancelDoubleImpl <em>Event Cancel Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventCancelDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCancelDouble()
	 * @generated
	 */
	int BPMN_EVENT_CANCEL_DOUBLE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Cancel Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventCancelBoldInvertImpl <em>Event Cancel Bold Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventCancelBoldInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCancelBoldInvert()
	 * @generated
	 */
	int BPMN_EVENT_CANCEL_BOLD_INVERT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_BOLD_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_BOLD_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_BOLD_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Cancel Bold Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_CANCEL_BOLD_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventCompensationDefaultImpl <em>Event Compensation Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventCompensationDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationDefault()
	 * @generated
	 */
	int BPMN_EVENT_COMPENSATION_DEFAULT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Compensation Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventCompensationDoubleImpl <em>Event Compensation Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventCompensationDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationDouble()
	 * @generated
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Compensation Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventCompensationDoubleInvertImpl <em>Event Compensation Double Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventCompensationDoubleInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationDoubleInvert()
	 * @generated
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE_INVERT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Compensation Double Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_DOUBLE_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventCompensationBoldInvertImpl <em>Event Compensation Bold Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventCompensationBoldInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationBoldInvert()
	 * @generated
	 */
	int BPMN_EVENT_COMPENSATION_BOLD_INVERT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_BOLD_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_BOLD_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_BOLD_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Compensation Bold Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_COMPENSATION_BOLD_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventSignalDefaultImpl <em>Event Signal Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventSignalDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDefault()
	 * @generated
	 */
	int BPMN_EVENT_SIGNAL_DEFAULT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Signal Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventSignalDashImpl <em>Event Signal Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventSignalDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDash()
	 * @generated
	 */
	int BPMN_EVENT_SIGNAL_DASH = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Signal Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventSignalDoubleImpl <em>Event Signal Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventSignalDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDouble()
	 * @generated
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Signal Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventSignalDoubleDashImpl <em>Event Signal Double Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventSignalDoubleDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDoubleDash()
	 * @generated
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_DASH = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Signal Double Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventSignalDoubleInvertImpl <em>Event Signal Double Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventSignalDoubleInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDoubleInvert()
	 * @generated
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_INVERT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Signal Double Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_DOUBLE_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventSignalBoldInvertImpl <em>Event Signal Bold Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventSignalBoldInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalBoldInvert()
	 * @generated
	 */
	int BPMN_EVENT_SIGNAL_BOLD_INVERT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_BOLD_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_BOLD_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_BOLD_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Signal Bold Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_SIGNAL_BOLD_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMultiDefaultImpl <em>Event Multi Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMultiDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDefault()
	 * @generated
	 */
	int BPMN_EVENT_MULTI_DEFAULT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Multi Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMultiDashImpl <em>Event Multi Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMultiDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDash()
	 * @generated
	 */
	int BPMN_EVENT_MULTI_DASH = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Multi Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMultiDoubleImpl <em>Event Multi Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMultiDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDouble()
	 * @generated
	 */
	int BPMN_EVENT_MULTI_DOUBLE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Multi Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMultiDoubleDashImpl <em>Event Multi Double Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMultiDoubleDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDoubleDash()
	 * @generated
	 */
	int BPMN_EVENT_MULTI_DOUBLE_DASH = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Multi Double Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMultiDoubleInvertImpl <em>Event Multi Double Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMultiDoubleInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDoubleInvert()
	 * @generated
	 */
	int BPMN_EVENT_MULTI_DOUBLE_INVERT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Multi Double Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_DOUBLE_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventMultiBoldInvertImpl <em>Event Multi Bold Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventMultiBoldInvertImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiBoldInvert()
	 * @generated
	 */
	int BPMN_EVENT_MULTI_BOLD_INVERT = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_BOLD_INVERT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_BOLD_INVERT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_BOLD_INVERT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Multi Bold Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_MULTI_BOLD_INVERT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventParallelDefaultImpl <em>Event Parallel Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventParallelDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDefault()
	 * @generated
	 */
	int BPMN_EVENT_PARALLEL_DEFAULT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Parallel Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventParallelDashImpl <em>Event Parallel Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventParallelDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDash()
	 * @generated
	 */
	int BPMN_EVENT_PARALLEL_DASH = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Parallel Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventParallelDoubleImpl <em>Event Parallel Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventParallelDoubleImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDouble()
	 * @generated
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Parallel Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventParallelDoubleDashImpl <em>Event Parallel Double Dash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventParallelDoubleDashImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDoubleDash()
	 * @generated
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE_DASH = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE_DASH__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE_DASH__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE_DASH__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Parallel Double Dash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_PARALLEL_DOUBLE_DASH_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNEventTerminationImpl <em>Event Termination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNEventTerminationImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTermination()
	 * @generated
	 */
	int BPMN_EVENT_TERMINATION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TERMINATION__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TERMINATION__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TERMINATION__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Event Termination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_EVENT_TERMINATION_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNActivityTaskImpl <em>Activity Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNActivityTaskImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityTask()
	 * @generated
	 */
	int BPMN_ACTIVITY_TASK = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TASK__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TASK__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TASK__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Activity Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TASK_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNActivityTransactionImpl <em>Activity Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNActivityTransactionImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityTransaction()
	 * @generated
	 */
	int BPMN_ACTIVITY_TRANSACTION = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TRANSACTION__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TRANSACTION__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TRANSACTION__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Activity Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_TRANSACTION_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNActivityEventSubProcessImpl <em>Activity Event Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNActivityEventSubProcessImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityEventSubProcess()
	 * @generated
	 */
	int BPMN_ACTIVITY_EVENT_SUB_PROCESS = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_EVENT_SUB_PROCESS__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_EVENT_SUB_PROCESS__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_EVENT_SUB_PROCESS__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Activity Event Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_EVENT_SUB_PROCESS_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNActivityCallActivityImpl <em>Activity Call Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNActivityCallActivityImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityCallActivity()
	 * @generated
	 */
	int BPMN_ACTIVITY_CALL_ACTIVITY = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CALL_ACTIVITY__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CALL_ACTIVITY__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CALL_ACTIVITY__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Activity Call Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CALL_ACTIVITY_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayXOR1Impl <em>Gateway XOR1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayXOR1Impl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayXOR1()
	 * @generated
	 */
	int BPMN_GATEWAY_XOR1 = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR1__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR1__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR1__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway XOR1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR1_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayXOR2Impl <em>Gateway XOR2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayXOR2Impl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayXOR2()
	 * @generated
	 */
	int BPMN_GATEWAY_XOR2 = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR2__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR2__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR2__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway XOR2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XOR2_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayEventImpl <em>Gateway Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayEventImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayEvent()
	 * @generated
	 */
	int BPMN_GATEWAY_EVENT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_EVENT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_EVENT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_EVENT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_EVENT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayAndImpl <em>Gateway And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayAndImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayAnd()
	 * @generated
	 */
	int BPMN_GATEWAY_AND = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayORImpl <em>Gateway OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayORImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayOR()
	 * @generated
	 */
	int BPMN_GATEWAY_OR = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_OR__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_OR__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_OR__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_OR_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayComplexImpl <em>Gateway Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayComplexImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayComplex()
	 * @generated
	 */
	int BPMN_GATEWAY_COMPLEX = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_COMPLEX__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_COMPLEX__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_COMPLEX__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_COMPLEX_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayXEventImpl <em>Gateway XEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayXEventImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayXEvent()
	 * @generated
	 */
	int BPMN_GATEWAY_XEVENT = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XEVENT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XEVENT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XEVENT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway XEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_XEVENT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNGatewayAndEventImpl <em>Gateway And Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNGatewayAndEventImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayAndEvent()
	 * @generated
	 */
	int BPMN_GATEWAY_AND_EVENT = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND_EVENT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND_EVENT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND_EVENT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Gateway And Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_GATEWAY_AND_EVENT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNConversationDefaultImpl <em>Conversation Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNConversationDefaultImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNConversationDefault()
	 * @generated
	 */
	int BPMN_CONVERSATION_DEFAULT = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_DEFAULT__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_DEFAULT__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_DEFAULT__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Conversation Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_DEFAULT_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNConversationBoldImpl <em>Conversation Bold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNConversationBoldImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNConversationBold()
	 * @generated
	 */
	int BPMN_CONVERSATION_BOLD = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_BOLD__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_BOLD__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_BOLD__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Conversation Bold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONVERSATION_BOLD_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNOneDataImpl <em>One Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNOneDataImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNOneData()
	 * @generated
	 */
	int BPMN_ONE_DATA = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ONE_DATA__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ONE_DATA__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ONE_DATA__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>One Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ONE_DATA_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNListDataImpl <em>List Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNListDataImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNListData()
	 * @generated
	 */
	int BPMN_LIST_DATA = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_LIST_DATA__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_LIST_DATA__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_LIST_DATA__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>List Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_LIST_DATA_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNDataStorageImpl <em>Data Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNDataStorageImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNDataStorage()
	 * @generated
	 */
	int BPMN_DATA_STORAGE = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_STORAGE__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_STORAGE__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_STORAGE__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_STORAGE_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNSequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNSequenceFlowImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNSequenceFlow()
	 * @generated
	 */
	int BPMN_SEQUENCE_FLOW = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_SEQUENCE_FLOW__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_SEQUENCE_FLOW__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_SEQUENCE_FLOW__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Form Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_SEQUENCE_FLOW__FORM_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_SEQUENCE_FLOW__TO_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_SEQUENCE_FLOW_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNDefaultFlowImpl <em>Default Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNDefaultFlowImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNDefaultFlow()
	 * @generated
	 */
	int BPMN_DEFAULT_FLOW = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DEFAULT_FLOW__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DEFAULT_FLOW__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DEFAULT_FLOW__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Form Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DEFAULT_FLOW__FORM_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DEFAULT_FLOW__TO_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DEFAULT_FLOW_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNConditionalFlowImpl <em>Conditional Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNConditionalFlowImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNConditionalFlow()
	 * @generated
	 */
	int BPMN_CONDITIONAL_FLOW = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONDITIONAL_FLOW__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONDITIONAL_FLOW__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONDITIONAL_FLOW__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Form Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONDITIONAL_FLOW__FORM_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONDITIONAL_FLOW__TO_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_CONDITIONAL_FLOW_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link BPMN.impl.BPMNDataAssoziationImpl <em>Data Assoziation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN.impl.BPMNDataAssoziationImpl
	 * @see BPMN.impl.BPMNPackageImpl#getBPMNDataAssoziation()
	 * @generated
	 */
	int BPMN_DATA_ASSOZIATION = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_ASSOZIATION__NAME = BPMN_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_ASSOZIATION__DESCRIPTION = BPMN_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_ASSOZIATION__MODEL_ELEMENTS = BPMN_MODEL_ELEMENT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Form Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_ASSOZIATION__FORM_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_ASSOZIATION__TO_ELEMENT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Assoziation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DATA_ASSOZIATION_FEATURE_COUNT = BPMN_MODEL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link BPMN.BPMNModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see BPMN.BPMNModelElement
	 * @generated
	 */
	EClass getBPMNModelElement();

	/**
	 * Returns the meta object for the attribute '{@link BPMN.BPMNModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BPMN.BPMNModelElement#getName()
	 * @see #getBPMNModelElement()
	 * @generated
	 */
	EAttribute getBPMNModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link BPMN.BPMNModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BPMN.BPMNModelElement#getDescription()
	 * @see #getBPMNModelElement()
	 * @generated
	 */
	EAttribute getBPMNModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMN.BPMNModelElement#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see BPMN.BPMNModelElement#getModelElements()
	 * @see #getBPMNModelElement()
	 * @generated
	 */
	EReference getBPMNModelElement_ModelElements();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventStartDefault <em>Event Start Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Start Default</em>'.
	 * @see BPMN.BPMNEventStartDefault
	 * @generated
	 */
	EClass getBPMNEventStartDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEndDefault <em>Event End Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event End Default</em>'.
	 * @see BPMN.BPMNEventEndDefault
	 * @generated
	 */
	EClass getBPMNEventEndDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEndUsed <em>Event End Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event End Used</em>'.
	 * @see BPMN.BPMNEventEndUsed
	 * @generated
	 */
	EClass getBPMNEventEndUsed();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMail <em>Event Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mail</em>'.
	 * @see BPMN.BPMNEventMail
	 * @generated
	 */
	EClass getBPMNEventMail();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMailDash <em>Event Mail Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mail Dash</em>'.
	 * @see BPMN.BPMNEventMailDash
	 * @generated
	 */
	EClass getBPMNEventMailDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMailDouble <em>Event Mail Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mail Double</em>'.
	 * @see BPMN.BPMNEventMailDouble
	 * @generated
	 */
	EClass getBPMNEventMailDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMailDoubleDash <em>Event Mail Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mail Double Dash</em>'.
	 * @see BPMN.BPMNEventMailDoubleDash
	 * @generated
	 */
	EClass getBPMNEventMailDoubleDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMailInvertDouble <em>Event Mail Invert Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mail Invert Double</em>'.
	 * @see BPMN.BPMNEventMailInvertDouble
	 * @generated
	 */
	EClass getBPMNEventMailInvertDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMailInvertBold <em>Event Mail Invert Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mail Invert Bold</em>'.
	 * @see BPMN.BPMNEventMailInvertBold
	 * @generated
	 */
	EClass getBPMNEventMailInvertBold();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventTimerDefault <em>Event Timer Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Timer Default</em>'.
	 * @see BPMN.BPMNEventTimerDefault
	 * @generated
	 */
	EClass getBPMNEventTimerDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventTimerDash <em>Event Timer Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Timer Dash</em>'.
	 * @see BPMN.BPMNEventTimerDash
	 * @generated
	 */
	EClass getBPMNEventTimerDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventTimerDouble <em>Event Timer Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Timer Double</em>'.
	 * @see BPMN.BPMNEventTimerDouble
	 * @generated
	 */
	EClass getBPMNEventTimerDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventTimerDoubleDash <em>Event Timer Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Timer Double Dash</em>'.
	 * @see BPMN.BPMNEventTimerDoubleDash
	 * @generated
	 */
	EClass getBPMNEventTimerDoubleDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEskalationStart <em>Event Eskalation Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Eskalation Start</em>'.
	 * @see BPMN.BPMNEventEskalationStart
	 * @generated
	 */
	EClass getBPMNEventEskalationStart();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEskalationDash <em>Event Eskalation Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Eskalation Dash</em>'.
	 * @see BPMN.BPMNEventEskalationDash
	 * @generated
	 */
	EClass getBPMNEventEskalationDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEskalationDouble <em>Event Eskalation Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Eskalation Double</em>'.
	 * @see BPMN.BPMNEventEskalationDouble
	 * @generated
	 */
	EClass getBPMNEventEskalationDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEskalationDoubelDash <em>Event Eskalation Doubel Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Eskalation Doubel Dash</em>'.
	 * @see BPMN.BPMNEventEskalationDoubelDash
	 * @generated
	 */
	EClass getBPMNEventEskalationDoubelDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEskalationDoubelInvert <em>Event Eskalation Doubel Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Eskalation Doubel Invert</em>'.
	 * @see BPMN.BPMNEventEskalationDoubelInvert
	 * @generated
	 */
	EClass getBPMNEventEskalationDoubelInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventEskalationBoldInvert <em>Event Eskalation Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Eskalation Bold Invert</em>'.
	 * @see BPMN.BPMNEventEskalationBoldInvert
	 * @generated
	 */
	EClass getBPMNEventEskalationBoldInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventIfDefault <em>Event If Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event If Default</em>'.
	 * @see BPMN.BPMNEventIfDefault
	 * @generated
	 */
	EClass getBPMNEventIfDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventIfDash <em>Event If Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event If Dash</em>'.
	 * @see BPMN.BPMNEventIfDash
	 * @generated
	 */
	EClass getBPMNEventIfDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventIfDouble <em>Event If Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event If Double</em>'.
	 * @see BPMN.BPMNEventIfDouble
	 * @generated
	 */
	EClass getBPMNEventIfDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventIfDoubleDash <em>Event If Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event If Double Dash</em>'.
	 * @see BPMN.BPMNEventIfDoubleDash
	 * @generated
	 */
	EClass getBPMNEventIfDoubleDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventLinkEntered <em>Event Link Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Entered</em>'.
	 * @see BPMN.BPMNEventLinkEntered
	 * @generated
	 */
	EClass getBPMNEventLinkEntered();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventLinkTriggerd <em>Event Link Triggerd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Triggerd</em>'.
	 * @see BPMN.BPMNEventLinkTriggerd
	 * @generated
	 */
	EClass getBPMNEventLinkTriggerd();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventErrorDefault <em>Event Error Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Error Default</em>'.
	 * @see BPMN.BPMNEventErrorDefault
	 * @generated
	 */
	EClass getBPMNEventErrorDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventErrorDouble <em>Event Error Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Error Double</em>'.
	 * @see BPMN.BPMNEventErrorDouble
	 * @generated
	 */
	EClass getBPMNEventErrorDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventErrorBoldInvert <em>Event Error Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Error Bold Invert</em>'.
	 * @see BPMN.BPMNEventErrorBoldInvert
	 * @generated
	 */
	EClass getBPMNEventErrorBoldInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventCancelDouble <em>Event Cancel Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Cancel Double</em>'.
	 * @see BPMN.BPMNEventCancelDouble
	 * @generated
	 */
	EClass getBPMNEventCancelDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventCancelBoldInvert <em>Event Cancel Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Cancel Bold Invert</em>'.
	 * @see BPMN.BPMNEventCancelBoldInvert
	 * @generated
	 */
	EClass getBPMNEventCancelBoldInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventCompensationDefault <em>Event Compensation Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Compensation Default</em>'.
	 * @see BPMN.BPMNEventCompensationDefault
	 * @generated
	 */
	EClass getBPMNEventCompensationDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventCompensationDouble <em>Event Compensation Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Compensation Double</em>'.
	 * @see BPMN.BPMNEventCompensationDouble
	 * @generated
	 */
	EClass getBPMNEventCompensationDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventCompensationDoubleInvert <em>Event Compensation Double Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Compensation Double Invert</em>'.
	 * @see BPMN.BPMNEventCompensationDoubleInvert
	 * @generated
	 */
	EClass getBPMNEventCompensationDoubleInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventCompensationBoldInvert <em>Event Compensation Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Compensation Bold Invert</em>'.
	 * @see BPMN.BPMNEventCompensationBoldInvert
	 * @generated
	 */
	EClass getBPMNEventCompensationBoldInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventSignalDefault <em>Event Signal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Signal Default</em>'.
	 * @see BPMN.BPMNEventSignalDefault
	 * @generated
	 */
	EClass getBPMNEventSignalDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventSignalDash <em>Event Signal Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Signal Dash</em>'.
	 * @see BPMN.BPMNEventSignalDash
	 * @generated
	 */
	EClass getBPMNEventSignalDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventSignalDouble <em>Event Signal Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Signal Double</em>'.
	 * @see BPMN.BPMNEventSignalDouble
	 * @generated
	 */
	EClass getBPMNEventSignalDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventSignalDoubleDash <em>Event Signal Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Signal Double Dash</em>'.
	 * @see BPMN.BPMNEventSignalDoubleDash
	 * @generated
	 */
	EClass getBPMNEventSignalDoubleDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventSignalDoubleInvert <em>Event Signal Double Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Signal Double Invert</em>'.
	 * @see BPMN.BPMNEventSignalDoubleInvert
	 * @generated
	 */
	EClass getBPMNEventSignalDoubleInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventSignalBoldInvert <em>Event Signal Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Signal Bold Invert</em>'.
	 * @see BPMN.BPMNEventSignalBoldInvert
	 * @generated
	 */
	EClass getBPMNEventSignalBoldInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMultiDefault <em>Event Multi Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Multi Default</em>'.
	 * @see BPMN.BPMNEventMultiDefault
	 * @generated
	 */
	EClass getBPMNEventMultiDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMultiDash <em>Event Multi Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Multi Dash</em>'.
	 * @see BPMN.BPMNEventMultiDash
	 * @generated
	 */
	EClass getBPMNEventMultiDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMultiDouble <em>Event Multi Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Multi Double</em>'.
	 * @see BPMN.BPMNEventMultiDouble
	 * @generated
	 */
	EClass getBPMNEventMultiDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMultiDoubleDash <em>Event Multi Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Multi Double Dash</em>'.
	 * @see BPMN.BPMNEventMultiDoubleDash
	 * @generated
	 */
	EClass getBPMNEventMultiDoubleDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMultiDoubleInvert <em>Event Multi Double Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Multi Double Invert</em>'.
	 * @see BPMN.BPMNEventMultiDoubleInvert
	 * @generated
	 */
	EClass getBPMNEventMultiDoubleInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventMultiBoldInvert <em>Event Multi Bold Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Multi Bold Invert</em>'.
	 * @see BPMN.BPMNEventMultiBoldInvert
	 * @generated
	 */
	EClass getBPMNEventMultiBoldInvert();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventParallelDefault <em>Event Parallel Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parallel Default</em>'.
	 * @see BPMN.BPMNEventParallelDefault
	 * @generated
	 */
	EClass getBPMNEventParallelDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventParallelDash <em>Event Parallel Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parallel Dash</em>'.
	 * @see BPMN.BPMNEventParallelDash
	 * @generated
	 */
	EClass getBPMNEventParallelDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventParallelDouble <em>Event Parallel Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parallel Double</em>'.
	 * @see BPMN.BPMNEventParallelDouble
	 * @generated
	 */
	EClass getBPMNEventParallelDouble();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventParallelDoubleDash <em>Event Parallel Double Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parallel Double Dash</em>'.
	 * @see BPMN.BPMNEventParallelDoubleDash
	 * @generated
	 */
	EClass getBPMNEventParallelDoubleDash();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNEventTermination <em>Event Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Termination</em>'.
	 * @see BPMN.BPMNEventTermination
	 * @generated
	 */
	EClass getBPMNEventTermination();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNActivityTask <em>Activity Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Task</em>'.
	 * @see BPMN.BPMNActivityTask
	 * @generated
	 */
	EClass getBPMNActivityTask();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNActivityTransaction <em>Activity Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Transaction</em>'.
	 * @see BPMN.BPMNActivityTransaction
	 * @generated
	 */
	EClass getBPMNActivityTransaction();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNActivityEventSubProcess <em>Activity Event Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Event Sub Process</em>'.
	 * @see BPMN.BPMNActivityEventSubProcess
	 * @generated
	 */
	EClass getBPMNActivityEventSubProcess();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNActivityCallActivity <em>Activity Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Call Activity</em>'.
	 * @see BPMN.BPMNActivityCallActivity
	 * @generated
	 */
	EClass getBPMNActivityCallActivity();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayXOR1 <em>Gateway XOR1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway XOR1</em>'.
	 * @see BPMN.BPMNGatewayXOR1
	 * @generated
	 */
	EClass getBPMNGatewayXOR1();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayXOR2 <em>Gateway XOR2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway XOR2</em>'.
	 * @see BPMN.BPMNGatewayXOR2
	 * @generated
	 */
	EClass getBPMNGatewayXOR2();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayEvent <em>Gateway Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Event</em>'.
	 * @see BPMN.BPMNGatewayEvent
	 * @generated
	 */
	EClass getBPMNGatewayEvent();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayAnd <em>Gateway And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway And</em>'.
	 * @see BPMN.BPMNGatewayAnd
	 * @generated
	 */
	EClass getBPMNGatewayAnd();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayOR <em>Gateway OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway OR</em>'.
	 * @see BPMN.BPMNGatewayOR
	 * @generated
	 */
	EClass getBPMNGatewayOR();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayComplex <em>Gateway Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Complex</em>'.
	 * @see BPMN.BPMNGatewayComplex
	 * @generated
	 */
	EClass getBPMNGatewayComplex();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayXEvent <em>Gateway XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway XEvent</em>'.
	 * @see BPMN.BPMNGatewayXEvent
	 * @generated
	 */
	EClass getBPMNGatewayXEvent();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNGatewayAndEvent <em>Gateway And Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway And Event</em>'.
	 * @see BPMN.BPMNGatewayAndEvent
	 * @generated
	 */
	EClass getBPMNGatewayAndEvent();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNConversationDefault <em>Conversation Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Default</em>'.
	 * @see BPMN.BPMNConversationDefault
	 * @generated
	 */
	EClass getBPMNConversationDefault();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNConversationBold <em>Conversation Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Bold</em>'.
	 * @see BPMN.BPMNConversationBold
	 * @generated
	 */
	EClass getBPMNConversationBold();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNOneData <em>One Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Data</em>'.
	 * @see BPMN.BPMNOneData
	 * @generated
	 */
	EClass getBPMNOneData();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNListData <em>List Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Data</em>'.
	 * @see BPMN.BPMNListData
	 * @generated
	 */
	EClass getBPMNListData();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNDataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Storage</em>'.
	 * @see BPMN.BPMNDataStorage
	 * @generated
	 */
	EClass getBPMNDataStorage();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNSequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see BPMN.BPMNSequenceFlow
	 * @generated
	 */
	EClass getBPMNSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNSequenceFlow#getFormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form Element</em>'.
	 * @see BPMN.BPMNSequenceFlow#getFormElement()
	 * @see #getBPMNSequenceFlow()
	 * @generated
	 */
	EReference getBPMNSequenceFlow_FormElement();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNSequenceFlow#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see BPMN.BPMNSequenceFlow#getToElement()
	 * @see #getBPMNSequenceFlow()
	 * @generated
	 */
	EReference getBPMNSequenceFlow_ToElement();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNDefaultFlow <em>Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Flow</em>'.
	 * @see BPMN.BPMNDefaultFlow
	 * @generated
	 */
	EClass getBPMNDefaultFlow();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNDefaultFlow#getFormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form Element</em>'.
	 * @see BPMN.BPMNDefaultFlow#getFormElement()
	 * @see #getBPMNDefaultFlow()
	 * @generated
	 */
	EReference getBPMNDefaultFlow_FormElement();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNDefaultFlow#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see BPMN.BPMNDefaultFlow#getToElement()
	 * @see #getBPMNDefaultFlow()
	 * @generated
	 */
	EReference getBPMNDefaultFlow_ToElement();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNConditionalFlow <em>Conditional Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Flow</em>'.
	 * @see BPMN.BPMNConditionalFlow
	 * @generated
	 */
	EClass getBPMNConditionalFlow();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNConditionalFlow#getFormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form Element</em>'.
	 * @see BPMN.BPMNConditionalFlow#getFormElement()
	 * @see #getBPMNConditionalFlow()
	 * @generated
	 */
	EReference getBPMNConditionalFlow_FormElement();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNConditionalFlow#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see BPMN.BPMNConditionalFlow#getToElement()
	 * @see #getBPMNConditionalFlow()
	 * @generated
	 */
	EReference getBPMNConditionalFlow_ToElement();

	/**
	 * Returns the meta object for class '{@link BPMN.BPMNDataAssoziation <em>Data Assoziation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Assoziation</em>'.
	 * @see BPMN.BPMNDataAssoziation
	 * @generated
	 */
	EClass getBPMNDataAssoziation();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNDataAssoziation#getFormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form Element</em>'.
	 * @see BPMN.BPMNDataAssoziation#getFormElement()
	 * @see #getBPMNDataAssoziation()
	 * @generated
	 */
	EReference getBPMNDataAssoziation_FormElement();

	/**
	 * Returns the meta object for the reference '{@link BPMN.BPMNDataAssoziation#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see BPMN.BPMNDataAssoziation#getToElement()
	 * @see #getBPMNDataAssoziation()
	 * @generated
	 */
	EReference getBPMNDataAssoziation_ToElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPMNFactory getBPMNFactory();

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
		 * The meta object literal for the '{@link BPMN.impl.BPMNModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNModelElementImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNModelElement()
		 * @generated
		 */
		EClass BPMN_MODEL_ELEMENT = eINSTANCE.getBPMNModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_MODEL_ELEMENT__NAME = eINSTANCE.getBPMNModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getBPMNModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_MODEL_ELEMENT__MODEL_ELEMENTS = eINSTANCE.getBPMNModelElement_ModelElements();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventStartDefaultImpl <em>Event Start Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventStartDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventStartDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_START_DEFAULT = eINSTANCE.getBPMNEventStartDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEndDefaultImpl <em>Event End Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEndDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEndDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_END_DEFAULT = eINSTANCE.getBPMNEventEndDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEndUsedImpl <em>Event End Used</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEndUsedImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEndUsed()
		 * @generated
		 */
		EClass BPMN_EVENT_END_USED = eINSTANCE.getBPMNEventEndUsed();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMailImpl <em>Event Mail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMailImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMail()
		 * @generated
		 */
		EClass BPMN_EVENT_MAIL = eINSTANCE.getBPMNEventMail();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMailDashImpl <em>Event Mail Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMailDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailDash()
		 * @generated
		 */
		EClass BPMN_EVENT_MAIL_DASH = eINSTANCE.getBPMNEventMailDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMailDoubleImpl <em>Event Mail Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMailDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_MAIL_DOUBLE = eINSTANCE.getBPMNEventMailDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMailDoubleDashImpl <em>Event Mail Double Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMailDoubleDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailDoubleDash()
		 * @generated
		 */
		EClass BPMN_EVENT_MAIL_DOUBLE_DASH = eINSTANCE.getBPMNEventMailDoubleDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMailInvertDoubleImpl <em>Event Mail Invert Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMailInvertDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailInvertDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_MAIL_INVERT_DOUBLE = eINSTANCE.getBPMNEventMailInvertDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMailInvertBoldImpl <em>Event Mail Invert Bold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMailInvertBoldImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMailInvertBold()
		 * @generated
		 */
		EClass BPMN_EVENT_MAIL_INVERT_BOLD = eINSTANCE.getBPMNEventMailInvertBold();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventTimerDefaultImpl <em>Event Timer Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventTimerDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_TIMER_DEFAULT = eINSTANCE.getBPMNEventTimerDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventTimerDashImpl <em>Event Timer Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventTimerDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDash()
		 * @generated
		 */
		EClass BPMN_EVENT_TIMER_DASH = eINSTANCE.getBPMNEventTimerDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventTimerDoubleImpl <em>Event Timer Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventTimerDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_TIMER_DOUBLE = eINSTANCE.getBPMNEventTimerDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventTimerDoubleDashImpl <em>Event Timer Double Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventTimerDoubleDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTimerDoubleDash()
		 * @generated
		 */
		EClass BPMN_EVENT_TIMER_DOUBLE_DASH = eINSTANCE.getBPMNEventTimerDoubleDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEskalationStartImpl <em>Event Eskalation Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEskalationStartImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationStart()
		 * @generated
		 */
		EClass BPMN_EVENT_ESKALATION_START = eINSTANCE.getBPMNEventEskalationStart();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEskalationDashImpl <em>Event Eskalation Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEskalationDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDash()
		 * @generated
		 */
		EClass BPMN_EVENT_ESKALATION_DASH = eINSTANCE.getBPMNEventEskalationDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEskalationDoubleImpl <em>Event Eskalation Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEskalationDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_ESKALATION_DOUBLE = eINSTANCE.getBPMNEventEskalationDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEskalationDoubelDashImpl <em>Event Eskalation Doubel Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEskalationDoubelDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDoubelDash()
		 * @generated
		 */
		EClass BPMN_EVENT_ESKALATION_DOUBEL_DASH = eINSTANCE.getBPMNEventEskalationDoubelDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEskalationDoubelInvertImpl <em>Event Eskalation Doubel Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEskalationDoubelInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationDoubelInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_ESKALATION_DOUBEL_INVERT = eINSTANCE.getBPMNEventEskalationDoubelInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventEskalationBoldInvertImpl <em>Event Eskalation Bold Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventEskalationBoldInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventEskalationBoldInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_ESKALATION_BOLD_INVERT = eINSTANCE.getBPMNEventEskalationBoldInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventIfDefaultImpl <em>Event If Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventIfDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_IF_DEFAULT = eINSTANCE.getBPMNEventIfDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventIfDashImpl <em>Event If Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventIfDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDash()
		 * @generated
		 */
		EClass BPMN_EVENT_IF_DASH = eINSTANCE.getBPMNEventIfDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventIfDoubleImpl <em>Event If Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventIfDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_IF_DOUBLE = eINSTANCE.getBPMNEventIfDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventIfDoubleDashImpl <em>Event If Double Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventIfDoubleDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventIfDoubleDash()
		 * @generated
		 */
		EClass BPMN_EVENT_IF_DOUBLE_DASH = eINSTANCE.getBPMNEventIfDoubleDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventLinkEnteredImpl <em>Event Link Entered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventLinkEnteredImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventLinkEntered()
		 * @generated
		 */
		EClass BPMN_EVENT_LINK_ENTERED = eINSTANCE.getBPMNEventLinkEntered();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventLinkTriggerdImpl <em>Event Link Triggerd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventLinkTriggerdImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventLinkTriggerd()
		 * @generated
		 */
		EClass BPMN_EVENT_LINK_TRIGGERD = eINSTANCE.getBPMNEventLinkTriggerd();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventErrorDefaultImpl <em>Event Error Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventErrorDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventErrorDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_ERROR_DEFAULT = eINSTANCE.getBPMNEventErrorDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventErrorDoubleImpl <em>Event Error Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventErrorDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventErrorDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_ERROR_DOUBLE = eINSTANCE.getBPMNEventErrorDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventErrorBoldInvertImpl <em>Event Error Bold Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventErrorBoldInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventErrorBoldInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_ERROR_BOLD_INVERT = eINSTANCE.getBPMNEventErrorBoldInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventCancelDoubleImpl <em>Event Cancel Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventCancelDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCancelDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_CANCEL_DOUBLE = eINSTANCE.getBPMNEventCancelDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventCancelBoldInvertImpl <em>Event Cancel Bold Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventCancelBoldInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCancelBoldInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_CANCEL_BOLD_INVERT = eINSTANCE.getBPMNEventCancelBoldInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventCompensationDefaultImpl <em>Event Compensation Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventCompensationDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_COMPENSATION_DEFAULT = eINSTANCE.getBPMNEventCompensationDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventCompensationDoubleImpl <em>Event Compensation Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventCompensationDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_COMPENSATION_DOUBLE = eINSTANCE.getBPMNEventCompensationDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventCompensationDoubleInvertImpl <em>Event Compensation Double Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventCompensationDoubleInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationDoubleInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_COMPENSATION_DOUBLE_INVERT = eINSTANCE.getBPMNEventCompensationDoubleInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventCompensationBoldInvertImpl <em>Event Compensation Bold Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventCompensationBoldInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventCompensationBoldInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_COMPENSATION_BOLD_INVERT = eINSTANCE.getBPMNEventCompensationBoldInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventSignalDefaultImpl <em>Event Signal Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventSignalDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_SIGNAL_DEFAULT = eINSTANCE.getBPMNEventSignalDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventSignalDashImpl <em>Event Signal Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventSignalDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDash()
		 * @generated
		 */
		EClass BPMN_EVENT_SIGNAL_DASH = eINSTANCE.getBPMNEventSignalDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventSignalDoubleImpl <em>Event Signal Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventSignalDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_SIGNAL_DOUBLE = eINSTANCE.getBPMNEventSignalDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventSignalDoubleDashImpl <em>Event Signal Double Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventSignalDoubleDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDoubleDash()
		 * @generated
		 */
		EClass BPMN_EVENT_SIGNAL_DOUBLE_DASH = eINSTANCE.getBPMNEventSignalDoubleDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventSignalDoubleInvertImpl <em>Event Signal Double Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventSignalDoubleInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalDoubleInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_SIGNAL_DOUBLE_INVERT = eINSTANCE.getBPMNEventSignalDoubleInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventSignalBoldInvertImpl <em>Event Signal Bold Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventSignalBoldInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventSignalBoldInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_SIGNAL_BOLD_INVERT = eINSTANCE.getBPMNEventSignalBoldInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMultiDefaultImpl <em>Event Multi Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMultiDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_MULTI_DEFAULT = eINSTANCE.getBPMNEventMultiDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMultiDashImpl <em>Event Multi Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMultiDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDash()
		 * @generated
		 */
		EClass BPMN_EVENT_MULTI_DASH = eINSTANCE.getBPMNEventMultiDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMultiDoubleImpl <em>Event Multi Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMultiDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_MULTI_DOUBLE = eINSTANCE.getBPMNEventMultiDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMultiDoubleDashImpl <em>Event Multi Double Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMultiDoubleDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDoubleDash()
		 * @generated
		 */
		EClass BPMN_EVENT_MULTI_DOUBLE_DASH = eINSTANCE.getBPMNEventMultiDoubleDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMultiDoubleInvertImpl <em>Event Multi Double Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMultiDoubleInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiDoubleInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_MULTI_DOUBLE_INVERT = eINSTANCE.getBPMNEventMultiDoubleInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventMultiBoldInvertImpl <em>Event Multi Bold Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventMultiBoldInvertImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventMultiBoldInvert()
		 * @generated
		 */
		EClass BPMN_EVENT_MULTI_BOLD_INVERT = eINSTANCE.getBPMNEventMultiBoldInvert();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventParallelDefaultImpl <em>Event Parallel Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventParallelDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDefault()
		 * @generated
		 */
		EClass BPMN_EVENT_PARALLEL_DEFAULT = eINSTANCE.getBPMNEventParallelDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventParallelDashImpl <em>Event Parallel Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventParallelDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDash()
		 * @generated
		 */
		EClass BPMN_EVENT_PARALLEL_DASH = eINSTANCE.getBPMNEventParallelDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventParallelDoubleImpl <em>Event Parallel Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventParallelDoubleImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDouble()
		 * @generated
		 */
		EClass BPMN_EVENT_PARALLEL_DOUBLE = eINSTANCE.getBPMNEventParallelDouble();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventParallelDoubleDashImpl <em>Event Parallel Double Dash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventParallelDoubleDashImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventParallelDoubleDash()
		 * @generated
		 */
		EClass BPMN_EVENT_PARALLEL_DOUBLE_DASH = eINSTANCE.getBPMNEventParallelDoubleDash();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNEventTerminationImpl <em>Event Termination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNEventTerminationImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNEventTermination()
		 * @generated
		 */
		EClass BPMN_EVENT_TERMINATION = eINSTANCE.getBPMNEventTermination();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNActivityTaskImpl <em>Activity Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNActivityTaskImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityTask()
		 * @generated
		 */
		EClass BPMN_ACTIVITY_TASK = eINSTANCE.getBPMNActivityTask();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNActivityTransactionImpl <em>Activity Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNActivityTransactionImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityTransaction()
		 * @generated
		 */
		EClass BPMN_ACTIVITY_TRANSACTION = eINSTANCE.getBPMNActivityTransaction();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNActivityEventSubProcessImpl <em>Activity Event Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNActivityEventSubProcessImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityEventSubProcess()
		 * @generated
		 */
		EClass BPMN_ACTIVITY_EVENT_SUB_PROCESS = eINSTANCE.getBPMNActivityEventSubProcess();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNActivityCallActivityImpl <em>Activity Call Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNActivityCallActivityImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNActivityCallActivity()
		 * @generated
		 */
		EClass BPMN_ACTIVITY_CALL_ACTIVITY = eINSTANCE.getBPMNActivityCallActivity();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayXOR1Impl <em>Gateway XOR1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayXOR1Impl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayXOR1()
		 * @generated
		 */
		EClass BPMN_GATEWAY_XOR1 = eINSTANCE.getBPMNGatewayXOR1();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayXOR2Impl <em>Gateway XOR2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayXOR2Impl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayXOR2()
		 * @generated
		 */
		EClass BPMN_GATEWAY_XOR2 = eINSTANCE.getBPMNGatewayXOR2();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayEventImpl <em>Gateway Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayEventImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayEvent()
		 * @generated
		 */
		EClass BPMN_GATEWAY_EVENT = eINSTANCE.getBPMNGatewayEvent();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayAndImpl <em>Gateway And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayAndImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayAnd()
		 * @generated
		 */
		EClass BPMN_GATEWAY_AND = eINSTANCE.getBPMNGatewayAnd();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayORImpl <em>Gateway OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayORImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayOR()
		 * @generated
		 */
		EClass BPMN_GATEWAY_OR = eINSTANCE.getBPMNGatewayOR();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayComplexImpl <em>Gateway Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayComplexImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayComplex()
		 * @generated
		 */
		EClass BPMN_GATEWAY_COMPLEX = eINSTANCE.getBPMNGatewayComplex();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayXEventImpl <em>Gateway XEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayXEventImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayXEvent()
		 * @generated
		 */
		EClass BPMN_GATEWAY_XEVENT = eINSTANCE.getBPMNGatewayXEvent();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNGatewayAndEventImpl <em>Gateway And Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNGatewayAndEventImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNGatewayAndEvent()
		 * @generated
		 */
		EClass BPMN_GATEWAY_AND_EVENT = eINSTANCE.getBPMNGatewayAndEvent();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNConversationDefaultImpl <em>Conversation Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNConversationDefaultImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNConversationDefault()
		 * @generated
		 */
		EClass BPMN_CONVERSATION_DEFAULT = eINSTANCE.getBPMNConversationDefault();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNConversationBoldImpl <em>Conversation Bold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNConversationBoldImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNConversationBold()
		 * @generated
		 */
		EClass BPMN_CONVERSATION_BOLD = eINSTANCE.getBPMNConversationBold();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNOneDataImpl <em>One Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNOneDataImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNOneData()
		 * @generated
		 */
		EClass BPMN_ONE_DATA = eINSTANCE.getBPMNOneData();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNListDataImpl <em>List Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNListDataImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNListData()
		 * @generated
		 */
		EClass BPMN_LIST_DATA = eINSTANCE.getBPMNListData();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNDataStorageImpl <em>Data Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNDataStorageImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNDataStorage()
		 * @generated
		 */
		EClass BPMN_DATA_STORAGE = eINSTANCE.getBPMNDataStorage();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNSequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNSequenceFlowImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNSequenceFlow()
		 * @generated
		 */
		EClass BPMN_SEQUENCE_FLOW = eINSTANCE.getBPMNSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>Form Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_SEQUENCE_FLOW__FORM_ELEMENT = eINSTANCE.getBPMNSequenceFlow_FormElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_SEQUENCE_FLOW__TO_ELEMENT = eINSTANCE.getBPMNSequenceFlow_ToElement();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNDefaultFlowImpl <em>Default Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNDefaultFlowImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNDefaultFlow()
		 * @generated
		 */
		EClass BPMN_DEFAULT_FLOW = eINSTANCE.getBPMNDefaultFlow();

		/**
		 * The meta object literal for the '<em><b>Form Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_DEFAULT_FLOW__FORM_ELEMENT = eINSTANCE.getBPMNDefaultFlow_FormElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_DEFAULT_FLOW__TO_ELEMENT = eINSTANCE.getBPMNDefaultFlow_ToElement();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNConditionalFlowImpl <em>Conditional Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNConditionalFlowImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNConditionalFlow()
		 * @generated
		 */
		EClass BPMN_CONDITIONAL_FLOW = eINSTANCE.getBPMNConditionalFlow();

		/**
		 * The meta object literal for the '<em><b>Form Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_CONDITIONAL_FLOW__FORM_ELEMENT = eINSTANCE.getBPMNConditionalFlow_FormElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_CONDITIONAL_FLOW__TO_ELEMENT = eINSTANCE.getBPMNConditionalFlow_ToElement();

		/**
		 * The meta object literal for the '{@link BPMN.impl.BPMNDataAssoziationImpl <em>Data Assoziation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN.impl.BPMNDataAssoziationImpl
		 * @see BPMN.impl.BPMNPackageImpl#getBPMNDataAssoziation()
		 * @generated
		 */
		EClass BPMN_DATA_ASSOZIATION = eINSTANCE.getBPMNDataAssoziation();

		/**
		 * The meta object literal for the '<em><b>Form Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_DATA_ASSOZIATION__FORM_ELEMENT = eINSTANCE.getBPMNDataAssoziation_FormElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_DATA_ASSOZIATION__TO_ELEMENT = eINSTANCE.getBPMNDataAssoziation_ToElement();

	}

} //BPMNPackage
