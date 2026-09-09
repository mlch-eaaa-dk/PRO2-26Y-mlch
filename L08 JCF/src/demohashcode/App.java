package demohashcode;

import java.util.HashSet;
import java.util.Set;

public class App {
    void main() {
        Student jens = new Student(100, "Jens");
        Student ulla = new Student(102, "Ulla");
        Student hans = new Student(101, "Hans");

        Set<Student> students = new HashSet<>(Set.of(jens, ulla, hans));

        IO.println(students);

        students.add(new Student(102, "Ulla"));
        IO.println(students);
        IO.println();

        IO.println("Is ulla equal to new ulla: " + ulla.equals(new Student(102, "Ulla")));
        IO.println();

        IO.println("ulla's hashCode = " + ulla.hashCode());
        IO.println("new ulla's hashcode = " + new Student(102,"Ulla").hashCode());
    }
}
