import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesktopSearch {
	
	//Attributes
		
	private Map<String, ResourceType> types = new HashMap<String, ResourceType>();
	private String extension;
	private ResourceType type;
	private Index index = new Index();
	
	//Methods
	
	public DesktopSearch() { //Constructor
		}
	
	public void registerType(String extension, ResourceType type) {
		this.extension = extension;
		types.put(extension, type);
		
		if (extension == null) {
			throw new NullPointerException();
		}
		
		if (type == null) {
			throw new NullPointerException();
		}

		else{ 
			this.type = type;
		}
	}
	
	public ResourceType getType(String extension) {
		
		if (extension == null)
			return null;
		
		if (types.containsKey(extension)) {
			return types.get(extension);
		}
		
		if (types.get(extension) ==  null) {
			return null;
		}
		
		else {
			return null;
		}
	}
	
	public void unregisterType(String extension ) {
		
		if (types.containsKey(extension)) {
			types.remove(extension);
		}
		
		if (extension == null) {
			throw new NullPointerException();
		}
	}
	
	public void registerResource(Resource res) {
		index.add(res);
	}
	
	public List<Resource> processRequest(String request){
		return index.getResources(request);		
	}
}
