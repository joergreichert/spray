/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IAbstractBusinessRule#getBusinessClass <em>Business Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAbstractBusinessRule()
 * @model abstract="true"
 * @generated
 */
public interface IAbstractBusinessRule extends IModelElement {
    /**
     * Returns the value of the '<em><b>Business Class</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IBusinessClass#getBusinessRules <em>Business Rules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Class</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Class</em>' container reference.
     * @see #setBusinessClass(IBusinessClass)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAbstractBusinessRule_BusinessClass()
     * @see BusinessDomainDsl.IBusinessClass#getBusinessRules
     * @model opposite="businessRules" transient="false"
     * @generated
     */
    IBusinessClass getBusinessClass();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAbstractBusinessRule#getBusinessClass <em>Business Class</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Class</em>' container reference.
     * @see #getBusinessClass()
     * @generated
     */
    void setBusinessClass(IBusinessClass value);

} // IAbstractBusinessRule
