package lab4.ex2;

class TestWeatherData {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80f, 65f, 30.4f);
		System.out.println("------------------------");
		weatherData.setMeasurements(82f, 70f, 29.2f);
		System.out.println("------------------------");
		weatherData.setMeasurements(78f, 90f, 29.2f);
		
		weatherData.unregisterObserver(forecastDisplay);
		weatherData.unregisterObserver(currentDisplay);
		weatherData.unregisterObserver(statisticsDisplay);
		weatherData.setMeasurements(80f, 65f, 30.4f);
		System.out.println("------------------------");
		weatherData.setMeasurements(82f, 70f, 29.2f);
		System.out.println("------------------------");
		weatherData.setMeasurements(78f, 90f, 29.2f);
	}
}
