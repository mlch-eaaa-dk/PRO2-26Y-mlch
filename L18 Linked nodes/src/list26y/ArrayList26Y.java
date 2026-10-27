package list26y;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.util.Arrays;
import java.util.Iterator;

/**
 * An array-based implementation of the List ADT.
 * The list cannot contain null elements.
 */
@NullMarked
public class ArrayList26Y<E> implements List26Y<E>, Iterable<E> {
    // data contains elements at index 0...size-1 and null else
    @SuppressWarnings("unchecked")
    private @Nullable E[] elements = (E[]) new Object[4];
    // size is the size of the list
    // (and also the index of the first not-used entry in data)
    private int size = 0;

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = e;
        size++;
    }

    /**
     * Remove the first occurrence of the element from this list.
     * Return true if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        // TODO
        return false;
    }

    /**
     * Return true if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        // TODO
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return true if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        // TODO
        return null;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        // TODO
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException if index < 0 or index >= size().
     */
    @Override
    public E removeAt(int index) {
        // TODO
        return null;
    }

    /**
     * Return the index of the element in this list.
     * Return -1 if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        // TODO
        return -1;
    }

    //-------------------------------------------

    @Override
    public String toString() {
        // TODO return list as a string (without nulls)
        return null;
    }

    //-------------------------------------------

    /**
     * Return an iterator over this list.
     */
    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }
}
