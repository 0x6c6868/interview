package CodingInterviews;

import java.util.ArrayList;

public class _57_1_TwoNumbersWithSum {

  public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
    ArrayList<Integer> rst = new ArrayList<>();

    if (array == null || array.length == 0) return rst;

    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      if (array[start] + array[end] == sum) {
        rst.add(array[start]);
        rst.add(array[end]);
        break;
      }

      if (array[start] + array[end] > sum) end--;
      else start++;
    }

    return rst;
  }
}
