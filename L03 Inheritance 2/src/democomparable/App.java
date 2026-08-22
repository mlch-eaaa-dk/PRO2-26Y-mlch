package democomparable;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    void main() {
        Person p1 = new Person("Jensen", 3000);
        Person p2 = new Person("Hansen", 2000);
        Person p3 = new Person("Olsen", 1000);

        if (p1.compareTo(p2) < 0) {
            IO.println(p1 + " er mindre end " + p2);
        } else if (p1.compareTo(p2) > 0) {
            IO.println(p1 + " er større end " + p2);
        } else {
            IO.println(p1 + " og " + p2 + " er lige store");
        }
        IO.println();

        ArrayList<Person> personer = new ArrayList<>();
        personer.add(p1);
        personer.add(p2);
        personer.add(p3);
        IO.println("Personer usorterede: " + personer);
        Collections.sort(personer);
        IO.println("Personer sorterede: " + personer);
    }
}
