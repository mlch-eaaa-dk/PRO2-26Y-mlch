package maze;

public class MazeSearch {
    private final int[][] maze = {
            {1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    private static final int Wall = 0;
    private static final int Free = 1;
    private static final int Tried = 3;
    private static final int Path = 7;

    private final int rOut = maze.length - 1, cOut = maze[rOut].length - 1;

    private boolean isValidSquare(int row, int col) {
        return 0 <= row && row < maze.length &&
                0 <= col && col < maze[row].length &&
                maze[row][col] == Free;
    }

    private void printMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                switch (maze[row][col]) {
                    case Wall -> IO.print('+');
                    case Free -> IO.print('.');
                    case Tried -> IO.print('ø');
                    case Path -> IO.print('o');
                }
            }
            IO.println();
        }
    }

    public boolean traverse(int row, int col) {
        if (!isValidSquare(row, col))
            return false;

        if (row == rOut && col == cOut) {
            maze[row][col] = Path;
            return true;
        } else {
            maze[row][col] = Tried;

            boolean done = traverse(row + 1, col);  // down
            if (!done)
                done = traverse(row, col + 1);      // right
            if (!done)
                done = traverse(row - 1, col);      // up
            if (!done)
                done = traverse(row, col - 1);      // left

            if (done)
                maze[row][col] = Path;

            return done;
        }
    }

    void main() {
        IO.println("Maze:");
        printMaze();
        IO.println();

        boolean isTraversable = traverse(0, 0);

        printMaze();
        IO.println();
        if (isTraversable)
            IO.println("The maze was successfully traversed!");
        else
            IO.println("The maze has no possible path.");
    }
}
