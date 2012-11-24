/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Ellipse Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout#getCommon <em>Common</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangleEllipseLayout()
 * @model
 * @generated
 */
public interface RectangleEllipseLayout extends EObject
{
	/**
	 * Returns the value of the '<em><b>Common</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common</em>' containment reference.
	 * @see #setCommon(CommonLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangleEllipseLayout_Common()
	 * @model containment="true"
	 * @generated
	 */
	CommonLayout getCommon();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout#getCommon <em>Common</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common</em>' containment reference.
	 * @see #getCommon()
	 * @generated
	 */
	void setCommon(CommonLayout value);

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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getRectangleEllipseLayout_Layout()
	 * @model containment="true"
	 * @generated
	 */
	ShapestyleLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(ShapestyleLayout value);

} // RectangleEllipseLayout
