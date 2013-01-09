/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placing Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.PlacingDefinition#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.PlacingDefinition#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.PlacingDefinition#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.PlacingDefinition#getShapeCon <em>Shape Con</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPlacingDefinition()
 * @model
 * @generated
 */
public interface PlacingDefinition extends EObject
{
	/**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * The default value is <code>"4.9E-324"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(double)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getPlacingDefinition_Offset()
     * @model default="4.9E-324"
     * @generated
     */
	double getOffset();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
	void setOffset(double value);

	/**
     * Returns the value of the '<em><b>Distance</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Distance</em>' attribute.
     * @see #setDistance(int)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getPlacingDefinition_Distance()
     * @model
     * @generated
     */
	int getDistance();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getDistance <em>Distance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance</em>' attribute.
     * @see #getDistance()
     * @generated
     */
	void setDistance(int value);

	/**
     * Returns the value of the '<em><b>Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Angle</em>' attribute.
     * @see #setAngle(int)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getPlacingDefinition_Angle()
     * @model
     * @generated
     */
	int getAngle();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle</em>' attribute.
     * @see #getAngle()
     * @generated
     */
	void setAngle(int value);

	/**
     * Returns the value of the '<em><b>Shape Con</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Con</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Shape Con</em>' containment reference.
     * @see #setShapeCon(ShapeConnection)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getPlacingDefinition_ShapeCon()
     * @model containment="true"
     * @generated
     */
	ShapeConnection getShapeCon();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getShapeCon <em>Shape Con</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shape Con</em>' containment reference.
     * @see #getShapeCon()
     * @generated
     */
	void setShapeCon(ShapeConnection value);

} // PlacingDefinition
