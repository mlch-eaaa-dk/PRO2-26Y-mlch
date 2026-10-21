package observer_weatherstation_book.weatherdata;

import observer_weatherstation_book.displays.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
