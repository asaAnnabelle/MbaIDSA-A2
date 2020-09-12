/**
 */
package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Studylevel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see assignment.AssignmentPackage#getStudylevel()
 * @model
 * @generated
 */
public enum Studylevel implements Enumerator {
	/**
	 * The '<em><b>Firstlevel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTLEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	FIRSTLEVEL(0, "firstlevel", "1stlevel"),

	/**
	 * The '<em><b>Secondlevel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDLEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDLEVEL(1, "secondlevel", "2stlevel"),

	/**
	 * The '<em><b>Thirdstlevel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRDSTLEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	THIRDSTLEVEL(2, "thirdstlevel", "3stlevel"),

	/**
	 * The '<em><b>Higherlevel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHERLEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHERLEVEL(3, "higherlevel", "higher level");

	/**
	 * The '<em><b>Firstlevel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTLEVEL
	 * @model name="firstlevel" literal="1stlevel"
	 * @generated
	 * @ordered
	 */
	public static final int FIRSTLEVEL_VALUE = 0;

	/**
	 * The '<em><b>Secondlevel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDLEVEL
	 * @model name="secondlevel" literal="2stlevel"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDLEVEL_VALUE = 1;

	/**
	 * The '<em><b>Thirdstlevel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRDSTLEVEL
	 * @model name="thirdstlevel" literal="3stlevel"
	 * @generated
	 * @ordered
	 */
	public static final int THIRDSTLEVEL_VALUE = 2;

	/**
	 * The '<em><b>Higherlevel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHERLEVEL
	 * @model name="higherlevel" literal="higher level"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHERLEVEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Studylevel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Studylevel[] VALUES_ARRAY =
		new Studylevel[] {
			FIRSTLEVEL,
			SECONDLEVEL,
			THIRDSTLEVEL,
			HIGHERLEVEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Studylevel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Studylevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Studylevel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Studylevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Studylevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Studylevel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Studylevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Studylevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Studylevel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Studylevel get(int value) {
		switch (value) {
			case FIRSTLEVEL_VALUE: return FIRSTLEVEL;
			case SECONDLEVEL_VALUE: return SECONDLEVEL;
			case THIRDSTLEVEL_VALUE: return THIRDSTLEVEL;
			case HIGHERLEVEL_VALUE: return HIGHERLEVEL;
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
	private Studylevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Studylevel
