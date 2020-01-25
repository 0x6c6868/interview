package CodingInterviews;

import java.util.Arrays;

// 数字在排序数组中出现的次数
public class _53_1_NumberOfK {

  public int GetNumberOfK(int[] array, int k) {
    if (array == null || array.length == 0) return 0;
    return (int) Arrays.stream(array).filter(it -> it == k).count();
  }
}
