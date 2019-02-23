
public class Sale {
	
	//Variables
	
	private long preDiscountTotal;
	private ISalePricing pricing;
	
	//Methods
	
	public Sale (long preDiscountTotal, ISalePricing pricing) {  //Constructor
		if (pricing == null) {
			throw new NullPointerException();
		}
		if (preDiscountTotal <= 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.preDiscountTotal = preDiscountTotal;
			this.pricing = pricing;
		}
				
	}
	
	public long getPreDiscountTotal() {
		return preDiscountTotal;
	}
	
	public void setPricing (ISalePricing pricing) { //desired Pricing logic is chosen (BestForCustomerPricing or BestForStorePricing)
		if (pricing == null) {
			throw new NullPointerException();
		}
		this.pricing = pricing;
	}
	
	public long getTotal() {
		Sale sale = new Sale(preDiscountTotal, pricing);
		return pricing.getTotal(sale);
	}
	
	public static ISalePricing createPricing (DiscountType discountType, double percentage, long discount, long threshold) {
		if(discountType == null) {
			throw new NullPointerException();
		}
		ISalePricing iSalePricing = null;
		if(discountType == DiscountType.PERCENTAGEDISCOUNT) {
			iSalePricing = new PercentageDiscountPricing(percentage);
		}
		if(discountType == DiscountType.ABSOLUTEDISCOUNT) {
			iSalePricing = new AbsoluteDiscountPricing(discount, threshold);
		}		
		return iSalePricing;
	}

}
