/**
 */
package contain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contain.E1#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see contain.ContainPackage#getE1()
 * @model
 * @generated
 */
public interface E1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link contain.E}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see contain.ContainPackage#getE1_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<E> getElements();

} // E1
