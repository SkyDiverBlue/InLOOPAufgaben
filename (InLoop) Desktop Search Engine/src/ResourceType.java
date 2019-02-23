public class ResourceType{
	
	//Attributes
	
	private String description;
	private KeywordCollector collector; //reference to KeywordCollector
	
	
	//Methods
		
	public ResourceType(String desc, KeywordCollector collector) { //constructor
		if (desc == null | collector == null) {
			throw new NullPointerException("description cannot be null");		
		}
		if (desc.isEmpty()) {
			throw new IllegalArgumentException("description cannot be empty");
		}
		else {
		this.description = desc;
		this.collector = collector;}
	}
	
	public String getDescription() {
		return description;	
	}
	
	public KeywordCollector getCollector() {
		return collector;		
	}

}
