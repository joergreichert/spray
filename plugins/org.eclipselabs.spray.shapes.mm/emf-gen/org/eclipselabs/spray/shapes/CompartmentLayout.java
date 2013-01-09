/**
 */
package org.eclipselabs.spray.shapes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compartment Layout</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getCompartmentLayout()
 * @model
 * @generated
 */
public enum CompartmentLayout implements Enumerator
{
	/**
     * The '<em><b>FIXED</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FIXED_VALUE
     * @generated
     * @ordered
     */
	FIXED(0, "FIXED", "fixed"),

	/**
     * The '<em><b>VERTICAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #VERTICAL_VALUE
     * @generated
     * @ordered
     */
	VERTICAL(1, "VERTICAL", "vertical"),

	/**
     * The '<em><b>HORIZONTAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #HORIZONTAL_VALUE
     * @generated
     * @ordered
     */
	HORIZONTAL(2, "HORIZONTAL", "horizontal"), /**
     * The '<em><b>FIT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIT_VALUE
     * @generated
     * @ordered
     */
    FIT(3, "FIT", "fit");

	/**
     * The '<em><b>FIXED</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIXED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FIXED
     * @model literal="fixed"
     * @generated
     * @ordered
     */
	public static final int FIXED_VALUE = 0;

	/**
     * The '<em><b>VERTICAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #VERTICAL
     * @model literal="vertical"
     * @generated
     * @ordered
     */
	public static final int VERTICAL_VALUE = 1;

	/**
     * The '<em><b>HORIZONTAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #HORIZONTAL
     * @model literal="horizontal"
     * @generated
     * @ordered
     */
	public static final int HORIZONTAL_VALUE = 2;

	/**
     * The '<em><b>FIT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FIT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIT
     * @model literal="fit"
     * @generated
     * @ordered
     */
    public static final int FIT_VALUE = 3;

    /**
     * An array of all the '<em><b>Compartment Layout</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final CompartmentLayout[] VALUES_ARRAY =
		new CompartmentLayout[] {
            FIXED,
            VERTICAL,
            HORIZONTAL,
            FIT,
        };

	/**
     * A public read-only list of all the '<em><b>Compartment Layout</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<CompartmentLayout> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Compartment Layout</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CompartmentLayout get(String literal)
	{
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CompartmentLayout result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Compartment Layout</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CompartmentLayout getByName(String name)
	{
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CompartmentLayout result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Compartment Layout</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CompartmentLayout get(int value)
	{
        switch (value) {
            case FIXED_VALUE: return FIXED;
            case VERTICAL_VALUE: return VERTICAL;
            case HORIZONTAL_VALUE: return HORIZONTAL;
            case FIT_VALUE: return FIT;
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
	private CompartmentLayout(int value, String name, String literal)
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
	
} //CompartmentLayout
