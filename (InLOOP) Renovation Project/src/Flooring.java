public class Flooring extends Material{
	
	//Attributes
	
	private double limit = 0.02;
	private double widthOfFlooring;
	
	//Methods
	
	public Flooring(String name, double price, double width) {
		super(name, price);
		if (width <= 0){
			throw new IllegalArgumentException();
		}
		else {		
			this.widthOfFlooring = width;
		}
	}
	
	public double getWidth() {
		return widthOfFlooring;
	}
	
	public int getMaterialReq(Surface s) {
		if(s == null) {
			throw new NullPointerException();
		}
		double x = Math.round((s.getArea() / getWidth())* 100d) / 100d;
		double fractionalPart = Math.round((x % 1) * 100d) / 100d;
		
		if (fractionalPart < limit) {
			return (int) Math.floor(x);
			}
		else {
			return (int) Math.ceil(x);
		}
	}

}
