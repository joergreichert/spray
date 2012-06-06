/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package
 * @generated
 */
public interface Spray2Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Spray2Factory eINSTANCE = org.eclipselabs.spray2.xtext.spray2.impl.Spray2FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  Diagram createDiagram();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Spray Style Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spray Style Ref</em>'.
   * @generated
   */
  SprayStyleRef createSprayStyleRef();

  /**
   * Returns a new object of class '<em>Spray Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spray Element</em>'.
   * @generated
   */
  SprayElement createSprayElement();

  /**
   * Returns a new object of class '<em>Node Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Element</em>'.
   * @generated
   */
  NodeElement createNodeElement();

  /**
   * Returns a new object of class '<em>Edge Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge Element</em>'.
   * @generated
   */
  EdgeElement createEdgeElement();

  /**
   * Returns a new object of class '<em>Node Figure Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Figure Section</em>'.
   * @generated
   */
  NodeFigureSection createNodeFigureSection();

  /**
   * Returns a new object of class '<em>Edge Figure Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge Figure Section</em>'.
   * @generated
   */
  EdgeFigureSection createEdgeFigureSection();

  /**
   * Returns a new object of class '<em>Text Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Property Assignment</em>'.
   * @generated
   */
  TextPropertyAssignment createTextPropertyAssignment();

  /**
   * Returns a new object of class '<em>Compartment Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compartment Property Assignment</em>'.
   * @generated
   */
  CompartmentPropertyAssignment createCompartmentPropertyAssignment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Spray2Package getSpray2Package();

} //Spray2Factory
