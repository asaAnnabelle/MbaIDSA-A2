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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment.impl.SpecialisationImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link assignment.impl.SpecialisationImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link assignment.impl.SpecialisationImpl#getStartyear <em>Startyear</em>}</li>
 *   <li>{@link assignment.impl.SpecialisationImpl#getEndyear <em>Endyear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
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
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

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
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.SPECIALISATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SPECIALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (eContainerFeatureID() != AssignmentPackage.SPECIALISATION__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, AssignmentPackage.SPECIALISATION__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != AssignmentPackage.SPECIALISATION__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, AssignmentPackage.PROGRAM__SPECIALISATION, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SPECIALISATION__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectWithInverseResolvingEList<Semester>(Semester.class, this, AssignmentPackage.SPECIALISATION__SEMESTER, AssignmentPackage.SEMESTER__SPECIALISATION);
		}
		return semester;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SPECIALISATION__STARTYEAR, oldStartyear, startyear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SPECIALISATION__ENDYEAR, oldEndyear, endyear));
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
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
			case AssignmentPackage.SPECIALISATION__SEMESTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemester()).basicAdd(otherEnd, msgs);
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
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				return basicSetProgram(null, msgs);
			case AssignmentPackage.SPECIALISATION__SEMESTER:
				return ((InternalEList<?>)getSemester()).basicRemove(otherEnd, msgs);
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
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				return eInternalContainer().eInverseRemove(this, AssignmentPackage.PROGRAM__SPECIALISATION, Program.class, msgs);
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
			case AssignmentPackage.SPECIALISATION__NAME:
				return getName();
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				return getProgram();
			case AssignmentPackage.SPECIALISATION__SEMESTER:
				return getSemester();
			case AssignmentPackage.SPECIALISATION__STARTYEAR:
				return getStartyear();
			case AssignmentPackage.SPECIALISATION__ENDYEAR:
				return getEndyear();
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
			case AssignmentPackage.SPECIALISATION__NAME:
				setName((String)newValue);
				return;
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				setProgram((Program)newValue);
				return;
			case AssignmentPackage.SPECIALISATION__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case AssignmentPackage.SPECIALISATION__STARTYEAR:
				setStartyear((Integer)newValue);
				return;
			case AssignmentPackage.SPECIALISATION__ENDYEAR:
				setEndyear((Integer)newValue);
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
			case AssignmentPackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				setProgram((Program)null);
				return;
			case AssignmentPackage.SPECIALISATION__SEMESTER:
				getSemester().clear();
				return;
			case AssignmentPackage.SPECIALISATION__STARTYEAR:
				setStartyear(STARTYEAR_EDEFAULT);
				return;
			case AssignmentPackage.SPECIALISATION__ENDYEAR:
				setEndyear(ENDYEAR_EDEFAULT);
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
			case AssignmentPackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssignmentPackage.SPECIALISATION__PROGRAM:
				return getProgram() != null;
			case AssignmentPackage.SPECIALISATION__SEMESTER:
				return semester != null && !semester.isEmpty();
			case AssignmentPackage.SPECIALISATION__STARTYEAR:
				return startyear != STARTYEAR_EDEFAULT;
			case AssignmentPackage.SPECIALISATION__ENDYEAR:
				return endyear != ENDYEAR_EDEFAULT;
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
		result.append(", startyear: ");
		result.append(startyear);
		result.append(", endyear: ");
		result.append(endyear);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
