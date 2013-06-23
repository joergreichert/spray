/**
 */
package ErdiagramDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erdiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.Erdiagram#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getErdiagram()
 * @model
 * @generated
 */
public interface Erdiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ErdiagramDSL.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getErdiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramElement> getElements();

} // Erdiagram
