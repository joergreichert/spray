/**
 */
package nassishneiderman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nassishneiderman.ActionBlock#getActionName <em>Action Name</em>}</li>
 *   <li>{@link nassishneiderman.ActionBlock#getActionDescription <em>Action Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see nassishneiderman.NassishneidermanPackage#getActionBlock()
 * @model
 * @generated
 */
public interface ActionBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see nassishneiderman.NassishneidermanPackage#getActionBlock_ActionName()
	 * @model
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link nassishneiderman.ActionBlock#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * Returns the value of the '<em><b>Action Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Description</em>' attribute.
	 * @see #setActionDescription(String)
	 * @see nassishneiderman.NassishneidermanPackage#getActionBlock_ActionDescription()
	 * @model
	 * @generated
	 */
	String getActionDescription();

	/**
	 * Sets the value of the '{@link nassishneiderman.ActionBlock#getActionDescription <em>Action Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Description</em>' attribute.
	 * @see #getActionDescription()
	 * @generated
	 */
	void setActionDescription(String value);

} // ActionBlock
