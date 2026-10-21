package observer_ex3;

public class Buyer {
    private String name; // not empty

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBooks(Book b, int amount) {
        b.incCount(amount);
        IO.println("Buyer " + name + ": " + b + ", " + amount + " copies");
    }
}
