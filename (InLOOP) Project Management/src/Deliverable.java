import java.util.Calendar;

public class Deliverable extends ProjectItem{
	
	//Attributes
	
	private long materialCost;
	private double productionTime;
	private Calendar date;
	
	
	//Methods
	
	public Deliverable(String name, String details, double rate, long materialCost, double productionTime, Calendar date) {
		super(name, details, rate);
		if(materialCost <= 0 | productionTime <= 0) {
			throw new IllegalArgumentException();
		}
		if(date == null){
			throw new NullPointerException();
		}
		else {
			this.materialCost = materialCost;
			this.productionTime = productionTime;
			this.date = date;
		}		
	}
	
	public double getTimeRequired() {
		return productionTime;
	}
	
	public long getMaterialCost() {
		return materialCost;
	}
	
	public Calendar getDate(){
		return date;
	}

}
