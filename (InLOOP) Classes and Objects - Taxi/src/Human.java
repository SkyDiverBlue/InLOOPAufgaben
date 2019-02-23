public class Human extends MyTaxiTest{
	
	 String forename;
	 String name;
	
	public Human()
	{
	}
		
	public Human(String forename, String name) { //constructor for Human
		this.forename = forename;
		this.name = name;
	}
	
	public String getName() {  //getName function
		return name;
	}
	
	public String getForename() { //getForeName function
		return forename;
	}
	
	public String toString() {
		return forename + " " + name;
	}
	
	public static void main(String []args) { //main method
		Human aHuman = new Human("Maximilian", "Huber");  //creates a new Human
		
		System.out.println("This is " + aHuman.toString() + ".");
	}
}
