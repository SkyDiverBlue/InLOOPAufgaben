public class Event implements java.lang.Comparable<Event>{
	
	//Attributes 
	
	private String title;
	private EventCategory category;
	
	//Methods
	
	public Event(String title, EventCategory category) {
		if(title == null | category == null) {
			throw new NullPointerException();
		}
		if(title == "") {
			throw new IllegalArgumentException();
		}
		else {
			this.title = title;
			this.category = category;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public EventCategory getCategory() {
		return category;
	}

	public int compareTo(Event o) {
		if (o == null) {
			throw new NullPointerException();
		}
		if(this.getTitle().compareTo(o.getTitle()) != 0) {
			return this.getTitle().compareTo(o.getTitle());
		}
		else {
			return this.getCategory().compareTo(o.getCategory());
		}
	}
	
	

}
