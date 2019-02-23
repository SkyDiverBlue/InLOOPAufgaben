import java.util.HashMap;
import java.util.Map;

public class PayrollDispositionImpl implements PayrollDisposition{
	
	//Attributes
	
	private Map<Employee, Double> payments = new HashMap<Employee, Double>();
	
	//Methods
	
	public PayrollDispositionImpl(){ //Constructor
	}
	
	public double getTotal() { //total of all salaries
		double sum = 0.0;
		for (Double i : payments.values()) {
			sum += i;
		}
		return sum;
	}
	
	public double getAverage() {
		if (payments.size() != 0) {
			double average = getTotal() / payments.size();		
			return average;
		}
		
		else {
			return 0;
		}
	}
	
	public Map<Employee, Double> getPayments(){
		return payments;
	}
	
	public void sendPayment(Employee empl, double payment) {
		
		if (empl == null) {
			throw new NullPointerException();
		}
		
		if (payment <= 0) {
			throw new IllegalArgumentException();
		}
		
		else{
			payments.put(empl, payment);			
		}
		
	}

}
