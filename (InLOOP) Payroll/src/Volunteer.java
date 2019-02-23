
public class Volunteer extends Employee {
	
	public Volunteer(String id) {
		super(id);	
	}
	
	
	public double calculatePay() throws UnpayableEmployeeException{
		throw new UnpayableEmployeeException("Employee does not receive any payment");	
	}

	public boolean isPayday(int DayOfMonth) {
		return false;
	}
	
	public double calculateDeductions() {
		return 0;
	}
	
}
