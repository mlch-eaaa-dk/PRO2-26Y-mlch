package observer_weatherstation_book.displays;

import observer_weatherstation_book.weatherdata.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) { // push
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;

        this.display();
    }

    @Override
    public void display() {
        IO.println("*** Statistics ***");
        IO.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp
        );
    }
}
