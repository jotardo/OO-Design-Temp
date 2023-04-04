package adpater.lab2.ver4;

public class Light {
	
	private boolean turnedOn;
	
	public Light() {
		this.turnedOn = false;
	}
	
	public void turnOn() {
		this.turnedOn = true;
	}
	
	public void turnOff() {
		this.turnedOn = false;
	}

	public boolean isOn() {
		return turnedOn;
	}
}
