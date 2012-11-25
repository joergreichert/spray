/**
 */
package org.eclipselabs.spray.styles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Constant Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.ColorConstantRef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getColorConstantRef()
 * @model
 * @generated
 */
public interface ColorConstantRef extends Color {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipselabs.spray.styles.ColorConstants}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see org.eclipselabs.spray.styles.ColorConstants
     * @see #setValue(ColorConstants)
     * @see org.eclipselabs.spray.styles.StylesPackage#getColorConstantRef_Value()
     * @model
     * @generated
     */
    ColorConstants getValue();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.ColorConstantRef#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see org.eclipselabs.spray.styles.ColorConstants
     * @see #getValue()
     * @generated
     */
    void setValue(ColorConstants value);

} // ColorConstantRef
