/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor Manual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.AnchorManual#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getAnchorManual()
 * @model
 * @generated
 */
public interface AnchorManual extends AnchorType
{
	/**
     * Returns the value of the '<em><b>Position</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipselabs.spray.shapes.AnchorPosition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' containment reference list.
     * @see org.eclipselabs.spray.shapes.ShapesPackage#getAnchorManual_Position()
     * @model containment="true"
     * @generated
     */
	EList<AnchorPosition> getPosition();

} // AnchorManual
