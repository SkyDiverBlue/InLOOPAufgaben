import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class TextFileIterator implements java.util.Iterator<String>{
	
	//Attributes
	
	private int i = -1;
	private String removehyphen	 = getAsString().replace("-\n", "");
	private String[] word = removehyphen.split("\\W+"); //uses regex
	
	
	//Methods
	
	public TextFileIterator(Resource res) {
		if (res == null) {
			throw new NullPointerException();
		}
	}
	
	public String getAsString() {
		return "We wish you good luck in this exam!\nWe hope you are well pre-\npared.";
	}

	public boolean hasNext() {		
		if (i+2 <= word.length) {
		return true;
		}
		else {
			return false;
		}
	}

	public String next() {
		if (true == this.hasNext()) {
			i = i+1;
			return word[i].toString();
			}
		else{
			throw new NoSuchElementException();	
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException("cannot remove anything");
	}
	
	public Set<String> getkeywords() {		
		Set<String> keywords = new HashSet<String>(Arrays.asList(word));
		return keywords;
	}
	
	//functional
	
}
