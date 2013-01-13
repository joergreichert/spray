/**
 */
package nassishneiderman;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nassishneiderman.Sequence#getCase <em>Case</em>}</li>
 *   <li>{@link nassishneiderman.Sequence#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see nassishneiderman.NassishneidermanPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see #setCase(String)
	 * @see nassishneiderman.NassishneidermanPackage#getSequence_Case()
	 * @model
	 * @generated
	 */
	String getCase();

	/**
	 * Sets the value of the '{@link nassishneiderman.Sequence#getCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(String value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link nassishneiderman.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see nassishneiderman.NassishneidermanPackage#getSequence_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

} // Sequence
