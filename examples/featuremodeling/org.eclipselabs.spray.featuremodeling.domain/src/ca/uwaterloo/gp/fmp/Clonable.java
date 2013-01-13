/**
 */
package ca.uwaterloo.gp.fmp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clonable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.Clonable#getState <em>State</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Clonable#getClones <em>Clones</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Clonable#getPrototype <em>Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getClonable()
 * @model abstract="true"
 * @generated
 */
public interface Clonable extends Node {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"UNDECIDED"</code>.
	 * The literals are from the enumeration {@link ca.uwaterloo.gp.fmp.ConfigState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see ca.uwaterloo.gp.fmp.ConfigState
	 * @see #setState(ConfigState)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getClonable_State()
	 * @model default="UNDECIDED"
	 * @generated
	 */
	ConfigState getState();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Clonable#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see ca.uwaterloo.gp.fmp.ConfigState
	 * @see #getState()
	 * @generated
	 */
	void setState(ConfigState value);

	/**
	 * Returns the value of the '<em><b>Clones</b></em>' reference list.
	 * The list contents are of type {@link ca.uwaterloo.gp.fmp.Clonable}.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Clonable#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clones</em>' reference list.
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getClonable_Clones()
	 * @see ca.uwaterloo.gp.fmp.Clonable#getPrototype
	 * @model type="ca.uwaterloo.gp.fmp.Clonable" opposite="prototype"
	 * @generated
	 */
	EList getClones();

	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Clonable#getClones <em>Clones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(Clonable)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getClonable_Prototype()
	 * @see ca.uwaterloo.gp.fmp.Clonable#getClones
	 * @model opposite="clones"
	 * @generated
	 */
	Clonable getPrototype();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Clonable#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(Clonable value);

} // Clonable
