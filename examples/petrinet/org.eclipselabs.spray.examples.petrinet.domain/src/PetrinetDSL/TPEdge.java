/**
 */
package PetrinetDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TP Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetrinetDSL.TPEdge#getFromTransition <em>From Transition</em>}</li>
 *   <li>{@link PetrinetDSL.TPEdge#getToPlace <em>To Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetrinetDSL.PetrinetDSLPackage#getTPEdge()
 * @model
 * @generated
 */
public interface TPEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>From Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Transition</em>' reference.
	 * @see #setFromTransition(Transition)
	 * @see PetrinetDSL.PetrinetDSLPackage#getTPEdge_FromTransition()
	 * @model
	 * @generated
	 */
	Transition getFromTransition();

	/**
	 * Sets the value of the '{@link PetrinetDSL.TPEdge#getFromTransition <em>From Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Transition</em>' reference.
	 * @see #getFromTransition()
	 * @generated
	 */
	void setFromTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>To Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Place</em>' reference.
	 * @see #setToPlace(Place)
	 * @see PetrinetDSL.PetrinetDSLPackage#getTPEdge_ToPlace()
	 * @model
	 * @generated
	 */
	Place getToPlace();

	/**
	 * Sets the value of the '{@link PetrinetDSL.TPEdge#getToPlace <em>To Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Place</em>' reference.
	 * @see #getToPlace()
	 * @generated
	 */
	void setToPlace(Place value);

} // TPEdge
