/**
 */
package assignment.util;

import assignment.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import java.util.*;
/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assignment.AssignmentPackage
 * @generated
 */
public class AssignmentValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssignmentValidator INSTANCE = new AssignmentValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AssignmentPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AssignmentPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case AssignmentPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case AssignmentPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case AssignmentPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case AssignmentPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case AssignmentPackage.STUDYLEVEL:
				return validateStudylevel((Studylevel)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_CourseNeedsACode(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_creditsNeedsToBePositive(course, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CourseNeedsACode constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__COURSE_NEEDS_ACODE__EEXPRESSION = "self.code->notEmpty()";

	/**
	 * Validates the CourseNeedsACode constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_CourseNeedsACode(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssignmentPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "CourseNeedsACode",
				 COURSE__COURSE_NEEDS_ACODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the creditsNeedsToBePositive constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__CREDITS_NEEDS_TO_BE_POSITIVE__EEXPRESSION = "self.credits>0.0f";

	/**
	 * Validates the creditsNeedsToBePositive constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_creditsNeedsToBePositive(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssignmentPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "creditsNeedsToBePositive",
				 COURSE__CREDITS_NEEDS_TO_BE_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(department, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(department, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(department, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartment_ProgramNeedsToBeUnique(department, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartment_CourseNeedsToBeUnique(department, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProgramNeedsToBeUnique constraint of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDepartment_ProgramNeedsToBeUnique(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean unique = true; 
		List<Program> programs = department.getPrograms();
		
		for(int i = 0; i < programs.size(); i ++) {
			for(int x = i; x < programs.size(); x++) {
				if((programs.get(i).getCode().equals(programs.get(x).getCode()))){
					unique = false;
					break;
				}
			}
			if(!unique) break;
		}
		
		if (unique) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ProgramNeedsToBeUnique", getObjectLabel(department, context) },
						 new Object[] { department },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CourseNeedsToBeUnique constraint of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDepartment_CourseNeedsToBeUnique(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean unique = true; 
		for(int i = 0; i < department.getCourse().size(); i ++) {
			for(int x = i; x < department.getCourse().size(); x++) {
				if(department.getCourse().get(i).getCode().equals(department.getCourse().get(x).getCode())){
					unique = false;
					break;
				}
			}
			if(!unique) break;
		}
		
		if (unique) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CourseNeedsToBeUnique", getObjectLabel(department, context) },
						 new Object[] { department },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(program, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_ProgramStartyearAndEndyearMustBeValid(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_LengthOfProgramInYearsMustBePositive(program, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProgramStartyearAndEndyearMustBeValid constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM__PROGRAM_STARTYEAR_AND_ENDYEAR_MUST_BE_VALID__EEXPRESSION = "self.endyear > self.startyear or self.endyear = 0";

	/**
	 * Validates the ProgramStartyearAndEndyearMustBeValid constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_ProgramStartyearAndEndyearMustBeValid(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssignmentPackage.Literals.PROGRAM,
				 program,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "ProgramStartyearAndEndyearMustBeValid",
				 PROGRAM__PROGRAM_STARTYEAR_AND_ENDYEAR_MUST_BE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LengthOfProgramInYearsMustBePositive constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM__LENGTH_OF_PROGRAM_IN_YEARS_MUST_BE_POSITIVE__EEXPRESSION = "self.lengthOfProgramInyears>0";

	/**
	 * Validates the LengthOfProgramInYearsMustBePositive constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_LengthOfProgramInYearsMustBePositive(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssignmentPackage.Literals.PROGRAM,
				 program,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "LengthOfProgramInYearsMustBePositive",
				 PROGRAM__LENGTH_OF_PROGRAM_IN_YEARS_MUST_BE_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_SemesterStartyearAndEndyearMustBeValid(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_NumberOfCreditsInASemesterMustBeValid(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SemesterStartyearAndEndyearMustBeValid constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__SEMESTER_STARTYEAR_AND_ENDYEAR_MUST_BE_VALID__EEXPRESSION = "self.endyear > self.startyear or self.endyear = 0";

	/**
	 * Validates the SemesterStartyearAndEndyearMustBeValid constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_SemesterStartyearAndEndyearMustBeValid(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssignmentPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "SemesterStartyearAndEndyearMustBeValid",
				 SEMESTER__SEMESTER_STARTYEAR_AND_ENDYEAR_MUST_BE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the NumberOfCreditsInASemesterMustBeValid constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_NumberOfCreditsInASemesterMustBeValid(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		float totalCredits = 0;
		float mandatoryCredits = 0;
		float selectableCredits = 0;
		for(int i=0; i <semester.getMandatoryCourse().size(); i++) {
			mandatoryCredits += semester.getMandatoryCourse().get(i).getCredits();
		}
		for(int x=0; x <semester.getMandatoryCourse().size(); x++) {
			selectableCredits += semester.getSelectableCourse().get(x).getCredits();
		}
		totalCredits = mandatoryCredits + selectableCredits;
		
		if (totalCredits<30 | mandatoryCredits>30 ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NumberOfCreditsInASemesterMustBeValid", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialisation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialisation_SpesialisationStartyearAndEndyearMustBeValid(specialisation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SpesialisationStartyearAndEndyearMustBeValid constraint of '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIALISATION__SPESIALISATION_STARTYEAR_AND_ENDYEAR_MUST_BE_VALID__EEXPRESSION = "self.endyear > self.startyear or self.endyear = 0";

	/**
	 * Validates the SpesialisationStartyearAndEndyearMustBeValid constraint of '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation_SpesialisationStartyearAndEndyearMustBeValid(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssignmentPackage.Literals.SPECIALISATION,
				 specialisation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "SpesialisationStartyearAndEndyearMustBeValid",
				 SPECIALISATION__SPESIALISATION_STARTYEAR_AND_ENDYEAR_MUST_BE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudylevel(Studylevel studylevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AssignmentValidator
