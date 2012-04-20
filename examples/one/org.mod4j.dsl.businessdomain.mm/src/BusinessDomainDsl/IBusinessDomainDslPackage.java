/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.IBusinessDomainDslFactory
 * @model kind="package"
 * @generated
 */
public interface IBusinessDomainDslPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "BusinessDomainDsl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.mod4j.org/busmod";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "busmod";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IBusinessDomainDslPackage eINSTANCE = BusinessDomainDsl.impl.BusinessDomainDslPackageImpl.init();

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.ModelElementImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getModelElement()
     * @generated
     */
    int MODEL_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Model Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessDomainModelImpl <em>Business Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessDomainModelImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessDomainModel()
     * @generated
     */
    int BUSINESS_DOMAIN_MODEL = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__ENUMERATIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__TYPES = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__ASSOCIATIONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Business Domain Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.AbstractTypeImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractType()
     * @generated
     */
    int ABSTRACT_TYPE = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__PROPERTIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abstract Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.AbstractBusinessClassImpl <em>Abstract Business Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.AbstractBusinessClassImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractBusinessClass()
     * @generated
     */
    int ABSTRACT_BUSINESS_CLASS = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_CLASS__NAME = ABSTRACT_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_CLASS__DESCRIPTION = ABSTRACT_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_CLASS__PROPERTIES = ABSTRACT_TYPE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_CLASS__MODEL = ABSTRACT_TYPE__MODEL;

    /**
     * The feature id for the '<em><b>Associations From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM = ABSTRACT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Business Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessClassImpl <em>Business Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessClassImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessClass()
     * @generated
     */
    int BUSINESS_CLASS = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__NAME = ABSTRACT_BUSINESS_CLASS__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__DESCRIPTION = ABSTRACT_BUSINESS_CLASS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__PROPERTIES = ABSTRACT_BUSINESS_CLASS__PROPERTIES;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__MODEL = ABSTRACT_BUSINESS_CLASS__MODEL;

    /**
     * The feature id for the '<em><b>Associations From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__ASSOCIATIONS_FROM = ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM;

    /**
     * The feature id for the '<em><b>Business Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__BUSINESS_RULES = ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Superclass</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__SUPERCLASS = ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Associations To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__ASSOCIATIONS_TO = ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Business Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_FEATURE_COUNT = ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.PropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DATA_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NULLABLE = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DERIVED = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__WRITABLE = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PERSISTENCY = MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__HAS_DEFAULT = MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__OWNING_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.EnumerationImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Enumeration Literals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__ENUMERATION_LITERALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.EnumerationLiteralImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationLiteral()
     * @generated
     */
    int ENUMERATION_LITERAL = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Persisted Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__PERSISTED_VALUE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Enumeration</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__ENUMERATION = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enumeration Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.AbstractBusinessRuleImpl <em>Abstract Business Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.AbstractBusinessRuleImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractBusinessRule()
     * @generated
     */
    int ABSTRACT_BUSINESS_RULE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_RULE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_RULE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Business Class</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Business Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BUSINESS_RULE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BoolPropertyImpl <em>Bool Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BoolPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBoolProperty()
     * @generated
     */
    int BOOL_PROPERTY = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bool Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.DateTimePropertyImpl <em>Date Time Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.DateTimePropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeProperty()
     * @generated
     */
    int DATE_TIME_PROPERTY = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The feature id for the '<em><b>Accuracy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__ACCURACY = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Date Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationPropertyImpl <em>Enumeration Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.EnumerationPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationProperty()
     * @generated
     */
    int ENUMERATION_PROPERTY = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Value As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enumeration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.IntegerPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getIntegerProperty()
     * @generated
     */
    int INTEGER_PROPERTY = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__MIN_VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__MAX_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Integer Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.StringPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getStringProperty()
     * @generated
     */
    int STRING_PROPERTY = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The feature id for the '<em><b>Regular Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__REGULAR_EXPRESSION = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Min Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__MIN_LENGTH = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__MAX_LENGTH = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BlobBinaryPropertyImpl <em>Blob Binary Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BlobBinaryPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobBinaryProperty()
     * @generated
     */
    int BLOB_BINARY_PROPERTY = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The number of structural features of the '<em>Blob Binary Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BlobTextPropertyImpl <em>Blob Text Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BlobTextPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobTextProperty()
     * @generated
     */
    int BLOB_TEXT_PROPERTY = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The number of structural features of the '<em>Blob Text Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.AssociationImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Role Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE_ROLE_NAME = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE_MULTIPLICITY = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Target Role Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET_ROLE_NAME = MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET_MULTIPLICITY = MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Composite</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__COMPOSITE = MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__BIDIRECTIONAL = MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ORDERED = MODEL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.DecimalPropertyImpl <em>Decimal Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.DecimalPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDecimalProperty()
     * @generated
     */
    int DECIMAL_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DERIVED = PROPERTY__DERIVED;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__WRITABLE = PROPERTY__WRITABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Owning Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__OWNING_TYPE = PROPERTY__OWNING_TYPE;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MIN_VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MAX_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MIN_INCLUSIVE = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MAX_INCLUSIVE = PROPERTY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Decimal Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessClassReferenceImpl <em>Business Class Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessClassReferenceImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessClassReference()
     * @generated
     */
    int BUSINESS_CLASS_REFERENCE = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__NAME = ABSTRACT_BUSINESS_CLASS__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__DESCRIPTION = ABSTRACT_BUSINESS_CLASS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__PROPERTIES = ABSTRACT_BUSINESS_CLASS__PROPERTIES;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__MODEL = ABSTRACT_BUSINESS_CLASS__MODEL;

    /**
     * The feature id for the '<em><b>Associations From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__ASSOCIATIONS_FROM = ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM;

    /**
     * The feature id for the '<em><b>Referred Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__REFERRED_MODEL = ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Business Class Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE_FEATURE_COUNT = ABSTRACT_BUSINESS_CLASS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.UniqueRuleImpl <em>Unique Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.UniqueRuleImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getUniqueRule()
     * @generated
     */
    int UNIQUE_RULE = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_RULE__NAME = ABSTRACT_BUSINESS_RULE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_RULE__DESCRIPTION = ABSTRACT_BUSINESS_RULE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Business Class</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_RULE__BUSINESS_CLASS = ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS;

    /**
     * The feature id for the '<em><b>Properties</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_RULE__PROPERTIES = ABSTRACT_BUSINESS_RULE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Unique Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_RULE_FEATURE_COUNT = ABSTRACT_BUSINESS_RULE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessRuleImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessRule()
     * @generated
     */
    int BUSINESS_RULE = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE__NAME = ABSTRACT_BUSINESS_RULE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE__DESCRIPTION = ABSTRACT_BUSINESS_RULE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Business Class</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE__BUSINESS_CLASS = ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS;

    /**
     * The number of structural features of the '<em>Business Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_FEATURE_COUNT = ABSTRACT_BUSINESS_RULE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.Multiplicity
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getMultiplicity()
     * @generated
     */
    int MULTIPLICITY = 21;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.DateTimeAccuracy
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeAccuracy()
     * @generated
     */
    int DATE_TIME_ACCURACY = 22;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.PersistencyMode
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPersistencyMode()
     * @generated
     */
    int PERSISTENCY_MODE = 23;


    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Element</em>'.
     * @see BusinessDomainDsl.IModelElement
     * @generated
     */
    EClass getModelElement();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IModelElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see BusinessDomainDsl.IModelElement#getName()
     * @see #getModelElement()
     * @generated
     */
    EAttribute getModelElement_Name();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IModelElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see BusinessDomainDsl.IModelElement#getDescription()
     * @see #getModelElement()
     * @generated
     */
    EAttribute getModelElement_Description();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBusinessDomainModel <em>Business Domain Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Domain Model</em>'.
     * @see BusinessDomainDsl.IBusinessDomainModel
     * @generated
     */
    EClass getBusinessDomainModel();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.IBusinessDomainModel#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumerations</em>'.
     * @see BusinessDomainDsl.IBusinessDomainModel#getEnumerations()
     * @see #getBusinessDomainModel()
     * @generated
     */
    EReference getBusinessDomainModel_Enumerations();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.IBusinessDomainModel#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see BusinessDomainDsl.IBusinessDomainModel#getTypes()
     * @see #getBusinessDomainModel()
     * @generated
     */
    EReference getBusinessDomainModel_Types();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.IBusinessDomainModel#getAssociations <em>Associations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Associations</em>'.
     * @see BusinessDomainDsl.IBusinessDomainModel#getAssociations()
     * @see #getBusinessDomainModel()
     * @generated
     */
    EReference getBusinessDomainModel_Associations();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBusinessClass <em>Business Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class</em>'.
     * @see BusinessDomainDsl.IBusinessClass
     * @generated
     */
    EClass getBusinessClass();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.IBusinessClass#getBusinessRules <em>Business Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Rules</em>'.
     * @see BusinessDomainDsl.IBusinessClass#getBusinessRules()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_BusinessRules();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.IBusinessClass#getSuperclass <em>Superclass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Superclass</em>'.
     * @see BusinessDomainDsl.IBusinessClass#getSuperclass()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_Superclass();

    /**
     * Returns the meta object for the reference list '{@link BusinessDomainDsl.IBusinessClass#getAssociationsTo <em>Associations To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Associations To</em>'.
     * @see BusinessDomainDsl.IBusinessClass#getAssociationsTo()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_AssociationsTo();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see BusinessDomainDsl.IProperty
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IProperty#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see BusinessDomainDsl.IProperty#getDataType()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_DataType();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IProperty#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see BusinessDomainDsl.IProperty#isNullable()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Nullable();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IProperty#isDerived <em>Derived</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Derived</em>'.
     * @see BusinessDomainDsl.IProperty#isDerived()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Derived();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IProperty#isWritable <em>Writable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Writable</em>'.
     * @see BusinessDomainDsl.IProperty#isWritable()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Writable();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IProperty#getPersistency <em>Persistency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistency</em>'.
     * @see BusinessDomainDsl.IProperty#getPersistency()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Persistency();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IProperty#isHasDefault <em>Has Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Has Default</em>'.
     * @see BusinessDomainDsl.IProperty#isHasDefault()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_HasDefault();

    /**
     * Returns the meta object for the container reference '{@link BusinessDomainDsl.IProperty#getOwningType <em>Owning Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owning Type</em>'.
     * @see BusinessDomainDsl.IProperty#getOwningType()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_OwningType();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration</em>'.
     * @see BusinessDomainDsl.IEnumeration
     * @generated
     */
    EClass getEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.IEnumeration#getEnumerationLiterals <em>Enumeration Literals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumeration Literals</em>'.
     * @see BusinessDomainDsl.IEnumeration#getEnumerationLiterals()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_EnumerationLiterals();

    /**
     * Returns the meta object for the container reference '{@link BusinessDomainDsl.IEnumeration#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see BusinessDomainDsl.IEnumeration#getModel()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_Model();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IEnumerationLiteral <em>Enumeration Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Literal</em>'.
     * @see BusinessDomainDsl.IEnumerationLiteral
     * @generated
     */
    EClass getEnumerationLiteral();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persisted Value</em>'.
     * @see BusinessDomainDsl.IEnumerationLiteral#getPersistedValue()
     * @see #getEnumerationLiteral()
     * @generated
     */
    EAttribute getEnumerationLiteral_PersistedValue();

    /**
     * Returns the meta object for the container reference '{@link BusinessDomainDsl.IEnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Enumeration</em>'.
     * @see BusinessDomainDsl.IEnumerationLiteral#getEnumeration()
     * @see #getEnumerationLiteral()
     * @generated
     */
    EReference getEnumerationLiteral_Enumeration();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IAbstractBusinessRule <em>Abstract Business Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Business Rule</em>'.
     * @see BusinessDomainDsl.IAbstractBusinessRule
     * @generated
     */
    EClass getAbstractBusinessRule();

    /**
     * Returns the meta object for the container reference '{@link BusinessDomainDsl.IAbstractBusinessRule#getBusinessClass <em>Business Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Class</em>'.
     * @see BusinessDomainDsl.IAbstractBusinessRule#getBusinessClass()
     * @see #getAbstractBusinessRule()
     * @generated
     */
    EReference getAbstractBusinessRule_BusinessClass();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBoolProperty <em>Bool Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bool Property</em>'.
     * @see BusinessDomainDsl.IBoolProperty
     * @generated
     */
    EClass getBoolProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IBoolProperty#isDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.IBoolProperty#isDefaultValue()
     * @see #getBoolProperty()
     * @generated
     */
    EAttribute getBoolProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IDateTimeProperty <em>Date Time Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Time Property</em>'.
     * @see BusinessDomainDsl.IDateTimeProperty
     * @generated
     */
    EClass getDateTimeProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDateTimeProperty#getAccuracy <em>Accuracy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Accuracy</em>'.
     * @see BusinessDomainDsl.IDateTimeProperty#getAccuracy()
     * @see #getDateTimeProperty()
     * @generated
     */
    EAttribute getDateTimeProperty_Accuracy();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDateTimeProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.IDateTimeProperty#getDefaultValue()
     * @see #getDateTimeProperty()
     * @generated
     */
    EAttribute getDateTimeProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IEnumerationProperty <em>Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Property</em>'.
     * @see BusinessDomainDsl.IEnumerationProperty
     * @generated
     */
    EClass getEnumerationProperty();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.IEnumerationProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see BusinessDomainDsl.IEnumerationProperty#getType()
     * @see #getEnumerationProperty()
     * @generated
     */
    EReference getEnumerationProperty_Type();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IEnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value As String</em>'.
     * @see BusinessDomainDsl.IEnumerationProperty#getDefaultValueAsString()
     * @see #getEnumerationProperty()
     * @generated
     */
    EAttribute getEnumerationProperty_DefaultValueAsString();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IIntegerProperty <em>Integer Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Property</em>'.
     * @see BusinessDomainDsl.IIntegerProperty
     * @generated
     */
    EClass getIntegerProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IIntegerProperty#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see BusinessDomainDsl.IIntegerProperty#getMinValue()
     * @see #getIntegerProperty()
     * @generated
     */
    EAttribute getIntegerProperty_MinValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IIntegerProperty#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see BusinessDomainDsl.IIntegerProperty#getMaxValue()
     * @see #getIntegerProperty()
     * @generated
     */
    EAttribute getIntegerProperty_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IIntegerProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.IIntegerProperty#getDefaultValue()
     * @see #getIntegerProperty()
     * @generated
     */
    EAttribute getIntegerProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IStringProperty <em>String Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Property</em>'.
     * @see BusinessDomainDsl.IStringProperty
     * @generated
     */
    EClass getStringProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IStringProperty#getRegularExpression <em>Regular Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Regular Expression</em>'.
     * @see BusinessDomainDsl.IStringProperty#getRegularExpression()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_RegularExpression();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IStringProperty#getMinLength <em>Min Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Length</em>'.
     * @see BusinessDomainDsl.IStringProperty#getMinLength()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_MinLength();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IStringProperty#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Length</em>'.
     * @see BusinessDomainDsl.IStringProperty#getMaxLength()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_MaxLength();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IStringProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.IStringProperty#getDefaultValue()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IAbstractType <em>Abstract Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Type</em>'.
     * @see BusinessDomainDsl.IAbstractType
     * @generated
     */
    EClass getAbstractType();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.IAbstractType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see BusinessDomainDsl.IAbstractType#getProperties()
     * @see #getAbstractType()
     * @generated
     */
    EReference getAbstractType_Properties();

    /**
     * Returns the meta object for the container reference '{@link BusinessDomainDsl.IAbstractType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see BusinessDomainDsl.IAbstractType#getModel()
     * @see #getAbstractType()
     * @generated
     */
    EReference getAbstractType_Model();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBlobBinaryProperty <em>Blob Binary Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Blob Binary Property</em>'.
     * @see BusinessDomainDsl.IBlobBinaryProperty
     * @generated
     */
    EClass getBlobBinaryProperty();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBlobTextProperty <em>Blob Text Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Blob Text Property</em>'.
     * @see BusinessDomainDsl.IBlobTextProperty
     * @generated
     */
    EClass getBlobTextProperty();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see BusinessDomainDsl.IAssociation
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.IAssociation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see BusinessDomainDsl.IAssociation#getSource()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Source();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.IAssociation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see BusinessDomainDsl.IAssociation#getTarget()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Target();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#getSourceRoleName <em>Source Role Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Role Name</em>'.
     * @see BusinessDomainDsl.IAssociation#getSourceRoleName()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_SourceRoleName();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#getSourceMultiplicity <em>Source Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
     * @see BusinessDomainDsl.IAssociation#getSourceMultiplicity()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_SourceMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#getTargetRoleName <em>Target Role Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Role Name</em>'.
     * @see BusinessDomainDsl.IAssociation#getTargetRoleName()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_TargetRoleName();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#getTargetMultiplicity <em>Target Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
     * @see BusinessDomainDsl.IAssociation#getTargetMultiplicity()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_TargetMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#isComposite <em>Composite</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Composite</em>'.
     * @see BusinessDomainDsl.IAssociation#isComposite()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_Composite();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#isBidirectional <em>Bidirectional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bidirectional</em>'.
     * @see BusinessDomainDsl.IAssociation#isBidirectional()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_Bidirectional();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IAssociation#isOrdered <em>Ordered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ordered</em>'.
     * @see BusinessDomainDsl.IAssociation#isOrdered()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_Ordered();

    /**
     * Returns the meta object for the container reference '{@link BusinessDomainDsl.IAssociation#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see BusinessDomainDsl.IAssociation#getModel()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Model();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IDecimalProperty <em>Decimal Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Property</em>'.
     * @see BusinessDomainDsl.IDecimalProperty
     * @generated
     */
    EClass getDecimalProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDecimalProperty#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see BusinessDomainDsl.IDecimalProperty#getMinValue()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MinValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDecimalProperty#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see BusinessDomainDsl.IDecimalProperty#getMaxValue()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDecimalProperty#isMinInclusive <em>Min Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Inclusive</em>'.
     * @see BusinessDomainDsl.IDecimalProperty#isMinInclusive()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MinInclusive();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDecimalProperty#isMaxInclusive <em>Max Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Inclusive</em>'.
     * @see BusinessDomainDsl.IDecimalProperty#isMaxInclusive()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MaxInclusive();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IDecimalProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.IDecimalProperty#getDefaultValue()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IAbstractBusinessClass <em>Abstract Business Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Business Class</em>'.
     * @see BusinessDomainDsl.IAbstractBusinessClass
     * @generated
     */
    EClass getAbstractBusinessClass();

    /**
     * Returns the meta object for the reference list '{@link BusinessDomainDsl.IAbstractBusinessClass#getAssociationsFrom <em>Associations From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Associations From</em>'.
     * @see BusinessDomainDsl.IAbstractBusinessClass#getAssociationsFrom()
     * @see #getAbstractBusinessClass()
     * @generated
     */
    EReference getAbstractBusinessClass_AssociationsFrom();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBusinessClassReference <em>Business Class Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Reference</em>'.
     * @see BusinessDomainDsl.IBusinessClassReference
     * @generated
     */
    EClass getBusinessClassReference();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IBusinessClassReference#getReferredModel <em>Referred Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Referred Model</em>'.
     * @see BusinessDomainDsl.IBusinessClassReference#getReferredModel()
     * @see #getBusinessClassReference()
     * @generated
     */
    EAttribute getBusinessClassReference_ReferredModel();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IUniqueRule <em>Unique Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unique Rule</em>'.
     * @see BusinessDomainDsl.IUniqueRule
     * @generated
     */
    EClass getUniqueRule();

    /**
     * Returns the meta object for the reference list '{@link BusinessDomainDsl.IUniqueRule#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Properties</em>'.
     * @see BusinessDomainDsl.IUniqueRule#getProperties()
     * @see #getUniqueRule()
     * @generated
     */
    EReference getUniqueRule_Properties();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IBusinessRule <em>Business Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Rule</em>'.
     * @see BusinessDomainDsl.IBusinessRule
     * @generated
     */
    EClass getBusinessRule();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplicity</em>'.
     * @see BusinessDomainDsl.Multiplicity
     * @generated
     */
    EEnum getMultiplicity();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Date Time Accuracy</em>'.
     * @see BusinessDomainDsl.DateTimeAccuracy
     * @generated
     */
    EEnum getDateTimeAccuracy();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Persistency Mode</em>'.
     * @see BusinessDomainDsl.PersistencyMode
     * @generated
     */
    EEnum getPersistencyMode();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    IBusinessDomainDslFactory getBusinessDomainDslFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.ModelElementImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getModelElement()
         * @generated
         */
        EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessDomainModelImpl <em>Business Domain Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessDomainModelImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessDomainModel()
         * @generated
         */
        EClass BUSINESS_DOMAIN_MODEL = eINSTANCE.getBusinessDomainModel();

        /**
         * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_DOMAIN_MODEL__ENUMERATIONS = eINSTANCE.getBusinessDomainModel_Enumerations();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_DOMAIN_MODEL__TYPES = eINSTANCE.getBusinessDomainModel_Types();

        /**
         * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_DOMAIN_MODEL__ASSOCIATIONS = eINSTANCE.getBusinessDomainModel_Associations();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessClassImpl <em>Business Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessClassImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessClass()
         * @generated
         */
        EClass BUSINESS_CLASS = eINSTANCE.getBusinessClass();

        /**
         * The meta object literal for the '<em><b>Business Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__BUSINESS_RULES = eINSTANCE.getBusinessClass_BusinessRules();

        /**
         * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__SUPERCLASS = eINSTANCE.getBusinessClass_Superclass();

        /**
         * The meta object literal for the '<em><b>Associations To</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__ASSOCIATIONS_TO = eINSTANCE.getBusinessClass_AssociationsTo();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.PropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__DATA_TYPE = eINSTANCE.getProperty_DataType();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__NULLABLE = eINSTANCE.getProperty_Nullable();

        /**
         * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__DERIVED = eINSTANCE.getProperty_Derived();

        /**
         * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__WRITABLE = eINSTANCE.getProperty_Writable();

        /**
         * The meta object literal for the '<em><b>Persistency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__PERSISTENCY = eINSTANCE.getProperty_Persistency();

        /**
         * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__HAS_DEFAULT = eINSTANCE.getProperty_HasDefault();

        /**
         * The meta object literal for the '<em><b>Owning Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__OWNING_TYPE = eINSTANCE.getProperty_OwningType();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.EnumerationImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumeration()
         * @generated
         */
        EClass ENUMERATION = eINSTANCE.getEnumeration();

        /**
         * The meta object literal for the '<em><b>Enumeration Literals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__ENUMERATION_LITERALS = eINSTANCE.getEnumeration_EnumerationLiterals();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__MODEL = eINSTANCE.getEnumeration_Model();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.EnumerationLiteralImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationLiteral()
         * @generated
         */
        EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

        /**
         * The meta object literal for the '<em><b>Persisted Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION_LITERAL__PERSISTED_VALUE = eINSTANCE.getEnumerationLiteral_PersistedValue();

        /**
         * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION_LITERAL__ENUMERATION = eINSTANCE.getEnumerationLiteral_Enumeration();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.AbstractBusinessRuleImpl <em>Abstract Business Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.AbstractBusinessRuleImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractBusinessRule()
         * @generated
         */
        EClass ABSTRACT_BUSINESS_RULE = eINSTANCE.getAbstractBusinessRule();

        /**
         * The meta object literal for the '<em><b>Business Class</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS = eINSTANCE.getAbstractBusinessRule_BusinessClass();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BoolPropertyImpl <em>Bool Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BoolPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBoolProperty()
         * @generated
         */
        EClass BOOL_PROPERTY = eINSTANCE.getBoolProperty();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOL_PROPERTY__DEFAULT_VALUE = eINSTANCE.getBoolProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.DateTimePropertyImpl <em>Date Time Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.DateTimePropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeProperty()
         * @generated
         */
        EClass DATE_TIME_PROPERTY = eINSTANCE.getDateTimeProperty();

        /**
         * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATE_TIME_PROPERTY__ACCURACY = eINSTANCE.getDateTimeProperty_Accuracy();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATE_TIME_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDateTimeProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.EnumerationPropertyImpl <em>Enumeration Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.EnumerationPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationProperty()
         * @generated
         */
        EClass ENUMERATION_PROPERTY = eINSTANCE.getEnumerationProperty();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION_PROPERTY__TYPE = eINSTANCE.getEnumerationProperty_Type();

        /**
         * The meta object literal for the '<em><b>Default Value As String</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING = eINSTANCE.getEnumerationProperty_DefaultValueAsString();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.IntegerPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getIntegerProperty()
         * @generated
         */
        EClass INTEGER_PROPERTY = eINSTANCE.getIntegerProperty();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_PROPERTY__MIN_VALUE = eINSTANCE.getIntegerProperty_MinValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_PROPERTY__MAX_VALUE = eINSTANCE.getIntegerProperty_MaxValue();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_PROPERTY__DEFAULT_VALUE = eINSTANCE.getIntegerProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.StringPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getStringProperty()
         * @generated
         */
        EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

        /**
         * The meta object literal for the '<em><b>Regular Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__REGULAR_EXPRESSION = eINSTANCE.getStringProperty_RegularExpression();

        /**
         * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__MIN_LENGTH = eINSTANCE.getStringProperty_MinLength();

        /**
         * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__MAX_LENGTH = eINSTANCE.getStringProperty_MaxLength();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__DEFAULT_VALUE = eINSTANCE.getStringProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.AbstractTypeImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractType()
         * @generated
         */
        EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_TYPE__PROPERTIES = eINSTANCE.getAbstractType_Properties();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_TYPE__MODEL = eINSTANCE.getAbstractType_Model();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BlobBinaryPropertyImpl <em>Blob Binary Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BlobBinaryPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobBinaryProperty()
         * @generated
         */
        EClass BLOB_BINARY_PROPERTY = eINSTANCE.getBlobBinaryProperty();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BlobTextPropertyImpl <em>Blob Text Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BlobTextPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobTextProperty()
         * @generated
         */
        EClass BLOB_TEXT_PROPERTY = eINSTANCE.getBlobTextProperty();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.AssociationImpl <em>Association</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.AssociationImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAssociation()
         * @generated
         */
        EClass ASSOCIATION = eINSTANCE.getAssociation();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

        /**
         * The meta object literal for the '<em><b>Source Role Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__SOURCE_ROLE_NAME = eINSTANCE.getAssociation_SourceRoleName();

        /**
         * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__SOURCE_MULTIPLICITY = eINSTANCE.getAssociation_SourceMultiplicity();

        /**
         * The meta object literal for the '<em><b>Target Role Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__TARGET_ROLE_NAME = eINSTANCE.getAssociation_TargetRoleName();

        /**
         * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__TARGET_MULTIPLICITY = eINSTANCE.getAssociation_TargetMultiplicity();

        /**
         * The meta object literal for the '<em><b>Composite</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__COMPOSITE = eINSTANCE.getAssociation_Composite();

        /**
         * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getAssociation_Bidirectional();

        /**
         * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__ORDERED = eINSTANCE.getAssociation_Ordered();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__MODEL = eINSTANCE.getAssociation_Model();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.DecimalPropertyImpl <em>Decimal Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.DecimalPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDecimalProperty()
         * @generated
         */
        EClass DECIMAL_PROPERTY = eINSTANCE.getDecimalProperty();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MIN_VALUE = eINSTANCE.getDecimalProperty_MinValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MAX_VALUE = eINSTANCE.getDecimalProperty_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Inclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MIN_INCLUSIVE = eINSTANCE.getDecimalProperty_MinInclusive();

        /**
         * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MAX_INCLUSIVE = eINSTANCE.getDecimalProperty_MaxInclusive();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDecimalProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.AbstractBusinessClassImpl <em>Abstract Business Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.AbstractBusinessClassImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractBusinessClass()
         * @generated
         */
        EClass ABSTRACT_BUSINESS_CLASS = eINSTANCE.getAbstractBusinessClass();

        /**
         * The meta object literal for the '<em><b>Associations From</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM = eINSTANCE.getAbstractBusinessClass_AssociationsFrom();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessClassReferenceImpl <em>Business Class Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessClassReferenceImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessClassReference()
         * @generated
         */
        EClass BUSINESS_CLASS_REFERENCE = eINSTANCE.getBusinessClassReference();

        /**
         * The meta object literal for the '<em><b>Referred Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_CLASS_REFERENCE__REFERRED_MODEL = eINSTANCE.getBusinessClassReference_ReferredModel();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.UniqueRuleImpl <em>Unique Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.UniqueRuleImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getUniqueRule()
         * @generated
         */
        EClass UNIQUE_RULE = eINSTANCE.getUniqueRule();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNIQUE_RULE__PROPERTIES = eINSTANCE.getUniqueRule_Properties();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessRuleImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessRule()
         * @generated
         */
        EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.Multiplicity
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getMultiplicity()
         * @generated
         */
        EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.DateTimeAccuracy
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeAccuracy()
         * @generated
         */
        EEnum DATE_TIME_ACCURACY = eINSTANCE.getDateTimeAccuracy();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.PersistencyMode
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPersistencyMode()
         * @generated
         */
        EEnum PERSISTENCY_MODE = eINSTANCE.getPersistencyMode();

    }

} //IBusinessDomainDslPackage
