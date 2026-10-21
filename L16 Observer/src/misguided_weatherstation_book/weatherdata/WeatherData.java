package misguided_weatherstation_book.weatherdata;

import misguided_weatherstation_book.displays.CurrentConditionsDisplay;
import misguided_weatherstation_book.displays.ForecastDisplay;
import misguided_weatherstation_book.displays.StatisticsDisplay;

// The book uses getter-methods with temperature, humidity and pressure.
// The getters are not included in the code below.
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData() {
        currentConditionsDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public void measurementsChanged() {
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
