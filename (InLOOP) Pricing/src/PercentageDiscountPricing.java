
public class PercentageDiscountPricing implements ISalePricing{
	
	//Attributes
	
	private double percentage;
	
	//Methods
	
	public PercentageDiscountPricing (double percentage) {		

		this.percentage = percentage;
		
		if (percentage < 0.0 || percentage > 100.0) {
			throw new IllegalArgumentException();
		}
	}

	public long getTotal(Sale sale) {		
		if (sale == null) {
			throw new NullPointerException();
		}
		else {
			double x = sale.getPreDiscountTotal() * (100-percentage)/100;
			long percentageDiscountPricing = (long)x;
			return percentageDiscountPricing;
		}
	}
	
}
