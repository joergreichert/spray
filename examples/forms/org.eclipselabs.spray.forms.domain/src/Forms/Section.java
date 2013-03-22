/**
 */
package Forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Forms.Section#getInputElements <em>Input Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see Forms.FormsPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Forms.InputElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Elements</em>' containment reference list.
	 * @see Forms.FormsPackage#getSection_InputElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputElement> getInputElements();

} // Section
