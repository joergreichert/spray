/**
 */
package ca.uwaterloo.gp.fmp.impl;

import ca.uwaterloo.gp.fmp.Constraint;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FmpPackage;
import ca.uwaterloo.gp.fmp.Node;
import ca.uwaterloo.gp.fmp.Reference;
import ca.uwaterloo.gp.fmp.TypedValue;
import ca.uwaterloo.gp.fmp.ValueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getReferences <em>References</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getTypedValue <em>Typed Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getDescribedNode <em>Described Node</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends ClonableImpl implements Feature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueType VALUE_TYPE_EDEFAULT = ValueType.FEATURE_LITERAL;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ValueType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList configurations;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList references;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Typed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected TypedValue typedValue;

	/**
	 * The cached value of the '{@link #getDescribedNode() <em>Described Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedNode()
	 * @generated
	 * @ordered
	 */
	protected Node describedNode;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FmpPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueType newValueType) {
		ValueType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.FEATURE__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList(Feature.class, this, FmpPackage.FEATURE__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferences() {
		if (references == null) {
			references = new EObjectWithInverseResolvingEList(Reference.class, this, FmpPackage.FEATURE__REFERENCES, FmpPackage.REFERENCE__FEATURE);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedValue getTypedValue() {
		return typedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedValue(TypedValue newTypedValue, NotificationChain msgs) {
		TypedValue oldTypedValue = typedValue;
		typedValue = newTypedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmpPackage.FEATURE__TYPED_VALUE, oldTypedValue, newTypedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(TypedValue newTypedValue) {
		if (newTypedValue != typedValue) {
			NotificationChain msgs = null;
			if (typedValue != null)
				msgs = ((InternalEObject)typedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmpPackage.FEATURE__TYPED_VALUE, null, msgs);
			if (newTypedValue != null)
				msgs = ((InternalEObject)newTypedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmpPackage.FEATURE__TYPED_VALUE, null, msgs);
			msgs = basicSetTypedValue(newTypedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.FEATURE__TYPED_VALUE, newTypedValue, newTypedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDescribedNode() {
		if (describedNode != null && describedNode.eIsProxy()) {
			InternalEObject oldDescribedNode = (InternalEObject)describedNode;
			describedNode = (Node)eResolveProxy(oldDescribedNode);
			if (describedNode != oldDescribedNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmpPackage.FEATURE__DESCRIBED_NODE, oldDescribedNode, describedNode));
			}
		}
		return describedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDescribedNode() {
		return describedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedNode(Node newDescribedNode, NotificationChain msgs) {
		Node oldDescribedNode = describedNode;
		describedNode = newDescribedNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmpPackage.FEATURE__DESCRIBED_NODE, oldDescribedNode, newDescribedNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedNode(Node newDescribedNode) {
		if (newDescribedNode != describedNode) {
			NotificationChain msgs = null;
			if (describedNode != null)
				msgs = ((InternalEObject)describedNode).eInverseRemove(this, FmpPackage.NODE__PROPERTIES, Node.class, msgs);
			if (newDescribedNode != null)
				msgs = ((InternalEObject)newDescribedNode).eInverseAdd(this, FmpPackage.NODE__PROPERTIES, Node.class, msgs);
			msgs = basicSetDescribedNode(newDescribedNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.FEATURE__DESCRIBED_NODE, newDescribedNode, newDescribedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList(Constraint.class, this, FmpPackage.FEATURE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmpPackage.FEATURE__REFERENCES:
				return ((InternalEList)getReferences()).basicAdd(otherEnd, msgs);
			case FmpPackage.FEATURE__DESCRIBED_NODE:
				if (describedNode != null)
					msgs = ((InternalEObject)describedNode).eInverseRemove(this, FmpPackage.NODE__PROPERTIES, Node.class, msgs);
				return basicSetDescribedNode((Node)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmpPackage.FEATURE__CONFIGURATIONS:
				return ((InternalEList)getConfigurations()).basicRemove(otherEnd, msgs);
			case FmpPackage.FEATURE__REFERENCES:
				return ((InternalEList)getReferences()).basicRemove(otherEnd, msgs);
			case FmpPackage.FEATURE__TYPED_VALUE:
				return basicSetTypedValue(null, msgs);
			case FmpPackage.FEATURE__DESCRIBED_NODE:
				return basicSetDescribedNode(null, msgs);
			case FmpPackage.FEATURE__CONSTRAINTS:
				return ((InternalEList)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmpPackage.FEATURE__NAME:
				return getName();
			case FmpPackage.FEATURE__VALUE_TYPE:
				return getValueType();
			case FmpPackage.FEATURE__CONFIGURATIONS:
				return getConfigurations();
			case FmpPackage.FEATURE__REFERENCES:
				return getReferences();
			case FmpPackage.FEATURE__TYPED_VALUE:
				return getTypedValue();
			case FmpPackage.FEATURE__DESCRIBED_NODE:
				if (resolve) return getDescribedNode();
				return basicGetDescribedNode();
			case FmpPackage.FEATURE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmpPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case FmpPackage.FEATURE__VALUE_TYPE:
				setValueType((ValueType)newValue);
				return;
			case FmpPackage.FEATURE__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection)newValue);
				return;
			case FmpPackage.FEATURE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection)newValue);
				return;
			case FmpPackage.FEATURE__TYPED_VALUE:
				setTypedValue((TypedValue)newValue);
				return;
			case FmpPackage.FEATURE__DESCRIBED_NODE:
				setDescribedNode((Node)newValue);
				return;
			case FmpPackage.FEATURE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case FmpPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FmpPackage.FEATURE__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case FmpPackage.FEATURE__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case FmpPackage.FEATURE__REFERENCES:
				getReferences().clear();
				return;
			case FmpPackage.FEATURE__TYPED_VALUE:
				setTypedValue((TypedValue)null);
				return;
			case FmpPackage.FEATURE__DESCRIBED_NODE:
				setDescribedNode((Node)null);
				return;
			case FmpPackage.FEATURE__CONSTRAINTS:
				getConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FmpPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FmpPackage.FEATURE__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
			case FmpPackage.FEATURE__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case FmpPackage.FEATURE__REFERENCES:
				return references != null && !references.isEmpty();
			case FmpPackage.FEATURE__TYPED_VALUE:
				return typedValue != null;
			case FmpPackage.FEATURE__DESCRIBED_NODE:
				return describedNode != null;
			case FmpPackage.FEATURE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
