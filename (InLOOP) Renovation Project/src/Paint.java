
public class Paint extends Material{
	
	//Attributes
	
	private double limit = 0.02;
	private int noOfCoats;
	private double noOfSqMPerLiter;
	
	//Methods
	
	public Paint(String name, double price, int noOfCoats, double noOfSqMPerLiter) {
		super(name, price);
		if (noOfCoats <= 0) {
			throw new IllegalArgumentException();
		}
		if (noOfSqMPerLiter <= 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.noOfCoats = noOfCoats;
			this.noOfSqMPerLiter = noOfSqMPerLiter;
		}
	}
	
	public int getNoOfCoats() {
		return noOfCoats;		
	}
	
	public double getNoOfSqMPerLiter() {
		return noOfSqMPerLiter; 
	}
	
	public int getMaterialReq(Surface s) {
		if(s == null) {
			throw new NullPointerException();
		}
		double x = Math.round(((s.getArea() * noOfCoats) / noOfSqMPerLiter)*100d) / 100d;
		double y = 2*x;
		double fractionalPart = Math.round((y % 1) * 100d) / 100d;
		
		if (fractionalPart <= limit) {
			return (int) Math.floor(y);
			}
		else {
			return (int) Math.ceil(y);
		}
	}

}
