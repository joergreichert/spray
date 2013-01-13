/**
 */
package nassishneiderman;

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
 * @see nassishneiderman.NassishneidermanFactory
 * @model kind="package"
 * @generated
 */
public interface NassishneidermanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nassishneiderman";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/spray/nassishneiderman/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NassishneidermanPackage eINSTANCE = nassishneiderman.impl.NassishneidermanPackageImpl.init();

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.AlgorithmImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.SequenceImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CASE = 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__BLOCKS = 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.BlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.ActionBlockImpl <em>Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.ActionBlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getActionBlock()
	 * @generated
	 */
	int ACTION_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__ACTION_NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__ACTION_DESCRIPTION = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.BranchingBlockImpl <em>Branching Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.BranchingBlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getBranchingBlock()
	 * @generated
	 */
	int BRANCHING_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING_BLOCK__CONDITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>True Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING_BLOCK__TRUE_SEQUENCE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>False Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING_BLOCK__FALSE_SEQUENCE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Branching Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.MultipleBranchingBlockImpl <em>Multiple Branching Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.MultipleBranchingBlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getMultipleBranchingBlock()
	 * @generated
	 */
	int MULTIPLE_BRANCHING_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_BRANCHING_BLOCK__SEQUENCES = 0;

	/**
	 * The number of structural features of the '<em>Multiple Branching Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_BRANCHING_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.TestBlockImpl <em>Test Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.TestBlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getTestBlock()
	 * @generated
	 */
	int TEST_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BLOCK__CONDITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BLOCK__SEQUENCE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.TestFirstBlockImpl <em>Test First Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.TestFirstBlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getTestFirstBlock()
	 * @generated
	 */
	int TEST_FIRST_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIRST_BLOCK__CONDITION = TEST_BLOCK__CONDITION;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIRST_BLOCK__SEQUENCE = TEST_BLOCK__SEQUENCE;

	/**
	 * The number of structural features of the '<em>Test First Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIRST_BLOCK_FEATURE_COUNT = TEST_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nassishneiderman.impl.TestLastBlockImpl <em>Test Last Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nassishneiderman.impl.TestLastBlockImpl
	 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getTestLastBlock()
	 * @generated
	 */
	int TEST_LAST_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LAST_BLOCK__CONDITION = TEST_BLOCK__CONDITION;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LAST_BLOCK__SEQUENCE = TEST_BLOCK__SEQUENCE;

	/**
	 * The number of structural features of the '<em>Test Last Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LAST_BLOCK_FEATURE_COUNT = TEST_BLOCK_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link nassishneiderman.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see nassishneiderman.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link nassishneiderman.Algorithm#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see nassishneiderman.Algorithm#getSequence()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Sequence();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see nassishneiderman.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link nassishneiderman.Sequence#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see nassishneiderman.Sequence#getCase()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Case();

	/**
	 * Returns the meta object for the containment reference list '{@link nassishneiderman.Sequence#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see nassishneiderman.Sequence#getBlocks()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Blocks();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see nassishneiderman.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Block</em>'.
	 * @see nassishneiderman.ActionBlock
	 * @generated
	 */
	EClass getActionBlock();

	/**
	 * Returns the meta object for the attribute '{@link nassishneiderman.ActionBlock#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see nassishneiderman.ActionBlock#getActionName()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_ActionName();

	/**
	 * Returns the meta object for the attribute '{@link nassishneiderman.ActionBlock#getActionDescription <em>Action Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Description</em>'.
	 * @see nassishneiderman.ActionBlock#getActionDescription()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_ActionDescription();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.BranchingBlock <em>Branching Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branching Block</em>'.
	 * @see nassishneiderman.BranchingBlock
	 * @generated
	 */
	EClass getBranchingBlock();

	/**
	 * Returns the meta object for the attribute '{@link nassishneiderman.BranchingBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see nassishneiderman.BranchingBlock#getCondition()
	 * @see #getBranchingBlock()
	 * @generated
	 */
	EAttribute getBranchingBlock_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link nassishneiderman.BranchingBlock#getTrueSequence <em>True Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>True Sequence</em>'.
	 * @see nassishneiderman.BranchingBlock#getTrueSequence()
	 * @see #getBranchingBlock()
	 * @generated
	 */
	EReference getBranchingBlock_TrueSequence();

	/**
	 * Returns the meta object for the containment reference '{@link nassishneiderman.BranchingBlock#getFalseSequence <em>False Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>False Sequence</em>'.
	 * @see nassishneiderman.BranchingBlock#getFalseSequence()
	 * @see #getBranchingBlock()
	 * @generated
	 */
	EReference getBranchingBlock_FalseSequence();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.MultipleBranchingBlock <em>Multiple Branching Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Branching Block</em>'.
	 * @see nassishneiderman.MultipleBranchingBlock
	 * @generated
	 */
	EClass getMultipleBranchingBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link nassishneiderman.MultipleBranchingBlock#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see nassishneiderman.MultipleBranchingBlock#getSequences()
	 * @see #getMultipleBranchingBlock()
	 * @generated
	 */
	EReference getMultipleBranchingBlock_Sequences();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.TestBlock <em>Test Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Block</em>'.
	 * @see nassishneiderman.TestBlock
	 * @generated
	 */
	EClass getTestBlock();

	/**
	 * Returns the meta object for the attribute '{@link nassishneiderman.TestBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see nassishneiderman.TestBlock#getCondition()
	 * @see #getTestBlock()
	 * @generated
	 */
	EAttribute getTestBlock_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link nassishneiderman.TestBlock#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see nassishneiderman.TestBlock#getSequence()
	 * @see #getTestBlock()
	 * @generated
	 */
	EReference getTestBlock_Sequence();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.TestFirstBlock <em>Test First Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test First Block</em>'.
	 * @see nassishneiderman.TestFirstBlock
	 * @generated
	 */
	EClass getTestFirstBlock();

	/**
	 * Returns the meta object for class '{@link nassishneiderman.TestLastBlock <em>Test Last Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Last Block</em>'.
	 * @see nassishneiderman.TestLastBlock
	 * @generated
	 */
	EClass getTestLastBlock();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NassishneidermanFactory getNassishneidermanFactory();

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
		 * The meta object literal for the '{@link nassishneiderman.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.AlgorithmImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__SEQUENCE = eINSTANCE.getAlgorithm_Sequence();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.SequenceImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__CASE = eINSTANCE.getSequence_Case();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__BLOCKS = eINSTANCE.getSequence_Blocks();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.BlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.ActionBlockImpl <em>Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.ActionBlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getActionBlock()
		 * @generated
		 */
		EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__ACTION_NAME = eINSTANCE.getActionBlock_ActionName();

		/**
		 * The meta object literal for the '<em><b>Action Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__ACTION_DESCRIPTION = eINSTANCE.getActionBlock_ActionDescription();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.BranchingBlockImpl <em>Branching Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.BranchingBlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getBranchingBlock()
		 * @generated
		 */
		EClass BRANCHING_BLOCK = eINSTANCE.getBranchingBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCHING_BLOCK__CONDITION = eINSTANCE.getBranchingBlock_Condition();

		/**
		 * The meta object literal for the '<em><b>True Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCHING_BLOCK__TRUE_SEQUENCE = eINSTANCE.getBranchingBlock_TrueSequence();

		/**
		 * The meta object literal for the '<em><b>False Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCHING_BLOCK__FALSE_SEQUENCE = eINSTANCE.getBranchingBlock_FalseSequence();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.MultipleBranchingBlockImpl <em>Multiple Branching Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.MultipleBranchingBlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getMultipleBranchingBlock()
		 * @generated
		 */
		EClass MULTIPLE_BRANCHING_BLOCK = eINSTANCE.getMultipleBranchingBlock();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_BRANCHING_BLOCK__SEQUENCES = eINSTANCE.getMultipleBranchingBlock_Sequences();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.TestBlockImpl <em>Test Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.TestBlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getTestBlock()
		 * @generated
		 */
		EClass TEST_BLOCK = eINSTANCE.getTestBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_BLOCK__CONDITION = eINSTANCE.getTestBlock_Condition();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_BLOCK__SEQUENCE = eINSTANCE.getTestBlock_Sequence();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.TestFirstBlockImpl <em>Test First Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.TestFirstBlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getTestFirstBlock()
		 * @generated
		 */
		EClass TEST_FIRST_BLOCK = eINSTANCE.getTestFirstBlock();

		/**
		 * The meta object literal for the '{@link nassishneiderman.impl.TestLastBlockImpl <em>Test Last Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nassishneiderman.impl.TestLastBlockImpl
		 * @see nassishneiderman.impl.NassishneidermanPackageImpl#getTestLastBlock()
		 * @generated
		 */
		EClass TEST_LAST_BLOCK = eINSTANCE.getTestLastBlock();

	}

} //NassishneidermanPackage
