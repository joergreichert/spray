/**
 */
package Forms;

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
 * @see Forms.FormsFactory
 * @model kind="package"
 * @generated
 */
public interface FormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Forms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.examples.org/forms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsPackage eINSTANCE = Forms.impl.FormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Forms.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.FormImpl
	 * @see Forms.impl.FormsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Forms.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.SectionImpl
	 * @see Forms.impl.FormsPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Input Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__INPUT_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Forms.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.InputElementImpl
	 * @see Forms.impl.FormsPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Forms.impl.InputFieldImpl <em>Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.InputFieldImpl
	 * @see Forms.impl.FormsPackageImpl#getInputField()
	 * @generated
	 */
	int INPUT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__TEXT = INPUT_ELEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Forms.impl.PasswordFieldImpl <em>Password Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.PasswordFieldImpl
	 * @see Forms.impl.FormsPackageImpl#getPasswordField()
	 * @generated
	 */
	int PASSWORD_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD__TEXT = INPUT_ELEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Password Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Forms.impl.CheckboxFieldImpl <em>Checkbox Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.CheckboxFieldImpl
	 * @see Forms.impl.FormsPackageImpl#getCheckboxField()
	 * @generated
	 */
	int CHECKBOX_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FIELD__TEXT = INPUT_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FIELD__VALUES = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Checkbox Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FIELD_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Forms.impl.CheckboxValuesImpl <em>Checkbox Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.CheckboxValuesImpl
	 * @see Forms.impl.FormsPackageImpl#getCheckboxValues()
	 * @generated
	 */
	int CHECKBOX_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_VALUES__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Checkbox Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_VALUES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Forms.impl.ButtonFieldImpl <em>Button Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Forms.impl.ButtonFieldImpl
	 * @see Forms.impl.FormsPackageImpl#getButtonField()
	 * @generated
	 */
	int BUTTON_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FIELD__TEXT = INPUT_ELEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Button Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FIELD_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Forms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see Forms.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link Forms.Form#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see Forms.Form#getSections()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Sections();

	/**
	 * Returns the meta object for class '{@link Forms.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see Forms.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link Forms.Section#getInputElements <em>Input Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Elements</em>'.
	 * @see Forms.Section#getInputElements()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_InputElements();

	/**
	 * Returns the meta object for class '{@link Forms.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see Forms.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for the attribute '{@link Forms.InputElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Forms.InputElement#getText()
	 * @see #getInputElement()
	 * @generated
	 */
	EAttribute getInputElement_Text();

	/**
	 * Returns the meta object for class '{@link Forms.InputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Field</em>'.
	 * @see Forms.InputField
	 * @generated
	 */
	EClass getInputField();

	/**
	 * Returns the meta object for class '{@link Forms.PasswordField <em>Password Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Field</em>'.
	 * @see Forms.PasswordField
	 * @generated
	 */
	EClass getPasswordField();

	/**
	 * Returns the meta object for class '{@link Forms.CheckboxField <em>Checkbox Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox Field</em>'.
	 * @see Forms.CheckboxField
	 * @generated
	 */
	EClass getCheckboxField();

	/**
	 * Returns the meta object for the containment reference list '{@link Forms.CheckboxField#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see Forms.CheckboxField#getValues()
	 * @see #getCheckboxField()
	 * @generated
	 */
	EReference getCheckboxField_Values();

	/**
	 * Returns the meta object for class '{@link Forms.CheckboxValues <em>Checkbox Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox Values</em>'.
	 * @see Forms.CheckboxValues
	 * @generated
	 */
	EClass getCheckboxValues();

	/**
	 * Returns the meta object for the attribute '{@link Forms.CheckboxValues#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Forms.CheckboxValues#getValue()
	 * @see #getCheckboxValues()
	 * @generated
	 */
	EAttribute getCheckboxValues_Value();

	/**
	 * Returns the meta object for class '{@link Forms.ButtonField <em>Button Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Field</em>'.
	 * @see Forms.ButtonField
	 * @generated
	 */
	EClass getButtonField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormsFactory getFormsFactory();

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
		 * The meta object literal for the '{@link Forms.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.FormImpl
		 * @see Forms.impl.FormsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__SECTIONS = eINSTANCE.getForm_Sections();

		/**
		 * The meta object literal for the '{@link Forms.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.SectionImpl
		 * @see Forms.impl.FormsPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Input Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__INPUT_ELEMENTS = eINSTANCE.getSection_InputElements();

		/**
		 * The meta object literal for the '{@link Forms.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.InputElementImpl
		 * @see Forms.impl.FormsPackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ELEMENT__TEXT = eINSTANCE.getInputElement_Text();

		/**
		 * The meta object literal for the '{@link Forms.impl.InputFieldImpl <em>Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.InputFieldImpl
		 * @see Forms.impl.FormsPackageImpl#getInputField()
		 * @generated
		 */
		EClass INPUT_FIELD = eINSTANCE.getInputField();

		/**
		 * The meta object literal for the '{@link Forms.impl.PasswordFieldImpl <em>Password Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.PasswordFieldImpl
		 * @see Forms.impl.FormsPackageImpl#getPasswordField()
		 * @generated
		 */
		EClass PASSWORD_FIELD = eINSTANCE.getPasswordField();

		/**
		 * The meta object literal for the '{@link Forms.impl.CheckboxFieldImpl <em>Checkbox Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.CheckboxFieldImpl
		 * @see Forms.impl.FormsPackageImpl#getCheckboxField()
		 * @generated
		 */
		EClass CHECKBOX_FIELD = eINSTANCE.getCheckboxField();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKBOX_FIELD__VALUES = eINSTANCE.getCheckboxField_Values();

		/**
		 * The meta object literal for the '{@link Forms.impl.CheckboxValuesImpl <em>Checkbox Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.CheckboxValuesImpl
		 * @see Forms.impl.FormsPackageImpl#getCheckboxValues()
		 * @generated
		 */
		EClass CHECKBOX_VALUES = eINSTANCE.getCheckboxValues();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKBOX_VALUES__VALUE = eINSTANCE.getCheckboxValues_Value();

		/**
		 * The meta object literal for the '{@link Forms.impl.ButtonFieldImpl <em>Button Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Forms.impl.ButtonFieldImpl
		 * @see Forms.impl.FormsPackageImpl#getButtonField()
		 * @generated
		 */
		EClass BUTTON_FIELD = eINSTANCE.getButtonField();

	}

} //FormsPackage
