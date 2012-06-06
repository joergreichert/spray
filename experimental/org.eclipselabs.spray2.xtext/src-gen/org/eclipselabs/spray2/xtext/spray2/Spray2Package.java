/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray2.xtext.spray2.Spray2Factory
 * @model kind="package"
 * @generated
 */
public interface Spray2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spray2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/spray2/xtext/Spray2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spray2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Spray2Package eINSTANCE = org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getDiagram()
   * @generated
   */
  int DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__NAME = 1;

  /**
   * The feature id for the '<em><b>Model Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__MODEL_TYPE = 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__STYLE = 3;

  /**
   * The feature id for the '<em><b>Spray Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__SPRAY_ELEMENTS = 4;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.ImportImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayStyleRefImpl <em>Spray Style Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.SprayStyleRefImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getSprayStyleRef()
   * @generated
   */
  int SPRAY_STYLE_REF = 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_STYLE_REF__STYLE = 0;

  /**
   * The number of structural features of the '<em>Spray Style Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_STYLE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl <em>Spray Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getSprayElement()
   * @generated
   */
  int SPRAY_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT__STYLE = 2;

  /**
   * The feature id for the '<em><b>Tooling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT__TOOLING = 3;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT__BEHAVIOR = 4;

  /**
   * The number of structural features of the '<em>Spray Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.NodeElementImpl <em>Node Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.NodeElementImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getNodeElement()
   * @generated
   */
  int NODE_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT__NAME = SPRAY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT__TYPE = SPRAY_ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT__STYLE = SPRAY_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Tooling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT__TOOLING = SPRAY_ELEMENT__TOOLING;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT__BEHAVIOR = SPRAY_ELEMENT__BEHAVIOR;

  /**
   * The feature id for the '<em><b>Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT__FIGURE = SPRAY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ELEMENT_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.EdgeElementImpl <em>Edge Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.EdgeElementImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getEdgeElement()
   * @generated
   */
  int EDGE_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT__NAME = SPRAY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT__TYPE = SPRAY_ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT__STYLE = SPRAY_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Tooling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT__TOOLING = SPRAY_ELEMENT__TOOLING;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT__BEHAVIOR = SPRAY_ELEMENT__BEHAVIOR;

  /**
   * The feature id for the '<em><b>Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT__FIGURE = SPRAY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Edge Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ELEMENT_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.NodeFigureSectionImpl <em>Node Figure Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.NodeFigureSectionImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getNodeFigureSection()
   * @generated
   */
  int NODE_FIGURE_SECTION = 6;

  /**
   * The feature id for the '<em><b>Shape Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE_SECTION__SHAPE_REF = 0;

  /**
   * The feature id for the '<em><b>Text Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE_SECTION__TEXT_PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Compartment Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE_SECTION__COMPARTMENT_PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Node Figure Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FIGURE_SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.EdgeFigureSectionImpl <em>Edge Figure Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.EdgeFigureSectionImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getEdgeFigureSection()
   * @generated
   */
  int EDGE_FIGURE_SECTION = 7;

  /**
   * The feature id for the '<em><b>Shape Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FIGURE_SECTION__SHAPE_REF = 0;

  /**
   * The feature id for the '<em><b>Text Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FIGURE_SECTION__TEXT_PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Edge Figure Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FIGURE_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl <em>Text Property Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getTextPropertyAssignment()
   * @generated
   */
  int TEXT_PROPERTY_ASSIGNMENT = 8;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY_ASSIGNMENT__KEY = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Editable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY_ASSIGNMENT__EDITABLE = 2;

  /**
   * The feature id for the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY_ASSIGNMENT__FORMAT = 3;

  /**
   * The number of structural features of the '<em>Text Property Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PROPERTY_ASSIGNMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.CompartmentPropertyAssignmentImpl <em>Compartment Property Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray2.xtext.spray2.impl.CompartmentPropertyAssignmentImpl
   * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getCompartmentPropertyAssignment()
   * @generated
   */
  int COMPARTMENT_PROPERTY_ASSIGNMENT = 9;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_PROPERTY_ASSIGNMENT__KEY = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Compartment Property Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_PROPERTY_ASSIGNMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Diagram
   * @generated
   */
  EClass getDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Diagram#getImports()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Diagram#getName()
   * @see #getDiagram()
   * @generated
   */
  EAttribute getDiagram_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Type</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Diagram#getModelType()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_ModelType();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Diagram#getStyle()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray2.xtext.spray2.Diagram#getSprayElements <em>Spray Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Spray Elements</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Diagram#getSprayElements()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_SprayElements();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray2.xtext.spray2.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.SprayStyleRef <em>Spray Style Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spray Style Ref</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayStyleRef
   * @generated
   */
  EClass getSprayStyleRef();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.SprayStyleRef#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayStyleRef#getStyle()
   * @see #getSprayStyleRef()
   * @generated
   */
  EReference getSprayStyleRef_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement <em>Spray Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spray Element</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayElement
   * @generated
   */
  EClass getSprayElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayElement#getName()
   * @see #getSprayElement()
   * @generated
   */
  EAttribute getSprayElement_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayElement#getType()
   * @see #getSprayElement()
   * @generated
   */
  EReference getSprayElement_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayElement#getStyle()
   * @see #getSprayElement()
   * @generated
   */
  EReference getSprayElement_Style();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getTooling <em>Tooling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tooling</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayElement#getTooling()
   * @see #getSprayElement()
   * @generated
   */
  EAttribute getSprayElement_Tooling();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray2.xtext.spray2.SprayElement#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Behavior</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.SprayElement#getBehavior()
   * @see #getSprayElement()
   * @generated
   */
  EAttribute getSprayElement_Behavior();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.NodeElement <em>Node Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Element</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.NodeElement
   * @generated
   */
  EClass getNodeElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.NodeElement#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Figure</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.NodeElement#getFigure()
   * @see #getNodeElement()
   * @generated
   */
  EReference getNodeElement_Figure();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.EdgeElement <em>Edge Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Element</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.EdgeElement
   * @generated
   */
  EClass getEdgeElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.EdgeElement#getFigure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Figure</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.EdgeElement#getFigure()
   * @see #getEdgeElement()
   * @generated
   */
  EReference getEdgeElement_Figure();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection <em>Node Figure Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Figure Section</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.NodeFigureSection
   * @generated
   */
  EClass getNodeFigureSection();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getShapeRef <em>Shape Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape Ref</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getShapeRef()
   * @see #getNodeFigureSection()
   * @generated
   */
  EReference getNodeFigureSection_ShapeRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getTextProperties <em>Text Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Text Properties</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getTextProperties()
   * @see #getNodeFigureSection()
   * @generated
   */
  EReference getNodeFigureSection_TextProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getCompartmentProperties <em>Compartment Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Compartment Properties</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.NodeFigureSection#getCompartmentProperties()
   * @see #getNodeFigureSection()
   * @generated
   */
  EReference getNodeFigureSection_CompartmentProperties();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection <em>Edge Figure Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Figure Section</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection
   * @generated
   */
  EClass getEdgeFigureSection();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection#getShapeRef <em>Shape Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape Ref</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection#getShapeRef()
   * @see #getEdgeFigureSection()
   * @generated
   */
  EReference getEdgeFigureSection_ShapeRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection#getTextProperties <em>Text Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Text Properties</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection#getTextProperties()
   * @see #getEdgeFigureSection()
   * @generated
   */
  EReference getEdgeFigureSection_TextProperties();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment <em>Text Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Property Assignment</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment
   * @generated
   */
  EClass getTextPropertyAssignment();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getKey()
   * @see #getTextPropertyAssignment()
   * @generated
   */
  EReference getTextPropertyAssignment_Key();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getAttribute()
   * @see #getTextPropertyAssignment()
   * @generated
   */
  EReference getTextPropertyAssignment_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Editable</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getEditable()
   * @see #getTextPropertyAssignment()
   * @generated
   */
  EReference getTextPropertyAssignment_Editable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Format</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment#getFormat()
   * @see #getTextPropertyAssignment()
   * @generated
   */
  EReference getTextPropertyAssignment_Format();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment <em>Compartment Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Property Assignment</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment
   * @generated
   */
  EClass getCompartmentPropertyAssignment();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getKey()
   * @see #getCompartmentPropertyAssignment()
   * @generated
   */
  EReference getCompartmentPropertyAssignment_Key();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment#getAttribute()
   * @see #getCompartmentPropertyAssignment()
   * @generated
   */
  EReference getCompartmentPropertyAssignment_Attribute();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Spray2Factory getSpray2Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.DiagramImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getDiagram()
     * @generated
     */
    EClass DIAGRAM = eINSTANCE.getDiagram();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__IMPORTS = eINSTANCE.getDiagram_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

    /**
     * The meta object literal for the '<em><b>Model Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__MODEL_TYPE = eINSTANCE.getDiagram_ModelType();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__STYLE = eINSTANCE.getDiagram_Style();

    /**
     * The meta object literal for the '<em><b>Spray Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__SPRAY_ELEMENTS = eINSTANCE.getDiagram_SprayElements();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.ImportImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayStyleRefImpl <em>Spray Style Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.SprayStyleRefImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getSprayStyleRef()
     * @generated
     */
    EClass SPRAY_STYLE_REF = eINSTANCE.getSprayStyleRef();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPRAY_STYLE_REF__STYLE = eINSTANCE.getSprayStyleRef_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl <em>Spray Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.SprayElementImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getSprayElement()
     * @generated
     */
    EClass SPRAY_ELEMENT = eINSTANCE.getSprayElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPRAY_ELEMENT__NAME = eINSTANCE.getSprayElement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPRAY_ELEMENT__TYPE = eINSTANCE.getSprayElement_Type();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPRAY_ELEMENT__STYLE = eINSTANCE.getSprayElement_Style();

    /**
     * The meta object literal for the '<em><b>Tooling</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPRAY_ELEMENT__TOOLING = eINSTANCE.getSprayElement_Tooling();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPRAY_ELEMENT__BEHAVIOR = eINSTANCE.getSprayElement_Behavior();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.NodeElementImpl <em>Node Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.NodeElementImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getNodeElement()
     * @generated
     */
    EClass NODE_ELEMENT = eINSTANCE.getNodeElement();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ELEMENT__FIGURE = eINSTANCE.getNodeElement_Figure();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.EdgeElementImpl <em>Edge Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.EdgeElementImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getEdgeElement()
     * @generated
     */
    EClass EDGE_ELEMENT = eINSTANCE.getEdgeElement();

    /**
     * The meta object literal for the '<em><b>Figure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ELEMENT__FIGURE = eINSTANCE.getEdgeElement_Figure();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.NodeFigureSectionImpl <em>Node Figure Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.NodeFigureSectionImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getNodeFigureSection()
     * @generated
     */
    EClass NODE_FIGURE_SECTION = eINSTANCE.getNodeFigureSection();

    /**
     * The meta object literal for the '<em><b>Shape Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_FIGURE_SECTION__SHAPE_REF = eINSTANCE.getNodeFigureSection_ShapeRef();

    /**
     * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_FIGURE_SECTION__TEXT_PROPERTIES = eINSTANCE.getNodeFigureSection_TextProperties();

    /**
     * The meta object literal for the '<em><b>Compartment Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_FIGURE_SECTION__COMPARTMENT_PROPERTIES = eINSTANCE.getNodeFigureSection_CompartmentProperties();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.EdgeFigureSectionImpl <em>Edge Figure Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.EdgeFigureSectionImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getEdgeFigureSection()
     * @generated
     */
    EClass EDGE_FIGURE_SECTION = eINSTANCE.getEdgeFigureSection();

    /**
     * The meta object literal for the '<em><b>Shape Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_FIGURE_SECTION__SHAPE_REF = eINSTANCE.getEdgeFigureSection_ShapeRef();

    /**
     * The meta object literal for the '<em><b>Text Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_FIGURE_SECTION__TEXT_PROPERTIES = eINSTANCE.getEdgeFigureSection_TextProperties();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl <em>Text Property Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.TextPropertyAssignmentImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getTextPropertyAssignment()
     * @generated
     */
    EClass TEXT_PROPERTY_ASSIGNMENT = eINSTANCE.getTextPropertyAssignment();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_PROPERTY_ASSIGNMENT__KEY = eINSTANCE.getTextPropertyAssignment_Key();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getTextPropertyAssignment_Attribute();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_PROPERTY_ASSIGNMENT__EDITABLE = eINSTANCE.getTextPropertyAssignment_Editable();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_PROPERTY_ASSIGNMENT__FORMAT = eINSTANCE.getTextPropertyAssignment_Format();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray2.xtext.spray2.impl.CompartmentPropertyAssignmentImpl <em>Compartment Property Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray2.xtext.spray2.impl.CompartmentPropertyAssignmentImpl
     * @see org.eclipselabs.spray2.xtext.spray2.impl.Spray2PackageImpl#getCompartmentPropertyAssignment()
     * @generated
     */
    EClass COMPARTMENT_PROPERTY_ASSIGNMENT = eINSTANCE.getCompartmentPropertyAssignment();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_PROPERTY_ASSIGNMENT__KEY = eINSTANCE.getCompartmentPropertyAssignment_Key();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getCompartmentPropertyAssignment_Attribute();

  }

} //Spray2Package
