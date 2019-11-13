package CodingInterviews;

public class _13_RobotMove {

    public int movingCount(int threshold, int rows, int cols) {
        if (rows <= 0 || cols <= 0) return 0;

        boolean[][] visited = new boolean[rows][cols];
        return movingCountCore(threshold, 0, 0, rows, cols, visited);
    }

    private int movingCountCore(int threshold,
                                int row, int col,
                                int rows, int cols,
                                boolean[][] visited) {
        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return 0;
        }

        if (visited[row][col]) {
            return 0;
        }

        if (check(threshold, row, col)) {
            visited[row][col] = true;
            return 1 + movingCountCore(threshold, row - 1, col, rows, cols, visited)
                    + movingCountCore(threshold, row, col - 1, rows, cols, visited)
                    + movingCountCore(threshold, row + 1, col, rows, cols, visited)
                    + movingCountCore(threshold, row, col + 1, rows, cols, visited);
        }
        return 0;
    }

    private boolean check(int threshold, int row, int col) {
        int count = 0;
        while (row > 0) {
            count += row % 10;
            row = row / 10;
        }
        while (col > 0) {
            count += col % 10;
            col = col / 10;
        }
        return count <= threshold;
    }

}
