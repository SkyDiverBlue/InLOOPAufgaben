
abstract public class AbstractEnterpriseUnit implements EnterpriseNode{
	
	//Attributes
	
	private String name;
	
	//Methods
	
	public AbstractEnterpriseUnit(String name) {
		if (name == null) {
			throw new NullPointerException();
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
