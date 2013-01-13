/**
 */
package contain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see contain.ContainPackage
 * @generated
 */
public interface ContainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainFactory eINSTANCE = contain.impl.ContainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>E1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E1</em>'.
	 * @generated
	 */
	E1 createE1();

	/**
	 * Returns a new object of class '<em>E2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E2</em>'.
	 * @generated
	 */
	E2 createE2();

	/**
	 * Returns a new object of class '<em>E3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E3</em>'.
	 * @generated
	 */
	E3 createE3();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContainPackage getContainPackage();

} //ContainFactory
