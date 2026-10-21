package observer_weatherstation_simplified.apps;

import observer_weatherstation_simplified.displays.CurrentConditionsDisplay;
import observer_weatherstation_simplified.displays.ForecastDisplay;
import observer_weatherstation_simplified.displays.StatisticsDisplay;
import observer_weatherstation_simplified.weatherdata.WeatherData;

public class WeatherStationApp {
    void main() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.addObserver(statisticsDisplay);
        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(forecastDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        IO.println();

        weatherData.setMeasurements(82, 70, 29.2f);
        IO.println();

        weatherData.setMeasurements(78, 90, 29.2f);
        IO.println();
    }
}
