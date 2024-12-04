package WeatherForecast;

import Interfaces.DisplayElement;
import Interfaces.Observer;

class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private String city;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherDataDTO newData) {
        this.temperature = weatherData.weatherData.temperature;
        this.humidity = weatherData.weatherData.humidity;
        this.city = weatherData.weatherData.city;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity in city " + city);
    }
}
