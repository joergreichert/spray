/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapeContainerElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapeContainerElement#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeContainerElement()
 * @model
 * @generated
 */
public interface ShapeContainerElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeContainerElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.ShapeContainerElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeContainerElement_Style()
	 * @model containment="true"
	 * @generated
	 */
	ShapeStyleRef getStyle();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.ShapeContainerElement#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ShapeStyleRef value);

} // ShapeContainerElement
