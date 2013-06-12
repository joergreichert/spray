/**
 */
package org.eclipselabs.spray.dev.pde.targetdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getInstallableUnit()
 * @model
 * @generated
 */
public interface InstallableUnit extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getInstallableUnit_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getInstallableUnit_Version()
     * @model
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

} // InstallableUnit
