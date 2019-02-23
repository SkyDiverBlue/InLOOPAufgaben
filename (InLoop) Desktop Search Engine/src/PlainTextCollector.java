import java.util.HashSet;
import java.util.Set;

public class PlainTextCollector implements KeywordCollector {
	
	//Attributes
	
	private Set<String> keywords = new HashSet <String>();
	
	
	//Methods
	
	public Set<String> getKeywords(Resource res){
		if (res == null) {
			throw new NullPointerException("Res cannot be null");
		}
	
		TextFileIterator it = new TextFileIterator(res);
		keywords.addAll(it.getkeywords());
		return keywords;		
	}
	
	//functional
	
}
