/**
 */
package org.eclipselabs.spray.dev.pde.targetdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.Repository#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getRepository_Location()
     * @model
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.dev.pde.targetdef.Repository#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

} // Repository
