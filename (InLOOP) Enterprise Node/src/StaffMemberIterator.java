import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class StaffMemberIterator implements EnterpriseNodeIterator<StaffMember>{
	
	//Attributes
	
	public List<StaffMember> listOfStaffMember = new ArrayList<StaffMember>();
	private Integer i = -1;
	
	//Methods
	
	public StaffMemberIterator(Set<StaffMember> directSubordinates) {
		if (directSubordinates == null) {
			throw new NullPointerException();
		}
		
		listOfStaffMember = new ArrayList<StaffMember>(directSubordinates);
		
		for(StaffMember staffMember : directSubordinates) {
			findSubordinatesRecursively(staffMember); //calls recursive function
		}
	}
	
	public boolean hasNext() {
		if (i+1 < listOfStaffMember.size()) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public StaffMember next() {
		if (true == this.hasNext()) {
			i++;
			return listOfStaffMember.get(i);
		}
		else {
			throw new NoSuchElementException();
		}
	}	
	
	private void findSubordinatesRecursively(StaffMember m) { //given object m
		if(listOfStaffMember.contains(m)) {
			Set<StaffMember> recursiveStaff = m.getDirectSubordinates();
			for(StaffMember staff : recursiveStaff) {
				listOfStaffMember.add(staff);
				Collections.sort(listOfStaffMember);
				findSubordinatesRecursively(staff);
			}			
		}		
	}

}
