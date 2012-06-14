/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PlaceEClass#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getPlaceEClass()
 * @model
 * @generated
 */
public interface PlaceEClass extends PetriNode {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #setToken(TokenEClass)
	 * @see PetriNet.PetriNetPackage#getPlaceEClass_Token()
	 * @model containment="true"
	 * @generated
	 */
	TokenEClass getToken();

	/**
	 * Sets the value of the '{@link PetriNet.PlaceEClass#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenEClass value);

} // PlaceEClass
