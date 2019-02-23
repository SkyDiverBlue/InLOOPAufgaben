import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
	
	//Attributes
	
	private String name;
	private String description;
	//Methods
	
	public Project(String name, String description, double rate) {
		if(name == null | description == null) {
			throw new NullPointerException();
		}
		if(name == "" |description == "") {
			throw new IllegalArgumentException();
		}
		if (rate <=0) {
			throw new IllegalArgumentException();
		}
		else {
			this.name = name;
			this.description = description;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setTask(Task newTask) {
		if(newTask == null) {
			throw new NullPointerException();
		}
	}
	
	public double getDuration(){
		return 0;		
	}
	
	public long getTotalCost() {
		return 0;
	}
	
	public Map<Calendar, List<Deliverable>> allDeliverables() {
		Map<Calendar, List<Deliverable>> allDeliverables = new  HashMap<Calendar, List<Deliverable>>();
		allDeliverables.put(arg0, arg1);
		return;		
	}

}
