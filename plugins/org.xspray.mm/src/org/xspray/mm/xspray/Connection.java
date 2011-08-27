/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.Connection#getFrom <em>From</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Connection#getTo <em>To</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Connection#getFromLabel <em>From Label</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Connection#getToLabel <em>To Label</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Connection#getConnectionLabel <em>Connection Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Shape {
	/**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(String)
     * @see org.xspray.mm.xspray.XsprayPackage#getConnection_From()
     * @model
     * @generated
     */
	String getFrom();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Connection#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
	void setFrom(String value);

	/**
     * Returns the value of the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' attribute.
     * @see #setTo(String)
     * @see org.xspray.mm.xspray.XsprayPackage#getConnection_To()
     * @model
     * @generated
     */
	String getTo();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Connection#getTo <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' attribute.
     * @see #getTo()
     * @generated
     */
	void setTo(String value);

	/**
     * Returns the value of the '<em><b>From Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>From Label</em>' containment reference.
     * @see #setFromLabel(Text)
     * @see org.xspray.mm.xspray.XsprayPackage#getConnection_FromLabel()
     * @model containment="true"
     * @generated
     */
	Text getFromLabel();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Connection#getFromLabel <em>From Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Label</em>' containment reference.
     * @see #getFromLabel()
     * @generated
     */
    void setFromLabel(Text value);

    /**
     * Returns the value of the '<em><b>To Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To Label</em>' containment reference.
     * @see #setToLabel(Text)
     * @see org.xspray.mm.xspray.XsprayPackage#getConnection_ToLabel()
     * @model containment="true"
     * @generated
     */
	Text getToLabel();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Connection#getToLabel <em>To Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Label</em>' containment reference.
     * @see #getToLabel()
     * @generated
     */
    void setToLabel(Text value);

    /**
     * Returns the value of the '<em><b>Connection Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Label</em>' containment reference.
     * @see #setConnectionLabel(Text)
     * @see org.xspray.mm.xspray.XsprayPackage#getConnection_ConnectionLabel()
     * @model containment="true"
     * @generated
     */
	Text getConnectionLabel();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Connection#getConnectionLabel <em>Connection Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Label</em>' containment reference.
     * @see #getConnectionLabel()
     * @generated
     */
    void setConnectionLabel(Text value);

} // Connection
