package queue26Y;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class TestCircularArrayQueue26Y {
    void main() {
        CircularArrayQueue26Y<String> queue = new CircularArrayQueue26Y<>();

        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        queue.add("A");
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        queue.add("B");
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        queue.add("C");
        queue.add("D");
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        queue.add("E");
        IO.println("queue = " + queue);
        IO.println("queue.getItems()= " + Arrays.toString(queue.getItems()));
        IO.println();

        queue.add("F");
        IO.println("queue = " + queue);
        IO.println("queue.getItems()= " + Arrays.toString(queue.getItems()));
        IO.println();

        queue.add("G");
        IO.println("queue = " + queue);
        IO.println("queue.getItems()= " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("queue.element() = " + queue.element());
        IO.println("queue.size() = " + queue.size());
        IO.println("queue.isEmpty() = " + queue.isEmpty());
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue = " + queue);
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue.size() = " + queue.size());
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        IO.println("Removed = " + queue.remove());
        IO.println("queue.size() = " + queue.size());
        IO.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        IO.println();

        try {
            IO.println("Remove from empty queue: ");
            queue.remove();
        } catch (NoSuchElementException ex) {
            IO.println("\tNoSuchElementException is thrown");
        }
        try {
            IO.println("Element at front in empty queue:");
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
