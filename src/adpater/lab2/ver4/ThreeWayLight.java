package adpater.lab2.ver4;

public class ThreeWayLight {
	
	private int brightness;
	
	public ThreeWayLight() {
		this.brightness = 0;
	}
	
	public void setOff() {
		brightness = 0;
	}
	
	public void setLow() {
		brightness = 1;
	}
	
	public void setMedium() {
		brightness = 2;
	}
	
	public void setHigh() {
		brightness = 3;
	}
	
	public int getBrightness() {
		return brightness;
	}

}
