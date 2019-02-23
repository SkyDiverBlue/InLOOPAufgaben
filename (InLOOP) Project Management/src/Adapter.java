import java.util.List;

public class Adapter implements IProject{
	//Attributes
	
	String name;
	String description;
	
	//Methods
	
	public Adapter(String name, String description, double rate) {
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

	
	public void setTask(Task newTask) {		
	}

	
	public double getDuration() {
		return 0;
	}

	
	public long getTotalCost() {
		return 0;
	}

	
	public List<Deliverable> getDeliverable() {
		return null;
	}

}
