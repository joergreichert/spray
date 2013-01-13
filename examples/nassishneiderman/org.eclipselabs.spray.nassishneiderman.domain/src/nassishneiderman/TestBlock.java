/**
 */
package nassishneiderman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nassishneiderman.TestBlock#getCondition <em>Condition</em>}</li>
 *   <li>{@link nassishneiderman.TestBlock#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see nassishneiderman.NassishneidermanPackage#getTestBlock()
 * @model
 * @generated
 */
public interface TestBlock extends Block {

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
	 * @see nassishneiderman.NassishneidermanPackage#getTestBlock_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link nassishneiderman.TestBlock#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(Sequence)
	 * @see nassishneiderman.NassishneidermanPackage#getTestBlock_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	Sequence getSequence();

	/**
	 * Sets the value of the '{@link nassishneiderman.TestBlock#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Sequence value);
} // TestBlock
