/**
 */
package assignment.impl;

import assignment.AssignmentPackage;
import assignment.Course;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.impl.SemesterImpl#getSemesternr <em>Semesternr</em>}</li>
 *   <li>{@link assignment.impl.SemesterImpl#getSelectableCourse <em>Selectable Course</em>}</li>
 *   <li>{@link assignment.impl.SemesterImpl#getMandatoryCourse <em>Mandatory Course</em>}</li>
 *   <li>{@link assignment.impl.SemesterImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link assignment.impl.SemesterImpl#getStartyear <em>Startyear</em>}</li>
 *   <li>{@link assignment.impl.SemesterImpl#getEndyear <em>Endyear</em>}</li>
 *   <li>{@link assignment.impl.SemesterImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesternr() <em>Semesternr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesternr()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTERNR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesternr() <em>Semesternr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesternr()
	 * @generated
	 * @ordered
	 */
	protected int semesternr = SEMESTERNR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectableCourse() <em>Selectable Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> selectableCourse;

	/**
	 * The cached value of the '{@link #getMandatoryCourse() <em>Mandatory Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourse;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specialisation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSemesternr() {
		return semesternr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesternr(int newSemesternr) {
		int oldSemesternr = semesternr;
		semesternr = newSemesternr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__SEMESTERNR, oldSemesternr, semesternr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getSelectableCourse() {
		if (selectableCourse == null) {
			selectableCourse = new EObjectResolvingEList<Course>(Course.class, this, AssignmentPackage.SEMESTER__SELECTABLE_COURSE);
		}
		return selectableCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getMandatoryCourse() {
		if (mandatoryCourse == null) {
			mandatoryCourse = new EObjectResolvingEList<Course>(Course.class, this, AssignmentPackage.SEMESTER__MANDATORY_COURSE);
		}
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation getSpecialisation() {
		if (specialisation != null && specialisation.eIsProxy()) {
			InternalEObject oldSpecialisation = (InternalEObject)specialisation;
			specialisation = (Specialisation)eResolveProxy(oldSpecialisation);
			if (specialisation != oldSpecialisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssignmentPackage.SEMESTER__SPECIALISATION, oldSpecialisation, specialisation));
			}
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisation(Specialisation newSpecialisation, NotificationChain msgs) {
		Specialisation oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__SPECIALISATION, oldSpecialisation, newSpecialisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialisation(Specialisation newSpecialisation) {
		if (newSpecialisation != specialisation) {
			NotificationChain msgs = null;
			if (specialisation != null)
				msgs = ((InternalEObject)specialisation).eInverseRemove(this, AssignmentPackage.SPECIALISATION__SEMESTER, Specialisation.class, msgs);
			if (newSpecialisation != null)
				msgs = ((InternalEObject)newSpecialisation).eInverseAdd(this, AssignmentPackage.SPECIALISATION__SEMESTER, Specialisation.class, msgs);
			msgs = basicSetSpecialisation(newSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__SPECIALISATION, newSpecialisation, newSpecialisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__STARTYEAR, oldStartyear, startyear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__ENDYEAR, oldEndyear, endyear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (eContainerFeatureID() != AssignmentPackage.SEMESTER__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, AssignmentPackage.SEMESTER__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != AssignmentPackage.SEMESTER__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, AssignmentPackage.PROGRAM__SEMSETERS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentPackage.SEMESTER__SPECIALISATION:
				if (specialisation != null)
					msgs = ((InternalEObject)specialisation).eInverseRemove(this, AssignmentPackage.SPECIALISATION__SEMESTER, Specialisation.class, msgs);
				return basicSetSpecialisation((Specialisation)otherEnd, msgs);
			case AssignmentPackage.SEMESTER__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
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
			case AssignmentPackage.SEMESTER__SPECIALISATION:
				return basicSetSpecialisation(null, msgs);
			case AssignmentPackage.SEMESTER__PROGRAM:
				return basicSetProgram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AssignmentPackage.SEMESTER__PROGRAM:
				return eInternalContainer().eInverseRemove(this, AssignmentPackage.PROGRAM__SEMSETERS, Program.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentPackage.SEMESTER__SEMESTERNR:
				return getSemesternr();
			case AssignmentPackage.SEMESTER__SELECTABLE_COURSE:
				return getSelectableCourse();
			case AssignmentPackage.SEMESTER__MANDATORY_COURSE:
				return getMandatoryCourse();
			case AssignmentPackage.SEMESTER__SPECIALISATION:
				if (resolve) return getSpecialisation();
				return basicGetSpecialisation();
			case AssignmentPackage.SEMESTER__STARTYEAR:
				return getStartyear();
			case AssignmentPackage.SEMESTER__ENDYEAR:
				return getEndyear();
			case AssignmentPackage.SEMESTER__PROGRAM:
				return getProgram();
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
			case AssignmentPackage.SEMESTER__SEMESTERNR:
				setSemesternr((Integer)newValue);
				return;
			case AssignmentPackage.SEMESTER__SELECTABLE_COURSE:
				getSelectableCourse().clear();
				getSelectableCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case AssignmentPackage.SEMESTER__MANDATORY_COURSE:
				getMandatoryCourse().clear();
				getMandatoryCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case AssignmentPackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
				return;
			case AssignmentPackage.SEMESTER__STARTYEAR:
				setStartyear((Integer)newValue);
				return;
			case AssignmentPackage.SEMESTER__ENDYEAR:
				setEndyear((Integer)newValue);
				return;
			case AssignmentPackage.SEMESTER__PROGRAM:
				setProgram((Program)newValue);
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
			case AssignmentPackage.SEMESTER__SEMESTERNR:
				setSemesternr(SEMESTERNR_EDEFAULT);
				return;
			case AssignmentPackage.SEMESTER__SELECTABLE_COURSE:
				getSelectableCourse().clear();
				return;
			case AssignmentPackage.SEMESTER__MANDATORY_COURSE:
				getMandatoryCourse().clear();
				return;
			case AssignmentPackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)null);
				return;
			case AssignmentPackage.SEMESTER__STARTYEAR:
				setStartyear(STARTYEAR_EDEFAULT);
				return;
			case AssignmentPackage.SEMESTER__ENDYEAR:
				setEndyear(ENDYEAR_EDEFAULT);
				return;
			case AssignmentPackage.SEMESTER__PROGRAM:
				setProgram((Program)null);
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
			case AssignmentPackage.SEMESTER__SEMESTERNR:
				return semesternr != SEMESTERNR_EDEFAULT;
			case AssignmentPackage.SEMESTER__SELECTABLE_COURSE:
				return selectableCourse != null && !selectableCourse.isEmpty();
			case AssignmentPackage.SEMESTER__MANDATORY_COURSE:
				return mandatoryCourse != null && !mandatoryCourse.isEmpty();
			case AssignmentPackage.SEMESTER__SPECIALISATION:
				return specialisation != null;
			case AssignmentPackage.SEMESTER__STARTYEAR:
				return startyear != STARTYEAR_EDEFAULT;
			case AssignmentPackage.SEMESTER__ENDYEAR:
				return endyear != ENDYEAR_EDEFAULT;
			case AssignmentPackage.SEMESTER__PROGRAM:
				return getProgram() != null;
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
		result.append(" (semesternr: ");
		result.append(semesternr);
		result.append(", startyear: ");
		result.append(startyear);
		result.append(", endyear: ");
		result.append(endyear);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
