/**
 */
package ErdiagramDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chen Weak Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.ChenWeakAttribute#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenWeakAttribute()
 * @model
 * @generated
 */
public interface ChenWeakAttribute extends ChenWeakElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ChenWeakElement)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getChenWeakAttribute_Parent()
	 * @model required="true"
	 * @generated
	 */
	ChenWeakElement getParent();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ChenWeakAttribute#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ChenWeakElement value);

} // ChenWeakAttribute
