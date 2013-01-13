/**
 */
package ca.uwaterloo.gp.fmp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Featur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getName <em>Name</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getValueType <em>Value Type</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getReferences <em>References</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getTypedValue <em>Typed Value</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getDescribedNode <em>Described Node</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Featur#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur()
 * @model
 * @generated
 */
public interface Featur extends Clonable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Featur#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.uwaterloo.gp.fmp.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see ca.uwaterloo.gp.fmp.ValueType
	 * @see #setValueType(ValueType)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_ValueType()
	 * @model
	 * @generated
	 */
	ValueType getValueType();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Featur#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see ca.uwaterloo.gp.fmp.ValueType
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.uwaterloo.gp.fmp.Featur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_Configurations()
	 * @model type="ca.uwaterloo.gp.fmp.Featur" containment="true"
	 * @generated
	 */
	EList getConfigurations();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link ca.uwaterloo.gp.fmp.Reference}.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Reference#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_References()
	 * @see ca.uwaterloo.gp.fmp.Reference#getFeature
	 * @model type="ca.uwaterloo.gp.fmp.Reference" opposite="feature"
	 * @generated
	 */
	EList getReferences();

	/**
	 * Returns the value of the '<em><b>Typed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Value</em>' containment reference.
	 * @see #setTypedValue(TypedValue)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_TypedValue()
	 * @model containment="true"
	 * @generated
	 */
	TypedValue getTypedValue();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Featur#getTypedValue <em>Typed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Value</em>' containment reference.
	 * @see #getTypedValue()
	 * @generated
	 */
	void setTypedValue(TypedValue value);

	/**
	 * Returns the value of the '<em><b>Described Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Node#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Node</em>' reference.
	 * @see #setDescribedNode(Node)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_DescribedNode()
	 * @see ca.uwaterloo.gp.fmp.Node#getProperties
	 * @model opposite="properties"
	 * @generated
	 */
	Node getDescribedNode();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Featur#getDescribedNode <em>Described Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described Node</em>' reference.
	 * @see #getDescribedNode()
	 * @generated
	 */
	void setDescribedNode(Node value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ca.uwaterloo.gp.fmp.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getFeatur_Constraints()
	 * @model type="ca.uwaterloo.gp.fmp.Constraint" containment="true"
	 * @generated
	 */
	EList getConstraints();

} // Featur
