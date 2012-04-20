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
 * A representation of the model object '<em><b>Business Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IBusinessDomainModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link BusinessDomainDsl.IBusinessDomainModel#getTypes <em>Types</em>}</li>
 *   <li>{@link BusinessDomainDsl.IBusinessDomainModel#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessDomainModel()
 * @model
 * @generated
 */
public interface IBusinessDomainModel extends IModelElement {
    /**
     * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.IEnumeration}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IEnumeration#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumerations</em>' containment reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessDomainModel_Enumerations()
     * @see BusinessDomainDsl.IEnumeration#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<IEnumeration> getEnumerations();

    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.IAbstractType}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IAbstractType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessDomainModel_Types()
     * @see BusinessDomainDsl.IAbstractType#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<IAbstractType> getTypes();

    /**
     * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.IAssociation}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IAssociation#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Associations</em>' containment reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getBusinessDomainModel_Associations()
     * @see BusinessDomainDsl.IAssociation#getModel
     * @model opposite="model" containment="true" ordered="false"
     * @generated
     */
    EList<IAssociation> getAssociations();

} // IBusinessDomainModel
