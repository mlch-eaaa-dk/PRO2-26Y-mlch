package observer_ex3;

public class Ex3App {
    void main() {
        // TODO: create a salesman and a purchaser

        Book donaldDuck = new Book("Donald Duck");

        // TODO: add observers

        // TODO: make buyer buy 6 copies of Donald Duck
        IO.println();

        Book java = new Book("Java");

        // TODO: add observers

        // TODO: make buyer buy 8 copies of Java
        IO.println();

        Book designPatterns = new Book("Design Patterns");

        // TODO: add observers

        // TODO: make buyer buy 10 copies of Design Patterns
        IO.println();

        // Customers
        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        //---------------------------------------------------------------------

        makeSale(donaldDuck, bob);
        IO.println();
        makeSale(donaldDuck, alice);
        IO.println();
        makeSale(donaldDuck, harry);
        IO.println();

        makeSale(java, bob);
        IO.println();
        makeSale(java, alice);
        IO.println();
        makeSale(java, harry);
        IO.println();

        makeSale(designPatterns, bob);
        IO.println();

        // TODO: print each customer and his/her books
    }

    public static void makeSale(Book b, Customer c) {
        IO.println("Sale: " + b + " sold to " + c.getName());
        // TODO: link customer and book
        b.decCount(1);
    }
}
