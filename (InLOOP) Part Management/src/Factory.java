public class Factory {
	
	//Attributes
	
	Purchasing purchasing;
	ReceivingStock receivingStock;
	
	//Methods
	
	public Factory(Purchasing purchasing, ReceivingStock receivingStock) {
		if(purchasing == null | receivingStock == null) {
			throw new NullPointerException();
		}
		else {
			this.purchasing = purchasing;
			this.receivingStock = receivingStock;
		}
	}
	
	public Purchasing getPurchasing() {
		return purchasing;
	}
	
	public ReceivingStock getStock() {
		return receivingStock;
	}
	
	public static Part create(PartType partType, String id, String name) {
		Part part = null;
		if (partType == PartType.COMPONENTS) {
			part = new Components(id, name);
		}
		if(partType == PartType.RESOURCE) {
			part = new Resource(id, name);
		}
		if(partType == PartType.SINGLE_COMPONENT) {
			part = new SingleComponent(id, name);
		}
		if(id == null | name == null | partType == null) {
			throw new NullPointerException();
		}
		if(id == "" | name == "") {
			throw new IllegalArgumentException();
		}
		return part;
	}

}
