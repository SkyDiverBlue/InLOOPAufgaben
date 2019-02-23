import java.util.Observable;

@SuppressWarnings("deprecation")
public class VehicleQueue implements java.util.Observer{

	//Attributes
	
	private double entryDelay;
	private double exitDelay;
	private int trafficLightRate;
	private boolean greenLight = false;
	
	private int queueSize;
	
	//Methods
	
	public VehicleQueue(double entryDelay, double exitDelay, int trafficLightRate, VehicleGenerator generator) {
		if(entryDelay <= 0 | exitDelay <= 0 | trafficLightRate <= 0) {
			throw new IllegalArgumentException();
		}
		if(generator == null) {
			throw new NullPointerException();
		}
		else {
			this.entryDelay = entryDelay;
			this.exitDelay = exitDelay;
			this.trafficLightRate = trafficLightRate;
		}
	}
	
	public void enter() {
		queueSize = queueSize + 1;		
	}
	
	public void leave() {
		if(queueSize > 0 | greenLight == true) {
			queueSize = queueSize - 1;
		}
	}
	
	public double getLength() {
		return 0;
	}
	
	public int getSize() {
		return queueSize;
	}

	public void update(Observable o, Object arg) {
		
	}
	
	
}
