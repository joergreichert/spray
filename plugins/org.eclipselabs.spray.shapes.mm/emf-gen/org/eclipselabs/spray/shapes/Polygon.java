/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Polygon#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Polygon#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends Shape
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
     * @see #setLayout(PolyLineLayout)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getPolygon_Layout()
     * @model containment="true"
     * @generated
     */
	PolyLineLayout getLayout();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.Polygon#getLayout <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Layout</em>' containment reference.
     * @see #getLayout()
     * @generated
     */
	void setLayout(PolyLineLayout value);

	/**
     * Returns the value of the '<em><b>Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipselabs.spray.shapes.Shape}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Shape</em>' containment reference list.
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getPolygon_Shape()
     * @model containment="true"
     * @generated
     */
	EList<Shape> getShape();

} // Polygon
