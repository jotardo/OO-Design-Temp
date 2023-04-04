package adpater.lab2.ver2;

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
		// TODO Auto-generated method stub
		return turnedOn;
	}
}
