package CodingInterviews;

public class _12_StringPathInMatrix {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0
                || rows <= 0 || cols <= 0
                || str == null || str.length == 0) return false;

        int[] visited = new int[rows * cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (hasPathCore(matrix, rows, cols, i, j, visited, str, 0)) return true;

        return false;
    }

    public boolean hasPathCore(char[] matrix, int rows, int cols, int x, int y,
                               int[] visited, char[] str, int i) {
        if (i >= str.length) return true;
        if (x < 0 || x >= rows || y < 0 || y >= cols) return false;
        if (visited[x * cols + y] == 1) return false;
        if (matrix[x * cols + y] != str[i]) return false;

        visited[x * cols + y] = 1;
        boolean flag = hasPathCore(matrix, rows, cols, x - 1, y, visited, str, i + 1)
                || hasPathCore(matrix, rows, cols, x + 1, y, visited, str, i + 1)
                || hasPathCore(matrix, rows, cols, x, y - 1, visited, str, i + 1)
                || hasPathCore(matrix, rows, cols, x, y + 1, visited, str, i + 1);

        if (flag) return true;
        visited[x * cols + y] = 0;
        return false;
    }

}
