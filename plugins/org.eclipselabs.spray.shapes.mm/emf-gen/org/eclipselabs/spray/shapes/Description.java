/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Description#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Description#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Description#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Description#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject
{
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(ShapeStyleRef)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getDescription_Style()
	 * @model containment="true"
	 * @generated
	 */
	ShapeStyleRef getStyle();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Description#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ShapeStyleRef value);

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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getDescription_HAlign()
	 * @model
	 * @generated
	 */
	HAlign getHAlign();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Description#getHAlign <em>HAlign</em>}' attribute.
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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getDescription_VAlign()
	 * @model
	 * @generated
	 */
	VAlign getVAlign();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Description#getVAlign <em>VAlign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAlign</em>' attribute.
	 * @see org.eclipselabs.spray.shapes.VAlign
	 * @see #getVAlign()
	 * @generated
	 */
	void setVAlign(VAlign value);

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
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getDescription_Body()
	 * @model containment="true"
	 * @generated
	 */
	TextBody getBody();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Description#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(TextBody value);

} // Description
