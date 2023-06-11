package on_tap.cau2.model;

import java.util.ArrayList;
import java.util.List;

public class TemperatureChecker implements Publisher {

	private List<Subscriber> subscribers;
	private double currentTempCelcius;
	private double minTempCelcius;
	private double maxTempCelcius;
	private double currentTempFarenheit;
	private double minTempFarenheit;
	private double maxTempFarenheit;

	public TemperatureChecker() {
		this.subscribers = new ArrayList<>();
		this.minTempCelcius = 0;
		this.maxTempCelcius = 100;
		this.minTempFarenheit = 32;
		this.maxTempFarenheit = 212;
		this.setCurrentTempCelcius(0);
	}

	public void setCurrentTempCelcius(double currentTemp) {
		this.currentTempCelcius = currentTemp;
		this.currentTempFarenheit = currentTemp * 1.8 + 32;
		this.notifySubscribersDrawView();
	}

	public void setCurrentTempFarenheit(double currentTemp) {
		this.currentTempFarenheit = currentTemp;
		this.currentTempCelcius = (currentTemp - 32) / 1.8;
		this.notifySubscribersDrawView();
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
	public void notifySubscribersDrawView() {
		for (Subscriber s : subscribers)
			s.updateTempature(currentTempCelcius, currentTempFarenheit, maxTempCelcius);
	}

	public void lowerFareheitTemp(int amount) {
		if (currentTempFarenheit + amount < minTempFarenheit)
			setCurrentTempFarenheit(minTempFarenheit);
		else
			setCurrentTempFarenheit(currentTempFarenheit - amount);
	}

	public void raiseFareheitTemp(int amount) {
		if (currentTempFarenheit + amount > maxTempFarenheit)
			setCurrentTempFarenheit(maxTempFarenheit);
		else
			setCurrentTempFarenheit(currentTempFarenheit + amount);
	}

	public void lowerCelciusTemp(int amount) {
		if (currentTempCelcius - amount < minTempCelcius)
			setCurrentTempCelcius(minTempCelcius);
		else
			setCurrentTempCelcius(currentTempCelcius - amount);
	}

	public void raiseCelciusTemp(int amount) {
		if (currentTempCelcius + amount > maxTempCelcius)
			setCurrentTempCelcius(maxTempCelcius);
		else
			setCurrentTempCelcius(currentTempCelcius + amount);
	}

}
