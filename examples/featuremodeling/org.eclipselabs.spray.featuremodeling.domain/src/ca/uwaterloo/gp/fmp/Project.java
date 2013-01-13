/**
 */
package ca.uwaterloo.gp.fmp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.Project#getModel <em>Model</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Project#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Project#getMetaMetaModel <em>Meta Meta Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(Feature)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getProject_Model()
	 * @model containment="true"
	 * @generated
	 */
	Feature getModel();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Project#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Feature value);

	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' containment reference.
	 * @see #setMetaModel(Feature)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getProject_MetaModel()
	 * @model containment="true"
	 * @generated
	 */
	Feature getMetaModel();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Project#getMetaModel <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' containment reference.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(Feature value);

	/**
	 * Returns the value of the '<em><b>Meta Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Meta Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Meta Model</em>' containment reference.
	 * @see #setMetaMetaModel(Feature)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getProject_MetaMetaModel()
	 * @model containment="true"
	 * @generated
	 */
	Feature getMetaMetaModel();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Project#getMetaMetaModel <em>Meta Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Meta Model</em>' containment reference.
	 * @see #getMetaMetaModel()
	 * @generated
	 */
	void setMetaMetaModel(Feature value);

} // Project
