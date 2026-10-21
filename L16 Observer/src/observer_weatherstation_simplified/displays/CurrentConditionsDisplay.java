package observer_weatherstation_simplified.displays;

public class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) { // push
        IO.println("*** Current conditions ***");
        IO.println(temperature + "F degrees and " + humidity + "% humidity");
    }

//    @Override
//    public void update(WeatherData weatherData) { // pull
//        float temperature = weatherData.getTemperature();;
//        float humidity = weatherData.getHumidity();
//
//        IO.println("*** Current conditions ***");
//        IO.println(temperature + "F degrees and " + humidity + "% humidity");
}
