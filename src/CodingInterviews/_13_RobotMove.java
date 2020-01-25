package CodingInterviews;

// 机器人的运动范围
public class _13_RobotMove {

  private int threshold;
  private int rows;
  private int cols;
  private boolean[] visited;

  public int movingCount(int threshold, int rows, int cols) {
    if (threshold <= 0 || rows <= 0 || cols <= 0) return 0;

    this.threshold = threshold;
    this.rows = rows;
    this.cols = cols;
    this.visited = new boolean[rows * cols];

    return movingCountCore(0, 0);
  }

  private int movingCountCore(int x, int y) {
    if (x < 0 || y < 0 || x >= rows || y >= cols) return 0;
    if (visited[x * cols + y]) return 0;
    if (numSum(x) + numSum(y) > threshold) return 0;

    visited[x * cols + y] = true;
    return 1
        + movingCountCore(x - 1, y)
        + movingCountCore(x + 1, y)
        + movingCountCore(x, y - 1)
        + movingCountCore(x, y + 1);
  }

  private int numSum(int curr) {
    int count = 0;
    while (curr != 0) {
      count += curr % 10;
      curr /= 10;
    }
    return count;
  }
}
