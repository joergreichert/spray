/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.Style#getSuperStyle <em>Super Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.Style#getSuperStyleFromDsl <em>Super Style From Dsl</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.Style#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends StyleContainerElement {
    /**
     * Returns the value of the '<em><b>Super Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Style</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Style</em>' containment reference.
     * @see #setSuperStyle(JvmTypeReference)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyle_SuperStyle()
     * @model containment="true"
     * @generated
     */
    JvmTypeReference getSuperStyle();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.Style#getSuperStyle <em>Super Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Style</em>' containment reference.
     * @see #getSuperStyle()
     * @generated
     */
    void setSuperStyle(JvmTypeReference value);

    /**
     * Returns the value of the '<em><b>Super Style From Dsl</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Style From Dsl</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Style From Dsl</em>' reference.
     * @see #setSuperStyleFromDsl(Style)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyle_SuperStyleFromDsl()
     * @model
     * @generated
     */
    Style getSuperStyleFromDsl();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.Style#getSuperStyleFromDsl <em>Super Style From Dsl</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Style From Dsl</em>' reference.
     * @see #getSuperStyleFromDsl()
     * @generated
     */
    void setSuperStyleFromDsl(Style value);

    /**
     * Returns the value of the '<em><b>Layout</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Layout</em>' containment reference.
     * @see #setLayout(StyleLayout)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyle_Layout()
     * @model containment="true"
     * @generated
     */
    StyleLayout getLayout();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.Style#getLayout <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Layout</em>' containment reference.
     * @see #getLayout()
     * @generated
     */
    void setLayout(StyleLayout value);

} // Style
