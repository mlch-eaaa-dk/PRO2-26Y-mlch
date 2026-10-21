package observer_weatherstation_book.apps;

import observer_weatherstation_book.displays.CurrentConditionsDisplay;
import observer_weatherstation_book.displays.ForecastDisplay;
import observer_weatherstation_book.displays.StatisticsDisplay;
import observer_weatherstation_book.weatherdata.WeatherData;

public class WeatherStationApp {
    void main() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        IO.println();

        weatherData.setMeasurements(82, 70, 29.2f);
        IO.println();

        weatherData.setMeasurements(78, 90, 29.2f);
        IO.println();
    }
}
