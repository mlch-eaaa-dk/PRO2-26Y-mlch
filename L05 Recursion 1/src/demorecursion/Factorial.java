package demorecursion;

public class Factorial {

//  n! = n * (n-1) * (n-2) * .. * 2 * 1

//  5! = 5 * 4 * 3 * 2 * 1
//  4! = 4 * 3 * 2 * 1
//  5! = 5 * 4!

// n! = n * (n-1)!          Recursive definition
//  1! = 1

// definition: f(n) = n!
// f(n) = n * f(n-1)        Recursive def. af metode (funktion)
// f(1) = 1

    public int fac(int n) {
        if (n== 1) {
            return 1;
        } else {
            return n* fac(n-1);
        }
    }

    public int fac1(int n) {
        int result; // result er fac1(n)
        if (n== 1) {
            result =  1;
        } else {
            result = n * fac1(n-1);  // fac1(n) = n * fac1(n-1)
        }
        return result;
    }

    void main() {
        IO.print(String.format("%8s", "i:"));
        for (int i = 1; i < 10; i++) {
            IO.print(String.format("%8d", i));
        }
        IO.println();

        IO.print(String.format("%8s", "fac(i):"));
        for (int i = 1; i < 10; i++) {
            IO.print(String.format("%8d", fac(2)));
        }
        IO.println();
    }

    // iterative
    public int facIt(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
