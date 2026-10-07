package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
    void main() {
        ArrayList<String> names = new ArrayList<>(List.of("Per", "Jens", "Ulla"));
        // printStrings(names);
        print(names);
        IO.println();

        ArrayList<Integer> numbers = new ArrayList<>(List.of(11, 12, 13));
        // printIntegers(numbers);
        print(numbers);
        IO.println();
    }

    public void printStrings(ArrayList<String> list) {
        for (String element : list) {
            IO.print(element + "  ");
        }
    }

    public static void printIntegers(ArrayList<Integer> list) {
        for (Integer element : list) {
            IO.print(element + "  ");
        }
    }

    public static <E> void print(ArrayList<E> list) {
        for (E element : list) {
            IO.print(element + "  ");
        }
    }
}
