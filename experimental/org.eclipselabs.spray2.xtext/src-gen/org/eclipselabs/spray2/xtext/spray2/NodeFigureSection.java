/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Figure Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getShapeRef <em>Shape Ref</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getCompartmentProperties <em>Compartment Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getNodeFigureSection()
 * @model
 * @generated
 */
public interface NodeFigureSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Shape Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape Ref</em>' containment reference.
   * @see #setShapeRef(JvmTypeReference)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getNodeFigureSection_ShapeRef()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getShapeRef();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getShapeRef <em>Shape Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape Ref</em>' containment reference.
   * @see #getShapeRef()
   * @generated
   */
  void setShapeRef(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Text Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Properties</em>' containment reference list.
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getNodeFigureSection_TextProperties()
   * @model containment="true"
   * @generated
   */
  EList<TextPropertyAssignment> getTextProperties();

  /**
   * Returns the value of the '<em><b>Compartment Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compartment Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compartment Properties</em>' containment reference list.
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getNodeFigureSection_CompartmentProperties()
   * @model containment="true"
   * @generated
   */
  EList<CompartmentPropertyAssignment> getCompartmentProperties();

} // NodeFigureSection
