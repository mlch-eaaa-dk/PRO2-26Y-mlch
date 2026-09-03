package ex4;

public class Ex4 {
    void main() {
        IO.println("rev() = >" + reverse("") + "<");
        IO.println("rev(a) = " + reverse("a"));
        IO.println("rev(ab) = " + reverse("ab"));
        IO.println("rev(abc) = " + reverse("abc"));
        IO.println("rev(abcd) = " + reverse("abcd"));
        IO.println("rev(APRILSNAR) = " + reverse("APRILSNAR"));
    }

    /*
     * lastIndex = s.length-1
     * reverse2(s[0..lastIndex]) = s[lastIndex] + reverse2(s[1..lastIndex-1]) + s[0]   if s.length() >= 2
     * reverse2(s) = s   if s.length() <=1
     */

    // Recursive solution that creates new strings
    public String reverse1(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            int lastIndex = s.length() - 1;
            return s.charAt(lastIndex)
                + reverse1(s.substring(1, lastIndex))
                + s.charAt(0);
        }
    }

    public String reverse(String s) {
        return reverse(s, 0, s.length() - 1);
    }

    // Recursive solution that don't create new strings
    private String reverse(String s, int left, int right) {
        if (left == right) {
            return "" + s.charAt(left);
        } else if (right < left) {
            return "";
        } else {
            return s.charAt(left) + reverse(s, left + 1, right - 1) + s.charAt(right);
        }
    }
}
