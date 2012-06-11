/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.Transition#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends PetriNode {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(PetriNode)
	 * @see PetriNet.PetriNetPackage#getTransition_Test()
	 * @model containment="true"
	 * @generated
	 */
	PetriNode getTest();

	/**
	 * Sets the value of the '{@link PetriNet.Transition#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(PetriNode value);

} // Transition
