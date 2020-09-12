/**
 */
package assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.Program#getName <em>Name</em>}</li>
 *   <li>{@link assignment.Program#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link assignment.Program#getLengthOfProgramInyears <em>Length Of Program Inyears</em>}</li>
 *   <li>{@link assignment.Program#getSemseters <em>Semseters</em>}</li>
 *   <li>{@link assignment.Program#getStartyear <em>Startyear</em>}</li>
 *   <li>{@link assignment.Program#getEndyear <em>Endyear</em>}</li>
 *   <li>{@link assignment.Program#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see assignment.AssignmentPackage#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProgramStartyearAndEndyearMustBeValid LengthOfProgramInYearsMustBePositive'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 ProgramStartyearAndEndyearMustBeValid='self.endyear &gt; self.startyear or self.endyear = 0' LengthOfProgramInYearsMustBePositive='self.lengthOfProgramInyears&gt;0'"
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment.AssignmentPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.Specialisation}.
	 * It is bidirectional and its opposite is '{@link assignment.Specialisation#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' containment reference list.
	 * @see assignment.AssignmentPackage#getProgram_Specialisation()
	 * @see assignment.Specialisation#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisation();

	/**
	 * Returns the value of the '<em><b>Length Of Program Inyears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Of Program Inyears</em>' attribute.
	 * @see #setLengthOfProgramInyears(int)
	 * @see assignment.AssignmentPackage#getProgram_LengthOfProgramInyears()
	 * @model
	 * @generated
	 */
	int getLengthOfProgramInyears();

	/**
	 * Sets the value of the '{@link assignment.Program#getLengthOfProgramInyears <em>Length Of Program Inyears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Of Program Inyears</em>' attribute.
	 * @see #getLengthOfProgramInyears()
	 * @generated
	 */
	void setLengthOfProgramInyears(int value);

	/**
	 * Returns the value of the '<em><b>Semseters</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.Semester}.
	 * It is bidirectional and its opposite is '{@link assignment.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semseters</em>' containment reference list.
	 * @see assignment.AssignmentPackage#getProgram_Semseters()
	 * @see assignment.Semester#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Semester> getSemseters();

	/**
	 * Returns the value of the '<em><b>Startyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startyear</em>' attribute.
	 * @see #setStartyear(int)
	 * @see assignment.AssignmentPackage#getProgram_Startyear()
	 * @model
	 * @generated
	 */
	int getStartyear();

	/**
	 * Sets the value of the '{@link assignment.Program#getStartyear <em>Startyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startyear</em>' attribute.
	 * @see #getStartyear()
	 * @generated
	 */
	void setStartyear(int value);

	/**
	 * Returns the value of the '<em><b>Endyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endyear</em>' attribute.
	 * @see #setEndyear(int)
	 * @see assignment.AssignmentPackage#getProgram_Endyear()
	 * @model
	 * @generated
	 */
	int getEndyear();

	/**
	 * Sets the value of the '{@link assignment.Program#getEndyear <em>Endyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endyear</em>' attribute.
	 * @see #getEndyear()
	 * @generated
	 */
	void setEndyear(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see assignment.AssignmentPackage#getProgram_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link assignment.Program#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Program
