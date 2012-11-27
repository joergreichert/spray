/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.Point#getXcor <em>Xcor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Point#getYcor <em>Ycor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Point#getCurveBefore <em>Curve Before</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.Point#getCurveAfter <em>Curve After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
	/**
	 * Returns the value of the '<em><b>Xcor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xcor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xcor</em>' attribute.
	 * @see #setXcor(int)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPoint_Xcor()
	 * @model
	 * @generated
	 */
	int getXcor();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Point#getXcor <em>Xcor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xcor</em>' attribute.
	 * @see #getXcor()
	 * @generated
	 */
	void setXcor(int value);

	/**
	 * Returns the value of the '<em><b>Ycor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ycor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ycor</em>' attribute.
	 * @see #setYcor(int)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPoint_Ycor()
	 * @model
	 * @generated
	 */
	int getYcor();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Point#getYcor <em>Ycor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ycor</em>' attribute.
	 * @see #getYcor()
	 * @generated
	 */
	void setYcor(int value);

	/**
	 * Returns the value of the '<em><b>Curve Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Before</em>' attribute.
	 * @see #setCurveBefore(int)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPoint_CurveBefore()
	 * @model
	 * @generated
	 */
	int getCurveBefore();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Point#getCurveBefore <em>Curve Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Before</em>' attribute.
	 * @see #getCurveBefore()
	 * @generated
	 */
	void setCurveBefore(int value);

	/**
	 * Returns the value of the '<em><b>Curve After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve After</em>' attribute.
	 * @see #setCurveAfter(int)
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#getPoint_CurveAfter()
	 * @model
	 * @generated
	 */
	int getCurveAfter();

	/**
	 * Sets the value of the '{@link org.eclipselabs.spray.shapes.Point#getCurveAfter <em>Curve After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve After</em>' attribute.
	 * @see #getCurveAfter()
	 * @generated
	 */
	void setCurveAfter(int value);

} // Point
