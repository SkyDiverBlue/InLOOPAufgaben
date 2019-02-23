import java.util.HashSet;
import java.util.Set;

public class DefaultCollector implements KeywordCollector{
	
	//Methods
	
	public Set<String> getKeywords(Resource res) {
		if (res == null) {
			throw new NullPointerException("Res cannot be null");
		}
		else {
			Set<String> justname = new HashSet<String>(); //set always instanced when method called
			justname.add(res.getName()); //this means that Set does not save previous value
			return justname;
		}
	}
	
	//simply returns the filename as keyword so that there is at least one keyword available even for unknown file types.

}
