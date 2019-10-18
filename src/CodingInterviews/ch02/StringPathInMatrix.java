package CodingInterviews.ch02;

public class StringPathInMatrix {

    static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

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

    static boolean hasPathCore(char[] matrix,
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

    public static void main(String[] args) {
        char[] matrix1 = {
                'A', 'B', 'T', 'G',
                'C', 'F', 'C', 'S',
                'J', 'D', 'E', 'H'
        };
        System.out.println(hasPath(matrix1, 3, 4, new char[]{'B', 'F', 'C', 'E'}));

        char[] matrix2 = {
                'A', 'B', 'C', 'E',
                'S', 'F', 'C', 'S',
                'A', 'D', 'E', 'E'
        };
        System.out.println(hasPath(matrix2, 3, 4, new char[]{'A', 'B', 'C', 'C', 'E', 'D'}));

        char[] matrix3 = {
                'A', 'B', 'T', 'G',
                'C', 'F', 'C', 'S',
                'J', 'D', 'E', 'H'
        };
        System.out.println(!hasPath(matrix3, 3, 4, new char[]{'A', 'B', 'F', 'B'}));

        char[] matrix4 = {
                'A', 'B', 'C', 'E', 'H', 'J', 'I', 'G',
                'S', 'F', 'C', 'S', 'L', 'O', 'P', 'Q',
                'A', 'D', 'E', 'E', 'M', 'N', 'O', 'E',
                'A', 'D', 'I', 'D', 'E', 'J', 'F', 'M',
                'V', 'C', 'E', 'I', 'F', 'G', 'G', 'S',
        };
        System.out.println(hasPath(matrix4, 5, 8, new char[]{'S', 'L', 'H', 'E', 'C', 'C', 'E', 'I', 'D', 'E', 'J', 'F', 'G', 'G', 'F', 'I', 'E'}));

    }
}
