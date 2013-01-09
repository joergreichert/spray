/**
 */
package org.eclipselabs.spray.shapes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connection Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getConnectionStyle()
 * @model
 * @generated
 */
public enum ConnectionStyle implements Enumerator
{
	/**
     * The '<em><b>Freeform</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FREEFORM_VALUE
     * @generated
     * @ordered
     */
	FREEFORM(0, "freeform", "freeform"),

	/**
     * The '<em><b>Manhatten</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MANHATTEN_VALUE
     * @generated
     * @ordered
     */
	MANHATTEN(1, "manhatten", "manhatten");

	/**
     * The '<em><b>Freeform</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Freeform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FREEFORM
     * @model name="freeform"
     * @generated
     * @ordered
     */
	public static final int FREEFORM_VALUE = 0;

	/**
     * The '<em><b>Manhatten</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manhatten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #MANHATTEN
     * @model name="manhatten"
     * @generated
     * @ordered
     */
	public static final int MANHATTEN_VALUE = 1;

	/**
     * An array of all the '<em><b>Connection Style</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ConnectionStyle[] VALUES_ARRAY =
		new ConnectionStyle[] {
            FREEFORM,
            MANHATTEN,
        };

	/**
     * A public read-only list of all the '<em><b>Connection Style</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ConnectionStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Connection Style</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ConnectionStyle get(String literal)
	{
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ConnectionStyle result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Connection Style</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ConnectionStyle getByName(String name)
	{
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ConnectionStyle result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Connection Style</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ConnectionStyle get(int value)
	{
        switch (value) {
            case FREEFORM_VALUE: return FREEFORM;
            case MANHATTEN_VALUE: return MANHATTEN;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private ConnectionStyle(int value, String name, String literal)
	{
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue()
	{
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName()
	{
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral()
	{
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString()
	{
        return literal;
    }
	
} //ConnectionStyle
