package demo;

import java.util.ArrayList;
import java.util.List;

public class Max {
    void main() {
        ArrayList<Integer> list = new ArrayList<>(
            List.of(8, 56, 45, 34, 15, 12, 34, 44)
        );
        int max = maximum(list);
        IO.println(max);
    }

    /** Pre: The list is not empty. */
    public int maximum(ArrayList<Integer> list) {
        return maximum(list, 0, list.size() - 1);
    }

    /**
     * Return maximum in list[l..h].
     * Pre: l <= h
     */
    private int maximum(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int max1 = maximum(list, l, m);
            int max2 = maximum(list, m + 1, h);
            return Math.max(max1, max2);
        }
    }
}
