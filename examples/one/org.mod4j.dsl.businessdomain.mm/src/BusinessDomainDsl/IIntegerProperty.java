/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IIntegerProperty#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.IIntegerProperty#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.IIntegerProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getIntegerProperty()
 * @model
 * @generated
 */
public interface IIntegerProperty extends IProperty {
    /**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute.
     * The default value is <code>"-2147483648"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #setMinValue(int)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getIntegerProperty_MinValue()
     * @model default="-2147483648"
     * @generated
     */
    int getMinValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IIntegerProperty#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #getMinValue()
     * @generated
     */
    void setMinValue(int value);

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * The default value is <code>"2147483647"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #setMaxValue(int)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getIntegerProperty_MaxValue()
     * @model default="2147483647"
     * @generated
     */
    int getMaxValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IIntegerProperty#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue(int value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(int)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getIntegerProperty_DefaultValue()
     * @model
     * @generated
     */
    int getDefaultValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IIntegerProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(int value);

} // IIntegerProperty
