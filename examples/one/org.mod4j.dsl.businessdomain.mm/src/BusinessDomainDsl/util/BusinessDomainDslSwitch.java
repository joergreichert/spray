/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.util;

import BusinessDomainDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.IBusinessDomainDslPackage
 * @generated
 */
public class BusinessDomainDslSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static IBusinessDomainDslPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessDomainDslSwitch() {
        if (modelPackage == null) {
            modelPackage = IBusinessDomainDslPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case IBusinessDomainDslPackage.MODEL_ELEMENT: {
                IModelElement modelElement = (IModelElement)theEObject;
                T result = caseModelElement(modelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL: {
                IBusinessDomainModel businessDomainModel = (IBusinessDomainModel)theEObject;
                T result = caseBusinessDomainModel(businessDomainModel);
                if (result == null) result = caseModelElement(businessDomainModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BUSINESS_CLASS: {
                IBusinessClass businessClass = (IBusinessClass)theEObject;
                T result = caseBusinessClass(businessClass);
                if (result == null) result = caseAbstractBusinessClass(businessClass);
                if (result == null) result = caseAbstractType(businessClass);
                if (result == null) result = caseModelElement(businessClass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.PROPERTY: {
                IProperty property = (IProperty)theEObject;
                T result = caseProperty(property);
                if (result == null) result = caseModelElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ENUMERATION: {
                IEnumeration enumeration = (IEnumeration)theEObject;
                T result = caseEnumeration(enumeration);
                if (result == null) result = caseModelElement(enumeration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ENUMERATION_LITERAL: {
                IEnumerationLiteral enumerationLiteral = (IEnumerationLiteral)theEObject;
                T result = caseEnumerationLiteral(enumerationLiteral);
                if (result == null) result = caseModelElement(enumerationLiteral);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE: {
                IAbstractBusinessRule abstractBusinessRule = (IAbstractBusinessRule)theEObject;
                T result = caseAbstractBusinessRule(abstractBusinessRule);
                if (result == null) result = caseModelElement(abstractBusinessRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BOOL_PROPERTY: {
                IBoolProperty boolProperty = (IBoolProperty)theEObject;
                T result = caseBoolProperty(boolProperty);
                if (result == null) result = caseProperty(boolProperty);
                if (result == null) result = caseModelElement(boolProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.DATE_TIME_PROPERTY: {
                IDateTimeProperty dateTimeProperty = (IDateTimeProperty)theEObject;
                T result = caseDateTimeProperty(dateTimeProperty);
                if (result == null) result = caseProperty(dateTimeProperty);
                if (result == null) result = caseModelElement(dateTimeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ENUMERATION_PROPERTY: {
                IEnumerationProperty enumerationProperty = (IEnumerationProperty)theEObject;
                T result = caseEnumerationProperty(enumerationProperty);
                if (result == null) result = caseProperty(enumerationProperty);
                if (result == null) result = caseModelElement(enumerationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.INTEGER_PROPERTY: {
                IIntegerProperty integerProperty = (IIntegerProperty)theEObject;
                T result = caseIntegerProperty(integerProperty);
                if (result == null) result = caseProperty(integerProperty);
                if (result == null) result = caseModelElement(integerProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.STRING_PROPERTY: {
                IStringProperty stringProperty = (IStringProperty)theEObject;
                T result = caseStringProperty(stringProperty);
                if (result == null) result = caseProperty(stringProperty);
                if (result == null) result = caseModelElement(stringProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ABSTRACT_TYPE: {
                IAbstractType abstractType = (IAbstractType)theEObject;
                T result = caseAbstractType(abstractType);
                if (result == null) result = caseModelElement(abstractType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BLOB_BINARY_PROPERTY: {
                IBlobBinaryProperty blobBinaryProperty = (IBlobBinaryProperty)theEObject;
                T result = caseBlobBinaryProperty(blobBinaryProperty);
                if (result == null) result = caseProperty(blobBinaryProperty);
                if (result == null) result = caseModelElement(blobBinaryProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BLOB_TEXT_PROPERTY: {
                IBlobTextProperty blobTextProperty = (IBlobTextProperty)theEObject;
                T result = caseBlobTextProperty(blobTextProperty);
                if (result == null) result = caseProperty(blobTextProperty);
                if (result == null) result = caseModelElement(blobTextProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ASSOCIATION: {
                IAssociation association = (IAssociation)theEObject;
                T result = caseAssociation(association);
                if (result == null) result = caseModelElement(association);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.DECIMAL_PROPERTY: {
                IDecimalProperty decimalProperty = (IDecimalProperty)theEObject;
                T result = caseDecimalProperty(decimalProperty);
                if (result == null) result = caseProperty(decimalProperty);
                if (result == null) result = caseModelElement(decimalProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS: {
                IAbstractBusinessClass abstractBusinessClass = (IAbstractBusinessClass)theEObject;
                T result = caseAbstractBusinessClass(abstractBusinessClass);
                if (result == null) result = caseAbstractType(abstractBusinessClass);
                if (result == null) result = caseModelElement(abstractBusinessClass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE: {
                IBusinessClassReference businessClassReference = (IBusinessClassReference)theEObject;
                T result = caseBusinessClassReference(businessClassReference);
                if (result == null) result = caseAbstractBusinessClass(businessClassReference);
                if (result == null) result = caseAbstractType(businessClassReference);
                if (result == null) result = caseModelElement(businessClassReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.UNIQUE_RULE: {
                IUniqueRule uniqueRule = (IUniqueRule)theEObject;
                T result = caseUniqueRule(uniqueRule);
                if (result == null) result = caseAbstractBusinessRule(uniqueRule);
                if (result == null) result = caseModelElement(uniqueRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IBusinessDomainDslPackage.BUSINESS_RULE: {
                IBusinessRule businessRule = (IBusinessRule)theEObject;
                T result = caseBusinessRule(businessRule);
                if (result == null) result = caseAbstractBusinessRule(businessRule);
                if (result == null) result = caseModelElement(businessRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(IModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Domain Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Domain Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessDomainModel(IBusinessDomainModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessClass(IBusinessClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(IProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumeration(IEnumeration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerationLiteral(IEnumerationLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Business Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Business Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractBusinessRule(IAbstractBusinessRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bool Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bool Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoolProperty(IBoolProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Time Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Time Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateTimeProperty(IDateTimeProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerationProperty(IEnumerationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerProperty(IIntegerProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringProperty(IStringProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractType(IAbstractType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Blob Binary Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Blob Binary Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlobBinaryProperty(IBlobBinaryProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Blob Text Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Blob Text Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlobTextProperty(IBlobTextProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociation(IAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalProperty(IDecimalProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Business Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Business Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractBusinessClass(IAbstractBusinessClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Class Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessClassReference(IBusinessClassReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unique Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unique Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUniqueRule(IUniqueRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessRule(IBusinessRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //BusinessDomainDslSwitch
