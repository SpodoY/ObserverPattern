package WeatherForecast;

import Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

class WeatherData {
    private List<Observer> observers;
    WeatherDataDTO weatherData;

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
    public void notifyObservers() {
        observers.forEach(o -> o.update(weatherData));
    }

    public void setMeasurements(WeatherDataDTO newWeatherData) {
        weatherData = newWeatherData;
        // TODO: Create a method that calls your new notification method and call it here, after updating the measurements
        notifyObservers();
    }
}