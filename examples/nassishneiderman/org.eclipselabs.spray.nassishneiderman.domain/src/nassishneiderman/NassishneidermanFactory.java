/**
 */
package nassishneiderman;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nassishneiderman.NassishneidermanPackage
 * @generated
 */
public interface NassishneidermanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NassishneidermanFactory eINSTANCE = nassishneiderman.impl.NassishneidermanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithm</em>'.
	 * @generated
	 */
	Algorithm createAlgorithm();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Block</em>'.
	 * @generated
	 */
	ActionBlock createActionBlock();

	/**
	 * Returns a new object of class '<em>Branching Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branching Block</em>'.
	 * @generated
	 */
	BranchingBlock createBranchingBlock();

	/**
	 * Returns a new object of class '<em>Multiple Branching Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Branching Block</em>'.
	 * @generated
	 */
	MultipleBranchingBlock createMultipleBranchingBlock();

	/**
	 * Returns a new object of class '<em>Test Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Block</em>'.
	 * @generated
	 */
	TestBlock createTestBlock();

	/**
	 * Returns a new object of class '<em>Test First Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test First Block</em>'.
	 * @generated
	 */
	TestFirstBlock createTestFirstBlock();

	/**
	 * Returns a new object of class '<em>Test Last Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Last Block</em>'.
	 * @generated
	 */
	TestLastBlock createTestLastBlock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NassishneidermanPackage getNassishneidermanPackage();

} //NassishneidermanFactory
