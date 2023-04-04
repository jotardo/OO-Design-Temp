package adpater.lab2.ver4;

public class ThreeWayAdapter implements Switchable{
	
	private ThreeWayLight light;
	
	public ThreeWayAdapter(ThreeWayLight light) {
		this.light = light;
	}

	@Override
	public void turnOn() {
		switch(light.getBrightness()) {
		case 0:
			light.setLow();
			break;
		case 1:
			light.setMedium();
			break;
		case 2:
			light.setHigh();
			break;
		case 3:
			light.setOff();
			break;
		}
		System.out.println("Brightness set to " + light.getBrightness());
	}

}
