package ureksempel;

import java.util.ArrayList;
import java.util.List;

// Subject
public class UrEngine {
    private int tid = 0;

    public int getTid() {
        return tid;
    }

    public void tiktak() {
        tid++;
        notifyObservers();
    }

    //-----------------------------------------------------

    private final List<Observer> observers = new ArrayList<>();

    public void addUrObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() { // pull
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

//    private void notifyObservers() { // push
//        for (Observer observer : observers) {
//            observer.update(tid);
//        }
//    }

//    private void notifyObservers() { // pull generalized
//        for (Observer observer : observers) {
//            observer.update();
//        }
//    }
}
