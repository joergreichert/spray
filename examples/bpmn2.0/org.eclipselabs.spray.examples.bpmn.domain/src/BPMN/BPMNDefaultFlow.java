/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN.BPMNDefaultFlow#getFormElement <em>Form Element</em>}</li>
 *   <li>{@link BPMN.BPMNDefaultFlow#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN.BPMNPackage#getBPMNDefaultFlow()
 * @model
 * @generated
 */
public interface BPMNDefaultFlow extends BPMNModelElement {
	/**
	 * Returns the value of the '<em><b>Form Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Element</em>' reference.
	 * @see #setFormElement(BPMNModelElement)
	 * @see BPMN.BPMNPackage#getBPMNDefaultFlow_FormElement()
	 * @model
	 * @generated
	 */
	BPMNModelElement getFormElement();

	/**
	 * Sets the value of the '{@link BPMN.BPMNDefaultFlow#getFormElement <em>Form Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Element</em>' reference.
	 * @see #getFormElement()
	 * @generated
	 */
	void setFormElement(BPMNModelElement value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(BPMNModelElement)
	 * @see BPMN.BPMNPackage#getBPMNDefaultFlow_ToElement()
	 * @model
	 * @generated
	 */
	BPMNModelElement getToElement();

	/**
	 * Sets the value of the '{@link BPMN.BPMNDefaultFlow#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(BPMNModelElement value);

} // BPMNDefaultFlow
