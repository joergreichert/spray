/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.LineLayout#getPoint <em>Point</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.LineLayout#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getLineLayout()
 * @model
 * @generated
 */
public interface LineLayout extends EObject
{
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.spray.shapes.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getLineLayout_Point()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoint();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(ShapestyleLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getLineLayout_Layout()
	 * @model containment="true"
	 * @generated
	 */
	ShapestyleLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.LineLayout#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(ShapestyleLayout value);

} // LineLayout
