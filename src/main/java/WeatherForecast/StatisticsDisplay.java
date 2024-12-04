package WeatherForecast;

import Interfaces.DisplayElement;
import Interfaces.Observer;

class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherDataDTO weatherData) {
        tempSum += weatherData.temperature;
        numReadings++;

        if (weatherData.temperature > maxTemp) {
            maxTemp = weatherData.temperature;
        }

        if (weatherData.temperature < minTemp) {
            minTemp = weatherData.temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
