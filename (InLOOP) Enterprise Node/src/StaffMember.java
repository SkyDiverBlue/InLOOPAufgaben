import java.util.HashSet;
import java.util.Set;

public class StaffMember implements EnterpriseNode, java.lang.Comparable<StaffMember>{
	
	//Attributes
	
	private String name;
	private String job;
	
	private Set<StaffMember> SetOfStaffMember = new HashSet<StaffMember>(); //TreeSet uses comparator
	
	//Methods
	
	public StaffMember(String name, String job) {
		if (name == null) {
			throw new NullPointerException();
		}		
		if (job == null) {
			throw new NullPointerException();
		}
		if (name == "") {
			throw new IllegalArgumentException();
		}
		if (job == "") {
			throw new IllegalArgumentException();
		}		
		else {
			this.name = name;
			this.job = job;
		}
	}
	
	public String getJob() {
		return job;
	}
	
	public boolean addDirectSubordinate(StaffMember subordinate) {
		if (subordinate == null) {
			throw new NullPointerException();
		}
		if (!SetOfStaffMember.contains(subordinate)) {
			SetOfStaffMember.add(subordinate);
			return true;
		}
		else {		
			return false;
		}
	}
	
	public boolean removeDirectSubordinate(StaffMember subordinate) {
		if (SetOfStaffMember.contains(subordinate)) {
			SetOfStaffMember.remove(subordinate);
			return true;
		}
		else{
			return false;
		}
	}
	
	public Set<StaffMember> getDirectSubordinates(){
		return SetOfStaffMember;
	}
	
	public String toString() {
		return getName();
	}

	public String getName() {
		return name;
	}

	public int compareTo(StaffMember s) { //compares StaffMember (alphabetical order)
		return this.name.compareTo(s.getName());
	}

}
