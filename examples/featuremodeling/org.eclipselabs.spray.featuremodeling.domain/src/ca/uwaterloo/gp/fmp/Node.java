/**
 */
package ca.uwaterloo.gp.fmp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getMax <em>Max</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getMin <em>Min</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getConfs <em>Confs</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getOrigin <em>Origin</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getProperties <em>Properties</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.Node#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Node#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Node#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Confs</b></em>' reference list.
	 * The list contents are of type {@link ca.uwaterloo.gp.fmp.Node}.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Node#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confs</em>' reference list.
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Confs()
	 * @see ca.uwaterloo.gp.fmp.Node#getOrigin
	 * @model type="ca.uwaterloo.gp.fmp.Node" opposite="origin"
	 * @generated
	 */
	EList getConfs();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Node#getConfs <em>Confs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Node)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Origin()
	 * @see ca.uwaterloo.gp.fmp.Node#getConfs
	 * @model opposite="confs"
	 * @generated
	 */
	Node getOrigin();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Node#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Node value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ca.uwaterloo.gp.fmp.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Children()
	 * @model type="ca.uwaterloo.gp.fmp.Node" containment="true"
	 * @generated
	 */
	EList getChildren();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.uwaterloo.gp.fmp.Feature#getDescribedNode <em>Described Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see #setProperties(Feature)
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Properties()
	 * @see ca.uwaterloo.gp.fmp.Feature#getDescribedNode
	 * @model opposite="describedNode"
	 * @generated
	 */
	Feature getProperties();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Node#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Feature value);

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
	 * @see ca.uwaterloo.gp.fmp.FmpPackage#getNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Node
