/**
 */
package ErdiagramDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chen Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.ChenConnection#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link ErdiagramDSL.ChenConnection#getToRelationship <em>To Relationship</em>}</li>
 *   <li>{@link ErdiagramDSL.ChenConnection#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenConnection()
 * @model
 * @generated
 */
public interface ChenConnection extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Entity</em>' reference.
	 * @see #setFromEntity(ChenEntity)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenConnection_FromEntity()
	 * @model required="true"
	 * @generated
	 */
	ChenEntity getFromEntity();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ChenConnection#getFromEntity <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Entity</em>' reference.
	 * @see #getFromEntity()
	 * @generated
	 */
	void setFromEntity(ChenEntity value);

	/**
	 * Returns the value of the '<em><b>To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Relationship</em>' reference.
	 * @see #setToRelationship(ChenRelationship)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenConnection_ToRelationship()
	 * @model required="true"
	 * @generated
	 */
	ChenRelationship getToRelationship();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ChenConnection#getToRelationship <em>To Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Relationship</em>' reference.
	 * @see #getToRelationship()
	 * @generated
	 */
	void setToRelationship(ChenRelationship value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenConnection_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ChenConnection#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ChenConnection
