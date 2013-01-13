/**
 */
package nassishneiderman;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Branching Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nassishneiderman.MultipleBranchingBlock#getSequences <em>Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @see nassishneiderman.NassishneidermanPackage#getMultipleBranchingBlock()
 * @model
 * @generated
 */
public interface MultipleBranchingBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link nassishneiderman.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see nassishneiderman.NassishneidermanPackage#getMultipleBranchingBlock_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

} // MultipleBranchingBlock
