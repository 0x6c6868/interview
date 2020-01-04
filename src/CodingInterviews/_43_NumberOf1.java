package CodingInterviews;

public class _43_NumberOf1 {

  public int NumberOf1Between1AndN_Solution(int n) {
    if (n == 0) return 0;

    int rst = 0;
    for (int i = 1; i <= n; i *= 10) {
      int high = n / i / 10;
      int curr = n / i % 10;
      int low = n % i;

      if (curr == 0) {
        rst += high * i;
      } else if (curr == 1) {
        rst += high * i + low + 1;
      } else {
        rst += (high + 1) * i;
      }
    }
    return rst;
  }
}
