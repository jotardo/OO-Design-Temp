package lab4.ex2;

class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humid, float pressure) {
		this.temperature = temp;
		this.humidity = humid;
		display();
	}
}
