/**
 */
package EpkDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pp To Node Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EpkDSL.PpToNodeConnection#getStart <em>Start</em>}</li>
 *   <li>{@link EpkDSL.PpToNodeConnection#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see EpkDSL.EpkDSLPackage#getPpToNodeConnection()
 * @model
 * @generated
 */
public interface PpToNodeConnection extends DefaultConnection {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ProcPath)
	 * @see EpkDSL.EpkDSLPackage#getPpToNodeConnection_Start()
	 * @model required="true"
	 * @generated
	 */
	ProcPath getStart();

	/**
	 * Sets the value of the '{@link EpkDSL.PpToNodeConnection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ProcPath value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Node)
	 * @see EpkDSL.EpkDSLPackage#getPpToNodeConnection_End()
	 * @model required="true"
	 * @generated
	 */
	Node getEnd();

	/**
	 * Sets the value of the '{@link EpkDSL.PpToNodeConnection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Node value);

} // PpToNodeConnection
