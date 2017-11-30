package implementation;

public class Currency {
	public double length;
	public double time;
	
	
	public double getSpeed() {
		double hours = this.length/this.time;
		double minutes = this.length%this.time;
		return hours+minutes;
	}
}
