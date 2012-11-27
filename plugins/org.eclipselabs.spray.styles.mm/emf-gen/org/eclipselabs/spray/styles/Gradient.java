/**
 */
package org.eclipselabs.spray.styles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.Gradient#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getGradient()
 * @model
 * @generated
 */
public interface Gradient extends StyleContainerElement
{
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(GradientLayout)
	 * @see org.eclipselabs.spray.styles.StylesPackage#getGradient_Layout()
	 * @model containment="true"
	 * @generated
	 */
	GradientLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.styles.Gradient#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(GradientLayout value);

} // Gradient
