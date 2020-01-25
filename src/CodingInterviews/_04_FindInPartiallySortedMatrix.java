package CodingInterviews;

// 二维数组中的查找
public class _04_FindInPartiallySortedMatrix {

  public boolean Find(int target, int[][] array) {
    if (array == null || array.length == 0) return false;

    int rows = array.length;
    int cols = array[0].length;

    int x = 0;
    int y = cols - 1;

    while (x < rows && y >= 0) {
      int curr = array[x][y];

      if (curr == target) return true;

      if (curr > target) y--;
      else x++;
    }

    return false;
  }
}
