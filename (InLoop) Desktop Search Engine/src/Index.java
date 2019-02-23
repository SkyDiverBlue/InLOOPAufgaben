import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Index{

	//Attributes
	
	private Map<String, LinkedList<Resource>> index = new HashMap<String, LinkedList<Resource>>();
	
	private Set <String> setOfKeywords = new HashSet<String>();
	private LinkedList<Resource> listOfResource;
	private List<Resource> emptyList = Collections.emptyList();
	
	private KeywordCollector Collector;
			
	//Methods
	

	public Index() {		
	}
	
	public void add (Resource res) {
		
		if (res == null) {
			throw new NullPointerException();
		}
		
		Collector = res.getType().getCollector();
		setOfKeywords = Collector.getKeywords(res);
		
		for (String word : setOfKeywords) { //iterates through HashSet
			
			if (index.get(word) == null) {
				listOfResource = new LinkedList<Resource>();
				listOfResource.add(res);				
			}
			
			else {
				listOfResource = index.get(word);
				listOfResource.add(res);				
			}
		
		index.put(word, listOfResource);
			
		}
	}
	
	public List<Resource> getResources(String keyword){
		if (keyword == null) {
			throw new NullPointerException();
		}
		if (index.containsKey(keyword)){
			return index.get(keyword);
		}
		else {
			return emptyList;
		}
	}
}
