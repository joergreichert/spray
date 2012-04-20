/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#isComposite <em>Composite</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link BusinessDomainDsl.IAssociation#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation()
 * @model
 * @generated
 */
public interface IAssociation extends IModelElement {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IBusinessClass#getAssociationsTo <em>Associations To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(IBusinessClass)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_Source()
     * @see BusinessDomainDsl.IBusinessClass#getAssociationsTo
     * @model opposite="associationsTo" required="true"
     * @generated
     */
    IBusinessClass getSource();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(IBusinessClass value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IAbstractBusinessClass#getAssociationsFrom <em>Associations From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(IAbstractBusinessClass)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_Target()
     * @see BusinessDomainDsl.IAbstractBusinessClass#getAssociationsFrom
     * @model opposite="associationsFrom" required="true"
     * @generated
     */
    IAbstractBusinessClass getTarget();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(IAbstractBusinessClass value);

    /**
     * Returns the value of the '<em><b>Source Role Name</b></em>' attribute.
     * The default value is <code>"sourceRoleName"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Role Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Role Name</em>' attribute.
     * @see #setSourceRoleName(String)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_SourceRoleName()
     * @model default="sourceRoleName"
     * @generated
     */
    String getSourceRoleName();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getSourceRoleName <em>Source Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Role Name</em>' attribute.
     * @see #getSourceRoleName()
     * @generated
     */
    void setSourceRoleName(String value);

    /**
     * Returns the value of the '<em><b>Source Multiplicity</b></em>' attribute.
     * The default value is <code>"One"</code>.
     * The literals are from the enumeration {@link BusinessDomainDsl.Multiplicity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Multiplicity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Multiplicity</em>' attribute.
     * @see BusinessDomainDsl.Multiplicity
     * @see #setSourceMultiplicity(Multiplicity)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_SourceMultiplicity()
     * @model default="One"
     * @generated
     */
    Multiplicity getSourceMultiplicity();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getSourceMultiplicity <em>Source Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Multiplicity</em>' attribute.
     * @see BusinessDomainDsl.Multiplicity
     * @see #getSourceMultiplicity()
     * @generated
     */
    void setSourceMultiplicity(Multiplicity value);

    /**
     * Returns the value of the '<em><b>Target Role Name</b></em>' attribute.
     * The default value is <code>"targetRoleName"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Role Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Role Name</em>' attribute.
     * @see #setTargetRoleName(String)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_TargetRoleName()
     * @model default="targetRoleName"
     * @generated
     */
    String getTargetRoleName();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getTargetRoleName <em>Target Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Role Name</em>' attribute.
     * @see #getTargetRoleName()
     * @generated
     */
    void setTargetRoleName(String value);

    /**
     * Returns the value of the '<em><b>Target Multiplicity</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * The literals are from the enumeration {@link BusinessDomainDsl.Multiplicity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Multiplicity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Multiplicity</em>' attribute.
     * @see BusinessDomainDsl.Multiplicity
     * @see #setTargetMultiplicity(Multiplicity)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_TargetMultiplicity()
     * @model default="1"
     * @generated
     */
    Multiplicity getTargetMultiplicity();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getTargetMultiplicity <em>Target Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Multiplicity</em>' attribute.
     * @see BusinessDomainDsl.Multiplicity
     * @see #getTargetMultiplicity()
     * @generated
     */
    void setTargetMultiplicity(Multiplicity value);

    /**
     * Returns the value of the '<em><b>Composite</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Composite</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composite</em>' attribute.
     * @see #setComposite(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_Composite()
     * @model default="false"
     * @generated
     */
    boolean isComposite();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#isComposite <em>Composite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composite</em>' attribute.
     * @see #isComposite()
     * @generated
     */
    void setComposite(boolean value);

    /**
     * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bidirectional</em>' attribute.
     * @see #setBidirectional(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_Bidirectional()
     * @model default="false" required="true"
     * @generated
     */
    boolean isBidirectional();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#isBidirectional <em>Bidirectional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bidirectional</em>' attribute.
     * @see #isBidirectional()
     * @generated
     */
    void setBidirectional(boolean value);

    /**
     * Returns the value of the '<em><b>Ordered</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ordered</em>' attribute.
     * @see #setOrdered(boolean)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_Ordered()
     * @model default="false" required="true"
     * @generated
     */
    boolean isOrdered();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#isOrdered <em>Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ordered</em>' attribute.
     * @see #isOrdered()
     * @generated
     */
    void setOrdered(boolean value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IBusinessDomainModel#getAssociations <em>Associations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(IBusinessDomainModel)
     * @see BusinessDomainDsl.IBusinessDomainDslPackage#getAssociation_Model()
     * @see BusinessDomainDsl.IBusinessDomainModel#getAssociations
     * @model opposite="associations" transient="false"
     * @generated
     */
    IBusinessDomainModel getModel();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IAssociation#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(IBusinessDomainModel value);

} // IAssociation
