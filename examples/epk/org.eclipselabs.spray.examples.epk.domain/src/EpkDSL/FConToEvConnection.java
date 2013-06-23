/**
 */
package EpkDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FCon To Ev Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EpkDSL.FConToEvConnection#getStart <em>Start</em>}</li>
 *   <li>{@link EpkDSL.FConToEvConnection#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see EpkDSL.EpkDSLPackage#getFConToEvConnection()
 * @model
 * @generated
 */
public interface FConToEvConnection extends DefaultConnection {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(FConnector)
	 * @see EpkDSL.EpkDSLPackage#getFConToEvConnection_Start()
	 * @model required="true"
	 * @generated
	 */
	FConnector getStart();

	/**
	 * Sets the value of the '{@link EpkDSL.FConToEvConnection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(FConnector value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Event)
	 * @see EpkDSL.EpkDSLPackage#getFConToEvConnection_End()
	 * @model required="true"
	 * @generated
	 */
	Event getEnd();

	/**
	 * Sets the value of the '{@link EpkDSL.FConToEvConnection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Event value);

} // FConToEvConnection
