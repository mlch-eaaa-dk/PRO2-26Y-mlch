package demoapplication.model;

import org.jspecify.annotations.NullMarked;

import java.io.Serializable;

@NullMarked
public class Student implements Serializable {
    private String name;
    private boolean active;
    private int age;

    public Student(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Navn: " + name + ", Alder: " + age + ", Aktiv: " + active;
    }
}
