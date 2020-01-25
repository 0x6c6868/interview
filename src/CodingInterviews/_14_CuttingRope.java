package CodingInterviews;

// 剪绳子
public class _14_CuttingRope {

  public int cutRope(int target) {
    if (target == 1) return 1;
    if (target == 2) return 1;
    if (target == 3) return 2;

    int[] rst = new int[target + 1];

    rst[1] = 1;
    rst[2] = 2;
    rst[3] = 3;

    for (int i = 4; i <= target; i++) {
      int max = 1;
      for (int j = 1; j < i; j++) if (rst[j] * rst[i - j] > max) max = rst[j] * rst[i - j];
      rst[i] = max;
    }

    return rst[target];
  }
}
