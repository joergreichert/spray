/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.Arc#getPetriFrom <em>Petri From</em>}</li>
 *   <li>{@link PetriNet.Arc#getPetriTo <em>Petri To</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends PetriEdge {
	/**
	 * Returns the value of the '<em><b>Petri From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri From</em>' reference.
	 * @see #setPetriFrom(PetriNode)
	 * @see PetriNet.PetriNetPackage#getArc_PetriFrom()
	 * @model
	 * @generated
	 */
	PetriNode getPetriFrom();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getPetriFrom <em>Petri From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri From</em>' reference.
	 * @see #getPetriFrom()
	 * @generated
	 */
	void setPetriFrom(PetriNode value);

	/**
	 * Returns the value of the '<em><b>Petri To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri To</em>' reference.
	 * @see #setPetriTo(PetriNode)
	 * @see PetriNet.PetriNetPackage#getArc_PetriTo()
	 * @model
	 * @generated
	 */
	PetriNode getPetriTo();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getPetriTo <em>Petri To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri To</em>' reference.
	 * @see #getPetriTo()
	 * @generated
	 */
	void setPetriTo(PetriNode value);

} // Arc
