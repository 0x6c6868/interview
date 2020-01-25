package CodingInterviews;

// 数组中的逆序对
public class _51_InversePairs {

  public int InversePairs(int[] array) {
    temp = new int[array.length];
    Sort(array, 0, array.length - 1);
    return cnt;
  }

  private int cnt;
  private int[] temp;

  private void Sort(int[] array, int start, int end) {
    if (start >= end) return;
    int mid = (start + end) / 2;
    Sort(array, start, mid);
    Sort(array, mid + 1, end);
    Merge(array, start, mid, end);
  }

  private void Merge(int[] array, int start, int mid, int end) {
    int k = end, i = mid, j = end;
    while (i >= start && j >= mid + 1) {
      if (array[i] > array[j]) {
        temp[k--] = array[i--];
        cnt = (cnt + j - mid) % 1000000007;
      } else temp[k--] = array[j--];
    }

    while (i >= start) temp[k--] = array[i--];
    while (j >= mid + 1) temp[k--] = array[j--];

    for (int l = start; l <= end; l++) array[l] = temp[l];
  }
}
