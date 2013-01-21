/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.GradientLayout#getArea <em>Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getGradientLayout()
 * @model
 * @generated
 */
public interface GradientLayout extends EObject
{
	/**
     * Returns the value of the '<em><b>Area</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipselabs.spray.styles.GradientColorArea}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Area</em>' containment reference list.
     * @see org.eclipselabs.spray.styles.StylesPackage#getGradientLayout_Area()
     * @model containment="true"
     * @generated
     */
	EList<GradientColorArea> getArea();

} // GradientLayout
