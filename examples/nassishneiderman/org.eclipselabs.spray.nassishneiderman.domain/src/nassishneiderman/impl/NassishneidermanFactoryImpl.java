/**
 */
package nassishneiderman.impl;

import nassishneiderman.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NassishneidermanFactoryImpl extends EFactoryImpl implements NassishneidermanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NassishneidermanFactory init() {
		try {
			NassishneidermanFactory theNassishneidermanFactory = (NassishneidermanFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/spray/nassishneiderman/domain"); 
			if (theNassishneidermanFactory != null) {
				return theNassishneidermanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NassishneidermanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NassishneidermanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NassishneidermanPackage.ALGORITHM: return createAlgorithm();
			case NassishneidermanPackage.SEQUENCE: return createSequence();
			case NassishneidermanPackage.ACTION_BLOCK: return createActionBlock();
			case NassishneidermanPackage.BRANCHING_BLOCK: return createBranchingBlock();
			case NassishneidermanPackage.MULTIPLE_BRANCHING_BLOCK: return createMultipleBranchingBlock();
			case NassishneidermanPackage.TEST_BLOCK: return createTestBlock();
			case NassishneidermanPackage.TEST_FIRST_BLOCK: return createTestFirstBlock();
			case NassishneidermanPackage.TEST_LAST_BLOCK: return createTestLastBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm createAlgorithm() {
		AlgorithmImpl algorithm = new AlgorithmImpl();
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlock createActionBlock() {
		ActionBlockImpl actionBlock = new ActionBlockImpl();
		return actionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchingBlock createBranchingBlock() {
		BranchingBlockImpl branchingBlock = new BranchingBlockImpl();
		return branchingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleBranchingBlock createMultipleBranchingBlock() {
		MultipleBranchingBlockImpl multipleBranchingBlock = new MultipleBranchingBlockImpl();
		return multipleBranchingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestBlock createTestBlock() {
		TestBlockImpl testBlock = new TestBlockImpl();
		return testBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFirstBlock createTestFirstBlock() {
		TestFirstBlockImpl testFirstBlock = new TestFirstBlockImpl();
		return testFirstBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestLastBlock createTestLastBlock() {
		TestLastBlockImpl testLastBlock = new TestLastBlockImpl();
		return testLastBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NassishneidermanPackage getNassishneidermanPackage() {
		return (NassishneidermanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NassishneidermanPackage getPackage() {
		return NassishneidermanPackage.eINSTANCE;
	}

} //NassishneidermanFactoryImpl
