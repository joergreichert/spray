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
 * A representation of the model object '<em><b>Unique Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IUniqueRule#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getUniqueRule()
 * @model
 * @generated
 */
public interface IUniqueRule extends IAbstractBusinessRule {
    /**
     * Returns the value of the '<em><b>Properties</b></em>' reference list.
     * The list contents are of type {@link BusinessDomainDsl.IProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' reference list.
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getUniqueRule_Properties()
     * @model
     * @generated
     */
    EList<IProperty> getProperties();

} // IUniqueRule
