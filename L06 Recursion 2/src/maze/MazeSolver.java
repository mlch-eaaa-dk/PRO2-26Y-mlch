package maze;

public class MazeSolver {
    private final int[][] maze = {
        {1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
        {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
        {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
        {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
        {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    private static final int W = 0; // Wall
    private static final int F = 1; // Free
    private static final int T = 3; // Tried
    private static final int H = 8; // Head

    private final int rowOut = maze.length - 1, colOut = maze[rowOut].length - 1;

    private boolean isInside(int row, int col) {
        return 0 <= row && row < maze.length && 0 <= col && col < maze[row].length;
    }

    private boolean isFree(int row, int col) {
        return isInside(row, col) && maze[row][col] == F;
    }

    private boolean isDeadEnd(int row, int col) {
        // order: down, right, up, left
        return !isFree(row + 1, col) &&
            !isFree(row, col + 1) &&
            !isFree(row - 1, col) &&
            !isFree(row, col - 1);
    }

    private void printLine() {
        IO.print('+');
        for (int col = 0; col < maze[0].length; col++) {
            IO.print('-');
        }
        IO.println('+');
    }

    private void printMaze() {
        printLine();
        for (int row = 0; row < maze.length; row++) {
            IO.print('|');
            for (int col = 0; col < maze[row].length; col++) {
                switch (maze[row][col]) {
                    case W -> IO.print('+');
                    case F -> IO.print('.');
                    case T -> IO.print('o');
                    case H -> IO.print('D');
                }
            }
            IO.println('|');
        }
        printLine();
    }

    public void traverse(int row, int col) {
        if (row == rowOut && col == colOut) {
            maze[row][col] = H;
            IO.println("SOLVED:");
            printMaze();
            IO.println();
            maze[row][col] = F;
        } else {
            if (isDeadEnd(row, col)) {
                maze[row][col] = H;
//                IO.println("Death end:");
//                printMaze();
//                IO.println();
                maze[row][col] = F;
            } else {
                maze[row][col] = T;
                // order: down, right, up, left
                if (isFree(row + 1, col))
                    traverse(row + 1, col);
                if (isFree(row, col + 1))
                    traverse(row, col + 1);
                if (isFree(row - 1, col))
                    traverse(row - 1, col);
                if (isFree(row, col - 1))
                    traverse(row, col - 1);
                maze[row][col] = F;
            }
        }
    }

    void main() {
        IO.println("Maze:");
        printMaze();
        IO.println();

        traverse(0, 0);
    }
}
