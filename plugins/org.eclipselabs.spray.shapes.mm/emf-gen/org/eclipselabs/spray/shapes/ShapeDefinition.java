/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapeDefinition#getShapeLayout <em>Shape Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapeDefinition#getShape <em>Shape</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapeDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapeDefinition#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeDefinition()
 * @model
 * @generated
 */
public interface ShapeDefinition extends ShapeContainerElement
{
	/**
     * Returns the value of the '<em><b>Shape Layout</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Shape Layout</em>' containment reference.
     * @see #setShapeLayout(ShapeLayout)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeDefinition_ShapeLayout()
     * @model containment="true"
     * @generated
     */
	ShapeLayout getShapeLayout();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getShapeLayout <em>Shape Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shape Layout</em>' containment reference.
     * @see #getShapeLayout()
     * @generated
     */
	void setShapeLayout(ShapeLayout value);

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
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeDefinition_Shape()
     * @model containment="true"
     * @generated
     */
	EList<Shape> getShape();

	/**
     * Returns the value of the '<em><b>Description</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' containment reference.
     * @see #setDescription(Description)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeDefinition_Description()
     * @model containment="true"
     * @generated
     */
	Description getDescription();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getDescription <em>Description</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' containment reference.
     * @see #getDescription()
     * @generated
     */
	void setDescription(Description value);

	/**
     * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Anchor</em>' containment reference.
     * @see #setAnchor(Anchor)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapeDefinition_Anchor()
     * @model containment="true"
     * @generated
     */
	Anchor getAnchor();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getAnchor <em>Anchor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor</em>' containment reference.
     * @see #getAnchor()
     * @generated
     */
	void setAnchor(Anchor value);

} // ShapeDefinition
