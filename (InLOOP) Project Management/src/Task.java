import java.util.ArrayList;
import java.util.List;

public class Task extends ProjectItem{
	
	//Attributes
	
	List<ProjectItem> projectItemList = new ArrayList<ProjectItem>();
		
	//Methods
	
	public Task(String name, String details, double rate) {
		super(name, details, rate);
	}
	
	public double getTimeRequired() { //to implement methods from here
		return 0;
	}
	
	public long getMaterialCost() {
		return 0;
	}
	
	public void addProjectItem(ProjectItem pi) {
		if(pi == null) {
			throw new NullPointerException();
		}
		else {
			projectItemList.add(pi);
		}
	}
	
	public void removeProjectItem(ProjectItem pi) {
		if(projectItemList.contains(pi)) {
			projectItemList.remove(pi);
		}
		if(!projectItemList.contains(pi) | pi == null) {
			throw new NullPointerException();
		}
		
	}
	
	public List<Deliverable> allDeliverables(){
		return;
	}

}
