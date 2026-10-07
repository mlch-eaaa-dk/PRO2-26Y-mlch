package withsuper;

public class Test {
    void main() {
        Person p1 = new Person("Ib");
        Person p2 = new Person("Ulla");
        Person p3 = new Person("Per");

        Mechanic m1 = new Mechanic("Keld", 200);
        Mechanic m2 = new Mechanic("Hans", 300);
        Mechanic m3 = new Mechanic("Jens", 400);

        Person maxP = maxP(p1, p2, p3);
        IO.println(maxP);
        IO.println();

        Mechanic maxM = maxM(m1, m2, m3); // maxP(m1, m2, m3) not allowed
        IO.println(maxM);
        IO.println();

        IO.println(max("Ib", "Ulla", "Per"));
        IO.println(max(2, 7, 4));
        IO.println(max(3.1, 2.0, 1.4));
        IO.println();
    }

    public Person maxP(Person x, Person y, Person z) {
        Person max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public Mechanic maxM(Mechanic x, Mechanic y, Mechanic z) {
        Mechanic max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public <T extends Comparable<? super T>> T max(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
}
