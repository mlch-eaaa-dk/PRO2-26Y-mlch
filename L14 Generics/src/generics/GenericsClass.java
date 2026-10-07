package generics;

import java.util.ArrayList;

public class GenericsClass {
    void main() {
        Stack<String> stack = new Stack<>();
        stack.push("Ib");
        stack.push("Ulla");
        stack.push("Per");
        // stack.push(123);
        IO.println("Stack: " + stack);
        IO.println();

        String s = stack.pop();
        IO.println("Popped " + s.charAt(0));
        IO.println("Popped " + stack.pop());
        IO.println("Stack: " + stack);

        Stack<Integer> intStack = new Stack<>();
        intStack.push(11); // auto boxing
        intStack.push(12);
        intStack.push(13);
        IO.println("Stack: " + intStack);
        IO.println();

        int e = intStack.pop();  // auto unboxing
        IO.println("Popped " + e); //
        IO.println("Popped " + intStack.pop());
        IO.println("Stack: " + intStack);
    }
}

class Stack<E> {
    private final ArrayList<E> items = new ArrayList<>();

    /** Push an item to the top of the stack. */
    public void push(E item) {
        items.add(item);
    }

    /** Pop an item from the top of the stack.
     Throw a RuntimeException if the stack is empty */
    public E pop() {
        if (items.isEmpty()) throw new RuntimeException("Stack is empty");
        return items.removeLast();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
