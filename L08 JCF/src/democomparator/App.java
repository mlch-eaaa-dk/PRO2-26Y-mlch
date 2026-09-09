package democomparator;

import java.util.ArrayList;
import java.util.List;

public class App {
    void main() {
        Student jens = new Student(100, "Jens");
        Student ulla = new Student(102, "Ulla");
        Student hans = new Student(101, "Hans");

        List<Student> students = new ArrayList<>(List.of(jens, ulla, hans));

        IO.println("Unsorted:");
        IO.println(students);
        IO.println();

        IO.println("Sorted by natural ordering (Comparable<Student>):");
        students.sort(null);
        IO.println(students);
        IO.println();

        IO.println("Sorted by StudentNameComparator<Student>):");
        students.sort(new StudentNameComparator());
        IO.println(students);
        IO.println();

//        Collections.sort(students);
//        Collections.sort(students, new StudentNameComparator());
    }
}
