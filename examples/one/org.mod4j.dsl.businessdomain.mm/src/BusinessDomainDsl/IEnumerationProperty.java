/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IEnumerationProperty#getType <em>Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.IEnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumerationProperty()
 * @model
 * @generated
 */
public interface IEnumerationProperty extends IProperty {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(IEnumeration)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumerationProperty_Type()
     * @model required="true"
     * @generated
     */
    IEnumeration getType();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IEnumerationProperty#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(IEnumeration value);

    /**
     * Returns the value of the '<em><b>Default Value As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value As String</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value As String</em>' attribute.
     * @see #setDefaultValueAsString(String)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumerationProperty_DefaultValueAsString()
     * @model
     * @generated
     */
    String getDefaultValueAsString();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IEnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value As String</em>' attribute.
     * @see #getDefaultValueAsString()
     * @generated
     */
    void setDefaultValueAsString(String value);

} // IEnumerationProperty
