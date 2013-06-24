/**
 */
package PetrinetDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetrinetDSL.PTEdge#getFromPlace <em>From Place</em>}</li>
 *   <li>{@link PetrinetDSL.PTEdge#getToTransition <em>To Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetrinetDSL.PetrinetDSLPackage#getPTEdge()
 * @model
 * @generated
 */
public interface PTEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>From Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Place</em>' reference.
	 * @see #setFromPlace(Place)
	 * @see PetrinetDSL.PetrinetDSLPackage#getPTEdge_FromPlace()
	 * @model
	 * @generated
	 */
	Place getFromPlace();

	/**
	 * Sets the value of the '{@link PetrinetDSL.PTEdge#getFromPlace <em>From Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Place</em>' reference.
	 * @see #getFromPlace()
	 * @generated
	 */
	void setFromPlace(Place value);

	/**
	 * Returns the value of the '<em><b>To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transition</em>' reference.
	 * @see #setToTransition(Transition)
	 * @see PetrinetDSL.PetrinetDSLPackage#getPTEdge_ToTransition()
	 * @model
	 * @generated
	 */
	Transition getToTransition();

	/**
	 * Sets the value of the '{@link PetrinetDSL.PTEdge#getToTransition <em>To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Transition</em>' reference.
	 * @see #getToTransition()
	 * @generated
	 */
	void setToTransition(Transition value);

} // PTEdge
