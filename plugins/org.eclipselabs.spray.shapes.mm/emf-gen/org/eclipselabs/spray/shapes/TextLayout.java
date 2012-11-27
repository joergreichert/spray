/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.TextLayout#getCommon <em>Common</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.TextLayout#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.TextLayout#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.TextLayout#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getTextLayout()
 * @model
 * @generated
 */
public interface TextLayout extends EObject
{
	/**
	 * Returns the value of the '<em><b>Common</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common</em>' containment reference.
	 * @see #setCommon(CommonLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getTextLayout_Common()
	 * @model containment="true"
	 * @generated
	 */
	CommonLayout getCommon();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.TextLayout#getCommon <em>Common</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common</em>' containment reference.
	 * @see #getCommon()
	 * @generated
	 */
	void setCommon(CommonLayout value);

	/**
	 * Returns the value of the '<em><b>HAlign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.HAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAlign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAlign</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.HAlign
	 * @see #setHAlign(HAlign)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getTextLayout_HAlign()
	 * @model
	 * @generated
	 */
	HAlign getHAlign();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.TextLayout#getHAlign <em>HAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HAlign</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.HAlign
	 * @see #getHAlign()
	 * @generated
	 */
	void setHAlign(HAlign value);

	/**
	 * Returns the value of the '<em><b>VAlign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.VAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAlign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAlign</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.VAlign
	 * @see #setVAlign(VAlign)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getTextLayout_VAlign()
	 * @model
	 * @generated
	 */
	VAlign getVAlign();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.TextLayout#getVAlign <em>VAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAlign</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.VAlign
	 * @see #getVAlign()
	 * @generated
	 */
	void setVAlign(VAlign value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(ShapestyleLayout)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getTextLayout_Layout()
	 * @model containment="true"
	 * @generated
	 */
	ShapestyleLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.TextLayout#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(ShapestyleLayout value);

} // TextLayout
