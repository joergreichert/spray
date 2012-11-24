/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Compartment#getCompartmentLayout <em>Compartment Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Compartment#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Compartment Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.CompartmentLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Layout</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.CompartmentLayout
	 * @see #setCompartmentLayout(CompartmentLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartment_CompartmentLayout()
	 * @model
	 * @generated
	 */
	CompartmentLayout getCompartmentLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Compartment#getCompartmentLayout <em>Compartment Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Layout</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.CompartmentLayout
	 * @see #getCompartmentLayout()
	 * @generated
	 */
	void setCompartmentLayout(CompartmentLayout value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(CompartmentShape)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartment_Shape()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentShape getShape();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Compartment#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(CompartmentShape value);

} // Compartment
