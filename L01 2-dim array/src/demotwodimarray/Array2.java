package demotwodimarray;

import java.util.Arrays;

public class Array2 {
    void main() {
        int[][] table = new int[7][5]; // 7 rs, 5 columns
        // 0 <= r < table.length, table length is 7
        // 0 <= column < table[r].length, table[r].length is 5 for all rs

        // set the table at r 5 and column 3 to 7
        table[5][3] = 7;

        // print table
        IO.println("Print table with double for loop:");
        for (int r = 0; r < table.length; r++) {
            IO.print("[");
            for (int c = 0; c < table[r].length; c++) {
                table[r][c] = r * 5 + c;
                IO.print(String.format("%3d", table[r][c]));
            }
            IO.print(" ]");
            IO.println();
        }
        IO.println();

        IO.println("Print table with Arrays.deepToString():");
        IO.println(Arrays.deepToString(table));
        IO.println();

        int[][] ragged = new int[4][]; // 4 rows, columns not defined yet
        // define columns
        ragged[0] = new int[5];
        ragged[1] = new int[4];
        ragged[2] = new int[5];
        ragged[3] = new int[2];

        // fill ragged
        for (int r = 0; r < ragged.length; r++) {
            for (int c = 0; c < ragged[r].length; c++) {
                ragged[r][c] = (r + 1) * 10 + c;
            }
        }

        // print ragged
        IO.println("Print ragged with double for-each loop:");
        for (int[] row : ragged) {
            IO.print("[");
            for (int value : row) {
                IO.print(String.format("%3d", value));
            }
            IO.print(" ]");
            IO.println();
        }
        IO.println();

        IO.println("Print ragged with Arrays.deepToString():");
        IO.println(Arrays.deepToString(ragged));
        IO.println();

        IO.println("Print ragged with for-each loop over rows:");
        for (int[] row : ragged) {
            IO.println(Arrays.toString(row));
        }
    }
}
