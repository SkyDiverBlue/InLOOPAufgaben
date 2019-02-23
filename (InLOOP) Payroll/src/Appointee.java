public class Appointee extends Employee {
	
	//Attributes
	
	private int dayOfMonth;
	private int hoursPerMonth;
	private double payPerHour;
		
	//Methods

	public Appointee(String id, int dayOfMonth, int hoursPerMonth, double payPerHour) { //Constructor
		super(id);
		this.dayOfMonth = dayOfMonth;
		this.hoursPerMonth = hoursPerMonth;
		this.payPerHour = payPerHour;
		
		if (payPerHour <= 0) {
			throw new IllegalArgumentException("payPerHour cannot be negative or zero");
		}
		
		if (hoursPerMonth <= 0) {
			throw new IllegalArgumentException("Hours per month cannot be negative");
		}
		
		if (dayOfMonth <= 0 | dayOfMonth > 31) {
			throw new IllegalArgumentException();
		}
	}
	
	public double calculatePay() throws UnpayableEmployeeException { //calculates gross salary
		double grossPay = hoursPerMonth * payPerHour;
		return grossPay;
	}
	
	
	public double calculateDeductions() { //net salary (Appointee only keeps 40 per cent)
		double nettPay = hoursPerMonth * payPerHour * (40.0/100.0);	//use floating-point arithmetic
		return nettPay;		
	}
	
	public boolean isPayday(int DayOfMonth) { //need to get PayDay from Payroll
		if(DayOfMonth == dayOfMonth) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
