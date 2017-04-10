/**
 */
package com.my.timetracker.timetracker;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.my.timetracker.timetracker.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.Task#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.Task#getEndsTime <em>Ends Time</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.Task#getTask <em>Task</em>}</li>
 *   <li>{@link com.my.timetracker.timetracker.Task#getEstimatedTime <em>Estimated Time</em>}</li>
 * </ul>
 *
 * @see com.my.timetracker.timetracker.TimetrackerPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.my.timetracker.timetracker.TimetrackerPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.my.timetracker.timetracker.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see com.my.timetracker.timetracker.TimetrackerPackage#getTask_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link com.my.timetracker.timetracker.Task#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Ends Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends Time</em>' attribute.
	 * @see #setEndsTime(Date)
	 * @see com.my.timetracker.timetracker.TimetrackerPackage#getTask_EndsTime()
	 * @model
	 * @generated
	 */
	Date getEndsTime();

	/**
	 * Sets the value of the '{@link com.my.timetracker.timetracker.Task#getEndsTime <em>Ends Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends Time</em>' attribute.
	 * @see #getEndsTime()
	 * @generated
	 */
	void setEndsTime(Date value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see com.my.timetracker.timetracker.TimetrackerPackage#getTask_Task()
	 * @model
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link com.my.timetracker.timetracker.Task#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Time</em>' attribute.
	 * @see #setEstimatedTime(String)
	 * @see com.my.timetracker.timetracker.TimetrackerPackage#getTask_EstimatedTime()
	 * @model
	 * @generated
	 */
	String getEstimatedTime();

	/**
	 * Sets the value of the '{@link com.my.timetracker.timetracker.Task#getEstimatedTime <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Time</em>' attribute.
	 * @see #getEstimatedTime()
	 * @generated
	 */
	void setEstimatedTime(String value);

} // Task
