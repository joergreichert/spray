/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IBoolProperty#isDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBoolProperty()
 * @model
 * @generated
 */
public interface IBoolProperty extends IProperty {
    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBoolProperty_DefaultValue()
     * @model default="false"
     * @generated
     */
    boolean isDefaultValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IBoolProperty#isDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #isDefaultValue()
     * @generated
     */
    void setDefaultValue(boolean value);

} // IBoolProperty
