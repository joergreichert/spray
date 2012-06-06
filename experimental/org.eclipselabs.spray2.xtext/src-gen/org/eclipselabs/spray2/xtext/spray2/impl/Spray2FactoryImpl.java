/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.spray2.xtext.spray2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Spray2FactoryImpl extends EFactoryImpl implements Spray2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Spray2Factory init()
  {
    try
    {
      Spray2Factory theSpray2Factory = (Spray2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/spray2/xtext/Spray2"); 
      if (theSpray2Factory != null)
      {
        return theSpray2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Spray2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spray2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Spray2Package.DIAGRAM: return createDiagram();
      case Spray2Package.IMPORT: return createImport();
      case Spray2Package.SPRAY_STYLE_REF: return createSprayStyleRef();
      case Spray2Package.SPRAY_ELEMENT: return createSprayElement();
      case Spray2Package.NODE_ELEMENT: return createNodeElement();
      case Spray2Package.EDGE_ELEMENT: return createEdgeElement();
      case Spray2Package.NODE_FIGURE_SECTION: return createNodeFigureSection();
      case Spray2Package.EDGE_FIGURE_SECTION: return createEdgeFigureSection();
      case Spray2Package.TEXT_PROPERTY_ASSIGNMENT: return createTextPropertyAssignment();
      case Spray2Package.COMPARTMENT_PROPERTY_ASSIGNMENT: return createCompartmentPropertyAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram createDiagram()
  {
    DiagramImpl diagram = new DiagramImpl();
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayStyleRef createSprayStyleRef()
  {
    SprayStyleRefImpl sprayStyleRef = new SprayStyleRefImpl();
    return sprayStyleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayElement createSprayElement()
  {
    SprayElementImpl sprayElement = new SprayElementImpl();
    return sprayElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeElement createNodeElement()
  {
    NodeElementImpl nodeElement = new NodeElementImpl();
    return nodeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeElement createEdgeElement()
  {
    EdgeElementImpl edgeElement = new EdgeElementImpl();
    return edgeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeFigureSection createNodeFigureSection()
  {
    NodeFigureSectionImpl nodeFigureSection = new NodeFigureSectionImpl();
    return nodeFigureSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeFigureSection createEdgeFigureSection()
  {
    EdgeFigureSectionImpl edgeFigureSection = new EdgeFigureSectionImpl();
    return edgeFigureSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextPropertyAssignment createTextPropertyAssignment()
  {
    TextPropertyAssignmentImpl textPropertyAssignment = new TextPropertyAssignmentImpl();
    return textPropertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentPropertyAssignment createCompartmentPropertyAssignment()
  {
    CompartmentPropertyAssignmentImpl compartmentPropertyAssignment = new CompartmentPropertyAssignmentImpl();
    return compartmentPropertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spray2Package getSpray2Package()
  {
    return (Spray2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Spray2Package getPackage()
  {
    return Spray2Package.eINSTANCE;
  }

} //Spray2FactoryImpl
