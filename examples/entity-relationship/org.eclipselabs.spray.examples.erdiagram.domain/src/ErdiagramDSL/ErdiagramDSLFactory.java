/**
 */
package ErdiagramDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ErdiagramDSL.ErdiagramDSLPackage
 * @generated
 */
public interface ErdiagramDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErdiagramDSLFactory eINSTANCE = ErdiagramDSL.impl.ErdiagramDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Erdiagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Erdiagram</em>'.
	 * @generated
	 */
	Erdiagram createErdiagram();

	/**
	 * Returns a new object of class '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Element</em>'.
	 * @generated
	 */
	DiagramElement createDiagramElement();

	/**
	 * Returns a new object of class '<em>Chen Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Element</em>'.
	 * @generated
	 */
	ChenElement createChenElement();

	/**
	 * Returns a new object of class '<em>Chen Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Entity</em>'.
	 * @generated
	 */
	ChenEntity createChenEntity();

	/**
	 * Returns a new object of class '<em>Chen Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Relationship</em>'.
	 * @generated
	 */
	ChenRelationship createChenRelationship();

	/**
	 * Returns a new object of class '<em>Chen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Attribute</em>'.
	 * @generated
	 */
	ChenAttribute createChenAttribute();

	/**
	 * Returns a new object of class '<em>Chen Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Connection</em>'.
	 * @generated
	 */
	ChenConnection createChenConnection();

	/**
	 * Returns a new object of class '<em>Chen Normal To Weak Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Normal To Weak Connection</em>'.
	 * @generated
	 */
	ChenNormalToWeakConnection createChenNormalToWeakConnection();

	/**
	 * Returns a new object of class '<em>Chen Weak Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Weak Element</em>'.
	 * @generated
	 */
	ChenWeakElement createChenWeakElement();

	/**
	 * Returns a new object of class '<em>Chen Weak Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Weak Entity</em>'.
	 * @generated
	 */
	ChenWeakEntity createChenWeakEntity();

	/**
	 * Returns a new object of class '<em>Chen Weak Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Weak Relationship</em>'.
	 * @generated
	 */
	ChenWeakRelationship createChenWeakRelationship();

	/**
	 * Returns a new object of class '<em>Chen Weak Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Weak Attribute</em>'.
	 * @generated
	 */
	ChenWeakAttribute createChenWeakAttribute();

	/**
	 * Returns a new object of class '<em>Chen Weak Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chen Weak Connection</em>'.
	 * @generated
	 */
	ChenWeakConnection createChenWeakConnection();

	/**
	 * Returns a new object of class '<em>Martin Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Martin Element</em>'.
	 * @generated
	 */
	MartinElement createMartinElement();

	/**
	 * Returns a new object of class '<em>Martin Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Martin Entity</em>'.
	 * @generated
	 */
	MartinEntity createMartinEntity();

	/**
	 * Returns a new object of class '<em>Martin Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Martin Connection</em>'.
	 * @generated
	 */
	MartinConnection createMartinConnection();

	/**
	 * Returns a new object of class '<em>Minmax Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minmax Entity</em>'.
	 * @generated
	 */
	MinmaxEntity createMinmaxEntity();

	/**
	 * Returns a new object of class '<em>Minmax Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minmax Connection</em>'.
	 * @generated
	 */
	MinmaxConnection createMinmaxConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ErdiagramDSLPackage getErdiagramDSLPackage();

} //ErdiagramDSLFactory
