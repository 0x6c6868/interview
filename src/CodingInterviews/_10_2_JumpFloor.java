package CodingInterviews;

// 跳台阶
public class _10_2_JumpFloor {

  public int JumpFloor(int target) {
    int[] rst = {1, 1};
    if (target < 2) return rst[target];

    int fibOne = 1;
    int fibTwo = 1;
    int fibN = 0;
    for (int i = 2; i <= target; i++) {
      fibN = fibOne + fibTwo;
      fibOne = fibTwo;
      fibTwo = fibN;
    }
    return fibN;
  }
}
