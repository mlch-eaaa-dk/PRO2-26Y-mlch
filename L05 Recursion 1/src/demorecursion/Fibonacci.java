package demorecursion;

public class Fibonacci {

    //  index | 0 | 1 | 2 | 3 | 4 | 5 |  6 |  7 |  8 |
    //  ------+---+---+---+---+---+---+----+----+----+
    //  value | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34 |

    // the next value is the sum of the 2 previous values

    // value at index i = (value at index i-2) + (value at index i-1)

    // Def: fib(i) = value at index i

    // fib(i) = fib(i-2) + fib(i-1)
    // fib(0) = 1
    // fib(1) = 0;

    public long fib(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return fib(i-2) + fib(i-1);
        }
    }

    void main() {
        IO.println(String.format("%3s   %6s", "n", "fib(n)"));
        IO.println(String.format("%4s===%6s=", "====", "======"));

        for (int n = 0; n <= 60; n++) {
            IO.println(String.format("%3d   %,d", n, fibIt(n)));
        }
        IO.println();
    }

    // iterative
    public static long fibIt(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            long fib_2 = 1;   // fib(n-2)
            long fib_1 = 1;   // fib(n-1)
            long fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = fib_1 + fib_2;   // fib(n)
                fib_2 = fib_1;
                fib_1 = fib;
            }
            return fib;
        }
    }
}
