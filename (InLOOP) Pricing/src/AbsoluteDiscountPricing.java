
public class AbsoluteDiscountPricing implements ISalePricing{
	
	//Attributes
	
	private long discount;
	private long threshold;
	
	//Methods
	
	public AbsoluteDiscountPricing (long discount, long threshold) {
		this.discount = discount;
		this.threshold = threshold;
		
		if (discount < 0) {
			throw new IllegalArgumentException();
		}
		
		if (threshold < 0) {
			throw new IllegalArgumentException();
		}
	}

	public long getTotal(Sale sale) {
		if (sale == null) {
			throw new NullPointerException();
		}
		
		long x = sale.getPreDiscountTotal() - discount;
		if (sale.getPreDiscountTotal() > threshold && x > threshold){
				return x;
			}
		if (sale.getPreDiscountTotal() > threshold && x < threshold) {
			return threshold;
		}
		else {
			return sale.getPreDiscountTotal();
		}	
	}
 
}
