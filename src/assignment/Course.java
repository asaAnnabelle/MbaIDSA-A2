/**
 */
package assignment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.Course#getName <em>Name</em>}</li>
 *   <li>{@link assignment.Course#getCode <em>Code</em>}</li>
 *   <li>{@link assignment.Course#getStudylevel <em>Studylevel</em>}</li>
 *   <li>{@link assignment.Course#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see assignment.AssignmentPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CourseNeedsACode creditsNeedsToBePositive'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 creditsNeedsToBePositive='self.credits&gt;0.0f' CourseNeedsACode='self.code-&gt;notEmpty()'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment.AssignmentPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see assignment.AssignmentPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link assignment.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Studylevel</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment.Studylevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studylevel</em>' attribute.
	 * @see assignment.Studylevel
	 * @see #setStudylevel(Studylevel)
	 * @see assignment.AssignmentPackage#getCourse_Studylevel()
	 * @model
	 * @generated
	 */
	Studylevel getStudylevel();

	/**
	 * Sets the value of the '{@link assignment.Course#getStudylevel <em>Studylevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studylevel</em>' attribute.
	 * @see assignment.Studylevel
	 * @see #getStudylevel()
	 * @generated
	 */
	void setStudylevel(Studylevel value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see assignment.AssignmentPackage#getCourse_Credits()
	 * @model default="7.5"
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link assignment.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

} // Course
