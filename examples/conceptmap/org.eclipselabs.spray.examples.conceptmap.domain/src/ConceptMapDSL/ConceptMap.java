/**
 */
package ConceptMapDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptMapDSL.ConceptMap#getMapelements <em>Mapelements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptMapDSL.ConceptMapDSLPackage#getConceptMap()
 * @model
 * @generated
 */
public interface ConceptMap extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mapelements</b></em>' containment reference list.
	 * The list contents are of type {@link ConceptMapDSL.MapElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapelements</em>' containment reference list.
	 * @see ConceptMapDSL.ConceptMapDSLPackage#getConceptMap_Mapelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapElements> getMapelements();

} // ConceptMap
