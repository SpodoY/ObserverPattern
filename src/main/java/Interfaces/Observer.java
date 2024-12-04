package Interfaces;

import WeatherForecast.WeatherDataDTO;

public interface Observer {
    void update(WeatherDataDTO weatherDataDTO);
}
