/**
 */
package ConceptMapDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptMapDSL.ArrowConnection#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ConceptMapDSL.ArrowConnection#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptMapDSL.ConceptMapDSLPackage#getArrowConnection()
 * @model
 * @generated
 */
public interface ArrowConnection extends MapElements {
	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(Element)
	 * @see ConceptMapDSL.ConceptMapDSLPackage#getArrowConnection_FromElement()
	 * @model
	 * @generated
	 */
	Element getFromElement();

	/**
	 * Sets the value of the '{@link ConceptMapDSL.ArrowConnection#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(Element value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(Element)
	 * @see ConceptMapDSL.ConceptMapDSLPackage#getArrowConnection_ToElement()
	 * @model
	 * @generated
	 */
	Element getToElement();

	/**
	 * Sets the value of the '{@link ConceptMapDSL.ArrowConnection#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(Element value);

} // ArrowConnection
