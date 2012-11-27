/**
 */
package org.eclipselabs.spray.styles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Constants</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.styles.StylesPackage#getColorConstants()
 * @model
 * @generated
 */
public enum ColorConstants implements Enumerator
{
	/**
	 * The '<em><b>WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(0, "WHITE", "white"),

	/**
	 * The '<em><b>LIGHT LIGHT GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_LIGHT_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_LIGHT_GRAY(1, "LIGHT_LIGHT_GRAY", "very-light-gray"),

	/**
	 * The '<em><b>LIGHT GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_GRAY(2, "LIGHT_GRAY", "light-gray"),

	/**
	 * The '<em><b>GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(3, "GRAY", "gray"),

	/**
	 * The '<em><b>DARK GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_GRAY(4, "DARK_GRAY", "dark-gray"),

	/**
	 * The '<em><b>BLACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(5, "BLACK", "black"),

	/**
	 * The '<em><b>RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(6, "RED", "red"),

	/**
	 * The '<em><b>LIGHT ORANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_ORANGE(7, "LIGHT_ORANGE", "light-orange"),

	/**
	 * The '<em><b>ORANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(8, "ORANGE", "orange"),

	/**
	 * The '<em><b>DARK ORANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_ORANGE(9, "DARK_ORANGE", "dark-orange"),

	/**
	 * The '<em><b>YELLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(10, "YELLOW", "yellow"),

	/**
	 * The '<em><b>GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(11, "GREEN", "green"),

	/**
	 * The '<em><b>LIGHT GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_GREEN(12, "LIGHT_GREEN", "light-green"),

	/**
	 * The '<em><b>DARK GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_GREEN(13, "DARK_GREEN", "dark-green"),

	/**
	 * The '<em><b>CYAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	CYAN(14, "CYAN", "cyan"),

	/**
	 * The '<em><b>LIGHT BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_BLUE(15, "LIGHT_BLUE", "light-blue"),

	/**
	 * The '<em><b>BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(16, "BLUE", "blue"),

	/**
	 * The '<em><b>DARK BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_BLUE(17, "DARK_BLUE", "dark-blue"),

	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(18, "NULL", "null");

	/**
	 * The '<em><b>WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model literal="white"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 0;

	/**
	 * The '<em><b>LIGHT LIGHT GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHT LIGHT GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_LIGHT_GRAY
	 * @model literal="very-light-gray"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_LIGHT_GRAY_VALUE = 1;

	/**
	 * The '<em><b>LIGHT GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHT GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GRAY
	 * @model literal="light-gray"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_GRAY_VALUE = 2;

	/**
	 * The '<em><b>GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model literal="gray"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 3;

	/**
	 * The '<em><b>DARK GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DARK GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARK_GRAY
	 * @model literal="dark-gray"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_GRAY_VALUE = 4;

	/**
	 * The '<em><b>BLACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model literal="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 5;

	/**
	 * The '<em><b>RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model literal="red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 6;

	/**
	 * The '<em><b>LIGHT ORANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHT ORANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_ORANGE
	 * @model literal="light-orange"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_ORANGE_VALUE = 7;

	/**
	 * The '<em><b>ORANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model literal="orange"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 8;

	/**
	 * The '<em><b>DARK ORANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DARK ORANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARK_ORANGE
	 * @model literal="dark-orange"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_ORANGE_VALUE = 9;

	/**
	 * The '<em><b>YELLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YELLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model literal="yellow"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 10;

	/**
	 * The '<em><b>GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model literal="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 11;

	/**
	 * The '<em><b>LIGHT GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHT GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GREEN
	 * @model literal="light-green"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_GREEN_VALUE = 12;

	/**
	 * The '<em><b>DARK GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DARK GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARK_GREEN
	 * @model literal="dark-green"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_GREEN_VALUE = 13;

	/**
	 * The '<em><b>CYAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CYAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYAN
	 * @model literal="cyan"
	 * @generated
	 * @ordered
	 */
	public static final int CYAN_VALUE = 14;

	/**
	 * The '<em><b>LIGHT BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHT BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_BLUE
	 * @model literal="light-blue"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_BLUE_VALUE = 15;

	/**
	 * The '<em><b>BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model literal="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 16;

	/**
	 * The '<em><b>DARK BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DARK BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARK_BLUE
	 * @model literal="dark-blue"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_BLUE_VALUE = 17;

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model literal="null"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 18;

	/**
	 * An array of all the '<em><b>Color Constants</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorConstants[] VALUES_ARRAY =
		new ColorConstants[]
		{
			WHITE,
			LIGHT_LIGHT_GRAY,
			LIGHT_GRAY,
			GRAY,
			DARK_GRAY,
			BLACK,
			RED,
			LIGHT_ORANGE,
			ORANGE,
			DARK_ORANGE,
			YELLOW,
			GREEN,
			LIGHT_GREEN,
			DARK_GREEN,
			CYAN,
			LIGHT_BLUE,
			BLUE,
			DARK_BLUE,
			NULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Constants</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColorConstants> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Constants</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorConstants get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			ColorConstants result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Constants</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorConstants getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			ColorConstants result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Constants</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorConstants get(int value)
	{
		switch (value)
		{
			case WHITE_VALUE: return WHITE;
			case LIGHT_LIGHT_GRAY_VALUE: return LIGHT_LIGHT_GRAY;
			case LIGHT_GRAY_VALUE: return LIGHT_GRAY;
			case GRAY_VALUE: return GRAY;
			case DARK_GRAY_VALUE: return DARK_GRAY;
			case BLACK_VALUE: return BLACK;
			case RED_VALUE: return RED;
			case LIGHT_ORANGE_VALUE: return LIGHT_ORANGE;
			case ORANGE_VALUE: return ORANGE;
			case DARK_ORANGE_VALUE: return DARK_ORANGE;
			case YELLOW_VALUE: return YELLOW;
			case GREEN_VALUE: return GREEN;
			case LIGHT_GREEN_VALUE: return LIGHT_GREEN;
			case DARK_GREEN_VALUE: return DARK_GREEN;
			case CYAN_VALUE: return CYAN;
			case LIGHT_BLUE_VALUE: return LIGHT_BLUE;
			case BLUE_VALUE: return BLUE;
			case DARK_BLUE_VALUE: return DARK_BLUE;
			case NULL_VALUE: return NULL;
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
	private ColorConstants(int value, String name, String literal)
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
	
} //ColorConstants
