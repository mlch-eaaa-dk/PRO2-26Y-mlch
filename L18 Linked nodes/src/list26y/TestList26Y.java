package list26y;

public class TestList26Y {
    void main() {
        City paris = new City("Paris", 12_000_000);
        City london = new City("London", 9_000_000);
        City amsterdam = new City("Amsterdam", 7_000_000);
        City rom = new City("Rom", 9_000_000);
        City oslo = new City("Oslo", 1_200_000);

        List26Y<City> list = new SingleLinkedList26Y<>();
//        List25V<City> list = new DoubleLinkedList26Y<>();
//        List25V<City> list = new ArrayList26Y<>();
        list.add(paris);
        IO.println(list);
        list.add(amsterdam);
        IO.println(list);
        list.add(london);
        IO.println(list);

        IO.println("Size: " + list.size());
        IO.println();

        // TODO Test the methods in the implementation of List25V
    }
}
