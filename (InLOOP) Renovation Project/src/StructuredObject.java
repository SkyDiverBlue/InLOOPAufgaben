import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StructuredObject extends RenovationObject{
	
	//Attribute
	
	Set<RenovationObject> parts= new HashSet<RenovationObject>();
	Surface surface;
	RenovationObject r2;
	
	//Methods
	
	public StructuredObject(){
	}
	
	public void add(RenovationObject r) {
		if(r == null) {
			throw new NullPointerException();
		}
		else {
			parts.add(r);
			r2 = r;
		}
	}
	
	public double getPrice() {
		double price = 0;
		for(RenovationObject robject : parts) {
			price = price + robject.getPrice();
		}
		return price;
	}
	
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials){
		if(materials == null) {
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
		for(RenovationObject robject : parts) {
			robject.addMaterialReq(materials);			
		}
		return materials;
		
	}
}
	


