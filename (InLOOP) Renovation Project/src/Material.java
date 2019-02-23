public abstract class Material {
	
	//Attributes
	
	private String name;
	private double price;
	
	//Methods
	
	public Material(String name, double price) {
		if(name == "") {
			throw new IllegalArgumentException();
		}
		if(name == null) {
			throw new NullPointerException();
		}
		if(price < 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.name = name; 
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getPricePerUnit() {
		return price;
	}
	
	public abstract int getMaterialReq(Surface s);
	
	
	public double getPriceOfASurface(Surface s) {
		if(s == null) {
			throw new NullPointerException();
		}
		else {
			double priceOfSurface = getMaterialReq(s) * getPricePerUnit();
			return priceOfSurface;
		}
	}

}
