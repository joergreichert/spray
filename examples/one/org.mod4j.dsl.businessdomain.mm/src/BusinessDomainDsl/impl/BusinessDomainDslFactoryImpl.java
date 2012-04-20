/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainDslFactoryImpl extends EFactoryImpl implements IBusinessDomainDslFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IBusinessDomainDslFactory init() {
        try {
            IBusinessDomainDslFactory theBusinessDomainDslFactory = (IBusinessDomainDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mod4j.org/busmod"); 
            if (theBusinessDomainDslFactory != null) {
                return theBusinessDomainDslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BusinessDomainDslFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessDomainDslFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case IBusinessDomainDslPackage.MODEL_ELEMENT: return createModelElement();
            case IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL: return createBusinessDomainModel();
            case IBusinessDomainDslPackage.BUSINESS_CLASS: return createBusinessClass();
            case IBusinessDomainDslPackage.ENUMERATION: return createEnumeration();
            case IBusinessDomainDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
            case IBusinessDomainDslPackage.BOOL_PROPERTY: return createBoolProperty();
            case IBusinessDomainDslPackage.DATE_TIME_PROPERTY: return createDateTimeProperty();
            case IBusinessDomainDslPackage.ENUMERATION_PROPERTY: return createEnumerationProperty();
            case IBusinessDomainDslPackage.INTEGER_PROPERTY: return createIntegerProperty();
            case IBusinessDomainDslPackage.STRING_PROPERTY: return createStringProperty();
            case IBusinessDomainDslPackage.BLOB_BINARY_PROPERTY: return createBlobBinaryProperty();
            case IBusinessDomainDslPackage.BLOB_TEXT_PROPERTY: return createBlobTextProperty();
            case IBusinessDomainDslPackage.ASSOCIATION: return createAssociation();
            case IBusinessDomainDslPackage.DECIMAL_PROPERTY: return createDecimalProperty();
            case IBusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE: return createBusinessClassReference();
            case IBusinessDomainDslPackage.UNIQUE_RULE: return createUniqueRule();
            case IBusinessDomainDslPackage.BUSINESS_RULE: return createBusinessRule();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case IBusinessDomainDslPackage.MULTIPLICITY:
                return createMultiplicityFromString(eDataType, initialValue);
            case IBusinessDomainDslPackage.DATE_TIME_ACCURACY:
                return createDateTimeAccuracyFromString(eDataType, initialValue);
            case IBusinessDomainDslPackage.PERSISTENCY_MODE:
                return createPersistencyModeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case IBusinessDomainDslPackage.MULTIPLICITY:
                return convertMultiplicityToString(eDataType, instanceValue);
            case IBusinessDomainDslPackage.DATE_TIME_ACCURACY:
                return convertDateTimeAccuracyToString(eDataType, instanceValue);
            case IBusinessDomainDslPackage.PERSISTENCY_MODE:
                return convertPersistencyModeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IModelElement createModelElement() {
        ModelElementImpl modelElement = new ModelElementImpl();
        return modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessDomainModel createBusinessDomainModel() {
        BusinessDomainModelImpl businessDomainModel = new BusinessDomainModelImpl();
        return businessDomainModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClass createBusinessClass() {
        BusinessClassImpl businessClass = new BusinessClassImpl();
        return businessClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IEnumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IEnumerationLiteral createEnumerationLiteral() {
        EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
        return enumerationLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBoolProperty createBoolProperty() {
        BoolPropertyImpl boolProperty = new BoolPropertyImpl();
        return boolProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IDateTimeProperty createDateTimeProperty() {
        DateTimePropertyImpl dateTimeProperty = new DateTimePropertyImpl();
        return dateTimeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IEnumerationProperty createEnumerationProperty() {
        EnumerationPropertyImpl enumerationProperty = new EnumerationPropertyImpl();
        return enumerationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IIntegerProperty createIntegerProperty() {
        IntegerPropertyImpl integerProperty = new IntegerPropertyImpl();
        return integerProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IStringProperty createStringProperty() {
        StringPropertyImpl stringProperty = new StringPropertyImpl();
        return stringProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBlobBinaryProperty createBlobBinaryProperty() {
        BlobBinaryPropertyImpl blobBinaryProperty = new BlobBinaryPropertyImpl();
        return blobBinaryProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBlobTextProperty createBlobTextProperty() {
        BlobTextPropertyImpl blobTextProperty = new BlobTextPropertyImpl();
        return blobTextProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IAssociation createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IDecimalProperty createDecimalProperty() {
        DecimalPropertyImpl decimalProperty = new DecimalPropertyImpl();
        return decimalProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClassReference createBusinessClassReference() {
        BusinessClassReferenceImpl businessClassReference = new BusinessClassReferenceImpl();
        return businessClassReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IUniqueRule createUniqueRule() {
        UniqueRuleImpl uniqueRule = new UniqueRuleImpl();
        return uniqueRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessRule createBusinessRule() {
        BusinessRuleImpl businessRule = new BusinessRuleImpl();
        return businessRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
        Multiplicity result = Multiplicity.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateTimeAccuracy createDateTimeAccuracyFromString(EDataType eDataType, String initialValue) {
        DateTimeAccuracy result = DateTimeAccuracy.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateTimeAccuracyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersistencyMode createPersistencyModeFromString(EDataType eDataType, String initialValue) {
        PersistencyMode result = PersistencyMode.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPersistencyModeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessDomainDslPackage getBusinessDomainDslPackage() {
        return (IBusinessDomainDslPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static IBusinessDomainDslPackage getPackage() {
        return IBusinessDomainDslPackage.eINSTANCE;
    }

} //BusinessDomainDslFactoryImpl
