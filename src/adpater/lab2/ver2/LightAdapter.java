package adpater.lab2.ver2;

public class LightAdapter implements Switchable{

	private Light light;
	
	public LightAdapter(Light light) {
		this.light = light;
	}
	
	@Override
	public void turnOn() {
		light.turnOn();
	}

}
