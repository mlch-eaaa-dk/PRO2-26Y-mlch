package towers;

public class Towers {
    void main() {
        int n = 5;
        IO.println("towers(" + n + "):");
        towers(n);
        IO.println();
    }

    /** Pre: n >= 1; */
    public void towers(int n) {
        towers(n, 1, 3);
    }

    private void towers(int n, int from, int to) {
        if (n == 1) {
            IO.println("Move: " + from + " -> " + to);
        } else {
            int other = 6 - from - to;
            towers(n - 1, from, other);
            IO.println("Move: " + from + " -> " + to);
            towers(n - 1, other, to);
        }
    }
}
