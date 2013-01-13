/**
 */
package nassishneiderman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branching Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nassishneiderman.BranchingBlock#getCondition <em>Condition</em>}</li>
 *   <li>{@link nassishneiderman.BranchingBlock#getTrueSequence <em>True Sequence</em>}</li>
 *   <li>{@link nassishneiderman.BranchingBlock#getFalseSequence <em>False Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see nassishneiderman.NassishneidermanPackage#getBranchingBlock()
 * @model
 * @generated
 */
public interface BranchingBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see nassishneiderman.NassishneidermanPackage#getBranchingBlock_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link nassishneiderman.BranchingBlock#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>True Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Sequence</em>' containment reference.
	 * @see #setTrueSequence(Sequence)
	 * @see nassishneiderman.NassishneidermanPackage#getBranchingBlock_TrueSequence()
	 * @model containment="true"
	 * @generated
	 */
	Sequence getTrueSequence();

	/**
	 * Sets the value of the '{@link nassishneiderman.BranchingBlock#getTrueSequence <em>True Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Sequence</em>' containment reference.
	 * @see #getTrueSequence()
	 * @generated
	 */
	void setTrueSequence(Sequence value);

	/**
	 * Returns the value of the '<em><b>False Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Sequence</em>' containment reference.
	 * @see #setFalseSequence(Sequence)
	 * @see nassishneiderman.NassishneidermanPackage#getBranchingBlock_FalseSequence()
	 * @model containment="true"
	 * @generated
	 */
	Sequence getFalseSequence();

	/**
	 * Sets the value of the '{@link nassishneiderman.BranchingBlock#getFalseSequence <em>False Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Sequence</em>' containment reference.
	 * @see #getFalseSequence()
	 * @generated
	 */
	void setFalseSequence(Sequence value);

} // BranchingBlock
