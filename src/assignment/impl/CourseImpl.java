/**
 */
package assignment.impl;

import assignment.AssignmentPackage;
import assignment.Course;
import assignment.Studylevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link assignment.impl.CourseImpl#getStudylevel <em>Studylevel</em>}</li>
 *   <li>{@link assignment.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudylevel() <em>Studylevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudylevel()
	 * @generated
	 * @ordered
	 */
	protected static final Studylevel STUDYLEVEL_EDEFAULT = Studylevel.FIRSTLEVEL;

	/**
	 * The cached value of the '{@link #getStudylevel() <em>Studylevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudylevel()
	 * @generated
	 * @ordered
	 */
	protected Studylevel studylevel = STUDYLEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 7.5;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected double credits = CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.COURSE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Studylevel getStudylevel() {
		return studylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudylevel(Studylevel newStudylevel) {
		Studylevel oldStudylevel = studylevel;
		studylevel = newStudylevel == null ? STUDYLEVEL_EDEFAULT : newStudylevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.COURSE__STUDYLEVEL, oldStudylevel, studylevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(double newCredits) {
		double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentPackage.COURSE__NAME:
				return getName();
			case AssignmentPackage.COURSE__CODE:
				return getCode();
			case AssignmentPackage.COURSE__STUDYLEVEL:
				return getStudylevel();
			case AssignmentPackage.COURSE__CREDITS:
				return getCredits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssignmentPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case AssignmentPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case AssignmentPackage.COURSE__STUDYLEVEL:
				setStudylevel((Studylevel)newValue);
				return;
			case AssignmentPackage.COURSE__CREDITS:
				setCredits((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssignmentPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssignmentPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AssignmentPackage.COURSE__STUDYLEVEL:
				setStudylevel(STUDYLEVEL_EDEFAULT);
				return;
			case AssignmentPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssignmentPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssignmentPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case AssignmentPackage.COURSE__STUDYLEVEL:
				return studylevel != STUDYLEVEL_EDEFAULT;
			case AssignmentPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", studylevel: ");
		result.append(studylevel);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
