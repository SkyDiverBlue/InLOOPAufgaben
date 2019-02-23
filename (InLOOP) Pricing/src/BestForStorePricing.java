import java.util.ArrayList;
import java.util.List;

public class BestForStorePricing extends ComplexPricing{
	
	//Attributes	

	List<ISalePricing> pricings = new ArrayList<ISalePricing>();
	
	//Methods
	
	public BestForStorePricing(ISalePricing pricing) {
		super(pricing);	
		add(pricing);
	}
	
	public void add(ISalePricing pricing) {
		pricings.add(pricing);
	}	
	
	public List<ISalePricing> getPricings() {
		return pricings;
	}
	
	@Override
	public long getTotal(Sale sale) {
		if (sale == null) {
			throw new NullPointerException();
		}
		long minPrice = pricings.get(0).getTotal(sale);
		for(ISalePricing price : pricings) {
			if(minPrice < price.getTotal(sale)) {
			minPrice = price.getTotal(sale);
			}
		}
		return minPrice;
	}
	
}
