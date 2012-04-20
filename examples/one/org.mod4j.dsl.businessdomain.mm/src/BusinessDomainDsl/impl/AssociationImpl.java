/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.IAbstractBusinessClass;
import BusinessDomainDsl.IAssociation;
import BusinessDomainDsl.IBusinessClass;
import BusinessDomainDsl.IBusinessDomainDslPackage;
import BusinessDomainDsl.IBusinessDomainModel;
import BusinessDomainDsl.Multiplicity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#isComposite <em>Composite</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ModelElementImpl implements IAssociation {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected IBusinessClass source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected IAbstractBusinessClass target;

    /**
     * The default value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRoleName()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_ROLE_NAME_EDEFAULT = "sourceRoleName";

    /**
     * The cached value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRoleName()
     * @generated
     * @ordered
     */
    protected String sourceRoleName = SOURCE_ROLE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceMultiplicity()
     * @generated
     * @ordered
     */
    protected static final Multiplicity SOURCE_MULTIPLICITY_EDEFAULT = Multiplicity.ONE;

    /**
     * The cached value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceMultiplicity()
     * @generated
     * @ordered
     */
    protected Multiplicity sourceMultiplicity = SOURCE_MULTIPLICITY_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRoleName()
     * @generated
     * @ordered
     */
    protected static final String TARGET_ROLE_NAME_EDEFAULT = "targetRoleName";

    /**
     * The cached value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRoleName()
     * @generated
     * @ordered
     */
    protected String targetRoleName = TARGET_ROLE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetMultiplicity()
     * @generated
     * @ordered
     */
    protected static final Multiplicity TARGET_MULTIPLICITY_EDEFAULT = Multiplicity.ZERO_MANY;

    /**
     * The cached value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetMultiplicity()
     * @generated
     * @ordered
     */
    protected Multiplicity targetMultiplicity = TARGET_MULTIPLICITY_EDEFAULT;

    /**
     * The default value of the '{@link #isComposite() <em>Composite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isComposite()
     * @generated
     * @ordered
     */
    protected static final boolean COMPOSITE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isComposite() <em>Composite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isComposite()
     * @generated
     * @ordered
     */
    protected boolean composite = COMPOSITE_EDEFAULT;

    /**
     * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBidirectional()
     * @generated
     * @ordered
     */
    protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBidirectional()
     * @generated
     * @ordered
     */
    protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

    /**
     * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOrdered()
     * @generated
     * @ordered
     */
    protected static final boolean ORDERED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOrdered()
     * @generated
     * @ordered
     */
    protected boolean ordered = ORDERED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IBusinessDomainDslPackage.Literals.ASSOCIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClass getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (IBusinessClass)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, IBusinessDomainDslPackage.ASSOCIATION__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessClass basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(IBusinessClass newSource, NotificationChain msgs) {
        IBusinessClass oldSource = source;
        source = newSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(IBusinessClass newSource) {
        if (newSource != source) {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, IBusinessClass.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, IBusinessClass.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IAbstractBusinessClass getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (IAbstractBusinessClass)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, IBusinessDomainDslPackage.ASSOCIATION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IAbstractBusinessClass basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(IAbstractBusinessClass newTarget, NotificationChain msgs) {
        IAbstractBusinessClass oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(IAbstractBusinessClass newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, IBusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, IAbstractBusinessClass.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, IBusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, IAbstractBusinessClass.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSourceRoleName() {
        return sourceRoleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRoleName(String newSourceRoleName) {
        String oldSourceRoleName = sourceRoleName;
        sourceRoleName = newSourceRoleName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME, oldSourceRoleName, sourceRoleName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity getSourceMultiplicity() {
        return sourceMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceMultiplicity(Multiplicity newSourceMultiplicity) {
        Multiplicity oldSourceMultiplicity = sourceMultiplicity;
        sourceMultiplicity = newSourceMultiplicity == null ? SOURCE_MULTIPLICITY_EDEFAULT : newSourceMultiplicity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY, oldSourceMultiplicity, sourceMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetRoleName() {
        return targetRoleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetRoleName(String newTargetRoleName) {
        String oldTargetRoleName = targetRoleName;
        targetRoleName = newTargetRoleName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME, oldTargetRoleName, targetRoleName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity getTargetMultiplicity() {
        return targetMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetMultiplicity(Multiplicity newTargetMultiplicity) {
        Multiplicity oldTargetMultiplicity = targetMultiplicity;
        targetMultiplicity = newTargetMultiplicity == null ? TARGET_MULTIPLICITY_EDEFAULT : newTargetMultiplicity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY, oldTargetMultiplicity, targetMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isComposite() {
        return composite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComposite(boolean newComposite) {
        boolean oldComposite = composite;
        composite = newComposite;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__COMPOSITE, oldComposite, composite));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBidirectional() {
        return bidirectional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBidirectional(boolean newBidirectional) {
        boolean oldBidirectional = bidirectional;
        bidirectional = newBidirectional;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL, oldBidirectional, bidirectional));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOrdered() {
        return ordered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrdered(boolean newOrdered) {
        boolean oldOrdered = ordered;
        ordered = newOrdered;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__ORDERED, oldOrdered, ordered));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IBusinessDomainModel getModel() {
        if (eContainerFeatureID() != IBusinessDomainDslPackage.ASSOCIATION__MODEL) return null;
        return (IBusinessDomainModel)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(IBusinessDomainModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, IBusinessDomainDslPackage.ASSOCIATION__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(IBusinessDomainModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != IBusinessDomainDslPackage.ASSOCIATION__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS, IBusinessDomainModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IBusinessDomainDslPackage.ASSOCIATION__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, IBusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, IBusinessClass.class, msgs);
                return basicSetSource((IBusinessClass)otherEnd, msgs);
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, IBusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, IAbstractBusinessClass.class, msgs);
                return basicSetTarget((IAbstractBusinessClass)otherEnd, msgs);
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((IBusinessDomainModel)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE:
                return basicSetSource(null, msgs);
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET:
                return basicSetTarget(null, msgs);
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                return basicSetModel(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                return eInternalContainer().eInverseRemove(this, IBusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS, IBusinessDomainModel.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                return getSourceRoleName();
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                return getSourceMultiplicity();
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                return getTargetRoleName();
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                return getTargetMultiplicity();
            case IBusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                return isComposite();
            case IBusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                return isBidirectional();
            case IBusinessDomainDslPackage.ASSOCIATION__ORDERED:
                return isOrdered();
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                return getModel();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE:
                setSource((IBusinessClass)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET:
                setTarget((IAbstractBusinessClass)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                setSourceRoleName((String)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                setSourceMultiplicity((Multiplicity)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                setTargetRoleName((String)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                setTargetMultiplicity((Multiplicity)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                setComposite((Boolean)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                setBidirectional((Boolean)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__ORDERED:
                setOrdered((Boolean)newValue);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                setModel((IBusinessDomainModel)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE:
                setSource((IBusinessClass)null);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET:
                setTarget((IAbstractBusinessClass)null);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                setSourceRoleName(SOURCE_ROLE_NAME_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                setSourceMultiplicity(SOURCE_MULTIPLICITY_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                setTargetRoleName(TARGET_ROLE_NAME_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                setTargetMultiplicity(TARGET_MULTIPLICITY_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                setComposite(COMPOSITE_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                setBidirectional(BIDIRECTIONAL_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__ORDERED:
                setOrdered(ORDERED_EDEFAULT);
                return;
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                setModel((IBusinessDomainModel)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE:
                return source != null;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET:
                return target != null;
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                return SOURCE_ROLE_NAME_EDEFAULT == null ? sourceRoleName != null : !SOURCE_ROLE_NAME_EDEFAULT.equals(sourceRoleName);
            case IBusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                return sourceMultiplicity != SOURCE_MULTIPLICITY_EDEFAULT;
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                return TARGET_ROLE_NAME_EDEFAULT == null ? targetRoleName != null : !TARGET_ROLE_NAME_EDEFAULT.equals(targetRoleName);
            case IBusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                return targetMultiplicity != TARGET_MULTIPLICITY_EDEFAULT;
            case IBusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                return composite != COMPOSITE_EDEFAULT;
            case IBusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                return bidirectional != BIDIRECTIONAL_EDEFAULT;
            case IBusinessDomainDslPackage.ASSOCIATION__ORDERED:
                return ordered != ORDERED_EDEFAULT;
            case IBusinessDomainDslPackage.ASSOCIATION__MODEL:
                return getModel() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (sourceRoleName: ");
        result.append(sourceRoleName);
        result.append(", sourceMultiplicity: ");
        result.append(sourceMultiplicity);
        result.append(", targetRoleName: ");
        result.append(targetRoleName);
        result.append(", targetMultiplicity: ");
        result.append(targetMultiplicity);
        result.append(", composite: ");
        result.append(composite);
        result.append(", bidirectional: ");
        result.append(bidirectional);
        result.append(", ordered: ");
        result.append(ordered);
        result.append(')');
        return result.toString();
    }

} //AssociationImpl
