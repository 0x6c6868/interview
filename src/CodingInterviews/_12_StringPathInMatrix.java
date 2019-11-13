package CodingInterviews;

public class _12_StringPathInMatrix {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        if (matrix == null || rows <= 0 || cols <= 0) {
            return false;
        }

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathCore(matrix, rows, cols, i, j, visited, str, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathCore(char[] matrix,
                                int rows, int cols,
                                int row, int col,
                                boolean[][] visited,
                                char[] str, int index) {
        // 到底了
        if (index >= str.length) {
            return true;
        }

        // 访问越界
        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return false;
        }

        // 访问过了
        if (visited[row][col] == true) return false;

        // 当前向下继续访问
        if (matrix[row * cols + col] == str[index]) {
            visited[row][col] = true;
            boolean hasPath = hasPathCore(matrix, rows, cols, row - 1, col, visited, str, index + 1) ||
                    hasPathCore(matrix, rows, cols, row, col - 1, visited, str, index + 1) ||
                    hasPathCore(matrix, rows, cols, row + 1, col, visited, str, index + 1) ||
                    hasPathCore(matrix, rows, cols, row, col + 1, visited, str, index + 1);
            if (hasPath) {
                return hasPath;
            }
            visited[row][col] = false;
        }
        return false;
    }

}
