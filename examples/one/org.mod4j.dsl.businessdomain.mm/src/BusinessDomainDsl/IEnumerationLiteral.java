/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.IEnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface IEnumerationLiteral extends IModelElement {
    /**
     * Returns the value of the '<em><b>Persisted Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persisted Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persisted Value</em>' attribute.
     * @see #setPersistedValue(int)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumerationLiteral_PersistedValue()
     * @model
     * @generated
     */
    int getPersistedValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persisted Value</em>' attribute.
     * @see #getPersistedValue()
     * @generated
     */
    void setPersistedValue(int value);

    /**
     * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IEnumeration#getEnumerationLiterals <em>Enumeration Literals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration</em>' container reference.
     * @see #setEnumeration(IEnumeration)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumerationLiteral_Enumeration()
     * @see BusinessDomainDsl.IEnumeration#getEnumerationLiterals
     * @model opposite="enumerationLiterals" transient="false"
     * @generated
     */
    IEnumeration getEnumeration();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IEnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumeration</em>' container reference.
     * @see #getEnumeration()
     * @generated
     */
    void setEnumeration(IEnumeration value);

} // IEnumerationLiteral
