/**
 */
package MindmapDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MindmapDSL.Element#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see MindmapDSL.MindmapPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends MapElements {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(MapElements)
	 * @see MindmapDSL.MindmapPackage#getElement_Parent()
	 * @model required="true"
	 * @generated
	 */
	MapElements getParent();

	/**
	 * Sets the value of the '{@link MindmapDSL.Element#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MapElements value);

} // Element
