package WeatherForecast;

import java.net.URI;
import java.net.http.*;
import com.google.gson.Gson;

public class WeatherAPI {

    public static HttpClient httpClient = HttpClient.newHttpClient();

    public static void getWeatherData() {
        Gson gson = new Gson();


        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m"))
                .GET()
                .setHeader("Content-Type", "application/json")
                .build();




        return newData;
    }

}
