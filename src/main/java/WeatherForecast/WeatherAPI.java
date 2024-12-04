package WeatherForecast;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.*;

public class WeatherAPI {

    public static HttpClient httpClient = HttpClient.newHttpClient();

    public static WeatherApiDTO getWeatherData() {
        Gson gson = new Gson();

        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m"))
                .GET()
                .header("Content-Type", "application/json")
                .build();

        WeatherApiDTO respo = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(responseBody -> gson.fromJson(responseBody, WeatherApiDTO.class))
                .join();  // Wait for the result

        System.out.println(respo.timezone);

        return respo;
    }

}
