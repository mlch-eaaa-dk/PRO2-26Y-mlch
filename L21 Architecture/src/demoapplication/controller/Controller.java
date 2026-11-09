package demoapplication.controller;

import demoapplication.gui.Observer;
import demoapplication.model.Student;
import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;
import java.util.List;

@NullMarked
public abstract class Controller {
    private static Storage storage;

    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    //-----------------------------------------------------

    /**
     * Create a new Student.
     * Pre: name not empty, age >= 0.
     */
    public static Student createStudent(String name, int age, boolean active) {
        Student student = new Student(name, age, active);
        storage.storeStudent(student);
        notifyObservers();
        return student;
    }

    /** Delete the student. */
    public static void deleteStudent(Student student) {
        storage.deleteStudent(student);
        notifyObservers();
    }

    //-----------------------------------------------------

    public static List<Student> getStudents() {
        return storage.getStudents();
    }

    //-----------------------------------------------------

    private static final List<Observer> observers = new ArrayList<>();

    public static void addObserver(Observer observer) {
        observers.add(observer);
    }

    private static void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
