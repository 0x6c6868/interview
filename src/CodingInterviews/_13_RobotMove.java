package CodingInterviews;

public class _13_RobotMove {

    public int movingCount(int threshold, int rows, int cols) {
        if (threshold <= 0 || rows <= 0 || cols <= 0) return 0;
        int[] visited = new int[rows * cols];
        return movingCountCore(threshold, rows, cols, visited, 0, 0);
    }

    private int movingCountCore(int threshold, int rows, int cols,
                                int[] visited, int x, int y) {
        if (x < 0 || y < 0 || x >= rows || y >= cols) return 0;
        if (visited[x * cols + y] == 1) return 0;

        int count = 0;
        int curr = x;
        while (curr != 0) {
            count += curr % 10;
            curr /= 10;
        }
        curr = y;
        while (curr != 0) {
            count += curr % 10;
            curr /= 10;
        }
        if (count > threshold) return 0;

        visited[x * cols + y] = 1;
        return 1 + movingCountCore(threshold, rows, cols, visited, x - 1, y) +
                movingCountCore(threshold, rows, cols, visited, x + 1, y) +
                movingCountCore(threshold, rows, cols, visited, x, y - 1) +
                movingCountCore(threshold, rows, cols, visited, x, y + 1);
    }

}
