/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.Place#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends PetriNode {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #setToken(Token)
	 * @see PetriNet.PetriNetPackage#getPlace_Token()
	 * @model containment="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link PetriNet.Place#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // Place
