package CodingInterviews;

public class _39_MoreThanHalfNumber {
  public int MoreThanHalfNum_Solution(int[] array) {
    if (array == null || array.length == 0) return 0;

    int num = array[0], count = 1;
    for (int i = 1; i < array.length; i++) {
      if (array[i] == num) count++;
      else count--;

      if (count == 0) {
        num = array[i];
        count++;
      }
    }

    count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == num) count++;
    }
    return count > array.length / 2 ? num : 0;
  }
}
