/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Rectangle#getCompartmentInfo <em>Compartment Info</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Rectangle#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Rectangle#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends Shape
{
	/**
     * Returns the value of the '<em><b>Compartment Info</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Compartment Info</em>' containment reference.
     * @see #setCompartmentInfo(CompartmentInfo)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangle_CompartmentInfo()
     * @model containment="true"
     * @generated
     */
	CompartmentInfo getCompartmentInfo();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.Rectangle#getCompartmentInfo <em>Compartment Info</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compartment Info</em>' containment reference.
     * @see #getCompartmentInfo()
     * @generated
     */
	void setCompartmentInfo(CompartmentInfo value);

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
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangle_Layout()
     * @model containment="true"
     * @generated
     */
	RectangleEllipseLayout getLayout();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.Rectangle#getLayout <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Layout</em>' containment reference.
     * @see #getLayout()
     * @generated
     */
	void setLayout(RectangleEllipseLayout value);

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
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangle_Shape()
     * @model containment="true"
     * @generated
     */
	EList<Shape> getShape();

} // Rectangle
