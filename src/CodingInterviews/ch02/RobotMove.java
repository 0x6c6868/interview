package CodingInterviews.ch02;

public class RobotMove {
    static int movingCount(int threshold, int rows, int cols) {
        if (rows <= 0 || cols <= 0) return 0;

        boolean[][] visited = new boolean[rows][cols];
        return movingCountCore(threshold, 0, 0, rows, cols, visited);
    }

    static int movingCountCore(int threshold,
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

    static boolean check(int threshold, int row, int col) {
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

    public static void main(String[] args) {
        System.out.println(movingCount(5, 10, 10) == 21);
        System.out.println(movingCount(15, 20, 20) == 359);
        System.out.println(movingCount(10, 1, 100) == 29);
        System.out.println(movingCount(10, 1, 10) == 10);
        System.out.println(movingCount(15, 100, 1) == 79);
        System.out.println(movingCount(15, 10, 1) == 10);
        System.out.println(movingCount(15, 1, 1) == 1);
        System.out.println(movingCount(0, 1, 1) == 1);
        System.out.println(movingCount(-10, 10, 10) == 0);
    }
}
