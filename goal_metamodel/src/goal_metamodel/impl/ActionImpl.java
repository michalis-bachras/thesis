/**
 */
package goal_metamodel.impl;

import goal_metamodel.Action;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.Resource;
import goal_metamodel.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.ActionImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link goal_metamodel.impl.ActionImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link goal_metamodel.impl.ActionImpl#isResource_enabled <em>Resource enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends GoalNodeImpl implements Action {
	
	protected Task parent ; 
	
	public void set_parent(Task parent) {
		this.parent = parent;
	}
	
	public Task get_parent() {
		return parent;
	}
	
	protected HashSet<String> exist_node_list = new HashSet<String>();
	
	public HashSet<String> get_exist_node_list() {
		return exist_node_list;
		
	}
	
	protected HashSet<String> non_exist_node_list = new HashSet<String>();
	
	public HashSet<String> get_non_exist_node_list() {
		return non_exist_node_list;
		
	}
	
	
	protected boolean negated = false;
	
	public void setNegation() {
		negated = true;
	}
	
	public boolean getNegationStatus() {
		return negated;
	}
	
	protected boolean isParallelAction = false;  //αφορά τα  P actions που έχω τοποθετήσει και μόνο για να ξέρω ότι πίσω από αυτά τα actions κρύβονται actions μέσα στην παραλληλία
	
	public void setIsParallelAction() {
		isParallelAction = true;
	}
	
	public boolean getIsParallelAction() {
		return isParallelAction;
	}
	
	
	
	
	
	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requires;

	/**
	 * The default value of the '{@link #getThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected String thread = THREAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isResource_enabled() <em>Resource enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResource_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResource_enabled() <em>Resource enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResource_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean resource_enabled = RESOURCE_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<Resource>(Resource.class, this, Goal_metamodelPackage.ACTION__REQUIRES);
		}
		return requires;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThread() {
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(String newThread) {
		String oldThread = thread;
		thread = newThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.ACTION__THREAD, oldThread, thread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResource_enabled() {
		return resource_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_enabled(boolean newResource_enabled) {
		boolean oldResource_enabled = resource_enabled;
		resource_enabled = newResource_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.ACTION__RESOURCE_ENABLED, oldResource_enabled, resource_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Goal_metamodelPackage.ACTION__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				return getRequires();
			case Goal_metamodelPackage.ACTION__THREAD:
				return getThread();
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				return isResource_enabled();
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Resource>)newValue);
				return;
			case Goal_metamodelPackage.ACTION__THREAD:
				setThread((String)newValue);
				return;
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				setResource_enabled((Boolean)newValue);
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				getRequires().clear();
				return;
			case Goal_metamodelPackage.ACTION__THREAD:
				setThread(THREAD_EDEFAULT);
				return;
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				setResource_enabled(RESOURCE_ENABLED_EDEFAULT);
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				return requires != null && !requires.isEmpty();
			case Goal_metamodelPackage.ACTION__THREAD:
				return thread != THREAD_EDEFAULT;
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				return resource_enabled != RESOURCE_ENABLED_EDEFAULT;
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
		result.append(" (thread: ");
		result.append(thread);
		result.append(", resource_enabled: ");
		result.append(resource_enabled);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
