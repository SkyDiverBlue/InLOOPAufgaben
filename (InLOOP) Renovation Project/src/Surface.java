import java.util.Map;
import java.util.TreeMap;

public class Surface extends RenovationObject{
	
	//Attributes
	
	private double length;
	private double width;
	private int materialReq;
	
	private Material material;
	
	
	//Methods
	
	public Surface(double length, double width) {
		if(length <= 0 | width <= 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.length = length;
			this.width = width;
		}
	}
	
	public void setMaterial(Material m) {
		if(m == null) {
			throw new NullPointerException();
		}
		else {
			material = m;
		}
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getPrice() {
		return material.getPriceOfASurface(this);
	}
	
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials){
		String name = material.getName();
		
		if (materials == null | name.equals(null)) {
			throw new NullPointerException();
		}
		
		if (materials instanceof TreeMap) {		
			if (!materials.isEmpty() && materials.containsValue(null)) {
				throw new NullPointerException();
				}
		}
		if(!(materials instanceof TreeMap )){
			if (!materials.isEmpty() && (materials.containsValue(null) | materials.containsKey(null))) {
				throw new NullPointerException();
				}
		}
		
		if(!materials.containsKey(name) | materials.isEmpty()) {
			materialReq = material.getMaterialReq(this);
			materials.put(name, materialReq);			
		}
		else if (materials.containsKey(name)){
			materialReq = material.getMaterialReq(this) + materials.get(name);		
			materials.put(name, materialReq);
		}		
		return materials;		
	
	}
}

