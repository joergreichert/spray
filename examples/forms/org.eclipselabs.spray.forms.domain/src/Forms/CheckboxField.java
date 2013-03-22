/**
 */
package Forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Forms.CheckboxField#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see Forms.FormsPackage#getCheckboxField()
 * @model
 * @generated
 */
public interface CheckboxField extends InputElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link Forms.CheckboxValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see Forms.FormsPackage#getCheckboxField_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckboxValues> getValues();

} // CheckboxField
