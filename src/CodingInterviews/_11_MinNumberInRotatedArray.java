package CodingInterviews;

// 旋转数组的最小数字
public class _11_MinNumberInRotatedArray {

  public int minNumberInRotateArray(int[] array) {
    if (array == null || array.length == 0) return 0;

    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      if (array[start] < array[end]) return array[start];

      int mid = (end - start) / 2 + start;
      if (array[start] < array[mid]) start = mid + 1;
      else if (array[mid] < array[end]) end = mid;
      else start++;
    }
    return array[start];
  }
}
