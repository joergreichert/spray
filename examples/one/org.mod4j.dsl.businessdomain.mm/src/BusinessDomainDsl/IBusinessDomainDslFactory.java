/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.IBusinessDomainDslPackage
 * @generated
 */
public interface IBusinessDomainDslFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IBusinessDomainDslFactory eINSTANCE = BusinessDomainDsl.impl.BusinessDomainDslFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Element</em>'.
     * @generated
     */
    IModelElement createModelElement();

    /**
     * Returns a new object of class '<em>Business Domain Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Domain Model</em>'.
     * @generated
     */
    IBusinessDomainModel createBusinessDomainModel();

    /**
     * Returns a new object of class '<em>Business Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Class</em>'.
     * @generated
     */
    IBusinessClass createBusinessClass();

    /**
     * Returns a new object of class '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration</em>'.
     * @generated
     */
    IEnumeration createEnumeration();

    /**
     * Returns a new object of class '<em>Enumeration Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Literal</em>'.
     * @generated
     */
    IEnumerationLiteral createEnumerationLiteral();

    /**
     * Returns a new object of class '<em>Bool Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bool Property</em>'.
     * @generated
     */
    IBoolProperty createBoolProperty();

    /**
     * Returns a new object of class '<em>Date Time Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Time Property</em>'.
     * @generated
     */
    IDateTimeProperty createDateTimeProperty();

    /**
     * Returns a new object of class '<em>Enumeration Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Property</em>'.
     * @generated
     */
    IEnumerationProperty createEnumerationProperty();

    /**
     * Returns a new object of class '<em>Integer Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Property</em>'.
     * @generated
     */
    IIntegerProperty createIntegerProperty();

    /**
     * Returns a new object of class '<em>String Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Property</em>'.
     * @generated
     */
    IStringProperty createStringProperty();

    /**
     * Returns a new object of class '<em>Blob Binary Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Blob Binary Property</em>'.
     * @generated
     */
    IBlobBinaryProperty createBlobBinaryProperty();

    /**
     * Returns a new object of class '<em>Blob Text Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Blob Text Property</em>'.
     * @generated
     */
    IBlobTextProperty createBlobTextProperty();

    /**
     * Returns a new object of class '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association</em>'.
     * @generated
     */
    IAssociation createAssociation();

    /**
     * Returns a new object of class '<em>Decimal Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Property</em>'.
     * @generated
     */
    IDecimalProperty createDecimalProperty();

    /**
     * Returns a new object of class '<em>Business Class Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Class Reference</em>'.
     * @generated
     */
    IBusinessClassReference createBusinessClassReference();

    /**
     * Returns a new object of class '<em>Unique Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unique Rule</em>'.
     * @generated
     */
    IUniqueRule createUniqueRule();

    /**
     * Returns a new object of class '<em>Business Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Rule</em>'.
     * @generated
     */
    IBusinessRule createBusinessRule();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    IBusinessDomainDslPackage getBusinessDomainDslPackage();

} //IBusinessDomainDslFactory
