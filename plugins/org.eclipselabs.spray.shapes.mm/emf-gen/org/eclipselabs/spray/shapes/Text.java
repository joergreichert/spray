/**
 */
package org.eclipselabs.spray.shapes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Text#getTexttype <em>Texttype</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Text#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Text#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Shape
{
	/**
	 * Returns the value of the '<em><b>Texttype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.TextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texttype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texttype</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.TextType
	 * @see #setTexttype(TextType)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getText_Texttype()
	 * @model
	 * @generated
	 */
	TextType getTexttype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Text#getTexttype <em>Texttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texttype</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.TextType
	 * @see #getTexttype()
	 * @generated
	 */
	void setTexttype(TextType value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(TextLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getText_Layout()
	 * @model containment="true"
	 * @generated
	 */
	TextLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Text#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(TextLayout value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(TextBody)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getText_Body()
	 * @model containment="true"
	 * @generated
	 */
	TextBody getBody();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Text#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(TextBody value);

} // Text
