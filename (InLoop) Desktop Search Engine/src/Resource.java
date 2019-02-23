public class Resource {

	//Attributes
	private String name;
	private String path;
	private ResourceType rt;	
	
	//Methods
	
	public Resource(String name, String path, ResourceType rt) { //Constructor
		if (name == null | path == null | rt == null) {
			throw new NullPointerException("name, path or resourcetype cannot be null");
			}
		if (name.isEmpty() | path.isEmpty()) {
			throw new IllegalArgumentException("name or path cannot be empty");
		}
	else {
		this.name = name;
		this.path = path;
		this.rt = rt;
	}
	}
	
	public String getName(){
		return name;		
	}
	
	public String getPath() {
		return path;
	}
	
	public ResourceType getType() {
		return rt;
	}
	
	
}
