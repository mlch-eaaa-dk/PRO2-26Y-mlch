package observer_weatherstation_simplified.displays;

public interface Observer {
    // subject is pushing its state to observers
    void update(float temp, float humidity, float pressure); // push

//    // observers are pulling the subject's state
//    void update(WeatherData weatherData); // pull

}
