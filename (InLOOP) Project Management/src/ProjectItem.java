public abstract class ProjectItem {
	
	//Attributes
	
	private String name;
	private String details;
	private double rate;
	
	//Methods
	
	public ProjectItem(String name, String details, double rate) {
		if(name == null | details == null) {
			throw new NullPointerException();
		}
		if(name == "" | details == "") {
			throw new IllegalArgumentException();
		}
		if (rate <= 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.name = name;
			this.details = details;
			this.rate = rate;
		}
	}
	
	public void setDetails(String newDetails) {
		this.details = newDetails;	
	}
	
	public long getCostEstimate() { //to implement
		double costEstimate = (getTimeRequired() * rate) + getMaterialCost();
		return Math.round(costEstimate);
	}
	
	public abstract double getTimeRequired();
	
	public abstract long getMaterialCost();
}
