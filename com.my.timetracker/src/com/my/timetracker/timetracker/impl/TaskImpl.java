/**
 */
package com.my.timetracker.timetracker.impl;

import com.my.timetracker.timetracker.Task;
import com.my.timetracker.timetracker.TimetrackerPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.my.timetracker.timetracker.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.impl.TaskImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.impl.TaskImpl#getEndsTime <em>Ends Time</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.impl.TaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.impl.TaskImpl#getEstimatedTime <em>Estimated Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndsTime() <em>Ends Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDS_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndsTime() <em>Ends Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsTime()
	 * @generated
	 * @ordered
	 */
	protected Date endsTime = ENDS_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected String task = TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTime()
	 * @generated
	 * @ordered
	 */
	protected String estimatedTime = ESTIMATED_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetrackerPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackerPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackerPackage.TASK__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndsTime() {
		return endsTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndsTime(Date newEndsTime) {
		Date oldEndsTime = endsTime;
		endsTime = newEndsTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackerPackage.TASK__ENDS_TIME, oldEndsTime, endsTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(String newTask) {
		String oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackerPackage.TASK__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstimatedTime() {
		return estimatedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedTime(String newEstimatedTime) {
		String oldEstimatedTime = estimatedTime;
		estimatedTime = newEstimatedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackerPackage.TASK__ESTIMATED_TIME, oldEstimatedTime, estimatedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetrackerPackage.TASK__DESCRIPTION:
				return getDescription();
			case TimetrackerPackage.TASK__START_TIME:
				return getStartTime();
			case TimetrackerPackage.TASK__ENDS_TIME:
				return getEndsTime();
			case TimetrackerPackage.TASK__TASK:
				return getTask();
			case TimetrackerPackage.TASK__ESTIMATED_TIME:
				return getEstimatedTime();
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
			case TimetrackerPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TimetrackerPackage.TASK__START_TIME:
				setStartTime((Date)newValue);
				return;
			case TimetrackerPackage.TASK__ENDS_TIME:
				setEndsTime((Date)newValue);
				return;
			case TimetrackerPackage.TASK__TASK:
				setTask((String)newValue);
				return;
			case TimetrackerPackage.TASK__ESTIMATED_TIME:
				setEstimatedTime((String)newValue);
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
			case TimetrackerPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TimetrackerPackage.TASK__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TimetrackerPackage.TASK__ENDS_TIME:
				setEndsTime(ENDS_TIME_EDEFAULT);
				return;
			case TimetrackerPackage.TASK__TASK:
				setTask(TASK_EDEFAULT);
				return;
			case TimetrackerPackage.TASK__ESTIMATED_TIME:
				setEstimatedTime(ESTIMATED_TIME_EDEFAULT);
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
			case TimetrackerPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TimetrackerPackage.TASK__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case TimetrackerPackage.TASK__ENDS_TIME:
				return ENDS_TIME_EDEFAULT == null ? endsTime != null : !ENDS_TIME_EDEFAULT.equals(endsTime);
			case TimetrackerPackage.TASK__TASK:
				return TASK_EDEFAULT == null ? task != null : !TASK_EDEFAULT.equals(task);
			case TimetrackerPackage.TASK__ESTIMATED_TIME:
				return ESTIMATED_TIME_EDEFAULT == null ? estimatedTime != null : !ESTIMATED_TIME_EDEFAULT.equals(estimatedTime);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endsTime: ");
		result.append(endsTime);
		result.append(", task: ");
		result.append(task);
		result.append(", estimatedTime: ");
		result.append(estimatedTime);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
