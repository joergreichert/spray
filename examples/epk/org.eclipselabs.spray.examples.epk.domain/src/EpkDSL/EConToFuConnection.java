/**
 */
package EpkDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECon To Fu Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EpkDSL.EConToFuConnection#getStart <em>Start</em>}</li>
 *   <li>{@link EpkDSL.EConToFuConnection#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see EpkDSL.EpkDSLPackage#getEConToFuConnection()
 * @model
 * @generated
 */
public interface EConToFuConnection extends DefaultConnection {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(EConnector)
	 * @see EpkDSL.EpkDSLPackage#getEConToFuConnection_Start()
	 * @model required="true"
	 * @generated
	 */
	EConnector getStart();

	/**
	 * Sets the value of the '{@link EpkDSL.EConToFuConnection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(EConnector value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Function)
	 * @see EpkDSL.EpkDSLPackage#getEConToFuConnection_End()
	 * @model required="true"
	 * @generated
	 */
	Function getEnd();

	/**
	 * Sets the value of the '{@link EpkDSL.EConToFuConnection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Function value);

} // EConToFuConnection
