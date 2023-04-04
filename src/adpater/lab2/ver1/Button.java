package adpater.lab2.ver1;

public class Button {
	
	private Light light;

	public Button(Light light) {
		super();
		this.light = light;
	}
	
	public void press() {
		light.turnOn();
	}

}
