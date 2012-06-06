/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.spray2.xtext.spray2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipselabs.spray2.xtext.spray2.CompartmentPropertyAssignment;
import org.eclipselabs.spray2.xtext.spray2.Diagram;
import org.eclipselabs.spray2.xtext.spray2.EdgeElement;
import org.eclipselabs.spray2.xtext.spray2.EdgeFigureSection;
import org.eclipselabs.spray2.xtext.spray2.Import;
import org.eclipselabs.spray2.xtext.spray2.NodeElement;
import org.eclipselabs.spray2.xtext.spray2.NodeFigureSection;
import org.eclipselabs.spray2.xtext.spray2.Spray2Factory;
import org.eclipselabs.spray2.xtext.spray2.Spray2Package;
import org.eclipselabs.spray2.xtext.spray2.SprayElement;
import org.eclipselabs.spray2.xtext.spray2.SprayStyleRef;
import org.eclipselabs.spray2.xtext.spray2.TextPropertyAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Spray2PackageImpl extends EPackageImpl implements Spray2Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sprayStyleRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sprayElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeFigureSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeFigureSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textPropertyAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compartmentPropertyAssignmentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipselabs.spray2.xtext.spray2.Spray2Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Spray2PackageImpl()
  {
    super(eNS_URI, Spray2Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Spray2Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Spray2Package init()
  {
    if (isInited) return (Spray2Package)EPackage.Registry.INSTANCE.getEPackage(Spray2Package.eNS_URI);

    // Obtain or create and register package
    Spray2PackageImpl theSpray2Package = (Spray2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Spray2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Spray2PackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSpray2Package.createPackageContents();

    // Initialize created meta-data
    theSpray2Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpray2Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Spray2Package.eNS_URI, theSpray2Package);
    return theSpray2Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagram()
  {
    return diagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_Imports()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagram_Name()
  {
    return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_ModelType()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_Style()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_SprayElements()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSprayStyleRef()
  {
    return sprayStyleRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprayStyleRef_Style()
  {
    return (EReference)sprayStyleRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSprayElement()
  {
    return sprayElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSprayElement_Name()
  {
    return (EAttribute)sprayElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprayElement_Type()
  {
    return (EReference)sprayElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprayElement_Style()
  {
    return (EReference)sprayElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSprayElement_Tooling()
  {
    return (EAttribute)sprayElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSprayElement_Behavior()
  {
    return (EAttribute)sprayElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeElement()
  {
    return nodeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeElement_Figure()
  {
    return (EReference)nodeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdgeElement()
  {
    return edgeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeElement_Figure()
  {
    return (EReference)edgeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeFigureSection()
  {
    return nodeFigureSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeFigureSection_ShapeRef()
  {
    return (EReference)nodeFigureSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeFigureSection_TextProperties()
  {
    return (EReference)nodeFigureSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeFigureSection_CompartmentProperties()
  {
    return (EReference)nodeFigureSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdgeFigureSection()
  {
    return edgeFigureSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeFigureSection_ShapeRef()
  {
    return (EReference)edgeFigureSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeFigureSection_TextProperties()
  {
    return (EReference)edgeFigureSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextPropertyAssignment()
  {
    return textPropertyAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextPropertyAssignment_Key()
  {
    return (EReference)textPropertyAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextPropertyAssignment_Attribute()
  {
    return (EReference)textPropertyAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextPropertyAssignment_Editable()
  {
    return (EReference)textPropertyAssignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextPropertyAssignment_Format()
  {
    return (EReference)textPropertyAssignmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompartmentPropertyAssignment()
  {
    return compartmentPropertyAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentPropertyAssignment_Key()
  {
    return (EReference)compartmentPropertyAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentPropertyAssignment_Attribute()
  {
    return (EReference)compartmentPropertyAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spray2Factory getSpray2Factory()
  {
    return (Spray2Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    diagramEClass = createEClass(DIAGRAM);
    createEReference(diagramEClass, DIAGRAM__IMPORTS);
    createEAttribute(diagramEClass, DIAGRAM__NAME);
    createEReference(diagramEClass, DIAGRAM__MODEL_TYPE);
    createEReference(diagramEClass, DIAGRAM__STYLE);
    createEReference(diagramEClass, DIAGRAM__SPRAY_ELEMENTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    sprayStyleRefEClass = createEClass(SPRAY_STYLE_REF);
    createEReference(sprayStyleRefEClass, SPRAY_STYLE_REF__STYLE);

    sprayElementEClass = createEClass(SPRAY_ELEMENT);
    createEAttribute(sprayElementEClass, SPRAY_ELEMENT__NAME);
    createEReference(sprayElementEClass, SPRAY_ELEMENT__TYPE);
    createEReference(sprayElementEClass, SPRAY_ELEMENT__STYLE);
    createEAttribute(sprayElementEClass, SPRAY_ELEMENT__TOOLING);
    createEAttribute(sprayElementEClass, SPRAY_ELEMENT__BEHAVIOR);

    nodeElementEClass = createEClass(NODE_ELEMENT);
    createEReference(nodeElementEClass, NODE_ELEMENT__FIGURE);

    edgeElementEClass = createEClass(EDGE_ELEMENT);
    createEReference(edgeElementEClass, EDGE_ELEMENT__FIGURE);

    nodeFigureSectionEClass = createEClass(NODE_FIGURE_SECTION);
    createEReference(nodeFigureSectionEClass, NODE_FIGURE_SECTION__SHAPE_REF);
    createEReference(nodeFigureSectionEClass, NODE_FIGURE_SECTION__TEXT_PROPERTIES);
    createEReference(nodeFigureSectionEClass, NODE_FIGURE_SECTION__COMPARTMENT_PROPERTIES);

    edgeFigureSectionEClass = createEClass(EDGE_FIGURE_SECTION);
    createEReference(edgeFigureSectionEClass, EDGE_FIGURE_SECTION__SHAPE_REF);
    createEReference(edgeFigureSectionEClass, EDGE_FIGURE_SECTION__TEXT_PROPERTIES);

    textPropertyAssignmentEClass = createEClass(TEXT_PROPERTY_ASSIGNMENT);
    createEReference(textPropertyAssignmentEClass, TEXT_PROPERTY_ASSIGNMENT__KEY);
    createEReference(textPropertyAssignmentEClass, TEXT_PROPERTY_ASSIGNMENT__ATTRIBUTE);
    createEReference(textPropertyAssignmentEClass, TEXT_PROPERTY_ASSIGNMENT__EDITABLE);
    createEReference(textPropertyAssignmentEClass, TEXT_PROPERTY_ASSIGNMENT__FORMAT);

    compartmentPropertyAssignmentEClass = createEClass(COMPARTMENT_PROPERTY_ASSIGNMENT);
    createEReference(compartmentPropertyAssignmentEClass, COMPARTMENT_PROPERTY_ASSIGNMENT__KEY);
    createEReference(compartmentPropertyAssignmentEClass, COMPARTMENT_PROPERTY_ASSIGNMENT__ATTRIBUTE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nodeElementEClass.getESuperTypes().add(this.getSprayElement());
    edgeElementEClass.getESuperTypes().add(this.getSprayElement());

    // Initialize classes and features; add operations and parameters
    initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagram_Imports(), this.getImport(), null, "imports", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_ModelType(), ecorePackage.getEClass(), null, "modelType", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_Style(), this.getSprayStyleRef(), null, "style", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_SprayElements(), this.getSprayElement(), null, "sprayElements", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sprayStyleRefEClass, SprayStyleRef.class, "SprayStyleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSprayStyleRef_Style(), theTypesPackage.getJvmTypeReference(), null, "style", null, 0, 1, SprayStyleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sprayElementEClass, SprayElement.class, "SprayElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSprayElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SprayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSprayElement_Type(), ecorePackage.getEClass(), null, "type", null, 0, 1, SprayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSprayElement_Style(), this.getSprayStyleRef(), null, "style", null, 0, 1, SprayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSprayElement_Tooling(), ecorePackage.getEString(), "tooling", null, 0, 1, SprayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSprayElement_Behavior(), ecorePackage.getEString(), "behavior", null, 0, 1, SprayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeElementEClass, NodeElement.class, "NodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeElement_Figure(), this.getNodeFigureSection(), null, "figure", null, 0, 1, NodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeElementEClass, EdgeElement.class, "EdgeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdgeElement_Figure(), this.getEdgeFigureSection(), null, "figure", null, 0, 1, EdgeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeFigureSectionEClass, NodeFigureSection.class, "NodeFigureSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeFigureSection_ShapeRef(), theTypesPackage.getJvmTypeReference(), null, "shapeRef", null, 0, 1, NodeFigureSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeFigureSection_TextProperties(), this.getTextPropertyAssignment(), null, "textProperties", null, 0, -1, NodeFigureSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeFigureSection_CompartmentProperties(), this.getCompartmentPropertyAssignment(), null, "compartmentProperties", null, 0, -1, NodeFigureSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeFigureSectionEClass, EdgeFigureSection.class, "EdgeFigureSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdgeFigureSection_ShapeRef(), theTypesPackage.getJvmTypeReference(), null, "shapeRef", null, 0, 1, EdgeFigureSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgeFigureSection_TextProperties(), this.getTextPropertyAssignment(), null, "textProperties", null, 0, -1, EdgeFigureSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textPropertyAssignmentEClass, TextPropertyAssignment.class, "TextPropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextPropertyAssignment_Key(), theTypesPackage.getJvmEnumerationLiteral(), null, "key", null, 0, 1, TextPropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextPropertyAssignment_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 0, 1, TextPropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextPropertyAssignment_Editable(), theXbasePackage.getXExpression(), null, "editable", null, 0, 1, TextPropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextPropertyAssignment_Format(), theXbasePackage.getXExpression(), null, "format", null, 0, 1, TextPropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compartmentPropertyAssignmentEClass, CompartmentPropertyAssignment.class, "CompartmentPropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompartmentPropertyAssignment_Key(), theTypesPackage.getJvmEnumerationLiteral(), null, "key", null, 0, 1, CompartmentPropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompartmentPropertyAssignment_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 0, 1, CompartmentPropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Spray2PackageImpl
