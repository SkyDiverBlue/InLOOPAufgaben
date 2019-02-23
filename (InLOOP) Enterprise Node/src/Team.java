import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Team extends AbstractEnterpriseUnit{
	
	//Attributes
	
	StaffMember teamleader;
	
	//Methods
	
	public Team(String name, StaffMember teamleader) {
		super(name);
		this.teamleader = teamleader;
		
		if (name == null) {
			throw new NullPointerException();
		}
		if (teamleader == null) {
			throw new NullPointerException();
		}
		if (name == "") {
			throw new IllegalArgumentException();
		}
	}
	
	public StaffMember getTeamLeader() {
		return teamleader;
	}
	
	public List<StaffMember> getTeamMembers(){ //only returns direct subordinates and not list of all subordinates
		Set<StaffMember> team = teamleader.getDirectSubordinates();
		StaffMemberIterator iterator = new StaffMemberIterator(team);
		List<StaffMember> listOfMembers = iterator.listOfStaffMember;
		listOfMembers.add(teamleader);
		Collections.sort(listOfMembers);
		return listOfMembers;
	}

}
