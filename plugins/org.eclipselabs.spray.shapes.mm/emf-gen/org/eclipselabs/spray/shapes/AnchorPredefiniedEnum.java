/**
 */
package org.eclipselabs.spray.shapes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Anchor Predefinied Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getAnchorPredefiniedEnum()
 * @model
 * @generated
 */
public enum AnchorPredefiniedEnum implements Enumerator
{
	/**
     * The '<em><b>Center</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CENTER_VALUE
     * @generated
     * @ordered
     */
	CENTER(0, "center", "center"),

	/**
     * The '<em><b>Corners</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CORNERS_VALUE
     * @generated
     * @ordered
     */
	CORNERS(1, "corners", "corners");

	/**
     * The '<em><b>Center</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CENTER
     * @model name="center"
     * @generated
     * @ordered
     */
	public static final int CENTER_VALUE = 0;

	/**
     * The '<em><b>Corners</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Corners</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CORNERS
     * @model name="corners"
     * @generated
     * @ordered
     */
	public static final int CORNERS_VALUE = 1;

	/**
     * An array of all the '<em><b>Anchor Predefinied Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final AnchorPredefiniedEnum[] VALUES_ARRAY =
		new AnchorPredefiniedEnum[] {
            CENTER,
            CORNERS,
        };

	/**
     * A public read-only list of all the '<em><b>Anchor Predefinied Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<AnchorPredefiniedEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Anchor Predefinied Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static AnchorPredefiniedEnum get(String literal)
	{
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AnchorPredefiniedEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Anchor Predefinied Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static AnchorPredefiniedEnum getByName(String name)
	{
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AnchorPredefiniedEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Anchor Predefinied Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static AnchorPredefiniedEnum get(int value)
	{
        switch (value) {
            case CENTER_VALUE: return CENTER;
            case CORNERS_VALUE: return CORNERS;
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
	private AnchorPredefiniedEnum(int value, String name, String literal)
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
	
} //AnchorPredefiniedEnum
