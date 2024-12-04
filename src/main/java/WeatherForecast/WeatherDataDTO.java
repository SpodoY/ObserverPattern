package WeatherForecast;

public class WeatherDataDTO {

    public float temperature;
    public float humidity;
    public float pressure;
    public String city;

    public WeatherDataDTO(float temperature, float humidity, float pressure, String city) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.city = city;
    }
}
