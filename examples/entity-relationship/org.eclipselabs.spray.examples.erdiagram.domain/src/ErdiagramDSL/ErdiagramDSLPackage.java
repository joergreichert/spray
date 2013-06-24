/**
 */
package ErdiagramDSL;

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
 * @see ErdiagramDSL.ErdiagramDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ErdiagramDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ErdiagramDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Erdiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "erdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErdiagramDSLPackage eINSTANCE = ErdiagramDSL.impl.ErdiagramDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ErdiagramImpl <em>Erdiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ErdiagramImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getErdiagram()
	 * @generated
	 */
	int ERDIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERDIAGRAM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Erdiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERDIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.DiagramElementImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenElementImpl <em>Chen Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenElementImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenElement()
	 * @generated
	 */
	int CHEN_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ELEMENT__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chen Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ELEMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenEntityImpl <em>Chen Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenEntityImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenEntity()
	 * @generated
	 */
	int CHEN_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ENTITY__NAME = CHEN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Chen Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ENTITY_FEATURE_COUNT = CHEN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenRelationshipImpl <em>Chen Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenRelationshipImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenRelationship()
	 * @generated
	 */
	int CHEN_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_RELATIONSHIP__NAME = CHEN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_RELATIONSHIP__DESCRIPTION = CHEN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chen Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_RELATIONSHIP_FEATURE_COUNT = CHEN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenAttributeImpl <em>Chen Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenAttributeImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenAttribute()
	 * @generated
	 */
	int CHEN_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ATTRIBUTE__NAME = CHEN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ATTRIBUTE__PARENT = CHEN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chen Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_ATTRIBUTE_FEATURE_COUNT = CHEN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenConnectionImpl <em>Chen Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenConnectionImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenConnection()
	 * @generated
	 */
	int CHEN_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_CONNECTION__FROM_ENTITY = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_CONNECTION__TO_RELATIONSHIP = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_CONNECTION__VALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chen Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl <em>Chen Normal To Weak Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenNormalToWeakConnection()
	 * @generated
	 */
	int CHEN_NORMAL_TO_WEAK_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chen Normal To Weak Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_NORMAL_TO_WEAK_CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenWeakElementImpl <em>Chen Weak Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenWeakElementImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakElement()
	 * @generated
	 */
	int CHEN_WEAK_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ELEMENT__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chen Weak Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ELEMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenWeakEntityImpl <em>Chen Weak Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenWeakEntityImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakEntity()
	 * @generated
	 */
	int CHEN_WEAK_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ENTITY__NAME = CHEN_WEAK_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Chen Weak Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ENTITY_FEATURE_COUNT = CHEN_WEAK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenWeakRelationshipImpl <em>Chen Weak Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenWeakRelationshipImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakRelationship()
	 * @generated
	 */
	int CHEN_WEAK_RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_RELATIONSHIP__NAME = CHEN_WEAK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_RELATIONSHIP__DESCRIPTION = CHEN_WEAK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chen Weak Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_RELATIONSHIP_FEATURE_COUNT = CHEN_WEAK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenWeakAttributeImpl <em>Chen Weak Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenWeakAttributeImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakAttribute()
	 * @generated
	 */
	int CHEN_WEAK_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ATTRIBUTE__NAME = CHEN_WEAK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ATTRIBUTE__PARENT = CHEN_WEAK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chen Weak Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_ATTRIBUTE_FEATURE_COUNT = CHEN_WEAK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ChenWeakConnectionImpl <em>Chen Weak Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ChenWeakConnectionImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakConnection()
	 * @generated
	 */
	int CHEN_WEAK_CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_CONNECTION__FROM_ENTITY = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_CONNECTION__TO_RELATIONSHIP = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_CONNECTION__VALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chen Weak Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_WEAK_CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.MartinElementImpl <em>Martin Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.MartinElementImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMartinElement()
	 * @generated
	 */
	int MARTIN_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_ELEMENT__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Martin Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_ELEMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.MartinEntityImpl <em>Martin Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.MartinEntityImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMartinEntity()
	 * @generated
	 */
	int MARTIN_ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_ENTITY__NAME = MARTIN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Martin Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_ENTITY_FEATURE_COUNT = MARTIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.MartinConnectionImpl <em>Martin Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.MartinConnectionImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMartinConnection()
	 * @generated
	 */
	int MARTIN_CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>From Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_CONNECTION__FROM_TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_CONNECTION__TO_TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_CONNECTION__START = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_CONNECTION__END = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Martin Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARTIN_CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.MinmaxEntityImpl <em>Minmax Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.MinmaxEntityImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMinmaxEntity()
	 * @generated
	 */
	int MINMAX_ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_ENTITY__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minmax Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_ENTITY_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.MinmaxConnectionImpl <em>Minmax Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.MinmaxConnectionImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMinmaxConnection()
	 * @generated
	 */
	int MINMAX_CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>From Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_CONNECTION__FROM_TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_CONNECTION__TO_TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_CONNECTION__START = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_CONNECTION__END = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Minmax Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINMAX_CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.Erdiagram <em>Erdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erdiagram</em>'.
	 * @see ErdiagramDSL.Erdiagram
	 * @generated
	 */
	EClass getErdiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link ErdiagramDSL.Erdiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ErdiagramDSL.Erdiagram#getElements()
	 * @see #getErdiagram()
	 * @generated
	 */
	EReference getErdiagram_Elements();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see ErdiagramDSL.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenElement <em>Chen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Element</em>'.
	 * @see ErdiagramDSL.ChenElement
	 * @generated
	 */
	EClass getChenElement();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ErdiagramDSL.ChenElement#getName()
	 * @see #getChenElement()
	 * @generated
	 */
	EAttribute getChenElement_Name();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenEntity <em>Chen Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Entity</em>'.
	 * @see ErdiagramDSL.ChenEntity
	 * @generated
	 */
	EClass getChenEntity();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenRelationship <em>Chen Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Relationship</em>'.
	 * @see ErdiagramDSL.ChenRelationship
	 * @generated
	 */
	EClass getChenRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenRelationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ErdiagramDSL.ChenRelationship#getDescription()
	 * @see #getChenRelationship()
	 * @generated
	 */
	EAttribute getChenRelationship_Description();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenAttribute <em>Chen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Attribute</em>'.
	 * @see ErdiagramDSL.ChenAttribute
	 * @generated
	 */
	EClass getChenAttribute();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenAttribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ErdiagramDSL.ChenAttribute#getParent()
	 * @see #getChenAttribute()
	 * @generated
	 */
	EReference getChenAttribute_Parent();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenConnection <em>Chen Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Connection</em>'.
	 * @see ErdiagramDSL.ChenConnection
	 * @generated
	 */
	EClass getChenConnection();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenConnection#getFromEntity <em>From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Entity</em>'.
	 * @see ErdiagramDSL.ChenConnection#getFromEntity()
	 * @see #getChenConnection()
	 * @generated
	 */
	EReference getChenConnection_FromEntity();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenConnection#getToRelationship <em>To Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Relationship</em>'.
	 * @see ErdiagramDSL.ChenConnection#getToRelationship()
	 * @see #getChenConnection()
	 * @generated
	 */
	EReference getChenConnection_ToRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenConnection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ErdiagramDSL.ChenConnection#getValue()
	 * @see #getChenConnection()
	 * @generated
	 */
	EAttribute getChenConnection_Value();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenNormalToWeakConnection <em>Chen Normal To Weak Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Normal To Weak Connection</em>'.
	 * @see ErdiagramDSL.ChenNormalToWeakConnection
	 * @generated
	 */
	EClass getChenNormalToWeakConnection();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenNormalToWeakConnection#getFromEntity <em>From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Entity</em>'.
	 * @see ErdiagramDSL.ChenNormalToWeakConnection#getFromEntity()
	 * @see #getChenNormalToWeakConnection()
	 * @generated
	 */
	EReference getChenNormalToWeakConnection_FromEntity();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenNormalToWeakConnection#getToRelationship <em>To Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Relationship</em>'.
	 * @see ErdiagramDSL.ChenNormalToWeakConnection#getToRelationship()
	 * @see #getChenNormalToWeakConnection()
	 * @generated
	 */
	EReference getChenNormalToWeakConnection_ToRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenNormalToWeakConnection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ErdiagramDSL.ChenNormalToWeakConnection#getValue()
	 * @see #getChenNormalToWeakConnection()
	 * @generated
	 */
	EAttribute getChenNormalToWeakConnection_Value();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenWeakElement <em>Chen Weak Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Weak Element</em>'.
	 * @see ErdiagramDSL.ChenWeakElement
	 * @generated
	 */
	EClass getChenWeakElement();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenWeakElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ErdiagramDSL.ChenWeakElement#getName()
	 * @see #getChenWeakElement()
	 * @generated
	 */
	EAttribute getChenWeakElement_Name();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenWeakEntity <em>Chen Weak Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Weak Entity</em>'.
	 * @see ErdiagramDSL.ChenWeakEntity
	 * @generated
	 */
	EClass getChenWeakEntity();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenWeakRelationship <em>Chen Weak Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Weak Relationship</em>'.
	 * @see ErdiagramDSL.ChenWeakRelationship
	 * @generated
	 */
	EClass getChenWeakRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenWeakRelationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ErdiagramDSL.ChenWeakRelationship#getDescription()
	 * @see #getChenWeakRelationship()
	 * @generated
	 */
	EAttribute getChenWeakRelationship_Description();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenWeakAttribute <em>Chen Weak Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Weak Attribute</em>'.
	 * @see ErdiagramDSL.ChenWeakAttribute
	 * @generated
	 */
	EClass getChenWeakAttribute();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenWeakAttribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ErdiagramDSL.ChenWeakAttribute#getParent()
	 * @see #getChenWeakAttribute()
	 * @generated
	 */
	EReference getChenWeakAttribute_Parent();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ChenWeakConnection <em>Chen Weak Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen Weak Connection</em>'.
	 * @see ErdiagramDSL.ChenWeakConnection
	 * @generated
	 */
	EClass getChenWeakConnection();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenWeakConnection#getFromEntity <em>From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Entity</em>'.
	 * @see ErdiagramDSL.ChenWeakConnection#getFromEntity()
	 * @see #getChenWeakConnection()
	 * @generated
	 */
	EReference getChenWeakConnection_FromEntity();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ChenWeakConnection#getToRelationship <em>To Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Relationship</em>'.
	 * @see ErdiagramDSL.ChenWeakConnection#getToRelationship()
	 * @see #getChenWeakConnection()
	 * @generated
	 */
	EReference getChenWeakConnection_ToRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ChenWeakConnection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ErdiagramDSL.ChenWeakConnection#getValue()
	 * @see #getChenWeakConnection()
	 * @generated
	 */
	EAttribute getChenWeakConnection_Value();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.MartinElement <em>Martin Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Martin Element</em>'.
	 * @see ErdiagramDSL.MartinElement
	 * @generated
	 */
	EClass getMartinElement();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.MartinElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ErdiagramDSL.MartinElement#getName()
	 * @see #getMartinElement()
	 * @generated
	 */
	EAttribute getMartinElement_Name();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.MartinEntity <em>Martin Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Martin Entity</em>'.
	 * @see ErdiagramDSL.MartinEntity
	 * @generated
	 */
	EClass getMartinEntity();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.MartinConnection <em>Martin Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Martin Connection</em>'.
	 * @see ErdiagramDSL.MartinConnection
	 * @generated
	 */
	EClass getMartinConnection();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.MartinConnection#getFromText <em>From Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Text</em>'.
	 * @see ErdiagramDSL.MartinConnection#getFromText()
	 * @see #getMartinConnection()
	 * @generated
	 */
	EAttribute getMartinConnection_FromText();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.MartinConnection#getToText <em>To Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Text</em>'.
	 * @see ErdiagramDSL.MartinConnection#getToText()
	 * @see #getMartinConnection()
	 * @generated
	 */
	EAttribute getMartinConnection_ToText();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.MartinConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see ErdiagramDSL.MartinConnection#getStart()
	 * @see #getMartinConnection()
	 * @generated
	 */
	EReference getMartinConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.MartinConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see ErdiagramDSL.MartinConnection#getEnd()
	 * @see #getMartinConnection()
	 * @generated
	 */
	EReference getMartinConnection_End();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.MinmaxEntity <em>Minmax Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minmax Entity</em>'.
	 * @see ErdiagramDSL.MinmaxEntity
	 * @generated
	 */
	EClass getMinmaxEntity();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.MinmaxEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ErdiagramDSL.MinmaxEntity#getName()
	 * @see #getMinmaxEntity()
	 * @generated
	 */
	EAttribute getMinmaxEntity_Name();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.MinmaxConnection <em>Minmax Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minmax Connection</em>'.
	 * @see ErdiagramDSL.MinmaxConnection
	 * @generated
	 */
	EClass getMinmaxConnection();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.MinmaxConnection#getFromText <em>From Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Text</em>'.
	 * @see ErdiagramDSL.MinmaxConnection#getFromText()
	 * @see #getMinmaxConnection()
	 * @generated
	 */
	EAttribute getMinmaxConnection_FromText();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.MinmaxConnection#getToText <em>To Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Text</em>'.
	 * @see ErdiagramDSL.MinmaxConnection#getToText()
	 * @see #getMinmaxConnection()
	 * @generated
	 */
	EAttribute getMinmaxConnection_ToText();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.MinmaxConnection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see ErdiagramDSL.MinmaxConnection#getStart()
	 * @see #getMinmaxConnection()
	 * @generated
	 */
	EReference getMinmaxConnection_Start();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.MinmaxConnection#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see ErdiagramDSL.MinmaxConnection#getEnd()
	 * @see #getMinmaxConnection()
	 * @generated
	 */
	EReference getMinmaxConnection_End();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErdiagramDSLFactory getErdiagramDSLFactory();

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
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ErdiagramImpl <em>Erdiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ErdiagramImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getErdiagram()
		 * @generated
		 */
		EClass ERDIAGRAM = eINSTANCE.getErdiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERDIAGRAM__ELEMENTS = eINSTANCE.getErdiagram_Elements();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.DiagramElementImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenElementImpl <em>Chen Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenElementImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenElement()
		 * @generated
		 */
		EClass CHEN_ELEMENT = eINSTANCE.getChenElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_ELEMENT__NAME = eINSTANCE.getChenElement_Name();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenEntityImpl <em>Chen Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenEntityImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenEntity()
		 * @generated
		 */
		EClass CHEN_ENTITY = eINSTANCE.getChenEntity();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenRelationshipImpl <em>Chen Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenRelationshipImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenRelationship()
		 * @generated
		 */
		EClass CHEN_RELATIONSHIP = eINSTANCE.getChenRelationship();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_RELATIONSHIP__DESCRIPTION = eINSTANCE.getChenRelationship_Description();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenAttributeImpl <em>Chen Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenAttributeImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenAttribute()
		 * @generated
		 */
		EClass CHEN_ATTRIBUTE = eINSTANCE.getChenAttribute();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_ATTRIBUTE__PARENT = eINSTANCE.getChenAttribute_Parent();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenConnectionImpl <em>Chen Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenConnectionImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenConnection()
		 * @generated
		 */
		EClass CHEN_CONNECTION = eINSTANCE.getChenConnection();

		/**
		 * The meta object literal for the '<em><b>From Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_CONNECTION__FROM_ENTITY = eINSTANCE.getChenConnection_FromEntity();

		/**
		 * The meta object literal for the '<em><b>To Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_CONNECTION__TO_RELATIONSHIP = eINSTANCE.getChenConnection_ToRelationship();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_CONNECTION__VALUE = eINSTANCE.getChenConnection_Value();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl <em>Chen Normal To Weak Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenNormalToWeakConnection()
		 * @generated
		 */
		EClass CHEN_NORMAL_TO_WEAK_CONNECTION = eINSTANCE.getChenNormalToWeakConnection();

		/**
		 * The meta object literal for the '<em><b>From Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY = eINSTANCE.getChenNormalToWeakConnection_FromEntity();

		/**
		 * The meta object literal for the '<em><b>To Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP = eINSTANCE.getChenNormalToWeakConnection_ToRelationship();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE = eINSTANCE.getChenNormalToWeakConnection_Value();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenWeakElementImpl <em>Chen Weak Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenWeakElementImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakElement()
		 * @generated
		 */
		EClass CHEN_WEAK_ELEMENT = eINSTANCE.getChenWeakElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_WEAK_ELEMENT__NAME = eINSTANCE.getChenWeakElement_Name();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenWeakEntityImpl <em>Chen Weak Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenWeakEntityImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakEntity()
		 * @generated
		 */
		EClass CHEN_WEAK_ENTITY = eINSTANCE.getChenWeakEntity();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenWeakRelationshipImpl <em>Chen Weak Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenWeakRelationshipImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakRelationship()
		 * @generated
		 */
		EClass CHEN_WEAK_RELATIONSHIP = eINSTANCE.getChenWeakRelationship();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_WEAK_RELATIONSHIP__DESCRIPTION = eINSTANCE.getChenWeakRelationship_Description();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenWeakAttributeImpl <em>Chen Weak Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenWeakAttributeImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakAttribute()
		 * @generated
		 */
		EClass CHEN_WEAK_ATTRIBUTE = eINSTANCE.getChenWeakAttribute();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_WEAK_ATTRIBUTE__PARENT = eINSTANCE.getChenWeakAttribute_Parent();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ChenWeakConnectionImpl <em>Chen Weak Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ChenWeakConnectionImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getChenWeakConnection()
		 * @generated
		 */
		EClass CHEN_WEAK_CONNECTION = eINSTANCE.getChenWeakConnection();

		/**
		 * The meta object literal for the '<em><b>From Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_WEAK_CONNECTION__FROM_ENTITY = eINSTANCE.getChenWeakConnection_FromEntity();

		/**
		 * The meta object literal for the '<em><b>To Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN_WEAK_CONNECTION__TO_RELATIONSHIP = eINSTANCE.getChenWeakConnection_ToRelationship();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEN_WEAK_CONNECTION__VALUE = eINSTANCE.getChenWeakConnection_Value();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.MartinElementImpl <em>Martin Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.MartinElementImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMartinElement()
		 * @generated
		 */
		EClass MARTIN_ELEMENT = eINSTANCE.getMartinElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARTIN_ELEMENT__NAME = eINSTANCE.getMartinElement_Name();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.MartinEntityImpl <em>Martin Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.MartinEntityImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMartinEntity()
		 * @generated
		 */
		EClass MARTIN_ENTITY = eINSTANCE.getMartinEntity();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.MartinConnectionImpl <em>Martin Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.MartinConnectionImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMartinConnection()
		 * @generated
		 */
		EClass MARTIN_CONNECTION = eINSTANCE.getMartinConnection();

		/**
		 * The meta object literal for the '<em><b>From Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARTIN_CONNECTION__FROM_TEXT = eINSTANCE.getMartinConnection_FromText();

		/**
		 * The meta object literal for the '<em><b>To Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARTIN_CONNECTION__TO_TEXT = eINSTANCE.getMartinConnection_ToText();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARTIN_CONNECTION__START = eINSTANCE.getMartinConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARTIN_CONNECTION__END = eINSTANCE.getMartinConnection_End();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.MinmaxEntityImpl <em>Minmax Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.MinmaxEntityImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMinmaxEntity()
		 * @generated
		 */
		EClass MINMAX_ENTITY = eINSTANCE.getMinmaxEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINMAX_ENTITY__NAME = eINSTANCE.getMinmaxEntity_Name();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.MinmaxConnectionImpl <em>Minmax Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.MinmaxConnectionImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getMinmaxConnection()
		 * @generated
		 */
		EClass MINMAX_CONNECTION = eINSTANCE.getMinmaxConnection();

		/**
		 * The meta object literal for the '<em><b>From Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINMAX_CONNECTION__FROM_TEXT = eINSTANCE.getMinmaxConnection_FromText();

		/**
		 * The meta object literal for the '<em><b>To Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINMAX_CONNECTION__TO_TEXT = eINSTANCE.getMinmaxConnection_ToText();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINMAX_CONNECTION__START = eINSTANCE.getMinmaxConnection_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINMAX_CONNECTION__END = eINSTANCE.getMinmaxConnection_End();

	}

} //ErdiagramDSLPackage
