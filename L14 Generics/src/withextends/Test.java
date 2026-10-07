package withextends;

import java.util.ArrayList;

public class Test {
    void main() {
        Person p = new Mechanic("", 3); // allowed, because Mechanic is a subclass to Person

        //---------------------------------------------------------------------

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans"));
        persons.add(new Person("Anders"));

        ArrayList<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("Mads", 250));
        mechanics.add(new Mechanic("Keld", 280));

//        persons = mechanics; // not allowed, because ArrayList<Mechanic> is NOT a subclass to ArrayList<Person>

        IO.print("printPersonNames(persons): ");
        printPersonNames(persons);
        IO.println();
        // printPersonNames(mechanics); // not allowed, because ArrayList<Mechanic> is NOT a subclass to ArrayList<Person>

        IO.print("printMechanicNames(mechanics): ");
        printMechanicNames(mechanics);
        IO.println();

        IO.print("printNames(persons): ");
        printNames(persons); // allowed, because ArrayList<? extends Person> can reference any ArrayList<A>, where A is a subclass to Person
        IO.println();
        IO.print("printNames(mechanics): ");
        printNames(mechanics); // allowed, because ArrayList<? extends Person> can reference any ArrayList<A>, where A is a subclass to Person
        IO.println();

        //---------------------------------------------------------------------

//        List<String> strings = new ArrayList<>(List.of("Kurt", "Viggo"));
//        List<Integer> integers = new ArrayList<>(List.of(1, 2));
//        IO.println(strings.getClass()); // java.util.ArrayList, type erasure of <String>
//        IO.println(integers.getClass()); // java.util.ArrayList, type erasure of <Integer>
//        IO.println(strings.getClass() == integers.getClass()); // true
    }

    public void printPersonNames(ArrayList<Person> list) {
        for (Person p : list) {
            IO.print(p.getName() + " ");
        }
        IO.println();
    }

    public void printMechanicNames(ArrayList<Mechanic> list) {
        for (Mechanic p : list) {
            IO.print(p.getName() + " ");
        }
        IO.println();
    }

    public static <E extends Person> void printNames(ArrayList<E> list) {
        for (E p : list) {
            IO.print(p.getName() + " ");
        }
        IO.println();
    }
}
