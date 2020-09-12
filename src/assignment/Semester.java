/**
 */
package assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.Semester#getSemesternr <em>Semesternr</em>}</li>
 *   <li>{@link assignment.Semester#getSelectableCourse <em>Selectable Course</em>}</li>
 *   <li>{@link assignment.Semester#getMandatoryCourse <em>Mandatory Course</em>}</li>
 *   <li>{@link assignment.Semester#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link assignment.Semester#getStartyear <em>Startyear</em>}</li>
 *   <li>{@link assignment.Semester#getEndyear <em>Endyear</em>}</li>
 *   <li>{@link assignment.Semester#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see assignment.AssignmentPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SemesterStartyearAndEndyearMustBeValid NumberOfCreditsInASemesterMustBeValid'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 SemesterStartyearAndEndyearMustBeValid='self.endyear &gt; self.startyear or self.endyear = 0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesternr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesternr</em>' attribute.
	 * @see #setSemesternr(int)
	 * @see assignment.AssignmentPackage#getSemester_Semesternr()
	 * @model
	 * @generated
	 */
	int getSemesternr();

	/**
	 * Sets the value of the '{@link assignment.Semester#getSemesternr <em>Semesternr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semesternr</em>' attribute.
	 * @see #getSemesternr()
	 * @generated
	 */
	void setSemesternr(int value);

	/**
	 * Returns the value of the '<em><b>Selectable Course</b></em>' reference list.
	 * The list contents are of type {@link assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable Course</em>' reference list.
	 * @see assignment.AssignmentPackage#getSemester_SelectableCourse()
	 * @model
	 * @generated
	 */
	EList<Course> getSelectableCourse();

	/**
	 * Returns the value of the '<em><b>Mandatory Course</b></em>' reference list.
	 * The list contents are of type {@link assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Course</em>' reference list.
	 * @see assignment.AssignmentPackage#getSemester_MandatoryCourse()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatoryCourse();

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link assignment.Specialisation#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see assignment.AssignmentPackage#getSemester_Specialisation()
	 * @see assignment.Specialisation#getSemester
	 * @model opposite="semester"
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link assignment.Semester#getSpecialisation <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Startyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startyear</em>' attribute.
	 * @see #setStartyear(int)
	 * @see assignment.AssignmentPackage#getSemester_Startyear()
	 * @model
	 * @generated
	 */
	int getStartyear();

	/**
	 * Sets the value of the '{@link assignment.Semester#getStartyear <em>Startyear</em>}' attribute.
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
	 * @see assignment.AssignmentPackage#getSemester_Endyear()
	 * @model
	 * @generated
	 */
	int getEndyear();

	/**
	 * Sets the value of the '{@link assignment.Semester#getEndyear <em>Endyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endyear</em>' attribute.
	 * @see #getEndyear()
	 * @generated
	 */
	void setEndyear(int value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assignment.Program#getSemseters <em>Semseters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see assignment.AssignmentPackage#getSemester_Program()
	 * @see assignment.Program#getSemseters
	 * @model opposite="semseters" required="true" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link assignment.Semester#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // Semester
