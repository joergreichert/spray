/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartmentRoundedRectangle()
 * @model
 * @generated
 */
public interface CompartmentRoundedRectangle extends EObject
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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartmentRoundedRectangle_Layout()
	 * @model containment="true"
	 * @generated
	 */
	RoundedRectangleLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(RoundedRectangleLayout value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(TextBody)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartmentRoundedRectangle_Id()
	 * @model containment="true"
	 * @generated
	 */
	TextBody getId();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(TextBody value);

} // CompartmentRoundedRectangle
