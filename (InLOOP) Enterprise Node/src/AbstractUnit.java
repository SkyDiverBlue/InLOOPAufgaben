import java.util.ArrayList;
import java.util.List;

abstract public class AbstractUnit extends AbstractEnterpriseUnit{
	
	//Attributes
	
	private List<AbstractEnterpriseUnit> childNodeList = new ArrayList<AbstractEnterpriseUnit>(); //List of child Nodes
	
	//Methods
	
	public AbstractUnit(String name) {
		super(name);
		if (name == null) {
			throw new NullPointerException();
		}
	}
	
	public boolean add(AbstractEnterpriseUnit childNode) { //to add Holdings, Companies, Divisions
		if (childNode == null) {
			throw new NullPointerException();
		}
		if (!childNodeList.contains(childNode)) { //if list does not contain childNode
			childNodeList.add(childNode);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean remove(AbstractEnterpriseUnit childNode) { //to implement
		if (childNodeList.contains(childNode)) {
			childNodeList.remove(childNode);
			return true;
		}
		else{
			return false;
		}
	}
	
	public List<AbstractEnterpriseUnit> getChildNodes(){
		return childNodeList;
	}

}
