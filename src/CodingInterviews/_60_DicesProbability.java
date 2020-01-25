package CodingInterviews;

import java.util.HashMap;
import java.util.Map;

// https://www.cnblogs.com/wangkundentisy/p/9378886.html
public class _60_DicesProbability {

  public Map<Integer, Double> PrintProbability(int number) {
    Map<Integer, Double> rst = new HashMap();
    if (number <= 0) return rst;

    // dp init
    int[][] arr = new int[number + 1][number * 6 + 1];
    for (int i = 1; i <= 6; i++) arr[1][i] = 1;

    // dp calc
    for (int i = 2; i <= number; i++)
      for (int j = i; j <= 6 * i; j++)
        for (int k = 1; k <= 6 && j - k >= 1; k++) arr[i][j] += arr[i - 1][j - k];

    // sum
    int sum = 0;
    for (int i = number; i <= 6 * number; i++) sum += arr[number][i];

    // build rst
    for (int i = number; i <= 6 * number; i++) rst.put(i, (double) arr[number][i] / sum);
    return rst;
  }

  public static void main(String[] args) {

    _60_DicesProbability p = new _60_DicesProbability();

    p.PrintProbability(1);
    p.PrintProbability(2);
    p.PrintProbability(3);
    p.PrintProbability(4);

    p.PrintProbability(11);
    p.PrintProbability(0);
  }
}
