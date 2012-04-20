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
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IEnumeration#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link BusinessDomainDsl.IEnumeration#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface IEnumeration extends IModelElement {
    /**
     * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.IEnumerationLiteral}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IEnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumeration_EnumerationLiterals()
     * @see BusinessDomainDsl.IEnumerationLiteral#getEnumeration
     * @model opposite="enumeration" containment="true"
     * @generated
     */
    EList<IEnumerationLiteral> getEnumerationLiterals();

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IBusinessDomainModel#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(IBusinessDomainModel)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getEnumeration_Model()
     * @see BusinessDomainDsl.IBusinessDomainModel#getEnumerations
     * @model opposite="enumerations" transient="false"
     * @generated
     */
    IBusinessDomainModel getModel();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IEnumeration#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(IBusinessDomainModel value);

} // IEnumeration
