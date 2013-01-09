/**
 */
package org.eclipselabs.spray.shapes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.CDRoundedRectangle#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCDRoundedRectangle()
 * @model
 * @generated
 */
public interface CDRoundedRectangle extends ShapeConnection
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
     * @see #setLayout(RoundedRectangleLayout)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getCDRoundedRectangle_Layout()
     * @model containment="true"
     * @generated
     */
	RoundedRectangleLayout getLayout();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.CDRoundedRectangle#getLayout <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Layout</em>' containment reference.
     * @see #getLayout()
     * @generated
     */
	void setLayout(RoundedRectangleLayout value);

} // CDRoundedRectangle
