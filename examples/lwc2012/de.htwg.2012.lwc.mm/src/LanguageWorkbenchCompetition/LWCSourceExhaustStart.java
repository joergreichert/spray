/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LWC Source Exhaust Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart#getFromElement <em>From Element</em>}</li>
 *   <li>{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCSourceExhaustStart()
 * @model
 * @generated
 */
public interface LWCSourceExhaustStart extends LWCModelElement {
	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(LWCSystemEnd)
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCSourceExhaustStart_FromElement()
	 * @model
	 * @generated
	 */
	LWCSystemEnd getFromElement();

	/**
	 * Sets the value of the '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(LWCSystemEnd value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(LWCModelElement)
	 * @see LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage#getLWCSourceExhaustStart_ToElement()
	 * @model
	 * @generated
	 */
	LWCModelElement getToElement();

	/**
	 * Sets the value of the '{@link LanguageWorkbenchCompetition.LWCSourceExhaustStart#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(LWCModelElement value);

} // LWCSourceExhaustStart
