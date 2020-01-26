package CodingInterviews;

// 求1+2+3+...+n
public class _64_Accumulate {

  public int Sum_Solution(int n) {
    int sum = n;
    boolean _ = (sum > 0) && ((sum += Sum_Solution(n - 1)) > 0);
    return sum;
  }
}
