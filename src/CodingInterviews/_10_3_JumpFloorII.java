package CodingInterviews;

// 变态跳台阶
public class _10_3_JumpFloorII {

  public int JumpFloorII(int target) {
    if (target <= 0) return 0;

    int rst = 1;
    for (int i = 1; i < target; i++) rst *= 2;

    return rst;
  }
}
