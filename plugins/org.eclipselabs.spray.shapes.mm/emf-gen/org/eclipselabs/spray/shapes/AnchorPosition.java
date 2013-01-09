/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.AnchorPosition#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getAnchorPosition()
 * @model
 * @generated
 */
public interface AnchorPosition extends EObject
{
	/**
     * Returns the value of the '<em><b>Pos</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pos</em>' containment reference.
     * @see #setPos(AnchorPositionPos)
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getAnchorPosition_Pos()
     * @model containment="true"
     * @generated
     */
	AnchorPositionPos getPos();

	/**
     * Sets the value of the '{@link org.eclipselabs.spray.shapes.AnchorPosition#getPos <em>Pos</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pos</em>' containment reference.
     * @see #getPos()
     * @generated
     */
	void setPos(AnchorPositionPos value);

} // AnchorPosition
