public class ReceivingStock extends Stock {
	
	//Attributes
	
	private int minStockItems;
	private int maxStockItems;
	
	//Methods
	
	public ReceivingStock(int minStockItems, int maxStockItems) {
		if(minStockItems < 0 | maxStockItems < 0) {
			throw new IllegalArgumentException();
		}
		if(maxStockItems < minStockItems) {
			throw new IllegalArgumentException();
		}
		else {
			this.minStockItems = minStockItems;
			this.maxStockItems = maxStockItems;
		}
	}
	
	public int getMinStockItems() {
		return minStockItems;
	}
	
	public int getMaxStockItems() {
		return maxStockItems;
	}

}
