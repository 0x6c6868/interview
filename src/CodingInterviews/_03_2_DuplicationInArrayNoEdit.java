package CodingInterviews;

// 数组中重复的数字
public class _03_2_DuplicationInArrayNoEdit {

  public boolean duplicate(int numbers[], int length, int[] duplication) {
    if (numbers == null || length == 0) return false;

    int start = 1;
    int end = length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      int count = 0;
      for (int i = 0; i < length; i++) {
        if (numbers[i] >= start && numbers[i] <= mid) count++;
      }

      if (start == end && count > 1) {
        duplication[0] = start;
        return true;
      }

      if (count > (mid - start + 1)) end = mid;
      else start = mid + 1;
    }
    return false;
  }
}
