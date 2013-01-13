/**
 */
package nassishneiderman.impl;

import nassishneiderman.ActionBlock;
import nassishneiderman.Algorithm;
import nassishneiderman.Block;
import nassishneiderman.BranchingBlock;
import nassishneiderman.MultipleBranchingBlock;
import nassishneiderman.NassishneidermanFactory;
import nassishneiderman.NassishneidermanPackage;
import nassishneiderman.Sequence;
import nassishneiderman.TestBlock;
import nassishneiderman.TestFirstBlock;
import nassishneiderman.TestLastBlock;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NassishneidermanPackageImpl extends EPackageImpl implements NassishneidermanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleBranchingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testFirstBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testLastBlockEClass = null;

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
	 * @see nassishneiderman.NassishneidermanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NassishneidermanPackageImpl() {
		super(eNS_URI, NassishneidermanFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NassishneidermanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NassishneidermanPackage init() {
		if (isInited) return (NassishneidermanPackage)EPackage.Registry.INSTANCE.getEPackage(NassishneidermanPackage.eNS_URI);

		// Obtain or create and register package
		NassishneidermanPackageImpl theNassishneidermanPackage = (NassishneidermanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NassishneidermanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NassishneidermanPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNassishneidermanPackage.createPackageContents();

		// Initialize created meta-data
		theNassishneidermanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNassishneidermanPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NassishneidermanPackage.eNS_URI, theNassishneidermanPackage);
		return theNassishneidermanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Sequence() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Case() {
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Blocks() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBlock() {
		return actionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_ActionName() {
		return (EAttribute)actionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_ActionDescription() {
		return (EAttribute)actionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchingBlock() {
		return branchingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchingBlock_Condition() {
		return (EAttribute)branchingBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchingBlock_TrueSequence() {
		return (EReference)branchingBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchingBlock_FalseSequence() {
		return (EReference)branchingBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleBranchingBlock() {
		return multipleBranchingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleBranchingBlock_Sequences() {
		return (EReference)multipleBranchingBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestBlock() {
		return testBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestBlock_Condition() {
		return (EAttribute)testBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestBlock_Sequence() {
		return (EReference)testBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestFirstBlock() {
		return testFirstBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestLastBlock() {
		return testLastBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NassishneidermanFactory getNassishneidermanFactory() {
		return (NassishneidermanFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		algorithmEClass = createEClass(ALGORITHM);
		createEReference(algorithmEClass, ALGORITHM__SEQUENCE);

		sequenceEClass = createEClass(SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__CASE);
		createEReference(sequenceEClass, SEQUENCE__BLOCKS);

		blockEClass = createEClass(BLOCK);

		actionBlockEClass = createEClass(ACTION_BLOCK);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__ACTION_NAME);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__ACTION_DESCRIPTION);

		branchingBlockEClass = createEClass(BRANCHING_BLOCK);
		createEAttribute(branchingBlockEClass, BRANCHING_BLOCK__CONDITION);
		createEReference(branchingBlockEClass, BRANCHING_BLOCK__TRUE_SEQUENCE);
		createEReference(branchingBlockEClass, BRANCHING_BLOCK__FALSE_SEQUENCE);

		multipleBranchingBlockEClass = createEClass(MULTIPLE_BRANCHING_BLOCK);
		createEReference(multipleBranchingBlockEClass, MULTIPLE_BRANCHING_BLOCK__SEQUENCES);

		testBlockEClass = createEClass(TEST_BLOCK);
		createEAttribute(testBlockEClass, TEST_BLOCK__CONDITION);
		createEReference(testBlockEClass, TEST_BLOCK__SEQUENCE);

		testFirstBlockEClass = createEClass(TEST_FIRST_BLOCK);

		testLastBlockEClass = createEClass(TEST_LAST_BLOCK);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionBlockEClass.getESuperTypes().add(this.getBlock());
		branchingBlockEClass.getESuperTypes().add(this.getBlock());
		testBlockEClass.getESuperTypes().add(this.getBlock());
		testFirstBlockEClass.getESuperTypes().add(this.getTestBlock());
		testLastBlockEClass.getESuperTypes().add(this.getTestBlock());

		// Initialize classes and features; add operations and parameters
		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithm_Sequence(), this.getSequence(), null, "sequence", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequence_Case(), ecorePackage.getEString(), "case", null, 0, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Blocks(), this.getBlock(), null, "blocks", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionBlockEClass, ActionBlock.class, "ActionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionBlock_ActionName(), ecorePackage.getEString(), "actionName", null, 0, 1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBlock_ActionDescription(), ecorePackage.getEString(), "actionDescription", null, 0, 1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchingBlockEClass, BranchingBlock.class, "BranchingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranchingBlock_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, BranchingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchingBlock_TrueSequence(), this.getSequence(), null, "trueSequence", null, 0, 1, BranchingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchingBlock_FalseSequence(), this.getSequence(), null, "falseSequence", null, 0, 1, BranchingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleBranchingBlockEClass, MultipleBranchingBlock.class, "MultipleBranchingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleBranchingBlock_Sequences(), this.getSequence(), null, "sequences", null, 0, -1, MultipleBranchingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testBlockEClass, TestBlock.class, "TestBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestBlock_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, TestBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestBlock_Sequence(), this.getSequence(), null, "sequence", null, 0, 1, TestBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testFirstBlockEClass, TestFirstBlock.class, "TestFirstBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testLastBlockEClass, TestLastBlock.class, "TestLastBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //NassishneidermanPackageImpl
