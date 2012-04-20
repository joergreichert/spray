/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IBusinessClass#getBusinessRules <em>Business Rules</em>}</li>
 *   <li>{@link BusinessDomainDsl.IBusinessClass#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link BusinessDomainDsl.IBusinessClass#getAssociationsTo <em>Associations To</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessClass()
 * @model
 * @generated
 */
public interface IBusinessClass extends IAbstractBusinessClass {
    /**
     * Returns the value of the '<em><b>Business Rules</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.IAbstractBusinessRule}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IAbstractBusinessRule#getBusinessClass <em>Business Class</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Rules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Rules</em>' containment reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessClass_BusinessRules()
     * @see BusinessDomainDsl.IAbstractBusinessRule#getBusinessClass
     * @model opposite="businessClass" containment="true"
     * @generated
     */
    EList<IAbstractBusinessRule> getBusinessRules();

    /**
     * Returns the value of the '<em><b>Superclass</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Superclass</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Superclass</em>' reference.
     * @see #setSuperclass(IBusinessClass)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessClass_Superclass()
     * @model
     * @generated
     */
    IBusinessClass getSuperclass();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IBusinessClass#getSuperclass <em>Superclass</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Superclass</em>' reference.
     * @see #getSuperclass()
     * @generated
     */
    void setSuperclass(IBusinessClass value);

    /**
     * Returns the value of the '<em><b>Associations To</b></em>' reference list.
     * The list contents are of type {@link BusinessDomainDsl.IAssociation}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IAssociation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Associations To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Associations To</em>' reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessClass_AssociationsTo()
     * @see BusinessDomainDsl.IAssociation#getSource
     * @model opposite="source"
     * @generated
     */
    EList<IAssociation> getAssociationsTo();

} // IBusinessClass
