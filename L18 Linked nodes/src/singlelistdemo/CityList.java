package singlelistdemo;

/** Elements in this list cannot be null. */
public class CityList {
    private Node head;

    /** Add the element to the start of this list. */
    public void add(City city) {
        Node newNode = new Node(city);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Remove and return the element at the start of the list.
     * Return null, if the list is empty.
     */
    public City removeFirst() {
        if (head == null) return null;

        City city = head.city;
        head = head.next;
        return city;
    }

    /**
     * Return true, if the given city is in the list.
     */
    public boolean contains(City city) {
        Node node = head;
        while (node != null) {
            if (node.city.equals(city)) return true;
            node = node.next;
        }
        return false;
    }

    /**
     * Remove the first occurrence of the given city from the list.
     * Return true, if the list is modified.
     */
    public boolean remove(City city) {
        if (head == null) return false;
        if (head.city.equals(city)) {
            head = head.next;
            return true;
        }
        Node node = head;
        while (node.next != null) {
            if (node.next.city.equals(city)) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //-----------------------------------------------------

    private static class Node{
        City city;
        Node next;

        public Node(City city) {
            this.city = city;
            this.next = null;
        }
    }

    //-----------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node node = head;
        while (node != null) {
            sb.append(node .city).append(", ");
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
