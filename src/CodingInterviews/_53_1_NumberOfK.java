package CodingInterviews;

import java.util.Arrays;

public class _53_1_NumberOfK {

  public int GetNumberOfK(int[] array, int k) {
    if (array == null || array.length == 0) return 0;
    return (int) Arrays.stream(array).filter(it -> it == k).count();
  }
}
