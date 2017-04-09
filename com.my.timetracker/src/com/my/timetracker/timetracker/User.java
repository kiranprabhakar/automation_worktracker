/**
 */
package com.my.timetracker.timetracker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.my.timetracker.timetracker.User#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see com.my.timetracker.timetracker.TimetrackerPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.my.timetracker.timetracker.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see com.my.timetracker.timetracker.TimetrackerPackage#getUser_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

} // User
