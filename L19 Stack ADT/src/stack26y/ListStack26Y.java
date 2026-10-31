package stack26y;

import java.util.LinkedList;

// OPGAVE 1 med LinkedList<E>.
public class ListStack26Y<E> implements Stack26Y<E> {
    // Implements a stack using a LinkedList.
    // The top of the stack is at the beginning of the LinkedList.

    // stack contains the elements in the stack
    private LinkedList<E> stack = new LinkedList<>();

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        stack.push(entry);
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException if the stack is empty.
     */
    @Override
    public E pop() {
        // TODO
        return null;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException if the stack is empty.
     */
    @Override
    public E peek() {
        // TODO
        return null;
    }

    /**
     * Return true if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    /**
     * Remove all elements from this stack.
     */
    @Override
    public void clear() {
        // TODO
    }

    /**
     * Return the number of elements in this stack.
     */
    @Override
    public int size() {
        // TODO
        return 0;
    }
}
