/**
 */
package org.eclipselabs.spray.shapes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.CDRectangle#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCDRectangle()
 * @model
 * @generated
 */
public interface CDRectangle extends ShapeConnection
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
	 * @see #setLayout(RectangleEllipseLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCDRectangle_Layout()
	 * @model containment="true"
	 * @generated
	 */
	RectangleEllipseLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.CDRectangle#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(RectangleEllipseLayout value);

} // CDRectangle
