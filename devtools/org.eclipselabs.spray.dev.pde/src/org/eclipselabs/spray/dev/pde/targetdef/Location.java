/**
 */
package org.eclipselabs.spray.dev.pde.targetdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.Location#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.Location#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
    /**
     * Returns the value of the '<em><b>Repository</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repository</em>' containment reference.
     * @see #setRepository(Repository)
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getLocation_Repository()
     * @model containment="true" required="true"
     * @generated
     */
    Repository getRepository();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.dev.pde.targetdef.Location#getRepository <em>Repository</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Repository</em>' containment reference.
     * @see #getRepository()
     * @generated
     */
    void setRepository(Repository value);

    /**
     * Returns the value of the '<em><b>Units</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' containment reference list.
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getLocation_Units()
     * @model containment="true"
     * @generated
     */
    EList<InstallableUnit> getUnits();

} // Location
