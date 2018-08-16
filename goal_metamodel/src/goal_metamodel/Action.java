/**
 */
package goal_metamodel;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Action#getRequires <em>Requires</em>}</li>
 *   <li>{@link goal_metamodel.Action#getThread <em>Thread</em>}</li>
 *   <li>{@link goal_metamodel.Action#isResource_enabled <em>Resource enabled</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends GoalNode {
	
	public void set_parent(Task parent);
	
	public Task get_parent();
	
	public HashSet<String> get_exist_node_list();
	
	public HashSet<String> get_non_exist_node_list();
	
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getRequires();

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' attribute.
	 * @see #setThread(int)
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_Thread()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	String getThread();

	/**
	 * Sets the value of the '{@link goal_metamodel.Action#getThread <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' attribute.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(String value);

	/**
	 * Returns the value of the '<em><b>Resource enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource enabled</em>' attribute.
	 * @see #setResource_enabled(boolean)
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_Resource_enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isResource_enabled();

	/**
	 * Sets the value of the '{@link goal_metamodel.Action#isResource_enabled <em>Resource enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource enabled</em>' attribute.
	 * @see #isResource_enabled()
	 * @generated
	 */
	void setResource_enabled(boolean value);
	
	public void setIsParallelAction();
	
	public boolean getIsParallelAction();
	
	public void setNegation();
	
	public boolean getNegationStatus();

} // Action
