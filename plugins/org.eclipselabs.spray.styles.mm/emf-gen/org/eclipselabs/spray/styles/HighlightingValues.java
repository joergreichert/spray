/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highlighting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.HighlightingValues#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.HighlightingValues#getMultiselected <em>Multiselected</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.HighlightingValues#getAllowed <em>Allowed</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.HighlightingValues#getUnallowed <em>Unallowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getHighlightingValues()
 * @model
 * @generated
 */
public interface HighlightingValues extends EObject
{
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' containment reference.
	 * @see #setSelected(ColorOrGradient)
	 * @see org.eclipselabs.spray.styles.StylesPackage#getHighlightingValues_Selected()
	 * @model containment="true"
	 * @generated
	 */
	ColorOrGradient getSelected();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.styles.HighlightingValues#getSelected <em>Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' containment reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(ColorOrGradient value);

	/**
	 * Returns the value of the '<em><b>Multiselected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiselected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiselected</em>' containment reference.
	 * @see #setMultiselected(ColorOrGradient)
	 * @see org.eclipselabs.spray.styles.StylesPackage#getHighlightingValues_Multiselected()
	 * @model containment="true"
	 * @generated
	 */
	ColorOrGradient getMultiselected();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.styles.HighlightingValues#getMultiselected <em>Multiselected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiselected</em>' containment reference.
	 * @see #getMultiselected()
	 * @generated
	 */
	void setMultiselected(ColorOrGradient value);

	/**
	 * Returns the value of the '<em><b>Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed</em>' containment reference.
	 * @see #setAllowed(ColorOrGradient)
	 * @see org.eclipselabs.spray.styles.StylesPackage#getHighlightingValues_Allowed()
	 * @model containment="true"
	 * @generated
	 */
	ColorOrGradient getAllowed();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.styles.HighlightingValues#getAllowed <em>Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed</em>' containment reference.
	 * @see #getAllowed()
	 * @generated
	 */
	void setAllowed(ColorOrGradient value);

	/**
	 * Returns the value of the '<em><b>Unallowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unallowed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unallowed</em>' containment reference.
	 * @see #setUnallowed(ColorOrGradient)
	 * @see org.eclipselabs.spray.styles.StylesPackage#getHighlightingValues_Unallowed()
	 * @model containment="true"
	 * @generated
	 */
	ColorOrGradient getUnallowed();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.styles.HighlightingValues#getUnallowed <em>Unallowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unallowed</em>' containment reference.
	 * @see #getUnallowed()
	 * @generated
	 */
	void setUnallowed(ColorOrGradient value);

} // HighlightingValues
