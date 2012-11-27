/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.StyleContainer#getStyleContainerElement <em>Style Container Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getStyleContainer()
 * @model
 * @generated
 */
public interface StyleContainer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Style Container Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.spray.styles.StyleContainerElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Container Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Container Element</em>' containment reference list.
	 * @see org.eclipselabs.spray.styles.StylesPackage#getStyleContainer_StyleContainerElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleContainerElement> getStyleContainerElement();

} // StyleContainer
