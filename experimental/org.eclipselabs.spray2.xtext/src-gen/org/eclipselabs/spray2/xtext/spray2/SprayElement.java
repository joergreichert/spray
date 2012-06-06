/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spray Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getTooling <em>Tooling</em>}</li>
 *   <li>{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayElement()
 * @model
 * @generated
 */
public interface SprayElement extends EObject
{
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
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EClass)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayElement_Type()
   * @model
   * @generated
   */
  EClass getType();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EClass value);

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
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayElement_Style()
   * @model containment="true"
   * @generated
   */
  SprayStyleRef getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(SprayStyleRef value);

  /**
   * Returns the value of the '<em><b>Tooling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooling</em>' attribute.
   * @see #setTooling(String)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayElement_Tooling()
   * @model
   * @generated
   */
  String getTooling();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getTooling <em>Tooling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooling</em>' attribute.
   * @see #getTooling()
   * @generated
   */
  void setTooling(String value);

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' attribute.
   * @see #setBehavior(String)
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#getSprayElement_Behavior()
   * @model
   * @generated
   */
  String getBehavior();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getBehavior <em>Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' attribute.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(String value);

} // SprayElement
