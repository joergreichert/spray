/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Shape#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends EObject
{
	/**
     * Returns the value of the '<em><b>Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' containment reference.
     * @see #setStyle(ShapeStyleRef)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getShape_Style()
     * @model containment="true"
     * @generated
     */
	ShapeStyleRef getStyle();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.Shape#getStyle <em>Style</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' containment reference.
     * @see #getStyle()
     * @generated
     */
	void setStyle(ShapeStyleRef value);

} // Shape
