import java.util.ArrayList;
import java.util.List;

public class Taxi extends Human{ //Taxi is a subclass of Human
	
	Human Driver;
	int i = 0;
	int a = 0;
	String passengerlist;
	
	ArrayList<Human> passenger = new ArrayList<Human>(); //Array for passengers
	
	Taxi(Human x) { 
		Driver = x;
		}
	
	String getDriverName() {
		return Driver.toString();
	}
	
	public void add(Human x) { //adds passengers to array
		if (i <= 3)
		{
			passenger.add(x);		
			System.out.println(x.toString() + " gets in.");
			i++;
		}
		else {
			System.out.println("We are sorry, " + x.toString() + ". The taxi is full.");
		}	
		
	}
	
	public String toString() {
		if (passenger.isEmpty()){
			return "This is the taxi of " + Driver.toString() + ". He takes nobody along.";			
		}
		if (passenger.size() == 1) {
			return "This is the taxi of " + Driver.toString() + ". He takes " + passenger.get(0).toString() + " along.";
		}
		else {
			List<Human> head = passenger.subList(0, i-1);
			return "This is the taxi of " + Driver.toString() + ". He takes" + head.toString().replace("[", " ").replace("]" , " ") + "and " + passenger.get(i-1) + " along.";
	}
	}

	public ArrayList<Human> allGetOut() {
		passenger.removeAll(passenger);
		return passenger;
		
	}	
	}
