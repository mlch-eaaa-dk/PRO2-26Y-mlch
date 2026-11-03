package queue26Y;

import java.util.NoSuchElementException;

public class TestQueue26Y {
    void main() {
        Queue26Y<String> queue = new DoubleLinkedQueue26Y<>();
//        Queue26Y<String> queue = new ArrayQueue26Y<>();
//        Queue26Y<String> queue = new SingleLinkedQueue26Y<>();

        IO.println("Empty queue = " + queue);
        IO.println();

        queue.add("A");
        IO.println("One element queue = " + queue);
        IO.println();

        queue.add("B");
        IO.println("two element queue = " + queue);
        IO.println();

        queue.add("C");
        queue.add("D");
        queue.add("E");
        IO.println("Five element queue = " + queue);
        IO.println("queue.element() = " + queue.element());
        IO.println();

        IO.println("queue.size() = " + queue.size());
        IO.println("queue.isEmpty() = " + queue.isEmpty());
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.element() = " + queue.element());
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.element() = " + queue.element());
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println();

        IO.println("queue.isEmpty() = " + queue.isEmpty());
        IO.println("queue.size() = " + queue.size());
        IO.println();

        try {
            IO.println("Remove from empty queue:");
            queue.remove();
        } catch (NoSuchElementException ex) {
            IO.println("\tNoSuchElementException is thrown");
        }
        try {
            IO.println("Element at head in empty queue:");
            queue.element();
        } catch (NoSuchElementException ex) {
            IO.println("\tNoSuchElementException is thrown");
        }
        IO.println();


        queue.add("A");
        queue.add("B");
        IO.println("queue = " + queue);
        IO.println();

        queue.clear();
        IO.println("After queue.clear():");
        IO.println("queue = " + queue);
        IO.println("queue.size() = " + queue.size());
    }
}
