/**
 */
package MindmapDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mindmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MindmapDSL.Mindmap#getMapelements <em>Mapelements</em>}</li>
 * </ul>
 * </p>
 *
 * @see MindmapDSL.MindmapPackage#getMindmap()
 * @model
 * @generated
 */
public interface Mindmap extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mapelements</b></em>' containment reference list.
	 * The list contents are of type {@link MindmapDSL.MapElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapelements</em>' containment reference list.
	 * @see MindmapDSL.MindmapPackage#getMindmap_Mapelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapElements> getMapelements();

} // Mindmap
