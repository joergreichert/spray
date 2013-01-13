/**
 */
package contain;

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
 * @see contain.ContainFactory
 * @model kind="package"
 * @generated
 */
public interface ContainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/contain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cnt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainPackage eINSTANCE = contain.impl.ContainPackageImpl.init();

	/**
	 * The meta object id for the '{@link contain.impl.EImpl <em>E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contain.impl.EImpl
	 * @see contain.impl.ContainPackageImpl#getE()
	 * @generated
	 */
	int E = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E__NAME = 0;

	/**
	 * The number of structural features of the '<em>E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link contain.impl.E1Impl <em>E1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contain.impl.E1Impl
	 * @see contain.impl.ContainPackageImpl#getE1()
	 * @generated
	 */
	int E1 = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E1__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>E1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link contain.impl.E2Impl <em>E2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contain.impl.E2Impl
	 * @see contain.impl.ContainPackageImpl#getE2()
	 * @generated
	 */
	int E2 = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2__NAME = E__NAME;

	/**
	 * The number of structural features of the '<em>E2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2_FEATURE_COUNT = E_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link contain.impl.E3Impl <em>E3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contain.impl.E3Impl
	 * @see contain.impl.ContainPackageImpl#getE3()
	 * @generated
	 */
	int E3 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3__NAME = E__NAME;

	/**
	 * The number of structural features of the '<em>E3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_FEATURE_COUNT = E_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link contain.E <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E</em>'.
	 * @see contain.E
	 * @generated
	 */
	EClass getE();

	/**
	 * Returns the meta object for the attribute '{@link contain.E#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see contain.E#getName()
	 * @see #getE()
	 * @generated
	 */
	EAttribute getE_Name();

	/**
	 * Returns the meta object for class '{@link contain.E1 <em>E1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E1</em>'.
	 * @see contain.E1
	 * @generated
	 */
	EClass getE1();

	/**
	 * Returns the meta object for the containment reference list '{@link contain.E1#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see contain.E1#getElements()
	 * @see #getE1()
	 * @generated
	 */
	EReference getE1_Elements();

	/**
	 * Returns the meta object for class '{@link contain.E2 <em>E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E2</em>'.
	 * @see contain.E2
	 * @generated
	 */
	EClass getE2();

	/**
	 * Returns the meta object for class '{@link contain.E3 <em>E3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E3</em>'.
	 * @see contain.E3
	 * @generated
	 */
	EClass getE3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainFactory getContainFactory();

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
		 * The meta object literal for the '{@link contain.impl.EImpl <em>E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contain.impl.EImpl
		 * @see contain.impl.ContainPackageImpl#getE()
		 * @generated
		 */
		EClass E = eINSTANCE.getE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute E__NAME = eINSTANCE.getE_Name();

		/**
		 * The meta object literal for the '{@link contain.impl.E1Impl <em>E1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contain.impl.E1Impl
		 * @see contain.impl.ContainPackageImpl#getE1()
		 * @generated
		 */
		EClass E1 = eINSTANCE.getE1();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E1__ELEMENTS = eINSTANCE.getE1_Elements();

		/**
		 * The meta object literal for the '{@link contain.impl.E2Impl <em>E2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contain.impl.E2Impl
		 * @see contain.impl.ContainPackageImpl#getE2()
		 * @generated
		 */
		EClass E2 = eINSTANCE.getE2();

		/**
		 * The meta object literal for the '{@link contain.impl.E3Impl <em>E3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contain.impl.E3Impl
		 * @see contain.impl.ContainPackageImpl#getE3()
		 * @generated
		 */
		EClass E3 = eINSTANCE.getE3();

	}

} //ContainPackage
