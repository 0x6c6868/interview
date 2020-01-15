package CodingInterviews;

public class _49_UglyNumber {

  public int GetUglyNumber_Solution(int index) {
    if (index < 7) return index;
    int[] rst = new int[index];

    rst[0] = 1;
    int index2 = 0, index3 = 0, index5 = 0;
    for (int i = 1; i < index; i++) {
      rst[i] = Math.min(rst[index2] * 2, Math.min(rst[index3] * 3, rst[index5] * 5));
      if (rst[i] == rst[index2] * 2) index2++;
      if (rst[i] == rst[index3] * 3) index3++;
      if (rst[i] == rst[index5] * 5) index5++;
    }
    return rst[index - 1];
  }
}
