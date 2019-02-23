public class Time {
	
	//Attributes
	
	private int hour;
	private int minute;
	
	//Methods
	
	public Time(int hour, int minute) {
		if(hour > 24 | hour < 0 | minute > 59 | minute < 0) {
			throw new IllegalArgumentException();
		}
		if(hour == 24 && minute > 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}

}
