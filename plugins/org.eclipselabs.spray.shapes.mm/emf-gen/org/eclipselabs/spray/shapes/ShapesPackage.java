/**
 */
package org.eclipselabs.spray.shapes;

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
 * @see org.eclipselabs.spray.shapes.ShapesFactory
 * @model kind="package"
 * @generated
 */
public interface ShapesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shapes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/spray/shapes/Shape";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shapes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShapesPackage eINSTANCE = org.eclipselabs.spray.shapes.impl.ShapesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeContainerImpl <em>Shape Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeContainerImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeContainer()
	 * @generated
	 */
	int SHAPE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Shape Container Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Shape Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ImportImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getImport()
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
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeContainerElementImpl <em>Shape Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeContainerElementImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeContainerElement()
	 * @generated
	 */
	int SHAPE_CONTAINER_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_ELEMENT__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Shape Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl <em>Connection Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getConnectionDefinition()
	 * @generated
	 */
	int CONNECTION_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DEFINITION__NAME = SHAPE_CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DEFINITION__STYLE = SHAPE_CONTAINER_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Connection Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DEFINITION__CONNECTION_STYLE = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DEFINITION__LAYOUT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DEFINITION__PLACING = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DEFINITION_FEATURE_COUNT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl <em>Shape Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeDefinition()
	 * @generated
	 */
	int SHAPE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION__NAME = SHAPE_CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION__STYLE = SHAPE_CONTAINER_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Shape Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION__SHAPE_LAYOUT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION__SHAPE = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION__DESCRIPTION = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION__ANCHOR = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shape Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DEFINITION_FEATURE_COUNT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl <em>Placing Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPlacingDefinition()
	 * @generated
	 */
	int PLACING_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACING_DEFINITION__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACING_DEFINITION__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACING_DEFINITION__ANGLE = 2;

	/**
	 * The feature id for the '<em><b>Shape Con</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACING_DEFINITION__SHAPE_CON = 3;

	/**
	 * The number of structural features of the '<em>Placing Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACING_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorTypeImpl <em>Anchor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorTypeImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorType()
	 * @generated
	 */
	int ANCHOR_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Anchor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorPredefiniedImpl <em>Anchor Predefinied</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorPredefiniedImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPredefinied()
	 * @generated
	 */
	int ANCHOR_PREDEFINIED = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_PREDEFINIED__VALUE = ANCHOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anchor Predefinied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_PREDEFINIED_FEATURE_COUNT = ANCHOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorManualImpl <em>Anchor Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorManualImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorManual()
	 * @generated
	 */
	int ANCHOR_MANUAL = 9;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_MANUAL__POSITION = ANCHOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anchor Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_MANUAL_FEATURE_COUNT = ANCHOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorPositionImpl <em>Anchor Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorPositionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPosition()
	 * @generated
	 */
	int ANCHOR_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_POSITION__POS = 0;

	/**
	 * The number of structural features of the '<em>Anchor Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_POSITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorPositionPosImpl <em>Anchor Position Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorPositionPosImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPositionPos()
	 * @generated
	 */
	int ANCHOR_POSITION_POS = 11;

	/**
	 * The number of structural features of the '<em>Anchor Position Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_POSITION_POS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorRelativePositionImpl <em>Anchor Relative Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorRelativePositionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorRelativePosition()
	 * @generated
	 */
	int ANCHOR_RELATIVE_POSITION = 12;

	/**
	 * The feature id for the '<em><b>Xoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_RELATIVE_POSITION__XOFFSET = ANCHOR_POSITION_POS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Yoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_RELATIVE_POSITION__YOFFSET = ANCHOR_POSITION_POS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anchor Relative Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_RELATIVE_POSITION_FEATURE_COUNT = ANCHOR_POSITION_POS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.AnchorFixPointPositionImpl <em>Anchor Fix Point Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.AnchorFixPointPositionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorFixPointPosition()
	 * @generated
	 */
	int ANCHOR_FIX_POINT_POSITION = 13;

	/**
	 * The feature id for the '<em><b>Xcor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FIX_POINT_POSITION__XCOR = ANCHOR_POSITION_POS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ycor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FIX_POINT_POSITION__YCOR = ANCHOR_POSITION_POS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anchor Fix Point Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FIX_POINT_POSITION_FEATURE_COUNT = ANCHOR_POSITION_POS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 14;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE = 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeConnectionImpl <em>Shape Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeConnectionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeConnection()
	 * @generated
	 */
	int SHAPE_CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONNECTION__STYLE = 0;

	/**
	 * The number of structural features of the '<em>Shape Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDLineImpl <em>CD Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDLineImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDLine()
	 * @generated
	 */
	int CD_LINE = 16;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_LINE__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_LINE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_LINE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDPolylineImpl <em>CD Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDPolylineImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDPolyline()
	 * @generated
	 */
	int CD_POLYLINE = 17;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_POLYLINE__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_POLYLINE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_POLYLINE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDRectangleImpl <em>CD Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDRectangleImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDRectangle()
	 * @generated
	 */
	int CD_RECTANGLE = 18;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_RECTANGLE__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_RECTANGLE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_RECTANGLE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDRoundedRectangleImpl <em>CD Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDRoundedRectangleImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDRoundedRectangle()
	 * @generated
	 */
	int CD_ROUNDED_RECTANGLE = 19;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ROUNDED_RECTANGLE__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ROUNDED_RECTANGLE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDPolygonImpl <em>CD Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDPolygonImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDPolygon()
	 * @generated
	 */
	int CD_POLYGON = 20;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_POLYGON__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_POLYGON__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_POLYGON_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDEllipseImpl <em>CD Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDEllipseImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDEllipse()
	 * @generated
	 */
	int CD_ELLIPSE = 21;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ELLIPSE__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ELLIPSE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ELLIPSE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CDTextImpl <em>CD Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CDTextImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDText()
	 * @generated
	 */
	int CD_TEXT = 22;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_TEXT__STYLE = SHAPE_CONNECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Texttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_TEXT__TEXTTYPE = SHAPE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_TEXT__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_TEXT__BODY = SHAPE_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CD Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_TEXT_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.LineImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LAYOUT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.PolylineImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 24;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LAYOUT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.RectangleImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 25;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Compartment Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COMPARTMENT_INFO = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SHAPE = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.RoundedRectangleImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRoundedRectangle()
	 * @generated
	 */
	int ROUNDED_RECTANGLE = 26;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__SHAPE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.PolygonImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 27;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYOUT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SHAPE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.EllipseImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 28;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Compartment Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__COMPARTMENT_INFO = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LAYOUT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SHAPE = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.TextImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Texttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXTTYPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYOUT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BODY = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl <em>Compartment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentInfo()
	 * @generated
	 */
	int COMPARTMENT_INFO = 30;

	/**
	 * The feature id for the '<em><b>Compartment Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__COMPARTMENT_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Stretch H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__STRETCH_H = 1;

	/**
	 * The feature id for the '<em><b>Stretch V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__STRETCH_V = 2;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__SPACING = 3;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__MARGIN = 4;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__INVISIBLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO__ID = 6;

	/**
	 * The number of structural features of the '<em>Compartment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INFO_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 31;

	/**
	 * The feature id for the '<em><b>Compartment Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__COMPARTMENT_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__SHAPE = 1;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentShapeImpl <em>Compartment Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentShapeImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentShape()
	 * @generated
	 */
	int COMPARTMENT_SHAPE = 32;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_SHAPE__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_SHAPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Compartment Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_SHAPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentRectangleImpl <em>Compartment Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentRectangleImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentRectangle()
	 * @generated
	 */
	int COMPARTMENT_RECTANGLE = 33;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_RECTANGLE__LAYOUT = COMPARTMENT_SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_RECTANGLE__ID = COMPARTMENT_SHAPE__ID;

	/**
	 * The number of structural features of the '<em>Compartment Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_RECTANGLE_FEATURE_COUNT = COMPARTMENT_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentRoundedRectangleImpl <em>Compartment Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentRoundedRectangleImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentRoundedRectangle()
	 * @generated
	 */
	int COMPARTMENT_ROUNDED_RECTANGLE = 34;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ROUNDED_RECTANGLE__ID = 1;

	/**
	 * The number of structural features of the '<em>Compartment Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ROUNDED_RECTANGLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentPolygonImpl <em>Compartment Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentPolygonImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentPolygon()
	 * @generated
	 */
	int COMPARTMENT_POLYGON = 35;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_POLYGON__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_POLYGON__ID = 1;

	/**
	 * The number of structural features of the '<em>Compartment Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_POLYGON_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentEllipseImpl <em>Compartment Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CompartmentEllipseImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentEllipse()
	 * @generated
	 */
	int COMPARTMENT_ELLIPSE = 36;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELLIPSE__LAYOUT = COMPARTMENT_SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELLIPSE__ID = COMPARTMENT_SHAPE__ID;

	/**
	 * The number of structural features of the '<em>Compartment Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELLIPSE_FEATURE_COUNT = COMPARTMENT_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.DescriptionImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 37;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__STYLE = 0;

	/**
	 * The feature id for the '<em><b>HAlign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__HALIGN = 1;

	/**
	 * The feature id for the '<em><b>VAlign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALIGN = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__BODY = 3;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeLayoutImpl <em>Shape Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeLayout()
	 * @generated
	 */
	int SHAPE_LAYOUT = 38;

	/**
	 * The feature id for the '<em><b>Minwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__MINWIDTH = 0;

	/**
	 * The feature id for the '<em><b>Minheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__MINHEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Maxwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__MAXWIDTH = 2;

	/**
	 * The feature id for the '<em><b>Maxheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__MAXHEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Stretch H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__STRETCH_H = 4;

	/**
	 * The feature id for the '<em><b>Stretch V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__STRETCH_V = 5;

	/**
	 * The feature id for the '<em><b>Proportional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT__PROPORTIONAL = 6;

	/**
	 * The number of structural features of the '<em>Shape Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_LAYOUT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.RectangleEllipseLayoutImpl <em>Rectangle Ellipse Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.RectangleEllipseLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRectangleEllipseLayout()
	 * @generated
	 */
	int RECTANGLE_ELLIPSE_LAYOUT = 39;

	/**
	 * The feature id for the '<em><b>Common</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELLIPSE_LAYOUT__COMMON = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELLIPSE_LAYOUT__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Rectangle Ellipse Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELLIPSE_LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.LineLayoutImpl <em>Line Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.LineLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getLineLayout()
	 * @generated
	 */
	int LINE_LAYOUT = 40;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_LAYOUT__POINT = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_LAYOUT__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Line Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.PolyLineLayoutImpl <em>Poly Line Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.PolyLineLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPolyLineLayout()
	 * @generated
	 */
	int POLY_LINE_LAYOUT = 41;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_LINE_LAYOUT__POINT = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_LINE_LAYOUT__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Poly Line Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_LINE_LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.RoundedRectangleLayoutImpl <em>Rounded Rectangle Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.RoundedRectangleLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRoundedRectangleLayout()
	 * @generated
	 */
	int ROUNDED_RECTANGLE_LAYOUT = 42;

	/**
	 * The feature id for the '<em><b>Common</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_LAYOUT__COMMON = 0;

	/**
	 * The feature id for the '<em><b>Curve Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Curve Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_LAYOUT__LAYOUT = 3;

	/**
	 * The number of structural features of the '<em>Rounded Rectangle Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.TextLayoutImpl <em>Text Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.TextLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getTextLayout()
	 * @generated
	 */
	int TEXT_LAYOUT = 43;

	/**
	 * The feature id for the '<em><b>Common</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LAYOUT__COMMON = 0;

	/**
	 * The feature id for the '<em><b>HAlign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LAYOUT__HALIGN = 1;

	/**
	 * The feature id for the '<em><b>VAlign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LAYOUT__VALIGN = 2;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LAYOUT__LAYOUT = 3;

	/**
	 * The number of structural features of the '<em>Text Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapestyleLayoutImpl <em>Shapestyle Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapestyleLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapestyleLayout()
	 * @generated
	 */
	int SHAPESTYLE_LAYOUT = 44;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPESTYLE_LAYOUT__LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>Shapestyle Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPESTYLE_LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.ShapeStyleRefImpl <em>Shape Style Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.ShapeStyleRefImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeStyleRef()
	 * @generated
	 */
	int SHAPE_STYLE_REF = 45;

	/**
	 * The feature id for the '<em><b>Java Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE_REF__JAVA_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Dsl Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE_REF__DSL_STYLE = 1;

	/**
	 * The number of structural features of the '<em>Shape Style Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.CommonLayoutImpl <em>Common Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.CommonLayoutImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCommonLayout()
	 * @generated
	 */
	int COMMON_LAYOUT = 46;

	/**
	 * The feature id for the '<em><b>Xcor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_LAYOUT__XCOR = 0;

	/**
	 * The feature id for the '<em><b>Ycor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_LAYOUT__YCOR = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_LAYOUT__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_LAYOUT__HEIGTH = 3;

	/**
	 * The number of structural features of the '<em>Common Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.TextBodyImpl <em>Text Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.TextBodyImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getTextBody()
	 * @generated
	 */
	int TEXT_BODY = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BODY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Text Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BODY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.impl.PointImpl
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 48;

	/**
	 * The feature id for the '<em><b>Xcor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__XCOR = 0;

	/**
	 * The feature id for the '<em><b>Ycor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__YCOR = 1;

	/**
	 * The feature id for the '<em><b>Curve Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__CURVE_BEFORE = 2;

	/**
	 * The feature id for the '<em><b>Curve After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__CURVE_AFTER = 3;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.CompartmentLayout <em>Compartment Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.CompartmentLayout
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentLayout()
	 * @generated
	 */
	int COMPARTMENT_LAYOUT = 49;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.HAlign <em>HAlign</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.HAlign
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getHAlign()
	 * @generated
	 */
	int HALIGN = 50;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.VAlign <em>VAlign</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.VAlign
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getVAlign()
	 * @generated
	 */
	int VALIGN = 51;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.ConnectionStyle <em>Connection Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.ConnectionStyle
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getConnectionStyle()
	 * @generated
	 */
	int CONNECTION_STYLE = 52;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.AnchorPredefiniedEnum <em>Anchor Predefinied Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.AnchorPredefiniedEnum
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPredefiniedEnum()
	 * @generated
	 */
	int ANCHOR_PREDEFINIED_ENUM = 53;

	/**
	 * The meta object id for the '{@link org.eclipselabs.spray.shapes.TextType <em>Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.spray.shapes.TextType
	 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 54;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapeContainer <em>Shape Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Container</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeContainer
	 * @generated
	 */
	EClass getShapeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.ShapeContainer#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeContainer#getImports()
	 * @see #getShapeContainer()
	 * @generated
	 */
	EReference getShapeContainer_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.ShapeContainer#getShapeContainerElement <em>Shape Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape Container Element</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeContainer#getShapeContainerElement()
	 * @see #getShapeContainer()
	 * @generated
	 */
	EReference getShapeContainer_ShapeContainerElement();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipselabs.spray.shapes.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipselabs.spray.shapes.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapeContainerElement <em>Shape Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Container Element</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeContainerElement
	 * @generated
	 */
	EClass getShapeContainerElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeContainerElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeContainerElement#getName()
	 * @see #getShapeContainerElement()
	 * @generated
	 */
	EAttribute getShapeContainerElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapeContainerElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeContainerElement#getStyle()
	 * @see #getShapeContainerElement()
	 * @generated
	 */
	EReference getShapeContainerElement_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ConnectionDefinition <em>Connection Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Definition</em>'.
	 * @see org.eclipselabs.spray.shapes.ConnectionDefinition
	 * @generated
	 */
	EClass getConnectionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getConnectionStyle <em>Connection Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Style</em>'.
	 * @see org.eclipselabs.spray.shapes.ConnectionDefinition#getConnectionStyle()
	 * @see #getConnectionDefinition()
	 * @generated
	 */
	EAttribute getConnectionDefinition_ConnectionStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.ConnectionDefinition#getLayout()
	 * @see #getConnectionDefinition()
	 * @generated
	 */
	EReference getConnectionDefinition_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.ConnectionDefinition#getPlacing <em>Placing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placing</em>'.
	 * @see org.eclipselabs.spray.shapes.ConnectionDefinition#getPlacing()
	 * @see #getConnectionDefinition()
	 * @generated
	 */
	EReference getConnectionDefinition_Placing();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapeDefinition <em>Shape Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Definition</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeDefinition
	 * @generated
	 */
	EClass getShapeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getShapeLayout <em>Shape Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeDefinition#getShapeLayout()
	 * @see #getShapeDefinition()
	 * @generated
	 */
	EReference getShapeDefinition_ShapeLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeDefinition#getShape()
	 * @see #getShapeDefinition()
	 * @generated
	 */
	EReference getShapeDefinition_Shape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeDefinition#getDescription()
	 * @see #getShapeDefinition()
	 * @generated
	 */
	EReference getShapeDefinition_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapeDefinition#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anchor</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeDefinition#getAnchor()
	 * @see #getShapeDefinition()
	 * @generated
	 */
	EReference getShapeDefinition_Anchor();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.PlacingDefinition <em>Placing Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placing Definition</em>'.
	 * @see org.eclipselabs.spray.shapes.PlacingDefinition
	 * @generated
	 */
	EClass getPlacingDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipselabs.spray.shapes.PlacingDefinition#getOffset()
	 * @see #getPlacingDefinition()
	 * @generated
	 */
	EAttribute getPlacingDefinition_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.eclipselabs.spray.shapes.PlacingDefinition#getDistance()
	 * @see #getPlacingDefinition()
	 * @generated
	 */
	EAttribute getPlacingDefinition_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.eclipselabs.spray.shapes.PlacingDefinition#getAngle()
	 * @see #getPlacingDefinition()
	 * @generated
	 */
	EAttribute getPlacingDefinition_Angle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.PlacingDefinition#getShapeCon <em>Shape Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape Con</em>'.
	 * @see org.eclipselabs.spray.shapes.PlacingDefinition#getShapeCon()
	 * @see #getPlacingDefinition()
	 * @generated
	 */
	EReference getPlacingDefinition_ShapeCon();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see org.eclipselabs.spray.shapes.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Anchor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipselabs.spray.shapes.Anchor#getType()
	 * @see #getAnchor()
	 * @generated
	 */
	EReference getAnchor_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Type</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorType
	 * @generated
	 */
	EClass getAnchorType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorPredefinied <em>Anchor Predefinied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Predefinied</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorPredefinied
	 * @generated
	 */
	EClass getAnchorPredefinied();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.AnchorPredefinied#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorPredefinied#getValue()
	 * @see #getAnchorPredefinied()
	 * @generated
	 */
	EAttribute getAnchorPredefinied_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorManual <em>Anchor Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Manual</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorManual
	 * @generated
	 */
	EClass getAnchorManual();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.AnchorManual#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorManual#getPosition()
	 * @see #getAnchorManual()
	 * @generated
	 */
	EReference getAnchorManual_Position();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorPosition <em>Anchor Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Position</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorPosition
	 * @generated
	 */
	EClass getAnchorPosition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.AnchorPosition#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorPosition#getPos()
	 * @see #getAnchorPosition()
	 * @generated
	 */
	EReference getAnchorPosition_Pos();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorPositionPos <em>Anchor Position Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Position Pos</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorPositionPos
	 * @generated
	 */
	EClass getAnchorPositionPos();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorRelativePosition <em>Anchor Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Relative Position</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorRelativePosition
	 * @generated
	 */
	EClass getAnchorRelativePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.AnchorRelativePosition#getXoffset <em>Xoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xoffset</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorRelativePosition#getXoffset()
	 * @see #getAnchorRelativePosition()
	 * @generated
	 */
	EAttribute getAnchorRelativePosition_Xoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.AnchorRelativePosition#getYoffset <em>Yoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yoffset</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorRelativePosition#getYoffset()
	 * @see #getAnchorRelativePosition()
	 * @generated
	 */
	EAttribute getAnchorRelativePosition_Yoffset();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.AnchorFixPointPosition <em>Anchor Fix Point Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor Fix Point Position</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorFixPointPosition
	 * @generated
	 */
	EClass getAnchorFixPointPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.AnchorFixPointPosition#getXcor <em>Xcor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcor</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorFixPointPosition#getXcor()
	 * @see #getAnchorFixPointPosition()
	 * @generated
	 */
	EAttribute getAnchorFixPointPosition_Xcor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.AnchorFixPointPosition#getYcor <em>Ycor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ycor</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorFixPointPosition#getYcor()
	 * @see #getAnchorFixPointPosition()
	 * @generated
	 */
	EAttribute getAnchorFixPointPosition_Ycor();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Shape#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipselabs.spray.shapes.Shape#getStyle()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapeConnection <em>Shape Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Connection</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeConnection
	 * @generated
	 */
	EClass getShapeConnection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapeConnection#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeConnection#getStyle()
	 * @see #getShapeConnection()
	 * @generated
	 */
	EReference getShapeConnection_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDLine <em>CD Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Line</em>'.
	 * @see org.eclipselabs.spray.shapes.CDLine
	 * @generated
	 */
	EClass getCDLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDLine#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDLine#getLayout()
	 * @see #getCDLine()
	 * @generated
	 */
	EReference getCDLine_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDPolyline <em>CD Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Polyline</em>'.
	 * @see org.eclipselabs.spray.shapes.CDPolyline
	 * @generated
	 */
	EClass getCDPolyline();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDPolyline#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDPolyline#getLayout()
	 * @see #getCDPolyline()
	 * @generated
	 */
	EReference getCDPolyline_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDRectangle <em>CD Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Rectangle</em>'.
	 * @see org.eclipselabs.spray.shapes.CDRectangle
	 * @generated
	 */
	EClass getCDRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDRectangle#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDRectangle#getLayout()
	 * @see #getCDRectangle()
	 * @generated
	 */
	EReference getCDRectangle_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDRoundedRectangle <em>CD Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Rounded Rectangle</em>'.
	 * @see org.eclipselabs.spray.shapes.CDRoundedRectangle
	 * @generated
	 */
	EClass getCDRoundedRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDRoundedRectangle#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDRoundedRectangle#getLayout()
	 * @see #getCDRoundedRectangle()
	 * @generated
	 */
	EReference getCDRoundedRectangle_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDPolygon <em>CD Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Polygon</em>'.
	 * @see org.eclipselabs.spray.shapes.CDPolygon
	 * @generated
	 */
	EClass getCDPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDPolygon#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDPolygon#getLayout()
	 * @see #getCDPolygon()
	 * @generated
	 */
	EReference getCDPolygon_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDEllipse <em>CD Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Ellipse</em>'.
	 * @see org.eclipselabs.spray.shapes.CDEllipse
	 * @generated
	 */
	EClass getCDEllipse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDEllipse#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDEllipse#getLayout()
	 * @see #getCDEllipse()
	 * @generated
	 */
	EReference getCDEllipse_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CDText <em>CD Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Text</em>'.
	 * @see org.eclipselabs.spray.shapes.CDText
	 * @generated
	 */
	EClass getCDText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CDText#getTexttype <em>Texttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texttype</em>'.
	 * @see org.eclipselabs.spray.shapes.CDText#getTexttype()
	 * @see #getCDText()
	 * @generated
	 */
	EAttribute getCDText_Texttype();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDText#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CDText#getLayout()
	 * @see #getCDText()
	 * @generated
	 */
	EReference getCDText_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CDText#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.spray.shapes.CDText#getBody()
	 * @see #getCDText()
	 * @generated
	 */
	EReference getCDText_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.eclipselabs.spray.shapes.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Line#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Line#getLayout()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see org.eclipselabs.spray.shapes.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Polyline#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Polyline#getLayout()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.eclipselabs.spray.shapes.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Rectangle#getCompartmentInfo <em>Compartment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compartment Info</em>'.
	 * @see org.eclipselabs.spray.shapes.Rectangle#getCompartmentInfo()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_CompartmentInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Rectangle#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Rectangle#getLayout()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.Rectangle#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.Rectangle#getShape()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Shape();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.RoundedRectangle <em>Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangle
	 * @generated
	 */
	EClass getRoundedRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.RoundedRectangle#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangle#getLayout()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EReference getRoundedRectangle_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.RoundedRectangle#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangle#getShape()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EReference getRoundedRectangle_Shape();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.eclipselabs.spray.shapes.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Polygon#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Polygon#getLayout()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.Polygon#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.Polygon#getShape()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Shape();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.eclipselabs.spray.shapes.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Ellipse#getCompartmentInfo <em>Compartment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compartment Info</em>'.
	 * @see org.eclipselabs.spray.shapes.Ellipse#getCompartmentInfo()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_CompartmentInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Ellipse#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Ellipse#getLayout()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.Ellipse#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.Ellipse#getShape()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Shape();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipselabs.spray.shapes.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Text#getTexttype <em>Texttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texttype</em>'.
	 * @see org.eclipselabs.spray.shapes.Text#getTexttype()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Texttype();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Text#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Text#getLayout()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Text#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.spray.shapes.Text#getBody()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CompartmentInfo <em>Compartment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Info</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo
	 * @generated
	 */
	EClass getCompartmentInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CompartmentInfo#getCompartmentLayout <em>Compartment Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#getCompartmentLayout()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EAttribute getCompartmentInfo_CompartmentLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CompartmentInfo#getStretchH <em>Stretch H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch H</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#getStretchH()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EAttribute getCompartmentInfo_StretchH();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CompartmentInfo#getStretchV <em>Stretch V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch V</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#getStretchV()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EAttribute getCompartmentInfo_StretchV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CompartmentInfo#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#getSpacing()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EAttribute getCompartmentInfo_Spacing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CompartmentInfo#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#getMargin()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EAttribute getCompartmentInfo_Margin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CompartmentInfo#isInvisible <em>Invisible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invisible</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#isInvisible()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EAttribute getCompartmentInfo_Invisible();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentInfo#getId()
	 * @see #getCompartmentInfo()
	 * @generated
	 */
	EReference getCompartmentInfo_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see org.eclipselabs.spray.shapes.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Compartment#getCompartmentLayout <em>Compartment Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.Compartment#getCompartmentLayout()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_CompartmentLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Compartment#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.Compartment#getShape()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Shape();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CompartmentShape <em>Compartment Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Shape</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentShape
	 * @generated
	 */
	EClass getCompartmentShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentShape#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentShape#getLayout()
	 * @see #getCompartmentShape()
	 * @generated
	 */
	EReference getCompartmentShape_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentShape#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentShape#getId()
	 * @see #getCompartmentShape()
	 * @generated
	 */
	EReference getCompartmentShape_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CompartmentRectangle <em>Compartment Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Rectangle</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentRectangle
	 * @generated
	 */
	EClass getCompartmentRectangle();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle <em>Compartment Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Rounded Rectangle</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentRoundedRectangle
	 * @generated
	 */
	EClass getCompartmentRoundedRectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getLayout()
	 * @see #getCompartmentRoundedRectangle()
	 * @generated
	 */
	EReference getCompartmentRoundedRectangle_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentRoundedRectangle#getId()
	 * @see #getCompartmentRoundedRectangle()
	 * @generated
	 */
	EReference getCompartmentRoundedRectangle_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CompartmentPolygon <em>Compartment Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Polygon</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentPolygon
	 * @generated
	 */
	EClass getCompartmentPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentPolygon#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentPolygon#getLayout()
	 * @see #getCompartmentPolygon()
	 * @generated
	 */
	EReference getCompartmentPolygon_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.CompartmentPolygon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentPolygon#getId()
	 * @see #getCompartmentPolygon()
	 * @generated
	 */
	EReference getCompartmentPolygon_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CompartmentEllipse <em>Compartment Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Ellipse</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentEllipse
	 * @generated
	 */
	EClass getCompartmentEllipse();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipselabs.spray.shapes.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Description#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipselabs.spray.shapes.Description#getStyle()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Description#getHAlign <em>HAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HAlign</em>'.
	 * @see org.eclipselabs.spray.shapes.Description#getHAlign()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_HAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Description#getVAlign <em>VAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VAlign</em>'.
	 * @see org.eclipselabs.spray.shapes.Description#getVAlign()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_VAlign();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.Description#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.spray.shapes.Description#getBody()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapeLayout <em>Shape Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout
	 * @generated
	 */
	EClass getShapeLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getMinwidth <em>Minwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minwidth</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getMinwidth()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_Minwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getMinheight <em>Minheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minheight</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getMinheight()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_Minheight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getMaxwidth <em>Maxwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxwidth</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getMaxwidth()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_Maxwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getMaxheight <em>Maxheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxheight</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getMaxheight()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_Maxheight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getStretchH <em>Stretch H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch H</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getStretchH()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_StretchH();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getStretchV <em>Stretch V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch V</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getStretchV()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_StretchV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.ShapeLayout#getProportional <em>Proportional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proportional</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeLayout#getProportional()
	 * @see #getShapeLayout()
	 * @generated
	 */
	EAttribute getShapeLayout_Proportional();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout <em>Rectangle Ellipse Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Ellipse Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.RectangleEllipseLayout
	 * @generated
	 */
	EClass getRectangleEllipseLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout#getCommon <em>Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common</em>'.
	 * @see org.eclipselabs.spray.shapes.RectangleEllipseLayout#getCommon()
	 * @see #getRectangleEllipseLayout()
	 * @generated
	 */
	EReference getRectangleEllipseLayout_Common();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.RectangleEllipseLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.RectangleEllipseLayout#getLayout()
	 * @see #getRectangleEllipseLayout()
	 * @generated
	 */
	EReference getRectangleEllipseLayout_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.LineLayout <em>Line Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.LineLayout
	 * @generated
	 */
	EClass getLineLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.LineLayout#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see org.eclipselabs.spray.shapes.LineLayout#getPoint()
	 * @see #getLineLayout()
	 * @generated
	 */
	EReference getLineLayout_Point();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.LineLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.LineLayout#getLayout()
	 * @see #getLineLayout()
	 * @generated
	 */
	EReference getLineLayout_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.PolyLineLayout <em>Poly Line Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poly Line Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.PolyLineLayout
	 * @generated
	 */
	EClass getPolyLineLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.PolyLineLayout#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see org.eclipselabs.spray.shapes.PolyLineLayout#getPoint()
	 * @see #getPolyLineLayout()
	 * @generated
	 */
	EReference getPolyLineLayout_Point();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.PolyLineLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.PolyLineLayout#getLayout()
	 * @see #getPolyLineLayout()
	 * @generated
	 */
	EReference getPolyLineLayout_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.RoundedRectangleLayout <em>Rounded Rectangle Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangleLayout
	 * @generated
	 */
	EClass getRoundedRectangleLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.RoundedRectangleLayout#getCommon <em>Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangleLayout#getCommon()
	 * @see #getRoundedRectangleLayout()
	 * @generated
	 */
	EReference getRoundedRectangleLayout_Common();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.RoundedRectangleLayout#getCurveWidth <em>Curve Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Width</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangleLayout#getCurveWidth()
	 * @see #getRoundedRectangleLayout()
	 * @generated
	 */
	EAttribute getRoundedRectangleLayout_CurveWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.RoundedRectangleLayout#getCurveHeight <em>Curve Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Height</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangleLayout#getCurveHeight()
	 * @see #getRoundedRectangleLayout()
	 * @generated
	 */
	EAttribute getRoundedRectangleLayout_CurveHeight();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.RoundedRectangleLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.RoundedRectangleLayout#getLayout()
	 * @see #getRoundedRectangleLayout()
	 * @generated
	 */
	EReference getRoundedRectangleLayout_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.TextLayout <em>Text Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.TextLayout
	 * @generated
	 */
	EClass getTextLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.TextLayout#getCommon <em>Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common</em>'.
	 * @see org.eclipselabs.spray.shapes.TextLayout#getCommon()
	 * @see #getTextLayout()
	 * @generated
	 */
	EReference getTextLayout_Common();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.TextLayout#getHAlign <em>HAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HAlign</em>'.
	 * @see org.eclipselabs.spray.shapes.TextLayout#getHAlign()
	 * @see #getTextLayout()
	 * @generated
	 */
	EAttribute getTextLayout_HAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.TextLayout#getVAlign <em>VAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VAlign</em>'.
	 * @see org.eclipselabs.spray.shapes.TextLayout#getVAlign()
	 * @see #getTextLayout()
	 * @generated
	 */
	EAttribute getTextLayout_VAlign();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.TextLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.TextLayout#getLayout()
	 * @see #getTextLayout()
	 * @generated
	 */
	EReference getTextLayout_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapestyleLayout <em>Shapestyle Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapestyle Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapestyleLayout
	 * @generated
	 */
	EClass getShapestyleLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapestyleLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapestyleLayout#getLayout()
	 * @see #getShapestyleLayout()
	 * @generated
	 */
	EReference getShapestyleLayout_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.ShapeStyleRef <em>Shape Style Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Style Ref</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeStyleRef
	 * @generated
	 */
	EClass getShapeStyleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.ShapeStyleRef#getJavaStyle <em>Java Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Style</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeStyleRef#getJavaStyle()
	 * @see #getShapeStyleRef()
	 * @generated
	 */
	EReference getShapeStyleRef_JavaStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.spray.shapes.ShapeStyleRef#getDslStyle <em>Dsl Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsl Style</em>'.
	 * @see org.eclipselabs.spray.shapes.ShapeStyleRef#getDslStyle()
	 * @see #getShapeStyleRef()
	 * @generated
	 */
	EReference getShapeStyleRef_DslStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.CommonLayout <em>Common Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CommonLayout
	 * @generated
	 */
	EClass getCommonLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CommonLayout#getXcor <em>Xcor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcor</em>'.
	 * @see org.eclipselabs.spray.shapes.CommonLayout#getXcor()
	 * @see #getCommonLayout()
	 * @generated
	 */
	EAttribute getCommonLayout_Xcor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CommonLayout#getYcor <em>Ycor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ycor</em>'.
	 * @see org.eclipselabs.spray.shapes.CommonLayout#getYcor()
	 * @see #getCommonLayout()
	 * @generated
	 */
	EAttribute getCommonLayout_Ycor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CommonLayout#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipselabs.spray.shapes.CommonLayout#getWidth()
	 * @see #getCommonLayout()
	 * @generated
	 */
	EAttribute getCommonLayout_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.CommonLayout#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see org.eclipselabs.spray.shapes.CommonLayout#getHeigth()
	 * @see #getCommonLayout()
	 * @generated
	 */
	EAttribute getCommonLayout_Heigth();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.TextBody <em>Text Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Body</em>'.
	 * @see org.eclipselabs.spray.shapes.TextBody
	 * @generated
	 */
	EClass getTextBody();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.TextBody#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.spray.shapes.TextBody#getValue()
	 * @see #getTextBody()
	 * @generated
	 */
	EAttribute getTextBody_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipselabs.spray.shapes.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Point#getXcor <em>Xcor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcor</em>'.
	 * @see org.eclipselabs.spray.shapes.Point#getXcor()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Xcor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Point#getYcor <em>Ycor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ycor</em>'.
	 * @see org.eclipselabs.spray.shapes.Point#getYcor()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Ycor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Point#getCurveBefore <em>Curve Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Before</em>'.
	 * @see org.eclipselabs.spray.shapes.Point#getCurveBefore()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_CurveBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.Point#getCurveAfter <em>Curve After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve After</em>'.
	 * @see org.eclipselabs.spray.shapes.Point#getCurveAfter()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_CurveAfter();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.CompartmentLayout <em>Compartment Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Layout</em>'.
	 * @see org.eclipselabs.spray.shapes.CompartmentLayout
	 * @generated
	 */
	EEnum getCompartmentLayout();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.HAlign <em>HAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HAlign</em>'.
	 * @see org.eclipselabs.spray.shapes.HAlign
	 * @generated
	 */
	EEnum getHAlign();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.VAlign <em>VAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VAlign</em>'.
	 * @see org.eclipselabs.spray.shapes.VAlign
	 * @generated
	 */
	EEnum getVAlign();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.ConnectionStyle <em>Connection Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Style</em>'.
	 * @see org.eclipselabs.spray.shapes.ConnectionStyle
	 * @generated
	 */
	EEnum getConnectionStyle();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.AnchorPredefiniedEnum <em>Anchor Predefinied Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anchor Predefinied Enum</em>'.
	 * @see org.eclipselabs.spray.shapes.AnchorPredefiniedEnum
	 * @generated
	 */
	EEnum getAnchorPredefiniedEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Type</em>'.
	 * @see org.eclipselabs.spray.shapes.TextType
	 * @generated
	 */
	EEnum getTextType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShapesFactory getShapesFactory();

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
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeContainerImpl <em>Shape Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeContainerImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeContainer()
		 * @generated
		 */
		EClass SHAPE_CONTAINER = eINSTANCE.getShapeContainer();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONTAINER__IMPORTS = eINSTANCE.getShapeContainer_Imports();

		/**
		 * The meta object literal for the '<em><b>Shape Container Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT = eINSTANCE.getShapeContainer_ShapeContainerElement();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ImportImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getImport()
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
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeContainerElementImpl <em>Shape Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeContainerElementImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeContainerElement()
		 * @generated
		 */
		EClass SHAPE_CONTAINER_ELEMENT = eINSTANCE.getShapeContainerElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_CONTAINER_ELEMENT__NAME = eINSTANCE.getShapeContainerElement_Name();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONTAINER_ELEMENT__STYLE = eINSTANCE.getShapeContainerElement_Style();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl <em>Connection Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getConnectionDefinition()
		 * @generated
		 */
		EClass CONNECTION_DEFINITION = eINSTANCE.getConnectionDefinition();

		/**
		 * The meta object literal for the '<em><b>Connection Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_DEFINITION__CONNECTION_STYLE = eINSTANCE.getConnectionDefinition_ConnectionStyle();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_DEFINITION__LAYOUT = eINSTANCE.getConnectionDefinition_Layout();

		/**
		 * The meta object literal for the '<em><b>Placing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_DEFINITION__PLACING = eINSTANCE.getConnectionDefinition_Placing();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl <em>Shape Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeDefinitionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeDefinition()
		 * @generated
		 */
		EClass SHAPE_DEFINITION = eINSTANCE.getShapeDefinition();

		/**
		 * The meta object literal for the '<em><b>Shape Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_DEFINITION__SHAPE_LAYOUT = eINSTANCE.getShapeDefinition_ShapeLayout();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_DEFINITION__SHAPE = eINSTANCE.getShapeDefinition_Shape();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_DEFINITION__DESCRIPTION = eINSTANCE.getShapeDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_DEFINITION__ANCHOR = eINSTANCE.getShapeDefinition_Anchor();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl <em>Placing Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPlacingDefinition()
		 * @generated
		 */
		EClass PLACING_DEFINITION = eINSTANCE.getPlacingDefinition();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACING_DEFINITION__OFFSET = eINSTANCE.getPlacingDefinition_Offset();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACING_DEFINITION__DISTANCE = eINSTANCE.getPlacingDefinition_Distance();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACING_DEFINITION__ANGLE = eINSTANCE.getPlacingDefinition_Angle();

		/**
		 * The meta object literal for the '<em><b>Shape Con</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACING_DEFINITION__SHAPE_CON = eINSTANCE.getPlacingDefinition_ShapeCon();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR__TYPE = eINSTANCE.getAnchor_Type();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorTypeImpl <em>Anchor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorTypeImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorType()
		 * @generated
		 */
		EClass ANCHOR_TYPE = eINSTANCE.getAnchorType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorPredefiniedImpl <em>Anchor Predefinied</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorPredefiniedImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPredefinied()
		 * @generated
		 */
		EClass ANCHOR_PREDEFINIED = eINSTANCE.getAnchorPredefinied();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR_PREDEFINIED__VALUE = eINSTANCE.getAnchorPredefinied_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorManualImpl <em>Anchor Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorManualImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorManual()
		 * @generated
		 */
		EClass ANCHOR_MANUAL = eINSTANCE.getAnchorManual();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR_MANUAL__POSITION = eINSTANCE.getAnchorManual_Position();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorPositionImpl <em>Anchor Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorPositionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPosition()
		 * @generated
		 */
		EClass ANCHOR_POSITION = eINSTANCE.getAnchorPosition();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR_POSITION__POS = eINSTANCE.getAnchorPosition_Pos();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorPositionPosImpl <em>Anchor Position Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorPositionPosImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPositionPos()
		 * @generated
		 */
		EClass ANCHOR_POSITION_POS = eINSTANCE.getAnchorPositionPos();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorRelativePositionImpl <em>Anchor Relative Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorRelativePositionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorRelativePosition()
		 * @generated
		 */
		EClass ANCHOR_RELATIVE_POSITION = eINSTANCE.getAnchorRelativePosition();

		/**
		 * The meta object literal for the '<em><b>Xoffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR_RELATIVE_POSITION__XOFFSET = eINSTANCE.getAnchorRelativePosition_Xoffset();

		/**
		 * The meta object literal for the '<em><b>Yoffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR_RELATIVE_POSITION__YOFFSET = eINSTANCE.getAnchorRelativePosition_Yoffset();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.AnchorFixPointPositionImpl <em>Anchor Fix Point Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.AnchorFixPointPositionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorFixPointPosition()
		 * @generated
		 */
		EClass ANCHOR_FIX_POINT_POSITION = eINSTANCE.getAnchorFixPointPosition();

		/**
		 * The meta object literal for the '<em><b>Xcor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR_FIX_POINT_POSITION__XCOR = eINSTANCE.getAnchorFixPointPosition_Xcor();

		/**
		 * The meta object literal for the '<em><b>Ycor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR_FIX_POINT_POSITION__YCOR = eINSTANCE.getAnchorFixPointPosition_Ycor();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__STYLE = eINSTANCE.getShape_Style();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeConnectionImpl <em>Shape Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeConnectionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeConnection()
		 * @generated
		 */
		EClass SHAPE_CONNECTION = eINSTANCE.getShapeConnection();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONNECTION__STYLE = eINSTANCE.getShapeConnection_Style();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDLineImpl <em>CD Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDLineImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDLine()
		 * @generated
		 */
		EClass CD_LINE = eINSTANCE.getCDLine();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_LINE__LAYOUT = eINSTANCE.getCDLine_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDPolylineImpl <em>CD Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDPolylineImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDPolyline()
		 * @generated
		 */
		EClass CD_POLYLINE = eINSTANCE.getCDPolyline();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_POLYLINE__LAYOUT = eINSTANCE.getCDPolyline_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDRectangleImpl <em>CD Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDRectangleImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDRectangle()
		 * @generated
		 */
		EClass CD_RECTANGLE = eINSTANCE.getCDRectangle();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_RECTANGLE__LAYOUT = eINSTANCE.getCDRectangle_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDRoundedRectangleImpl <em>CD Rounded Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDRoundedRectangleImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDRoundedRectangle()
		 * @generated
		 */
		EClass CD_ROUNDED_RECTANGLE = eINSTANCE.getCDRoundedRectangle();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_ROUNDED_RECTANGLE__LAYOUT = eINSTANCE.getCDRoundedRectangle_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDPolygonImpl <em>CD Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDPolygonImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDPolygon()
		 * @generated
		 */
		EClass CD_POLYGON = eINSTANCE.getCDPolygon();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_POLYGON__LAYOUT = eINSTANCE.getCDPolygon_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDEllipseImpl <em>CD Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDEllipseImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDEllipse()
		 * @generated
		 */
		EClass CD_ELLIPSE = eINSTANCE.getCDEllipse();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_ELLIPSE__LAYOUT = eINSTANCE.getCDEllipse_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CDTextImpl <em>CD Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CDTextImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCDText()
		 * @generated
		 */
		EClass CD_TEXT = eINSTANCE.getCDText();

		/**
		 * The meta object literal for the '<em><b>Texttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD_TEXT__TEXTTYPE = eINSTANCE.getCDText_Texttype();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_TEXT__LAYOUT = eINSTANCE.getCDText_Layout();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_TEXT__BODY = eINSTANCE.getCDText_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.LineImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__LAYOUT = eINSTANCE.getLine_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.PolylineImpl <em>Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.PolylineImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYLINE__LAYOUT = eINSTANCE.getPolyline_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.RectangleImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Compartment Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__COMPARTMENT_INFO = eINSTANCE.getRectangle_CompartmentInfo();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__LAYOUT = eINSTANCE.getRectangle_Layout();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE__SHAPE = eINSTANCE.getRectangle_Shape();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.RoundedRectangleImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRoundedRectangle()
		 * @generated
		 */
		EClass ROUNDED_RECTANGLE = eINSTANCE.getRoundedRectangle();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUNDED_RECTANGLE__LAYOUT = eINSTANCE.getRoundedRectangle_Layout();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUNDED_RECTANGLE__SHAPE = eINSTANCE.getRoundedRectangle_Shape();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.PolygonImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__LAYOUT = eINSTANCE.getPolygon_Layout();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__SHAPE = eINSTANCE.getPolygon_Shape();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.EllipseImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Compartment Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__COMPARTMENT_INFO = eINSTANCE.getEllipse_CompartmentInfo();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__LAYOUT = eINSTANCE.getEllipse_Layout();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__SHAPE = eINSTANCE.getEllipse_Shape();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.TextImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Texttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXTTYPE = eINSTANCE.getText_Texttype();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__LAYOUT = eINSTANCE.getText_Layout();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__BODY = eINSTANCE.getText_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl <em>Compartment Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentInfoImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentInfo()
		 * @generated
		 */
		EClass COMPARTMENT_INFO = eINSTANCE.getCompartmentInfo();

		/**
		 * The meta object literal for the '<em><b>Compartment Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_INFO__COMPARTMENT_LAYOUT = eINSTANCE.getCompartmentInfo_CompartmentLayout();

		/**
		 * The meta object literal for the '<em><b>Stretch H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_INFO__STRETCH_H = eINSTANCE.getCompartmentInfo_StretchH();

		/**
		 * The meta object literal for the '<em><b>Stretch V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_INFO__STRETCH_V = eINSTANCE.getCompartmentInfo_StretchV();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_INFO__SPACING = eINSTANCE.getCompartmentInfo_Spacing();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_INFO__MARGIN = eINSTANCE.getCompartmentInfo_Margin();

		/**
		 * The meta object literal for the '<em><b>Invisible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_INFO__INVISIBLE = eINSTANCE.getCompartmentInfo_Invisible();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_INFO__ID = eINSTANCE.getCompartmentInfo_Id();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '<em><b>Compartment Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__COMPARTMENT_LAYOUT = eINSTANCE.getCompartment_CompartmentLayout();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__SHAPE = eINSTANCE.getCompartment_Shape();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentShapeImpl <em>Compartment Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentShapeImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentShape()
		 * @generated
		 */
		EClass COMPARTMENT_SHAPE = eINSTANCE.getCompartmentShape();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_SHAPE__LAYOUT = eINSTANCE.getCompartmentShape_Layout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_SHAPE__ID = eINSTANCE.getCompartmentShape_Id();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentRectangleImpl <em>Compartment Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentRectangleImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentRectangle()
		 * @generated
		 */
		EClass COMPARTMENT_RECTANGLE = eINSTANCE.getCompartmentRectangle();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentRoundedRectangleImpl <em>Compartment Rounded Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentRoundedRectangleImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentRoundedRectangle()
		 * @generated
		 */
		EClass COMPARTMENT_ROUNDED_RECTANGLE = eINSTANCE.getCompartmentRoundedRectangle();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT = eINSTANCE.getCompartmentRoundedRectangle_Layout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_ROUNDED_RECTANGLE__ID = eINSTANCE.getCompartmentRoundedRectangle_Id();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentPolygonImpl <em>Compartment Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentPolygonImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentPolygon()
		 * @generated
		 */
		EClass COMPARTMENT_POLYGON = eINSTANCE.getCompartmentPolygon();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_POLYGON__LAYOUT = eINSTANCE.getCompartmentPolygon_Layout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_POLYGON__ID = eINSTANCE.getCompartmentPolygon_Id();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CompartmentEllipseImpl <em>Compartment Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CompartmentEllipseImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentEllipse()
		 * @generated
		 */
		EClass COMPARTMENT_ELLIPSE = eINSTANCE.getCompartmentEllipse();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.DescriptionImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__STYLE = eINSTANCE.getDescription_Style();

		/**
		 * The meta object literal for the '<em><b>HAlign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__HALIGN = eINSTANCE.getDescription_HAlign();

		/**
		 * The meta object literal for the '<em><b>VAlign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALIGN = eINSTANCE.getDescription_VAlign();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__BODY = eINSTANCE.getDescription_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeLayoutImpl <em>Shape Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeLayout()
		 * @generated
		 */
		EClass SHAPE_LAYOUT = eINSTANCE.getShapeLayout();

		/**
		 * The meta object literal for the '<em><b>Minwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__MINWIDTH = eINSTANCE.getShapeLayout_Minwidth();

		/**
		 * The meta object literal for the '<em><b>Minheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__MINHEIGHT = eINSTANCE.getShapeLayout_Minheight();

		/**
		 * The meta object literal for the '<em><b>Maxwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__MAXWIDTH = eINSTANCE.getShapeLayout_Maxwidth();

		/**
		 * The meta object literal for the '<em><b>Maxheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__MAXHEIGHT = eINSTANCE.getShapeLayout_Maxheight();

		/**
		 * The meta object literal for the '<em><b>Stretch H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__STRETCH_H = eINSTANCE.getShapeLayout_StretchH();

		/**
		 * The meta object literal for the '<em><b>Stretch V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__STRETCH_V = eINSTANCE.getShapeLayout_StretchV();

		/**
		 * The meta object literal for the '<em><b>Proportional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_LAYOUT__PROPORTIONAL = eINSTANCE.getShapeLayout_Proportional();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.RectangleEllipseLayoutImpl <em>Rectangle Ellipse Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.RectangleEllipseLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRectangleEllipseLayout()
		 * @generated
		 */
		EClass RECTANGLE_ELLIPSE_LAYOUT = eINSTANCE.getRectangleEllipseLayout();

		/**
		 * The meta object literal for the '<em><b>Common</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_ELLIPSE_LAYOUT__COMMON = eINSTANCE.getRectangleEllipseLayout_Common();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_ELLIPSE_LAYOUT__LAYOUT = eINSTANCE.getRectangleEllipseLayout_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.LineLayoutImpl <em>Line Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.LineLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getLineLayout()
		 * @generated
		 */
		EClass LINE_LAYOUT = eINSTANCE.getLineLayout();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_LAYOUT__POINT = eINSTANCE.getLineLayout_Point();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_LAYOUT__LAYOUT = eINSTANCE.getLineLayout_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.PolyLineLayoutImpl <em>Poly Line Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.PolyLineLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPolyLineLayout()
		 * @generated
		 */
		EClass POLY_LINE_LAYOUT = eINSTANCE.getPolyLineLayout();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLY_LINE_LAYOUT__POINT = eINSTANCE.getPolyLineLayout_Point();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLY_LINE_LAYOUT__LAYOUT = eINSTANCE.getPolyLineLayout_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.RoundedRectangleLayoutImpl <em>Rounded Rectangle Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.RoundedRectangleLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getRoundedRectangleLayout()
		 * @generated
		 */
		EClass ROUNDED_RECTANGLE_LAYOUT = eINSTANCE.getRoundedRectangleLayout();

		/**
		 * The meta object literal for the '<em><b>Common</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUNDED_RECTANGLE_LAYOUT__COMMON = eINSTANCE.getRoundedRectangleLayout_Common();

		/**
		 * The meta object literal for the '<em><b>Curve Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH = eINSTANCE.getRoundedRectangleLayout_CurveWidth();

		/**
		 * The meta object literal for the '<em><b>Curve Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT = eINSTANCE.getRoundedRectangleLayout_CurveHeight();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUNDED_RECTANGLE_LAYOUT__LAYOUT = eINSTANCE.getRoundedRectangleLayout_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.TextLayoutImpl <em>Text Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.TextLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getTextLayout()
		 * @generated
		 */
		EClass TEXT_LAYOUT = eINSTANCE.getTextLayout();

		/**
		 * The meta object literal for the '<em><b>Common</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LAYOUT__COMMON = eINSTANCE.getTextLayout_Common();

		/**
		 * The meta object literal for the '<em><b>HAlign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LAYOUT__HALIGN = eINSTANCE.getTextLayout_HAlign();

		/**
		 * The meta object literal for the '<em><b>VAlign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LAYOUT__VALIGN = eINSTANCE.getTextLayout_VAlign();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LAYOUT__LAYOUT = eINSTANCE.getTextLayout_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapestyleLayoutImpl <em>Shapestyle Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapestyleLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapestyleLayout()
		 * @generated
		 */
		EClass SHAPESTYLE_LAYOUT = eINSTANCE.getShapestyleLayout();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPESTYLE_LAYOUT__LAYOUT = eINSTANCE.getShapestyleLayout_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.ShapeStyleRefImpl <em>Shape Style Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.ShapeStyleRefImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getShapeStyleRef()
		 * @generated
		 */
		EClass SHAPE_STYLE_REF = eINSTANCE.getShapeStyleRef();

		/**
		 * The meta object literal for the '<em><b>Java Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_STYLE_REF__JAVA_STYLE = eINSTANCE.getShapeStyleRef_JavaStyle();

		/**
		 * The meta object literal for the '<em><b>Dsl Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_STYLE_REF__DSL_STYLE = eINSTANCE.getShapeStyleRef_DslStyle();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.CommonLayoutImpl <em>Common Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.CommonLayoutImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCommonLayout()
		 * @generated
		 */
		EClass COMMON_LAYOUT = eINSTANCE.getCommonLayout();

		/**
		 * The meta object literal for the '<em><b>Xcor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_LAYOUT__XCOR = eINSTANCE.getCommonLayout_Xcor();

		/**
		 * The meta object literal for the '<em><b>Ycor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_LAYOUT__YCOR = eINSTANCE.getCommonLayout_Ycor();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_LAYOUT__WIDTH = eINSTANCE.getCommonLayout_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_LAYOUT__HEIGTH = eINSTANCE.getCommonLayout_Heigth();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.TextBodyImpl <em>Text Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.TextBodyImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getTextBody()
		 * @generated
		 */
		EClass TEXT_BODY = eINSTANCE.getTextBody();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BODY__VALUE = eINSTANCE.getTextBody_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.impl.PointImpl
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Xcor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__XCOR = eINSTANCE.getPoint_Xcor();

		/**
		 * The meta object literal for the '<em><b>Ycor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__YCOR = eINSTANCE.getPoint_Ycor();

		/**
		 * The meta object literal for the '<em><b>Curve Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__CURVE_BEFORE = eINSTANCE.getPoint_CurveBefore();

		/**
		 * The meta object literal for the '<em><b>Curve After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__CURVE_AFTER = eINSTANCE.getPoint_CurveAfter();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.CompartmentLayout <em>Compartment Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.CompartmentLayout
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getCompartmentLayout()
		 * @generated
		 */
		EEnum COMPARTMENT_LAYOUT = eINSTANCE.getCompartmentLayout();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.HAlign <em>HAlign</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.HAlign
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getHAlign()
		 * @generated
		 */
		EEnum HALIGN = eINSTANCE.getHAlign();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.VAlign <em>VAlign</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.VAlign
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getVAlign()
		 * @generated
		 */
		EEnum VALIGN = eINSTANCE.getVAlign();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.ConnectionStyle <em>Connection Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.ConnectionStyle
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getConnectionStyle()
		 * @generated
		 */
		EEnum CONNECTION_STYLE = eINSTANCE.getConnectionStyle();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.AnchorPredefiniedEnum <em>Anchor Predefinied Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.AnchorPredefiniedEnum
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getAnchorPredefiniedEnum()
		 * @generated
		 */
		EEnum ANCHOR_PREDEFINIED_ENUM = eINSTANCE.getAnchorPredefiniedEnum();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.spray.shapes.TextType <em>Text Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.spray.shapes.TextType
		 * @see org.eclipselabs.spray.shapes.impl.ShapesPackageImpl#getTextType()
		 * @generated
		 */
		EEnum TEXT_TYPE = eINSTANCE.getTextType();

	}

} //ShapesPackage
