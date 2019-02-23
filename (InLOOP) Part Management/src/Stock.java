import java.util.HashMap;
import java.util.Map;

public abstract class Stock {
	
	//Attributes
	
	Map<Part,Integer> stockPart = new HashMap<Part,Integer>();

	//Methods
	
	public int get(Part part) {
		if(part == null) {
			throw new NullPointerException();
		}
		if(stockPart.containsKey(part)) {
			return stockPart.get(part);
		}
		else {
			return -1;
		}
	}
	
	public boolean set(Part part, int count) {
		if(part == null) {
			throw new NullPointerException();
		}
		if (count < 0 | !stockPart.containsKey(part)) {
			return false;
		}
		else {
			stockPart.put(part, count);
			return true;
		}
	}
	
	public void insert(Part part, int count) {
		if(part == null) {
			throw new NullPointerException();
		}
		if(count <= 0) {
			throw new IllegalArgumentException();
		}
		if (stockPart.containsKey(part)) {
			stockPart.put(part, stockPart.get(part) + count);
		}
		else {
			stockPart.put(part, count);
		}
	}
	
	public boolean delete(Part part, int count) {
		if(part == null) {
			throw new NullPointerException();
		}
		if(!stockPart.containsKey(part) | count < 0) {
			return false;
		}
		if(stockPart.get(part) >= count) {
			stockPart.put(part, stockPart.get(part) - count);
			alarm(part);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void register(Observation observer) {
		if(observer == null) {
			throw new NullPointerException();
		}		
	}
	
	public void notify(Part part) {		
	}
	
	public void alarm(Part part) {
		if(part == null) {
			throw new NullPointerException();
		}
		for(Map.Entry<Part, Integer> alarm : stockPart.entrySet()) {
			if(alarm.getValue() < 10) {
				stockPart.replace(alarm.getKey(), 100);
			}
		}
	}
}
