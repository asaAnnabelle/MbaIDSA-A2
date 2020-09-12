/**
 */
package assignment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment.AssignmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0 http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface AssignmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/assignment1/model/assignment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignmentPackage eINSTANCE = assignment.impl.AssignmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.impl.CourseImpl
	 * @see assignment.impl.AssignmentPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Studylevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDYLEVEL = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.impl.DepartmentImpl
	 * @see assignment.impl.AssignmentPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMS = 1;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.impl.ProgramImpl
	 * @see assignment.impl.AssignmentPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALISATION = 1;

	/**
	 * The feature id for the '<em><b>Length Of Program Inyears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LENGTH_OF_PROGRAM_INYEARS = 2;

	/**
	 * The feature id for the '<em><b>Semseters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMSETERS = 3;

	/**
	 * The feature id for the '<em><b>Startyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STARTYEAR = 4;

	/**
	 * The feature id for the '<em><b>Endyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ENDYEAR = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CODE = 6;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.impl.SemesterImpl
	 * @see assignment.impl.AssignmentPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Semesternr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTERNR = 0;

	/**
	 * The feature id for the '<em><b>Selectable Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SELECTABLE_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Mandatory Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY_COURSE = 2;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALISATION = 3;

	/**
	 * The feature id for the '<em><b>Startyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__STARTYEAR = 4;

	/**
	 * The feature id for the '<em><b>Endyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ENDYEAR = 5;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAM = 6;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.impl.SpecialisationImpl
	 * @see assignment.impl.AssignmentPackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Startyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__STARTYEAR = 3;

	/**
	 * The feature id for the '<em><b>Endyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__ENDYEAR = 4;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.Studylevel <em>Studylevel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.Studylevel
	 * @see assignment.impl.AssignmentPackageImpl#getStudylevel()
	 * @generated
	 */
	int STUDYLEVEL = 5;


	/**
	 * Returns the meta object for class '{@link assignment.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see assignment.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see assignment.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Course#getStudylevel <em>Studylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studylevel</em>'.
	 * @see assignment.Course#getStudylevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Studylevel();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see assignment.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for class '{@link assignment.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see assignment.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.Department#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see assignment.Department#getCourse()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.Department#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see assignment.Department#getPrograms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programs();

	/**
	 * Returns the meta object for class '{@link assignment.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see assignment.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.Program#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisation</em>'.
	 * @see assignment.Program#getSpecialisation()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specialisation();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Program#getLengthOfProgramInyears <em>Length Of Program Inyears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Of Program Inyears</em>'.
	 * @see assignment.Program#getLengthOfProgramInyears()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_LengthOfProgramInyears();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.Program#getSemseters <em>Semseters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semseters</em>'.
	 * @see assignment.Program#getSemseters()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Semseters();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Program#getStartyear <em>Startyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startyear</em>'.
	 * @see assignment.Program#getStartyear()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Startyear();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Program#getEndyear <em>Endyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endyear</em>'.
	 * @see assignment.Program#getEndyear()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Endyear();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Program#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see assignment.Program#getCode()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Code();

	/**
	 * Returns the meta object for class '{@link assignment.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see assignment.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Semester#getSemesternr <em>Semesternr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semesternr</em>'.
	 * @see assignment.Semester#getSemesternr()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Semesternr();

	/**
	 * Returns the meta object for the reference list '{@link assignment.Semester#getSelectableCourse <em>Selectable Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectable Course</em>'.
	 * @see assignment.Semester#getSelectableCourse()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_SelectableCourse();

	/**
	 * Returns the meta object for the reference list '{@link assignment.Semester#getMandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Course</em>'.
	 * @see assignment.Semester#getMandatoryCourse()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_MandatoryCourse();

	/**
	 * Returns the meta object for the reference '{@link assignment.Semester#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialisation</em>'.
	 * @see assignment.Semester#getSpecialisation()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialisation();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Semester#getStartyear <em>Startyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startyear</em>'.
	 * @see assignment.Semester#getStartyear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Startyear();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Semester#getEndyear <em>Endyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endyear</em>'.
	 * @see assignment.Semester#getEndyear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Endyear();

	/**
	 * Returns the meta object for the container reference '{@link assignment.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see assignment.Semester#getProgram()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Program();

	/**
	 * Returns the meta object for class '{@link assignment.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see assignment.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the container reference '{@link assignment.Specialisation#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see assignment.Specialisation#getProgram()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Program();

	/**
	 * Returns the meta object for the reference list '{@link assignment.Specialisation#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semester</em>'.
	 * @see assignment.Specialisation#getSemester()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Semester();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Specialisation#getStartyear <em>Startyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startyear</em>'.
	 * @see assignment.Specialisation#getStartyear()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Startyear();

	/**
	 * Returns the meta object for the attribute '{@link assignment.Specialisation#getEndyear <em>Endyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endyear</em>'.
	 * @see assignment.Specialisation#getEndyear()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Endyear();

	/**
	 * Returns the meta object for enum '{@link assignment.Studylevel <em>Studylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Studylevel</em>'.
	 * @see assignment.Studylevel
	 * @generated
	 */
	EEnum getStudylevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssignmentFactory getAssignmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.impl.CourseImpl
		 * @see assignment.impl.AssignmentPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Studylevel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUDYLEVEL = eINSTANCE.getCourse_Studylevel();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '{@link assignment.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.impl.DepartmentImpl
		 * @see assignment.impl.AssignmentPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSE = eINSTANCE.getDepartment_Course();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMS = eINSTANCE.getDepartment_Programs();

		/**
		 * The meta object literal for the '{@link assignment.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.impl.ProgramImpl
		 * @see assignment.impl.AssignmentPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALISATION = eINSTANCE.getProgram_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Length Of Program Inyears</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__LENGTH_OF_PROGRAM_INYEARS = eINSTANCE.getProgram_LengthOfProgramInyears();

		/**
		 * The meta object literal for the '<em><b>Semseters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SEMSETERS = eINSTANCE.getProgram_Semseters();

		/**
		 * The meta object literal for the '<em><b>Startyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__STARTYEAR = eINSTANCE.getProgram_Startyear();

		/**
		 * The meta object literal for the '<em><b>Endyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ENDYEAR = eINSTANCE.getProgram_Endyear();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CODE = eINSTANCE.getProgram_Code();

		/**
		 * The meta object literal for the '{@link assignment.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.impl.SemesterImpl
		 * @see assignment.impl.AssignmentPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semesternr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTERNR = eINSTANCE.getSemester_Semesternr();

		/**
		 * The meta object literal for the '<em><b>Selectable Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SELECTABLE_COURSE = eINSTANCE.getSemester_SelectableCourse();

		/**
		 * The meta object literal for the '<em><b>Mandatory Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY_COURSE = eINSTANCE.getSemester_MandatoryCourse();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALISATION = eINSTANCE.getSemester_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Startyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__STARTYEAR = eINSTANCE.getSemester_Startyear();

		/**
		 * The meta object literal for the '<em><b>Endyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__ENDYEAR = eINSTANCE.getSemester_Endyear();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAM = eINSTANCE.getSemester_Program();

		/**
		 * The meta object literal for the '{@link assignment.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.impl.SpecialisationImpl
		 * @see assignment.impl.AssignmentPackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__PROGRAM = eINSTANCE.getSpecialisation_Program();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTER = eINSTANCE.getSpecialisation_Semester();

		/**
		 * The meta object literal for the '<em><b>Startyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__STARTYEAR = eINSTANCE.getSpecialisation_Startyear();

		/**
		 * The meta object literal for the '<em><b>Endyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__ENDYEAR = eINSTANCE.getSpecialisation_Endyear();

		/**
		 * The meta object literal for the '{@link assignment.Studylevel <em>Studylevel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.Studylevel
		 * @see assignment.impl.AssignmentPackageImpl#getStudylevel()
		 * @generated
		 */
		EEnum STUDYLEVEL = eINSTANCE.getStudylevel();

	}

} //AssignmentPackage
