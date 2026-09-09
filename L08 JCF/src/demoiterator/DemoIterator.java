package demoiterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DemoIterator {
    void main() {
        Set<Runner> runners = new LinkedHashSet<>(List.of(
            new Runner("Ib", 30),
            new Runner("Per", 50),
            new Runner("Ole", 27),
            new Runner("Ulla", 40),
            new Runner("Jens", 35),
            new Runner("Hans", 28)
        ));
        IO.println(runners);
        IO.println();

        IO.println("All runners (printed using iterator):");
        Iterator<Runner> it = runners.iterator();
        while (it.hasNext()) {
            Runner runner = it.next();
            IO.println(runner.getName() + " " + runner.getLapTime() + " sec");
        }
        IO.println();

        // for-each sætningen er syntaktisk sukker for brug af en iterator
        IO.println("All runners (printed using for-each statement):");
        for (Runner runner : runners) {
            IO.println(runner.getName() + " " + runner.getLapTime() + " sec");
        }
        IO.println();

        IO.println("All runners with laptime < 40 (printed using iterator):");
        Iterator<Runner> it2 = runners.iterator();
        while (it2.hasNext()) {
            Runner runner = it2.next();
            if (runner.getLapTime() < 40) {
                IO.println(runner.getName() + " " + runner.getLapTime() + " sec");
            }
        }
        IO.println();

        IO.println("All runners with laptime < 40 (printed using for-each statement):");
        for (Runner runner : runners) {
            if (runner.getLapTime() < 40) {
                IO.println(runner.getName() + " " + runner.getLapTime() + " sec");
            }
        }
        IO.println();

        IO.println("After runners with laptime >= 40 are removed (printed using iterator):");
        Iterator<Runner> it3 = runners.iterator();
        while (it3.hasNext()) {
            Runner runner = it3.next();
            if (runner.getLapTime() >= 40) {
//                runners.remove(runner); // ConcurrentModificationException !!
                 it3.remove();
            }
        }
        IO.println(runners);
        IO.println();

//        IO.println("After runners with laptime >= 30 are removed (printed using for-each statement):");
//        for (Runner runner : runners) {
//            if (runner.getLapTime() >= 30) {
//                runners.remove(runner); // ConcurrentModificationException !!
//            }
//        }
//        IO.println(runners);
//        IO.println();


//        IO.println("All runners (printed using forEach() method):");
//        runners.forEach(
//            (Runner runner) -> IO.println(runner.getName() + " " + runner.getLapTime() + " sec")
//        );
    }
}
