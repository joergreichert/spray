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
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IAbstractType#getProperties <em>Properties</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAbstractType#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAbstractType()
 * @model abstract="true"
 * @generated
 */
public interface IAbstractType extends IModelElement {
    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.IProperty}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IProperty#getOwningType <em>Owning Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAbstractType_Properties()
     * @see BusinessDomainDsl.IProperty#getOwningType
     * @model opposite="owningType" containment="true"
     * @generated
     */
    EList<IProperty> getProperties();

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IBusinessDomainModel#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(IBusinessDomainModel)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAbstractType_Model()
     * @see BusinessDomainDsl.IBusinessDomainModel#getTypes
     * @model opposite="types" transient="false"
     * @generated
     */
    IBusinessDomainModel getModel();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAbstractType#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(IBusinessDomainModel value);

} // IAbstractType
