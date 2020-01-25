package CodingInterviews;

// 斐波那契数列
public class _10_1_Fibonacci {

  public int Fibonacci(int n) {
    int[] rst = {0, 1};
    if (n < 2) return rst[n];

    int fibOne = 0;
    int fibTwo = 1;
    int fibN = 0;
    for (int i = 2; i <= n; i++) {
      fibN = fibOne + fibTwo;
      fibOne = fibTwo;
      fibTwo = fibN;
    }
    return fibN;
  }
}
