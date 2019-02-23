public abstract class Employee {
	
	//Attributes
	
	private String id;
	
	//Methods
	
	public Employee(String id) { //Constructor
		this.id = id;
		if (id == null)
			throw new NullPointerException("Id cannot be null");
		if (id == "")
			throw new IllegalArgumentException("Id cannot be empty");
	}
	
	public String getId() {
		return id;
	}
	
	abstract public boolean isPayday(int DayOfMonth);
		
	abstract public double calculatePay() throws UnpayableEmployeeException;
	
	abstract public double calculateDeductions();

}
