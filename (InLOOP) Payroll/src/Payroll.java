import java.util.List;

public class Payroll {
	
	//Attributes
	
	private int payday;
	private PayrollDisposition disposition;
	
	//Methods
	
	public Payroll(PayrollDisposition disposition, int payday) {
		this.payday = payday;
		this.disposition = disposition;
		
		if (disposition == null) {
			throw new NullPointerException();
		}
		
		if (payday <= 0 | payday > 31) {
			throw new IllegalArgumentException();
		}
	}
	
	public void doPayroll(PayrollDB db){ //retrieves the list of employees from a PayrollDB
		//calls sendPayment() for each Employee to submit the respective salary.
		
		if (db == null) {
			throw new NullPointerException();
		}

		List<Employee> employeeList = db.getEmployeeList();
		
		for (Employee empl : employeeList) {
			if (empl.isPayday(payday)) {
				try {
					double salary = empl.calculatePay() - empl.calculateDeductions();
					disposition.sendPayment(empl, salary);
					} 
				catch (UnpayableEmployeeException e) {
				}
			}
		}
	}
	
	public int getPayday() {
		return payday;
	}

}
