package lab4.ex2;

import java.util.ArrayList;
import java.util.List;

class WeatherData implements Subject {

	private List<Observer> observerList;
	private float tempature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}

	public float getTempature() {
		return tempature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public void setMeasurements(float tempature, float humidity, float pressure) {
		this.tempature = tempature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	private void measurementChanged() {
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observerList.forEach((observer) -> {
			observer.update(this.tempature, this.humidity, this.pressure);
		});

	}

}
