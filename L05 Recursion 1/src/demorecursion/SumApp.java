package demorecursion;

public class SumApp {
    void main() {
        IO.println("Iterative: " + sumIterative(10));
        IO.println("Recursive: " + sumRecursive(10));
    }

    // Pre: n >= 1.
    public int sumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 1 + 2 + 3 + .. + n = (1 + 2 + 3 + .. + n-1) + n

    // Def. af funktion: sumRecursive(n) = 1 + 2 + 3 + .. + n
    // sumRecursive(n) = sumRecursive(n-1) + n
    
    // Pre: n >= 1.
    public int sumRecursive(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            result = sumRecursive(n - 1) + n;
        }
        return result;
    }
}
