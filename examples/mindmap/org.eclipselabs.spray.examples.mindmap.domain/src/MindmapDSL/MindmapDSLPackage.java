/**
 */
package MindmapDSL;

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
 * @see MindmapDSL.MindmapDSLFactory
 * @model kind="package"
 * @generated
 */
public interface MindmapDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MindmapDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Mindmap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mindmap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MindmapDSLPackage eINSTANCE = MindmapDSL.impl.MindmapDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link MindmapDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MindmapDSL.impl.NamedElementImpl
	 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MindmapDSL.impl.MindmapImpl <em>Mindmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MindmapDSL.impl.MindmapImpl
	 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getMindmap()
	 * @generated
	 */
	int MINDMAP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINDMAP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINDMAP__MAPELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mindmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINDMAP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MindmapDSL.impl.MapElementsImpl <em>Map Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MindmapDSL.impl.MapElementsImpl
	 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getMapElements()
	 * @generated
	 */
	int MAP_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENTS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Map Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENTS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MindmapDSL.impl.StartElementImpl <em>Start Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MindmapDSL.impl.StartElementImpl
	 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getStartElement()
	 * @generated
	 */
	int START_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ELEMENT__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The number of structural features of the '<em>Start Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ELEMENT_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MindmapDSL.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MindmapDSL.impl.ElementImpl
	 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHILDREN = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = MAP_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link MindmapDSL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see MindmapDSL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link MindmapDSL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MindmapDSL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link MindmapDSL.Mindmap <em>Mindmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mindmap</em>'.
	 * @see MindmapDSL.Mindmap
	 * @generated
	 */
	EClass getMindmap();

	/**
	 * Returns the meta object for the containment reference list '{@link MindmapDSL.Mindmap#getMapelements <em>Mapelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapelements</em>'.
	 * @see MindmapDSL.Mindmap#getMapelements()
	 * @see #getMindmap()
	 * @generated
	 */
	EReference getMindmap_Mapelements();

	/**
	 * Returns the meta object for class '{@link MindmapDSL.MapElements <em>Map Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Elements</em>'.
	 * @see MindmapDSL.MapElements
	 * @generated
	 */
	EClass getMapElements();

	/**
	 * Returns the meta object for class '{@link MindmapDSL.StartElement <em>Start Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Element</em>'.
	 * @see MindmapDSL.StartElement
	 * @generated
	 */
	EClass getStartElement();

	/**
	 * Returns the meta object for class '{@link MindmapDSL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see MindmapDSL.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link MindmapDSL.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see MindmapDSL.Element#getChildren()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Children();

	/**
	 * Returns the meta object for the reference '{@link MindmapDSL.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see MindmapDSL.Element#getParent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MindmapDSLFactory getMindmapDSLFactory();

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
		 * The meta object literal for the '{@link MindmapDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MindmapDSL.impl.NamedElementImpl
		 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link MindmapDSL.impl.MindmapImpl <em>Mindmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MindmapDSL.impl.MindmapImpl
		 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getMindmap()
		 * @generated
		 */
		EClass MINDMAP = eINSTANCE.getMindmap();

		/**
		 * The meta object literal for the '<em><b>Mapelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINDMAP__MAPELEMENTS = eINSTANCE.getMindmap_Mapelements();

		/**
		 * The meta object literal for the '{@link MindmapDSL.impl.MapElementsImpl <em>Map Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MindmapDSL.impl.MapElementsImpl
		 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getMapElements()
		 * @generated
		 */
		EClass MAP_ELEMENTS = eINSTANCE.getMapElements();

		/**
		 * The meta object literal for the '{@link MindmapDSL.impl.StartElementImpl <em>Start Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MindmapDSL.impl.StartElementImpl
		 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getStartElement()
		 * @generated
		 */
		EClass START_ELEMENT = eINSTANCE.getStartElement();

		/**
		 * The meta object literal for the '{@link MindmapDSL.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MindmapDSL.impl.ElementImpl
		 * @see MindmapDSL.impl.MindmapDSLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHILDREN = eINSTANCE.getElement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARENT = eINSTANCE.getElement_Parent();

	}

} //MindmapDSLPackage
