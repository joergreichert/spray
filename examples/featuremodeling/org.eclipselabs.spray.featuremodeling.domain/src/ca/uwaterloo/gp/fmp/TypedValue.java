/**
 */
package ca.uwaterloo.gp.fmp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.TypedValue#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.TypedValue#getStringValue <em>String Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.TypedValue#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.TypedValue#getFeatureValue <em>Feature Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getTypedValue()
 * @model
 * @generated
 */
public interface TypedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(Integer)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getTypedValue_IntegerValue()
	 * @model
	 * @generated
	 */
	Integer getIntegerValue();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.TypedValue#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(Integer value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getTypedValue_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.TypedValue#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Float Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Value</em>' attribute.
	 * @see #setFloatValue(Float)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getTypedValue_FloatValue()
	 * @model
	 * @generated
	 */
	Float getFloatValue();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.TypedValue#getFloatValue <em>Float Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Value</em>' attribute.
	 * @see #getFloatValue()
	 * @generated
	 */
	void setFloatValue(Float value);

	/**
	 * Returns the value of the '<em><b>Feature Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Value</em>' reference.
	 * @see #setFeatureValue(Feature)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getTypedValue_FeatureValue()
	 * @model
	 * @generated
	 */
	Feature getFeatureValue();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.TypedValue#getFeatureValue <em>Feature Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Value</em>' reference.
	 * @see #getFeatureValue()
	 * @generated
	 */
	void setFeatureValue(Feature value);

} // TypedValue
