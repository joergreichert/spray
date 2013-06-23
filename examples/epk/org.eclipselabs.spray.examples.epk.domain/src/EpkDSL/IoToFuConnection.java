/**
 */
package EpkDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io To Fu Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EpkDSL.IoToFuConnection#getStart <em>Start</em>}</li>
 *   <li>{@link EpkDSL.IoToFuConnection#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see EpkDSL.EpkDSLPackage#getIoToFuConnection()
 * @model
 * @generated
 */
public interface IoToFuConnection extends DefaultConnection {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(InOutput)
	 * @see EpkDSL.EpkDSLPackage#getIoToFuConnection_Start()
	 * @model required="true"
	 * @generated
	 */
	InOutput getStart();

	/**
	 * Sets the value of the '{@link EpkDSL.IoToFuConnection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(InOutput value);

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
	 * @see EpkDSL.EpkDSLPackage#getIoToFuConnection_End()
	 * @model required="true"
	 * @generated
	 */
	Function getEnd();

	/**
	 * Sets the value of the '{@link EpkDSL.IoToFuConnection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Function value);

} // IoToFuConnection
