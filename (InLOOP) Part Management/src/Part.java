public abstract class Part {
	
	//Attributes
	
	private String id;
	private String name;
	
	//Methods
	
	public Part(String id, String name) {
		if(name == null | id == null) {
			throw new NullPointerException();
		}
		if(name == "" | id == "") {
			throw new IllegalArgumentException();
		}
		else {
			this.id = id;
			this.name = name;
		}
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
