package CodingInterviews;

import java.util.ArrayList;

// 和为S的连续正数序列
public class _57_2_ContinuousSquenceWithSum {

  public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    ArrayList<ArrayList<Integer>> rst = new ArrayList<>();

    int start = 1;
    int end = 2;
    while (start < end) {

      int temp = (start + end) * (end - start + 1) / 2;
      if (temp == sum) {
        rst.add(GetResult(start, end));
        start++;
      }

      if (temp < sum) end++;
      if (temp > sum) start++;
    }

    return rst;
  }

  private ArrayList<Integer> GetResult(int start, int end) {
    ArrayList<Integer> subRst = new ArrayList<>();
    for (int i = start; i <= end; i++) subRst.add(i);
    return subRst;
  }
}
