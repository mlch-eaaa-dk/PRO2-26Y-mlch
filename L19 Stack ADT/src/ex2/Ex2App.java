package ex2;

public class Ex2App {
    void main() {
        String s1 = "(3+{5[99{*}]}[23[{67}67]])";
        String s2 = "(3+{5[99{*}]}[23[{67}67]]";
        String s3 = "({)}";
        String s4 = "}{";
        IO.println("isBalanced on " + s1 + "? " + isBalanced(s1));
        IO.println("isBalanced on " + s2 + "? " + isBalanced(s2));
        IO.println("isBalanced on " + s3 + "? " + isBalanced(s3));
        IO.println("isBalanced on " + s4 + "? " + isBalanced(s4));
    }

    /**
     * Check if the given string has balanced parentheses, curly braces and square brackets.
     * Note: This method is implemented using a stack.
     */
    public static boolean isBalanced(String s) {
        // TODO
        return false;
    }
}
