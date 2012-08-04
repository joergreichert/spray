/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LWC Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LanguageWorkbenchCompetition.LWCModelElement#getName <em>Name</em>}</li>
 *   <li>{@link LanguageWorkbenchCompetition.LWCModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link LanguageWorkbenchCompetition.LWCModelElement#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCModelElement()
 * @model
 * @generated
 */
public interface LWCModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LanguageWorkbenchCompetition.LWCModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCModelElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link LanguageWorkbenchCompetition.LWCModelElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link LanguageWorkbenchCompetition.LWCModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCModelElement_ModelElements()
	 * @model type="LanguageWorkbenchCompetition.LWCModelElement" containment="true"
	 * @generated
	 */
	EList getModelElements();

} // LWCModelElement
