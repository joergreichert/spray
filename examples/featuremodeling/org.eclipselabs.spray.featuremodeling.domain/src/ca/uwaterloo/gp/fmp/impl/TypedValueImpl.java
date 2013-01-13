/**
 */
package ca.uwaterloo.gp.fmp.impl;

import ca.uwaterloo.gp.fmp.Featur;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FmpPackage;
import ca.uwaterloo.gp.fmp.TypedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.TypedValueImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.TypedValueImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.TypedValueImpl#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.TypedValueImpl#getFeatureValue <em>Feature Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedValueImpl extends EObjectImpl implements TypedValue {
	/**
	 * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTEGER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected Integer integerValue = INTEGER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatValue() <em>Float Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatValue()
	 * @generated
	 * @ordered
	 */
	protected static final Float FLOAT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatValue() <em>Float Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatValue()
	 * @generated
	 * @ordered
	 */
	protected Float floatValue = FLOAT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureValue() <em>Feature Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValue()
	 * @generated
	 * @ordered
	 */
	protected Feature featureValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FmpPackage.Literals.TYPED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIntegerValue() {
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValue(Integer newIntegerValue) {
		Integer oldIntegerValue = integerValue;
		integerValue = newIntegerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.TYPED_VALUE__INTEGER_VALUE, oldIntegerValue, integerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.TYPED_VALUE__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFloatValue() {
		return floatValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatValue(Float newFloatValue) {
		Float oldFloatValue = floatValue;
		floatValue = newFloatValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.TYPED_VALUE__FLOAT_VALUE, oldFloatValue, floatValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatureValue() {
		if (featureValue != null && featureValue.eIsProxy()) {
			InternalEObject oldFeatureValue = (InternalEObject)featureValue;
			featureValue = (Feature)eResolveProxy(oldFeatureValue);
			if (featureValue != oldFeatureValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmpPackage.TYPED_VALUE__FEATURE_VALUE, oldFeatureValue, featureValue));
			}
		}
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeatureValue() {
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureValue(Feature newFeatureValue) {
		Feature oldFeatureValue = featureValue;
		featureValue = newFeatureValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.TYPED_VALUE__FEATURE_VALUE, oldFeatureValue, featureValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmpPackage.TYPED_VALUE__INTEGER_VALUE:
				return getIntegerValue();
			case FmpPackage.TYPED_VALUE__STRING_VALUE:
				return getStringValue();
			case FmpPackage.TYPED_VALUE__FLOAT_VALUE:
				return getFloatValue();
			case FmpPackage.TYPED_VALUE__FEATURE_VALUE:
				if (resolve) return getFeatureValue();
				return basicGetFeatureValue();
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
			case FmpPackage.TYPED_VALUE__INTEGER_VALUE:
				setIntegerValue((Integer)newValue);
				return;
			case FmpPackage.TYPED_VALUE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case FmpPackage.TYPED_VALUE__FLOAT_VALUE:
				setFloatValue((Float)newValue);
				return;
			case FmpPackage.TYPED_VALUE__FEATURE_VALUE:
				setFeatureValue((Feature)newValue);
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
			case FmpPackage.TYPED_VALUE__INTEGER_VALUE:
				setIntegerValue(INTEGER_VALUE_EDEFAULT);
				return;
			case FmpPackage.TYPED_VALUE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case FmpPackage.TYPED_VALUE__FLOAT_VALUE:
				setFloatValue(FLOAT_VALUE_EDEFAULT);
				return;
			case FmpPackage.TYPED_VALUE__FEATURE_VALUE:
				setFeatureValue((Feature)null);
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
			case FmpPackage.TYPED_VALUE__INTEGER_VALUE:
				return INTEGER_VALUE_EDEFAULT == null ? integerValue != null : !INTEGER_VALUE_EDEFAULT.equals(integerValue);
			case FmpPackage.TYPED_VALUE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case FmpPackage.TYPED_VALUE__FLOAT_VALUE:
				return FLOAT_VALUE_EDEFAULT == null ? floatValue != null : !FLOAT_VALUE_EDEFAULT.equals(floatValue);
			case FmpPackage.TYPED_VALUE__FEATURE_VALUE:
				return featureValue != null;
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
		result.append(" (integerValue: ");
		result.append(integerValue);
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", floatValue: ");
		result.append(floatValue);
		result.append(')');
		return result.toString();
	}

} //TypedValueImpl
