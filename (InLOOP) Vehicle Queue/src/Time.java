import java.util.Observable;

public class Time extends Observable{
	
	//Attributes
	
	private static Time instance;
	private int currentTime = 0;
	private int endOfTime = 100;
	
	//Methods
	
	public static Time getInstance() {
		return instance;
	}
	
	private Time() {
		
	}
	
	public void initEndOfTime(int seconds) {
		if(seconds < 0) {
			throw new IllegalArgumentException();
		}
		
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	public void run() {
		
	}

}
