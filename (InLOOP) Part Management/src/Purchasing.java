public class Purchasing implements Observation{
	
	//Attributes
	
	private ReceivingStock receivingStock;

	//Methods
	
	public Purchasing(ReceivingStock receivingStock){
		if (receivingStock == null) {
			throw new NullPointerException();
		}
		else {
			this.receivingStock = receivingStock;
		}
	}
	
	public void buy(Part part, int count) {
		if(part == null) {
			throw new NullPointerException();
		}
		if(count <= 0) {
			throw new IllegalArgumentException();
		}
		else {
			ReceivingStock stock = getStock();
			stock.insert(part, count);
		}
	}
	
	public ReceivingStock getStock() {
		return receivingStock;
	}

	public void alarm(Part part) {		
	}

}
