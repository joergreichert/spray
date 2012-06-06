/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.NodeElement#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getNodeElement()
 * @model
 * @generated
 */
public interface NodeElement extends SprayElement
{
  /**
   * Returns the value of the '<em><b>Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figure</em>' containment reference.
   * @see #setFigure(NodeFigureSection)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getNodeElement_Figure()
   * @model containment="true"
   * @generated
   */
  NodeFigureSection getFigure();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.NodeElement#getFigure <em>Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure</em>' containment reference.
   * @see #getFigure()
   * @generated
   */
  void setFigure(NodeFigureSection value);

} // NodeElement
