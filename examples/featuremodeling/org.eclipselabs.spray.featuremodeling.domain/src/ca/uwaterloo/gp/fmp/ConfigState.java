/**
 */
package ca.uwaterloo.gp.fmp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Config State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.uwaterloo.gp.fmp.FmpPackage#getConfigState()
 * @model
 * @generated
 */
public final class ConfigState extends AbstractEnumerator {
	/**
	 * The '<em><b>USER SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_SELECTED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_SELECTED = 1;

	/**
	 * The '<em><b>USER ELIMINATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER ELIMINATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_ELIMINATED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_ELIMINATED = 2;

	/**
	 * The '<em><b>MACHINE SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MACHINE SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACHINE_SELECTED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MACHINE_SELECTED = 3;

	/**
	 * The '<em><b>MACHINE ELIMINATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MACHINE ELIMINATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACHINE_ELIMINATED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MACHINE_ELIMINATED = 4;

	/**
	 * The '<em><b>UNDECIDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDECIDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDECIDED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDECIDED = 5;

	/**
	 * The '<em><b>USER SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_SELECTED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState USER_SELECTED_LITERAL = new ConfigState(USER_SELECTED, "USER_SELECTED", "USER_SELECTED");

	/**
	 * The '<em><b>USER ELIMINATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_ELIMINATED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState USER_ELIMINATED_LITERAL = new ConfigState(USER_ELIMINATED, "USER_ELIMINATED", "USER_ELIMINATED");

	/**
	 * The '<em><b>MACHINE SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACHINE_SELECTED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState MACHINE_SELECTED_LITERAL = new ConfigState(MACHINE_SELECTED, "MACHINE_SELECTED", "MACHINE_SELECTED");

	/**
	 * The '<em><b>MACHINE ELIMINATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACHINE_ELIMINATED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState MACHINE_ELIMINATED_LITERAL = new ConfigState(MACHINE_ELIMINATED, "MACHINE_ELIMINATED", "MACHINE_ELIMINATED");

	/**
	 * The '<em><b>UNDECIDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDECIDED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState UNDECIDED_LITERAL = new ConfigState(UNDECIDED, "UNDECIDED", "UNDECIDED");

	/**
	 * An array of all the '<em><b>Config State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConfigState[] VALUES_ARRAY =
		new ConfigState[] {
			USER_SELECTED_LITERAL,
			USER_ELIMINATED_LITERAL,
			MACHINE_SELECTED_LITERAL,
			MACHINE_ELIMINATED_LITERAL,
			UNDECIDED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Config State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Config State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Config State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Config State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigState get(int value) {
		switch (value) {
			case USER_SELECTED: return USER_SELECTED_LITERAL;
			case USER_ELIMINATED: return USER_ELIMINATED_LITERAL;
			case MACHINE_SELECTED: return MACHINE_SELECTED_LITERAL;
			case MACHINE_ELIMINATED: return MACHINE_ELIMINATED_LITERAL;
			case UNDECIDED: return UNDECIDED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConfigState(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConfigState
