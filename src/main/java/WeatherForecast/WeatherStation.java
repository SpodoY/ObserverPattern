package WeatherForecast;

public class WeatherStation {
    // TODO: Run application when done. If everything is done correctly, you should get output in the console
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // Simulate new weather measurements (Changes should get observed)
        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(32, 70, 29.2f);
        weatherData.setMeasurements(28, 90, 29.2f);
    }
}
