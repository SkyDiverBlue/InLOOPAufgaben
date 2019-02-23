import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EventCatalogImpl implements EventCatalog{
	
	//Attributes
	
	Map<Event, Set<Time>> eventMap = new HashMap<>();
	
	//Methods

	
	public boolean addCatalogEntry(Event e, Set<Time> tSet) {
		if(tSet == null | e == null) {
			throw new NullPointerException();
		}
		for(Time time : tSet) {
			if(time == null) {
				throw new NullPointerException();
			}
		}
		if(!eventMap.containsKey(e)) {			
			eventMap.put(e, tSet);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean addTimeToEvent(Event e, Time t) {
		if(t == null | e == null) {
			throw new NullPointerException();
		}
		if(!eventMap.containsKey(e)) {
			return false;
		}
		if(eventMap.get(e).contains(t)) {
			return false;
		}
		else {
			eventMap.get(e).add(t);
			return true;
		}
	}

	public Set<Event> getAllEvents() {
		return eventMap.keySet();
	}
	
	public Set<Time> getTimesOfEvent(Event e) {
		if(e == null) {
			throw new NullPointerException();
		}
		return eventMap.get(e);
	}

	
	public Map<Event, Set<Time>> filterByEventCategory(EventCategory category) {
		Map<Event, Set<Time>> specialEventMap = new HashMap<Event, Set<Time>>();
		if(category == null) {
			throw new NullPointerException();
		}
		for(Entry<Event, Set<Time>> e : eventMap.entrySet()) {
			if(e.getKey().getCategory() == category) {
				specialEventMap.put(e.getKey(), e.getValue());
			}		
		}
		return specialEventMap;
	}
	
	public Set<Time> deleteEvent(Event e) {
		if(e == null) {
			throw new NullPointerException();
		}
		if(eventMap.containsKey(e)) {
			return eventMap.remove(e);
		}
		else {
			return null;
		}
	}

	public boolean deleteTime(Event e, Time t) {
		if(e == null | t == null) {
			throw new NullPointerException();
		}
		if(!eventMap.containsKey(e)) {
			return false;
		}
		if(eventMap.get(e).contains(t)) {
			eventMap.get(e).remove(t);
			return true;
		}
		else {
			return false;
		}
	}

}
