package ex3; // OPGAVE 3

public class Ex3App {
    void main() {
        String input1 = "ABCDEFGFEDCBA";
        String input2 = "ABCCA";
        String input3 = "A";

        IO.println("Is " + input1 + " a palindrome? " + isPalindrome(input1));
        IO.println("Is " + input2 + " a palindrome? " + isPalindrome(input2));
        IO.println("Is " + input3 + " a palindrome? " + isPalindrome(input3));
    }

    /**
     * Check if the given string is a palindrome, after converting characters to lowercase
     * and ignoring non-alphanumeric characters (characters not in a-z and 0..9).
     * Note: This method is implemented using a stack.
     */
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        // Remove non-alphanumeric characters and convert to lowercase.
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // TODO
        return false;
    }
}
