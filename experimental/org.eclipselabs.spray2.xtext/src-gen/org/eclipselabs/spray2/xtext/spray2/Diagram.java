/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getSprayElements <em>Spray Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray2.xtext.spray2.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getDiagram_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getDiagram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Type</em>' reference.
   * @see #setModelType(EClass)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getDiagram_ModelType()
   * @model
   * @generated
   */
  EClass getModelType();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getModelType <em>Model Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Type</em>' reference.
   * @see #getModelType()
   * @generated
   */
  void setModelType(EClass value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(SprayStyleRef)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getDiagram_Style()
   * @model containment="true"
   * @generated
   */
  SprayStyleRef getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(SprayStyleRef value);

  /**
   * Returns the value of the '<em><b>Spray Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray2.xtext.spray2.SprayElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spray Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spray Elements</em>' containment reference list.
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getDiagram_SprayElements()
   * @model containment="true"
   * @generated
   */
  EList<SprayElement> getSprayElements();

} // Diagram
