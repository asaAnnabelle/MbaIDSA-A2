/**
 */
package assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link assignment.Specialisation#getProgram <em>Program</em>}</li>
 *   <li>{@link assignment.Specialisation#getSemester <em>Semester</em>}</li>
 *   <li>{@link assignment.Specialisation#getStartyear <em>Startyear</em>}</li>
 *   <li>{@link assignment.Specialisation#getEndyear <em>Endyear</em>}</li>
 * </ul>
 *
 * @see assignment.AssignmentPackage#getSpecialisation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SpesialisationStartyearAndEndyearMustBeValid'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 SpesialisationStartyearAndEndyearMustBeValid='self.endyear &gt; self.startyear or self.endyear = 0'"
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment.AssignmentPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assignment.Program#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see assignment.AssignmentPackage#getSpecialisation_Program()
	 * @see assignment.Program#getSpecialisation
	 * @model opposite="specialisation" required="true" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link assignment.Specialisation#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference list.
	 * The list contents are of type {@link assignment.Semester}.
	 * It is bidirectional and its opposite is '{@link assignment.Semester#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference list.
	 * @see assignment.AssignmentPackage#getSpecialisation_Semester()
	 * @see assignment.Semester#getSpecialisation
	 * @model opposite="specialisation"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Startyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startyear</em>' attribute.
	 * @see #setStartyear(int)
	 * @see assignment.AssignmentPackage#getSpecialisation_Startyear()
	 * @model
	 * @generated
	 */
	int getStartyear();

	/**
	 * Sets the value of the '{@link assignment.Specialisation#getStartyear <em>Startyear</em>}' attribute.
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
	 * @see assignment.AssignmentPackage#getSpecialisation_Endyear()
	 * @model
	 * @generated
	 */
	int getEndyear();

	/**
	 * Sets the value of the '{@link assignment.Specialisation#getEndyear <em>Endyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endyear</em>' attribute.
	 * @see #getEndyear()
	 * @generated
	 */
	void setEndyear(int value);

} // Specialisation
