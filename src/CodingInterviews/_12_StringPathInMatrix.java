package CodingInterviews;

public class _12_StringPathInMatrix {

  private char[] matrix;
  private int rows;
  private int cols;
  private char[] str;
  private boolean[] visited;

  public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
    if (matrix == null
        || matrix.length == 0
        || rows <= 0
        || cols <= 0
        || str == null
        || str.length == 0) return false;

    this.matrix = matrix;
    this.rows = rows;
    this.cols = cols;
    this.str = str;
    this.visited = new boolean[rows * cols];

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++) if (hasPathCore(i, j, 0)) return true;

    return false;
  }

  public boolean hasPathCore(int x, int y, int i) {
    if (i >= str.length) return true;
    if (x < 0 || x >= rows || y < 0 || y >= cols) return false;
    if (visited[x * cols + y]) return false;
    if (matrix[x * cols + y] != str[i]) return false;

    visited[x * cols + y] = true;
    if (hasPathCore(x - 1, y, i + 1)
        || hasPathCore(x + 1, y, i + 1)
        || hasPathCore(x, y - 1, i + 1)
        || hasPathCore(x, y + 1, i + 1)) return true;
    visited[x * cols + y] = false;
    return false;
  }
}
