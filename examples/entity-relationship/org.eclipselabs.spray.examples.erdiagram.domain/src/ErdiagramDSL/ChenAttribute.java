/**
 */
package ErdiagramDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chen Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.ChenAttribute#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenAttribute()
 * @model
 * @generated
 */
public interface ChenAttribute extends ChenElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ChenElement)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenAttribute_Parent()
	 * @model required="true"
	 * @generated
	 */
	ChenElement getParent();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ChenAttribute#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ChenElement value);

} // ChenAttribute
