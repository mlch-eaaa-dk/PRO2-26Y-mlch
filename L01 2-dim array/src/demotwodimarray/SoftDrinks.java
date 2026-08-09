package demotwodimarray;

public class SoftDrinks {

    void main() {
        // Testing 5 soft drinks, grades from 7 testers
        int[][] grades = {
            //0  1  2  3  4 <- soft drink no.
            {3, 4, 3, 2, 1}, // tester no. 0
            {4, 1, 3, 3},    // tester no. 1
            {3, 1, 1, 1, 5}, // tester no. 2
            {2, 3, 3, 3, 2}, // tester no. 3
            {3, 3, 3},       // tester no. 4
            {4, 1, 1, 4, 4}, // tester no. 5
            {4, 2, 2, 3, 2}  // tester no. 6
        };
        // 0 <= row < grades.length
        // 0 <= column < grades[row].length

        // Total number of grades
        int totalGradeCount = 0;
        for (int r = 0; r < grades.length; r++) {
            totalGradeCount += grades[r].length;
        }
        IO.println("Total number of grades is " + totalGradeCount);

        // Sum of all the grades
        int totalGradeSum = 0;
        for (int r = 0; r < grades.length; r++) {
            for (int c = 0; c < grades[r].length; c++) {
                totalGradeSum += grades[r][c];
            }
        }
        IO.println("Sum of all grades is " + totalGradeSum);
        IO.println(String.format(
            "Average of all grades is %.2f ", (double) totalGradeSum / totalGradeCount
        ));
        IO.println();

        // Average grade for each tester
        for (int r = 0; r < grades.length; r++) {
            int rowGradeSum = 0;
            for (int c = 0; c < grades[r].length; c++) {
                rowGradeSum += grades[r][c];
            }
            double testerAverage = (double) rowGradeSum / grades[r].length;
            IO.println(String.format(
                "Average of grades for tester %d: %.2f.\n", r, testerAverage
            ));
        }
        IO.println();

        // Average grade for each soft drink
        int drinkCount = 5; // can be calculated as max row length
        double[] drinkAverage = new double[drinkCount];
        for (int c = 0; c < drinkCount; c++) {
            int colGradeSum = 0;
            int colGradeCount = 0;
            for (int r = 0; r < grades.length; r++) {
                if (c < grades[r].length) {
                    colGradeSum += grades[r][c];
                    colGradeCount++;
                }
            }
            drinkAverage[c] = colGradeCount != 0 ? (double) colGradeSum / colGradeCount : 0.0;
            IO.println(String.format(
                "Average of grades for soft drink no. %d: %.2f.",
                c, drinkAverage[c]
            ));
        }
        IO.println();

        // Best average
        double maxAverage = drinkAverage[0];
        int indexOfMax = 0;
        for (int i = 0; i < drinkAverage.length; i++) {
            if (drinkAverage[i] > maxAverage) {
                maxAverage = drinkAverage[i];
                indexOfMax = i;
            }
        }
        IO.println(String.format(
            "Best soft drink is no. %d with average: %.2f\n", indexOfMax, maxAverage
        ));
        IO.println();
    }
}
