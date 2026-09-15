package ex4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    void main() {
        List<Runner> runners = new ArrayList<>(List.of(
            new Runner("Ib", 30),
            new Runner("Per", 50),
            new Runner("Ole", 27),
            new Runner("Ulla", 40),
            new Runner("Jens", 35),
            new Runner("Hans", 28)
        ));
        IO.println(runners);
        IO.println();

        // OBS: Throws exception.
        for (Runner runner : runners) {
            if (runner.getLapTime() >= 40) {
                runners.remove(runner);
            }
        }
        IO.println(runners);
        IO.println();
    }
}