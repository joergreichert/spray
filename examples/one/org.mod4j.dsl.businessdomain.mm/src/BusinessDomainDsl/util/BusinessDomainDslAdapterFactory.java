/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.util;

import BusinessDomainDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.IBusinessDomainDslPackage
 * @generated
 */
public class BusinessDomainDslAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static IBusinessDomainDslPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessDomainDslAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = IBusinessDomainDslPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessDomainDslSwitch<Adapter> modelSwitch =
        new BusinessDomainDslSwitch<Adapter>() {
            @Override
            public Adapter caseModelElement(IModelElement object) {
                return createModelElementAdapter();
            }
            @Override
            public Adapter caseBusinessDomainModel(IBusinessDomainModel object) {
                return createBusinessDomainModelAdapter();
            }
            @Override
            public Adapter caseBusinessClass(IBusinessClass object) {
                return createBusinessClassAdapter();
            }
            @Override
            public Adapter caseProperty(IProperty object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseEnumeration(IEnumeration object) {
                return createEnumerationAdapter();
            }
            @Override
            public Adapter caseEnumerationLiteral(IEnumerationLiteral object) {
                return createEnumerationLiteralAdapter();
            }
            @Override
            public Adapter caseAbstractBusinessRule(IAbstractBusinessRule object) {
                return createAbstractBusinessRuleAdapter();
            }
            @Override
            public Adapter caseBoolProperty(IBoolProperty object) {
                return createBoolPropertyAdapter();
            }
            @Override
            public Adapter caseDateTimeProperty(IDateTimeProperty object) {
                return createDateTimePropertyAdapter();
            }
            @Override
            public Adapter caseEnumerationProperty(IEnumerationProperty object) {
                return createEnumerationPropertyAdapter();
            }
            @Override
            public Adapter caseIntegerProperty(IIntegerProperty object) {
                return createIntegerPropertyAdapter();
            }
            @Override
            public Adapter caseStringProperty(IStringProperty object) {
                return createStringPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractType(IAbstractType object) {
                return createAbstractTypeAdapter();
            }
            @Override
            public Adapter caseBlobBinaryProperty(IBlobBinaryProperty object) {
                return createBlobBinaryPropertyAdapter();
            }
            @Override
            public Adapter caseBlobTextProperty(IBlobTextProperty object) {
                return createBlobTextPropertyAdapter();
            }
            @Override
            public Adapter caseAssociation(IAssociation object) {
                return createAssociationAdapter();
            }
            @Override
            public Adapter caseDecimalProperty(IDecimalProperty object) {
                return createDecimalPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractBusinessClass(IAbstractBusinessClass object) {
                return createAbstractBusinessClassAdapter();
            }
            @Override
            public Adapter caseBusinessClassReference(IBusinessClassReference object) {
                return createBusinessClassReferenceAdapter();
            }
            @Override
            public Adapter caseUniqueRule(IUniqueRule object) {
                return createUniqueRuleAdapter();
            }
            @Override
            public Adapter caseBusinessRule(IBusinessRule object) {
                return createBusinessRuleAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBusinessDomainModel <em>Business Domain Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBusinessDomainModel
     * @generated
     */
    public Adapter createBusinessDomainModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBusinessClass <em>Business Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBusinessClass
     * @generated
     */
    public Adapter createBusinessClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IProperty
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IEnumeration
     * @generated
     */
    public Adapter createEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IEnumerationLiteral <em>Enumeration Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IEnumerationLiteral
     * @generated
     */
    public Adapter createEnumerationLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IAbstractBusinessRule <em>Abstract Business Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IAbstractBusinessRule
     * @generated
     */
    public Adapter createAbstractBusinessRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBoolProperty <em>Bool Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBoolProperty
     * @generated
     */
    public Adapter createBoolPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IDateTimeProperty <em>Date Time Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IDateTimeProperty
     * @generated
     */
    public Adapter createDateTimePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IEnumerationProperty <em>Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IEnumerationProperty
     * @generated
     */
    public Adapter createEnumerationPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IIntegerProperty <em>Integer Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IIntegerProperty
     * @generated
     */
    public Adapter createIntegerPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IStringProperty <em>String Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IStringProperty
     * @generated
     */
    public Adapter createStringPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IAbstractType <em>Abstract Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IAbstractType
     * @generated
     */
    public Adapter createAbstractTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBlobBinaryProperty <em>Blob Binary Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBlobBinaryProperty
     * @generated
     */
    public Adapter createBlobBinaryPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBlobTextProperty <em>Blob Text Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBlobTextProperty
     * @generated
     */
    public Adapter createBlobTextPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IAssociation
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IDecimalProperty <em>Decimal Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IDecimalProperty
     * @generated
     */
    public Adapter createDecimalPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IAbstractBusinessClass <em>Abstract Business Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IAbstractBusinessClass
     * @generated
     */
    public Adapter createAbstractBusinessClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBusinessClassReference <em>Business Class Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBusinessClassReference
     * @generated
     */
    public Adapter createBusinessClassReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IUniqueRule <em>Unique Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IUniqueRule
     * @generated
     */
    public Adapter createUniqueRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link BusinessDomainDsl.IBusinessRule <em>Business Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see BusinessDomainDsl.IBusinessRule
     * @generated
     */
    public Adapter createBusinessRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //BusinessDomainDslAdapterFactory
