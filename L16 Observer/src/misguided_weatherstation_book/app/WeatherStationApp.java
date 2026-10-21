package misguided_weatherstation_book.app;

import misguided_weatherstation_book.weatherdata.WeatherData;

public class WeatherStationApp {
    void main() {
        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(80, 65, 30.4f);
        IO.println();

        weatherData.setMeasurements(82, 70, 29.2f);
        IO.println();

        weatherData.setMeasurements(78, 90, 29.2f);
        IO.println();
    }
}
