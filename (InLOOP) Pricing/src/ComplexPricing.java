import java.util.ArrayList;
import java.util.List;

abstract public class ComplexPricing implements ISalePricing{
	
	//Attributes
	
	ISalePricing pricing;
	
	//Methods
	
	public ComplexPricing(ISalePricing pricing) {
		if (pricing == null) {
			throw new NullPointerException();
		}
		else{
			this.pricing = pricing;
		}
	}
	
	public abstract void add(ISalePricing pricing);
	
	public abstract List<ISalePricing> getPricings();

	public abstract long getTotal(Sale sale);

}
