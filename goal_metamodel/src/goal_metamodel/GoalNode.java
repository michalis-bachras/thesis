/**
 */
package goal_metamodel;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see goal_metamodel.Goal_metamodelPackage#getGoalNode()
 * @model
 * @generated
 */
public interface GoalNode extends Node {
	
	public void addOR_dec_idlist(HashSet<String> OR_dec_ids1);
	
	public void addOR_dec_id(String OR_dec_id);
	
	public HashSet<String> getOR_dec_ids();
	
	public void set_OR_dec_id(String OR_dec_id);
	
	public String get_OR_dec_id();
	
	public boolean get_availability_status();
	
	public void set_availability_status(boolean status);
	
	public void set_elimination(boolean value) ;
	
	public boolean get_elimination();
	
	public void set_current_parallel(String P);
	
	public String get_current_parallel();
	
	EList<ParallelLink> getParallelLinks();
	
	public String getid();
	
	public void setid(String id);
	
	public String get_parent_id();
	
	public void set_parent_id(String parent_id);
	
	int getdepth();
	
	void setdepth(int depth);
	
	public void addANDidlist(HashSet<String> AND_ids1);
	
	public void addANDid(String AND_id);
	
	public String get_AND_id();
	
	public HashSet<String> getANDids();
	
	public void set_parent_OR_id(String parent_OR_id);
	
	public String get_parent_OR_id();
	
	public void addORid(String OR_id);
	
	public HashSet<String> getORids();
	
	public String get_OR_id();
	
	public void addORidlist(HashSet<String> OR_ids1);
	
	public void add_anchestors(String s,HashSet<String> ancestors_p);
	
	public HashSet<String> get_anchestors();
	
	public void set_OR_child_status();
	
	public boolean get_OR_child_status();
	
	
} // GoalNode


