/**
 */
package assignment.impl;

import assignment.AssignmentPackage;
import assignment.Program;
import assignment.Semester;
import assignment.Specialisation;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment.impl.ProgramImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link assignment.impl.ProgramImpl#getLengthOfProgramInyears <em>Length Of Program Inyears</em>}</li>
 *   <li>{@link assignment.impl.ProgramImpl#getSemseters <em>Semseters</em>}</li>
 *   <li>{@link assignment.impl.ProgramImpl#getStartyear <em>Startyear</em>}</li>
 *   <li>{@link assignment.impl.ProgramImpl#getEndyear <em>Endyear</em>}</li>
 *   <li>{@link assignment.impl.ProgramImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisation;

	/**
	 * The default value of the '{@link #getLengthOfProgramInyears() <em>Length Of Program Inyears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthOfProgramInyears()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_OF_PROGRAM_INYEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLengthOfProgramInyears() <em>Length Of Program Inyears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthOfProgramInyears()
	 * @generated
	 * @ordered
	 */
	protected int lengthOfProgramInyears = LENGTH_OF_PROGRAM_INYEARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemseters() <em>Semseters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemseters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semseters;

	/**
	 * The default value of the '{@link #getStartyear() <em>Startyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartyear()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTYEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartyear() <em>Startyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartyear()
	 * @generated
	 * @ordered
	 */
	protected int startyear = STARTYEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndyear() <em>Endyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndyear()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDYEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndyear() <em>Endyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndyear()
	 * @generated
	 * @ordered
	 */
	protected int endyear = ENDYEAR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSpecialisation() {
		if (specialisation == null) {
			specialisation = new EObjectContainmentWithInverseEList<Specialisation>(Specialisation.class, this, AssignmentPackage.PROGRAM__SPECIALISATION, AssignmentPackage.SPECIALISATION__PROGRAM);
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLengthOfProgramInyears() {
		return lengthOfProgramInyears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthOfProgramInyears(int newLengthOfProgramInyears) {
		int oldLengthOfProgramInyears = lengthOfProgramInyears;
		lengthOfProgramInyears = newLengthOfProgramInyears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAM__LENGTH_OF_PROGRAM_INYEARS, oldLengthOfProgramInyears, lengthOfProgramInyears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemseters() {
		if (semseters == null) {
			semseters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, AssignmentPackage.PROGRAM__SEMSETERS, AssignmentPackage.SEMESTER__PROGRAM);
		}
		return semseters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartyear() {
		return startyear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartyear(int newStartyear) {
		int oldStartyear = startyear;
		startyear = newStartyear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAM__STARTYEAR, oldStartyear, startyear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndyear() {
		return endyear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndyear(int newEndyear) {
		int oldEndyear = endyear;
		endyear = newEndyear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAM__ENDYEAR, oldEndyear, endyear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentPackage.PROGRAM__SPECIALISATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialisation()).basicAdd(otherEnd, msgs);
			case AssignmentPackage.PROGRAM__SEMSETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemseters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentPackage.PROGRAM__SPECIALISATION:
				return ((InternalEList<?>)getSpecialisation()).basicRemove(otherEnd, msgs);
			case AssignmentPackage.PROGRAM__SEMSETERS:
				return ((InternalEList<?>)getSemseters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentPackage.PROGRAM__NAME:
				return getName();
			case AssignmentPackage.PROGRAM__SPECIALISATION:
				return getSpecialisation();
			case AssignmentPackage.PROGRAM__LENGTH_OF_PROGRAM_INYEARS:
				return getLengthOfProgramInyears();
			case AssignmentPackage.PROGRAM__SEMSETERS:
				return getSemseters();
			case AssignmentPackage.PROGRAM__STARTYEAR:
				return getStartyear();
			case AssignmentPackage.PROGRAM__ENDYEAR:
				return getEndyear();
			case AssignmentPackage.PROGRAM__CODE:
				return getCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssignmentPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case AssignmentPackage.PROGRAM__SPECIALISATION:
				getSpecialisation().clear();
				getSpecialisation().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case AssignmentPackage.PROGRAM__LENGTH_OF_PROGRAM_INYEARS:
				setLengthOfProgramInyears((Integer)newValue);
				return;
			case AssignmentPackage.PROGRAM__SEMSETERS:
				getSemseters().clear();
				getSemseters().addAll((Collection<? extends Semester>)newValue);
				return;
			case AssignmentPackage.PROGRAM__STARTYEAR:
				setStartyear((Integer)newValue);
				return;
			case AssignmentPackage.PROGRAM__ENDYEAR:
				setEndyear((Integer)newValue);
				return;
			case AssignmentPackage.PROGRAM__CODE:
				setCode((String)newValue);
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
			case AssignmentPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAM__SPECIALISATION:
				getSpecialisation().clear();
				return;
			case AssignmentPackage.PROGRAM__LENGTH_OF_PROGRAM_INYEARS:
				setLengthOfProgramInyears(LENGTH_OF_PROGRAM_INYEARS_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAM__SEMSETERS:
				getSemseters().clear();
				return;
			case AssignmentPackage.PROGRAM__STARTYEAR:
				setStartyear(STARTYEAR_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAM__ENDYEAR:
				setEndyear(ENDYEAR_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAM__CODE:
				setCode(CODE_EDEFAULT);
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
			case AssignmentPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssignmentPackage.PROGRAM__SPECIALISATION:
				return specialisation != null && !specialisation.isEmpty();
			case AssignmentPackage.PROGRAM__LENGTH_OF_PROGRAM_INYEARS:
				return lengthOfProgramInyears != LENGTH_OF_PROGRAM_INYEARS_EDEFAULT;
			case AssignmentPackage.PROGRAM__SEMSETERS:
				return semseters != null && !semseters.isEmpty();
			case AssignmentPackage.PROGRAM__STARTYEAR:
				return startyear != STARTYEAR_EDEFAULT;
			case AssignmentPackage.PROGRAM__ENDYEAR:
				return endyear != ENDYEAR_EDEFAULT;
			case AssignmentPackage.PROGRAM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(", lengthOfProgramInyears: ");
		result.append(lengthOfProgramInyears);
		result.append(", startyear: ");
		result.append(startyear);
		result.append(", endyear: ");
		result.append(endyear);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
