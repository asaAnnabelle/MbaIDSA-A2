/**
 */
package assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.Department#getCourse <em>Course</em>}</li>
 *   <li>{@link assignment.Department#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see assignment.AssignmentPackage#getDepartment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProgramNeedsToBeUnique CourseNeedsToBeUnique'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0"
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see assignment.AssignmentPackage#getDepartment_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see assignment.AssignmentPackage#getDepartment_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

} // Department
