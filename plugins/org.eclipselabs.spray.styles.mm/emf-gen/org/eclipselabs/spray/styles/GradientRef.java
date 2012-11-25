/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.GradientRef#getGradientRef <em>Gradient Ref</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.GradientRef#getGradientRefFromDsl <em>Gradient Ref From Dsl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getGradientRef()
 * @model
 * @generated
 */
public interface GradientRef extends ColorOrGradient {
    /**
     * Returns the value of the '<em><b>Gradient Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gradient Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gradient Ref</em>' containment reference.
     * @see #setGradientRef(JvmTypeReference)
     * @see org.eclipselabs.spray.styles.StylesPackage#getGradientRef_GradientRef()
     * @model containment="true"
     * @generated
     */
    JvmTypeReference getGradientRef();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.GradientRef#getGradientRef <em>Gradient Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gradient Ref</em>' containment reference.
     * @see #getGradientRef()
     * @generated
     */
    void setGradientRef(JvmTypeReference value);

    /**
     * Returns the value of the '<em><b>Gradient Ref From Dsl</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gradient Ref From Dsl</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gradient Ref From Dsl</em>' reference.
     * @see #setGradientRefFromDsl(Gradient)
     * @see org.eclipselabs.spray.styles.StylesPackage#getGradientRef_GradientRefFromDsl()
     * @model
     * @generated
     */
    Gradient getGradientRefFromDsl();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.GradientRef#getGradientRefFromDsl <em>Gradient Ref From Dsl</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gradient Ref From Dsl</em>' reference.
     * @see #getGradientRefFromDsl()
     * @generated
     */
    void setGradientRefFromDsl(Gradient value);

} // GradientRef
