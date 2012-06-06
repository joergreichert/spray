/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spray Style Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.SprayStyleRef#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayStyleRef()
 * @model
 * @generated
 */
public interface SprayStyleRef extends EObject
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
   * @see #setStyle(JvmTypeReference)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayStyleRef_Style()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.SprayStyleRef#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(JvmTypeReference value);

} // SprayStyleRef
