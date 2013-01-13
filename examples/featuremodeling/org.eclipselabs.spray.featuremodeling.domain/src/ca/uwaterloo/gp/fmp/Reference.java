/**
 */
package ca.uwaterloo.gp.fmp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.Reference#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Clonable {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Feature#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getReference_Feature()
	 * @see ca.uwaterloo.gp.fmp.Feature#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Reference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Reference
