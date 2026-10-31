package stack26y;

public class TestStack26Y {
    void main() {
        Stack26Y<String> stack = new SingleLinkedStack26Y<>();
//        Stack26Y<String> stack = new ListStack26Y<>();
//        Stack26Y<String> stack = new ArrayStack26Y<>();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");
        stack.push("Thomas");
        stack.push("Bob");
        stack.push("Brian");
        IO.println(stack);

        IO.println(stack.peek());
        IO.println(stack.isEmpty() + " " + stack.size());
        IO.println();

        while (!stack.isEmpty()) {
            IO.println(stack.pop());
        }
        IO.println();

        IO.println(stack.isEmpty() + " " + stack.size());
        IO.println();

        // -------- test of reverse --------
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        for (int number : numbers) {
            IO.print(number + " ");
        }
    }

    /** Reverse the order of the elements in the table. */
    public static <E> void reverse(E[] table) {
        Stack26Y<E> stack = new SingleLinkedStack26Y<>();
        // Stack26Y<E> stack = new ListStack26Y<>();
        // Stack26Y<E> stack = new ArrayStack26Y<E>();
        for (E e : table) {
            stack.push(e);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            table[i] = stack.pop();
            i++;
        }
    }
}
