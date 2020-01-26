package CodingInterviews;

import java.util.HashSet;

// 扑克牌顺子
public class _61_ContinousCards {

  public boolean isContinuous(int[] numbers) {
    if (numbers.length == 0) return false;

    int max = -1, min = 14;
    HashSet<Integer> set = new HashSet<>();

    for (int a : numbers) {
      if (!set.add(a) && a != 0) return false;

      max = Math.max(max, a);
      if (a != 0) min = Math.min(min, a);
    }

    if (max - min <= 4) return true;
    return false;
  }
}
