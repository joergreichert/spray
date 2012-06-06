/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getCompartmentPropertyAssignment()
 * @model
 * @generated
 */
public interface CompartmentPropertyAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' reference.
   * @see #setKey(JvmEnumerationLiteral)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getCompartmentPropertyAssignment_Key()
   * @model
   * @generated
   */
  JvmEnumerationLiteral getKey();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getKey <em>Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' reference.
   * @see #getKey()
   * @generated
   */
  void setKey(JvmEnumerationLiteral value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(EAttribute)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getCompartmentPropertyAssignment_Attribute()
   * @model
   * @generated
   */
  EAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(EAttribute value);

} // CompartmentPropertyAssignment
