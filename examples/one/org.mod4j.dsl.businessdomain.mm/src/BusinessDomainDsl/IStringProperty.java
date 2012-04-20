/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IStringProperty#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link BusinessDomainDsl.IStringProperty#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link BusinessDomainDsl.IStringProperty#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link BusinessDomainDsl.IStringProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getStringProperty()
 * @model
 * @generated
 */
public interface IStringProperty extends IProperty {
    /**
     * Returns the value of the '<em><b>Regular Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regular Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regular Expression</em>' attribute.
     * @see #setRegularExpression(String)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getStringProperty_RegularExpression()
     * @model
     * @generated
     */
    String getRegularExpression();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IStringProperty#getRegularExpression <em>Regular Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regular Expression</em>' attribute.
     * @see #getRegularExpression()
     * @generated
     */
    void setRegularExpression(String value);

    /**
     * Returns the value of the '<em><b>Min Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length</em>' attribute.
     * @see #setMinLength(int)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getStringProperty_MinLength()
     * @model default="-1"
     * @generated
     */
    int getMinLength();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IStringProperty#getMinLength <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length</em>' attribute.
     * @see #getMinLength()
     * @generated
     */
    void setMinLength(int value);

    /**
     * Returns the value of the '<em><b>Max Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length</em>' attribute.
     * @see #setMaxLength(int)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getStringProperty_MaxLength()
     * @model default="-1"
     * @generated
     */
    int getMaxLength();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IStringProperty#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #getMaxLength()
     * @generated
     */
    void setMaxLength(int value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getStringProperty_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IStringProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

} // IStringProperty
