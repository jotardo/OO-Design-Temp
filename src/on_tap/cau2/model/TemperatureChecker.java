package on_tap.cau2.model;

import java.util.ArrayList;
import java.util.List;

public class TemperatureChecker implements Publisher{
	
	private List<Subscriber> subscribers;
	private double currentTempCelcius;
	private double currentTempFarenheit;
	
	public TemperatureChecker() {
		this.subscribers = new ArrayList<>();
	}
	
	public void setCurrentTempCelcius(double currentTemp) {
		this.currentTempCelcius = currentTemp;
		this.currentTempFarenheit = currentTemp * 1.8 + 32;
		this.notifySubscribers();
	}
	
	public void setCurrentTempFarenheit(double currentTemp) {
		this.currentTempFarenheit = currentTemp;
		this.currentTempCelcius = (currentTemp - 32) / 1.8;
		this.notifySubscribers();
	}

	@Override
	public void addSubscriber(Subscriber s) {
		this.subscribers.add(s);
	}

	@Override
	public void removeSubscriber(Subscriber s) {
		this.subscribers.remove(s);
	}

	@Override
	public void notifySubscribers() {
		for (Subscriber s: subscribers)
			s.updateTempature(currentTempCelcius, currentTempFarenheit);
	}

	public void lowerFareheitTemp(int amount) {
		setCurrentTempFarenheit(currentTempFarenheit - amount);
	}

	public void raiseFareheitTemp(int amount) {
		setCurrentTempFarenheit(currentTempFarenheit + amount);
	}

	public void lowerCelciusTemp(int amount) {
		setCurrentTempCelcius(currentTempCelcius - amount);
	}

	public void raiseCelciusTemp(int amount) {
		setCurrentTempCelcius(currentTempCelcius + amount);
	}

}
