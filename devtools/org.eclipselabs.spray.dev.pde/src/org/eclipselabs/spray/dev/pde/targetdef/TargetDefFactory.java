/**
 */
package org.eclipselabs.spray.dev.pde.targetdef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage
 * @generated
 */
public interface TargetDefFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TargetDefFactory eINSTANCE = org.eclipselabs.spray.dev.pde.targetdef.impl.TargetDefFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Target Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Target Definition</em>'.
     * @generated
     */
    TargetDefinition createTargetDefinition();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    Location createLocation();

    /**
     * Returns a new object of class '<em>Repository</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repository</em>'.
     * @generated
     */
    Repository createRepository();

    /**
     * Returns a new object of class '<em>Installable Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Installable Unit</em>'.
     * @generated
     */
    InstallableUnit createInstallableUnit();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TargetDefPackage getTargetDefPackage();

} //TargetDefFactory
