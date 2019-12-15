package CodingInterviews;

import java.util.ArrayList;

public class _29_PrintMatrix {

  public ArrayList<Integer> printMatrix(int[][] matrix) {
    if (matrix == null) return null;

    int rows = matrix.length;
    int cols = matrix[0].length;

    ArrayList<Integer> res = new ArrayList<>();

    int left = 0, top = 0, right = cols - 1, bottom = rows - 1;
    while (left <= right && top <= bottom) {
      for (int i = left; i <= right; i++) res.add(matrix[top][i]);
      for (int i = top + 1; i <= bottom; i++) res.add(matrix[i][right]);
      if (top != bottom) for (int i = right - 1; i >= left; i--) res.add(matrix[bottom][i]);
      if (left != right) for (int i = bottom - 1; i > top; i--) res.add(matrix[i][left]);
      left++;
      top++;
      right--;
      bottom--;
    }

    return res;
  }
}
