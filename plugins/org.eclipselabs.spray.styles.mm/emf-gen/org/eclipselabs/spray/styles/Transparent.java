/**
 */
package org.eclipselabs.spray.styles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transparent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.Transparent#isTransparent <em>Transparent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getTransparent()
 * @model
 * @generated
 */
public interface Transparent extends ColorOrGradient, ColorWithTransparency
{
	/**
     * Returns the value of the '<em><b>Transparent</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transparent</em>' attribute.
     * @see #setTransparent(boolean)
     * @see org.eclipselabs.spray.styles.StylesPackage#getTransparent_Transparent()
     * @model
     * @generated
     */
	boolean isTransparent();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.Transparent#isTransparent <em>Transparent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transparent</em>' attribute.
     * @see #isTransparent()
     * @generated
     */
	void setTransparent(boolean value);

} // Transparent
