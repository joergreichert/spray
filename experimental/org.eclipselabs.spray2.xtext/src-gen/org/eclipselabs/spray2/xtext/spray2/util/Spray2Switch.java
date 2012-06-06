/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.spray2.xtext.spray2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package
 * @generated
 */
public class Spray2Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Spray2Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spray2Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = Spray2Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Spray2Package.DIAGRAM:
      {
        Diagram diagram = (Diagram)theEObject;
        T result = caseDiagram(diagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.SPRAY_STYLE_REF:
      {
        SprayStyleRef sprayStyleRef = (SprayStyleRef)theEObject;
        T result = caseSprayStyleRef(sprayStyleRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.SPRAY_ELEMENT:
      {
        SprayElement sprayElement = (SprayElement)theEObject;
        T result = caseSprayElement(sprayElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.NODE_ELEMENT:
      {
        NodeElement nodeElement = (NodeElement)theEObject;
        T result = caseNodeElement(nodeElement);
        if (result == null) result = caseSprayElement(nodeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.EDGE_ELEMENT:
      {
        EdgeElement edgeElement = (EdgeElement)theEObject;
        T result = caseEdgeElement(edgeElement);
        if (result == null) result = caseSprayElement(edgeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.NODE_FIGURE_SECTION:
      {
        NodeFigureSection nodeFigureSection = (NodeFigureSection)theEObject;
        T result = caseNodeFigureSection(nodeFigureSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.EDGE_FIGURE_SECTION:
      {
        EdgeFigureSection edgeFigureSection = (EdgeFigureSection)theEObject;
        T result = caseEdgeFigureSection(edgeFigureSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT:
      {
        TextPropertyAssignment textPropertyAssignment = (TextPropertyAssignment)theEObject;
        T result = caseTextPropertyAssignment(textPropertyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT:
      {
        CompartmentPropertyAssignment compartmentPropertyAssignment = (CompartmentPropertyAssignment)theEObject;
        T result = caseCompartmentPropertyAssignment(compartmentPropertyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagram(Diagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spray Style Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spray Style Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSprayStyleRef(SprayStyleRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spray Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spray Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSprayElement(SprayElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeElement(NodeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edge Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edge Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEdgeElement(EdgeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Figure Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Figure Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeFigureSection(NodeFigureSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edge Figure Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edge Figure Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEdgeFigureSection(EdgeFigureSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Property Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextPropertyAssignment(TextPropertyAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compartment Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compartment Property Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompartmentPropertyAssignment(CompartmentPropertyAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Spray2Switch
