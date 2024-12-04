package WeatherForecast;

import java.io.InputStream;
import java.util.ArrayList;

public class WeatherApiDTO {

    public class CurrentUnits {
        public String time;
        public String interval;
        public String temperature_2m;
        public String wind_speed_10m;
    }

    public class Hourly {
        public ArrayList<String> time;
        public ArrayList<Double> temperature_2m;
        public ArrayList<Integer> relative_humidity_2m;
        public ArrayList<Double> wind_speed_10m;
    }

    public class HourlyUnits {
        public String time;
        public String temperature_2m;
        public String relative_humidity_2m;
        public String wind_speed_10m;
    }

    public class Current {
        public String time;
        public int interval;
        public double temperature_2m;
        public double wind_speed_10m;
    }

    public double latitude;
    public double longitude;
    public double generationtime_ms;
    public int utc_offset_seconds;
    public String timezone;
    public String timezone_abbreviation;
    public int elevation;
    public CurrentUnits current_units;
    public Current current;
    public HourlyUnits hourly_units;
    public Hourly hourly;
}
