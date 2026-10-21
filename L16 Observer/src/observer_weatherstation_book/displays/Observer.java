package observer_weatherstation_book.displays;

public interface Observer {
    // subject is pushing its state to observers
    void update(float temp, float humidity, float pressure); // push
}
