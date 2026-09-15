package ex1;

import java.util.List;
import java.util.function.Predicate;

public class Ex1 {
    void main() {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        IO.println(persons);
        IO.println();

        IO.println("Persons:");
        persons.forEach((Person p) -> IO.println(p));
        IO.println();
        IO.println();

    }

    /**
     * Return from the list the first person
     * that satisfies the predicate.
     * Return null if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }
}
