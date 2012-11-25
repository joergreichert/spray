/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Color Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.GradientColorArea#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.GradientColorArea#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getGradientColorArea()
 * @model
 * @generated
 */
public interface GradientColorArea extends EObject {
    /**
     * Returns the value of the '<em><b>Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' containment reference.
     * @see #setColor(Color)
     * @see org.eclipselabs.spray.styles.StylesPackage#getGradientColorArea_Color()
     * @model containment="true"
     * @generated
     */
    Color getColor();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.GradientColorArea#getColor <em>Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' containment reference.
     * @see #getColor()
     * @generated
     */
    void setColor(Color value);

    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(double)
     * @see org.eclipselabs.spray.styles.StylesPackage#getGradientColorArea_Offset()
     * @model
     * @generated
     */
    double getOffset();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.GradientColorArea#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
    void setOffset(double value);

} // GradientColorArea
