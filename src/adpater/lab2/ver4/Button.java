package adpater.lab2.ver4;

public class Button {
	
	private Switchable switchable;

	public Button(Switchable light) {
		super();
		this.switchable = light;
	}
	
	public void press() {
		switchable.turnOn();
	}

}
