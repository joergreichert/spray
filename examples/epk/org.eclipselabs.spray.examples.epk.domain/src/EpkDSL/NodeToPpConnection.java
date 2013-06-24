/**
 */
package EpkDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node To Pp Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EpkDSL.NodeToPpConnection#getStart <em>Start</em>}</li>
 *   <li>{@link EpkDSL.NodeToPpConnection#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see EpkDSL.EpkDSLPackage#getNodeToPpConnection()
 * @model
 * @generated
 */
public interface NodeToPpConnection extends DefaultConnection {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Node)
	 * @see EpkDSL.EpkDSLPackage#getNodeToPpConnection_Start()
	 * @model required="true"
	 * @generated
	 */
	Node getStart();

	/**
	 * Sets the value of the '{@link EpkDSL.NodeToPpConnection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Node value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ProcPath)
	 * @see EpkDSL.EpkDSLPackage#getNodeToPpConnection_End()
	 * @model required="true"
	 * @generated
	 */
	ProcPath getEnd();

	/**
	 * Sets the value of the '{@link EpkDSL.NodeToPpConnection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ProcPath value);

} // NodeToPpConnection
