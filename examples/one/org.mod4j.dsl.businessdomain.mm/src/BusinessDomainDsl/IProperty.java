/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IProperty#getDataType <em>Data Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.IProperty#isNullable <em>Nullable</em>}</li>
 *   <li>{@link BusinessDomainDsl.IProperty#isDerived <em>Derived</em>}</li>
 *   <li>{@link BusinessDomainDsl.IProperty#isWritable <em>Writable</em>}</li>
 *   <li>{@link BusinessDomainDsl.IProperty#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link BusinessDomainDsl.IProperty#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link BusinessDomainDsl.IProperty#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface IProperty extends IModelElement {
    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see #setDataType(String)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_DataType()
     * @model
     * @generated
     */
    String getDataType();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see #getDataType()
     * @generated
     */
    void setDataType(String value);

    /**
     * Returns the value of the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nullable</em>' attribute.
     * @see #setNullable(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_Nullable()
     * @model
     * @generated
     */
    boolean isNullable();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#isNullable <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nullable</em>' attribute.
     * @see #isNullable()
     * @generated
     */
    void setNullable(boolean value);

    /**
     * Returns the value of the '<em><b>Derived</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Derived</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Derived</em>' attribute.
     * @see #setDerived(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_Derived()
     * @model default="false"
     * @generated
     */
    boolean isDerived();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#isDerived <em>Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Derived</em>' attribute.
     * @see #isDerived()
     * @generated
     */
    void setDerived(boolean value);

    /**
     * Returns the value of the '<em><b>Writable</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Writable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Writable</em>' attribute.
     * @see #setWritable(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_Writable()
     * @model default="false"
     * @generated
     */
    boolean isWritable();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#isWritable <em>Writable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Writable</em>' attribute.
     * @see #isWritable()
     * @generated
     */
    void setWritable(boolean value);

    /**
     * Returns the value of the '<em><b>Persistency</b></em>' attribute.
     * The default value is <code>"ReadWrite"</code>.
     * The literals are from the enumeration {@link BusinessDomainDsl.PersistencyMode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistency</em>' attribute.
     * @see BusinessDomainDsl.PersistencyMode
     * @see #setPersistency(PersistencyMode)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_Persistency()
     * @model default="ReadWrite"
     * @generated
     */
    PersistencyMode getPersistency();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#getPersistency <em>Persistency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persistency</em>' attribute.
     * @see BusinessDomainDsl.PersistencyMode
     * @see #getPersistency()
     * @generated
     */
    void setPersistency(PersistencyMode value);

    /**
     * Returns the value of the '<em><b>Has Default</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Default</em>' attribute.
     * @see #setHasDefault(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_HasDefault()
     * @model default="false"
     * @generated
     */
    boolean isHasDefault();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#isHasDefault <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Has Default</em>' attribute.
     * @see #isHasDefault()
     * @generated
     */
    void setHasDefault(boolean value);

    /**
     * Returns the value of the '<em><b>Owning Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IAbstractType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Type</em>' container reference.
     * @see #setOwningType(IAbstractType)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getProperty_OwningType()
     * @see BusinessDomainDsl.IAbstractType#getProperties
     * @model opposite="properties" transient="false"
     * @generated
     */
    IAbstractType getOwningType();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IProperty#getOwningType <em>Owning Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Type</em>' container reference.
     * @see #getOwningType()
     * @generated
     */
    void setOwningType(IAbstractType value);

} // IProperty
