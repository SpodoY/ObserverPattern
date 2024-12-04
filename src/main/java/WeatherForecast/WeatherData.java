package WeatherForecast;

import Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

class WeatherData {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // TODO: Add method for notifying observers, calling the update method for all observers in the list

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // TODO: Create a method that calls your new notification method and call it here, after updating the measurements
    }
}