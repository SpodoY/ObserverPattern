package WeatherForecast;

public class WeatherStation {
    // TODO: Run application when done. If everything is done correctly, you should get output in the console
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // Simulate new weather measurements (Changes should get observed)
        weatherData.setMeasurements(new WeatherDataDTO(30, 65, 30.4f, "Toronto"));
        weatherData.setMeasurements(new WeatherDataDTO(32, 70, 29.2f, "Vienna"));
        weatherData.setMeasurements(new WeatherDataDTO(28, 90, 29.2f, "London"));

        while (true) {
            WeatherAPI.getWeatherData();
            Thread.sleep(5000);
        }
    }
}
