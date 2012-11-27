/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getConnectionStyle <em>Connection Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getPlacing <em>Placing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getConnectionDefinition()
 * @model
 * @generated
 */
public interface ConnectionDefinition extends ShapeContainerElement
{
	/**
	 * Returns the value of the '<em><b>Connection Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.ConnectionStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Style</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.ConnectionStyle
	 * @see #setConnectionStyle(ConnectionStyle)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getConnectionDefinition_ConnectionStyle()
	 * @model
	 * @generated
	 */
	ConnectionStyle getConnectionStyle();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getConnectionStyle <em>Connection Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Style</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.ConnectionStyle
	 * @see #getConnectionStyle()
	 * @generated
	 */
	void setConnectionStyle(ConnectionStyle value);

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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getConnectionDefinition_Layout()
	 * @model containment="true"
	 * @generated
	 */
	ShapestyleLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(ShapestyleLayout value);

	/**
	 * Returns the value of the '<em><b>Placing</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.spray.shapes.PlacingDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placing</em>' containment reference list.
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getConnectionDefinition_Placing()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlacingDefinition> getPlacing();

} // ConnectionDefinition
