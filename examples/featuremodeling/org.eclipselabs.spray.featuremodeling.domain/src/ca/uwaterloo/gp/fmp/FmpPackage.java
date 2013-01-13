/**
 */
package ca.uwaterloo.gp.fmp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ca.uwaterloo.gp.fmp.FmpFactory
 * @model kind="package"
 * @generated
 */
public interface FmpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fmp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fmp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fmp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmpPackage eINSTANCE = ca.uwaterloo.gp.fmp.impl.FmpPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.NodeImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MAX = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MIN = 1;

	/**
	 * The feature id for the '<em><b>Confs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONFS = 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.ClonableImpl <em>Clonable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.ClonableImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getClonable()
	 * @generated
	 */
	int CLONABLE = 6;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__MAX = NODE__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__MIN = NODE__MIN;

	/**
	 * The feature id for the '<em><b>Confs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__CONFS = NODE__CONFS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__ORIGIN = NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__STATE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__CLONES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE__PROTOTYPE = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clonable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONABLE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.FeatureImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MAX = CLONABLE__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MIN = CLONABLE__MIN;

	/**
	 * The feature id for the '<em><b>Confs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONFS = CLONABLE__CONFS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ORIGIN = CLONABLE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDREN = CLONABLE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPERTIES = CLONABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = CLONABLE__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STATE = CLONABLE__STATE;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CLONES = CLONABLE__CLONES;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROTOTYPE = CLONABLE__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = CLONABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE_TYPE = CLONABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONFIGURATIONS = CLONABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCES = CLONABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Typed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPED_VALUE = CLONABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Described Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIBED_NODE = CLONABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTRAINTS = CLONABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CLONABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.FeatureGroupImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__MAX = NODE__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__MIN = NODE__MIN;

	/**
	 * The feature id for the '<em><b>Confs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CONFS = NODE__CONFS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ORIGIN = NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.ReferenceImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MAX = CLONABLE__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MIN = CLONABLE__MIN;

	/**
	 * The feature id for the '<em><b>Confs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONFS = CLONABLE__CONFS;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ORIGIN = CLONABLE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CHILDREN = CLONABLE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PROPERTIES = CLONABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = CLONABLE__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__STATE = CLONABLE__STATE;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CLONES = CLONABLE__CLONES;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PROTOTYPE = CLONABLE__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FEATURE = CLONABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = CLONABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.ProjectImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__META_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Meta Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__META_META_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.TypedValueImpl <em>Typed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.TypedValueImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getTypedValue()
	 * @generated
	 */
	int TYPED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__INTEGER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Float Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__FLOAT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Feature Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__FEATURE_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Typed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.impl.ConstraintImpl
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.ValueType
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 8;

	/**
	 * The meta object id for the '{@link ca.uwaterloo.gp.fmp.ConfigState <em>Config State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uwaterloo.gp.fmp.ConfigState
	 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getConfigState()
	 * @generated
	 */
	int CONFIG_STATE = 9;


	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Feature#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getValueType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_ValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.uwaterloo.gp.fmp.Feature#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getConfigurations()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Configurations();

	/**
	 * Returns the meta object for the reference list '{@link ca.uwaterloo.gp.fmp.Feature#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getReferences()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_References();

	/**
	 * Returns the meta object for the containment reference '{@link ca.uwaterloo.gp.fmp.Feature#getTypedValue <em>Typed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typed Value</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getTypedValue()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_TypedValue();

	/**
	 * Returns the meta object for the reference '{@link ca.uwaterloo.gp.fmp.Feature#getDescribedNode <em>Described Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Described Node</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getDescribedNode()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_DescribedNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.uwaterloo.gp.fmp.Feature#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ca.uwaterloo.gp.fmp.Feature#getConstraints()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Constraints();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see ca.uwaterloo.gp.fmp.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Node#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getMax()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Max();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Node#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getMin()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Min();

	/**
	 * Returns the meta object for the reference list '{@link ca.uwaterloo.gp.fmp.Node#getConfs <em>Confs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Confs</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getConfs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Confs();

	/**
	 * Returns the meta object for the reference '{@link ca.uwaterloo.gp.fmp.Node#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getOrigin()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.uwaterloo.gp.fmp.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the reference '{@link ca.uwaterloo.gp.fmp.Node#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getProperties()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Properties();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.uwaterloo.gp.fmp.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ca.uwaterloo.gp.fmp.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link ca.uwaterloo.gp.fmp.Reference#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see ca.uwaterloo.gp.fmp.Reference#getFeature()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Feature();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see ca.uwaterloo.gp.fmp.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference '{@link ca.uwaterloo.gp.fmp.Project#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see ca.uwaterloo.gp.fmp.Project#getModel()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Model();

	/**
	 * Returns the meta object for the containment reference '{@link ca.uwaterloo.gp.fmp.Project#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Model</em>'.
	 * @see ca.uwaterloo.gp.fmp.Project#getMetaModel()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_MetaModel();

	/**
	 * Returns the meta object for the containment reference '{@link ca.uwaterloo.gp.fmp.Project#getMetaMetaModel <em>Meta Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Meta Model</em>'.
	 * @see ca.uwaterloo.gp.fmp.Project#getMetaMetaModel()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_MetaMetaModel();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.TypedValue <em>Typed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Value</em>'.
	 * @see ca.uwaterloo.gp.fmp.TypedValue
	 * @generated
	 */
	EClass getTypedValue();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.TypedValue#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see ca.uwaterloo.gp.fmp.TypedValue#getIntegerValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_IntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.TypedValue#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see ca.uwaterloo.gp.fmp.TypedValue#getStringValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.TypedValue#getFloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Value</em>'.
	 * @see ca.uwaterloo.gp.fmp.TypedValue#getFloatValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_FloatValue();

	/**
	 * Returns the meta object for the reference '{@link ca.uwaterloo.gp.fmp.TypedValue#getFeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Value</em>'.
	 * @see ca.uwaterloo.gp.fmp.TypedValue#getFeatureValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EReference getTypedValue_FeatureValue();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.Clonable <em>Clonable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clonable</em>'.
	 * @see ca.uwaterloo.gp.fmp.Clonable
	 * @generated
	 */
	EClass getClonable();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Clonable#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see ca.uwaterloo.gp.fmp.Clonable#getState()
	 * @see #getClonable()
	 * @generated
	 */
	EAttribute getClonable_State();

	/**
	 * Returns the meta object for the reference list '{@link ca.uwaterloo.gp.fmp.Clonable#getClones <em>Clones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clones</em>'.
	 * @see ca.uwaterloo.gp.fmp.Clonable#getClones()
	 * @see #getClonable()
	 * @generated
	 */
	EReference getClonable_Clones();

	/**
	 * Returns the meta object for the reference '{@link ca.uwaterloo.gp.fmp.Clonable#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see ca.uwaterloo.gp.fmp.Clonable#getPrototype()
	 * @see #getClonable()
	 * @generated
	 */
	EReference getClonable_Prototype();

	/**
	 * Returns the meta object for class '{@link ca.uwaterloo.gp.fmp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ca.uwaterloo.gp.fmp.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ca.uwaterloo.gp.fmp.Constraint#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ca.uwaterloo.gp.fmp.Constraint#getText()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Text();

	/**
	 * Returns the meta object for enum '{@link ca.uwaterloo.gp.fmp.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see ca.uwaterloo.gp.fmp.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for enum '{@link ca.uwaterloo.gp.fmp.ConfigState <em>Config State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Config State</em>'.
	 * @see ca.uwaterloo.gp.fmp.ConfigState
	 * @generated
	 */
	EEnum getConfigState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmpFactory getFmpFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.FeatureImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE_TYPE = eINSTANCE.getFeature_ValueType();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONFIGURATIONS = eINSTANCE.getFeature_Configurations();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REFERENCES = eINSTANCE.getFeature_References();

		/**
		 * The meta object literal for the '<em><b>Typed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPED_VALUE = eINSTANCE.getFeature_TypedValue();

		/**
		 * The meta object literal for the '<em><b>Described Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DESCRIBED_NODE = eINSTANCE.getFeature_DescribedNode();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONSTRAINTS = eINSTANCE.getFeature_Constraints();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.FeatureGroupImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.NodeImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MAX = eINSTANCE.getNode_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MIN = eINSTANCE.getNode_Min();

		/**
		 * The meta object literal for the '<em><b>Confs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONFS = eINSTANCE.getNode_Confs();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ORIGIN = eINSTANCE.getNode_Origin();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PROPERTIES = eINSTANCE.getNode_Properties();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.ReferenceImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__FEATURE = eINSTANCE.getReference_Feature();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.ProjectImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MODEL = eINSTANCE.getProject_Model();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__META_MODEL = eINSTANCE.getProject_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Meta Meta Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__META_META_MODEL = eINSTANCE.getProject_MetaMetaModel();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.TypedValueImpl <em>Typed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.TypedValueImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getTypedValue()
		 * @generated
		 */
		EClass TYPED_VALUE = eINSTANCE.getTypedValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__INTEGER_VALUE = eINSTANCE.getTypedValue_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__STRING_VALUE = eINSTANCE.getTypedValue_StringValue();

		/**
		 * The meta object literal for the '<em><b>Float Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__FLOAT_VALUE = eINSTANCE.getTypedValue_FloatValue();

		/**
		 * The meta object literal for the '<em><b>Feature Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_VALUE__FEATURE_VALUE = eINSTANCE.getTypedValue_FeatureValue();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.ClonableImpl <em>Clonable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.ClonableImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getClonable()
		 * @generated
		 */
		EClass CLONABLE = eINSTANCE.getClonable();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONABLE__STATE = eINSTANCE.getClonable_State();

		/**
		 * The meta object literal for the '<em><b>Clones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONABLE__CLONES = eINSTANCE.getClonable_Clones();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONABLE__PROTOTYPE = eINSTANCE.getClonable_Prototype();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.impl.ConstraintImpl
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TEXT = eINSTANCE.getConstraint_Text();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.ValueType
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link ca.uwaterloo.gp.fmp.ConfigState <em>Config State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uwaterloo.gp.fmp.ConfigState
		 * @see ca.uwaterloo.gp.fmp.impl.FmpPackageImpl#getConfigState()
		 * @generated
		 */
		EEnum CONFIG_STATE = eINSTANCE.getConfigState();

	}

} //FmpPackage
