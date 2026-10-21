package observer_ex4;

public interface Subject {
    void addObserver(ColorObserver observer);
    void removeObserver(ColorObserver observer);
    void notifyObservers();
}
